package Main;

import View.NostroFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        //ImageIcon image = new ImageIcon("");

        JLabel label = new JLabel();   //create a label
        label.setText("Bro, do you even code?");   //set text of label
        //label.setIcon(image);

        NostroFrame frame = new NostroFrame();   //creates a frame
        frame.add(label);   //
    }
}
