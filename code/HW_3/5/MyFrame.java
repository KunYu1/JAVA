
import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat.Style;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.math.*;
public class MyFrame extends JFrame{
	private JTextField textfiled_1;
	private JTextField textfiled_2;
	private JTextField textfiled_3;
	private JButton button_add;
	private JButton button_sub;
	private JButton button_div;
	private BigInteger A;
	private BigInteger B;
	private BigInteger ANS;
	public MyFrame() {
		super("Big");
		setLayout(new FlowLayout());

		textfiled_1 = new JTextField(45);
		add(textfiled_1);

		textfiled_2 = new JTextField(45);
		add(textfiled_2);

		button_add = new JButton("ADD");
		button_add.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				A = new BigInteger(textfiled_1.getText());
				B = new BigInteger(textfiled_2.getText());
				ANS = A.add(B);
				textfiled_3.setText(ANS.toString(10));
			}
		});
		add(button_add);

		button_sub = new JButton("SUB");
		button_sub.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				A = new BigInteger(textfiled_1.getText());
				B = new BigInteger(textfiled_2.getText());
				ANS = A.subtract(B);
				textfiled_3.setText(ANS.toString(10));
			}
		});
		add(button_sub);

		button_div = new JButton("DIV");
		button_div.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				A = new BigInteger(textfiled_1.getText());
				B = new BigInteger(textfiled_2.getText());
				ANS = A.divide(B);
				textfiled_3.setText(ANS.toString(10));
			}
		});
		add(button_div);

		textfiled_3 = new JTextField(45);
		add(textfiled_3);
	}
}


