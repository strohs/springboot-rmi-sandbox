package com.cliff.rmi.config;

import com.cliff.rmi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Configuration for RmiServiceExporter
 * User: Cliff
 */
@Configuration
@Profile( "rmi" )
public class RmiServerConfig {

//    private UserService userService;
//
//    @Autowired
//    public RmiServerConfig( UserService userService ) {
//        this.userService = userService;
//    }

    @Bean
    public RmiServiceExporter userServiceExporter( UserService userService ) {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setRegistryPort( 1099 );
        exporter.setAlwaysCreateRegistry( true );
        exporter.setServiceName( "userService" );
        exporter.setServiceInterface( UserService.class );
        exporter.setService( userService );
        return exporter;
    }
}
