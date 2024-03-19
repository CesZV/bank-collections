package org.ies.tierno.bank.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Bank {
    private  String name;
    //LISTADO de clientes.Con <LIST>
    private List<Customers> customers;
    //accountsByIban: cuentas indexadas por iban
    // es un <MAP> ya que nos dice que son cuentas
    //INDEXADAS por iban.
    private Map<String,BankAcount> accountsByIban;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customers> customers) {
        this.customers = customers;
    }

    public Map<String, BankAcount> getAccountsByIban() {
        return accountsByIban;
    }

    public void setAccountsByIban(Map<String, BankAcount> accountsByIban) {
        this.accountsByIban = accountsByIban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(name, bank.name) && Objects.equals(customers, bank.customers) && Objects.equals(accountsByIban, bank.accountsByIban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, customers, accountsByIban);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                ", accountsByIban=" + accountsByIban +
                '}';
    }
//Se usa constructor vacio para que
// funcione la coversion del JSON a objetos.
    public Bank(){
   }

   public BankAcount findAccount(String iban,double balance){

        return null;
   }
}
