class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is" +id);
        System.out.println("my name is" +name);
    }
}
public class practise1{
    public static void main(String[] args){
        System.out.println("this is our custom class");
        employee harry =new employee(); //instantiated a new employee object
        employee john =new employee();

        //setting attribute
        harry.id=12;
        harry.name="codewith harry";
        john.id=13;
        john.name="john badmash";

        //printing the atrributes  
        harry.printdetails();
        john.printdetails();

        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}