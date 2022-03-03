import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;

class P3_JPanel extends JPanel {
	private String names[] = {"black", "blue", "green","orange", "pink", "red", "white", "yellow"};  
    private Color colors[] = {Color.black,Color.blue,Color.green,Color.orange,Color.pink,Color.red,Color.white,Color.yellow};  
    private JComboBox selector = new JComboBox(names);
	private String[] str=new String[7];
	
	
	public void drawCircle(Graphics g, double x, double y, double r,String c){
		
		g.setColor(getColor(c));
		/*g.setColor(colors[2]);
		g.setColor(Color.RED);*/
		g.drawArc((int)(x-r),(int)(y-r),(int)(2*r),(int)(2*r),0,360);
	 }
	 
	 public void drawMark(Graphics g, double x, double y, double ra,String c1,String c2,String c3,String c4,int angle){   
		
		/*s=s.format("Color.%s",c.toUpperCase());*/
		//g.setColor(getColor(c));
		//g.setColor(Color.BLACK);
		double tpx=x;
		double tpy=y;
		int r=10;
		
		x=tpx+ra*Math.sin(Math.toRadians(angle-270));
		y=tpy+ra*Math.cos(Math.toRadians(angle-270));
		g.setColor(getColor(c1));
		g.drawLine((int)(x-r),(int)(y-r),(int)(x+r),(int)(y+r));
		g.drawLine((int)(x+r),(int)(y-r),(int)(x-r),(int)(y+r));
		
		x=tpx+ra*Math.sin(Math.toRadians(angle-180));
		y=tpy+ra*Math.cos(Math.toRadians(angle-180));
		g.setColor(getColor(c2));
		g.drawLine((int)(x-r),(int)(y-r),(int)(x+r),(int)(y+r));
		g.drawLine((int)(x+r),(int)(y-r),(int)(x-r),(int)(y+r));
		
		x=tpx+ra*Math.sin(Math.toRadians(angle-90));
		y=tpy+ra*Math.cos(Math.toRadians(angle-90));
		g.setColor(getColor(c3));
		g.drawLine((int)(x-r),(int)(y-r),(int)(x+r),(int)(y+r));
		g.drawLine((int)(x+r),(int)(y-r),(int)(x-r),(int)(y+r));
		
		x=tpx+ra*Math.sin(Math.toRadians(angle));
		y=tpy+ra*Math.cos(Math.toRadians(angle));
		g.setColor(getColor(c4));
		g.drawLine((int)(x-r),(int)(y-r),(int)(x+r),(int)(y+r));
		g.drawLine((int)(x+r),(int)(y-r),(int)(x-r),(int)(y+r));
	 } 
	 public void reset(String[] refer){ 
		str=refer;
		this.repaint();
	}
	public void paintComponent(Graphics g){
	    
		super.paintComponent(g);
		
		int angle=Integer.parseInt(str[6]);
		//int angle=0;
		int size=Integer.parseInt(str[0]);
		double x=size/2.0;
		double y=size/2.0;
		double r=size/3.0;
		this.setPreferredSize(new Dimension(size, size));
		drawCircle(g,x,y,r,str[1]);
		
		drawMark(g,x,y,r,str[2],str[3],str[4],str[5],angle);

    }
	public Color getColor(String s)
    {
		for(int i=0;i<names.length;i++)
			if(s.equals(names[i]))
				return colors[i];
		
		return colors[0];
	}
} 