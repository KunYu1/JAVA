
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
public class MyPanel extends JPanel{
	int rr,thz = 0,nn,thz_s = 5;
	double x,y;
	public MyPanel(int r,int n) {
		rr = r;
		nn = n;
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {		
			@Override
			public void run() {
				x = Math.cos(Math.toRadians(thz))*r+240;
				y = Math.sin(Math.toRadians(thz))*r+240;	
				thz += 5;
				thz_s -= 5;
				repaint();			
			}
		};
		timer.schedule(task, 0, 100);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);		
		g.fillOval((int)x, (int)y, 20, 20);
		g.setColor(Color.BLACK);
		g.drawOval(250-rr, 250-rr, rr*2, rr*2);
		g.fillOval(240, 240, 20, 20);
		for(int i=0 ; i < nn; i++){
			g.setColor(Color.BLUE);
			g.fillOval((int)(x + Math.cos(Math.toRadians(thz_s+360*i/nn))*rr), (int)(y + Math.sin(Math.toRadians(thz_s+360*i/nn))*rr), 20, 20);
			g.setColor(Color.BLACK);
			g.drawLine((int)(Math.cos(Math.toRadians(360*i/nn))*2*rr+250),(int)(Math.sin(Math.toRadians(360*i/nn))*rr*2+250) ,(int)(Math.cos(Math.toRadians(360*i/nn))*(-rr)*2+250) ,(int)(Math.sin(Math.toRadians(360*i/nn))*(-rr)*2+250) );
		}
	}
}


