import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javafx.event.ActionEvent;
import java.util.Random; 

public class PrimdleController {
	
	@FXML GridPane guessGrid;
	@FXML Label hintLabel, ansLabel;
    @FXML TextField inputTextField;
    @FXML Button startButton;
    private int ans = 0;
    private int now_num = 0;
    private int row_num = 0;
    private int guess_num = 0;
    Label labels[];     // delete it if you want to drag it on scene builder

	public void initialize() {
        labels = new Label[30];
        // initialize some variable
        for(int i = 0;i<30;i++){
            labels[i] = new Label("");
            labels[i].setFont(new Font("Arial", 15));
        }

        for(int i=0;i<5;i++)
            for(int j=0;j<6;j++)
                guessGrid.setConstraints(labels[j*5+i], i, j);
        guessGrid.getChildren().addAll(labels);
	}

    @FXML
    private void startButtonClicked(ActionEvent e){
        // to see if there is number in inputTextField as answer
        // or you should random the number as answer
        Random rand = new Random();
        if(inputTextField.getText().equals(""))
            ans = rand.nextInt(90000)+10000;
        else
            ans = Integer.parseInt(inputTextField.getText());
        ansLabel.setText(String.valueOf(ans));
        inputTextField.setText("");

        // start the game and set hintLabel
        startButton.setDisable(true);
        hintLabel.setText("There are "+ factorNumber(ans) +" prime factors.");
        for(int i = 0;i<30;i++){
            labels[i].setText("");
            labels[i].setTextFill(Color.BLACK);
        }
        guess_num=0;
        now_num=0;
        row_num=0;
    }

    @FXML
    private void numberButtonClicked(ActionEvent e){
        // set the text of label on guessGrid
        if(now_num<5){
            String str = ((Button)e.getSource()).getText();
            labels[row_num*5+now_num].setText(str);
            guess_num = guess_num*10+Integer.parseInt(str);
            System.out.print(guess_num);
            now_num++;
        }
    }

    @FXML
    private void deleteButtonClicked(ActionEvent e){
        // delete the text of label on guessGrid
        if(now_num>0){
            labels[row_num*5+now_num-1].setText("");
            guess_num /=10;
            System.out.print(guess_num);
            now_num--;
        }
    }

    @FXML
    private void enterButtonClicked(ActionEvent e){
        // see if the number is whole
        // get the value of guessGrid and color the text according to the answer
        String ans_str = String.valueOf(ans);
        String guess_str = String.valueOf(guess_num);
        int check[] = new int[5];
        int check_d[] = new int[5];
        if(now_num != 5||factorNumber(guess_num)!=factorNumber(ans))
            return;
        for(int i=0;i<5;i++){
            check[i]=0;
            check_d[i]=0;            
        }
        for(int i=0;i<5;i++){
            if(ans_str.substring(i, i+1).equals(guess_str.substring(i, i+1))){
                labels[row_num*5+i].setTextFill(Color.GREEN);
                check[i]=1;
                check_d[i]=1;
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(check_d[j]==0&&check[i]==0&&ans_str.substring(j, j+1).equals(guess_str.substring(i, i+1))){
                    labels[row_num*5+i].setTextFill(Color.YELLOW);
                    check[i]=1;
                    check_d[j]=1;
                }  
            }
        }
        if(guess_num == ans ){
            startButton.setDisable(false);
            hintLabel.setText("Congratuations !!!");
            guess_num=0;
            now_num=0;
            row_num=0;
        } else{
            row_num++;
            guess_num=0;
            now_num=0;
        }

    }

    private int factorNumber(int x){    // delete if you have other approach
        // to see how many prime factors of x
        int count = 0;
        if(x%2==0)
            count++;
        while(x%2==0){
            x = x/2;
        }
        for(int i = 3;i*i<=x;i+=2){
            if(x%i==0)
                count++;
            while(x%i==0){
                x = x/i;
            }
        }
        if(x>2)
            count++;
        return count;
    }
}
