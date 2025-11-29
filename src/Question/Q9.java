// Display a number in words even with tailing 0
// convert number to digit

package Question;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt() , r;
        String reve="";
        while(num>0){
            r=num%10;
            num=num/10;
            reve=reve+r;
        }
        System.out.println(reve);
        char c;
        for (int i=reve.length()-1; i>=0; i--) {
            c = reve.charAt(i);
            switch (c) {
                case '1':System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case '7':
                    System.out.println("Seven");
                    break;
                case '8':
                    System.out.println("Eight");
                    break;
                case '9':
                    System.out.println("nine");
                    break;
                case '0':
                    System.out.println("Zero");
                    break;
            }

        }
    }
}
