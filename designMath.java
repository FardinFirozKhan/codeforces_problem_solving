
package problem_solving;

import java.util.Scanner;


public class designMath {
    public static void main(String[] args) {
        int n,a;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        a=n/2;
        checkNumber(a,n);
        
    }

    private static void checkNumber(int a, int n) {
        if(checkPrime(a)){
            int b=n-a;
            if(checkPrime(b)){
              System.out.println(a+" "+b);              
            }
            else{
                checkNumber(a+1,n);
            }

        }
        else{
            a++;
            checkNumber(a,n);
        }
    }

    private static boolean checkPrime(int a) {
        for(int i=2;i<a;i++){
            if(a%i==0){
                return true;
            }
        }
        return false;
    }
}
