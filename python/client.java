import java.net.*;
import java.io.*;

public class client{
    public static void main(String[] args){
        try{
            InetAddress a=InetAddress.getLocalHost();
            Socket sc=new Socket("172.16.47.192",1078);
            System.out.println("server started at this Ip address"+InetAddress.getLocalHost());
            OutputStream os=sc.getOutputStream();
            String s="hello sanjana   ,how are you";
            BufferedWriter out=new BufferedWriter(new OutputStreamWriter(os));
            out.write(s);
            out.flush();
            out.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}