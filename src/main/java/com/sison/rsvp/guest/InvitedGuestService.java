/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sison.rsvp.guest;

import com.sison.rsvp.entity.InvitedGuest;
import com.sison.rsvp.persistence.RsvpCrudService;
import java.util.List;
import javax.ejb.Stateless;

/**
 * Service layer for basic crud on the invitation entity
 *
 * @author Mark
 */
@Stateless
public class InvitedGuestService extends RsvpCrudService<InvitedGuest, Integer> {

    public InvitedGuestService() {
        super(InvitedGuest.class);
    }

    /**
     * Get a list of invitations based on the event id
     *
     * @param eventId id of the event
     * @return
     */
    public List<InvitedGuest> getByEvent(Integer eventId) {
        return em.createQuery("select g from InvitedGuest as g where g.event.id = :id")
                .setParameter("id", eventId)
                .getResultList();
    }
}
