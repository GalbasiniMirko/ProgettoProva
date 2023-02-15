package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NostroFrame extends JFrame {
    private JPanel JPanel1;
    private JButton button1;

    public NostroFrame() {
        setTitle("il paroliere");
        setSize(500, 300);
        setContentPane(JPanel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
