package tests;


import org.junit.Test;
import pojos.UserPojo;
import steps.UserSteps;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class CheckExistanceOfUserTest
{
    List<UserPojo> users = UserSteps.getUsers();
    @Test
    public void checkIfUserExistByEmail()
    {
        assertThat(users).extracting(UserPojo:: getEmail).contains("Shanna@melissa.tv");
    }

    @Test
    public void checkIfUserExistByName()
    {
        assertThat(users).extracting(UserPojo:: getName).contains("Ervin Howell");
    }

    @Test
    public void checkIfUserExistByUsername ()
    {
        assertThat(users).extracting(UserPojo:: getUsername).contains("Moriah.Stanton");
    }




}
