import java.util.ArrayList;
import java.util.List;


public class cls_LopHoc {
    List<cls_HocSinh> listStudent = new ArrayList();

    public void addStudent(cls_HocSinh stu){
        listStudent.add(stu);
    }

    public void  printlist(){
        int k;
        System.out.println("list of Class: ");
        for(k=0; k<listStudent.size(); k++)
        {
            System.out.println(listStudent.get(k).getInfo());
        }
    }
}
