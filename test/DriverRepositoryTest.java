import com.lastma.data.models.Driver;
import com.lastma.data.repositories.DriverRepository;
import com.lastma.data.repositories.DriverRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DriverRepositoryTest {
    DriverRepository driverRepository ;
    DriverRepositoryImpl driverRepositoryImpl;
    Driver driver;
    @BeforeEach
    public void setUp() {
        driverRepository = new DriverRepositoryImpl();
        driverRepositoryImpl = new  DriverRepositoryImpl();
        driver = new Driver();
    }
    @Test
    void testThatDriverCanBeAdded() {
        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 1");
        driver.setDriverName("Kemi");


        driverRepository.save(driver);

        assertEquals(1L,driverRepository.count());
    }
@Test
void testThatEntityCanBeCounted(){
        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 1");
        driver.setDriverId("12345");
        driverRepository.save(driver);

        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 3");
        driver.setDriverId("76747648");
        driverRepository.save(driver);

        assertEquals(2L,driverRepository.count());


}

    @Test
    void testThatDrivercanBeFind(){
        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 1");
        driver.setDriverName("Kemi");
        driver.setDriverId("12345");
        driverRepository.save(driver);
        assertEquals(driver,driverRepository.findDriverId("12345"));
    }
    @Test
    void testThatDriverLicenseCanBeUpdated(){
        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 1");
        driver.setDriverName("Kemi");
        driver.setDriverId("12345");
        driverRepository.save(driver);
        assertEquals("Driver updated",driverRepository.updateDriverLicense(driver.getDriverId(), "wertyu"));
    }

    @Test
    void testThatDriverContactCanBeUpdated(){
        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 1");
        driver.setDriverName("Kemi");
        driver.setDriverId("12345");
        driverRepository.save(driver);
        assertEquals("Driver Contact updated",driverRepository.updateDriverContact(driver.getDriverId(), "09046738932"));
    }
    @Test
    void testThatDriverNameCanBeUpdated(){
        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 1");
        driver.setDriverName("Kemi");
        driver.setDriverId("12345");
        driverRepository.save(driver);
        assertEquals("New Name updated",driverRepository.updateName(driver.getDriverId(), "Blossom"));
    }



//    @Test
//        void testFindAll() {
//             Driver driver = new Driver();
//            Driver driver1 = new Driver();
//
//            driver.setPhoneNumber("0913161771");
//            driver.setDriverName("Driver 1");
//            driver.setDriverId("12345");
//            driver.setDriverLicense("khdichwd");
//
//            driver1.setPhoneNumber("091316131");
//            driver1.setDriverName("Driver 2");
//            driver1.setDriverId("12332");
//            driver1.setDriverLicense("dkwql");
//
//            driverRepository.save(driver);
//            driverRepository.save(driver1);
//
//            driverRepositoryImpl.drivers.add(driver);
//            driverRepositoryImpl.drivers.add(driver1);
//
//            assertEquals(2, driverRepository.count());
//            assertEquals(driver, driverRepositoryImpl.drivers.get(0));
//            assertEquals(driver1, driverRepositoryImpl.drivers.get(1));
//
//
//    }

    @Test
    void testThatDriverDataCanBeDeleted() {
        driver.setPhoneNumber("0913161771");
        driver.setDriverName("Driver 1");
        driver.setDriverName("Kemi");
        driver.setDriverId("12345");
        driverRepository.save(driver);
        assertEquals("Driver deleted", driverRepository.delete(driver.getDriverId()));
    }
}

