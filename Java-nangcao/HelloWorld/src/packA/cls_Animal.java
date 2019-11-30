package packA;

public class cls_Animal {
    protected  String name;
    public cls_Animal(String xname)
    {
        this.name = xname;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String xname) {
        this.name = xname;
    }
}
