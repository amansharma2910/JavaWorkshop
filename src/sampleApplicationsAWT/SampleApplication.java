package sampleApplicationsAWT;

import java.awt.*;
import java.awt.event.*;

class SampleApplication extends Frame implements ActionListener {

    Button b1,b2,b3,b4;
    TextField t1;
    Checkbox c1;

    SampleApplication()
    {
        setVisible(true);
        setBackground(Color.black);
        setSize(300,200);
        b1 = new Button("RED");
        b2 = new Button("BLUE");
        b3 = new Button("GREEN");
        b4 = new Button("CLOSE");
        c1= new Checkbox("A");
        t1 = new TextField(20);

        setLayout(new FlowLayout());
        // we can display in any order we want. Here it is : b1,b3,b2,b4
        add(b1);
        add(b3);
        add(b2);
        add(b4);
        add(t1);
        add(c1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1) {	setBackground(Color.RED);	}
        if(ae.getSource()==b2) {	setBackground(Color.BLUE);	}
        if(ae.getSource()==b3) {	setBackground(Color.GREEN);	}
        if(ae.getSource()==b4) {	dispose();					}
    }

    public static void main(String args[])
    {
        SampleApplication obj = new SampleApplication();
    }
}