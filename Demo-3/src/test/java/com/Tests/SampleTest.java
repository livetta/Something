package com.Tests;

import com.User;
import org.junit.After;
import org.junit.Before;

import java.time.Duration;

public abstract class SampleTest
{

    public static User user;

    @Before
    public void setup()
    {
        user=new User();
        user.setup();
    }

    @After
    public void close()
    {
        user.driver.close();
    }
}
