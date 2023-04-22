public class overriding1 {
    public static void main(String[] args) {
    displayparent su=new displayparent();
    su.display();
    displaychild su1=new displaychild();//method overriding
    su1.display();
    displayparent su2=new displaychild();//dynamic method dispatch, in this output is based on object not on refrence
    su2.display();
    }
}
