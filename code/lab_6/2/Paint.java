import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paint{
    public static void main(String args[]){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        PaintPanel paintpanel = new PaintPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(paintpanel,BorderLayout.SOUTH);        
        //panel.setPreferredSize(new Dimension(750,750));
        paintpanel.setPreferredSize(new Dimension(750,750));
        frame.pack();
		frame.setVisible(true);        
    }
}