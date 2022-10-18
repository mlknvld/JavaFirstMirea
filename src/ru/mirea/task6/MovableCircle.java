package ru.mirea.task6;

class MovableCircle extends MovablePoint implements Movable
{
    private int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    public String toString()
    {return "\nЦентр окружности"+super.toString()+"\nРадиус: "+radius;}

    public void moveUp() {super.moveUp();}
    public void moveDown() {super.moveDown();}
    public void moveLeft() {super.moveLeft();}
    public void moveRight() {super.moveRight();}


    public int getX() {
        return super.getX();
    }

    public int getxSpeed() {
        return super.getxSpeed();
    }

    public int getY() {
        return super.getY();
    }

    public int getySpeed() {
        return super.getySpeed();
    }

    public void setX(int x) {
        super.setX(x);
    }

    public void setxSpeed(int xSpeed) {
        super.setxSpeed(xSpeed);
    }

    public void setY(int y) {
        super.setY(y);
    }

    public void setySpeed(int ySpeed) {
        super.setySpeed(ySpeed);
    }

}
