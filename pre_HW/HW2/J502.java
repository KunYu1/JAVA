import java.util.Scanner;
import java.lang.*;

public class J502{
	
	public static void main(String[] args){
		
		System.out.print("input 1 to Convert from rectangular from into polar form\r\ninput 2 to Convert from polar form into rectangular form  ");
		Scanner input=new Scanner(System.in);
		int in=input.nextInt();
		if(in==1){
				
			System.out.print("Enter rectangular from X (EG:iX+jY):\r\n");
			double x=input.nextDouble();
			System.out.print("Enter rectangular from Y (EG:iX+jY):\r\n");
			double y=input.nextDouble();
			
			double mag=Math.pow((Math.pow(x,2.0)+Math.pow(y,2.0)),0.5);
			double phase=Math.atan(x/y);
			
			System.out.printf("%f < %f%n",Math.ceil(mag*100)/100,Math.ceil(phase*18000/Math.PI)/100);
			
		}
		else if(in==2){
			
			System.out.print("Enter polar from magnitude:");
			double mag=input.nextDouble();
			System.out.print("EEnter polar from phase angle:");
			double phase=input.nextDouble();
			
			double x=mag*Math.cos(phase*Math.PI/180.0);
			double y=mag*Math.sin(phase*Math.PI/180.0);
			if(y>=0)
				System.out.printf("i%f+j%f%n",Math.ceil(x*1000)/1000,Math.ceil(y*1000)/1000);
			else
				System.out.printf("i%f-j%f%n",Math.ceil(x*1000)/1000,Math.ceil(y*1000)/1000);
				
		}
	}
}