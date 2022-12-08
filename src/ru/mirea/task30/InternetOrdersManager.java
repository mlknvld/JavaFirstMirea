package ru.mirea.task30;
import java.util.Queue;

public interface InternetOrdersManager {
    //QueueNode head;
    //QueueNode tail;
    //int size;
    boolean add(Order order);
    Order remove();
    Order order();
}
