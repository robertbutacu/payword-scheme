package participants;

import participants.actions.BrokerActions;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Broker {
    public static final Integer BROKER_PORT = 7001;
    public static final String BROKER_IP = "127.0.0.1";

    private BrokerActions brokerActions;
    private ServerSocket serverSocket;
    private Socket bankerSocket;

    public Broker() throws IOException {
        brokerActions = new BrokerActions();
        serverSocket = new ServerSocket(BROKER_PORT);
        bankerSocket = new Socket(Banker.BANKER_IP, Banker.BANKER_PORT);

        System.out.println("[DEBUG] Broker instantiated.");
    }

    public void start() {
        System.out.println("[DEBUG] Broker started.");
    }

    public static void main(String[] args) {
        try {
            Broker broker = new Broker();
            broker.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
