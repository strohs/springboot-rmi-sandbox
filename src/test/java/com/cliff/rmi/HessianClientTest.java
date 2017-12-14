package com.cliff.rmi;

import com.cliff.rmi.config.HessianClientConfig;
import com.cliff.rmi.domain.User;
import com.cliff.rmi.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests the hessian client using UserService as the remote service
 * The BootRmiSandboxApplication must be running first before running this test
 * User: Cliff
 */
@RunWith(SpringRunner.class)
@ContextConfiguration( classes = {HessianClientConfig.class})
@ActiveProfiles("hessian")
public class HessianClientTest {

    @Autowired
    UserService userService;

    @Test
    public void getAllUsersTest() {
        System.out.println("Hessian get all users....");
        List<User> users = userService.getAllUsers();
        assertThat( users, is( notNullValue() ) );
        assertThat( users.size(), is( 3) );
    }
}
