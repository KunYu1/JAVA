import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloFXController {
	@FXML
	Button button1;
	@FXML
	Label label1;
	@FXML
	TextField textfield1;
	
	public void initialize() {
		label1.setText("Empty");
	}
	
	@FXML
	public void onButton1Click() {
		label1.setText(textfield1.getText());
	}
}