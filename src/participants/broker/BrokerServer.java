package participants.broker;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BrokerServer {
    private ServerSocket brokerAcceptSocket;
    private Broker broker;
    private static Integer clientsServed = 0;

    private BrokerServer() throws IOException {
        this.brokerAcceptSocket = new ServerSocket(Broker.BROKER_PORT);
        this.broker = new Broker();
    }


    private void start() {
        System.out.println("[DEBUG] Broker started.");
        while (true) {
            try {
                Socket clientSocket = brokerAcceptSocket.accept();
                clientsServed += 1;

                if(clientsServed % 10 == 0) {
                    new Thread(new BrokerBankerTransactionServant()).run();
                }
                new Thread(new BrokerClientTransactionServant(broker, clientSocket)).run();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            BrokerServer broker = new BrokerServer();
            broker.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
