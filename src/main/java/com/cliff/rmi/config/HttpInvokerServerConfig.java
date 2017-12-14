package com.cliff.rmi.config;

import com.cliff.rmi.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 * Configuration for Spring's HttpInvoker using the UserService
 *
 * User: Cliff
 */
@Configuration
@Profile( "http" )
public class HttpInvokerServerConfig {


    @Bean("/httpinvoker/user.service")
    public HttpInvokerServiceExporter userServiceExporter( UserService userService ) {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface( UserService.class );
        exporter.setService( userService );
        return exporter;
    }
}
