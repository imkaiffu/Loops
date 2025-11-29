package Nested;

import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number!");
        int a=sc.nextInt();
        for (int i=1; i<=a; i++){
            for (int j=1; j<=a; j++){
                System.out.print(i+j+" ");
            }
        System.out.println("");
        }
    }
}
