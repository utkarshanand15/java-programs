import java.util.Scanner;

public class rotationOfArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n;
        System.out.println("Enter number of element in array: ");
        n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        //left rotation
        int temp= a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        System.out.println("Array After Left Rotation:");
        for(int i=0;i<a.length;i++){
            
            System.out.println(a[i]);
        }
        //right rotation
        int temp1=a[a.length-1];
        int arr[]=new int[a.length];
        arr[0]=temp1;
        for(int i=1;i<a.length;i++){
            arr[i]=a[i-1];
        }
        
        System.out.println("Array After right Rotation:");
        for(int i=0;i<a.length;i++){
            
            System.out.println(arr[i]);
        }
    }
    
}