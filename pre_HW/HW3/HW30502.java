import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.math.BigInteger;

public class HW30502 extends JFrame implements ActionListener{
	JTextField number1Field,number2Field;
	JLabel number1Label,number2Label;
	JPanel opPanel;
	BigInteger num;
	JButton calButton;
	public HW30502(){
		super("Factorial");
		
		opPanel=new JPanel();
		add(opPanel,BorderLayout.CENTER);
		opPanel.setLayout(new FlowLayout());
		
		number1Label=new JLabel("Enter number");
		opPanel.add(number1Label);
		number1Field=new JTextField(40);
		number1Field.setEditable(true);
		opPanel.add(number1Field);
		
		number2Label=new JLabel("Factorial is");
		opPanel.add(number2Label);
		number2Field=new JTextField(40);
		number2Field.setEditable(false);
		opPanel.add(number2Field);
		
		calButton=new JButton("Start");
		calButton.addActionListener(this);
		opPanel.add(calButton);
	}
	public void actionPerformed(ActionEvent actionEvent){
		
		num=new BigInteger("1");
		
		for(int i=1;i<=Integer.parseInt(number1Field.getText());i++){
			BigInteger next=new BigInteger(String.valueOf(i));
			num=num.multiply(next);
		}
		number2Field.setText(num.toString());
	}
			
	public static void main(String[] args){
		HW30502 e=new HW30502();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setPreferredSize(new Dimension(264, 427));
		e.setVisible(true);
		e.pack();
		e.setLocationByPlatform(false);
	}
}
		
	
	
	