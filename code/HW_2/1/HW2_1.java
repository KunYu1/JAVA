//javac --module-path $env:PATH_TO_FX --add-modules=javafx.controls,javafx.fxml .\HW2_1.java
//java --module-path $env:PATH_TO_FX --add-modules=javafx.controls,javafx.fxml HW2_1
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HW2_1 extends Application {
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}