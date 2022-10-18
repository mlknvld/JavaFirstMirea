package ru.mirea.task6;

public class Book implements Printable
{
   private String name;
   public Book(String name)
   {
      this.name = name;
   }
   public void print() {System.out.println("Название "+name);}
   public void setName(String name) {this.name = name;}
   public String getName() {return name;}
}
