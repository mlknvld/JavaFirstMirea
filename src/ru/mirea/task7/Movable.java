package ru.mirea.task7;

import java.util.Scanner;

public interface Movable
{
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();


    static public MovablePoint fill()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки:");
        System.out.println("по х:");
        int x = sc.nextInt();
        System.out.println("по у:");
        int y = sc.nextInt();
        System.out.println("Введите изменение координат точки:");
        System.out.println("по х:");
        int sx = sc.nextInt();
        System.out.println("по у:");
        int sy = sc.nextInt();
        MovablePoint point = new MovablePoint(x, y, sx, sy);
        System.out.println("Создание объекта точка"+point.toString());
        point.moveUp();
        System.out.println("движение точки вверх: "+point.getX()+"   "+point.getY());
        point.moveDown();
        System.out.println("движение точки вниз: "+point.getX()+"   "+point.getY());
        point.moveLeft();
        System.out.println("движение точки влево: "+point.getX()+"   "+point.getY());
        point.moveRight();
        System.out.println("движение точки вправо: "+point.getX()+"   "+point.getY());
        return point;
    }

    public static void main(String[] args)
    {
        MovablePoint point1 = fill();
        MovablePoint point2 = fill();
        MovableRectangle rect = new MovableRectangle(point1, point2);
        System.out.println("Создание объекта прямоугольник " + rect.toString());
        System.out.println("Скорости точек одинаковы: " + rect.SpeedTest());
    }
}
