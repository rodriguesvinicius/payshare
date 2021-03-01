package br.com.payshare.dto.users;

import static com.fasterxml.jackson.annotation.JsonInclude.Include;

import br.com.payshare.model.CardSchema;
import br.com.payshare.model.LobbyUser;
import br.com.payshare.model.Transaction;
import br.com.payshare.model.TransactionWallet;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class UserDTO {

    @JsonProperty(value = "userId")
    private long  userId;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "address")
    private String address;

    @JsonProperty(value = "city")
    private String city;

    @JsonProperty(value = "cep")
    private String cep;

    @JsonProperty(value = "state")
    private String state;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "cpf")
    private String cpf;

    @JsonProperty(value = "rg")
    private String rg;

    @JsonProperty(value = "Age")
    private Integer Age;

    @JsonProperty(value = "userAmount")
    private BigDecimal userAmount;

    @JsonProperty(value = "userLobbyHost")
    private boolean userLobbyHost;

    @JsonProperty(value = "userAmountLobby")
    private BigDecimal userAmountLobby;

    @JsonProperty(value = "transactionList")
    private List<Transaction> transactionList = new ArrayList<>();

    @JsonProperty(value = "transactionWallets")
    private List<TransactionWallet> transactionWallets = new ArrayList<>();

    @JsonProperty(value = "lobbyUserList")
    private List<LobbyUser> lobbyUserList = new ArrayList<>();

    @JsonProperty(value = "cardSchema")
    private List<CardSchema> cardSchemas = new ArrayList<>();

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public BigDecimal getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(BigDecimal userAmount) {
        this.userAmount = userAmount;
    }

    public boolean isUserLobbyHost() {
        return userLobbyHost;
    }

    public void setUserLobbyHost(boolean userLobbyHost) {
        this.userLobbyHost = userLobbyHost;
    }

    public BigDecimal getUserAmountLobby() {
        return userAmountLobby;
    }

    public void setUserAmountLobby(BigDecimal userAmountLobby) {
        this.userAmountLobby = userAmountLobby;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public List<TransactionWallet> getTransactionWallets() {
        return transactionWallets;
    }

    public void setTransactionWallets(List<TransactionWallet> transactionWallets) {
        this.transactionWallets = transactionWallets;
    }

    public List<LobbyUser> getLobbyUserList() {
        return lobbyUserList;
    }

    public void setLobbyUserList(List<LobbyUser> lobbyUserList) {
        this.lobbyUserList = lobbyUserList;
    }

    public List<CardSchema> getCardSchemas() {
        return cardSchemas;
    }

    public void setCardSchemas(List<CardSchema> cardSchemas) {
        this.cardSchemas = cardSchemas;
    }
}
