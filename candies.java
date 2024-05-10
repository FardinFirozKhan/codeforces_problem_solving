
package problem_solving;

import java.util.Scanner;


public class candies {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt() ;
        long []candies=new long[n];
        long []result=new long[n];
        for(int i=0;i<n;i++){
            candies[i]=scan.nextLong();
        }
        for(int i=0;i<n;i++){
            result[i]=candies[i]/2;
            if(result[i]*2==candies[i]){
                result[i]=result[i]-1;
            }
        }
        for(int j=0;j<n;j++){
            System.out.println(result[j]);
        }
    }
}
