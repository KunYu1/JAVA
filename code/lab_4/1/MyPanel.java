
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
public class MyPanel extends JPanel{
	int w;
	double amp;
	int num;
	public MyPanel(int window, double A, int n) {
		w = window;
		amp = A;
		num = n;
	}
	@Override
	public void paintComponent(Graphics g) {
		int s;
		int x2, y2;
		int x = 0;
		int y = w/2;
		s = (num%2==0)?(-1):(1);
		super.paintComponent(g);
		g.setColor(Color.BLACK);	
		g.drawLine(0, w/2, w, w/2);
		g.drawLine(w/2, 0, w/2, w);
		g.setColor(Color.BLUE);			
		for(int i=1;i<=w;i++){
			x2 = i;
			y2 = w/2+s*(int)((w/2)*amp*Math.sin(Math.PI*(2*i*num/(double)w)));
			g.drawLine(x, y, x2, y2);
			x = x2;
			y = y2;
			//g.fillOval(i-5, w/2+s*(int)((w/2)*amp*Math.sin(Math.PI*(2*i*num/(double)w)))-5 , 10, 10);
		}
	}
}


