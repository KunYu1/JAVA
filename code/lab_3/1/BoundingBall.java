
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BoundingBall {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyPanel panel = new MyPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setPreferredSize(new Dimension(500,500));
		frame.pack();
		//panel.setSize(500, 500);
		frame.setVisible(true);
		Point p2 = SwingUtilities.convertPoint(panel, 0, 0, frame);
		System.out.println(p2);
	}

}
