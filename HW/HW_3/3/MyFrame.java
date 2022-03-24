
import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat.Style;
import java.util.Random;
import java.awt.event.ActionEvent;
public class MyFrame extends JFrame{
	private JTextField textfiled;
	private JButton button_up;
	private JButton button_low;
	String input;
	public MyFrame() {
		super("Upper And Lower");
		setLayout(new FlowLayout());

		textfiled = new JTextField(15);
		add(textfiled);

		button_low = new JButton("Lower Case");
		button_low.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				input = textfiled.getText();
				input = input.toLowerCase();
				textfiled.setText(input);
			}
		});
		add(button_low);

		button_up = new JButton("Upper Case");
		button_up.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				input = textfiled.getText();
				input = input.toUpperCase();
				textfiled.setText(input);
			}
		});
		add(button_up);

	}
}


