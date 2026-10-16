package com.lastma.data.models;

public class Violation {
    private String overSpeeding;
    private String dui;
    private String expiredPapers;
    private String trafficLightOffence;
    private String oneWay;
    private String violationId;

public Violation(){

}

    public String getOverSpeeding() {
        return overSpeeding;
    }

    public void setOverSpeeding(String overSpeeding) {
        this.overSpeeding = overSpeeding;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getExpiredPapers() {
        return expiredPapers;
    }

    public void setExpiredPapers(String expiredPapers) {
        this.expiredPapers = expiredPapers;
    }

    public String getTrafficLightOffence() {
        return trafficLightOffence;
    }

    public void setTrafficLightOffence(String trafficLightOffence) {
        this.trafficLightOffence = trafficLightOffence;
    }

    public String getOneWay() {
        return oneWay;
    }

    public void setOneWay(String oneWay) {
        this.oneWay = oneWay;
    }

    public String getViolationId() {
        return violationId;
    }

    public void setViolationId(String violationId) {
        this.violationId = violationId;
    }
}
