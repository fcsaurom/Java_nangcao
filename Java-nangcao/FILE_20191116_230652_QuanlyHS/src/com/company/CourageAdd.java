package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourageAdd {
    public static void main(String[] args ){
        Student s1 = new Student("aaaa", 2);
        System.out.println(s1);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Dung", 10));
        studentList.add(new Student("Bao", 6));
        studentList.add(new Student("Trinh", 9));

        System.out.println("Before sorted: ");
        printStudentList(studentList);

        Collections.sort(studentList);
        System.out.println("After sorted: ");
        printStudentList(studentList);

        Student a = search(studentList, "Trinh");
        if(a == null){
            System.out.println("Khong tim thay: " + a );
        }else {
            System.out.println("Tim thay: " + a);
        }

    }
    public static void printStudentList(ArrayList<Student> students){
        for (Student student: students){
            System.out.println(student);
        }
    }
    /*
     * Tim student co ten 'name', neu khong tim thay thi tra ve null
     *
     * @param studentList
     * @param name
     * @return
     * */
    public static Student search(List<Student> studentList, String name){
        for(Student student: studentList){
            if(student.getmName().equals(name)){
                return student;
            }
        }
        return null;
    }
}
class Student implements Comparable<Student>{
    private String mName;
    private float mPoint;

    public String getmName(){
        return mName;
    }

    public Student(String name, float point){
        mName = name;
        mPoint = point;
    }

    @Override
    public String toString(){
        return "Name: " + mName + ", Point: " + mPoint;
    }

    @Override
    /*
    * example: doituong1.compareTo(Student student)
    *
    * 0: 2 doi tuong BANG NHAU
    * 1: doi tuong thu 1 LON HON doi tuong thu 2
    * -1 (hay < 0): doi tuong thu 1 NHO HON doi tuong thu 2 */
    public int compareTo(Student student){
        if(this.mPoint > student.mPoint){
            return 1; //lon hon
        }else if (this.mPoint < student.mPoint){
            return -1; //nho hon
        }

        return 0; //2 doi tuong bang nhau
    }
}
