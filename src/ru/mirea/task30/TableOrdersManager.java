package ru.mirea.task30;

public interface TableOrdersManager {
    Order[] orders = new Order[]{};
    void add(Order order, int tableNumber);
    void addItem(MenuItem item, int tableNumber);
    int freeTableNumber();
    int[] freeTableNumbers();
    Order getOrder(int tableNumber);
    void remove(int tableNumber);
    int remove(Order order);
    int removeAll(Order order);
}
