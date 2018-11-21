package javaswing_tutorial;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

class SwingTest{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       JButton button = new JButton("Press");
    // Adds Button to content pane of frame
       frame.getContentPane().add(button); 
       frame.setVisible(true);
    }
}
