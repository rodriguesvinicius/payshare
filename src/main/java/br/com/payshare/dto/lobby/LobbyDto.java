package br.com.payshare.dto.lobby;

import br.com.payshare.model.Transaction;
import br.com.payshare.model.UserPf;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class LobbyDto {

    @JsonProperty(value = "idLobby")
    private long id;

    @JsonProperty(value = "lobbyDescription")
    private String lobbyDescription;

    @JsonProperty(value = "orderDescription")
    private String orderDescription;

    @JsonProperty(value = "amount")
    private BigDecimal amount;

    @JsonProperty(value = "amountTotal")
    private BigDecimal amountTotal;

    @JsonProperty(value = "creationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime creationDate;

    @JsonProperty(value = "expirationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime expirationDate;

    @JsonProperty(value = "lobbyOpen")
    private boolean lobbyOpen;

    @JsonProperty(value = "users")
    private List<UserPf> userPfList = new ArrayList<>();

    @JsonProperty(value = "transactions")
    private List<Transaction> transactions = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLobbyDescription() {
        return lobbyDescription;
    }

    public void setLobbyDescription(String lobbyDescription) {
        this.lobbyDescription = lobbyDescription;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(BigDecimal amountTotal) {
        this.amountTotal = amountTotal;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isLobbyOpen() {
        return lobbyOpen;
    }

    public void setLobbyOpen(boolean lobbyOpen) {
        this.lobbyOpen = lobbyOpen;
    }

    public List<UserPf> getUserPfList() {
        return userPfList;
    }

    public void setUserPfList(List<UserPf> userPfList) {
        this.userPfList = userPfList;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
