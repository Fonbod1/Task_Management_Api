package com.KF48.ToDo.List.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@EnableOpenApi
@Configuration
public class swaggerConfiguration {
    @Bean
    OpenAPI myConfiguratio(){
        return  new OpenAPI().info(new Info()
                .title("TODO LIST API")
                .version("1.0")
                .description("A spring Boot API Which Uses CRUD To Perform Operation On A  TODO LIST API,   " +
                              "Below Is The Different EndPoint Operations Within The TODO LIST API")
        );
    }
}
