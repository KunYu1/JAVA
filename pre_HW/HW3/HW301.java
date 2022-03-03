import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class HW301 extends JFrame implements ActionListener{
	
	//game status
	final int HIGH=0,LOW=1,RIGHT=2;
	int Status=0;
	
	//constants that represent right number and guess number
	int random=(int)(Math.random()*999+1);
	int guess=0;
	
	//set up GUI component
	JLabel numberLabel,statusLabel;
	JTextField numberField;
	JButton enterButton;
	JPanel opPanel,sPanel;
	
	public HW301(){
		super("Guess Game");
		opPanel=new JPanel();
		sPanel=new JPanel();
		add(opPanel,BorderLayout.CENTER);
		add(sPanel,BorderLayout.SOUTH);
		opPanel.setLayout(new FlowLayout());
		
		numberLabel=new JLabel("Guess number");
		opPanel.add(numberLabel);
		numberField=new JTextField(10);
		numberField.setEditable(true);
		opPanel.add(numberField);
		
		enterButton=new JButton("Guess"+String.valueOf(random));
		enterButton.addActionListener(this);
		opPanel.add(enterButton);
		
		statusLabel=new JLabel("Game Status");
		sPanel.add(statusLabel);
	}
	
	public void actionPerformed(ActionEvent actionEvent){
		String s=numberField.getText();
		guess=Integer.parseInt(s);
		if(guess>1000||guess<0){
			numberField.setText("");
		}
		if(guess==random){
			random=(int)(Math.random()*999+1);
			enterButton.setText("Guess"+String.valueOf(random));
			Status=RIGHT;
			numberField.setText("");
		}
		else if(guess>random){
			Status=LOW;
			numberField.setText("");
		}
		else{
			Status=HIGH;
			numberField.setText("");
		}
		displayMessage();
	}
	public void displayMessage(){
		if(Status==RIGHT){
			statusLabel.setText("Congratulation");
		}
		else if(Status==HIGH){
			statusLabel.setText("Higerer");
		}
		else if(Status==LOW){
			statusLabel.setText("Lower");
		}
	}
	public static void main(String[] args){
		HW301 e=new HW301();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setPreferredSize(new Dimension(214, 327));
		e.setVisible(true);
		e.pack();
		e.setLocationByPlatform(false);
	}
}

	