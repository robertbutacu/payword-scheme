package payword.scheme;

import java.security.PublicKey;
import java.util.Date;

public class Certificate {
    private String brokerIdentity;
    private String userIdentity;
    private PublicKey brokerPublicKey;
    private PublicKey userPublicKey;
    private Date expiryDate;
    private String serial;
    private String credit;

    public Certificate(String brokerIdentity,
                       String userIdentity,
                       PublicKey brokerPublicKey,
                       PublicKey userPublicKey,
                       Date expiryDate,
                       String serial,
                       String credit) {
        this.brokerIdentity = brokerIdentity;
        this.userIdentity = userIdentity;
        this.brokerPublicKey = brokerPublicKey;
        this.userPublicKey = userPublicKey;
        this.expiryDate = expiryDate;
        this.serial = serial;
        this.credit = credit;
    }


    public String getBrokerIdentity() {
        return brokerIdentity;
    }

    public void setBrokerIdentity(String brokerIdentity) {
        this.brokerIdentity = brokerIdentity;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    public PublicKey getBrokerPublicKey() {
        return brokerPublicKey;
    }

    public void setBrokerPublicKey(PublicKey brokerPublicKey) {
        this.brokerPublicKey = brokerPublicKey;
    }

    public PublicKey getUserPublicKey() {
        return userPublicKey;
    }

    public void setUserPublicKey(PublicKey userPublicKey) {
        this.userPublicKey = userPublicKey;
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

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
