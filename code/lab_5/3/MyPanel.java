
import javax.management.loading.PrivateClassLoader;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat.Style;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.math.*;
public class MyPanel extends JPanel{
	private JTextField textfiled_1;
	private JTextField textfiled_2;
	private JTextField textfiled_3;
	int r_x;
	int r_y;
	int r_z;
	Point_3d a0 = new Point_3d(-50,-50,-50);
	Point_3d a1 = new Point_3d(50,-50,-50);
	Point_3d a2 = new Point_3d(50,50,-50);
	Point_3d a3 = new Point_3d(-50,50,-50);
	Point_3d a4 = new Point_3d(-50,-50,50);
	Point_3d a5 = new Point_3d(50,-50,50);
	Point_3d a6 = new Point_3d(50,50,50);
	Point_3d a7 = new Point_3d(-50,50,50);
	public MyPanel() {
		textfiled_1 = new JTextField(10);
		add(textfiled_1);

		textfiled_2 = new JTextField(10);
		add(textfiled_2);

		textfiled_3 = new JTextField(10);
		add(textfiled_3);
		textfiled_3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				r_x = Integer.parseInt(textfiled_1.getText());
				r_y = Integer.parseInt(textfiled_2.getText());
				r_z = Integer.parseInt(textfiled_3.getText());
				a0.set(-50,-50,-50);
				a1.set(50,-50,-50);
				a2.set(50,50,-50);
				a3.set(-50,50,-50);
				a4.set(-50,-50,50);
				a5.set(50,-50,50);
				a6.set(50,50,50);
				a7.set(-50,50,50);
				rotate_x(r_x);
				rotate_y(r_y);
				rotate_z(r_z);
				repaint();
			}
		});
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(a0.x+200, a0.y+200, a1.x+200, a1.y+200);
		g.drawLine(a1.x+200, a1.y+200, a2.x+200, a2.y+200);
		g.drawLine(a2.x+200, a2.y+200, a3.x+200, a3.y+200);
		g.drawLine(a3.x+200, a3.y+200, a0.x+200, a0.y+200);
		g.drawLine(a1.x+200, a1.y+200, a5.x+200, a5.y+200);
		g.drawLine(a0.x+200, a0.y+200, a4.x+200, a4.y+200);
		g.drawLine(a3.x+200, a3.y+200, a7.x+200, a7.y+200);
		g.drawLine(a2.x+200, a2.y+200, a6.x+200, a6.y+200);
		g.drawLine(a4.x+200, a4.y+200, a5.x+200, a5.y+200);
		g.drawLine(a5.x+200, a5.y+200, a6.x+200, a6.y+200);
		g.drawLine(a6.x+200, a6.y+200, a7.x+200, a7.y+200);
		g.drawLine(a7.x+200, a7.y+200, a4.x+200, a4.y+200);
	}

	public void rotate_x(int x){
		a0.rotate_x(x);
		a1.rotate_x(x);
		a2.rotate_x(x);
		a3.rotate_x(x);
		a4.rotate_x(x);
		a5.rotate_x(x);
		a6.rotate_x(x);
		a7.rotate_x(x);
	}
	public void rotate_y(int y){
		a0.rotate_y(y);
		a1.rotate_y(y);
		a2.rotate_y(y);
		a3.rotate_y(y);
		a4.rotate_y(y);
		a5.rotate_y(y);
		a6.rotate_y(y);
		a7.rotate_y(y);
	}
	public void rotate_z(int z){
		a0.rotate_z(z);
		a1.rotate_z(z);
		a2.rotate_z(z);
		a3.rotate_z(z);
		a4.rotate_z(z);
		a5.rotate_z(z);
		a6.rotate_z(z);
		a7.rotate_z(z);
	}
}



