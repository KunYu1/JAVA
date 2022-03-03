import javax.swing.*; 
import java.awt.*; 
 
public class Q3 { 
 
	public static void main(String[] args) { 
 
		JFrame  frame1 = new JFrame();
		Panel panel1 = new Panel(); 
		
		frame1.setLayout(new FlowLayout());
		
		JButton btn_red   = new JButton("Red");
		JButton btn_green = new JButton("Green");  
		JButton btn_blue = new JButton("Blue"); 
		JButton btn_w1 = new JButton("Width1"); 
		JButton btn_w2 = new JButton("Width2"); 
		JButton btn_w3 = new JButton("Width3"); 
		
		panel1.add(new JLabel(" * ")); 
		panel1.add(btn_red);   
		panel1.add(btn_green);  
		panel1.add(btn_blue);  
		panel1.add(btn_w1);  
		panel1.add(btn_w2); 
		panel1.add(btn_w3); 
		// ...     
		btn_red.addActionListener((e)->panel1.setColor(Color.RED));
		btn_green.addActionListener((e)->panel1.setColor(Color.green));
		btn_blue.addActionListener((e)->panel1.setColor(Color.blue));
		btn_w1.addActionListener((e)->panel1.setWidth(5));
		btn_w2.addActionListener((e)->panel1.setWidth(10));
		btn_w3.addActionListener((e)->panel1.setWidth(20));
		// ...   //... 
		
		//frame1.setLayout(new FlowLayout ());
		// ...   
		
		// ...    
		frame1.add(panel1);		
		frame1.pack();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(800, 800);
		frame1.setVisible(true);
	} 
} 
 