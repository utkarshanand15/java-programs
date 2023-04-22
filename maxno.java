import java.util.Scanner;

public class maxno {
    static int max(int a[]){
        int m=0;
      for(int i=0;i<a.length;i++){
       if(m<a[i]){
        m=a[i];
       }
      }
      return m;
    }
    public static void main(String [] args) {
        Scanner scn=new Scanner(System.in);
        
        System.out.println("Enter the size of array:");
        int n=scn.nextInt();
       int arr[]=new int [n];
        System.out.println("Enter elements of array:");

        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=max(arr);
        System.out.println("The Maximum Number of Array is: "+max);
    }
}
