package Chap6;

public class MovablePoint implements Movable{

    int x;

    int y;

    int xSpeed;

    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "("+x+","+y+") "+",Speed=("+xSpeed+","+ySpeed+")";
    }

    @Override
    public void moveUp(){
        y -= ySpeed;
    }

    @Override
    public void moveDown(){
        y += ySpeed;
    }

    @Override
    public void moveLeft(){
        x -= xSpeed;
    }

    @Override
    public void moveRight(){
        x += xSpeed;
    }


}
