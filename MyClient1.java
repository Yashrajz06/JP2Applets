import java.net.*;
import java.io.*;
import java.util.*;
class MyClient1
   {
     public static void main(String args[])throws Exception
         {
              Socket sc1=new Socket("localhost",2222);
	DataInputStream din=new DataInputStream(sc1.getInputStream());
	DataOutputStream don=new DataOutputStream(sc1.getOutputStream());
	Scanner s1=new Scanner(System.in);
             String get=" ",put="";
             while(!get.equals("stop"))
                 {
                        put=s1.next();
		don.writeUTF(put);
		get=din.readUTF();
		System.out.println("Server Says:"+get);
                } 
	sc1.close();
        }
 }
