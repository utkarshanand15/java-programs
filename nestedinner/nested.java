package java.nestedinner;
class outer{
    int x=10;
    class inner{
        int y=8;
        System.out.println("member of outer class"+x);
        System.out.println("Member of inner class"+y);
    }
    public outer  display(){
        inner i =new inner();
        System.out.println(i.y);
        System.out.println(i.x);
    }
}
public class nested {
    public static void main(String[] args) {
        outer o=new outer();
        System.out.println(o.display());
        
    }
}
