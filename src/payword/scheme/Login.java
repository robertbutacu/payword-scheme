package payword.scheme;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private List<User> knownUsers;

    public Login() throws NoSuchAlgorithmException {
        knownUsers = new ArrayList<>();

        knownUsers.add(new User("Test", "Test", "123456"));
        knownUsers.add(new User("Test 2", "Test 2", "123457"));
        knownUsers.add(new User("Test 3", "Test 3", "123425"));
    }
}
