import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class HelloFX extends Application {
	
	@Override
	public void start(Stage stage){
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label label = new Label("Hello, JavaFX" + javafxVersion + ", running on Java " + javaVersion + ".");
		label.setTextFill(Color.web("#ff0000"));
		//Label label = new Label("123123123123");
		Scene scene = new Scene(new StackPane(label), 640, 480);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}