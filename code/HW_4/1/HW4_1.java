
import javax.swing.*;
import java.awt.*;


public class HW4_1{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}