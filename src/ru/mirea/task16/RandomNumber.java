package ru.mirea.task16;

import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RandomNumber extends JFrame
{
    private int number = (int)(Math.random()*20);
    private  int count = 0;
    JTextField jta1 = new JTextField(10);
    JButton button = new JButton(" Guess ");

    RandomNumber()
    {
        super("Calculation");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("Number(0-20)"));
        add(jta1);
        add(button);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                count++;
                try
                {
                    int x1 = Integer.parseInt(jta1.getText().trim());
                    if(count<3)
                    {
                        if(x1==number)
                        {
                            JOptionPane.showMessageDialog(null, "Вы угадали число!!!","Победа!!!",JOptionPane.INFORMATION_MESSAGE);
                            button.isDefaultButton();
                        }
                        if(x1>number)
                        {
                            JOptionPane.showMessageDialog(null, "Введенное число больше загаданного","Вы не угадали число",JOptionPane.INFORMATION_MESSAGE);
                        }
                        if(x1<number)
                        {
                            JOptionPane.showMessageDialog(null, "Введенное число меньше загаданного","Вы не угадали число",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    if(count==3)
                    {
                        if(x1!=number)
                        {
                            JOptionPane.showMessageDialog(null, "Вы не угадали число. Количество попыток исчерпано","Проигрыш",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Вы угадали число!!! Количество попыток исчерпано","Победа!!!",JOptionPane.INFORMATION_MESSAGE);
                        }
                        button.isDefaultButton();
                    }
                }
                catch(Exception ae)
                {
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new RandomNumber();
    }
}
