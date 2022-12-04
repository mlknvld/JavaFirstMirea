package ru.mirea.task20;

public class SimpleGen
{
    public static void main(String[] args) {
        ThreeGen<Integer, String, Animal> threeGen = new ThreeGen<>(11, "Generics", new Animal());
        threeGen.showTypes();
        System.out.println("Значение T: " + threeGen.getObT());
        System.out.println("Значение V: " + threeGen.getObV());
        System.out.println("Значение K: " + threeGen.getObK());
    }
}
