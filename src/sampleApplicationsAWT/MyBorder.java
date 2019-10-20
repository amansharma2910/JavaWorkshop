package sampleApplicationsAWT;

import java.awt.*;

//Setting buttons on the edges

class MyBorder extends Frame {

    Button b1,b2,b3,b4,b5;

    MyBorder() {

        setSize(400,400);
        setVisible(true);
        setBackground(Color.black);
        b1 = new Button("North");
        b2 = new Button("South");
        b3 = new Button("East");
        b4 = new Button("West");
        b5= new Button(("Flow"));

        setLayout(new BorderLayout());

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);

//        The below code won't execute properly as we can specify only one type of layout in a framework. If you try to add more than one layouts, then only the latest one will be implemented.
//        setLayout(new FlowLayout());
//        add(b5);
    }

    public static void main(String args[]) {

        MyBorder b = new MyBorder();
    }
}