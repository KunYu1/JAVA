import java.security.SecureRandom; 
import javafx.animation.KeyFrame; 
import javafx.animation.Timeline; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.fxml.FXML; 
import javafx.geometry.Bounds; 
import javafx.scene.layout.Pane; 
import javafx.scene.shape.Circle; 
import javafx.util.Duration; 
import javafx.animation.*;
import javafx.scene.paint.*;
import javafx.event.*; 
import javafx.fxml.FXML;
import javafx.scene.control.*;  
import javafx.scene.input.*; 
import javafx.scene.layout.*;
import javafx.scene.paint.*; 
import javafx.scene.shape.*;
import javafx.scene.image.*;
import javafx.animation.*;
import javafx.util.*;
import javafx.scene.*;
import javafx.fxml.Initializable;
import java.net.URL;
import java.io.File;
import javafx.beans.property.DoubleProperty;
import javafx.beans.binding.Bindings;
import java.util.ResourceBundle;
import javafx.stage.*;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.geometry.*;
import javafx.util.Duration;
import javafx.util.converter.DateTimeStringConverter;
import java.time.LocalDateTime;
import java.text.*;

public class SimpleGameController
{
    @FXML private Pane pane;
    @FXML private Label time;
    @FXML private ImageView img;
    @FXML private Button start;
	@FXML Circle c;

    //private DateFormat format;
    private Timeline timeline;
    private int second = 0;
    private int minute = 0;
    private int hour = 0;
    private int dx = 1;
    private int move = 10;
	
	private boolean startboo = false;
	
	AnimationTimer timer;
	long startTime ; // Problem3-3


    public void initialize ()
    {
        
        pane.setFocusTraversable(true); 
        pane.requestFocus();
        
    }

    @FXML
    void startButtonPressed (ActionEvent event)
    {
        start.setVisible(false);
        
		startboo = true;
						startTime = System.nanoTime();

		timer = new AnimationTimer(){
			
			
			@Override
			public void handle(long now){
				time.setText(String.format("%02d:%02d.%02d",((now-startTime)/1000000000)/60,((now-startTime)/1000000000)%60,((now-startTime)/10000000)%100));
			}
		};
			
		timer.start();
		 SecureRandom random = new SecureRandom();
		Timeline timelineAnimation = new Timeline(
         new KeyFrame(Duration.millis(10), 
            new EventHandler<ActionEvent>() {
               int dx = 1 + random.nextInt(3);
               int dy = 1 + random.nextInt(3);
      
               // move the circle by the dx and dy amounts
               @Override
               public void handle(final ActionEvent e) {
                  c.setLayoutX(c.getLayoutX() + dx);
                  c.setLayoutY(c.getLayoutY() + dy);
                  Bounds bounds = pane.getBoundsInLocal();
					
					if(hitimage()){
						dx *= -1;
					}
					
					
                  if (hitRightOrLeftEdge(bounds)) {
                     dx *= -1;
                  }

                  if (hitTopOrBottom(bounds)) {
                     dy *= -1;
                  }

               }
            }
         )
      );

      // indicate that the timeline animation should run indefinitely
      timelineAnimation.setCycleCount(Timeline.INDEFINITE);
      timelineAnimation.play();
		
        pane.setFocusTraversable(true); 
        pane.requestFocus();
        
    }

    @FXML
    void paneKeyPressed (KeyEvent e)
    {
		
		
		if(startboo){
			
			if ((e.getCode() == KeyCode.UP) || (e.getCode() == KeyCode.W))
			{
				if(img.getLayoutY()>5){
					System.out.println(String.valueOf(img.getLayoutY()));
					img.setLayoutY(img.getLayoutY() - move);
				}
			} 
	
			if ((e.getCode() == KeyCode.DOWN) || (e.getCode() == KeyCode.S))
			{
				if(img.getLayoutY()<pane.getHeight()-100){
					System.out.println(String.valueOf(img.getLayoutY()));
					System.out.println(String.valueOf(pane.getHeight()));
					img.setLayoutY(img.getLayoutY() + move);
				}
			} 
		
		}
    }
	
	
	
	private boolean hitimage(){
	
		return ((c.getLayoutY()-c.getRadius())<(img.getLayoutY()+img.getFitHeight()))&&((c.getLayoutY()+c.getRadius())>(img.getLayoutY()))&&(c.getLayoutX() >= (img.getLayoutX() - c.getRadius()));

		
		
	}
	private boolean hitRightOrLeftEdge(Bounds bounds) {
      return (c.getLayoutX() <= (bounds.getMinX() + c.getRadius())) ||
         (c.getLayoutX() >= (bounds.getMaxX() - c.getRadius()));
   }

   // determines whether the circle hit the top or bottom of the window
   private boolean hitTopOrBottom(Bounds bounds) {
      return (c.getLayoutY() <= (bounds.getMinY() + c.getRadius())) ||
         (c.getLayoutY() >= (bounds.getMaxY() - c.getRadius()));
   }

}