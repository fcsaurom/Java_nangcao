package qlhs3;

import java.util.HashMap;

public class StudentMap {
    public static void main(String[] args) {

    }
}
class cls_StudentGr{
    HashMap<String, cls_Student> mGrStu = new HashMap<>();
    public void addStu(String id, cls_Student stu){
        mGrStu.put(id,stu);
    }
    public cls_Student search(String id){
        return  mGrStu.get(id);
    }
}



class cls_Student{
    String mId;
    String mName;
    double mPoint;

    public String getId(){
        return mId;
    }
    public cls_Student(String id, String name, double point){
        this.mId = id;
        this.mName = name;
        this.mPoint = point;
    }
}
