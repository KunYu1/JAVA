
import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
public class MyPanel extends JPanel{
	int x,y,vx,vy;
	public int flag = 0;
	public MyPanel() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {		
			@Override
			public void run() {
				if(flag == 0){
					x = (int)(Math.random()*getWidth()*0.5+250);
					y = (int)(Math.random()*getHeight()*0.5+250);
					vx = (int)(Math.random()*20+5);
					vy = (int)(Math.random()*20+5);
					flag = 1;
				} else{
					System.out.println(x+" "+y+" "+vx+" "+vy);
					if(x > getWidth()-50){
						vx *= -1;
						//x = getWidth()-50;
					}
					if(x < 0){
						vx *= -1;
						//x = 50;
					}
					if(y > getHeight()-50){
						vy *= -1;
						//y = getHeight()-50;
					}
					if(y < 0){
						vy *= -1;
						//y = 50;
					}
					x += vx;
					y += vy;			
					repaint();					
				}

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


