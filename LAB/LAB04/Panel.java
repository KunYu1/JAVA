import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import java.util.*; 
 
public class Panel extends JPanel implements MouseListener, MouseMotionListener { 
 
 // ... some variable 
	private final ArrayList<Point> points = new ArrayList<Point>();
	private Color  color = Color.BLACK;
	private float width = 5; 
	private int type = 1;
	public  int startpointX, endpointX;
    public  int startpointY, endpointY;
	private int logg = 0;
	private int state = 0;
	
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
		if(type==1){
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
		else{
			endpointX = event.getX();
			endpointY = event.getY();
			points.add(event.getPoint());
			
			Graphics g = getGraphics(); 
			Graphics2D g2 = (Graphics2D)g; 
			
			g2.setColor(color);
			g2.setStroke(new BasicStroke(width));
		
			

			if((startpointX!=endpointX)&&(startpointY!=endpointY)){
				if(logg == 50){
					logg =0;
					state = 20;
				}
				if(state > 10){
					state--;
				}
				else if(state > 5){
					state--;
					g.drawLine(startpointX, startpointY, endpointX, endpointY);
					//break;
				}
				else if(state == 1){
					state--;
					
					//break;
				}
				else{
					logg++;
					g.drawLine(startpointX, startpointY, endpointX, endpointY);
				}
				
			}
				
			startpointX = endpointX;
			startpointY = endpointY;
		}
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
	}  
	public void setWidth(float w) {  
		this.width=w;
		startpointX=-10;
		startpointY=-10;
		endpointX=-10;
		endpointY=-10;
  
	}  
	public void settype(int w) {  
		this.type=w;
		startpointX=-10;
		startpointY=-10;
		endpointX=-10;
		endpointY=-10;
  
	}  

	
} 