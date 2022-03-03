import java.awt.*;
import javax.swing.*;

public class J4 extends JPanel {
	int size=500;
	static int sizee=500;
	int split=16;
  public void paintComponent(Graphics g) {
 
     g.setColor(Color.BLACK);
	 //case1
	 /*for(int i=1;i<=split;i++)
		 g.drawLine(0,0,size-i*size/split,i*size/split);*/
	 
	 //case2
	 for(int i=0;i<split;i++)
		 g.drawLine(0,0,size-i*size/split,i*size/split);
	 
	 for(int i=0;i<split;i++)
		 g.drawLine(0,size,i*size/split,i*size/split);
	 
	 for(int i=0;i<split;i++)
		 g.drawLine(size,0,i*size/split,i*size/split);
	 
	 for(int i=0;i<split;i++)
		 g.drawLine(size,size,size-i*size/split,i*size/split);
	 
 
  }
 
  public static void main(String[] args) {
    //JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Draw Line");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.white);
 
    J4 panel = new J4();
 
    frame.add(panel);
	frame.setPreferredSize(new Dimension(sizee, sizee));
	frame.pack();
    frame.setLocationByPlatform(true);
    frame.setVisible(true);
  }
}
 