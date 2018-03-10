package participants.banker;

import java.net.Socket;

public class BankerServant implements Runnable {
    private static Integer SERVANT_ID = 0;

    private Integer id;
    private Banker banker;
    private Socket broker;

    protected BankerServant(Banker banker, Socket broker) {
        this.id = SERVANT_ID ;
        SERVANT_ID += 1;
        this.banker = banker;
        this.broker = broker;
    }

    @Override
    public void run() {
        System.out.println("[DEBUG Banker " + this.id + "] Started conversation with broker");

    }
}
