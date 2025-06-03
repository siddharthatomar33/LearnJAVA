import java.awt.*;

public class fr1 extends frame{
     panel p1;
     label l1,l2;
     textfield tf1,tf2;
     button b1;
     public fr1(){
        super("MY First Frame");
        setvisible(true);
        setsize(500,600);
        p1=new label();
        add(p1);
        l1=new label("user name");
        l2=new label("password");
        tf1=new textfield(20);
        tf2=new textfield(20);
        tf2=setechochar('*');
        b1=new button("submit");
        cb1=new checkbox("male",cg,false);
        cb2=new checkbox("female",cg,true);
        cb1=new checkbox;

        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        c.add(item: "up");
        c.add("delhi");
        c.add("mumbai");

     }
}
