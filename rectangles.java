public class rectangles {
    private int length;
    private int breadth;
   
    public int getLength(){
        return length;
    }
    public void setLength(int l){
        if(l>0){
            length=l;
        }
        else{
            length=0;
        }
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int b){
        if(b>0){
            breadth=b;
        }
    }
    public int area(){
        int area;
        area=length*breadth;
        return area;
    }
}
