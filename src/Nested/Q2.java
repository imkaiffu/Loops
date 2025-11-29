package Nested;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        int a=0;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5; j++)
            {
                a++;
                System.out.format("%02d ",a);
            }
            System.out.println("");
        }
    }
}
