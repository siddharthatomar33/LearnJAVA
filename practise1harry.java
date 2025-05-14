class employee{
    int id;
    String name;
}
public class practise1harry{
    public static void main(String[] args){
        System.out.println("this is our custom class");
        employee harry =new employee(); //instantiated a new employee object

        //setting attribute
        harry.id=12;
        harry.name="codewith harry";

        //printing the atrributes  
        System.out.println(harry.id);
        System.out.println(harry.name);
    }
}