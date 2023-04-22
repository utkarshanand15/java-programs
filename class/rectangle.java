public class rectangle {
    private int length;
    private int breadth;
   
    public int getlength(){
        return length;
    }
    public void setLength(int l){
        if(length>0){
            length=l;
        }
        else{
            length=0;
        }
    }
    public int getBreadth(){
        return breadth;
    }
    public void setbreadth(int b){
        if(breadth>0){
            breadth=b;
        }
    }
    public int area(){
        int area;
        area=length*breadth;
        return area;
    }
}
