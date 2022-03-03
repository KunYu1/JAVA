import java.awt.*;
import javax.swing.*;
import java.lang.*;

public class LAB04 extends JPanel {
	double[][] xy=new double [3][2];
	public LAB04(double[][] x){
		super();
		for(int i=0;i<3;i++){
			for(int j=0;j<2;j++){
				xy[i][j]=x[i][j];
			}
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int x1=(int)xy[0][0],x2=(int)xy[1][0],x3=(int)xy[2][0];
		int y1=(int)xy[0][1],y2=(int)xy[1][1],y3=(int)xy[2][1];
		
		int xo=(int)(((x1*x1+y1*y1)*y2+y3*(x2*x2+y2*y2)+(x3*x3+y3*y3)*y1-(x3*x3+y3*y3)*y2-(x2*x2+y2*y2)*y1-(x1*x1+y1*y1)*y3)/(2*(x1*y2+x2*y3+x3*y1-x3*y2-x2*y1-x1*y3)));
		int yo=(int)(((x1*x1+y1*y1)*x3+x1*(x2*x2+y2*y2)+(x3*x3+y3*y3)*x2-(x3*x3+y3*y3)*x1-(x2*x2+y2*y2)*x3-(x1*x1+y1*y1)*x2)/(2*(x1*y2+x2*y3+x3*y1-x3*y2-x2*y1-x1*y3)));
		/*double yDelta_a = xy[0][1] - xy[1][1];
		double xDelta_a = xy[0][0] - xy[1][0];
		double yDelta_b = xy[2][1] - xy[1][1];
		double xDelta_b = xy[2][0] - xy[1][0];
		
		double cx=0,cy=0;
		if(xDelta_a==0){
			double aSlope = xDelta_a/yDelta_a;
			double bSlope = xDelta_b/yDelta_b; 
			
			cx = (aSlope*bSlope*(xy[0][1] - xy[2][1]) + bSlope*(xy[0][0] + xy[1][0])- aSlope*(xy[1][0]+xy[2][0]) )/(2* (bSlope-aSlope) );
			
			cy =(xy[0][1]+xy[1][1])/2;
		}
		else {
			double aSlope = yDelta_a/xDelta_a;
			double bSlope = yDelta_b/xDelta_b; 
			cx = (aSlope*bSlope*(xy[0][1] - xy[2][1]) + bSlope*(xy[0][0] + xy[1][0])- aSlope*(xy[1][0]+xy[2][0]) )/(2* (bSlope-aSlope) );
			cy = -1*(cx - (xy[0][0]+xy[1][0])/2)/aSlope +  (xy[0][1]+xy[1][1])/2;
			double radius=Math.pow(Math.pow(cx-xy[0][0],2)+Math.pow(cy-xy[0][1],2),0.5);
		}*/
		
		
		double radius=Math.pow(Math.pow(xo-xy[0][0],2)+Math.pow(yo-xy[0][1],2),0.5);

		
		
		int cx=xo;
		int cy=yo;
		
		System.out.printf("The center is (%d,%d)%n",Math.round(xo),Math.round(xo));
		System.out.printf("%.2f  %.2f %.2f %n",Math.pow(Math.pow(xo-xy[0][0],2)+Math.pow(yo-xy[0][1],2),0.5),Math.pow(Math.pow(cx-xy[1][0],2)+Math.pow(cy-xy[1][1],2),0.5),Math.pow(Math.pow(cx-xy[2][0],2)+Math.pow(cy-xy[2][1],2),0.5));
		
		Graphics2D g2 = (Graphics2D) g; 
		g2.setStroke(new BasicStroke(5));
		
		int r=(int)Math.round(radius);
		
		g.setColor(new Color(0,0,255));
		g.drawArc((int)cx-r,(int)cy-r,2*r,2*r,0,360);
		
		double lo=r/Math.pow(2,0.5);
		int l=(int)lo;
		g.setColor(new Color(0,255,0));
		g.drawLine((int)cx-l,(int)cy-l,(int)cx+l,(int)cy-l);
		g.drawLine((int)cx-l,(int)cy-l,(int)cx-l,(int)cy+l);
		g.drawLine((int)cx+l,(int)cy+l,(int)cx+l,(int)cy-l);
		g.drawLine((int)cx+l,(int)cy+l,(int)cx-l,(int)cy+l);

		g.setColor(new Color(0,0,0));
		g.drawLine((int)xy[0][0]-2,(int)xy[0][1]-2,(int)xy[0][0]+2,(int)xy[0][1]+2);
		g.drawLine((int)xy[0][0]+2,(int)xy[0][1]-2,(int)xy[0][0]-2,(int)xy[0][1]+2);
		g.drawLine((int)xy[1][0]-2,(int)xy[1][1]-2,(int)xy[1][0]+2,(int)xy[1][1]+2);
		g.drawLine((int)xy[1][0]+2,(int)xy[1][1]-2,(int)xy[1][0]-2,(int)xy[1][1]+2);
		g.drawLine((int)xy[2][0]-2,(int)xy[2][1]-2,(int)xy[2][0]+2,(int)xy[2][1]+2);
		g.drawLine((int)xy[2][0]+2,(int)xy[2][1]-2,(int)xy[2][0]-2,(int)xy[2][1]+2);
		
  }
}
 