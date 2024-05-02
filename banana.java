
package problem_solving;

import java.util.Scanner;

public class banana {
    public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int k,w,n,total,totalAmount=0;
    k=scan.nextInt();
    n=scan.nextInt();
    w=scan.nextInt();
    for(int i=1;i<=w;i++){
        total=i*k;
        totalAmount=totalAmount+total;
    }
    int borrow=totalAmount-n;
    if(borrow<1){
        System.out.println(0);
    }
    else{
        System.out.println(borrow);
    }
    }
}
