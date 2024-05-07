
package problem_solving;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        int x=0;
        String a="X++";
        String b="++X";
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        String[] str = new String[input];
       
        for(int i=0;i<input;i++){
            str[i]=scan.next();
        }
        
        for(int i=0;i<input;i++){
            if(str[i].equals(a) || str[i].equals(b)){
                x++;
            }
            else{
                x--;
            }
        }
        
        System.out.println(x);
    }
}
