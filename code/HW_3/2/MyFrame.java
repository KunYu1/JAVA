
import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
public class MyFrame extends JFrame{
	private JLabel label;
	private JTextField textfiled;
	private JButton button;
	private int count ;
	private int r;
	private int flag;
	public MyFrame() {
		super("Number Guessing");
		setLayout(new FlowLayout());

		r = (int)(Math.random()*1001);
		System.out.println(r);		
		count = 0;
		flag = 0;
		textfiled = new JTextField(20);
		textfiled.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				if(flag == 0)
					count++;
				int input = Integer.parseInt( textfiled.getText());
				if(input>1000||input<0){
					label.setText("Count: "+count+"     Hint : Out Of Range!");
				} else if(input == r){
					label.setText("Count: "+count+"     Hint : Congratulation!");
					textfiled.setEditable(false);
					flag = 1;
				} else if(input > r){
					label.setText("Count: "+count+"     Hint : Too High!");
				} else{
					label.setText("Count: "+count+"     Hint : Too low");

				}
			}
		});
		add(textfiled);

		button = new JButton("Reset");
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				textfiled.setText("");
				count =0;
				label.setText("Count: "+count+"     Hint : Answer has been reset!");
				r = (int)(Math.random()*1001);
				System.out.println(r);
				textfiled.setEditable(true);
				flag = 0;
			}
		});
		add(button);

		label = new JLabel("Count: "+count+"     Hint : Guess The answer");
		add(label);

	}
}


