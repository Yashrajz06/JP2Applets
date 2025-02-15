import java.net.*;
import java.io.*;
class InetAddressTest {
public static void main(String args[]) throws UnknownHostException {
InetAddress Address = InetAddress.getLocalHost();
	System.out.println(Address);
Address = InetAddress.getByName("www.javatpoint.com");
	System.out.println(Address);
InetAddress SW[]=InetAddress.getAllByName("www.yahoo.com");
System.out.println(SW.length);

	for (int i=0; i<SW.length; i++)
	              System.out.println(SW[i]);      }}
