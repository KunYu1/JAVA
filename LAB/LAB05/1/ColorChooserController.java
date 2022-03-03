// Fig. 13.9: ColorChooserController.java
// Controller for the ColorChooser app
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.text.NumberFormat;


public class ColorChooserController {
   // instance variables for interacting with GUI components
   @FXML private Slider redSlider;
   @FXML private Slider greenSlider;
   @FXML private Slider blueSlider;
   @FXML private Slider alphaSlider;
   @FXML private TextField redTextField;  
   @FXML private TextField greenTextField;
   @FXML private TextField blueTextField; 
   @FXML private TextField alphaTextField;
   @FXML private Rectangle colorRectangle;

   // instance variables for managing 
   private int red = 0;
   private int green = 0;
   private int blue = 0;
   private double alpha = 1.0;
   
   public void initialize() {
      // bind TextField values to corresponding Slider values
	  /*redTextField.textProperty().bindBidirectional(              
         redSlider.valueProperty());*/
      /*redTextField.textProperty().bind(              
         redSlider.valueProperty().asString("%.0f"));
      greenTextField.textProperty().bind(
         greenSlider.valueProperty().asString("%.0f"));
      blueTextField.textProperty().bind(
         blueSlider.valueProperty().asString("%.0f"));
      alphaTextField.textProperty().bind(
         alphaSlider.valueProperty().asString("%.2f"));*/
	  
	  // bind Slidervalues values to corresponding TextField 
	  /*redSlider.valueProperty().bind(              
         redTextField.textProperty());*/
	  
	/*NumberFormat fmt = NumberFormat.getInstance();
	fmt.setMaximumFractionDigits(2);
	// bind TextField values to corresponding Slider values
	redTextField.textProperty().bindBidirectional(redSlider.valueProperty(),NumberFormat.getIntegerInstance());
	greenTextField.textProperty().bindBidirectional(greenSlider.valueProperty(),NumberFormat.getIntegerInstance());
	blueTextField.textProperty().bindBidirectional(blueSlider.valueProperty(),NumberFormat.getIntegerInstance());
	alphaTextField.textProperty().bindBidirectional(alphaSlider.valueProperty(),fmt);*/
      
	  //listeners that set Rectangle's fill based on TextField changes
	redTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if(newValue.equals("")); 
			else if(Integer.parseInt(newValue)>256||Integer.parseInt(newValue)<0) {
				if(Integer.parseInt(newValue)>256){
					red = 255;
				}
				else red = 0;
			}
			else
				red = Integer.parseInt(newValue);  
			redTextField.setText(String.valueOf(red));
			redSlider.setValue(red);			
			colorRectangle.setFill(Color.rgb(red, green, blue, alpha));	

		}	
	);
	greenTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if(newValue.equals("")); 
			else if(Integer.parseInt(newValue)>256||Integer.parseInt(newValue)<0) {
				if(Integer.parseInt(newValue)>256){
					green = 255;
				}
				else green = 0;
			}
			else
				green = Integer.parseInt(newValue);  
			greenTextField.setText(String.valueOf(green));
			greenSlider.setValue(green);			
			colorRectangle.setFill(Color.rgb(red, green, blue, alpha));	

		}	
	);     
	blueTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if(newValue.equals("")); 
			else if(Integer.parseInt(newValue)>256||Integer.parseInt(newValue)<0) {
				if(Integer.parseInt(newValue)>256){
					blue = 255;
				}
				else blue = 0;
			}
			else
				blue = Integer.parseInt(newValue);  
			blueTextField.setText(String.valueOf(blue));
			blueSlider.setValue(blue);			
			colorRectangle.setFill(Color.rgb(red, green, blue, alpha));	

		}	
	); 
	alphaTextField.textProperty().addListener((observable, oldValue, newValue) -> {
			if(newValue.equals("")||newValue.equals("0")||newValue.equals("0.")||newValue.contains("..")||newValue.equals("1.0"));
			else{
				if(Double.parseDouble(newValue)>1.0||Double.parseDouble(newValue)<0) {
					if(Integer.parseInt(newValue)>1.0){
						alpha = 1.0;
					}
					else alpha = 0.0;
				}
				else
					alpha = Double.parseDouble(newValue);
				alphaTextField.setText(String.valueOf(alpha));
				alphaSlider.setValue(alpha);			
				colorRectangle.setFill(Color.rgb(red, green, blue, alpha));	
			}
		}
	); 
	
	  
      // listeners that set Rectangle's fill based on Slider changes
	  redSlider.valueProperty().addListener(                              
         new ChangeListener<Number>() {                                   
            @Override                                                     
            public void changed(ObservableValue<? extends Number> ov,     
				Number oldValue, Number newValue) {  
				red = newValue.intValue();    
				redTextField.setText(String.valueOf(red));
				colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
         }
      );                                                                  
      greenSlider.valueProperty().addListener(
         new ChangeListener<Number>() {                                   
            @Override                                                     
            public void changed(ObservableValue<? extends Number> ov,     
               Number oldValue, Number newValue) {                        
               green = newValue.intValue();
			   greenTextField.setText(String.valueOf(green));
               colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
         }
      );                                                                  
      blueSlider.valueProperty().addListener(
         new ChangeListener<Number>() {                                   
            @Override                                                     
            public void changed(ObservableValue<? extends Number> ov,     
               Number oldValue, Number newValue) {                        
               blue = newValue.intValue();
			   blueTextField.setText(String.valueOf(blue));
               colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
         }
      );                                                                  
      alphaSlider.valueProperty().addListener(
         new ChangeListener<Number>() {                                   
            @Override                                                     
            public void changed(ObservableValue<? extends Number> ov,     
               Number oldValue, Number newValue) {                        
               alpha = newValue.doubleValue();
			   alphaTextField.setText(String.valueOf(alpha));
               colorRectangle.setFill(Color.rgb(red, green, blue, alpha));
            }
         }
      );                                                                  
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
