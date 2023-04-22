import java.util.Scanner;

public class areaoverloading {
    static float area(float l,float b){
        float a=l*b;
        return a;
    }
    static float area(float r){
        float a=3.14f*r*r;
        return a;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        float l=scn.nextFloat();
        float b=scn.nextFloat();
        float a=area(l,b);
        System.out.println("Area of rectangle is: "+a);
        System.out.println("Enter radius of circle: ");
        float r=scn.nextFloat();
        float z=area(r);
        System.out.println("Area of Circle is: "+z);

    }
}
