import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.effect.*;
import javax.script.*;
import java.lang.*;
public class GraphController {
//varible you need
double xl = -250;
double xr = 250;
double yd = -250;
double yu = 250;
@FXML private TextField textfield;
@FXML private TextField xmin;
@FXML private TextField xmax;
@FXML private TextField ymin;
@FXML private TextField ymax;
@FXML private Polyline polyline;
@FXML private Line axisx;
@FXML private Line axisy;
@FXML private Label labelx;
@FXML private Label labely;

public void initialize() {
}
@FXML
private void onChangeSize(ActionEvent e) {
// change layouts of axis and labels.
	//double xl=-250,xr=250,yu=250,yd=-250;
	if(e.getSource() == xmin){
		xl = Double.parseDouble(xmin.getText());
		System.out.println("xmin changed "+xl);
		
	}
	if(e.getSource() == xmax){
		xr = Double.parseDouble(xmax.getText());
		System.out.println("xmax changed "+xr);
		
	}
	if(e.getSource() == ymin){
		yd = Double.parseDouble(ymin.getText());
		System.out.println("xmin changed "+yd);
		
	}
	if(e.getSource() == ymax){
		yu = Double.parseDouble(ymax.getText());
		System.out.println("xmin changed "+yu);
		
	}
	
	
	axisy.setStartX(0.0-xl*500.0/(xr-xl)); 
	axisy.setStartY(0.0); 
	axisy.setEndX(0.0-xl*500.0/(xr-xl)); 
	axisy.setEndY(500.0); 
	
	labely.setLayoutX(0.0-xl*500.0/(xr-xl));
	
	axisx.setStartX(0.0); 
	axisx.setStartY(yu*500/(yu-yd));
	axisx.setEndX(500.0); 
	axisx.setEndY(yu*500/(yu-yd)); 
	
	labelx.setLayoutY(yu*500/(yu-yd));
	
	
	ScriptEngineManager manager = new ScriptEngineManager();
	ScriptEngine engine = manager.getEngineByName("JavaScript");
	
	polyline.getPoints().clear();
	double x ,y=0;
	String fx = textfield.getText();
	fx = fx.replaceAll("sin","Math.sin");
	fx = fx.replaceAll("tan","Math.tan");
	fx = fx.replaceAll("sqrt","Math.sqrt");
	fx = fx.replaceAll("pow","Math.pow");
	fx = fx.replaceAll("log","Math.log");
	fx = fx.replaceAll("cos","Math.cos");
	fx = fx.replaceAll("abs","Math.abs");
	fx = fx.replaceAll("PI","Math.PI");
	fx = fx.replaceAll("E","Math.E");
	
	       
	
	try {

			System.out.println(fx);
			//y = (double)engine.get("y");
			for(int i=0;i<500;i++){
				x = (i*500/(xr-xl))+xl;
				engine.eval("x = ("+ x+")*1.0");
				engine.eval("y = ("+fx+")*1.0");
				y = (double)engine.get("y");
				if(y>=yu){
					y=yu;
					//continue;
				}
				else if(y<=yd){
					y=yd;
					//continue;
				}
				polyline.getPoints().addAll((x-xl)*500.0/(xr-xl),(yu-y)*(500/(yu-yd)));
				//yu*500/(yu-yd)
			}

			
			
	} catch (ScriptException ex) {
			y = 0;
	}
}
@FXML
	private void onActionTextfield(ActionEvent e) {
	// draw f(x) ...
		/*polyline.getPoints().clear();
		polyline.getPoints().addAll(123.456,111.666666);
		polyline.getPoints().addAll(200.0,200.0);
		polyline.getPoints().addAll(300.0,100.0);*/
	ScriptEngineManager manager = new ScriptEngineManager();
	ScriptEngine engine = manager.getEngineByName("JavaScript");
	double x ,y=0;
	String fx = textfield.getText();
	fx = fx.replaceAll("sin","Math.sin");
	fx = fx.replaceAll("tan","Math.tan");
	fx = fx.replaceAll("sqrt","Math.sqrt");
	fx = fx.replaceAll("pow","Math.pow");
	fx = fx.replaceAll("log","Math.log");
	fx = fx.replaceAll("cos","Math.cos");
	fx = fx.replaceAll("abs","Math.abs");
	fx = fx.replaceAll("PI","Math.PI");
	fx = fx.replaceAll("E","Math.E");
	
	       
	
	try {
		
			polyline.getPoints().clear();
			System.out.println(fx);
			for(int i=0;i<500;i++){
				x = i*(500/(xr-xl))+xl;
				engine.eval("x = ("+ x+")*1.0");
				engine.eval("y = ("+fx+")*1.0");
				y = (double)engine.get("y");
				if(y>=yu){
					y=yu;
					//continue;
				}
				else if(y<=yd){
					y=yd;
					//continue;
				}
				polyline.getPoints().addAll((x-xl)*(500.0/(xr-xl)),(yu-y)*(500/(yu-yd)));
				
			}
			//y = (double)engine.get("y");
			/*for(int i=0;i<500;i++){
				x = i-250;
				engine.eval("x = ("+ x+")*1.0");
				engine.eval("y = ("+fx+")*1.0");
				y = (double)engine.get("y");
				if(y>=250.0){
					y=250;
					//continue;
				}
				else if(y<=-250){
					y=-250;
					//continue;
				}
				polyline.getPoints().addAll(x+250,-1*y+250);
				
			}*/

			
			
	} catch (ScriptException ex) {
			y = 0;
	}

	}
}
/*
x*x*x/1000+x*x/10
100*cos(x/15-PI/4)+x
x*sin(x/5)*0.5
sqrt(abs(x))*10
pow(E,-pow(x/20,2)/10)*200
*/