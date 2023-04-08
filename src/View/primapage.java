package View;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

    public class primapage extends JFrame {
        private JPanel panel;

        public primapage(){
            JFrame jFrame = new JFrame("il paroliere");
            jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jFrame.setSize(400,400);
            jFrame.setVisible(true);
            panel = new JPanel();
            panel.add(new JLabel("IL PAROLIERE"));
            panel.setBackground(new Color(216,112,124));
            panel.setVisible(true);
      /*  JButton b1 = new JButton("classifica");
        JButton b2 = new JButton("gioca");

        panel.add(b1);
        panel.add(b2);*/
            jFrame.add(panel);

        }
        public static void main(String[] args) {
            new primapage();




        }
    }

