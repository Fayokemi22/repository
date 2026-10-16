package com.lastma.data.repositories;

import com.lastma.data.models.Violation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViolationRepositoryTest {
    ViolationRepository violationRepository;
    ViolationRepositoryImpl violationRepositoryImpl;
    Violation violation;
    @BeforeEach
    public void setUp() {
        violationRepository = new ViolationRepositoryImpl();
        violationRepositoryImpl = new ViolationRepositoryImpl();
        violation = new Violation();
        }
@Test
    void testThatViolationCanBeAdded_countViolationAdded() {

        violation.setDui("alcohol");
        violation.setExpiredPapers("");
        violation.setOneWay("");
        violation.setOverSpeeding("");
        violationRepository.save(violation);
        assertEquals(1L,violationRepository.count());

    }

}
