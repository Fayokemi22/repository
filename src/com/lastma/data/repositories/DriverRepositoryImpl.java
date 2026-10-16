package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

import java.util.ArrayList;

public class DriverRepositoryImpl implements DriverRepository{
    public ArrayList<Driver> drivers = new ArrayList<>();

    @Override
    public void save(Driver driver) {

        drivers.add(driver);
    }


    @Override
    public Driver findDriverId(String driverId) {
        for(Driver driver : drivers) {
            if(driver.getDriverId().equals(driverId)) {
                return driver;
            }
        }
        return null;
    }

    @Override
    public String updateName(String driverId,String newName) {
        Driver driver = findDriverId(driverId);
        int index = drivers.indexOf(driver);
        driver.setDriverName(newName);
        drivers.set(index, driver);
        return "New Name updated";

    }
    @Override
    public String updateDriverLicense(String driverId, String newLicense){
        Driver driver = findDriverId(driverId);
        int index = drivers.indexOf(driver);
        driver.setDriverLicense(newLicense);
        drivers.set(index, driver);
        return "Driver License updated";
    }
    @Override
    public String updateDriverContact(String driverId, String newContact){
        Driver driver = findDriverId(driverId);
        int index = drivers.indexOf(driver);
        driver.setDriverLicense(newContact);
        drivers.set(index, driver);
        return "Driver Contact updated";
    }

    @Override
    public String delete(String driverId) {
        if( driverId== null || driverId.isEmpty()) {
            return "diverId cannot be null";
        }

        Driver driver = findDriverId(driverId);
        if(driver == null) {
            return "driver not found";
        }
        drivers.remove(driver);
        return "driver deleted";

    }

    @Override
    public long count() {

        return drivers.size();

    }
}
