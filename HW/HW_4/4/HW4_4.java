//javac *.java
//java Hw4_4
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class HW4_4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyPanel panel = new MyPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setPreferredSize(new Dimension( 400, 400));
		frame.pack();
		frame.setVisible(true);
	}
}
