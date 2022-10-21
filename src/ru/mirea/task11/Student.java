package ru.mirea.task11;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Student
{
    private String name;
    private String surname;
    private String group;
    private String specialist;
    private int course;
    private String datebirth;
    public Student(String name, String surname, String group, String specialist, int course, String datebirth)
    {
        this.course = course;
        this.name = name;
        this.group = group;
        this.surname = surname;
        this.specialist = specialist;
        this.datebirth = datebirth;
    }

    public String getDatebirth() {return datebirth;}
    public void setDatebirth(String datebirth) {this.datebirth = datebirth;}
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

    public void printdate(Date date1)
    {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("\nКраткий формат:   " + dateFormatter.format(date1));
        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Средний формат:   " + dateFormatter.format(date1));
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d,yyyy");
        System.out.println("Полный формат:   " + dateFormatter.format(date1));
    }
}
