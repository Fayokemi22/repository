package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

public interface OfficerRepository {

    void save(Officer officer);
    Officer findOfficerId(String OfficerId);


    String updateName(String officerId, String newName);
    String updateContact(String officerId,String newContact);



    String delete(String  OfficerId);
    long count();

}
