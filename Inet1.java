import java.net.InetAddress;

public class Inet1 {
    public static void main(String[] args) {
        try {
            InetAddress ia[] = InetAddress.getAllByName("www.gppune.ac.in");
            for (int i = 0; i < ia.length; i++) {
                System.out.println(ia[i].getHostName()+"\t"+ia[i].getHostAddress());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
