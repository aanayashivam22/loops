package Loops;

import java.util.Scanner;

public class Factorial  {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int mult=1;
        for(int i=1;i<=n;i++){
            mult=mult*i;

        }
        System.out.println(mult);
    }
}
