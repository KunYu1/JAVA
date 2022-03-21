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

public class HW3_1 {

	public static void main(String[] args)throws FileNotFoundException {
		JFrame frame = new JFrame();
		Scanner sc = new Scanner(System.in);
		String file_name = sc.next();
		File file = new File(file_name);
		int array[] = new int[100];
		int i = 0 ;
		int k = 0;
		sc = new Scanner(file);
		i = sc.nextInt();
		while(sc.hasNextInt()){
			array[k++] = sc.nextInt();
		}
		//System.out.println(i);
		MyPanel panel = new MyPanel(array,i);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setPreferredSize(new Dimension( 1000, 500));
		frame.pack();
		frame.setVisible(true);
		sc.close();
	}

}
