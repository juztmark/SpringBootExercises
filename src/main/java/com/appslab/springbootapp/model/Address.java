package com.appslab.springbootapp.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Address {

    @NotBlank
    private String street;
    @NotBlank
    private String zipCode;
    @NotBlank
    private String city;
    @NotBlank
    private String state;

    public Address(String street, String zipCode, String city, String state) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    protected Address() {

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
