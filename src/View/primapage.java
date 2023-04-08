package View;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    public class primapage extends JFrame implements ActionListener{
        JPanel panel;
        JButton button;
        JLabel label;
        public primapage(){
            JFrame jFrame = new JFrame("il paroliere");
            jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            jFrame.setSize(400,400);
            label = new JLabel();
            label.setText( "<html><center><h2>IL PAROLIERE</h2></center></html>");
            label.setBackground(new Color(216,112,124));
            label.setBounds(175, 250, 150, 150);
            label.setVisible(false);


            button = new JButton();
            button.setBounds(100, 100, 250, 100);   //set position and dimension of button
            button.addActionListener(this);   //add actionListener to button
            button.setText("I'm a button!");
            button.setFocusable(false);

            button.setHorizontalTextPosition(JButton.CENTER);   //base of image
            button.setVerticalTextPosition(JButton.BOTTOM);   //base of image
            button.setFont(new Font("Comic Sans", Font.BOLD, 25));
            button.setIconTextGap(-15);   //set gap between text and icon
            button.setForeground(Color.cyan);
            button.setBackground(Color.lightGray);
            button.setBorder(BorderFactory.createEtchedBorder());
            //button.setEnabled(false);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(500, 500);
            this.setVisible(true);
            this.add(label);
            this.add(button);



        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == button){
                //System.out.println("poo");
                label.setVisible(true);
            }
        }
        public static void main(String[] args) {
            new primapage();




        }
    }

