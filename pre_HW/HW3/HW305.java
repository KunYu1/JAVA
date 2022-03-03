import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.math.BigInteger;

public class HW305 extends JFrame implements ActionListener{
	JTextField number1Field,number2Field,addField,subField,multField,divField;
	JLabel number1Label,number2Label,addLabel,subLabel,multLabel,divLabel;
	JPanel opPanel,sPanel;
	BigInteger one,two;
	JButton calButton;
	public HW305(){
		super("Big digits");
		
		opPanel=new JPanel();
		add(opPanel,BorderLayout.CENTER);
		opPanel.setLayout(new FlowLayout());
		
		/*sPanel=new JPanel();
		add(sPanel,BorderLayout.SOUTH);
		sPanel.setLayout(new FlowLayout());*/
		
		number1Label=new JLabel("number1");
		opPanel.add(number1Label);
		number1Field=new JTextField(20);
		number1Field.setEditable(true);
		opPanel.add(number1Field);
		
		number2Label=new JLabel("number2");
		opPanel.add(number2Label);
		number2Field=new JTextField(20);
		number2Field.setEditable(true);
		opPanel.add(number2Field);
		
		calButton=new JButton("Start");
		calButton.addActionListener(this);
		opPanel.add(calButton);
		
		addLabel=new JLabel("ADD");
		opPanel.add(addLabel);
		addField=new JTextField(20);
		addField.setEditable(false);
		opPanel.add(addField);
		
		
		subLabel=new JLabel("SUBSTRACT");
		opPanel.add(subLabel);
		subField=new JTextField(20);
		subField.setEditable(false);
		opPanel.add(subField);
		
		multLabel=new JLabel("MULTIPLE");
		opPanel.add(multLabel);
		multField=new JTextField(20);
		multField.setEditable(false);
		opPanel.add(multField);
		
		divLabel=new JLabel("DIVIDE");
		opPanel.add(divLabel);
		divField=new JTextField(20);
		divField.setEditable(false);
		opPanel.add(divField);
		
	
	}
	public void actionPerformed(ActionEvent actionEvent){
		one=new BigInteger(number1Field.getText());
		two=new BigInteger(number2Field.getText());
		
		//add
		addField.setText(one.add(two).toString());
		subField.setText(one.subtract(two).toString());
		multField.setText(one.multiply(two).toString());
		divField.setText(one.divide(two).toString());
	}
			
	public static void main(String[] args){
		HW305 e=new HW305();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setPreferredSize(new Dimension(264, 327));
		e.setVisible(true);
		e.pack();
		e.setLocationByPlatform(false);
	}
}
		
	
	
	