package participants.broker;

public class BrokerBankerTransactionServant implements Runnable{
    @Override
    public void run() {
        System.out.println("[Debug -- broker - banker ] Started conversation with bank");
    }
}
