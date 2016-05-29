package com.goit.ee.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mykhailenko Svitlana on 26.05.2016.
 */
public class WriteToFile {

    public void writToFile(String[][] data, String filename) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(data);
        } finally {
            fos.close();
            oos.close();
        }
    }
}
