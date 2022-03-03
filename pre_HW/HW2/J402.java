import java.awt.*;
import javax.swing.*;

public class J402 extends JPanel {
	int split=20;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width=getWidth();
		int height=getHeight();
		
		g.setColor(Color.BLACK);
		//case1
		/*for(int i=1;i<=split;i++)
		 g.drawLine(0,0,size-i*size/split,i*size/split);*/
		for(int i=1;i<=split;i++)
			g.drawLine(0,i*height/split,i*width/split,height);
		for(int i=1;i<=split;i++)
			g.drawLine(0,i*height/split,width-i*width/split,0);
		for(int i=1;i<=split;i++)
			g.drawLine(i*width/split,0,width,i*height/split);
		for(int i=1;i<=split;i++)
			g.drawLine(i*width/split,height,width,height-i*height/split);
 
  }
	public static void main(String[] args) {
    //JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Draw Line");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
 
		J402 panel = new J402();
 
		frame.add(panel);
		frame.setPreferredSize(new Dimension(250, 250));
		frame.pack();
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}
}
 