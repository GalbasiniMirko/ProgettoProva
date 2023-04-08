package Main;

import View.NostroFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ImageIcon image = new ImageIcon("");   //create image
        Border border = BorderFactory.createLineBorder(Color.magenta, 3);   //create border with color and weight

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
        label.setBorder(border);   //
        label.setVerticalAlignment(JLabel.TOP);   //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);   //set horizontal position of icon+text within label
        //label.setBounds(0, 0, 250, 250);   //set x,y position within frame as well as dimensions to write if setLayout of frame is null

        NostroFrame frame = new NostroFrame();   //creates a frame
        //frame.setLayout(null);   //se messo a null bisogna inserire label.setBounds se no non si vedrà nulla
        frame.add(label);   //add label to frame
        //frame.pack();   //write after frame.add(label) always, adatta la grandezza del frame/label in base a quello che contiene

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
