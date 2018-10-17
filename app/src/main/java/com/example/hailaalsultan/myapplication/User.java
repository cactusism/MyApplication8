package com.example.hailaalsultan.myapplication;

public class User {
    private String Name;
    private String UserName;
    private String Age;
    private String Gender;
    private String Password;

    public User() {
    }

    public User(String name, String userName, String age, String gender, String password) {
        Name = name;
        UserName = userName;
        Age = age;
        Gender = gender;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public String getUserName() {
        return UserName;
    }

    public String getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getPassword() {
        return Password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setPassword(String password) {
        Password = password;
    }
}


