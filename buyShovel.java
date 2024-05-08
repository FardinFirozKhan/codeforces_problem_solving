
package problem_solving;

import java.util.Scanner;


public class buyShovel {
    public static void main(String[] args) {
        int a,b,sum=0,n=0;
        Scanner scan=new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        for(int i=1;;i++){
            sum=sum+a;
            if(sum%10==0 || sum%10==b){
                System.out.println(i);
                break;
            }
            else{
                continue;
            }
        }
        
    }
 
}
