import java.util.Scanner;

public class practiceArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a[]=new int[5];
        for (int i =0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        for (int i =0;i<a.length;i++){
            System.out.println("Array elements are"+a[i]);
        }
        //Another way to create an array
        int b[]={2,3,4,5,6,7,8};
        for(int x:b){
            System.out.println(x);
        }
        
    }
}
