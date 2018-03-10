package participants.broker;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BrokerServer {
    private ServerSocket brokerAcceptSocket;
    private Broker broker;

    public BrokerServer() throws IOException {
        this.brokerAcceptSocket = new ServerSocket(Broker.BROKER_PORT);
        this.broker = new Broker();
    }


    public void start() {
        System.out.println("[DEBUG] Broker started.");
        while (true) {
            try {
                Socket clientSocket = brokerAcceptSocket.accept();
                new BrokerClientTransactionServant(broker, clientSocket).run();

                try {
                    System.out.println("Receiving info.");

                } catch (Exception e) {
                    e.printStackTrace();
                }

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
