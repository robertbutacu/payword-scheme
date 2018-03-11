package payword.scheme;

import java.security.Signature;

public class SignedMessage {
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
}
