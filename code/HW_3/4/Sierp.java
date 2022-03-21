import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Sierp extends JFrame implements ActionListener 
{  
	private JTextField input = new JTextField("0",5);
	private SierpPanel sp = new SierpPanel();
	public Sierp ( )
	{
   	    JPanel  pl =  new JPanel();
        pl.add(new JLabel("Enter an order: "));
   	    pl.add(input);
   	    input.setHorizontalAlignment(SwingConstants.RIGHT);
		add(sp);
    	add(pl, BorderLayout.SOUTH);
    	input.addActionListener( this );
    }
   public void actionPerformed( ActionEvent event )
    {
	    sp.setOrder(Integer.parseInt(input.getText()));  
    }
	
   public static void main( String args[] ) // execute application
    {    
		JFrame w = new Sierp();
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        w.setSize( 500, 500 );
        w.setVisible( true );
    } 
}
