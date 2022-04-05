
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyPanel extends JPanel{
    private int n;
    int p[][];
    JTextPane textpane;
    JTextField textfield;
    MyPanel(){
        setPreferredSize(new Dimension(500, 500));
        textfield = new JTextField();
        setLayout(new BorderLayout());
        textpane=new JTextPane();
        textpane.setBackground(Color.LIGHT_GRAY);
        add(textfield,BorderLayout.NORTH);         
        add(textpane);
      
        textfield.addActionListener(new ActionListener(){
            int x;
            @Override
            public void actionPerformed(ActionEvent event){
                x = Integer.parseInt(textfield.getText());
                //System.out.println(x);
                set_n(x);
            }
        });
    }
    public void set_n(int x){
        n = x;
        p = new int [n][];
        for(int i=0;i<n;i++){
            p[i] = new int [i+1];
            //System.out.println(p[i].length);
            for(int j=0;j<=i;j++){
                p[i][j] = pascal(i,j);
            }
        }
        print();
    }
    public int pascal(int a,int b){
        double ans = 1;
        if(a == 0||b == 0)
            return (int)ans;
        for(int i=1;i<=b;i++){
            ans *=((a-i+1)/(double)(i));
            //System.out.println(ans);
        }
        return (int)ans;
    }
    public void print(){
        String ans = "";
        for(int i=0;i<15-n;i++){
            ans +="\n";            
        }
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i-1;j++)
                ans += "     ";
            for(int j=0;j<i+1;j++){
                ans += p[i][j] +"       ";
            }
            ans+="\n";
        }
        textpane.setText(ans);
    }
}