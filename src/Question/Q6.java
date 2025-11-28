// Finding a Number is armstrong or not
// if the qube of the number and sum is equal to the number  is called armstrong
package Question;

import java.util.Scanner;

public class Q6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt(), arm=0,r , m=n;
        while(n>0){
            r=n%10;
            n=n/10;
            arm=arm+(r*r*r);
        }
        System.out.println(arm);
        if (arm==m)
            System.out.println("It is a Armstrong Number.");
        else
            System.out.println("It is not a Armstrong Number.");
    }
}
