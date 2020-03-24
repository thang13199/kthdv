package com.mkyong.rmiserver;

public class student {
    String name;
    int age;
    String email;
    String phone;
    int mssv;
    String date;
    String home;

    public student(String name, int age, String email, String phone , int mssv, String date,String home) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.mssv=mssv;
        this.date=date;
        this.home=home;
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

    public String getDate() {
        return date;
    }

    public String getHome() {
        return home;
    }

    public int getMssv() {
        return mssv;
    }
}



