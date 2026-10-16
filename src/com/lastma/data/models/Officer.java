package com.lastma.data.models;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Officer {
    private String officerId;
    private String officerName;
    private String contactNumber;

    public Officer() {

    }


    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getOfficerName() {

        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}