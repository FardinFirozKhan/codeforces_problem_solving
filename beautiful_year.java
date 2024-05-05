
package problem_solving;

import java.util.Scanner;


public class beautiful_year {
    public static void main(String[] args) {
        int year,a,b,c,d;
        Scanner scan=new Scanner(System.in);
        year=scan.nextInt();
        for(int i=year+1;i<=9013;i++){
            year=year+1;
            a=year/1000;
            b=year/100%10;
            c=year/10%10;
            d=year%10;
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                break;
            }
        }
        System.out.println(year);
    }
}
