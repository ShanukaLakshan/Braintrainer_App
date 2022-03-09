package com.unique.examapp;


public class Data {

    private  String email;
    private  String password;
    private  String confirmpassword;
    private  String name;
    private  String school;
    private  String grade;


    public Data(String email, String password, String school, String grade){
        this.email = email;
        this.password = password;
        this.confirmpassword = confirmpassword;
        this.name = name;
        this.school = school;
        this.grade = grade;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
