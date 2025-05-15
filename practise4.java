class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side; 
    }
}
class rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}

public class practise4 {
    public static void main(String[] args) {
        // //problem3
        Square abc=new Square();
        abc.side=5;
        System.out.println(abc.area());
        System.out.println(abc.perimeter());

        //problem 4
        rectangle r1=new rectangle();
        r1.l=4;
        r1.b=5;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}