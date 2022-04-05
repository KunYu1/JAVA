import java.math.*;
public class Point_3d{
	int x;
	int y;
	int z;
	Point_3d(){

	}
	public void set(int a,int b,int c){
		x=a;
		y=b;
		z=c;
	}
	public void rotate_x(double t){
		double xx;
		double yy;
		double zz;
		xx = x;
		yy = Math.cos((t*2*Math.PI)/360.0)*(double)y-Math.sin((t*2*Math.PI)/360.0)*(double)z; 
		zz = Math.sin((t*2*Math.PI)/360.0)*(double)y+Math.cos((t*2*Math.PI)/360.0)*(double)z; 
		x=(int)xx;
		y=(int)yy;
		z=(int)zz;
	}
	public void rotate_y(double t){
		double xx;
		double yy;
		double zz;
		xx = Math.cos((t*2*Math.PI)/360.0)*(double)x+Math.sin((t*2*Math.PI)/360.0)*(double)z;
		yy = y; 
		zz = -Math.sin((t*2*Math.PI)/360.0)*(double)x+Math.cos((t*2*Math.PI)/360.0)*(double)z; 
		x=(int)xx;
		y=(int)yy;
		z=(int)zz;
	}
	public void rotate_z(double t){
		double xx;
		double yy;
		double zz;
		xx = Math.cos((t*2*Math.PI)/360.0)*(double)x-Math.sin((t*2*Math.PI)/360.0)*(double)y;
		yy = Math.sin((t*2*Math.PI)/360.0)*(double)x+Math.cos((t*2*Math.PI)/360.0)*(double)y; 
		zz = z; 
		x=(int)xx;
		y=(int)yy;
		z=(int)zz;
	}
}