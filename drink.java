/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_solving;
import java.util.*;

public class drink {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double sum=0;
        double parcentage;
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
        }
        parcentage=sum/n;
        System.out.println(parcentage);
    }
}

