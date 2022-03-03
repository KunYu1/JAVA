import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.Group;

public class J4 extends Application{
	String extension;
	String s;
	String[] spl;
	public void init(){
		

		s=JOptionPane.showInputDialog("Enter filename:");
		
		spl=s.split("\\.");

	}
	public void start(Stage stage){
		Text text=new Text("The file extension is "+spl[1]);
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