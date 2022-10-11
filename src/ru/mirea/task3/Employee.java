package ru.mirea.task3;

public class Employee
{
    private String fullname;
    private int salary;
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public String getFullname() {
        return fullname;
    }
    public Employee(String fullname, int salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }
    public Employee()
    {}
}
