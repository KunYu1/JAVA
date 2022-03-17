//javac *.java
//java StockTest
import java.util.Scanner;
import java.util.Vector;
public class StockTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String num, name, c;
        int s_num, find=0;
        double price;
        Vector<StockItem> v = new Vector<StockItem>(0);
        StockItem stock;
        while(sc.hasNext()== true){
            c = sc.next();
            switch(c){
                case "h":
                    System.exit(0);
                    break;
                case "0":
                    num = sc.next();
                    name = sc.next();
                    price = sc.nextDouble();
                    stock = new StockItem(num, name, price);
                    v.add(stock);
                    break;
                case "1":
                    find = 0;
                    num = sc.next();
                    price = sc.nextDouble();
                    for(int i=0; i<v.size();i++){
                        if(v.get(i).getStockNumber().equals(num)){
                            v.get(i).setPrice(price);
                            find = 1;                            
                        }
                    }
                    if(find == 0)
                        System.out.println("Not found the stock with number "+num);
                    break;
                case "2":
                    find = 0;
                    num = sc.next();
                    s_num = sc.nextInt();
                    for(int i=0; i<v.size();i++){
                        if(v.get(i).getStockNumber().equals(num)){
                            v.get(i).increseTotalStock(s_num);;
                            find = 1;                            
                        }
                    }
                    if(find == 0)
                        System.out.println("Not found the stock with number "+num);               
                    break;
                case "3":
                    find = 0;
                    num = sc.next();
                    for(int i=0; i<v.size();i++){
                        if(v.get(i).getStockNumber().equals(num)){
                            System.out.println(v.get(i).get_All_information());
                            find = 1;                            
                        }
                    }
                    if(find == 0)
                        System.out.println("Not found the stock with number "+num);                
                    break;
                case "4":
                    for(int i=0; i<v.size();i++){
                            System.out.println(v.get(i).get_All_information());
                    }
                    break;
            }
        }
        sc.close();
    }
}