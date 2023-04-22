import java.util.Scanner;



public class rectangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        rectangle1 r1=new rectangle1();
        System.out.println("Enter length and breadth");
        r1.length=scn.nextInt();
        r1.breadth=scn.nextInt();
        System.out.println("Area of rectangle is:"+r1.area());
        System.out.println("Peremeter of rectangle is:"+r1.peremeter());
    }
}
