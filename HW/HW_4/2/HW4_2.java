import java.awt.*;
import java.util.*;

public class HW4_2{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width and height:");
        int height = sc.nextInt();
        int width = sc.nextInt();
        int paper[][] = new int[height][width];
        for(int i = 0;i<height;i++)
            for(int j = 0;j<width;j++)
                paper[i][j] = 0;
        int check;
        int step;
        int flag = 0;
        int dir = 1;
        int x = 0;
        int y = 0;
        while(true){
            System.out.println("Enter command (9 to end input)");
            check = sc.nextInt();
            switch(check){
                case 1:
                    flag = 0;
                    break;
                case 2:
                    flag = 1;
                    break;
                case 3:
                    dir += 3;
                    dir %= 4;
                    break;
                case 4:
                    dir += 1;
                    dir %= 4;
                    break;
                case 5:
                    System.out.println("Enter forward spaces:");
                    step = sc.nextInt();
                    switch(dir){
                        case 0:
                            if(flag == 1){
                                for(int i=0;i<=step;i++){
                                    paper[x+i][y] = 1;
                                }  
                            }
                            x += step;
                            break;
                        case 1:
                            if(flag == 1){
                                for(int i=0;i<=step;i++){
                                    paper[x][y+i] = 1;
                                }                                
                            }
                            y += step;
                            break;
                        case 2:
                            if(flag == 1){
                                for(int i=0;i<=step;i++){
                                    paper[x-i][y] = 1;
                                }
                            }
                            x -= step;
                            break;
                        case 3:
                            if(flag == 1){
                                for(int i=0;i<=step;i++){
                                    paper[x][y-i] = 1;
                                }                            
                            }
                            y -= step;
                            break;
                    }
                    break;
                case 6:
                    for(int i=0;i<height;i++){
                        for(int j=0;j<width;j++){
                            if(paper[i][j]==0)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 9:
                    return;
            }
        }
    }
}