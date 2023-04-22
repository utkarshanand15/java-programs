import java.util.Scanner;

public class arearect {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:-");
        int l=scn.nextInt();
        int b=scn.nextInt();
        rectangles r=new rectangles();
        r.setLength(l);
        r.setBreadth(b);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println("Area of rectangle is:-"+r.area());

        
    }
}
