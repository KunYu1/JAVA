//javac *.java
//java Hw3_1
import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.DimensionUIResource;

public class HW3_2 {

	public static void main(String[] args)throws FileNotFoundException {
		MyFrame frame = new MyFrame();
		//System.out.println(i);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,150);
		frame.setVisible(true);
	}

}
