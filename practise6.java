class cylinder{
    private int r;
    private int h;

    public int getradius(){
        return r;
    }
    public void setradius(int radius){
        this.r=radius;
    }
    public int getheight(){
        return h;
    }
    public void setheight(int height){
        this.h=height;
    }
}

public class practise6 {
    public static void main(String[] args){
      cylinder mycylinder =new cylinder();
      mycylinder.setheight(10);
      System.out.println(mycylinder.getheight());
      mycylinder.setradius(15);
      System.out.println(mycylinder.getradius());
    }
}
