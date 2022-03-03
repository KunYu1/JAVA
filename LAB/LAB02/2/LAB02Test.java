import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.util.Scanner;
import javax.swing.JComponent;
public class LAB02Test extends JFrame {
	public static void main(String[] args) {
    //JFrame.setDefaultLookAndFeelDecorated(true);
	
		System.out.print("Input window size:\r\n");
		Scanner input=new Scanner (System.in);
		
		int size=input.nextInt();
		
		LAB02 panel = new LAB02();
		JFrame frame = new JFrame("LAB2-1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.add(panel,BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension(size+14, size+37));
		frame.pack();
		frame.setLocationByPlatform(false);
		frame.setVisible(true);
	}
}
 