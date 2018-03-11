package participants.broker;

import java.security.PublicKey;
import java.util.Date;

public class UserRegistration {
    private String name;
    private PublicKey publicKey;
    private Date expiryDate;
    private String serial;
    private Integer creditLimit;

    public UserRegistration(String name, PublicKey publicKey, Date expiryDate, String serial, Integer creditLimit) {
        this.name = name;
        this.publicKey = publicKey;
        this.expiryDate = expiryDate;
        this.serial = serial;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }
}
