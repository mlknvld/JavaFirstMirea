package ru.mirea.task5;
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class ArgumentsCommandLine extends JFrame
{
    public static void main(String args[]) throws IOException
    {
        String way = args[0];
        JFrame frame = new ArgumentsCommandLine();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Picture");
        frame.setVisible(true);
        panel picture = new panel(way);
        picture.paintPict(frame.getGraphics());

    }

    static class panel extends JPanel
    {
        private ImageIcon pict;
        public panel(String way) throws IOException
        {
            pict = new ImageIcon(way);
        }

        public void paintPict(Graphics g)
        {
            super.paintComponent(g);
            pict.paintIcon(this, g, 0, 0);
        }
    }

}
