package ru.mirea.task2;
import java.util.Scanner;
public class TestBall
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("введите начальную координату х:");
        Double x = scan.nextDouble();
        System.out.println("введите начальную координату у:");
        Double y = scan.nextDouble();
        Ball ball = new Ball(x, y);
        System.out.println(ball.toString());
        System.out.println("введите изменение координаты х:");
        Double dx = scan.nextDouble();
        System.out.println("введите изменение координаты у:");
        Double dy = scan.nextDouble();
        ball.move(dx, dy);
        System.out.println(ball.toString());
    }
}
