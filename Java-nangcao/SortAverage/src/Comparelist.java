import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparelist {
    public static void main(String[] args) {
        Student s1 = new Student("A",9);
        System.out.println("Student: " + s1);

        ArrayList<Student> stuList = new ArrayList<>();
        stuList.add(new Student("B",5));
        stuList.add(new Student("C",7.5));
        stuList.add(new Student("P",9));
        stuList.add(new Student("T",6.5));

        System.out.println("Before sorted");
        printStudentList(stuList);

        Collections.sort(stuList);
        System.out.println("After sort");
        printStudentList(stuList);



    }
    public static void printStudentList(ArrayList<Student> studentList){
        for (Student student: studentList){
            System.out.println(student);
        }
    }
    public static Student search(List<Student> studentList, String name){
        List<Student> temp = new ArrayList<>();
        for(Student student: studentList){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

}
 class Student implements Comparable<Student>{
    private String mName;
    private double mPoint;

    public Student(String Name, double Point){
        this.mName = Name;
        this.mPoint = Point;
    }
    public String getName(){
        return this.mName;
    }
    public String toString(){
        return "Name: " + mName + ", Point: " + mPoint;
    }

    public int compareTo(Student student){
        if (this.mPoint > student.mPoint){
            return 1;
        }
        else if (this.mPoint < student.mPoint){
            return -1;
        }
        return 0;
    }
}

