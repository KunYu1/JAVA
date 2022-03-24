import javax.swing.*;
import java.math.*;
public class Big_num {
	public static void main(String args[]){
		String x;
		BigDecimal a;
		BigDecimal b;
		String case_f;
		BigDecimal c;
		while(true){
			case_f = JOptionPane.showInputDialog("Case 1: Show Arithemetic Operations Od Big Data\nCase 2: Calculate Factorial Of Integer n\nCase Q: Leave Application");

			MathContext mc =new MathContext(8,RoundingMode.HALF_UP);
			switch(case_f){
				case "1":
					x = JOptionPane.showInputDialog("Number 1 is");
					a = new BigDecimal(x);
					x = JOptionPane.showInputDialog("Number 2 is");
					b = new BigDecimal(x);
					c = new BigDecimal(a.add(b).toString(), mc);
					JOptionPane.showMessageDialog(null,  "Sum is\n"+c);
					c = new BigDecimal(a.subtract(b).toString(), mc);
					JOptionPane.showMessageDialog(null,  "Substract is\n"+c);
					c = new BigDecimal(a.multiply(b).toString(), mc);
					JOptionPane.showMessageDialog(null,  "Multiply is\n"+c);
					break;
				case "2":
					x = JOptionPane.showInputDialog("Number 1 is");
					a = new BigDecimal(x);
					c = new BigDecimal(factorial(a).toString(), mc);
					JOptionPane.showMessageDialog(null, "Factorial is\n"+ c);
					break;
				case "Q":
					return ;
			}
		}
	}
	public static BigDecimal factorial(BigDecimal a) {
		if(a.compareTo(new BigDecimal("1"))==0)
			return new BigDecimal("1");
		else
			return a.multiply(factorial(a.subtract(new BigDecimal("1"))));	
	}

}