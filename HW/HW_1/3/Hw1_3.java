import javax.swing.JOptionPane;

public class Hw1_3 {
		
	public static void main(String args[]) {
		int cost, money;
		String x;
		String change = "";
		x = JOptionPane.showInputDialog("Enter price of item\n(from 25 cents to one dollar, in 5-cent increments)");
		cost = Integer.parseInt(x);
		while((cost%5 != 0) || (cost > 100) || (cost < 25)) {
			JOptionPane.showMessageDialog(null,"You enter a wrong price","Error!!!",JOptionPane.ERROR_MESSAGE);
			x = JOptionPane.showInputDialog("Enter first integer:");
			cost = Integer.parseInt(x);
		}
		money = 100 - cost;
		if(money/25 > 1){
			change += money/25 + " quarters\n";
			money %= 25;
		} else if(money/25 == 1){
			change += money/25 + " quarter\n";
			money %= 25;
		}	
		if(money/10 > 1){
			change += money/10 + " dimes\n";
			money %= 10;
		} else if(money/10 == 1){
			change += money/10 + " dime\n";
			money %= 10;
		}
		if(money/5 > 1){
			change += money/5 + " nickels\n";
			money %= 5;
		} else if(money/5 == 1){
			change += money/5 + " nickel\n";
			money %= 5;
		}
		if(money > 1){
			change += money + " cents\n";
		} else if(money == 1){
			change += money + " cent\n";
		}
		if(cost == 100)
			change += " null!!";
		JOptionPane.showMessageDialog(null,"You bought an item for " + cost + " cents and gave me one dollar.\n"
									+ "So your change is\n" + change);
	}
}