
package problem_solving;

import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int year=0;
    while(a<=b){
    a=a*3;
    b=b*2;
    year++;
    }
        System.out.println(year);
    }
}
