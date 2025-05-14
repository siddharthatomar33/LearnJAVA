class employee{
    int id;
    int salary;
    String name;
    //method
    public void printdetails(){
        System.out.println("my id is" +id);
        System.out.println("my name is" +name);
    }//method
    public int getsalary(){
        return salary;
    }
}
public class practise2{
        public static void main(String[] args){
        System.out.println("this is our custom class");
        employee harry =new employee(); //instantiated a new employee object
        employee john =new employee();

        //setting attribute for harry
        harry.id=12;
        harry.salary=35000;
        harry.name="codewith harry";
        //setting atrri for john
        john.id=13;
        john.salary=65000;
        john.name="john badmash";

        //printing the atrributes  
        harry.printdetails();
        john.printdetails();
        int salary=john.getsalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}