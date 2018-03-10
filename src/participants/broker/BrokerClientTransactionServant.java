package participants.broker;

import participants.client.Client;

import java.net.Socket;

public class BrokerClientTransactionServant implements Runnable{
    private static Integer BROKER_ID = 0;

    private Integer id;
    private Broker broker;
    private Socket client;

    public BrokerClientTransactionServant(Broker broker, Socket client) {
        this.client = client;
        this.broker = broker;
        this.id = BROKER_ID;
        BROKER_ID += 1;
    }

    @Override
    public void run() {
        System.out.println("[DEBUG BROKER SERVANT " + this.id + "] Started conversation with client.");
    }
}
