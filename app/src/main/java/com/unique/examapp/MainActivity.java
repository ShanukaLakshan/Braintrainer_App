package com.unique.examapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    public  Button button0,sinhala,english;
    Button register,login;
    EditText email, password, school, grade;
    private FirebaseAuth firebaseAuth;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = findViewById(R.id.button0);

        dialog = new Dialog(MainActivity.this);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogEnglish();
            }
        });

    }

    public void showDialogEnglish(){

        dialog.setContentView(R.layout.login);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button register = dialog.findViewById(R.id.register);
        Button login = dialog.findViewById(R.id.login);

        EditText email = dialog.findViewById(R.id.email);
        EditText password = dialog.findViewById(R.id.password);

        firebaseAuth = FirebaseAuth.getInstance();

        email.addTextChangedListener(loginTextWatcher);
        password.addTextChangedListener(loginTextWatcher);

        String emilInput = email.getText().toString().trim();
        String passwordInput = password.getText().toString().trim();

        boolean enabled = (!emilInput.isEmpty()) && (!passwordInput.isEmpty());
        login.setEnabled(enabled);
        register.setEnabled(enabled);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getEmail = email.getText().toString();
                String getPassword = password.getText().toString();

                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("email",getEmail);
                hashMap.put("password",getPassword);

                firebaseAuth.signInWithEmailAndPassword(getEmail,getPassword)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Toast.makeText(MainActivity.this, "Welcome User !", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity.this, HomePage.class);
                                startActivity(intent);
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, ""+ e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

        dialog.show();

    }

    private void register(){

        dialog.setContentView(R.layout.register);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button register = dialog.findViewById(R.id.register);
        //Back button kamathi nam dnna puluwan

        EditText email = dialog.findViewById(R.id.email);
        EditText password = dialog.findViewById(R.id.password);
        EditText confirmpassword = dialog.findViewById(R.id.confirmpassword);
        EditText name = dialog.findViewById(R.id.name);
        EditText school = dialog.findViewById(R.id.school);
        EditText grade = dialog.findViewById(R.id.grade);

        firebaseAuth = FirebaseAuth.getInstance();

        email.addTextChangedListener(loginTextWatcher);
        password.addTextChangedListener(loginTextWatcher);
        confirmpassword.addTextChangedListener(loginTextWatcher);
        name.addTextChangedListener(loginTextWatcher);
        school.addTextChangedListener(loginTextWatcher);
        grade.addTextChangedListener(loginTextWatcher);

        String emilInput = email.getText().toString().trim();
        String passwordInput = password.getText().toString().trim();
        String confirmpasswordInput = confirmpassword.getText().toString().trim();
        String nameInput = name.getText().toString().trim();
        String schoolInput = school.getText().toString().trim();
        String gradeInput = grade.getText().toString().trim();

        boolean enabled = (!emilInput.isEmpty()) && (!passwordInput.isEmpty()) && (!schoolInput.isEmpty()) && (!gradeInput.isEmpty()) && (!nameInput.isEmpty()) && (!confirmpasswordInput.isEmpty());
        login.setEnabled(enabled);
        register.setEnabled(enabled);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getEmail = email.getText().toString();
                String getPassword = password.getText().toString();
                String getConfirmpassword = confirmpassword.getText().toString();
                String getName = name.getText().toString();
                String getSchool = school.getText().toString();
                String getGrade = grade.getText().toString();

                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("email",getEmail);
                hashMap.put("password",getPassword);
                hashMap.put("confirmpassword",getConfirmpassword);
                hashMap.put("name",getName);
                hashMap.put("school",getSchool);
                hashMap.put("grade",getGrade);

                if (getPassword == getConfirmpassword){
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
                                                    Toast.makeText(MainActivity.this, "User Account Created Successfully !", Toast.LENGTH_SHORT).show();
                                                    Intent intent = new Intent(MainActivity.this, HomePage.class);
                                                    startActivity(intent);
                                                }
                                            })
                                            .addOnFailureListener(new OnFailureListener() {
                                                @Override
                                                public void onFailure(@NonNull Exception e) {
                                                    Toast.makeText(MainActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                                }
                                            });
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(MainActivity.this, ""+ e.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            });
                }else {
                    Toast.makeText(MainActivity.this, "Check Your Details !", Toast.LENGTH_SHORT).show();
                }

            }
        });
        dialog.show();
    }
    /*
    private  void showDialogSinhala(){

        dialog.setContentView(R.layout.data2);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        //Objects.requireNonNull(dialog.getWindow()).getAttributes().windowAnimations = R.style.animation;
        //dialog.setCancelable(false);

        Button register = dialog.findViewById(R.id.register);
        Button login = dialog.findViewById(R.id.login);
        Button sinhala = dialog.findViewById(R.id.sinhala);


        EditText email = dialog.findViewById(R.id.email);
        EditText password = dialog.findViewById(R.id.password);
        EditText school = dialog.findViewById(R.id.school);
        EditText grade = dialog.findViewById(R.id.grade);


        firebaseAuth = FirebaseAuth.getInstance();

        email.addTextChangedListener(loginTextWatcher);
        password.addTextChangedListener(loginTextWatcher);
        school.addTextChangedListener(loginTextWatcher);
        grade.addTextChangedListener(loginTextWatcher);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogEnglish();
            }
        });


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
                                                Toast.makeText(MainActivity.this, "User Account Created Successfully !", Toast.LENGTH_SHORT).show();
                                                Intent intent = new Intent(MainActivity.this, HomePage.class);
                                                startActivity(intent);
                                            }
                                        })
                                        .addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                Toast.makeText(MainActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                            }
                                        });
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, ""+ e.getMessage(), Toast.LENGTH_SHORT).show();
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
                                Toast.makeText(MainActivity.this, "Welcome User !", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(MainActivity.this, HomePage.class);
                                startActivity(intent);
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this, ""+ e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

        dialog.show();

    }       */

    private final TextWatcher loginTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }
        @Override
        public void afterTextChanged(Editable s) {
        }
    };




}


