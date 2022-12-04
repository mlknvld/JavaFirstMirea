package ru.mirea.task20;
import java.io.Serializable;
public class ThreeGen<T extends Comparable, V extends Serializable, K extends Animal>
{
    private T obT;
    private V obV;
    private K obK;

    public ThreeGen(T obT, V obV, K obK) {
        this.obT = obT;
        this.obV = obV;
        this.obK = obK;
    }

    public void showTypes() {
        System.out.println("Тип T: " + obT.getClass().getName());
        System.out.println("Тип V: " + obV.getClass().getName());
        System.out.println("Тип K: " + obK.getClass().getName());
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public K getObK() {
        return obK;
    }
}
