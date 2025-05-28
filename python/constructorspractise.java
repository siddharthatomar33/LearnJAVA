class mymainemployee{
private int id;
private String name;

//constructor
public mymainemployee(String myname,int myid){
    id=myid;
    name=myname;
}


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

public class constructorspractise {
    public static void main(String[] args) {
        mymainemployee harry= new mymainemployee("codewithsid",777);
        
        
        System.out.println(harry.getid());
        System.out.println(harry.getname());
    }
}
