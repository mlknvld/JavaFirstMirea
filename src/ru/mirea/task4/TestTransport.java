package ru.mirea.task4;

import java.util.Scanner;

public class TestTransport
{
    public static void main(String[] args)
    {
        System.out.println("введите 1 (самолет) 2 (поезд) 3 (корабль) или  4 (автомобиль)");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Введите путь в км");
        double way = sc.nextDouble();
        System.out.println("Введите вес груза");
        double weight = sc.nextDouble();
        System.out.println("Введите количество пассажиров");
        int count = sc.nextInt();
        switch (n)
        {
            case 1:
                Plane plane = new Plane(way, count, weight);
                plane.setTime();
                plane.setCost_passengers();
                plane.setCost_goods();
                System.out.println("Результаты: время - "+plane.getTime()+"\n стоимость перевозки пассажиров - "+
                        plane.getCost_passenger()+"\n стоимость перевозки грузов - "+plane.getCost_goods());
                break;
            case 2:
                Train train = new Train(way, count, weight);
                train.setTime();
                train.setCost_passengers();
                train.setCost_goods();
                System.out.println("Результаты: время - "+train.getTime()+"\n стоимость перевозки пассажиров - "+
                        train.getCost_passenger()+"\n стоимость перевозки грузов - "+train.getCost_goods());
                break;
            case 3:
                Ship ship = new Ship(way, count, weight);
                ship.setTime();
                ship.setCost_passengers();
                ship.setCost_goods();
                System.out.println("Результаты: время - "+ship.getTime()+"\n стоимость перевозки пассажиров - "+
                        ship.getCost_passenger()+"\n стоимость перевозки грузов - "+ship.getCost_goods());
                break;
            case 4:
                Car car = new Car(way, count, weight);
                car.setTime();
                car.setCost_passengers();
                car.setCost_goods();
                System.out.println("Результаты: время - "+car.getTime()+"\n стоимость перевозки пассажиров - "+
                        car.getCost_passenger()+"\n стоимость перевозки грузов - "+car.getCost_goods());
                break;
        }

    }
}
