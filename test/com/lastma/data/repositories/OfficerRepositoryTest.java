package com.lastma.data.repositories;

import com.lastma.data.models.Officer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OfficerRepositoryTest {
    OfficerRepository officerRepository;
    OfficerRepositoryImpl officerRepositoryImpl;
    Officer officer;
    @BeforeEach
    public void setUp() {
        officerRepository = new OfficerRepositoryImpl();
        officerRepositoryImpl = new OfficerRepositoryImpl();
        officer = new Officer();
    }
    @Test
    void testThatOfficerCanBeAdded(){
        officer.setOfficerName("Mr Ibrahim");
        officer.setContactNumber("08123457689");
        officer.setOfficerId("2657");

        officerRepository.save(officer);

        assertEquals(1L, officerRepository.count());

          }
@Test
     void testThatOfficersCanBeFind() {

    officer.setOfficerName("Mr Ibrahim");
    officer.setOfficerId("2657");
    officer.setContactNumber("08123457689");
    officerRepository.save(officer);
    assertEquals(officer, officerRepository.findOfficerId("2657"));
}
@Test
        void testThatOfficerNameCanBeUpdated(){
        officer.setOfficerName("Mr Ibrahim");
        officer.setOfficerId("2657");
        officer.setContactNumber("08123457689");
        officerRepository.save(officer);
        assertEquals("New Name updated",officerRepository.updateName(officer.getOfficerId(),"Mrs Ibrahim"));
     }

    @Test
    void testThatOfficerContactCanBeUpdated(){
        officer.setOfficerName("Mr Ibrahim");
        officer.setOfficerId("2657");
        officer.setContactNumber("08123457689");
        officerRepository.save(officer);
        assertEquals("Contact updated",officerRepository.updateContact(officer.getOfficerId(),"0701836547"));
    }
@Test
void testThatOfficerDataCanBeDeleted(){
    officer.setOfficerName("Mr Ibrahim");
    officer.setOfficerId("2657");
    officer.setContactNumber("08123457689");
    officerRepository.save(officer);
    assertEquals("Officer deleted",officerRepository.delete(officer.getOfficerId()));

}
    }


