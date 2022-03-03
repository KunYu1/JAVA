import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class HW303 extends JFrame implements ActionListener{
	
	JButton upperButton,lowerButton;
	JTextField enterField;
	JLabel enterLabel;
	JPanel opPanel;
	
	public HW303(){
		super("Case changer");
		opPanel=new JPanel();
		add(opPanel,BorderLayout.CENTER);
		opPanel.setLayout(new FlowLayout());
		
		enterLabel=new JLabel("Enter English word");
		opPanel.add(enterLabel);
		enterField=new JTextField(20);
		enterField.setEditable(true);
		opPanel.add(enterField);
		
		upperButton=new JButton("Uppercase");
		upperButton.addActionListener(this);
		opPanel.add(upperButton);
		
		lowerButton=new JButton("Lowercase");
		lowerButton.addActionListener(this);
		opPanel.add(lowerButton);
	}
	public void actionPerformed(ActionEvent actionEvent){
		
		JButton thisbutton=(JButton) actionEvent.getSource();
		if(thisbutton==upperButton){
			String str=enterField.getText();
			str=str.toUpperCase();
			enterField.setText("");
			enterField.setText(str);
		}
		else if(thisbutton==lowerButton){
			String str=enterField.getText();
			str=str.toLowerCase();
			enterField.setText("");
			enterField.setText(str);
		}
		
	}
	public static void main(String[] args){
		HW303 e=new HW303();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setPreferredSize(new Dimension(214, 327));
		e.setVisible(true);
		e.pack();
		e.setLocationByPlatform(false);
	}
}
			
		