import java.util.Scanner;

public class arearect {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:-");
        int l=scn.nextInt();
        int b=scn.nextInt();
        rectangle r=new rectangle();
        r.setLength(100);
        r.setBreadth(200);
        System.out.println("Area of rectangle is:-"+r.area());

        
    }
}
