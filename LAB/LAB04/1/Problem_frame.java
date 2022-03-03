import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem_frame extends JFrame implements ActionListener{
	public JButton button;
	public JTextField input;
	public JPanel layout;
	public Problem_panel panel;
	public Problem_frame(){
		button = new JButton("enter");
		input = new JTextField("",20);
		panel = new Problem_panel();
		layout = new JPanel();
		this.setLayout(new BorderLayout());
		layout.add(input);
		layout.add(button);
		add(layout,BorderLayout.NORTH);
		panel.setPreferredSize(new Dimension(1000,600));
		add(panel,BorderLayout.CENTER);
		panel.setVisible(true);
		pack();
		
		button.addActionListener(this);
	}
	public static int size;
	@Override
	public void actionPerformed(ActionEvent event){
		size = Integer.parseInt(input.getText());
		this.repaint();
	}
	public static void main(String[] args){
		Problem_frame f = new Problem_frame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(5000, 150);
        f.setVisible(true);
	}
}