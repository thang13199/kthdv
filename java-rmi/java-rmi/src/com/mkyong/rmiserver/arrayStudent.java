package com.mkyong.rmiserver;

import javax.xml.namespace.QName;
import java.util.ArrayList;

public class arrayStudent {
    ArrayList<student> liststu = new ArrayList<student>();
    public void addStudent(String name, int age, String email, String phone , int mssv, String date,String home) {
        student temp=new student(name,age,email,phone,mssv,date,home);
        liststu.add(temp);
    }

    public String getStudentbyMssv(int mssv){
        for (int i = 0; i < liststu.size(); i++) {
            student temp= liststu.get(i);
            System.out.println(liststu.get(i));
            if (liststu.get(i).mssv==mssv){
                final String info=  "Ten: "+ temp.name+"\n"+
                                    "Que: "+temp.home+"\n"+
                                    "NgaySinh: "+temp.date+"\n"+
                                    "Email: "+ temp.email+"\n"+
                                    "Mssv: "+ temp.mssv+"\n"+
                                    "Tuoi: "+temp.age+"\n"+
                                    "Sdt: "+ temp.phone
                                    ;
                return info;
            }
        }
        return "khong tim thay";
    }

}
