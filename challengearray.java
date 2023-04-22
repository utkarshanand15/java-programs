import java.util.Scanner;

public class challengearray {
        public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        //Creating an array
        int n;
        System.out.println("Enter number of element in array: ");
        n=scn.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        //Find Sum Of All Elements
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];

        }
        System.out.println("Sum Of All Element Of Array is: "+sum);
        //searching an element
        int z;
        System.out.println("Enter element to be Searched: ");
        z=scn.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==z){
                System.out.println("Element Present at index: "+i);
               
               
            break;
            }
            

        }
    //find maximum element
    int max=0;
    for(int i=0;i<a.length;i++){
        if(a[i]>max){
        max=a[i];
        }
        
    }
    System.out.println("Maximum element is: "+max);
        scn.close();
    }
}
