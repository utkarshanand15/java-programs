import java.util.*;

public class increasingSizeOfArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int arr[]={23,34,12,45,63};
        int z=(arr.length-1);

        //for coping the array in reverse order
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[z-i];
          
        }
        System.out.println("New Array in reverse order is:");
        for(int i=0;i<arr1.length;i++){
         System.out.println(arr1[i]);
        }
        //Increasing the size of array 

        System.out.println("Enter the new size of array: ");
        int n=scn.nextInt();
        int arr2[]=new int[n];
        for(int i=0;i<arr.length;i++){
          arr2[i]=arr[i];
        }
        System.out.println("Enter new element of array");
        for(int i=arr.length;i<n;i++){
            arr2[i]=scn.nextInt();
          }
          System.out.println("New Array Is:");
          for(int i=0;i<n;i++){
              System.out.println(arr2[i]);
            }
    }
}
