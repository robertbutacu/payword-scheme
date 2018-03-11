package payword.scheme;

import java.security.*;

public class Participant {
    private static Integer ID = 0;

    private Integer id;
    private PublicKey publicKey;
    private PrivateKey privateKey;

    public Participant() throws NoSuchAlgorithmException {
        KeyPair keyPair = KeyPairGenerator.getInstance("RSA").generateKeyPair();

        this.publicKey = keyPair.getPublic();
        this.privateKey = keyPair.getPrivate();

        this.id = ID;
        ID += 1;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }
}
