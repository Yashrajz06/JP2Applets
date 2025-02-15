import java.net.*;
class InetAddressTest1{
public static void main(String args[])throws UnknownHostException {
InetAddress Address=InetAddress.getByName("www.google.com"); 
             System.out.println(Address.getHostAddress());
             System.out.println(Address.getHostName());
             if(Address.isMulticastAddress())
	    System.out.println("It is multicast address");
      } }
