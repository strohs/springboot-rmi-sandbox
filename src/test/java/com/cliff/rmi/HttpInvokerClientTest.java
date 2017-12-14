package com.cliff.rmi;

import com.cliff.rmi.config.HttpInvokerClientConfig;
import com.cliff.rmi.domain.User;
import com.cliff.rmi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Integration test of the UserService using Spring's HttpInvoker RMI
 * The BootRmiSandboxApplication must be running first, so that the remote service is started
 *
 * User: Cliff
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration( classes = {HttpInvokerClientConfig.class})
@ActiveProfiles({"http"})
public class HttpInvokerClientTest {

    @Autowired
    UserService userService;

    @Test
    public void getAllUsers() throws Exception {
        int userCount = 3;
        System.out.println("HttpInvoker attempting get all users...");
        List<User> users = userService.getAllUsers();
        assertNotNull( users );
        assertThat( users.size(),is(userCount) );
    }

    @Test
    public void getRandomUser() {
        System.out.println("Random user....");
        User randomUser = userService.getRandomUser();
        assertNotNull( randomUser );
        System.out.println( randomUser );
    }
}
