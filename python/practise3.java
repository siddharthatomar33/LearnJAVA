class employee1{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name =n;
    }
}
class cellphone{
    public void ring(){
        System.out.println("ringing.........");
    }
    public void vibrate(){
        System.out.println("Vibrating......");
    }
    public void callfriend(){
        System.out.println("call somu.......");
    }
}

public class practise3 {
    public static void main(String[] args) {
        //problem 1
        employee1 harry=new employee1();
        harry.setname("codingwitharry");
        harry.salary=233;
        System.out.println(harry.getsalary());
        System.out.println(harry.getname());
    
        //problem 2
        cellphone asus=new cellphone();
        asus.callfriend();
        asus.vibrate();
        asus.ring();
    }
}
