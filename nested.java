class OuterClass {
    int x = 10;
  
    class InnerClass {
      int y = 5;
    }
    public void display(){
        InnerClass i=new InnerClass();
        System.out.println(i.y);
    }
  }
  

public class nested {
    public static void main(String[] args) {
        OuterClass o=new OuterClass();
        o.display();
        System.out.println(o.x);
        
    
   
}
}
