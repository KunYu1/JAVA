import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class PaintPanel extends JPanel{
    int x=-1;
    int y=-1;
    int color_n=0;
    int size_n =0;
    int a,b;
    ColorPanel colorpanel = new ColorPanel();
    SizePanel sizepanel = new SizePanel();
    ArrayList<Point> points = new ArrayList<Point>();
    ArrayList<Integer> size = new ArrayList<Integer>();
    ArrayList<Integer> color = new ArrayList<Integer>();
    public PaintPanel(){
        add(colorpanel);
        add(sizepanel);
        addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseDragged(MouseEvent event)
            {
                color_n = colorpanel.get_color();
                size_n = sizepanel.get_size();
                color.add(color_n);
                size.add(size_n);
                points.add(event.getPoint());
                repaint();
            }
        });
    }
    @Override
    public void paintComponent(Graphics g){
        int i=0;
        super.paintComponent(g);
        for(Point point:points){
            g.setColor(Color.BLACK);
            if(color.get(i) == 1)
                g.setColor(Color.RED);
            if(color.get(i) == 2)
                g.setColor(Color.BLUE);
            if(color.get(i) == 3)
                g.setColor(Color.GREEN);
            g.fillRect(point.x, point.y, size.get(i),size.get(i));
            i++;
        }
    }
    public void set(int size, int color){
        size_n = size;
        color_n = color;
    }
}