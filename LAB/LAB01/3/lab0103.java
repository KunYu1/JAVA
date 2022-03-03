import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.text.Font;
import  javafx.scene.paint.Color;

public class lab0103 extends Application{
	
	public void start(Stage stage){
		String s1,s2,s3,s4,s5;
		int size;
		s1=JOptionPane.showInputDialog("Enter 1st text:");
		s2=JOptionPane.showInputDialog("Enter 2nd text:");
		s3=JOptionPane.showInputDialog("Enter 3rd text:");
		s4=JOptionPane.showInputDialog("Enter font size:");
		
		Text t1 = new Text(s1);
		Text t2 = new Text(s2);
		Text t3 = new Text(s3);
		size=Integer.parseInt(s4);
		
		t1.setFont(Font.font(size));
		t1.setFill(Color.RED);
		t2.setFont(Font.font(size));
		t2.setFill(Color.BLUE);
		t3.setFill(Color.GREEN);
		t3.setFont(Font.font(size));
		
		t2.setX(size);
		t2.setY(size+size);
		
		
		s5=JOptionPane.showInputDialog("Enter the arrangement style(|-/\\):");
		if(s5.equals("\\")){
			t1.setX(0);
			t1.setY(0+size);
			t3.setX(size*2);
			t3.setY(size*2+size);
			
		}
		else if(s5.equals("-")){
			t1.setX(0);
			t1.setY(size+size);
			t3.setX(size*2);
			t3.setY(size+size);
		}
		else if(s5.equals("|")){
			t1.setX(size);
			t1.setY(0+size);
			t3.setX(size);
			t3.setY(size*2+size);
		}
		else{
			t1.setX(size*2);
			t1.setY(0+size);
			t3.setX(0);
			t3.setY(size*2+size);
		}
		
		
		Group root=new Group(t1,t2,t3);
		Scene scene=new Scene(root,size*3,size*3);
		
		stage.setTitle("LAB in JAVAFX");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args){
		System.out.println("in main");
		launch(args);
		System.out.println("out main");
	}
}