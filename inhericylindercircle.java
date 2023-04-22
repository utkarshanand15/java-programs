import java.util.Scanner;

public class inhericylindercircle {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double a=scn.nextDouble();
        System.out.println("Enter height of cylinder");
        double b=scn.nextDouble();
        inheritancecircle c1=new inheritancecircle();
        extcylinder c2=new extcylinder();
        c1.radius=a;
        c2.height=b;
        System.out.println("Area of circle="+c1.area());
        System.out.println("circumference of circle="+c1.circumference());
        System.out.println("volume of cylinder"+c2.volume());

        
    }
}
