package participants;

import participants.actions.BankerActions;

import java.io.IOException;
import java.net.ServerSocket;

public class Banker {
    public static final Integer BANKER_PORT = 7000;
    public static final String BANKER_IP = "127.0.0.1";

    private BankerActions bankerActions;
    private ServerSocket serverSocket;

    public Banker() throws IOException {
        serverSocket = new ServerSocket(BANKER_PORT);
        bankerActions = new BankerActions();

        System.out.println("[DEBUG] Banker instantiated.");
    }

    public void start() {
        System.out.println("[DEBUG] Banker started.");
    }

    public static void main(String[] args) {
        try {
            Banker banker = new Banker();
            banker.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
