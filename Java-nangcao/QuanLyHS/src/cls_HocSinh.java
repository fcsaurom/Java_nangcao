public class cls_HocSinh {
    String mname;
    double mmath;
    double meng;

    public cls_HocSinh(String name, double math, double eng){
        this.mname = name;
        this.mmath = math;
        this.meng = eng;
    }
    public  String getName(){
        return mname;
    }
    public double getAverage(){
        return (mmath + meng)/2;
    }
    public String getInfo(){
        return "Your Name: " + this.mname + " || Math: " + this.mmath + " || English: " + this.meng + " || Average: " + getAverage();
    }
}
