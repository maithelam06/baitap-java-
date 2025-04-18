package chap4;

public class Circle5 extends Shape {

    private double radius;

    public Circle5(){
        super();
        this.radius=1.0f;
    }

    public Circle5(double radius){
        super();
        this.radius=radius;
    }

    public Circle5(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
@Override
    public String toString(){
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}
