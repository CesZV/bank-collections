package org.ies.tierno.bank.model;

import java.util.Objects;

public class Customers {
    private String nif;
    private String name;
    private String surname;
    private String zipCode;

    public Customers(String nif, String name, String surname, String zipCode) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.zipCode = zipCode;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return Objects.equals(nif, customers.nif) && Objects.equals(name, customers.name) && Objects.equals(surname, customers.surname) && Objects.equals(zipCode, customers.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, zipCode);
    }

    @Override
    public String toString() {
        return "Customers{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
    public  Customers(){
    }
}
