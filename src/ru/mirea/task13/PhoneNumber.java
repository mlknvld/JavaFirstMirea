package ru.mirea.task13;

public class PhoneNumber
{
    private String phone;

    public void setPhone(String phone) {this.phone = phone;}
    public String getPhone() {return phone;}
    public PhoneNumber(String phone)
    {
        this.phone = phone;
    }
    public void convertphone()
    {
        String newphone = "+";
        int a;
        if(phone.charAt(0) == '+')
        {
            a = 1;
        }
        else
        {
            a = 0;
        }
        for(int i = a; i<phone.length()-10; i++)
        {
            newphone = newphone + phone.charAt(i);
        }
        int schet = 0;
        for(int i = phone.length()-10; i<phone.length(); i++)
        {
            newphone = newphone + phone.charAt(i);
            schet++;
            if(schet==3||schet==6)
            {
                newphone = newphone + "-";
            }
        }
        phone = newphone;

    }
}
