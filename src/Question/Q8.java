// Check a number is Palindrome
// If the reverse of the number is same so number is palindrome

package Question;

import java.util.Scanner;

public class Q8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number!");
        int num=sc.nextInt();
        int r,reve=0, m=num;
        while(num>0){
            r=num%10;
            reve=reve*10+r;
            num=num/10;
        }
        System.out.println(reve);
        if (reve==m)
            System.out.println("The Number is Palindrome!");
        else
            System.out.println("The Number is not Palindrome!");
    }
}
