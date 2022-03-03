import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Turtle extends JFrame{
	JTextField commandField,arrayField;
	JButton enterButton;
	JPanel toolPanel;
	JLabel showLabel;
	int[][] floor;
	int facing; //0: up, 1: right, 2: down, 3: left
	int currentX, currentY;
    boolean penDown;
	
	public Turtle(){
		commandField = new JTextField(5);
		arrayField = new JTextField(5);
        enterButton = new JButton("Confirm");
        toolPanel = new JPanel();
        showLabel = new JLabel("", JLabel.CENTER);
        showLabel.setVerticalAlignment(JLabel.TOP);
        showLabel.setFont(new Font("Courier", Font.BOLD, 15));
        floor = new int[20][20];

        toolPanel.add(commandField);
        toolPanel.add(arrayField);
        toolPanel.add(enterButton);

        add(toolPanel, BorderLayout.NORTH);
        add(showLabel, BorderLayout.CENTER);

		ButtonHandler handler = new ButtonHandler();
        enterButton.addActionListener(handler);

        // Starting at the top left corner, facing right
        facing = 1;
        currentX = 0;
        currentY = 0;
        penDown = false;

        showFloor();
    }
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			showFloor();
			
			if(event.getSource() == enterButton){
				int command = Integer.parseInt(commandField.getText());
				int steps = Integer.parseInt(arrayField.getText());
				switch (command) {
					case 1:
						penDown = false;
						break;
					case 2:
						floor[currentY][currentX] = 1;
						penDown = true;
						break;
					case 3:
						facing = (facing + 1) % 4;
						break;
					case 4:
						facing = (facing-1 < 0)? 3: facing-1;
						break;
					case 5:
						moveForward(steps);
						break;
					case 6:
					case 9:
				}
			}
			showFloor();
		}
	}
	
	private void moveForward(int steps) {
        switch (facing) {
            // Up
            case 0:
                if(currentY - steps >= 0) {
                    if(penDown) {
                        for(int i = 1; i <= steps; i++)
                            floor[currentY-i][currentX] = 1;
                    }
                    currentY = currentY - steps;;
                }
                break;
            // Right
            case 1:
                if(currentX + steps < 20) {
                    if(penDown) {
                        for(int i = 1; i <= steps; i++)
                            floor[currentY][currentX+i] = 1;
                    }
                    currentX = currentX + steps;
                }
                break;
            // Down
            case 2:
                if(currentY + steps < 20) {
                    if(penDown) {
                        for(int i = 1; i <= steps; i++)
                            floor[currentY+i][currentX] = 1;
                    }
                    currentY = currentY + steps;
                }
                break;
            // Left
            case 3:
                if(currentX - steps >= 0) {
                    if(penDown) {
                        for(int i = 1; i <= steps; i++)
                            floor[currentY][currentX-i] = 1;
                    }
                    currentX = currentX - steps;
                }
                break;
        }
    }	
	private void showFloor() {
        String output = "<html>";//開頭
        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < 20; j++) {
                if(i == currentY && j == currentX){
                    output += "#";
                    continue;
                }
                if(floor[i][j] == 1)
                    output += "*";
                else
                    output += "0";
            }
            output += "<br>";//換行
        }
        output += "</html>";//結尾
        showLabel.setText(output);
    }
}