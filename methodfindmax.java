import java.util.*;

public class methodfindmax {
    static int max(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[] args) {
        //methodfindmax mp=new methodfindmax();
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=max(a,b);
        System.out.println("The maximum number is: "+c);

        
    }
    
}
