import javax.swing .JOptionPane;

public class lab0101 {	
	public static String getFileExtension(String s){
		String[] spl;
		spl=s.split("\\.");
		return spl[spl.length-1];
	};
	public static void main(String[] args){
		String s;
		s=JOptionPane.showInputDialog("Enter filename:");
		JOptionPane.showMessageDialog(null,"The file extension is "+getFileExtension(s));
	}
}