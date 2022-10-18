package ru.mirea.task5;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;

public class Animation extends JFrame
{
    public static void main(String args[]) throws MalformedURLException
    {
        JFrame frame = new Animation();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Picture");
        frame.setVisible(true);
        gif pict = new gif();
        JLabel label = new JLabel(pict.pict);
        label.setBounds(0,0,1000,1000);
        frame.add(label);
    }

    static class gif extends JPanel
    {
        public ImageIcon pict, animate;
        public gif() throws MalformedURLException
        {
            pict = new ImageIcon("/Users/vladamalkina/Desktop/утя.gif");
        }

        public ImageIcon getgif()
        {
           return pict;
        }
    }
}

