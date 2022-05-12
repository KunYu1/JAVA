import java.security.SecureRandom;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.scene.paint.Color;
public class BallAnimationTimerController {
    @FXML private Circle c;
    @FXML private Pane pane;
    private int flag =0 ;
    public void initialize() {
        SecureRandom random = new SecureRandom();

        // define a timeline animation
        AnimationTimer timer = new AnimationTimer() {
            //int dx = 1 + random.nextInt(5);
            int dy = 1;
            int velocity = 0; // used to scale distance changes
            long previousTime = System.nanoTime(); // time since app launch
            // specify how to move Circle for current animation frame
            @Override
            public void handle(long now) {
                double elapsedTime = (now - previousTime) / 1000000000.0;
                previousTime = now;
                velocity +=10;
                double scale = elapsedTime * velocity;
                Bounds bounds = pane.getBoundsInLocal();
                //c.setLayoutX(c.getLayoutX() + dx * scale);
                c.setLayoutY(c.getLayoutY() + dy * scale);
                // if (hitRightOrLeftEdge(bounds)) {
                //     dx *= -1;
                // }
                if (hitTopOrBottom(bounds)) {
                    velocity*=-1;
                    flag++;
                    flag %= 3;
                    System.out.println(flag);
                    switch(flag){
                        case  0:
                            c.setFill(Color.BLUE);
                            break;
                        case  1:
                            c.setFill(Color.GREEN);
                            break;
                        case  2:
                            c.setFill(Color.RED);
                            break;
                    }

                    
                }
            }
        };
    
        timer.start();
    }
    // determines whether the circle hit left/right of the window
    // private boolean hitRightOrLeftEdge(Bounds bounds) {
    //     return (c.getLayoutX() <= (bounds.getMinX() + c.getRadius())) || (c.getLayoutX() >= (bounds.getMaxX() - c.getRadius()));
    // }
        // determines whether the circle hit top/bottom of the window
    private boolean hitTopOrBottom(Bounds bounds) {
        return (c.getLayoutY() <= (bounds.getMinY() + c.getRadius())) || (c.getLayoutY() >= (bounds.getMaxY() - c.getRadius()));
    }
}