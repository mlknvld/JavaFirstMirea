package ru.mirea.task10;

public class Student
{
    private String name;
    private String surname;
    private String group;
    private String specialist;
    private int course;
    public Student(String name, String surname, String group, String specialist, int course)
    {
        this.course = course;
        this.name = name;
        this.group = group;
        this.surname = surname;
        this.specialist = specialist;
    }

    public int getCourse() {return course;}
    public String getGroup() {return group;}
    public String getName() {return name;}
    public String getSpecialist() {return specialist;}
    public String getSurname() {return surname;}
    public void setName(String name) {this.name = name;}
    public void setCourse(int course) {this.course = course;}
    public void setGroup(String group) {this.group = group;}
    public void setSpecialist(String specialist) {this.specialist = specialist;}
    public void setSurname(String surname) {this.surname = surname;}
}
