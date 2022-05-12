import java.security.SecureRandom;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
public class TimelineAnimationController {
    @FXML Circle c1;
    @FXML Circle c2;
    @FXML Pane pane;
    @FXML Text text;
    double pastX, pastY;
    double X, Y;
    double offsetX;
    double offsetY;
    int flag =0;
    int v =1;
    int start_x =0;
    int count =200;
    Timeline timelineAnimation;
    String x[] = {"Dog","Cat","Turtle","Mouse"};
    @FXML
    private void circleOnMousePressed(MouseEvent t) {
        pastX = t.getSceneX();
        pastY = t.getSceneY();
        X = ((Circle)(t.getSource())).getLayoutX();
        Y = ((Circle)(t.getSource())).getLayoutY();
        offsetX = pastX-X;
        offsetY = pastY-Y;
        text.setLayoutX(t.getSceneX()-offsetX);
        text.setLayoutY(t.getSceneY()-offsetY-40);
        start_x =1;
        v=1;
    }

    @FXML
    private void circleOnMouseDragged(MouseEvent t) {
        ((Circle)(t.getSource())).setLayoutX(t.getSceneX()-offsetX);
        ((Circle)(t.getSource())).setLayoutY(t.getSceneY()-offsetY);
        text.setLayoutX(t.getSceneX()-offsetX);
        text.setLayoutY(t.getSceneY()-offsetY-40);
      
    }
    @FXML
    private void circleOnMouseReleased(MouseEvent t) {
        start_x =0;
        v =10;
        count=0;
    }
    public void initialize() {
        // define a timeline animation
        timelineAnimation = new Timeline(
        new KeyFrame(Duration.millis(50),
        new EventHandler<ActionEvent>() {
            // move the circle by the dx and dy amounts
            @Override
            public void handle(final ActionEvent e) {
                if(start_x==1||count%v==0&&count<50){
                    text.setText(x[flag]);
                    flag++;
                    flag%=4;
                }
                count++;


            }
        }));
        // indicate that the timeline animation should run indefinitely
        timelineAnimation.setCycleCount(Timeline.INDEFINITE);
        timelineAnimation.play();
    }

}