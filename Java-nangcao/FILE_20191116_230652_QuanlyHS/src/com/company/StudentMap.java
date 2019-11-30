package com.company;

import java.util.HashMap;
import java.util.List;

public class StudentMap {
    public static void main(String[] args){

        StudentGroup group = new StudentGroup();
        group.addStudent("d101", new Student1(11, "BaoGia",3 ));
        group.addStudent("d102", new Student1(12, "BaoDog",4 ));
        group.addStudent("d103", new Student1(13, "BaoPig",5 ));

        //Student1 student1 = group.search("d001");
        String id = "d103";
        Student1 student1 = group.search(id);
        if(student1 == null){
            System.out.println("Khong tim thay: " + id );
        }else {
            System.out.println("Tim thay: " + id + " " + student1 );
        }

    }
}

class StudentGroup{
    private HashMap<String, Student1> student1Map = new HashMap<>();

    public StudentGroup(){
    }

    public void addStudent(String id, Student1 student1){
        student1Map.put(id, student1);
    }

    public Student1 search(String id){
        return student1Map.get(id);
    }
}

class Student1{
    private int mID;
    private String mName;
    private float mPoint;

    public Student1(int Id, String Name, float Point){
        mID = Id;
        mName = Name;
        mPoint = Point;
    }

    @Override
    public String toString(){
        return "ID: " + mID + ", Tên: " + mName + ", Point: " + mPoint;
    }
}
