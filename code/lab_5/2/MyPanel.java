
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.lang.InterruptedException;
public class MyPanel extends JPanel{
	int a[] =new int [100];
	int n;
	int first;
	int second;
	int had;
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
		first=-1;
		had = n;
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);		
		int width = getWidth();
		int height = getHeight();
		for(int i = 0; i<n; i++){
			if(i>had){
				g.setColor(Color.GREEN);
				g.fillRect(width*i/n,height-5*a[i],width/n,5*a[i]);
			} else if(i == first){
				g.setColor(Color.RED);
				g.fillRect(width*i/n,height-5*a[i],width/n,5*a[i]);	
			} else{
				g.setColor(Color.BLACK);
				g.drawRect(width*i/n,height-5*a[i],width/n,5*a[i]);
			}

		}	
	}
	private void sort(){
		int temp;
		for(int i=n-1;i>=0;i--){
			had--;
			if(i==1){
				first = 1;
				try{Thread.sleep(500/n);}
				catch(InterruptedException e){}
				paintImmediately(0,0,1000,500);
				if(a[1]<a[0]){
					temp = a[0];
					a[0] = a[1];
					a[1] = temp;
				}
				first = 2;
				try{Thread.sleep(500/n);}
				catch(InterruptedException e){}
				paintImmediately(0,0,1000,500);
				continue;
			}
			if(i==0){
				first = 1;
				try{Thread.sleep(500/n);}
				catch(InterruptedException e){}
				paintImmediately(0,0,1000,500);
				first=-1;
				had--;
				try{Thread.sleep(500/n);}
				catch(InterruptedException e){}
				paintImmediately(0,0,1000,500);
				break;
			}
			for(int j=0;j<i;j++){
				first = j;
				try{Thread.sleep(500/n);}
				catch(InterruptedException e){}
				paintImmediately(0,0,1000,500);
				if(a[j+1]<a[j]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}


