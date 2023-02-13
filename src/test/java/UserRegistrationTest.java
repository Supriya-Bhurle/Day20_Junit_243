import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    @Test
    public void firstNameTest_ShouldReturnTrue() {
        boolean value = UserRegistration.checkFirstName("Supriya");
        //test output
        assertEquals(true, value);
    }

    @Test
    public void lastNameTest2_ShouldReturnTrue() {
        boolean value = UserRegistration.checkLastName("Bhurle");
        assertEquals(true, value);
    }

    @Test
    public void emailTest3_ShouldReturnTrue() {
        boolean value = UserRegistration.checkEmail("abc.xyz@gmail.com");
        assertEquals(true, value);
    }

    @Test
    public void numberTest4_ShouldReturnTrue() {
        boolean value = UserRegistration.phoneNumber("91 9453786504");
        assertEquals(true, value);
    }

    @Test
    public void passWordTest5_ShouldReturnTrue() {
        boolean value = UserRegistration.passWord("Supriya@5213");
        assertEquals(true, value);
    }

}
