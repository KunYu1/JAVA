import javax.swing.JOptionPane;
import java.lang.*;

public class J5{
	public static void main(String[] args){
		String s1,s2;
		s1=JOptionPane.showInputDialog("input 1 to Convert from rectangular from into polar form\r\ninput 2 to Convert from polar form into rectangular form ");
		int number1=Integer.parseInt(s1);
		if(number1==1){
			double x,y;
			s1=JOptionPane.showInputDialog("Enter rectangular from X (EG:iX+jY):");
			s2=JOptionPane.showInputDialog("Enter rectangular from Y (EG:iX+jY):");
			x=Double.parseDouble(s1);
			y=Double.parseDouble(s2);
			double mag=Math.pow((Math.pow(x,2.0)+Math.pow(y,2.0)),0.5);
			Double phase=Math.atan(x/y);
			
			JOptionPane.showMessageDialog(null,Math.ceil(mag*100)/100+"<"+Math.ceil(phase*18000/Math.PI)/100);
			
		}
		else{
			Double mag,phase;
			s1=JOptionPane.showInputDialog("Enter polar from magnitude:");
			s2=JOptionPane.showInputDialog("Enter polar from phase angle:");
			mag=Double.parseDouble(s1);
			phase=Double.parseDouble(s2);
			
			Double x=mag*Math.cos(phase*Math.PI/180.0);
			Double y=mag*Math.sin(phase*Math.PI/180.0);
			
			if(y>=0)
				JOptionPane.showMessageDialog(null,"i"+Math.ceil(x*1000)/1000+"+j"+Math.ceil(y*1000)/1000);
			else
				JOptionPane.showMessageDialog(null,"i"+Math.ceil(x*1000)/1000+"-j"+Math.ceil(y*1000)/1000);
				
		}
		
		
	}
}