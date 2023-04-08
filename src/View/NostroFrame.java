package View;

import javax.swing.*;
import java.awt.*;

public class NostroFrame extends JFrame {
    private JPanel JPanel1;

    //JFrame = a GUI window to add components to
    public NostroFrame() {
        this.setTitle("Il Paroliere");   //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application
        this.setResizable(false);   //prevent frame from being resized
        this.setSize(1000, 600);   //sets the x-dimension, and y-dimension of frame
        this.setLocation(250, 75);   //set location of frame
        this.setVisible(true);   //make frame visible
        //this.getContentPane().setBackground(new Color(0x123456));   //change color of background

        ImageIcon image = new ImageIcon("LogoProgettoGPO.png");   //create an ImageIcon
        this.setIconImage(image.getImage());   //change icon of this
    }
}
