package org.example.model;


import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class BookingPojo {

    private String firstname;
    private String lastname;
    private int price;
    private boolean depositepaid;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDepositepaid() {
        return depositepaid;
    }

    public void setDepositepaid(boolean depositepaid) {
        this.depositepaid = depositepaid;
    }




    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    private String additionalneeds;
    private String checkin;
    private String checkout;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }



    public HashMap<String, Object> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(HashMap<String, Object> bookingdates) {
        this.bookingdates = bookingdates;
    }

    private HashMap<String, Object> bookingdates;
}

