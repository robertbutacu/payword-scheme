package participants.actions;

import participants.client.Client;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class ClientActions {
    private Client client;
    private Scanner scanner;

    public ClientActions(Client client) {
        this.client = client;
        scanner = new Scanner(System.in);
    }

    public Boolean processMenuOption(String option) throws IOException {
        switch(option){
            case "Buy":
                printoutClientItemsWIthPayment();
                return true;
            case "See items picked":
                printoutItemsPicked();
                return true;
            case "Send requests":
                sendRequests(client.getItemsSelected());
                return true;
            case "Quit":
                exit();
                return false;
            default:
                defaultMenu();
                return true;
        }
    }

    public void printoutItemsPicked() {
        this.client.getItemsSelected().forEach((item, price) -> System.out.println(
                "Name : " + item + " => " + price));

        System.out.println("\n\n Pick an option: \n 1. Remove item \n 2. Back to main menu");

        String option = scanForUserInput();

        switch(option){
            case "Remove item":
                String itemToRemove = scanForUserInput();
                client.getItemsSelected().remove(itemToRemove);
                System.out.println("\n\nItem removed if it existed! Back to main menu.\n");
                break;

            case "Back to main menu":
                System.out.println("\n\n");
                break;

            default:
                System.out.println("Option unknown\n Back to main menu...\n");
                break;
        }
    }
    public void defaultMenu(){
        System.out.println("That wasn't a valid option! Pick again.");
    }

    public void exit() throws IOException {
        client.getBrokerSocket().close();
    }

    public void printoutClientItemsWIthPayment() {
        this.client.getItems().items.forEach((item, price) -> System.out.println(
                "Name : " + item + " => " + price));
        System.out.println("\n\n Select an item by name\n\n");

        String option = scanForUserInput();

        if (client.getItems().items.containsKey(option)) {
            System.out.println("\n Thank you! Item added to list!");

            Double itemPrice = client.getItems().items.get(option);

            client.getItemsSelected().put(option, itemPrice);

            client.getItems().items.remove(option);
        } else {
            System.out.println("\n Item does not exist!\n Please pick again!\n");

            printoutClientItemsWIthPayment();
        }


    }

    public String scanForUserInput() {
        return scanner.nextLine();
    }

    public void printoutMenuOptions() {
        System.out.println(" 1. Buy \n 2. Send requests \n 3. See items picked \n 4. Quit");
    }

    public void printoutResponse() {

    }

    public void sendRequests(Map<String, Double> itemsSelected) {
        System.out.println("Sending requests");
    }
}
