package iss_924_2.core.domain;

import iss_924_2.core.utils.ContainerType;
import iss_924_2.core.utils.Status;
import org.junit.Test;

import static org.junit.Assert.*;

public class BloodContainerTest {

    private BloodContainer bloodContainer = new BloodContainer();

    @Test
    public void getShelfLife() {
        bloodContainer.setShelfLife("testShelfLife");
        assertEquals("testShelfLife", bloodContainer.getShelfLife());
    }

    @Test
    public void getContainerType() {
        bloodContainer.setContainerType(ContainerType.plasma);
        assertEquals(ContainerType.plasma, bloodContainer.getContainerType());
    }

    @Test
    public void getStatus() {
        bloodContainer.setStatus(Status.preparation);
        assertEquals(Status.preparation, bloodContainer.getStatus());
    }

    @Test
    public void getHospital() {
        Hospital h = new Hospital();
        bloodContainer.setHospital(h);
        assertEquals(h, bloodContainer.getHospital());
    }

    @Test
    public void setShelfLife() {
        bloodContainer.setShelfLife("testShelfLife");
        assertEquals("testShelfLife", bloodContainer.getShelfLife());
    }

    @Test
    public void setContainerType() {
        bloodContainer.setContainerType(ContainerType.plasma);
        assertEquals(ContainerType.plasma, bloodContainer.getContainerType());
    }

    @Test
    public void setStatus() {
        bloodContainer.setStatus(Status.preparation);
        assertEquals(Status.preparation, bloodContainer.getStatus());
    }

    @Test
    public void setHospital() {
        Hospital h = new Hospital();
        bloodContainer.setHospital(h);
        assertEquals(h, bloodContainer.getHospital());
    }
}