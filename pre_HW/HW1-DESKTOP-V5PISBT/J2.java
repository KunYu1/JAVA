import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.Group;

//case1
/*public class J2 extends Application{
	int sum,product,smallest,largest,tmp;
	double average;
	public void init(){
		
		int x,y,z;
		String s1,s2,s3;
		
		s1=JOptionPane.showInputDialog("Enter first integer:");
		s2=JOptionPane.showInputDialog("Enter second integer:");
		s3=JOptionPane.showInputDialog("Enter third integer:");
		
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=Integer.parseInt(s3);
		
		sum=x+y+z;
		average=sum/3.0;
		product=x*y*z;
		
		tmp=Math.min(x,y);
		smallest=Math.min(tmp,z);
		
		tmp=Math.max(x,y);
		largest=Math.max(tmp,z);
		
		
	}
	
	public void start(Stage stage){
		Text text =new Text("SUM="+sum+"\r\n"+"AVRAGE="+average+"\r\n"+"PROUDUCT="+product+"\r\n"+"SMALLEST="+smallest+"\r\n"+"LARGEST="+largest);
		text.setX(50);
		text.setY(50);
		Group root=new Group(text);
		Scene scene=new Scene(root,400,300);
		
		stage.setTitle("HW in JAVAFX");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args){
		System.out.println("in main");
		launch(args);
		System.out.println("out main");
	}
}*/

//case2
public class J2 extends Application{	
	int x,y,z;
	int sum,product,smallest,largest,tmp;
	double average;
	public void init(){
		
		
		String s1,s2,s3;
		
		s1=JOptionPane.showInputDialog("Enter first integer:");
		s2=JOptionPane.showInputDialog("Enter second integer:");
		s3=JOptionPane.showInputDialog("Enter third integer:");
		
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=Integer.parseInt(s3);
		
		sum=x+y+z;
		average=sum/3.0;
		product=x*y*z;
	}
	public void Min(){
		tmp=Math.min(x,y);
		smallest=Math.min(tmp,z);
	}
	public void Max(){
		tmp=Math.max(x,y);
		largest=Math.max(tmp,z);
	}
	
	public void start(Stage stage){
				
		Min();
		Max();
		
		Text text =new Text("SUM="+sum+"\r\n"+"AVRAGE="+average+"\r\n"+"PROUDUCT="+product+"\r\n"+"SMALLEST="+smallest+"\r\n"+"LARGEST="+largest);
		text.setX(50);
		text.setY(50);
		Group root=new Group(text);
		Scene scene=new Scene(root,400,300);
		
		stage.setTitle("HW in JAVAFX");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args){
		System.out.println("in main");
		launch(args);
		System.out.println("out main");
	}
}