//javac --module-path $env:PATH_TO_FX --add-modules=javafx.controls .\HW4_3_1_2.java
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.control.Button;

public class HW4_3_1_1 extends Application{
    int i = 10;
    @Override
    public void start(Stage stage){
        stage.setTitle("Draw Arcs");
        Button button = new Button();
        button.setText("Draw Arcs");
        button.setTranslateX(0);
        button.setTranslateY(0);        
        Canvas canvas = new Canvas(600, 650);
        Group group = new Group();
        Scene scene = new Scene(group, 600,650);
        group.getChildren().add(canvas);
        group.getChildren().add(button);
        button.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                GraphicsContext g = canvas.getGraphicsContext2D();
                int w = 600/2;
                int h = 600/2;
                int w_d = w/5;
                int h_d = h/5;
                g.setStroke(Color.RED);
                for(int i = 1;i<20;i+=2){
                    g.strokeLine(w, h+50, w, h+h_d*i+50);
                    h = h+h_d*i;
                    g.strokeLine(w, h+50, w-w_d*i, h+50);
                    w = w-w_d*i;
                    g.strokeLine(w, h+50, w, h-h_d*(i+1)+50);
                    h = h-h_d*(i+1);
                    g.strokeLine(w, h+50, w+w_d*(i+1), h+50);
                    w = w+w_d*(i+1);                       
                }
            }
        });
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    } 
}