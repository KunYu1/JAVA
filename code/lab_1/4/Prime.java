import javax.swing.JOptionPane;

public class Prime {
	public static int cal(int num) {
		int flag = 0;
		for(int i=2; i*i <= num; i++)
			if(num%i == 0)
				flag =1;
		return flag;
	}
	
	public static void main(String args[]){
		int first;
		int result;
		String x;
		x = JOptionPane.showInputDialog("Enter the number");
		first = Integer.parseInt(x);
		result = cal(first);
		if(result == 0)
			JOptionPane.showMessageDialog(null,first + " is a prime number.");
		else
			JOptionPane.showMessageDialog(null,first + " isn't a prime number.");
		System.exit(0);
	}
}