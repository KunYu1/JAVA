import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class LAB01 extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width=getWidth();
		int height=getHeight();
		
		
		Integer intw=new Integer(width);
		String w=intw.toString();
		Integer inth=new Integer(height);
		String h=inth.toString();
		
		int split;
		split=(int)(Math.random()*90)+10;
		int R,G,B;
		R=(int)(Math.random()*255);
		G=(int)(Math.random()*255);
		B=(int)(Math.random()*255);
		
		g.setColor(new Color(R,G,B));

		for(int i=1;i<=split;i++)
			g.drawLine(0,i*height/split,i*width/split,height);
		
		
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString(w,width/2,10);
		g2.drawString(h,width-20,height/2);
  }
}
 