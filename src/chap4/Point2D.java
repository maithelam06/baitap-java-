package chap4;

public class Point2D {

    private float x;

    private float y;

    public Point2D(float x,float y){

        this.x=x;

        this.y=y;
    }
    public Point2D(){
        this.x=0f;
        this.y=0f;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float[] getXY(){
        return new float[]{x,y};
    }
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
