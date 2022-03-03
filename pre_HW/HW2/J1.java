import javax.swing.*;
import java.util.Scanner;

public class J1 {
	public static void main(String args[]){
		double pi=Math.PI;
		Scanner input=new Scanner(System.in);
		System.out.print("Please input interger radius :");
		int r=input.nextInt();
		System.out.printf("Diameter = %d\r\n",2*r);
		System.out.printf("Circumference = %f\r\n",2*r*pi);
		System.out.printf("Diameter = %f\r\n",pi*r*r);
	}
}