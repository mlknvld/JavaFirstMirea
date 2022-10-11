package ru.mirea.task5;
import javax.swing.*;
import java.awt.*;

public class ResultsFootball
{
    public static void main(String args[])
    {


        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel= new JPanel();
        panel.setBackground(Color.PINK);
        panel.setPreferredSize( new Dimension(500,300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        JLabel label1 = new JLabel("Result: ");
        label1.setBounds(200, 70, 300, 30);
        panel.add(label1);
        JLabel label2 = new JLabel("Last Scorer: ");
        label2.setBounds(200, 100, 300, 30);
        panel.add(label2);
        JLabel label3 = new JLabel("Winner: ");
        label3.setBounds(200, 130, 300, 30);
        panel.add(label3);


    }
}

