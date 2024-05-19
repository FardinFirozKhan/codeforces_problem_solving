
package problem_solving;

import java.util.Scanner;


public class foxAndSnake {
    public static void main(String[] args) {
        int n,m,count=0;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        for(int i=0;i<n;i++){
            if(i%2!=0){
                count++;
            }
            for(int j=0;j<m;j++){
               if(i%2!=0){
                   if(i%2!=0 && count%2==0){
               if(j==0){
                   System.out.print("#"); 
               }
               else{
                   System.out.print(".");
               } 
               }
               if(i%2!=0 && count%2!=0){
                    if(j!=m-1){
                   System.out.print("."); 
               }
               else{
                   System.out.print("#");
               }
               }
               }

               else{
                   System.out.print("#");
               }
            }
            System.out.println("");
        }
    }
}
