public class QLHS {
    public static void main(String[] args) {
        cls_HocSinh duc = new cls_HocSinh("Duc ", 9, 8.2);
        System.out.println(duc.getInfo());

        cls_HocSinh cong = new cls_HocSinh("Cong", 8, 6);
        System.out.println(cong.getInfo());

        cls_HocSinh bao = new cls_HocSinh("Bao ", 9, 7);
        System.out.println(bao.getInfo());

        cls_HocSinh huy = new cls_HocSinh("Huy ", 9, 10);
        System.out.println(huy.getInfo() + '\n');

        cls_LopHoc cls = new cls_LopHoc();
        cls.addStudent(duc);
        cls.addStudent(cong);
        cls.addStudent(bao);
        cls.addStudent(huy);

        cls.printlist();
    }
}
