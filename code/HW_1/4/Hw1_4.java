import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Hw1_4 extends Application{
		
	public void start(Stage stage){
		String x;
		x = JOptionPane.showInputDialog("Enter a file name:");
		String x_sp[] = x.split("\\.");
		Label label = new Label("file extension: " + x_sp[x_sp.length-1]);
		Scene scene = new Scene(new StackPane(label), 240, 240);
		stage.setTitle("Homework1 Problem2");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}