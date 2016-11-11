package com.cloud.registry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

import static org.springframework.boot.SpringApplication.run

@EnableEurekaServer
@SpringBootApplication
class BootApplication {

    static void main(String[] args) {
        run BootApplication, args
    }
}
