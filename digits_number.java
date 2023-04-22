import java.util.*;
  
  public class digits_number{
  
  public static void main(String[] args) {
    // write your code here  
     Scanner scn= new Scanner(System.in);
      int n=  scn.nextInt();
      int count=0;
      int a=n;
      while(a != 0){
        a=a/10;
        count++;
     
      }
    
    
      while(count > 0){
        int rem = n/(int)Math.pow(10, count-1); 
        
       
       System.out.println(rem);
       n=n%(int)Math.pow(10, count-1); 
       
        count--;
      }
      
      
   }
  }