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
        final String in_rang = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYX";
        File text = new File("bonus.txt");
        Scanner sc = new Scanner(text);
        String str = sc.nextLine();
        String target = "";
        HashMap<Integer, Character> s;
        int n = str.length();
        sc.close();
        sc = new Scanner(System.in);
        while(sc.hasNext()){
            int q = 0;
            target = sc.next();   
            CTF ctf = new CTF(target, in_rang);
            for(int i=0; i<n; i++){
                s = new HashMap<Integer, Character>();
                s.put(q, str.charAt(i));
                q = ctf.get_map().get(s);              
                if(q == target.length()){
                    System.out.println("Pattern occurs with shift "+ (i-q+1));
                    break;
                }
            }        
        }
        sc.close();
    }
}