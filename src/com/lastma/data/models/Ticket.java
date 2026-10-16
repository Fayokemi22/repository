package com.lastma.data.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {
    private Driver driver;
    private Officer officer;
    private Vehicle vehicle;
    private VehicleType vehicleType;
    private String offense;
    private Long ticketId;
    private LocalDateTime dateTime;
    private BigDecimal payFine;

    public Ticket() {

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Officer getOfficer() {
        return officer;
    }

    public void setOfficer(Officer officer) {
        this.officer = officer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOffense() {
        return offense;
    }

    public void setOffense(String offense) {
        this.offense = offense;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public BigDecimal getPayFine() {
        return payFine;
    }

    public void setPayFine(BigDecimal payFine) {
        this.payFine = payFine;
    }
}