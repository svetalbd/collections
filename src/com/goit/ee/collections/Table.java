package com.goit.ee.collections;

import javax.swing.*;
import java.awt.*;
import java.awt.font.NumericShaper;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Mykhailenko Svitlana on 27.05.2016.
 */
public class Table {
    final static int[] NUMBERS = {10000, 100000, 1000000};

    private JPanel Collection;

    public static void createGUI(int i) {
        JFrame frame = new JFrame("Collections: "+String.valueOf(i)+ " elements");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Measure measure = new Measure();

        String[] columnNames = {
                "Name",
                "Add",
                "Get",
                "Remove",
                "Contains",
                "Populate",
                "ListIterator.add()",
                "ListIterator.remove()"
        };
        String[][] data = new String[8][];


        data = measure.measure(i);

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        WriteToFile writeToFile = new WriteToFile();
        String fileName = i+".txt";

        try {
            writeToFile.writToFile(data, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        createGUI(NUMBERS[0]);
        createGUI(NUMBERS[1]);
        createGUI(NUMBERS[2]);
    }

}
