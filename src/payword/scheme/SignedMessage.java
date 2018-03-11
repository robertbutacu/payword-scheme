package payword.scheme;

import java.io.Serializable;
import java.security.Signature;

public class SignedMessage implements Serializable{
    private byte[] message;
    private Signature signature;

    public SignedMessage() {
    }

    public byte[] getMessage() {
        return message;
    }

    public void setMessage(byte[] message) {
        this.message = message;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    public SignedMessage deserializeMessage(String serializedMessage) {
        return null;
    }
}
