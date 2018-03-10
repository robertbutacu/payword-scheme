package participants.broker;

import participants.actions.BrokerActions;
import participants.banker.Banker;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Broker {
    public static final Integer BROKER_PORT = 7001;
    public static final String BROKER_IP = "127.0.0.1";

    private BrokerActions brokerActions;
    private Socket bankerSocket;

    public Broker() throws IOException {
        brokerActions = new BrokerActions();
        bankerSocket = new Socket(Banker.BANKER_IP, Banker.BANKER_PORT);

        System.out.println("[DEBUG] Broker instantiated.");
    }

}
