//javac *.java
//java Hw2_4.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
public class Hw2_4{
    class FAM{
        FAM(String T, CTF D, int m){

        }
    }
    public static void main(String agrs[])throws FileNotFoundException{
        final String in_rang = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYXZ";
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        File text = new File(x);
        sc = new Scanner(text);
        String str = sc.nextLine();
        String target = "";
        HashMap<Integer, Character> s;
        int n = str.length();
        sc.close();
        sc = new Scanner(System.in);
        while(sc.hasNext()){
            int q = 0;
            int flag = 0;
            target = sc.next();   
            CTF ctf = new CTF(target, in_rang);
            for(int i=0; i<n; i++){
                s = new HashMap<Integer, Character>();
                s.put(q, str.charAt(i));
                q = ctf.get_map().get(s);
                //System.out.println(q);              
                if(q == target.length()){
                    System.out.println("Pattern occurs with shift "+ (i-q+1));
                    flag = 1;
                    break;
                }
            }    
            if(flag == 0)
            System.out.println("Can't find it");    
        }
        sc.close();
    }
}