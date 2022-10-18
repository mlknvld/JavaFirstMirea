package ru.mirea.task5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ResultsFootball
{
    public static int x1 = 0;
    public static int x2 = 0;
    public static void main(String args[]) {
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setPreferredSize(new Dimension(500, 300));
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        JLabel label1 = new JLabel("Result: 0 X 0");
        label1.setBounds(200, 70, 300, 30);
        panel.add(label1);
        JLabel label2 = new JLabel("Last Scorer: N/A");
        label2.setBounds(200, 100, 300, 30);
        panel.add(label2);
        JLabel label3 = new JLabel("Winner: DRAW");
        label3.setBounds(200, 130, 300, 30);
        panel.add(label3);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x1++;
                label1.setText("Result: " + x1  + " X "+x2);
                label2.setText("Last Scorer: AC Milan");
                if(x1>x2)
                {
                    label3.setText("Winner: AC Milan");
                }
                if(x2>x1)
                {
                    label3.setText("Winner: Real Madrid");
                }
                if(x1==x2)
                {
                    label3.setText("Winner: not defined");
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x2++;
                label1.setText("Result: " + x1  + " X "+x2);
                label2.setText("Last Scorer: Real Madrid");
                if(x1>x2)
                {
                    label3.setText("Winner: AC Milan");
                }
                if(x2>x1)
                {
                    label3.setText("Winner: Real Madrid");
                }
                if(x1==x2)
                {
                    label3.setText("Winner: not defined");
                }
            }
        });


    }
}

