package com.lastma.data.repositories;

import com.lastma.data.models.Officer;

import java.util.ArrayList;

public class OfficerRepositoryImpl implements OfficerRepository{
    public ArrayList<Officer> officers = new ArrayList<>();

    @Override
    public void save(Officer officer) {

        officers.add(officer);
    }

    @Override
    public Officer findOfficerId(String officerId) {
        for(Officer officer : officers) {
            if(officer.getOfficerId().equals(officerId)) {
                return officer;
            }
        }
        return null;
    }

    @Override
    public String updateName(String officerId,String newName) {
        Officer officer = findOfficerId(officerId);
        int index = officers.indexOf(officer);
        officer.setContactNumber(newName);
        officers.set(index, officer);
        return "New Name updated";

    }
        @Override
        public String updateContact (String officerId, String newContact){
        Officer officer = findOfficerId(officerId);
        int index = officers.indexOf(officer);
        officer.setContactNumber(newContact);
        officers.set(index, officer);
        return "Contact updated";
        }

    @Override
    public String delete(String OfficerId) {
        if(OfficerId == null || OfficerId.isEmpty()) {
            return "OfficerId cannot be null";
        }

        Officer officer = findOfficerId(OfficerId);
        if(officer == null) {
            return "Officer not found";
        }
        officers.remove(officer);
        return "Officer deleted";

        }

    @Override
    public long count() {

        return officers.size();

}
}
