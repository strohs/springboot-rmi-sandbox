package com.cliff.rmi.config;

import com.cliff.rmi.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * hessian client used to invoke the UserService in our test cases
 * User: Cliff
 */
@Configuration
@Profile("hessian")
public class HessianClientConfig {

    @Bean
     public HessianProxyFactoryBean userService() {
        HessianProxyFactoryBean factoryBean = new HessianProxyFactoryBean();
        factoryBean.setServiceInterface( UserService.class );
        factoryBean.setServiceUrl( "http://localhost:8080/hessian/user.service" );
        return factoryBean;
     }
}
