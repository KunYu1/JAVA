import javax.swing.*;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.Group;

public class J3 extends Application{	
	
	int total;
	int[] cash=new int[5];
	int penny=0,niclel=0,dime=0,quarter=0;
	public void init(){
				
		String s1;
		
		s1=JOptionPane.showInputDialog("Enter price of item:(from 25 cents to one dollar, in 5-cent increments): ");
		
		total=Integer.parseInt(s1);
		
		int tmp=100-total;
		quarter=tmp/25;
		tmp%=25;
		
		dime=tmp/10;
		tmp%=10;
		
		niclel=tmp/5;
		tmp%=5;
		
		penny=tmp;
		
		cash[0]=total;
		cash[1]=quarter;
		cash[2]=dime;
		cash[3]=niclel;
		cash[4]=penny;
		
	}
	
	public void start(Stage stage){
		
		String[] s={"You bought an item for "+total+" cents and gave me one dollar.\r\n"+"So your change is\r\n",quarter+" quarter",dime+" dime",niclel+" niclel",penny+ " penny"};
		String s1=s[0]; 
		
		for(int i=1;i<5;i++){
			if(cash[i]!=0||cash[i]!=1){
				String tmp=s[i]+"s";
				s1+=tmp;
			}
			else{
				String tmp=s[i];
				s1+=tmp;
			}
			if(i!=4){
				s1+=",";
			}
			if(i==2||i==3){
				s1+="and";
			}
			s1+="\r\n";
		}
		
		Text text =new Text(s1);

		text.setX(50);
		text.setY(50);
		Group root=new Group(text);
		Scene scene=new Scene(root,400,300);
		
		stage.setTitle("HW in JAVAFX");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args){
		System.out.println("in main");
		launch(args);
		System.out.println("out main");
	}
}