package participants.client;

import participants.actions.ClientActions;
import participants.broker.Broker;
import participants.payments.ClientItems;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static final Integer CLIENT_PORT = 7002;

    private final Socket brokerSocket;

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

    public void start() throws IOException {
        System.out.println("[DEBUG] Client started.");
        Boolean isToContinue = true;

        while(isToContinue) {
            clientActions.printoutMenuOptions();
            String option = clientActions.scanForUserInput();

            isToContinue = clientActions.processMenuOption(option);
        }

    }

    public static void main(String[] args) {
        try {
            Client client = new Client();
            client.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ClientItems getItems() {
        return items;
    }

    public void setItems(ClientItems items) {
        this.items = items;
    }

    public Map<String, Double> getItemsSelected() {
        return itemsSelected;
    }

    public void setItemsSelected(Map<String, Double> itemsSelected) {
        this.itemsSelected = itemsSelected;
    }

    public Socket getBrokerSocket() {
        return brokerSocket;
    }
}
