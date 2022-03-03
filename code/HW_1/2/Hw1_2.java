import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Hw1_2 extends Application{
	
	int first, second, third;
	public static int smallest(int first, int second, int third) {
		return ((first>second)?((second>third)?third:second):((first>third)?third:first));
	}
	
	public static int largest(int first, int second, int third) {
		return ((first<second)?((second<third)?third:second):((first<third)?third:first));
	}	
	
	public void start(Stage stage){
		String x;
		x = JOptionPane.showInputDialog("Enter first integer:");
		first = Integer.parseInt(x);
		x = JOptionPane.showInputDialog("Enter second integer:");
		second = Integer.parseInt(x);
		x = JOptionPane.showInputDialog("Enter third integer:");
		third = Integer.parseInt(x);
		Label label = new Label("The sum is "+ (first+second+third)
								+ "\nThe averge is "+ (first+second+third)/3.0
								+ "\nThe product is "+(first*second*third)
								+ "\nThe smallest number is " + smallest(first, second, third)
								+ "\nThe largest number is " +largest(first, second, third));
		Scene scene = new Scene(new StackPane(label), 240, 240);
		stage.setTitle("Homework1 Problem2");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}