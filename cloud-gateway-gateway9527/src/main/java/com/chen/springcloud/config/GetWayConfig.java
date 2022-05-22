package com.chen.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenfl
 * @create 2021-01-15-9:53
 */
@Configuration
public class GetWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_chen", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();    //http://localhost:9527/guonei

        return routes.build();
    }

}
