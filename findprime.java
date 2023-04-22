import java.util.Scanner;

public class findprime {
    static int prime (int x){
        int count=0;
        for(int i=1;i<=x;i++){
          if(x%i == 0){
            count++;
          }
        }
             return count;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scn.nextInt();
        int c=prime(n);
        if(c > 2){
          System.out.println("The number is not prime");
      }
      else
          System.out.println("The number is prime");  


        
    }
}
