package org.ies.tierno.bank.model;

import java.util.Objects;
import java.util.Set;

public class BankAcount {
    private String iban;
    private String nif;
    private  int balance;
    private Set<Integer> accountsByIban;

    public BankAcount(String iban, String nif, int balance, Set<Integer> accountsByIban) {
        this.iban = iban;
        this.nif = nif;
        this.balance = balance;
        this.accountsByIban = accountsByIban;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Set<Integer> getAccountsByIban() {
        return accountsByIban;
    }

    public void setAccountsByIban(Set<Integer> accountsByIban) {
        this.accountsByIban = accountsByIban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAcount that = (BankAcount) o;
        return balance == that.balance && Objects.equals(iban, that.iban) && Objects.equals(nif, that.nif) && Objects.equals(accountsByIban, that.accountsByIban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iban, nif, balance, accountsByIban);
    }

    @Override
    public String toString() {
        return "BankAcount{" +
                "iban='" + iban + '\'' +
                ", nif='" + nif + '\'' +
                ", balance=" + balance +
                ", accountsByIban=" + accountsByIban +
                '}';
    }
    public BankAcount(){

    }
}
