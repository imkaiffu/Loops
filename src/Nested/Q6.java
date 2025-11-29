package Nested;

public class Q6 {
    public static void main(String[]args){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        int count=0;
        for (int l=1; l<=5; l++){
            for (int y=1; y<=5-l+1; y++) {
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }

}
