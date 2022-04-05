import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class HW4_3_2{
    public static void main(String srgs[]){
        MyPanel panel = new MyPanel();
        JFrame  frame = new JFrame();
        JButton button_rec = new JButton("square-shaped spiral");
        JButton button_cir = new JButton("circular spiral");
        JPanel panel_button = new JPanel();
        panel_button.add(button_cir);
        panel_button.add(button_rec);
        button_cir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                panel.set_draw(0);
            }
        });
        button_rec.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                panel.set_draw(1);
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel_button,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.SOUTH);
        panel.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);
    }
}