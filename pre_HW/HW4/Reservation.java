import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Reservation extends JFrame{
	
	JButton assignButton;
	JLabel[] seats;
	boolean[] seatState;
	boolean firstFull = false;
	boolean economyFull = false;
	
	public Reservation(){
		
		super("Airline Reservation System");
		
		seats = new JLabel[10];
		seatState = new boolean [10];
		assignButton = new JButton("assign");
		
		ButtonHandler handler = new ButtonHandler();
		assignButton.addActionListener(handler);
		
		for(int i = 0; i < 10; i++){
			seatState[i] = true;
			seats[i] = new JLabel(String.valueOf(i+1),SwingConstants.CENTER);
			seats[i].setOpaque(true);
			seats[i].setBackground(Color.green);
		}
		
		setLayout(new GridLayout(2,5));
		//GridLayout
		/*add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));
		add(new JLabel("Seat",SwingConstants.CENTER));*/
		
		for(int i = 0; i < 10; i++){
			//setLayout(new GridLayout(i*10,i/5+25));
			add(seats[i]);
		}
		
		add(assignButton);
	}
	
	private class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent event){
			String input = JOptionPane.showInputDialog("Please type 1 for First Class and type 2 for Economy.");
			int choose = Integer.parseInt(input);
			
			setSeats(choose);
		}
	}
	
	void setSeats(int choose){
		if(firstFull&&economyFull)
			JOptionPane.showMessageDialog(null,"Next flight leave in 3 hours");
		
		if(choose ==1){
			if(firstFull){
				int choice = JOptionPane.showConfirmDialog(null,"No more seat in First Class, how about Ecomomy Class?", "Seat sold out!!", JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION)
                    setSeats(2);
                else
                    JOptionPane.showMessageDialog(null, "Next flight leave in 3 hours");
            }
			else{
				for(int i = 0; i < 5; i++){
					if(seatState[i] == true){
						JOptionPane.showMessageDialog(null, String.format("Your seat number is %d in First Class", i+1));
                        seatState[i] = false;
                        seats[i].setBackground(Color.gray);
                        checkFull();
                        break;
					}
				}
			}
		}
		else if(choose == 2){
			if(economyFull){
				int choice = JOptionPane.showConfirmDialog(null,"No more seat in Ecomomy Class, how about First Class?", "Seat sold out!!", JOptionPane.YES_NO_OPTION);
			if(choice == JOptionPane.YES_OPTION)
                setSeats(1);
            else
                JOptionPane.showMessageDialog(null, "Next flight leave in 3 hours");
			}
			else{
				for(int i = 5; i < 10; i++){
					if(seatState[i] == true){
					JOptionPane.showMessageDialog(null, String.format("Your seat number is %d in Ecomomy Class", i+1));
					seatState[i] = false;
					seats[i].setBackground(Color.gray);
					checkFull();
					break;
					}
				}
			}
		}
	}
	
	void checkFull(){
		if(!seatState[4]) firstFull = true;
		if(!seatState[9]) economyFull = true;
	}
}
				
		