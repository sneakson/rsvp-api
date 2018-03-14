/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sison.rsvp.guest;

import com.sison.rsvp.entity.Guest;
import com.sison.rsvp.entity.InvitedGuest;
import com.sison.rsvp.entity.Registration;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mark
 */
public class ConfirmedGuest extends Guest implements Serializable {

    private Integer estAdditionalGuests;
    private List<Registration> registrations;

    public ConfirmedGuest(InvitedGuest inv, List<Registration> registrations) {
        this.firstName = inv.getFirstName();
        this.lastName = inv.getLastName();
        estAdditionalGuests = inv.getEstAdditionalGuests();
        this.registrations = registrations;
    }

    public Integer getEstAdditionalGuests() {
        return estAdditionalGuests;
    }

    public void setEstAdditionalGuests(Integer estAdditionalGuests) {
        this.estAdditionalGuests = estAdditionalGuests;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }
}
