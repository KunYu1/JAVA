import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorPanel extends JPanel{
    JLabel label;
    JButton red;
    JButton blue;
    JButton green;
    int color;
    ColorPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new JLabel("Color");
        color = 0;
        add(label);
        red = new JButton("RED");
        red.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                color = 1;
            }
        });
        add(red);
        blue = new JButton("BLUE");
        blue.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                color = 2;
            }
        });
        add(blue);
        green = new JButton("GREEN");
        green.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                color = 3;
            }
        });
        add(green);         
    }
    public int get_color(){
        return color;
    }
}