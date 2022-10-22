package ru.mirea.task16;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorShrift extends JFrame
{
    private JTextArea area2;
    public ColorShrift()
    {
        super("Выбор цвета и шрифта");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createColorMenu());
        menuBar.add(createShriftMenu());
        setJMenuBar(menuBar);
        area2 = new JTextArea(15, 10);
        area2.setText("Введите текст");
        area2.setLineWrap(true);
        area2.setWrapStyleWord(true);
        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area2));
        setContentPane(contents);
        setSize(400, 300);
        setVisible(true);
    }

    private JMenu createColorMenu()
    {
        JMenu file = new JMenu("цвет");
        JMenuItem red = new JMenuItem("красный", new ImageIcon("red"));
        JMenuItem blue = new JMenuItem("синий", new ImageIcon("blue"));
        JMenuItem black = new JMenuItem("чёрный", new ImageIcon("black"));
        file.add(red);
        file.add(blue);
        file.add(black);

        red.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                area2.setForeground(Color.RED);
            }
        });
        blue.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                area2.setForeground(Color.blue);
            }
        });
        black.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                area2.setForeground(Color.black);
            }
        });
        return file;
    }

    private JMenu createShriftMenu()
    {
        JMenu viewMenu = new JMenu("шрифт");
        JMenuItem a1 = new JMenuItem("Times New Roman", new ImageIcon("Times New Roman"));
        JMenuItem a2 = new JMenuItem("MS Sans Serif", new ImageIcon("MS Sans Serif"));
        JMenuItem a3 = new JMenuItem("Courier New", new ImageIcon("Courier New"));
        viewMenu.add(a1);
        viewMenu.add(a2);
        viewMenu.add(a3);
        a1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                area2.setFont(new Font("Times New Roman",Font.PLAIN,20));
            }
        });
        a2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                area2.setFont(new Font("MS Sans Serif",Font.PLAIN,20));
            }
        });
        a3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                area2.setFont(new Font("Courier New",Font.PLAIN,20));
            }
        });
        return viewMenu;
    }

    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ColorShrift();
    }
}
