import java.util.Scanner;

public class findgcd {
    int gcd(int x, int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        findgcd fgcd=new findgcd();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=fgcd.gcd(a,b);
        System.out.println("The GCD of Given number is: "+c);
        
    }
    
}
