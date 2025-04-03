package baitap;

public class Maincircle1 {
    public static void main(String[] args){
        Circle1 c1=new Circle1();
        System.out.println(c1);
        Circle1 c2=new Circle1(5,"yellow");
        System.out.println(c2);
        c2.setRadius(6);
        c2.setColor("pink");
        System.out.println(c2);
        System.out.println(c1.getColor()+" "+c1.getRadius());
        System.out.println(c1.getArea());
    }
}