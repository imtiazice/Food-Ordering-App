package com.imtiaz.food_ordering_application.Model;

public class User {
    private String Email;
    private String Fast_Name;
    private String Last_Name;
    private String Password;


    public User() {
    }

    public User(String email, String fast_Name, String last_Name, String password) {
        Email = email;
        Fast_Name = fast_Name;
        Last_Name = last_Name;
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFast_Name() {
        return Fast_Name;
    }

    public void setFast_Name(String fast_Name) {
        Fast_Name = fast_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
