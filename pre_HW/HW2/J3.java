import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class J3{
	
	public static void main(String[] args){
		
		Scanner input=new  Scanner(System.in);
		
		//System.out.print("Enter first integer: ");
		String s1,s2;
		s1=JOptionPane.showInputDialog("Enter first integer:");
		s2=JOptionPane.showInputDialog("Enter second integer:");
		int number1=Integer.parseInt(s1);
		
		//System.out.print("Enter second integer: ");
		int number2=Integer.parseInt(s2);
		
		
		JTextArea textarea=new JTextArea("");
		
		if(number1==number2)
			//System.out.printf("%d == %d %n",number1,number2);
			textarea.append(number1+" == "+number2+"\r\n");
			textarea.append(number1+" == "+number2+"\r\n");
		
		if(number1!=number2)
			//System.out.printf("%d != %d %n",number1,number2);
			textarea.append(number1+" != "+number2+"\r\n");
		
		if(number1<number2)
			textarea.append(number1+" < "+number2+"\r\n");
		
		if(number1>number2)
			textarea.append(number1+" > "+number2+"\r\n");
		
		if(number1>=number2)
			textarea.append(number1+" >= "+number2+"\r\n");
		
		if(number1<=number2)
			textarea.append(number1+" <= "+number2+"\r\n");
		
		textarea.append("-----------------------");
		
		/*textarea.setLineWrap(true);  
		textarea.setWrapStyleWord(true); 
*/
		JScrollPane scrollPane= new JScrollPane(textarea);
		scrollPane.setPreferredSize( new Dimension( 100, 50 ) );
		
		JOptionPane.showMessageDialog(null,scrollPane );
		
	}
}
		