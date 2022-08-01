package br.com.payshare.dto.transaction;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@JsonInclude(Include.NON_NULL)
public class TransactionDtos {

    @JsonProperty(value = "transactionId")
    private long transactionId;

    @JsonProperty(value = "amount")
    private BigDecimal amount;

    @JsonProperty(value = "status")
    private String status;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "paymentMethod")
    private String paymentMethod;

    @JsonProperty(value = "currencyId")
    private String currencyId;

    @JsonProperty(value = "externalReference")
    private String externalReference;

    @JsonProperty(value = "createdAt")
    private LocalDateTime createdAt;

    @JsonProperty(value = "expirationDate")
    private LocalDateTime expirationDate;

    @JsonProperty(value = "initPoint")
    private String initPoint;

    @JsonProperty(value = "cupomUser")
    private String cupomUser;

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getInitPoint() {
        return initPoint;
    }

    public void setInitPoint(String initPoint) {
        this.initPoint = initPoint;
    }

    public String getCupomUser() {
        return cupomUser;
    }

    public void setCupomUser(String cupomUser) {
        this.cupomUser = cupomUser;
    }
}
