import javax.swing.JOptionPane;

public class Hw1_1_1 {
	public static void main(String args[]) {
		int first, second, third;
		String x;
		x = JOptionPane.showInputDialog("Enter first integer:");
		first = Integer.parseInt(x);
		x = JOptionPane.showInputDialog("Enter second integer:");
		second = Integer.parseInt(x);
		x = JOptionPane.showInputDialog("Enter third integer:");
		third = Integer.parseInt(x);
		JOptionPane.showMessageDialog(null,"The sum is "+ (first+second+third)
									 + "\nThe averge is "+ (first+second+third)/3.0
									 + "\nThe product is "+(first*second*third)
									 + "\nThe smallest number is " + ((first>second)?((second>third)?third:second):((first>third)?third:first))
									 + "\nThe largest number is " + ((first<second)?((second<third)?third:second):((first<third)?third:first)));
	}
}