import java.io.*;
import java.net.*;
public class MyClient {
    public static void main(String[] args) {
        System.out.println("hello server");
        try{
            Socket s=new Socket("192.168.220.152",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
}