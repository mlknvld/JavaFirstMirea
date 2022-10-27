package ru.mirea.task7;

public class MovablePoint implements Movable
{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString()
    {
        return "\nКоординаты точки:"+"\nпо х: "+x+"\nпо у: "+y;
    }
    public void moveUp() { y = y - ySpeed; }
    public void moveDown() { y = y + ySpeed; }
    public void moveLeft() { x = x - xSpeed; }
    public void moveRight() { x = x + xSpeed; }

    public int getX() {
        return x;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getY() {
        return y;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
}
