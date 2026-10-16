package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Violation;

import java.util.ArrayList;

public class ViolationRepositoryImpl implements ViolationRepository {
    public ArrayList<Violation> violation = new ArrayList<>();

    @Override
    public void save(Violation violate) {
      violation.add(violate);
    }
@Override
    public Violation findViolationId(String violationId){
        for(Violation violate : violation){
            if(violate.getViolationId().equals(violationId)){
                return violate;
            }
        }
        return null;
}
@Override
    public String updateOverSpeeding(String violationId,String overSpeeding ){
    Violation violate = findViolationId(violationId);
    int index = violation.indexOf(violate);
    violate.setOverSpeeding(overSpeeding);
    violation.set(index, violate);
    return "OverSpeeding updated";
}
@Override
    public String updateDui(String violationId,String dui){
        Violation violate = findViolationId(violationId);
        int index = violation.indexOf(violate);
        violate.setDui(dui);
        violation.set(index, violate);
        return "Dui updated";
}
@Override
    public String updateExpiredPapers(String violationId,String expiredPaper){
        Violation violate = findViolationId(violationId);
        int index = violation.indexOf(violate);
        violate.setExpiredPapers(expiredPaper);
        violation.set(index, violate);
        return "Expired Papers updated";
}
@Override
    public String updateTrafficLightOffence(String violationId,String trafficLightOffence ){
        Violation violate = findViolationId(violationId);
        int index = violation.indexOf(violate);
        violate.setTrafficLightOffence(trafficLightOffence);
        violation.set(index, violate);
        return "TrafficLightOffence updated";
}
@Override
    public String updateOneWay(String violationId,String oneWay){
        Violation violate = findViolationId(violationId);
        int index = violation.indexOf(violate);
        violate.setOneWay(oneWay);
        violation.set(index, violate);
        return "OneWay updated";
}
    @Override
    public long count() {

        return violation.size();

    }

}
