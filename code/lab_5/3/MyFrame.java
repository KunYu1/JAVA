
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
	Point_3d a1 = new Point_3d(-50,-50,-50);
	Point_3d a2 = new Point_3d(50,-50,-50);
	Point_3d a3 = new Point_3d(50,50,-50);
	Point_3d a4 = new Point_3d(-50,50,-50);
	Point_3d a5 = new Point_3d(-50,-50,50);
	Point_3d a6 = new Point_3d(50,-50,50);
	Point_3d a7 = new Point_3d(50,50,50);
	Point_3d a8 = new Point_3d(-50,50,50);
	public MyFrame() {
		super("Rect");
		setLayout(new FlowLayout());

		textfiled_1 = new JTextField(10);
		add(textfiled_1);

		textfiled_2 = new JTextField(10);
		add(textfiled_2);

		textfiled_3 = new JTextField(10);
		add(textfiled_3);
		textfiled_3.addActionListener(new ActionListener(){
			@Override
		});


	}
}



