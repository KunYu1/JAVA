import javax.swing.JOptionPane;

public class Hw1_1_2 {
	
	public static int smallest(int first, int second, int third) {
		return ((first>second)?((second>third)?third:second):((first>third)?third:first));
	}
	
	public static int largest(int first, int second, int third) {
		return ((first<second)?((second<third)?third:second):((first<third)?third:first));
	}	
	
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
									 + "\nThe smallest number is " + smallest(first, second, third)
									 + "\nThe largest number is " +largest(first, second, third));
	}
}