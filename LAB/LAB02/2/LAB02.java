import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class LAB02 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width=getWidth();
		int height=getHeight();
		
		if(width==height){
			g.setColor(new Color(0,0,255));
			g.drawArc(0,-width,2*width,2*width,0,360);
			
			double radius=width/(1+Math.pow(2,0.5));
			int r=(int)Math.floor(radius);
			g.setColor(new Color(255,0,0));
			g.drawArc(width-2*r,0,2*r,2*r,0,360);
		}
		Integer intw=new Integer(width);
		String w=intw.toString();
		Integer inth=new Integer(height);
		String h=inth.toString();
		

		g.setColor(Color.BLACK);
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString(w,width/2,10);
		g2.drawString(h,width-20,height/2);
 
  }
}
 