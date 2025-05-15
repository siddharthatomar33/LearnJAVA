class myemployee{
private int id;
private String name;

public void setname(String n){
    name=n;
}
public String getname(){
    return name;
}
public void setid(int i){
    id=i;
}
public int getid(){
    return id;
}

}


public class practise5{
    public static void main(String[] args) {
        myemployee harry=new myemployee();

        harry.setname("codewithharry");
        System.out.println(harry.getname());
        harry.setid(777);
        System.out.println(harry.getid());
        // harry.id=45;
        // harry.name="codewithharry";
    }
}