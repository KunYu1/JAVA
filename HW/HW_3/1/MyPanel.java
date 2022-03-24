
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MyPanel extends JPanel{
	int a[] =new int [100];
	int n;
	public MyPanel(int input[],int i) {
		a = input;
		n = i;
		JButton button  = new JButton("Sort");
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent event){
				sort();
			}
		});
		add(button);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);		
		int width = getWidth();
		int height = getHeight();
		for(int i = 0; i<n; i++){
			g.drawRect(width*i/n,height-5*a[i],width/n,5*a[i]);	
			//System.out.println(width*i/n+" "+(height-a[i])+" "+width/n+" "+a[i]);
		}	
	}
	private void sort(){
		int temp;
		for(int i=n-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(a[i]<a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		repaint();
	}
}


