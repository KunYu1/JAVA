import java.math.*;
public class Point_3d{
	int x;
	int y;
	int z;
	Point_3d(int a,int b,int c){
		x=a;
		y=b;
		z=c;
	}
	public void set(int a,int b,int c){
		x=a;
		y=b;
		z=c;
	}
	public void rotate_x(int t){
		double xx;
		double yy;
		double zz;
		xx = x;
		yy = Math.cos((t/360.0)*2*Math.PI)*y+Math.sin((t/360.0)*2*Math.PI)*z; 
		zz = -Math.sin((t/360.0)*2*Math.PI)*y+Math.cos((t/360.0)*2*Math.PI)*z; 
		x=(int)xx;
		y=(int)yy;
		z=(int)zz;
	}
	public void rotate_y(int t){
		double xx;
		double yy;
		double zz;
		xx = Math.cos((t/360.0)*2*Math.PI)*x-Math.sin((t/360.0)*2*Math.PI)*z;
		yy = y; 
		zz = -Math.sin((t/360.0)*2*Math.PI)*x+Math.cos((t/360.0)*2*Math.PI)*z; 
		x=(int)xx;
		y=(int)yy;
		z=(int)zz;
	}
	public void rotate_z(int t){
		double xx;
		double yy;
		double zz;
		xx = Math.cos((t/360.0)*2*Math.PI)*x+Math.sin((t/360.0)*2*Math.PI)*y;
		yy = -Math.sin((t/360.0)*2*Math.PI)*x+Math.cos((t/360.0)*2*Math.PI)*y; 
		zz = z; 
		x=(int)xx;
		y=(int)yy;
		z=(int)zz;
	}
}