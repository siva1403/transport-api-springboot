package com.transfort.management.transport.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
public class SwaggerConfig {

//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.transfort.management.transport.controllers"))
//				.paths(PathSelectors.ant("/**")).build().apiInfo(apiInfo());
//	}
//
//	private ApiInfo apiInfo() {
//		return new ApiInfoBuilder().title("Transport Management Service").description("API:Endpoint description")
//				.contact(new Contact("Pushpa kumar", "", "medari@gmail.com")).license("Apache 2.0")
//				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.html").version("1.0.0").build();
//	}
	
	 @Bean
	    public GroupedOpenApi transportApi() {
	        return GroupedOpenApi.builder()
	                .group("transport-management")
	                .pathsToMatch("/**")
	                .build();
	    }
}
