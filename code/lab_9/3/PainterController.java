// Fig. 13.6: PainterController.java
// Controller for the Painter app
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.control.Slider;
import javafx.scene.shape.Line;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
public class PainterController {
    // instance variables that refer to GUI components

    @FXML private Pane drawingAreaPane;
    @FXML private ToggleGroup colorToggleGroup;
    @FXML private ToggleGroup sizeToggleGroup;
    @FXML private Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider sizeSlider;
    @FXML private Label redLabel;
    @FXML private Label greenLabel;
    @FXML private Label blueLabel;
    @FXML private Label sizeLabel;
    // instance variables for managing Painter state
    private Paint brushColor = Color.rgb(0,0,0); // drawing color
    private double x;
    private double y;
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double size = 1.0;
    // set user data for the RadioButtons
    public void initialize() {
        // user data on a control can be any Object
        redLabel.textProperty().bind(redSlider.valueProperty().asString("red :%.0f"));
        greenLabel.textProperty().bind(greenSlider.valueProperty().asString("green :%.0f"));
        blueLabel.textProperty().bind(blueSlider.valueProperty().asString("blue :%.0f"));
        sizeLabel.textProperty().bind(sizeSlider.valueProperty().asString("size :%.0f"));
        redSlider.valueProperty().addListener(
            new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> ov,
                Number oldValue, Number newValue) {
                    red = newValue.intValue();
                    brushColor = Color.rgb(red,green,blue);
                }
            }
        );
        greenSlider.valueProperty().addListener(
            new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> ov,
                Number oldValue, Number newValue) {
                    green = newValue.intValue();
                    brushColor = Color.rgb(red,green,blue);
                }
            }
        );
        blueSlider.valueProperty().addListener(
            new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> ov,
                Number oldValue, Number newValue) {
                    blue = newValue.intValue();
                    brushColor = Color.rgb(red,green,blue);
                }
            }
        );
        sizeSlider.valueProperty().addListener(
            new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue<? extends Number> ov,
                Number oldValue, Number newValue) {
                    size = newValue.doubleValue();
                }
            }
        );
    }

    // handles drawingArea's onMouseDragged MouseEvent
    @FXML
    private void drawingAreaMouseDragged(MouseEvent e) {
        Line newLine = new Line(x,y,e.getX(), e.getY());
        x = e.getX();
        y = e.getY();
        newLine.setStroke(brushColor);
        newLine.setStrokeWidth(size*2);
        drawingAreaPane.getChildren().add(newLine);
    }

    @FXML
    private void drawingAreaMousePressed(MouseEvent e) {
        Circle newCircle = new Circle(e.getX(), e.getY(),
        size, brushColor);
        drawingAreaPane.getChildren().add(newCircle);
        x = e.getX();
        y = e.getY();
    }

    // handles Undo Button's ActionEvents
    @FXML
    private void undoButtonPressed(ActionEvent event) {
        int count = drawingAreaPane.getChildren().size();
        // if there are any shapes remove the last one added
        if (count > 0) {
            drawingAreaPane.getChildren().remove(count - 1);
        }
    }

    // handles Clear Button's ActionEvents
    @FXML
    private void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear(); // clear the canvas
    }
}