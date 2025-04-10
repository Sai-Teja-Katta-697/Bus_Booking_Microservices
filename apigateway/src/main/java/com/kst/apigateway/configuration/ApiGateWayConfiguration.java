package com.kst.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGateWayConfiguration {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p->p.path("/get")
                        .filters(f->f.addRequestHeader("MyHeader", "MyURI"))
                        .uri("http://httpbin.org:80"))
                .route("seat-booking-details", r -> r.path("/seat-booking-details/**")
                        .uri("lb://seat-booking-details"))
                .route("booking-service", r -> r.path("/booking-service/**")
                        .uri("lb://booking-service"))
                .build();
    }
}
