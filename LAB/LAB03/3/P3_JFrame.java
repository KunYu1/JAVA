import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;

public class P3_JFrame extends JFrame implements ActionListener{

	
	//set TextField Panel
	private JTextField input=new JTextField("",20);
	private P3_JPanel sp=new P3_JPanel();
	
	//constructor
	public P3_JFrame(){
		
		JPanel p =new JPanel();
		p.add(new JLabel("Enter: "));
		
		input.setEditable(true);
		p.add(input);

		add(sp,BorderLayout.CENTER);
    	add(p,BorderLayout.SOUTH);
		
		input.addActionListener(this);
	}
	
	public void actionPerformed( ActionEvent event ){
		String str=input.getText();
		String[] array=str.split(" ");		
		
		int size=Integer.parseInt(array[0]);
		//draw
		sp.setPreferredSize(new Dimension(size, size));
		sp.reset(array);
		this.pack();
   }
	
} 