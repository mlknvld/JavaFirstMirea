package ru.mirea.task13;

import java.util.StringTokenizer;

public class Address
{
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String frame;
    private String flat;
    static private String addr;
    public Address(String adr)
    {this.addr = adr;}
    public String getAddr() {return addr;}
    public String getCity() {return city;}
    public String getCountry() {return country;}
    public String getFlat() {return flat;}
    public String getFrame() {return frame;}
    public String getHouse() {return house;}
    public String getRegion() {return region;}
    public String getStreet() {return street;}
    public void setAddr(String addr) {this.addr = addr;}
    public void setCity(String city) {this.city = city;}
    public void setCountry(String country) {this.country = country;}
    public void setFlat(String flat) {this.flat = flat;}
    public void setFrame(String frame) {this.frame = frame;}
    public void setHouse(String house) {this.house = house;}
    public void setRegion(String region) {this.region = region;}
    public void setStreet(String street) {this.street = street;}

    public static boolean contains(String substr)
    {
        return addr.contains(substr);
    }

    public void convertaddress(int choose)
    {
        switch (choose)
        {
            case 1:
                String[] parts;
                parts = addr.split(",");
                country = parts[0];
                region = parts[1];
                city = parts[2];
                street = parts[3];
                house = parts[4];
                frame = parts[5];
                flat = parts[6];
            case 2:
                String str = "";
                if(contains("."))
                {
                    str = ".";
                }
                if(contains(","))
                {
                   str = ",";
                }
                if(contains(";"))
                {
                   str = ";";
                }
                StringTokenizer st1 = new StringTokenizer(addr, str);
                while(st1.hasMoreTokens())
                {
                    country = st1.nextToken();
                    region = st1.nextToken();
                    city = st1.nextToken();
                    street = st1.nextToken();
                    house = st1.nextToken();
                    frame = st1.nextToken();
                    flat = st1.nextToken();
                }
        }
    }

    public void print()
    {
        System.out.println("адрес: " + "\nстрана: "+ country + "\nрегион: "+region + "\nгород: " +
                city+"\nулица: "+street + "\nдом: "+house + "\nкорпус: "+frame + "\nквартира: " + flat);
        System.out.println("--------------------------");
    }
}
