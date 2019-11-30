import packA.*;
public class HelloWorld {
    public static void main(String[] args) {
        int i;
        System.out.println("Hello World");

        cls_Animal[] house = new cls_Animal[3];
        house[0] = new cls_Cat("Cat 1");
        house[1] = new cls_Dog("Dog 1");
        house[2] = new cls_Cat("Cat 2");
        for(i = 0; i < house.length; i++){
            System.out.println(house[i].getName());
        }



    }


}
