interface bicycle {
    int a=45;
    void applybrake(int decrement);
    void speedup(int increment);
}

class avon implements bicycle{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }
}
    public void applybrake(int decrement){
    System.out.println("applying brake");
}
    public void speedup(int increment){
        System.out.println("applying speedup");
    }


public class interfacepractise {
    public static void main(String[] args) {
       avon sidcycle=new avon();
       sidcycle.applybrake(1);
       sidcycle.speedup(1);

    }
    
}
