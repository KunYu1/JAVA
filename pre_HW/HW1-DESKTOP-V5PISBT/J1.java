import javax.swing .JOptionPane;

//case1
/*public class J1{
	public static void main(String arg[]){
		int x,y,z,sum,product,smallest,largest,tmp;
		double average;
		
		String s1,s2,s3;
		
		s1=JOptionPane.showInputDialog("Enter first integer:");
		s2=JOptionPane.showInputDialog("Enter second integer:");
		s3=JOptionPane.showInputDialog("Enter third integer:");
		
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=Integer.parseInt(s3);
		
		sum=x+y+z;
		average=sum/3.0;
		product=x*y*z;
		
		tmp=Math.max(x,y);
		largest=Math.max(tmp,z);
		
		tmp=Math.min(x,y);
		smallest=Math.min(tmp,z);
		
		
		JOptionPane.showMessageDialog(null,"SUM="+sum+"\r\n"+"AVRAGE="+average+"\r\n"+"PROUDUCT="+product+"\r\n"+"SMALLEST="+smallest+"\r\n"+"LARGEST="+largest);
	}
}*/
//case2
public class J1{
	
	public static int Min(int x,int y,int z){
		int tmp;
		tmp=Math.min(x,y);
		return Math.min(tmp,z);
	}
	public static int Max(int x,int y,int z){
		int tmp;
		tmp=Math.max(x,y);
		return Math.max(tmp,z);
	}
	public static void main(String arg[]){
		int x,y,z,sum,product,smallest,largest;
		double average;
		String s1,s2,s3;
		
		s1=JOptionPane.showInputDialog("Enter first integer:");
		s2=JOptionPane.showInputDialog("Enter second integer:");
		s3=JOptionPane.showInputDialog("Enter third integer:");
		
		x=Integer.parseInt(s1);
		y=Integer.parseInt(s2);
		z=Integer.parseInt(s3);
		
		smallest=Min(x,y,z);
		largest=Max(x,y,z);
		
		sum=x+y+z;
		average=sum/3.0;
		product=x*y*z;
		
		JOptionPane.showMessageDialog(null,"SUM="+sum+"\r\n"+"AVRAGE="+average+"\r\n"+"PROUDUCT="+product+"\r\n"+"SMALLEST="+smallest+"\r\n"+"LARGEST="+largest);
	}
}
		

