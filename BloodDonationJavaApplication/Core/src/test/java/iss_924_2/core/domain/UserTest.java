package iss_924_2.core.domain;

import iss_924_2.core.domain.User;
import iss_924_2.core.utils.UserType;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User user = new User();

    @Test
    public void getUserName() {
        user.setUserName("userNameTest");
        assertEquals("userNameTest", user.getUserName());
    }

    @Test
    public void getPassword() {
        user.setPassword("passwordTest");
        assertEquals("passwordTest", user.getPassword());
    }

    @Test
    public void getFirstName() {
        user.setFirstName("firstNameTest");
        assertEquals("firstNameTest", user.getFirstName());
    }

    @Test
    public void getLastName() {
        user.setLastName("lastNameTest");
        assertEquals("lastNameTest", user.getLastName());
    }

    @Test
    public void getUserType() {
        user.setUserType(UserType.Donor);
        assertEquals(UserType.Donor, user.getUserType());
    }

    @Test
    public void setUserName() {
        user.setUserName("userNameTest");
        assertEquals("userNameTest", user.getUserName());
    }

    @Test
    public void setPassword() {
        user.setPassword("passwordTest");
        assertEquals("passwordTest", user.getPassword());
    }

    @Test
    public void setFirstName() {
        user.setFirstName("firstNameTest");
        assertEquals("firstNameTest", user.getFirstName());
    }

    @Test
    public void setLastName() {
        user.setLastName("lastNameTest");
        assertEquals("lastNameTest", user.getLastName());
    }

    @Test
    public void setUserType() {
        user.setUserType(UserType.Donor);
        assertEquals(UserType.Donor, user.getUserType());
    }
}