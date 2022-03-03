import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class LAB01Test extends JFrame {
	public static void main(String[] args) {
	
		LAB01 panel = new LAB01();
		JFrame frame = new JFrame("LAB1-1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.pack();
		frame.add(panel);
		frame.setVisible(true);
	}
}
 