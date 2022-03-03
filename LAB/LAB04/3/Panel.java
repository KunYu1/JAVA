import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.*; 
 
public class Panel extends JPanel implements MouseListener, MouseMotionListener { 
 
 // ... some variable 
	private final ArrayList<Point> points = new ArrayList<Point>();
	private Color  color = Color.BLACK;
	private float width = 5; 
	public  int startpointX, endpointX;
    public  int startpointY, endpointY;
	
	public Panel() {
		setPreferredSize( new Dimension( 800, 800 ) );
		addMouseListener(this);   
		addMouseMotionListener(this); 
		// ... some initialize  
	}   
	@Override
	public void mousePressed(MouseEvent event) { 
	// ... 
		startpointX = event.getX();
        startpointY = event.getY();
	} 
	
	public void mouseReleased(MouseEvent event)
	{   // ...  
	} 
	
	@Override
	public void mouseDragged(MouseEvent event) { 
	// ...  
		endpointX = event.getX();
        endpointY = event.getY();
		points.add(event.getPoint());
		
		Graphics g = getGraphics(); 
		Graphics2D g2 = (Graphics2D)g; 
		
		g2.setColor(color);
		g2.setStroke(new BasicStroke(width));
		
		/*for(Point point:points){
			g2.fillOval(point.x,point.y,4,4);
			
		}*/
	
		g.drawLine(startpointX, startpointY, endpointX, endpointY);
        startpointX = endpointX;
        startpointY = endpointY;
		
		//repaint();
	} 
	
	public void mouseClicked(MouseEvent event) {  
	// ... 
	} 
	
	public void mouseEntered(MouseEvent event) {  
	// ... 
	}  
	public void mouseExited(MouseEvent event) {   
	// ...  
	}  
	public void mouseMoved(MouseEvent event) {    
	// ...  
	} 
	public Color getColor() {
            return color;
    }
	
	public void paintComponent(Graphics g){
		
		//super.paintComponent(g);	
		
	}
	
	public void setColor(Color c) {
		this.color = c;
		startpointX=-10;
		startpointY=-10;
		endpointX=-10;
		endpointY=-10;
		//repaint();
	}  
	public void setWidth(float w) {  
		this.width=w;
		startpointX=-10;
		startpointY=-10;
		endpointX=-10;
		endpointY=-10;
		//repaint();
	// ...  
	}  
	public void setLineShape(int s) { 
	// ... 
	} 
	
} 