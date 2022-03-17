
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
public class MyPanel extends JPanel{
	int w;
	double amp;
	int num;
	int xx;
	int yy;
	int rr;
	public MyPanel(int window, double A, int x, int y, int n, int r) {
		w = window;
		amp = A;
		num = n;
		xx = x;
		yy = y;
		rr = r;
	}
	@Override
	public void paintComponent(Graphics g) {
		double r;
		int x1, x2,y1,y2;
		x1 = xx;
		y1 = yy-rr;
		int s = (num%2==1)? 1:(-1);
		super.paintComponent(g);
		g.setColor(Color.BLACK);	
		g.drawOval(xx-rr, yy-rr, rr*2, rr*2);
		g.setColor(Color.BLUE);			
		for(int i=0;i<=500;i++){
			r = amp*rr*Math.sin(Math.PI*(2*i*num/(double)500));
			//System.out.println((rr+r));
			x2= xx+(int)((rr+r)*Math.sin(2*Math.PI*i/500.0));
			y2 = yy-(int)((r+rr)*Math.cos(2*Math.PI*i/500.0));
			g.drawLine(x1, y1, x2, y2);
			x1=x2;
			y1=y2;
			//g.fillOval(xx-(int)((rr+r)*Math.sin(2*Math.PI*i/500.0))-5,yy+(int)((r+rr)*Math.cos(2*Math.PI*i/500.0))-5, 10, 10);
		}
	}
}


