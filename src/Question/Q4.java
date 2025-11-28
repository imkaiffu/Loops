// Display  Digit of Number

package Question;
import java.util.*;
public class Q4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number!");
        int num= sc.nextInt(),r;
        while (num>0){
            r=num%10;
            num=num/10;
            System.out.print(r+" ");
        }
    }
}
