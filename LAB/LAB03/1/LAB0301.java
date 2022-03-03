import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.math.BigInteger;

public class LAB0301 extends JFrame implements ActionListener{
	/*JTextField number1Field,number2Field,addField,subField,multField,divField;
	JLabel number1Label,number2Label,addLabel,subLabel,multLabel,divLabel;
	JPanel opPanel,sPanel;
	BigInteger one,two;
	JButton calButton;*/
	JTextField number1Field,number2Field,answerField;
	JLabel number1Label,number2Label,answerLabel;
	JPanel opPanel;
	BigInteger one,two;
	JButton multiButton,divButton;
	public LAB0301(){
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
		
		
		
		
		multiButton=new JButton("Multiple");
		multiButton.addActionListener(this);
		opPanel.add(multiButton);
		
		divButton=new JButton("Divide");
		divButton.addActionListener(this);
		opPanel.add(divButton);
		
		//answerLabel=new JLabel("Answer");
		//opPanel.add(answerLabel);
		answerField=new JTextField(20);
		answerField.setEditable(true);
		opPanel.add(answerField);
		
		/*calButton=new JButton("Start");
		calButton.addActionListener(this);
		opPanel.add(calButton);*/
		
		/*addLabel=new JLabel("ADD");
		opPanel.add(addLabel);
		addField=new JTextField(20);
		addField.setEditable(false);
		opPanel.add(addField);*/
		
		
		/*subLabel=new JLabel("SUBSTRACT");
		opPanel.add(subLabel);
		subField=new JTextField(20);
		subField.setEditable(false);
		opPanel.add(subField);*/
		
		/*multLabel=new JLabel("MULTIPLE");
		opPanel.add(multLabel);
		multField=new JTextField(20);
		multField.setEditable(false);
		opPanel.add(multField);*/
		
		/*divLabel=new JLabel("DIVIDE");
		opPanel.add(divLabel);
		divField=new JTextField(20);
		divField.setEditable(false);
		opPanel.add(divField);*/
		
	
	}
	public void actionPerformed(ActionEvent actionEvent){
		one=new BigInteger(number1Field.getText());
		two=new BigInteger(number2Field.getText());
		JButton thisbutton=(JButton) actionEvent.getSource();
		//detect zero
		if(thisbutton==divButton){
			if(BigInteger.valueOf(0).compareTo(two)==0){
				JOptionPane.showMessageDialog(null,"The divisor can not be zero!!","Error",JOptionPane.ERROR_MESSAGE);
			}
			else{
				answerField.setText(one.divide(two).toString());
			}
		}
		else{
			answerField.setText(one.multiply(two).toString());
		}
		/*//add
		addField.setText(one.add(two).toString());
		subField.setText(one.subtract(two).toString());
		multField.setText(one.multiply(two).toString());
		divField.setText(one.divide(two).toString());*/
	}
			
	public static void main(String[] args){
		LAB0301 e=new LAB0301();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setPreferredSize(new Dimension(264, 327));
		e.setVisible(true);
		e.pack();
		e.setLocationByPlatform(false);
	}
}
		
	
	
	