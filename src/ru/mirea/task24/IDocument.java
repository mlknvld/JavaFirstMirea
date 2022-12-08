package ru.mirea.task24;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IDocument extends JFrame {
    private String name;
    private String describe;
    public IDocument()
    {

        super("IDocument");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Font font = new Font("Verdana", Font.PLAIN, 18);
        String[] items = {
                "Open",
                "Save",
                "New",
                "Exit"
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
                    case "Open":
                        str = "файл открыт";
                        break;
                    case "Save":
                        str = "файл сохранен";
                        break;
                    case "New":
                        str = "создали новый файл";
                        break;
                    case "Exit":
                        str = "выход";
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
                new IDocument();
            }
        });
    }
}
