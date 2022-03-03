// TimelineAnimationController.java
// Bounce a circle around a window using a Timeline animation. 
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
import javafx.scene.input.MouseEvent;
import javafx.animation.*;
import javafx.scene.paint.*;

public class TimelineAnimationController {
   @FXML Circle c;
   @FXML Pane pane;
   
   private FillTransition fill;
   
   public void initialize() {
      SecureRandom random = new SecureRandom();
 
	  
      // define a timeline animation
      Timeline timelineAnimation = new Timeline(
         new KeyFrame(Duration.millis(10), 
            new EventHandler<ActionEvent>() {
               int dx = 1 + random.nextInt(5);
               int dy = 1 + random.nextInt(5);
      
               // move the circle by the dx and dy amounts
               @Override
               public void handle(final ActionEvent e) {
                  c.setLayoutX(c.getLayoutX() + dx);
                  c.setLayoutY(c.getLayoutY() + dy);
                  Bounds bounds = pane.getBoundsInLocal();
					
					
					
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
   }
   
   @FXML
   private void mouseclicked(MouseEvent event){   
		
		SecureRandom random = new SecureRandom();
	    					
		int r = random.nextInt(255);
		int g = random.nextInt(255);
		int b = random.nextInt(255);
		double a = random.nextDouble();
		
		FillTransition fillTransition = new FillTransition(Duration.seconds(1)); 
		fillTransition.setToValue(Color.rgb(r,g,b,a)); 
		fillTransition.setCycleCount(1); 
		fillTransition.setAutoReverse(true); 
		
		// transition that applies a sequence of transitions to a node 
		fillTransition.setShape(c);
		fillTransition.play();
   
		System.out.println("clicked");
		
		
   }
   
   // determines whether the circle hit the left or right of the window
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

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
