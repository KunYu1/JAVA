//javac --module-path $env:PATH_TO_FX --add-modules=javafx.controls *.java
//java --module-path $env:PATH_TO_FX --add-modules=javafx.controls HW2_3_1
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class HW2_3_1 extends Application {
  	@Override
  	public void start(Stage stage){

	  	Button button = new Button();
	  	button.setText("Draw Lines");
	  	Pane pane1 = new Pane();
	 	Pane pane2 = new Pane();
		pane2.setLayoutY(50);
	 	pane1.getChildren().add(button);		
		pane1.getChildren().add(pane2);
		
		Line line = new Line();
	 	for(int i=0;i<20;i++){
			line = new Line(0,0,640-i*32,i*21.5);
			pane2.getChildren().add(line);
		}

		button.setOnAction(new EventHandler<ActionEvent>(){
			Line line;
			@Override
			public void handle(ActionEvent event){
				for(int i=0;i<20;i++){
					
					line = new Line(640,430,640-i*32,i*21.5);
					pane2.getChildren().add(line);

					line = new Line(640,0,i*32,i*21.5);
					pane2.getChildren().add(line);

					line = new Line(0,430,i*32,i*21.5);
					pane2.getChildren().add(line);
				}	
			}
		});
	 	Scene scene = new Scene(pane1, 640, 480);
	 	stage.setTitle("Draw Lines");
	 	stage.setScene(scene);
	  	stage.show();
 	}
  
 	 public static void main(String[] args) {
	 	launch();
  	}
}