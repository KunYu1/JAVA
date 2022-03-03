import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.Group;

public class lab0102 extends Application{

	public double Min(double x,double y,double z){
		double tmp;
		if(x>y)
			tmp=y;
		else
			tmp=x;
		if(tmp>z) return z;
		else return tmp;
	}
	public double Max(double x,double y,double z){
		double tmp;
		if(x>y)
			tmp=x;
		else
			tmp=y;
		if(tmp<z) return z;
		else return tmp;
	}
	public double Sum(double x,double y,double z){
		return x+y+z;
	}
	public double Average(double x,double y,double z){
		return (x+y+z)/3.0;
	}
	public double Product(double x,double y,double z){
		return x*y*z;
	}
	public void start(Stage stage){
		double x, y, z;
		String s1,s2,s3;
		
		s1=JOptionPane.showInputDialog("Enter first integer:");
		s2=JOptionPane.showInputDialog("Enter second integer:");
		s3=JOptionPane.showInputDialog("Enter third integer:");
		
		x=Double.parseDouble(s1);
		y=Double.parseDouble(s2);
		z=Double.parseDouble(s3);
		
		
		Text text=new Text("SUM="+Sum(x,y,z)+"\r\n"+"AVRAGE="+Average(x,y,z)+"\r\n"+"PROUDUCT="+Product(x,y,z)+"\r\n"+"SMALLEST="+Min(x,y,z)+"\r\n"+"LARGEST="+Max(x,y,z));
		text.setX(50);
		text.setY(50);
		Group root=new Group(text);
		Scene scene=new Scene(root,400,300);
		
		stage.setTitle("LAB1 in JAVAFX");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args){
		System.out.println("in main");
		launch(args);
		System.out.println("out main");
	}
}