package ru.mirea.task12;

import ru.mirea.task5.Circle;
import ru.mirea.task5.Rectangle;
import ru.mirea.task5.Square;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShape extends JFrame
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Figures");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        JPanel panelBgImg = new JPanel()
        {
            @Override
            public void paintComponent(Graphics g)
            {
                Graphics2D g2 = (Graphics2D) g;
                Random random = new Random();
                Color rand;
                int n, radius, side1, side2;
                int[] mass = new int[2];
                mass[0] = -30;
                mass[1] = 30;
                float r, g1, b;
                for(int i = 0; i < 20; i++)
                {
                    r = random.nextFloat();
                    g1 = random.nextFloat();
                    b = random.nextFloat();
                    rand = new Color(r, g1, b);
                    mass[0] +=110;
                    if(i%5==0)
                    {
                        mass[0]=110;
                        mass[1]+=110;
                    }
                    radius = (int)(Math.random()*(50)+50);
                    side1 = (int)(Math.random()*(50)+50);
                    side2 = (int)(Math.random()*(50)+50);
                    n = random.nextInt(3);
                    switch (n)
                    {
                        case 0:
                            ru.mirea.task5.Circle c = new Circle(rand, mass, radius);
                            g2.setColor(c.getColor());
                            g2.fillOval(c.getPositionfirst(), c.getPositionsecond(), c.getRadius(), c.getRadius());
                            break;
                        case 1:
                            ru.mirea.task5.Square sq = new Square(rand, mass, side1);
                            g2.setColor(sq.getColor());
                            g2.fillRect(sq.getPositionfirst(), sq.getPositionsecond(), sq.getSide(), sq.getSide());
                            break;
                        case 2:
                            ru.mirea.task5.Rectangle rect = new Rectangle(rand, mass, side1, side2);
                            g2.setColor(rect.getColor());
                            g2.fillRect(rect.getPositionfirst(), rect.getPositionsecond(), rect.getWidth(), rect.getHeight());
                            break;
                    }
                }
            }
        };
        frame.getContentPane().add(panelBgImg);
        frame.pack();
        frame.setVisible(true);
    }
}
