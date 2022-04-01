import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShapePanel extends JPanel{
    JLabel label;
    JButton circle;
    JButton rectangle;
    int shape = 0;
    ShapePanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        label = new JLabel("Shape");
        shape = 0;
        add(label);

        circle = new JButton("Circle");
        circle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                shape = 1;
            }
        });
        add(circle);

        rectangle = new JButton("Rectangle");
        rectangle.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                shape = 2;
            }
        });
        add(rectangle);
      
    }
    public int get_shape(){
        return shape;
    }
}