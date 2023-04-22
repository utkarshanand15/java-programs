import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scn.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array's Element");
        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();

        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of all element of array="+sum);
        
        System.out.println("Enter number to be searched");
        int z=scn.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==z){
             System.out.println("The number is at index: "+i);
             break;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
           if(arr[i]>max){
            max=arr[i];
           }
        }
        System.out.println("Maximum element is: "+max);

        //Finding Second highest
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("second highest number is: "+arr[n-2]);
    }

}
