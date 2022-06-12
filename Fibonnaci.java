package Algorithms;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int enter = input.nextInt();

        System.out.println(fibonnaci(enter));;
    }
    public static long fibonnaci(int n){
         long [] F = new long  [n+1];
        if(n<=1){
            return n;
        }


        F[0]=0; F[1]=1;
        for(int i = 2 ;i<n+1;i++){
            F[i]=F[i-2]+F[i-1];

        }
        return F[n];
    }
}
//fibonnaci calculator accurate until the 46th number because the limit for integers in java
// is from -2147483648 to 2147483647 and fibonnaci of 47+ are bigger than 2147483647 so it becomes negative