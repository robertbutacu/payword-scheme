package participants.banker;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BankerClient {
    private Banker banker;
    private ServerSocket bankerSocket;

    public BankerClient() throws IOException {
        this.banker = new Banker();
        this.bankerSocket = new ServerSocket(Banker.BANKER_PORT);
    }

    public void start() {
        System.out.println("[DEBUG] Banker started.");

        while (true) {
            try {
                System.out.println("[DEBUG --banker client--] Waiting to accept brokers.");
                Socket clientSocket = bankerSocket.accept();
                new Thread(new BankerServant(banker, clientSocket)).start();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            BankerClient banker = new BankerClient();
            banker.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
