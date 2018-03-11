package payword.scheme;

import java.security.NoSuchAlgorithmException;

public class User extends Participant {
    private String name;
    private String password;
    private String creditCardNumber;

    public User(String name, String password, String creditCardNumber) throws NoSuchAlgorithmException {
        super();
        this.name = name;
        this.password = password;
        this.creditCardNumber = creditCardNumber;
    }
}
