package ru.mirea.task15;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Countries extends JFrame
{
    public Countries()
    {

        super("Hello Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Verdana", Font.PLAIN, 18);
        String[] items = {
                "Australia",
                "China",
                "England",
                "Russia"
        };
        Container content = getContentPane();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                String str = "";
                switch (item)
                {
                    case "Australia":
                        str = "Страна: Австралия" + "\nСтолица: Канберра" + "\nНаселение: 25,69 миллиона";
                        break;
                    case "China":
                        str = "Страна: Китай" + "\nСтолица: Пекин" + "\nНаселение: 1,402 миллиарда";
                        break;
                    case "England":
                        str = "Страна: Англия" + "\nСтолица: Лондон" + "\nНаселение: 55,98 миллиона";
                        break;
                    case "Russia":
                        str = "Страна: Россия" + "\nСтолица: Москва" + "\nНаселение: 144,1 миллиона";
                        break;
                }
                JOptionPane.showMessageDialog(null, str,"Information",JOptionPane.INFORMATION_MESSAGE);
            }
        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(font);
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        comboBox.addActionListener(actionListener);
        content.add(comboBox);


        setPreferredSize(new Dimension(240, 130));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Countries();
            }
        });
    }
}
