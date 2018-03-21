package Port_scanner_42;
import java.net.*;

/**
@author: Lameck
*/

public class main_42 {
    public static void main(String[] args){
        System.out.println("PORT SCANNER");
        for (int port = 1; port <= 65535 ;port++){
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress("localhost", port), 1000);
                socket.close();
                System.out.printf("Porta: " + port + " está aberta!\n");

            } catch(Exception ex){

            }
        }
    }
}
