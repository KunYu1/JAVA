
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
	private Point_3d a[] = new Point_3d[8];
	public MyPanel() {
		for(int i=0;i<8;i++){
			a[i] = new Point_3d();
		}
		init_point(a);

		textfiled_1 = new JTextField(10);
		add(textfiled_1);

		textfiled_2 = new JTextField(10);
		add(textfiled_2);

		textfiled_3 = new JTextField(10);
		add(textfiled_3);
		textfiled_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				r_x = Integer.parseInt(textfiled_1.getText());
				r_y = Integer.parseInt(textfiled_2.getText());
				r_z = Integer.parseInt(textfiled_3.getText());
				init_point(a);
				rotate_x(r_x);
				rotate_y(r_y);
				rotate_z(r_z);
				repaint();
			}
		});
		textfiled_2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				r_x = Integer.parseInt(textfiled_1.getText());
				r_y = Integer.parseInt(textfiled_2.getText());
				r_z = Integer.parseInt(textfiled_3.getText());
				init_point(a);
				rotate_x(r_x);
				rotate_y(r_y);
				rotate_z(r_z);
				repaint();
			}
		});
		textfiled_3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				r_x = Integer.parseInt(textfiled_1.getText());
				r_y = Integer.parseInt(textfiled_2.getText());
				r_z = Integer.parseInt(textfiled_3.getText());
				init_point(a);
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
		Graphics2D g2d = (Graphics2D)g;
		Stroke b = g2d.getStroke();
		//g2d.setStroke(new BasicStroke(5));
		// g.drawLine(a[0].x+200, a[0].y+200, a[1].x+200, a[1].y+200);
		// g.drawLine(a[1].x+200, a[1].y+200, a[2].x+200, a[2].y+200);
		// g.drawLine(a[2].x+200, a[2].y+200, a[3].x+200, a[3].y+200);
		// g.drawLine(a[3].x+200, a[3].y+200, a[0].x+200, a[0].y+200);
		// g.drawLine(a[1].x+200, a[1].y+200, a[5].x+200, a[5].y+200);
		// g.drawLine(a[0].x+200, a[0].y+200, a[4].x+200, a[4].y+200);
		// g.drawLine(a[3].x+200, a[3].y+200, a[7].x+200, a[7].y+200);
		// g.drawLine(a[2].x+200, a[2].y+200, a[6].x+200, a[6].y+200);
		// g.drawLine(a[4].x+200, a[4].y+200, a[5].x+200, a[5].y+200);
		// g.drawLine(a[5].x+200, a[5].y+200, a[6].x+200, a[6].y+200);
		// g.drawLine(a[6].x+200, a[6].y+200, a[7].x+200, a[7].y+200);
		// g.drawLine(a[7].x+200, a[7].y+200, a[4].x+200, a[4].y+200);
		//g2d.setStroke(b);
		int b_point = find_top(a, 8);
		int x[] = new int [4];
		int y[] = new int [4];
		System.out.println(b_point);
		if(b_point == 0||b_point == 1||b_point == 2||b_point == 3){
			
			x[0] = a[0].x + 200;
			x[1] = a[1].x + 200;
			x[2] = a[2].x + 200;
			x[3] = a[3].x + 200;
			y[0] = a[0].y + 200;
			y[1] = a[1].y + 200;
			y[2] = a[2].y + 200;
			y[3] = a[3].y + 200;
			g2d.setStroke(new BasicStroke(5));
			g.setColor(Color.BLACK);
			g.drawLine(a[0].x+200, a[0].y+200, a[1].x+200, a[1].y+200);
			g.drawLine(a[1].x+200, a[1].y+200, a[2].x+200, a[2].y+200);
			g.drawLine(a[2].x+200, a[2].y+200, a[3].x+200, a[3].y+200);
			g.drawLine(a[3].x+200, a[3].y+200, a[0].x+200, a[0].y+200);
			g2d.setStroke(b);
			g.setColor(Color.RED);
			g.fillPolygon(x,y,4);
		} 
		if(b_point == 1||b_point == 2||b_point == 5||b_point == 6){
			x[0] = a[2].x + 200;
			x[1] = a[1].x + 200;
			x[2] = a[5].x + 200;
			x[3] = a[6].x + 200;
			y[0] = a[2].y + 200;
			y[1] = a[1].y + 200;
			y[2] = a[5].y + 200;
			y[3] = a[6].y + 200;
			g2d.setStroke(new BasicStroke(5));
			g.setColor(Color.BLACK);
			g.drawLine(a[2].x+200, a[2].y+200, a[1].x+200, a[1].y+200);
			g.drawLine(a[1].x+200, a[1].y+200, a[5].x+200, a[5].y+200);
			g.drawLine(a[5].x+200, a[5].y+200, a[6].x+200, a[6].y+200);
			g.drawLine(a[6].x+200, a[6].y+200, a[2].x+200, a[2].y+200);
			g2d.setStroke(b);
			g.setColor(Color.ORANGE);
			g.fillPolygon(x,y,4);
		} 
		if(b_point == 2||b_point == 3||b_point == 6||b_point == 7){
			x[0] = a[3].x + 200;
			x[1] = a[2].x + 200;
			x[2] = a[6].x + 200;
			x[3] = a[7].x + 200;
			y[0] = a[3].y + 200;
			y[1] = a[2].y + 200;
			y[2] = a[6].y + 200;
			y[3] = a[7].y + 200;
			g2d.setStroke(new BasicStroke(5));
			g.setColor(Color.BLACK);
			g.drawLine(a[2].x+200, a[2].y+200, a[3].x+200, a[3].y+200);
			g.drawLine(a[2].x+200, a[2].y+200, a[6].x+200, a[6].y+200);
			g.drawLine(a[6].x+200, a[6].y+200, a[7].x+200, a[7].y+200);
			g.drawLine(a[3].x+200, a[3].y+200, a[7].x+200, a[7].y+200);
			g2d.setStroke(b);
			g.setColor(Color.PINK);
			g.fillPolygon(x,y,4);
		} 
		if(b_point == 0||b_point == 3||b_point == 4||b_point == 7){
			x[0] = a[3].x + 200;
			x[1] = a[0].x + 200;
			x[2] = a[4].x + 200;
			x[3] = a[7].x + 200;
			y[0] = a[3].y + 200;
			y[1] = a[0].y + 200;
			y[2] = a[4].y + 200;
			y[3] = a[7].y + 200;
			g2d.setStroke(new BasicStroke(5));
			g.setColor(Color.BLACK);
			g.drawLine(a[3].x+200, a[3].y+200, a[0].x+200, a[0].y+200);
			g.drawLine(a[0].x+200, a[0].y+200, a[4].x+200, a[4].y+200);
			g.drawLine(a[4].x+200, a[4].y+200, a[7].x+200, a[7].y+200);
			g.drawLine(a[7].x+200, a[7].y+200, a[3].x+200, a[3].y+200);
			g2d.setStroke(b);
			g.setColor(Color.YELLOW);
			g.fillPolygon(x,y,4);
		} 
		if(b_point == 0||b_point == 1||b_point == 4||b_point == 5){
			x[0] = a[1].x + 200;
			x[1] = a[0].x + 200;
			x[2] = a[4].x + 200;
			x[3] = a[5].x + 200;
			y[0] = a[1].y + 200;
			y[1] = a[0].y + 200;
			y[2] = a[4].y + 200;
			y[3] = a[5].y + 200;
			g2d.setStroke(new BasicStroke(5));
			g.setColor(Color.BLACK);
			g.drawLine(a[1].x+200, a[1].y+200, a[0].x+200, a[0].y+200);
			g.drawLine(a[0].x+200, a[0].y+200, a[4].x+200, a[4].y+200);
			g.drawLine(a[4].x+200, a[4].y+200, a[5].x+200, a[5].y+200);
			g.drawLine(a[5].x+200, a[5].y+200, a[1].x+200, a[1].y+200);
			g2d.setStroke(b);
			g.setColor(Color.BLUE);
			g.fillPolygon(x,y,4);
		} 
		if(b_point == 4||b_point == 5||b_point == 6||b_point == 7){
			x[0] = a[4].x + 200;
			x[1] = a[5].x + 200;
			x[2] = a[6].x + 200;
			x[3] = a[7].x + 200;
			y[0] = a[4].y + 200;
			y[1] = a[5].y + 200;
			y[2] = a[6].y + 200;
			y[3] = a[7].y + 200;
			g2d.setStroke(new BasicStroke(5));
			g.setColor(Color.BLACK);
			g.drawLine(a[4].x+200, a[4].y+200, a[5].x+200, a[5].y+200);
			g.drawLine(a[5].x+200, a[5].y+200, a[6].x+200, a[6].y+200);
			g.drawLine(a[6].x+200, a[6].y+200, a[7].x+200, a[7].y+200);
			g.drawLine(a[4].x+200, a[4].y+200, a[7].x+200, a[7].y+200);
			g2d.setStroke(b);
			g.setColor(Color.GREEN);
			g.fillPolygon(x,y,4);
		}
		
	}

	public void rotate_x(int x){
		//x*= -1;
		for(int i=0;i<8;i++){
			a[i].rotate_x(x);
		}
	}
	public void rotate_y(int y){
		//y*=-1;
		for(int i=0;i<8;i++){
			a[i].rotate_y(y);
		}
	}
	public void rotate_z(int z){
		//z*=-1;
		for(int i=0;i<8;i++){
			a[i].rotate_z(z);
		}
	}
	public int find_top(Point_3d a[],int n){
		int max = -1;
		int top = -1000;
		for(int i = 0; i<n;i++){
			if(a[i].z > top){
				max = i;
				top = a[i].z;
			}
		}
		return max;
	}
	public void init_point(Point_3d a[]){
		a[0].set(-50,-50,-50);
		a[1].set(50,-50,-50);
		a[2].set(50,50,-50);
		a[3].set(-50,50,-50);
		a[4].set(-50,-50,50);
		a[5].set(50,-50,50);
		a[6].set(50,50,50);
		a[7].set(-50,50,50);
	}
}



