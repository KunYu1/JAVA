import java.awt.*;
import java.awt.event.*;
import java.security.cert.PolicyNode;

import javax.swing.*;
class SierpPanel extends JPanel 
{
	private int order = 0;
	public void setOrder(int order)
	{ 
	    this.order = order;
       repaint();
	}
	public void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
	    Point p = new Point(getWidth()/2, 201);
        display(g, order, p , 200);
        //System.out.println(getHeight()+" "+getWidth());
    }
                    
    private void display(Graphics g, int order, Point p, int r){
        g.drawOval(p.x-r, p.y-r, 2*r, 2*r);
        if(order>0){
            Point p_top = new Point(p.x, p.y-r/2);
            Point p_bottom = new Point(p.x, p.y+r/2);
            Point p_left = new Point(p.x-r/2, p.y);
            Point p_right = new Point(p.x+r/2, p.y);
            g.setColor(Color.RED);
            display(g, order-1, p_top, r/2);
            g.setColor(Color.YELLOW);
            display(g, order-1, p_bottom, r/2);
            g.setColor(Color.GREEN);
            display(g, order-1, p_left, r/2);
            g.setColor(Color.BLUE);
            display(g, order-1, p_right, r/2);
        }
    }
}
