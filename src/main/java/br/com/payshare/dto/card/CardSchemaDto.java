package br.com.payshare.dto.card;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class CardSchemaDto {
    @JsonProperty(value = "cardId")
    private long cardId;

    @JsonProperty(value = "cardNumber")
    private String cardNumber;

    @JsonProperty(value = "cardInitialNumber")
    private String cardInitialNumber;

    @JsonProperty(value = "cardNumberLast")
    private String cardNumberLast;

    @JsonProperty(value = "expirationDate")
    private String expirationDate;

    @JsonProperty(value = "cardHolder")
    private String cardHolder;

    @JsonProperty(value = "cvv")
    private String cvv;

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

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
