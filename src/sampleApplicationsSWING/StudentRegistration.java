package sampleApplicationsSWING;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class StudentRegistration {
    public static void main(String args[])
    {
        StudentReg obj = new StudentReg();
    }
}

class StudentReg extends JFrame implements ActionListener {

    JButton b1;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JCheckBox c1,c2,c3;

    JRadioButton r1,r2;
    ButtonGroup bg1;

    String str="Game : ";

    StudentReg()
    {
        b1 = new JButton("Submit");

        t1 = new JTextField("Enter Name",20);
        t2 = new JTextField("Branch",20);
        t3 = new JTextField("Registration Number",20);

        l1 = new JLabel("Name");
        l2 = new JLabel("Branch");
        l3 = new JLabel("RegNo");

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        bg1 = new ButtonGroup();

        c1 = new JCheckBox("Cricket");
        c2 = new JCheckBox("FootBall");
        c3 = new JCheckBox("VolleyBall");

        b1.addActionListener(this);

        bg1.add(r1);
        bg1.add(r2);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(r1);add(r2);
        add(c1);add(c2);add(c3);
        add(b1);

        setSize(300,300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e)
    {
        String name = t1.getText();
        System.out.println("Name : "+name);
        String branch = t2.getText();
        System.out.println("Branch : "+branch);
        String add = t3.getText();
        System.out.println("Address : "+add);

        if(r1.isSelected())
        {
            System.out.println("Gender : Male");
        }
        else if(r2.isSelected())
        {
            System.out.println("Gender : Female");
        }

        if(c1.isSelected())
        {
            str = str +"\t Cricket";
//  \t leaves a tab's space.

        }
        if(c2.isSelected())
        {
            str = str+"\t FootBall";

        }
        if(c3.isSelected())
        {
            str = str+ "\t VolleyBall";
        }
        System.out.println(""+str);
    }
}
