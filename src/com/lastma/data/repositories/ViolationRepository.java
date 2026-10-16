package com.lastma.data.repositories;

import com.lastma.data.models.Violation;

public interface ViolationRepository {
    void save(Violation violate);
    Violation findViolationId(String violationId);
    String updateOverSpeeding(String violationId,String overSpeeding );
    String updateDui(String violationId,String dui);
    String updateExpiredPapers(String violationId,String expiredPaper);
    String updateTrafficLightOffence(String violationId,String trafficLightOffence);
    String updateOneWay(String violationId,String oneWay);

    long count();
}