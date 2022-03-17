
import java.awt.Dimension;
import java.awt.Point;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.DimensionUIResource;

public class Sin {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Scanner sc = new Scanner(System.in);
		int window = sc.nextInt();
		double A = sc.nextDouble();
		int n = sc.nextInt();
		MyPanel panel = new MyPanel(window, A, n);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setPreferredSize(new Dimension( window, window));
		frame.pack();
		frame.setVisible(true);

		sc.close();
	}

}
