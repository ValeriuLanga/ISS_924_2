package iss_924_2.core.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest {

    Address address = new Address();

    @Test
    public void getStreet() {
        address.setStreet("streetTest");
        assertEquals("streetTest", address.getStreet());
    }

    @Test
    public void getNumber() {
        address.setNumber("numberTest");
        assertEquals("numberTest", address.getNumber());
    }

    @Test
    public void getCity() {
        address.setCity("cityTest");
        assertEquals("cityTest", address.getCity());
    }

    @Test
    public void getCountry() {
        address.setCountry("countryTest");
        assertEquals("countryTest", address.getCountry());
    }

    @Test
    public void setStreet() {
        address.setStreet("streetTest");
        assertEquals("streetTest", address.getStreet());
    }

    @Test
    public void setNumber() {
        address.setNumber("numberTest");
        assertEquals("numberTest", address.getNumber());
    }

    @Test
    public void setCity() {
        address.setCity("cityTest");
        assertEquals("cityTest", address.getCity());
    }

    @Test
    public void setCountry() {
        address.setCountry("countryTest");
        assertEquals("countryTest", address.getCountry());
    }
}