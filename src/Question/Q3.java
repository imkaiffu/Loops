// Factorial Of a Number

package Question;

import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        long n=sc.nextInt() , fac=1;
        for (int i=1; i<=n; i++){
            fac=fac*i;
        }
        System.out.println("Factorial"+" "+ fac);
    }
}
