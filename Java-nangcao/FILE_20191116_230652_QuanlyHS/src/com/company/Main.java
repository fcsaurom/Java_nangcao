package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LopHoc lopHoc = new LopHoc(3);
        lopHoc.themHS(new HocSinh("abc", 5, 6));
        lopHoc.themHS(new HocSinh("cde", 7, 8));
        lopHoc.themHS(new HocSinh("ghj", 9, 10));

        lopHoc.inDanhsachHS();

    }
}

class LopHoc{
    private HocSinh[] mDSHocSinh;
    private int mSoLuong;

    public LopHoc(int soluong){
        //mSoLuong = soluong;
        mDSHocSinh = new HocSinh[40];
        mSoLuong = 0;
    }

    public void themHS(HocSinh hs){
        if(mSoLuong < mDSHocSinh.length){
            mDSHocSinh[mSoLuong++] = hs;
        }else {
            System.out.println("Khong");
        }
    }

    public void inDanhsachHS(){
        for (int i = 0; i < mSoLuong; i++){
            System.out.println(mDSHocSinh[i].getThongtinHS());
        }
    }

}

class HocSinh{
    public String fullName;
    public float DiemToan;
    public float DiemVan;
    public HocSinh(String mfullName, float mDT, float mDV){
        fullName = mfullName;
        DiemToan = mDT;
        DiemVan = mDV;
    }

    public float getDiemTB() {
        return (DiemToan + DiemVan)/2;
    }

    public String getFullName() {
        return fullName;
    }

    public String getThongtinHS() {
        return "Ten: '" + fullName + "'"
            + "Diem Toan: " + DiemToan
            + "Diem Van: " + DiemVan
            + "Diem TB: " + getDiemTB();
    }
}
