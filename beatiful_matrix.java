
package problem_solving;

import java.util.Scanner;

public class beatiful_matrix {
    public static void main(String[] args) {
        int [][] x=new int[5][5];
        int k=0,l=0,move=0,f=-1;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
          x[i][j]=scan.nextInt();
        }
        }
        for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
             if(x[i][j]==1){
                  k=i;
                  l=j;
                 break;
             }
          }
        }
        
      
       
        while(k<2){
              k++;
              move++;
        }
            while(k>2){
             
              k--;
              move++;
                System.out.println(move);            
        }
        int a=l-2;
            if(a<0){
               a=a*f;
            }
        move=move+a;
        System.out.println(move);
        
    }
}
