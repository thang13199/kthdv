package com.mkyong.rmiserver;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class arrayStudent {
    ArrayList<student> liststu = new ArrayList<student>();
    public void addStudent(String name, int age, String email, String phone , int mssv) {
        student temp=new student(name,age,email,phone,mssv);
        liststu.add(temp);
    }

    public String getStudentbyMssv(int mssv){
        for (int i = 0; i < liststu.size(); i++) {
            System.out.println(liststu.get(i));
            if (liststu.get(i).mssv==mssv){
                final String info= liststu.get(i).name+Integer.toString(liststu.get(i).mssv);
                return info;
            }
        }
        return "khong tim thay";
    }

}
