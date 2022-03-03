import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.util.Scanner;
import javax.swing.JComponent;
public class LAB03Test extends JFrame {
	public static void main(String[] args) {
    //JFrame.setDefaultLookAndFeelDecorated(true);
	
		System.out.print("Input three point:\r\n");
		Scanner input=new Scanner (System.in);
		
		double[][] xy=new double[3][2];
		
		double maxx=0,maxy=0;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				xy[i][j]=input.nextDouble();
			}
		}
		for(int i=0;i<3;i++){
			if(xy[i][0]>maxx){
				maxx=xy[i][0];
			}
			if(xy[i][1]>maxy){
				maxy=xy[i][1];
			}
		}
		
		LAB03 panel = new LAB03(xy);
		
		JFrame frame = new JFrame("LAB3-1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.add(panel,BorderLayout.CENTER);
		frame.setPreferredSize(new Dimension((int)maxx+814, (int)maxy+837));
		frame.pack();
		frame.setLocationByPlatform(false);
		frame.setVisible(true);
	}
}
 