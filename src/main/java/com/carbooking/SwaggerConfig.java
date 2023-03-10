package com.carbooking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.carbooking.web"))
                .paths(regex("/*.*"))
                .build()
                .apiInfo(metaData());
    }
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Go Cheeta",
                "REST API for Go Cheeta",
                "1.0",
                "Terms of service",
                new Contact("Go Cheeta", "http://gocheeta.com/about/", "gocheeta@gmail.com"),
               "Test License 2.0",
                "http://www.gocheeta.com/licenses/TEST-LICENSE-2.0");
        return apiInfo;
    }
}
