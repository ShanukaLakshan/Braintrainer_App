package com.unique.examapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Objects;

import static androidx.core.os.LocaleListCompat.create;

public class HomePageData extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private EditText school;
    private EditText grade;
    private Button login;
    private Button register;
    private DatabaseHelper databaseHelper;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_data);

        databaseHelper = new DatabaseHelper(this);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        school = findViewById(R.id.school);
        grade = findViewById(R.id.grade);
        register = findViewById(R.id.register);
        firebaseAuth = FirebaseAuth.getInstance();

        email.addTextChangedListener(loginTextWatcher);
        password.addTextChangedListener(loginTextWatcher);
        school.addTextChangedListener(loginTextWatcher);
        grade.addTextChangedListener(loginTextWatcher);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getEmail = email.getText().toString();
                String getPassword = password.getText().toString();
                String getSchool = school.getText().toString();
                String getGrade = grade.getText().toString();
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("email",getEmail);
                hashMap.put("password",getPassword);
                hashMap.put("school",getSchool);
                hashMap.put("grade",getGrade);
                firebaseAuth.createUserWithEmailAndPassword(getEmail, getPassword)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                FirebaseFirestore.getInstance().collection("User")
                                        .document(getEmail)
                                        .set(hashMap)
                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void aVoid) {
                                                Toast.makeText(HomePageData.this, "User Account Created Successfully !", Toast.LENGTH_SHORT).show();
                                                Intent intent = new Intent(HomePageData.this, HomePage.class);
                                                startActivity(intent);

                                            }
                                        })
                                        .addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Toast.makeText(HomePageData.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                            }
                                        });

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(HomePageData.this, ""+ e.getMessage(), Toast.LENGTH_SHORT).show();

                            }
                        });
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getEmail = email.getText().toString();
                String getPassword = password.getText().toString();
                String getSchool = school.getText().toString();
                String getGrade = grade.getText().toString();
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("email",getEmail);
                hashMap.put("password",getPassword);
                hashMap.put("school",getSchool);
                hashMap.put("grade",getGrade);

                firebaseAuth.signInWithEmailAndPassword(getEmail,getPassword)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(HomePageData.this, "Welcome User !", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(HomePageData.this, HomePage.class);
                                startActivity(intent);
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(HomePageData.this, ""+ e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

    }

    private TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            String emilInput = email.getText().toString().trim();
            String passwordInput = password.getText().toString().trim();
            String schoolInput = school.getText().toString().trim();
            String gradeInput = grade.getText().toString().trim();

            boolean enabled = !emilInput.isEmpty() && !passwordInput.isEmpty() && !schoolInput.isEmpty() && !gradeInput.isEmpty();
            login.setEnabled(enabled);
            register.setEnabled(enabled);

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


}

