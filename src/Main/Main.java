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

        //ImageIcon image = new ImageIcon("");   //create image

        JLabel label = new JLabel();   //create a label
        label.setText("Bro, do you even code?");   //set text of label
        //label.setIcon(image);   //image of label
        label.setHorizontalTextPosition(JLabel.CENTER);   //set text LEFT, CENTER, RIGHT of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);   //set text TOP, CENTER, BOTTOM of ImageIcon
        label.setForeground(new Color(0, 0, 0));   //set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));   //set font of text
        label.setIconTextGap(-25);   //set gap of text to image
        label.setBackground(new Color(253,168,90));   //set background color
        label.setOpaque(true);   //display background color

        NostroFrame frame = new NostroFrame();   //creates a frame
        frame.add(label);   //add label to frame

        /*List<String> stngFile = new ArrayList<String>();
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
        System.out.println(array[20]);*/
    }
}
