import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;

public class PaintPanel extends JPanel{
    int x=-1;
    int y=-1;
    int color_n=0;
    int size_n =0;
    int shape_n=0;
    int a,b;
    ColorPanel colorpanel = new ColorPanel();
    SizePanel sizepanel = new SizePanel();
    ShapePanel shapepanel = new ShapePanel();
    ArrayList<Point> points = new ArrayList<Point>();
    ArrayList<Integer> size = new ArrayList<Integer>();
    ArrayList<Integer> color = new ArrayList<Integer>();
    ArrayList<Integer> shape = new ArrayList<Integer>();
    public PaintPanel(){
        add(colorpanel);
        add(sizepanel);
        add(shapepanel);
        addMouseMotionListener(new MouseMotionAdapter()
        {
            @Override
            public void mouseDragged(MouseEvent event)
            {
                //System.out.println("1");
                color_n = colorpanel.get_color();
                size_n = sizepanel.get_size();
                shape_n =shapepanel.get_shape();
                if(shape_n!=0)
                    return;
                color.add(color_n);
                size.add(size_n);
                shape.add(shape_n);
                points.add(event.getPoint());
                repaint();
            }
        });
        addMouseListener(new MouseAdapter()
        {
            @Override 
            public void mouseClicked(MouseEvent event){
                //System.out.println("2");
                color_n = colorpanel.get_color();
                size_n = sizepanel.get_size();
                shape_n =shapepanel.get_shape();
                if(shape_n==0)
                    return;
                color.add(color_n);
                size.add(size_n);
                shape.add(shape_n);
                points.add(event.getPoint());
                repaint();
            }
        });
    }
    @Override
    public void paintComponent(Graphics g){
        //System.out.println("3");
        int i=0;
        int flag =0;
        int x=0;
        int y=0;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; 
        Stroke old = g2d.getStroke();       
        for(Point point:points){
            if(shape.get(i)!=0&&flag==0){
                flag =1;
                x=point.x;
                y=point.y;
                i++;
                continue;
            } 
            g2d.setColor(Color.BLACK);
            if(color.get(i) == 1)
                g2d.setColor(Color.RED);
            if(color.get(i) == 2)
                g2d.setColor(Color.BLUE);
            if(color.get(i) == 3)
                g2d.setColor(Color.GREEN);
            if(shape.get(i)==0){
                g2d.fillRect(point.x, point.y, size.get(i),size.get(i));
            }else if(shape.get(i)==1&&flag==1){
                g2d.setStroke(new BasicStroke(size.get(i)/5));
                g2d.drawOval(x,y,point.x-x,point.y-y);
                g2d.setStroke(old);
                flag = 0;
            }else if(shape.get(i)==2&&flag==1){
                g2d.setStroke(new BasicStroke(size.get(i)/5));
                g2d.drawRect(x,y,point.x-x,point.y-y);
                g2d.setStroke(old);
                flag = 0;
            }

            i++;
        }
    }
    public void set(int size, int color){
        size_n = size;
        color_n = color;
    }
}