import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class javaSwingLearning implements ActionListener {

    JFrame frame;

    JButton button;

    boolean change = false;

    javaSwingLearning() {
        frame = new JFrame("JavaSwing Project");     //yo can give the title inside bracket
        frame.setLayout(null);

        button = new JButton("Click Me!");
        button.setSize(100, 50);
        button.setLocation(600, 500);
        button.addActionListener(this);

        frame.add(button);


        frame.setVisible(true);
        // frame.setBackground(Color.pink);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.pink);
        
        
    }

    public static void main(String[] args) {
        javaSwingLearning obj = new javaSwingLearning();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String s = actionEvent.getActionCommand();

        if(s.equals("Click Me!") && change == false) {
            frame.getContentPane().setBackground(Color.black);
            change  = true;
        }
        else {
            frame.getContentPane().setBackground(Color.pink);
            change = false;
        }

    }

}