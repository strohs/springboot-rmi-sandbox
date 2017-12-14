package com.cliff.rmi.config;

import com.cliff.rmi.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * Hessian version of the UserService
 * User: Cliff
 */
@Configuration
@Profile("hessian")
public class HessianServerConfig {

    @Bean("/hessian/user.service")
    public HessianServiceExporter userServiceExporter( UserService userService ) {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService( userService );
        exporter.setServiceInterface( UserService.class );
        return exporter;
    }
}
