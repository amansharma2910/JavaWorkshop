package sampleApplicationsSWING;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LabelAndButton {
    public static void main(String[] args) {
        S2 obj = new S2(); // creating an object of the class
    }
}

class S2 extends JFrame implements ActionListener {

    private JButton b;
    private JLabel txt;

    //constructor is automatically called on object creation
    S2() {
        b = new JButton("Click Here to display name of university: ");
        txt = new JLabel();
        add(b);
        add(txt);
        b.addActionListener(this); //adding Action Listener to 'Button b'

        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //this method is called when an Event occurs
        txt.setText("VIT Bhopal");
    }
}