package participants;

import participants.actions.ClientActions;
import participants.payments.ClientItems;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static final Integer CLIENT_PORT = 7002;

    private Socket brokerSocket;

    private ClientActions clientActions;
    private ClientItems items;
    private Map<String, Double> itemsSelected;

    public Client() throws IOException {
        clientActions = new ClientActions(this);
        items = new ClientItems();
        itemsSelected = new HashMap<>();

        brokerSocket = new Socket(Broker.BROKER_IP, Broker.BROKER_PORT);

        System.out.println("[DEBUG] Client instantiated.");
    }

    public void start() {
        System.out.println("[DEBUG] Client started.");
    }

    public static void main(String[] args) {
        try {
            Client client = new Client();
            client.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
