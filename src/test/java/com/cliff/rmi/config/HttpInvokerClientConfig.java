package com.cliff.rmi.config;

import com.cliff.rmi.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * Test client that uses HttpInvoker to call for RMI on the UserService
 * User: Cliff
 */
@Configuration
@Profile( "http" )
public class HttpInvokerClientConfig {

    @Bean
    public HttpInvokerProxyFactoryBean userService() {
        HttpInvokerProxyFactoryBean factoryBean = new HttpInvokerProxyFactoryBean();
        factoryBean.setServiceInterface( UserService.class );
        factoryBean.setServiceUrl( "http://localhost:8080/httpinvoker/user.service" );
        return factoryBean;
    }
}
