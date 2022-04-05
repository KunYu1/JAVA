
import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel{
    private int state;
    MyPanel(){
        state = 0;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth()/2;
        int h = getHeight()/2;
        int w_d = w/5;
        int h_d = h/5;
        g2d.setStroke(new BasicStroke(3));
        if(state == 0){
            g.setColor(Color.RED);
            for(int i = 1;i<20;i+=2){
                g2d.drawLine(w, h, w, h+h_d*i);
                h = h+h_d*i;
                g2d.drawLine(w, h, w-w_d*i, h);
                w = w-w_d*i;
                g2d.drawLine(w, h, w, h-h_d*(i+1));
                h = h-h_d*(i+1);
                g2d.drawLine(w, h, w+w_d*(i+1), h);
                w = w+w_d*(i+1);                       
            }
        }else{
            g.setColor(Color.BLUE);
            for(int i = 1;i<20;i+=2){    
                g2d.drawArc(w-w_d*(i-1)/2, h-h_d*i/2, w_d*i, h_d*i, 0, 180);
                g2d.drawArc(w-w_d*(i+1)/2, h-h_d*(i+1)/2, w_d*(i+1), h_d*(i+1), 360, -180);     
            }
        }
    }

    public void set_draw(int x){
        if(x == 0){
            state = 0;
            repaint();
        } else{
            state = 1;
            repaint();
        }
    }
}