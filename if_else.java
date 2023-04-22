import java.util.Scanner;

public class if_else {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter Number of  The Student :-");
        n = sc.nextInt();
        if(n>90){
            System.out.println("Excellent");

        }
        else if(n>80&&n<=90){
            System.out.println("Good");
        }
        else if(n>70&&n<=80){
            System.out.println("Fair");
        }
        else if(n>60&&n<=70){
            System.out.println("Meets Expectation");

        }
        else if(n<=60){
            System.out.println("below");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
