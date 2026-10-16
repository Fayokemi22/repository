package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

import java.util.List;

public interface DriverRepository {
    void save(Driver driver);
    Driver findDriverId(String driverId);
    String updateDriverLicense(String driverId, String newLicense);
    String updateName(String driverId,String newName);
    String delete(String driverId);
     long count();
    String updateDriverContact(String driverId, String newContact);
}
