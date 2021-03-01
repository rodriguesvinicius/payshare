package br.com.payshare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "card_schema")
public class CardSchema implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_ID" , nullable = false)
    private long cardId;

    @NotNull
    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @NotNull
    @Column(name = "CARD_NUMBER_INITIAL")
    private String cardInitialNumber;

    @NotNull
    @Column(name = "CARD_NUMBER_LAST")
    private String cardNumberLast;

    @NotNull
    @Column(name = "EXPIRATION_DATE")
    private String expirationDate;

    @NotNull
    @Column(name = "CARD_HOLDER_NAME")
    private String cardHolderName;

    @NotNull
    @Column(name = "CVV")
    private String cvv;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    @JsonIgnore
    private UserPf userPf;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardInitialNumber() {
        return cardInitialNumber;
    }

    public void setCardInitialNumber(String cardInitialNumber) {
        this.cardInitialNumber = cardInitialNumber;
    }

    public String getCardNumberLast() {
        return cardNumberLast;
    }

    public void setCardNumberLast(String cardNumberLast) {
        this.cardNumberLast = cardNumberLast;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public UserPf getUserPf() {
        return userPf;
    }

    public void setUserPf(UserPf userPf) {
        this.userPf = userPf;
    }
}
