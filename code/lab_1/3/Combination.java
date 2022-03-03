import javax.swing.JOptionPane;

public class Combination {
	public static int cal(int first, int second) {
		if(second == 0|| first == second)
			return 1;
		else
			return cal(first-1, second) + cal(first-1, second-1); 
	}
	
	public static void main(String args[]){
		int first;
		int second;
		int result;
		String x;
		String y;
		x = JOptionPane.showInputDialog("Enter the first number n");
		y = JOptionPane.showInputDialog("Enter the second number k");
		first = Integer.parseInt(x);
		second = Integer.parseInt(y);
		result = cal(first, second);
		JOptionPane.showMessageDialog(null,"The value is "+ result);
		
		System.exit(0);
	}
}