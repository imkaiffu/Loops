// Display AP Series
// Display Gp Series

package Question;

import java.util.Scanner;

public class Q10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting number ");
        int a=sc.nextInt();
        System.out.println("Enter Difference(d) between Number");
        int d= sc.nextInt();
        System.out.println("Enter n");
        int n=sc.nextInt();

        int term=a;
        for (int i=0; i<n; i++){
            System.out.print(term+",");
            term=term+d;
        }
        System.out.println("\n");
        int gram=a;
        for (int i=0; i<n; i++){
            System.out.print(gram+",");
            gram=gram*d;
        }
    }
}
