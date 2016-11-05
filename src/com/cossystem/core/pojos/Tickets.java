/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.pojos;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TMXIDSJPINAM
 */
@XmlRootElement(name = "Tickets")
@XmlAccessorType(XmlAccessType.FIELD)
public class Tickets implements Serializable {

    @XmlElement(name = "TblTickets")
    private List<TblTickets> tickets = null;

    public List<TblTickets> getTickets() {
        return tickets;
    }

    public void setTickets(List<TblTickets> tickets) {
        this.tickets = tickets;
    }

}
