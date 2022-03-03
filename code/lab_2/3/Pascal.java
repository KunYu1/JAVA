import javax.swing.JOptionPane;

public class Pascal {
	public static void main(String args[]) {
		int s, n, t;
		int p;
		
		String x, ans="";
		x = JOptionPane.showInputDialog("Starting layer");
		s = Integer.parseInt(x);
		x = JOptionPane.showInputDialog("nth triangle");
		n = Integer.parseInt(x);
		x = JOptionPane.showInputDialog("Total layer");
		t = Integer.parseInt(x);
		for(int i = 0; i<t; i++){
			for(int m=t-i;m>=0;m--)
				ans+="   ";
			for(int k = n; k<=n+i; k++){
				p=1;
				for(double z=1;z<=k;z++){
					p*=(s+i-z+1)/(z);
				}
				if(s+i == 0)
					p=1;
				ans += p +"   ";
			}
			ans += "\n";
		}
		JOptionPane.showMessageDialog(null, ans);
	}
}