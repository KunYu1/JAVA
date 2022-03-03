import java.util.Scanner;
import java.util.*;
import javax.swing.*;

public class HW302{
	public static void main(String[] args){
		List <Double> x= new ArrayList<>();
		List <Double> y= new ArrayList<>();
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a set of points nextline to stop entering :\r\n");
		String in=input.nextLine();
		
		in=in.replaceAll("\\)","");
		in=in.replaceAll("\\(","");
		String[] points=in.split(",");
		
		for(int i=0;i<points.length;i++){
			//System.out.print(String.valueOf(Double.parseDouble(points[i]))+"\r\n");
			x.add(Double.parseDouble(points[i++]));
			y.add(Double.parseDouble(points[i]));
		}
		
		double min=Math.pow(x.get(0)-x.get(1),2)+Math.pow(y.get(0)-y.get(1),2);
		int point1=0,point2=1;
		//System.out.print(String.valueOf(min)+"\r\n");
		
		for(int i=0;i<x.size();i++){
			for(int j=i+1;j<x.size();j++){
				if((Math.pow(x.get(i)-x.get(j),2)+Math.pow(y.get(i)-y.get(j),2))<min){
					min=Math.pow(x.get(i)-x.get(j),2)+Math.pow(y.get(i)-y.get(j),2);
					point1=i;
					point2=j;
				}
			}
		}
		
		System.out.printf("(%.2f,%.2f),(%.2f,%.2f),\r\n",x.get(point1),y.get(point1),x.get(point2),y.get(point2));
			
	}
}