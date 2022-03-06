
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
public class MyPanel extends JPanel{
	int x,y;
	public MyPanel() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				x = (int)(Math.random()*getWidth());
				y = (int)(Math.random()*getHeight());
				repaint();
			}
		};
		timer.schedule(task, 0, 100);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x, y, 50, 50);
	}
}


