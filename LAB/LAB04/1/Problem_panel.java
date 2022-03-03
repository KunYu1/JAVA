import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Problem_panel extends JPanel{
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width=getWidth();
		int height=getHeight();
		
		
		
		
		int size = Problem_frame.size;
		int x[][] = new int [size][];
		for(int i=0;i<size;i++)
			x[i] = new int [i+1];
		
		
		
		for(int i=0;i<size;i++){
			x[i][0] = 1;
			x[i][i] = 1;
			for(int j=1;j<i;j++){
				x[i][j] = x[i-1][j] + x[i-1][j-1];
			}
		}
		int ii=0,jj=0;
	
		for(int[] row:x){
			for(int item:row){
				g.drawString(Integer.toString(item),jj*(width/size)+(size-ii)*(width/(2*size)),(size-ii-1)*(height/size));
				jj++;
			}
			jj=0;
			ii++;
		}
	}
}