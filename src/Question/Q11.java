// Febonachi series

package Question;

import java.util.Scanner;

public class Q11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Ath Term");
        System.out.println("Enter Ath nth term");
        int n=sc.nextInt();

        int a=0,b=1,c;
        System.out.print(a+","+b+",");
        for (int i=0; i<n; i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
