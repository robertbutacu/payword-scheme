package participants.broker;

import participants.client.Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Map;

public class BrokerClientTransactionServant implements Runnable {
    private static Integer BROKER_ID = 0;

    private Integer id;
    private Broker broker;
    private Socket client;

    BrokerClientTransactionServant(Broker broker, Socket client) {
        this.client = client;
        this.broker = broker;
        this.id = BROKER_ID;
        BROKER_ID += 1;
    }

    @Override
    public void run() {
        System.out.println("[DEBUG BROKER SERVANT " + this.id + "] Started conversation with client.");

        try {
            client.getOutputStream().flush();
            ObjectInputStream inputStream = new ObjectInputStream(client.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(client.getOutputStream());

            System.out.println("[DEBUG " + this.id + " ] Trying to read from client");

            Integer option = inputStream.read();

            System.out.println("Read from client");
            switch (option) {
                case 1:
                    System.out.println(1);
                default:
                    System.out.println("idk");
                    throw new IOException("Unknown option");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
