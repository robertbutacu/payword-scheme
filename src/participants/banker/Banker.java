package participants.banker;

import participants.actions.BankerActions;

import java.io.IOException;

public class Banker {
    public static final Integer BANKER_PORT = 8001;
    public static final String BANKER_IP = "127.0.0.1";

    private BankerActions bankerActions;

    public Banker() throws IOException {
        bankerActions = new BankerActions();

        System.out.println("[DEBUG] Banker instantiated.");
    }
}
