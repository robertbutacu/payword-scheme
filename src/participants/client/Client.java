package participants.client;

import participants.actions.ClientActions;
import participants.broker.Broker;
import participants.payments.ClientItems;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static final Integer CLIENT_PORT = 7002;

    private ClientActions clientActions;
    private ClientItems items;
    private Map<String, Integer> itemsSelected;


    private Client() {
        clientActions = new ClientActions(this);
        items = new ClientItems();
        itemsSelected = new HashMap<>();

        System.out.println("[DEBUG] Client instantiated.");
    }

    private void start() {
        System.out.println("[DEBUG] Client started.");
        Boolean isToContinue = true;

        while(isToContinue) {
            clientActions.printoutMenuOptions();
            String option = clientActions.scanForUserInput();

            try {
                isToContinue = clientActions.processMenuOption(option);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
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

    public Map<String, Integer> getItemsSelected() {
        return itemsSelected;
    }

    public void setItemsSelected(Map<String, Integer> itemsSelected) {
        this.itemsSelected = itemsSelected;
    }
}
