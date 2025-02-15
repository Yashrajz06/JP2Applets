import java.net.*;
import java.io.*;
class InetDemo
   {
     public static void main(String args[])throws UnknownHostException
         {
              InetAddress a1=InetAddress.getLocalHost();
	System.out.println(a1);
              System.out.println(a1.toString());
	System.out.println(a1.getHostAddress());
	System.out.println(a1.getHostName());
	System.out.println(a1.getAddress());
int h=a1.hashCode();
System.out.println(h);
	System.out.println(a1.isMulticastAddress());
             InetAddress a2=InetAddress.getByName("www.google.com");
             System.out.println(a2);
             InetAddress a3[]=InetAddress.getAllByName("www.google.com");  
	for(int i=0;i<a3.length;i++)
                  {
		System.out.println(a3[i]);
	     }
       }
 }
