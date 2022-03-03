import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.lang.Character;

public class LAB0302 extends JFrame implements ActionListener{
	
	JButton upperButton,lowerButton,swapButton;
	JTextField enterField;
	JLabel enterLabel;
	JPanel opPanel;
	
	public LAB0302(){
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
		
		
		swapButton=new JButton("Swapcase");
		swapButton.addActionListener(this);
		opPanel.add(swapButton);
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
		else if(thisbutton==swapButton){
			String str=enterField.getText();
			char[] tmpstr=str.toCharArray();
			for(int i=0;i<str.length();i++){
				if(Character.isLowerCase(tmpstr[i])){
					tmpstr[i]=Character.toUpperCase(tmpstr[i]);
				}
				else
					tmpstr[i]=Character.toLowerCase(tmpstr[i]);
			}
			String reversed=new String(tmpstr);
			enterField.setText("");
			enterField.setText(reversed);
		}
		
	}
	public static void main(String[] args){
		LAB0302 e=new LAB0302();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setPreferredSize(new Dimension(214, 327));
		e.setVisible(true);
		e.pack();
		e.setLocationByPlatform(false);
	}
}
			
		