//javac --module-path $env:PATH_TO_FX --add-modules=javafx.controls,javafx.fxml *.java
//java --module-path $env:PATH_TO_FX --add-modules=javafx.controls,javafx.fxml Primdle
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Primdle extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("PrimdleScene.fxml"));	
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Primdle");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
