import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SizePanel extends JPanel{
    JLabel label;
    JButton small;
    JButton mid;
    JButton big;
    int size = 40;
    SizePanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new JLabel("Width");
        size = 40;
        add(label);

        small = new JButton("1");
        small.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                size = 40;
            }
        });
        add(small);

        mid = new JButton("2");
        mid.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                size = 60;
            }
        });
        add(mid);

        big = new JButton("3");
        big.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                size = 80;
            }
        });
        add(big);        
    }
    public int get_size(){
        return size;
    }
}