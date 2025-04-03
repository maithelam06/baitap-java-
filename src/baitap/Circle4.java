package baitap;

public class Circle4{
    private double radius=1;

    private String color="red";

    public Circle4(){}

    public Circle4(double radius){
        this.radius=radius;
    }
    public Circle4(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color=color;
    }
    double getArea(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Circle[radius="+radius+",color="+color+"]";
    }
}
