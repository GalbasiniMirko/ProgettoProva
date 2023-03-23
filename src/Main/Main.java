package Main;

import View.NostroFrame;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ImageIcon image = new ImageIcon("");

        JLabel label = new JLabel();   //create a label
        label.setText("Bro, do you even code?");   //set text of label
        //label.setIcon(image);

        NostroFrame frame = new NostroFrame();   //creates a frame
        frame.add(label);   //

        List<String> stngFile = new ArrayList<String>();
        Scanner scnr = null;
        try {
            scnr = new Scanner(new FileReader(
                    "C:\\Users\\gaiac\\OneDrive\\Desktop\\scuola(5)\\gpo\\dizionario.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String str;
        while (scnr.hasNext()) {
            str = scnr.next();
            stngFile.add(str);
        }
        String[] array=stngFile.toArray(new String[0]);
        for(String eachString : array) {
            System.out.println(eachString);
        }
        //prova per vedere se funziona
        System.out.println(array[20]);
    }
}
