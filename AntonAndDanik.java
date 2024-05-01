
package problem_solving;

import java.util.Scanner;


public class AntonAndDanik {
    public static void run(int n){
         String s; 
         int anton=0,danik=0;
       Scanner scanner= new Scanner(System.in);
        s=scanner.nextLine(); 
        
        for(int i=0;i<n;i++){
         if(s.charAt(i)=='A') {
             anton++;
         } 
         else if(s.charAt(i)=='D') {
             danik++;
         }
         
        }
        if(anton>danik){
            System.out.println("Anton");
        }
        else if(danik>anton){
            System.out.println("Danik");
        }
        else {
            System.out.println("Friendship");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        run(n);
    }
}
