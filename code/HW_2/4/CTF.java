import java.util.HashMap;

import javax.print.DocFlavor.CHAR_ARRAY;
public class CTF{
    private HashMap<HashMap<Integer, Character>, Integer> z_map = new HashMap<HashMap<Integer, Character>, Integer>();        
    public CTF(String P, String in_rang){
        int k =0;
        int temp = -1;
        HashMap<Integer, Character> s;
        for (int i=0; i<P.length(); i++){
            for(int j=0; j<in_rang.length();j++){
                k = (P.length()+1 < (i+2))? (P.length()):(i+2);
                temp = -1;
                do {
                    k = k-1;
                    temp =temp+1;
                    //System.out.println(P.substring(0,i)+in_rang.charAt(j));
                    //System.out.println(P.substring(0,k));
                    if(temp>i)
                        break;
                }while((P.substring(temp,i)+in_rang.charAt(j)).equals(P.substring(0,k))==false&&k > 0);
                s = new HashMap<Integer, Character>();
                s.put(i, in_rang.charAt(j));
                z_map.put(s, k);
                //System.out.println(i+" "+in_rang.charAt(j)+" "+k);
            }
        }
    }
    public HashMap<HashMap<Integer, Character>, Integer>get_map(){
        return z_map;
    }
}