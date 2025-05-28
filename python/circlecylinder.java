class circle{
    public int radius;

    circle(int r){
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class cylinder1 extends circle{
    public int height;
    cylinder1(int r,int h){
        super(r);
        this.height=h;
    }
    public double volume(){
     return Math.PI * this.radius * this.height; // Corrected mult

    }
}

public class circlecylinder {
    public static void main(String[] args){
    circle obj=new circle(12);
    System.out.println("circle area"+obj.area());
    }
}
