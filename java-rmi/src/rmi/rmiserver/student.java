package com.mkyong.rmiserver;

public class student {
    String name;
    int age;
    String email;
    String phone;
    int mssv;

    public student(String name, int age, String email, String phone , int mssv) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.mssv=mssv;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getMssv() {
        return mssv;
    }
}



