import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.text.Font;

public class TextDisplay extends Application{
	public void start(Stage stage) {
		int window, f;
		String t, w_size, f_size, d_type;
		t = JOptionPane.showInputDialog("ENTER SHOW MESSAGE(3 WORDS)");
		w_size = JOptionPane.showInputDialog("Enter window size");
		f_size = JOptionPane.showInputDialog("Enter font size");
		d_type = JOptionPane.showInputDialog("Enter display type(/|\\)");
		window = Integer.parseInt(w_size);
		f = Integer.parseInt(f_size);
		Text a = new Text(t.substring(0,1));
		Text b = new Text(t.substring(1,2));
		Text c = new Text( t.substring(2,3));
		if(d_type.equals("\\")) {
			a.setX(0+50);
			a.setY(0+50);
			b.setX(window/3+50);
			b.setY(window/3+50);
			c.setX(window*2/3+50);
			c.setY(window*2/3+50);
		} else if(d_type.equals("|")) {
			a.setX(window/3+50);
			a.setY(0+50);
			b.setX(window/3+50);
			b.setY(window/3+50);
			c.setX(window/3+50);
			c.setY(window*2/3+50);
		} else if(d_type.equals("/")) {
			a.setX(window*2/3+50);
			a.setY(0+50);
			b.setX(window/3+50);
			b.setY(window/3+50);
			c.setX(0+50);
			c.setY(window*2/3+50);
		}
		a.setFont(Font.font(f));
		b.setFont(Font.font(f));
		c.setFont(Font.font(f));
		a.setFill(Color.RED);
		b.setFill(Color.GREEN);
		c.setFill(Color.BLUE);		
		Group root = new Group(a, b, c);
		Scene scene = new Scene(root, window, window);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}