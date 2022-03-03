import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Sierp extends JFrame implements ActionListener 
{  
	private JTextField input = new JTextField("0",5);
	private SierpPanel sp = new SierpPanel();
	public JButton upButton,downButton;
  
	public Sierp ( ) {
		JPanel  pl =  new JPanel();
		//pl.add(new JLabel("Enter an order: "));
		pl.add(new JLabel("Order: "));
		
		input.setEditable(false);
		pl.add(input);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		
		upButton=new JButton("+");
		upButton.addActionListener(this);
		pl.add(upButton);
		
		downButton=new JButton("-");
		downButton.addActionListener(this);
		pl.add(downButton);
		
     	add(sp);
    	add(pl, BorderLayout.SOUTH);
    	input.addActionListener(this);
   }
   public void actionPerformed( ActionEvent event ){
		JButton thisbutton=(JButton) event.getSource();
		if(thisbutton==upButton){
			String str=input.getText();
			int num=Integer.parseInt(str);
			str=String.valueOf(num+1);
			input.setText("");
			input.setText(str);
		}
		else if(thisbutton==downButton){
			String str=input.getText();
			//str=str.toLowerCase();
			int num=Integer.parseInt(str);
			if(num>1){
				str=String.valueOf(num-1);
				input.setText("");
				input.setText(str);
			}
		}
		sp.setOrder(Integer.parseInt(input.getText()));
   }
   public static void main( String args[] ) // execute application
   {   JFrame w = new Sierp();
       w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       w.setSize( 500, 500 );
       w.setVisible( true );
   }
}

class SierpPanel extends JPanel {
	private int order = 0;
	public void setOrder(int order){ 
	    
		this.order = order;
		repaint();
	}
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    Point p1 = new Point(getWidth()/2, 10);
	    Point p2 = new Point(10, getHeight()-10);
	    Point p3 = new Point(getWidth()-10, getHeight()-10);
		display(g, order, p1, p2, p3);
    }
                    
    private void display(Graphics g, int order, Point p1, Point p2, Point p3){
        if( order == 0){
           g.drawLine(p1.x, p1.y, p2.x, p2.y);
           g.drawLine(p1.x, p1.y, p3.x, p3.y);
           g.drawLine(p2.x, p2.y, p3.x, p3.y);
		}
        else{
           Point p12 = midPoint(p1, p2);
           Point p23 = midPoint(p2, p3);
           Point p31 = midPoint(p3, p1);
           //System.out.println("order="+order);
           display(g, order-1, p1, p12, p31);
           display(g, order-1, p12, p2, p23);
           display(g, order-1, p31, p23, p3);
         }
      }  
      private Point midPoint(Point p1, Point p2){
       return new Point( (p1.x+p2.x)/2, (p1.y+p2.y)/2); 
	  }
	  
}
