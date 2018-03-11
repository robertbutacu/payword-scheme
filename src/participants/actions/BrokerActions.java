package participants.actions;

import participants.broker.UserRegistration;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class BrokerActions {
    private static List<String> knownCreditNumbers;

    public BrokerActions() {
        knownCreditNumbers = new ArrayList<>();

        knownCreditNumbers.add("10001");
        knownCreditNumbers.add("10002");
        knownCreditNumbers.add("10003");
        knownCreditNumbers.add("10004");
    }

    public static UserRegistration register(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        return (UserRegistration) inputStream.readObject();
    }

    public static Boolean isUserRegistrationValid(UserRegistration userRegistration) {
        return knownCreditNumbers.contains(userRegistration.getSerial());
    }


}
