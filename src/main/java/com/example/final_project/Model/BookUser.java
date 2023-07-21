package com.example.final_project.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOKTOUR")
public class BookUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String whereto;
    private int numberofguests;
    private LocalDate arrivedate;
    private LocalDate leavedate;
    private String details;

    @Override
    public String toString() {
        return "BookUser [id=" + id + ", whereto=" + whereto + ", numberofguests=" + numberofguests + ", arrivedate="
                + arrivedate + ", leavedate=" + leavedate + ", details=" + details + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWhereto() {
        return whereto;
    }

    public void setWhereto(String whereto) {
        this.whereto = whereto;
    }

    public int getNumberofguests() {
        return numberofguests;
    }

    public void setNumberofguests(int numberofguests) {
        this.numberofguests = numberofguests;
    }

    public LocalDate getArrivedate() {
        return arrivedate;
    }

    public void setArrivedate(LocalDate arrivedate) {
        this.arrivedate = arrivedate;
    }

    public LocalDate getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(LocalDate leavedate) {
        this.leavedate = leavedate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    
}
