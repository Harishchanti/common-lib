package com.ailiens.common;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;


@Slf4j
@Configuration
@EnableSwagger2
@ComponentScan("springfox")
@ConditionalOnProperty(name = "swagger.enabled", havingValue = "true")
public class SwaggerConfiguration {


    @Bean
    public Docket swaggerSpringfoxDocket(Swagger swagger) {
        log.debug("Starting Swagger");
        StopWatch watch = new StopWatch();
        watch.start();
        Contact contact = new Contact(
            swagger.getContactName(),
            swagger.getContactUrl(),
            swagger.getContactEmail());

        ApiInfo apiInfo = new ApiInfo(
            swagger.getTitle(),
            swagger.getDescription(),
            swagger.getVersion(),
            swagger.getTermsOfServiceUrl(),
            contact,
            swagger.getLicense(),
            swagger.getLicenseUrl());

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo)
            .forCodeGeneration(true)
            .genericModelSubstitutes(ResponseEntity.class)
            .ignoredParameterTypes(java.sql.Date.class)
            .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
            .directModelSubstitute(java.time.ZonedDateTime.class, Date.class)
            .directModelSubstitute(java.time.LocalDateTime.class, Date.class)
            .select()
            .paths(PathSelectors.regex(swagger.getIncludePattern()))
            .build();
        watch.stop();
        log.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
        return docket;
    }


}
