package com.cliff.rmi.config;

import com.cliff.rmi.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * User: Cliff
 */
@Configuration
@Profile( "rmi" )
public class RmiClientConfig {


    @Bean
    public RmiProxyFactoryBean userService() {
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceInterface( UserService.class );
        factoryBean.setServiceUrl( "rmi://localhost:1099/userService" );
        return factoryBean;
    }
}
