
package problem_solving;

import java.util.Scanner;


public class Games {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int []home=new int[n];
        int []away=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            home[i]=scan.nextInt();
            away[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(home[i]==away[j]){
                    count++;
                }
               }
        }
        System.out.println(count);
    }
}
