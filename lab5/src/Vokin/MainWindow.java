package Vokin;

import Vokin.lab3Tasks.Outputs;
import Vokin.lab3Tasks.Task_string;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainWindow extends JFrame {
    protected JLabel title;
    protected JTextField mainTextfield;
    protected JButton mainButton;
    protected JTextField task1;
    protected JLabel task1Сomment;
    protected JTextField task2;
    protected JLabel task2Сomment;
    protected JTextField task3;
    protected JLabel task3Сomment;
    protected JLabel fileOutputComment;
    protected JLabel fileOutputStatus;
    protected JTextField fileNameTextbox;
    public MainWindow()
    {
        setLocationByPlatform(true);
        setTitle("Lab5 Vokin A.O.");
        setVisible(true);
        setSize(450, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Устанавливаем минимальный размер окна (например, 300x500 пикселей)
        Dimension minimumSize = new Dimension(330, 450);
        setMinimumSize(minimumSize);
///////////////// Служебные

        //JPanel panel = new JPanel();
        //panel.setLayout(new GridBagLayout()); ///// Панель
        setLayout(new GridBagLayout());
        title = new JLabel("Laboratory work №5");
        mainTextfield = new JTextField("Hello I am test string, and i have 10 words", 25);

        mainButton = new JButton("Set string");////Обйявление элементов
        task1Сomment = new JLabel("Most common char in string");
        task2Сomment = new JLabel("Longest word in string");
        task3Сomment = new JLabel("String with every third word deleted");
        task1 = new JTextField("", 25); task1.setEditable(false);
        task2 = new JTextField("", 25); task2.setEditable(false);
        task3 = new JTextField("", 25); task3.setEditable(false);
        fileOutputComment = new JLabel("Output results to file");
        fileNameTextbox = new JTextField("Filename.txt", 25);
        fileOutputStatus = new JLabel(" ");
        // Добавление элементов
        add(title, ConstrainsSettings.constrainsForTitle());

        add(mainTextfield, ConstrainsSettings.constrainsForMainTextbox());

        add(mainButton, ConstrainsSettings.constrainsForMainButton());

        add(task1, ConstrainsSettings.constrainsForTextboxes());
        add(task1Сomment, ConstrainsSettings.constrainsForTextboxesComments());

        add(task2, ConstrainsSettings.constrainsForTextboxes());
        add(task2Сomment, ConstrainsSettings.constrainsForTextboxesComments());

        add(task3, ConstrainsSettings.constrainsForTextboxes());
        add(task3Сomment, ConstrainsSettings.constrainsForTextboxesComments());

        add(fileOutputComment, ConstrainsSettings.constrainsForOutputComment());
        add(fileOutputStatus, ConstrainsSettings.constrainsForOutputStatus());
        add(fileNameTextbox, ConstrainsSettings.constraintsForFilename());

        add(new OutputButtonsPanel(), ConstrainsSettings.constrainsForOutputpanel());



        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Task_string s1 = new Task_string(mainTextfield.getText());
                    if (s1.most_common_symbol().equals(" ")) {
                        task1.setText("<space>");
                    } else {
                        task1.setText(s1.most_common_symbol());
                    }
                    task2.setText(s1.longest_word());
                    task3.setText(s1.every_third_word_deleted());
                } catch (Task_string.EmptyInputStringException ex) {
                    System.out.println("Everything is broken");
                }

            }
        });
        pack();
    }
    class OutputButtonsPanel extends JPanel{
        public OutputButtonsPanel(){
            super();
            JButton task1Output = new JButton("1 string");
            JButton task2Output = new JButton("2 string");
            JButton task3Output = new JButton("3 string");
            task1Output.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        fileOutputStatus.setForeground(Color.black);
                        fileOutputStatus.setText("String written successfully");
                        Outputs.WriteDownFile(task1.getText(), fileNameTextbox.getText());
                    } catch (Exception ex) {
                        fileOutputStatus.setForeground(Color.red);
                        fileOutputStatus.setText("Error");
                    }
                }
            });
            task2Output.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        fileOutputStatus.setForeground(Color.black);
                        fileOutputStatus.setText("String written successfully");
                        Outputs.WriteDownFile(task2.getText(), fileNameTextbox.getText());
                    } catch (Exception ex) {
                        fileOutputStatus.setForeground(Color.red);
                        fileOutputStatus.setText("Error");
                    }
                }
            });
            task3Output.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        fileOutputStatus.setForeground(Color.black);
                        fileOutputStatus.setText("String written successfully");
                        Outputs.WriteDownFile(task3.getText(), fileNameTextbox.getText());
                    } catch (Exception ex) {
                        fileOutputStatus.setForeground(Color.red);
                        fileOutputStatus.setText("Error");
                    }
                }
            });
            add(task1Output);
            add(task2Output);
            add(task3Output);
        }
    }
}

