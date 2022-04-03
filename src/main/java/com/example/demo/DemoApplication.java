package com.example.demo;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.Date;

@SpringBootApplication
@EnableSwagger2
@EnableWebMvc
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        Algorithm algo = Algorithm.HMAC256("1234");
        System.out.println(JWT.create()
                .withSubject("IBS")
                .withClaim("roles", Collections.singletonList("ROLE_USER"))
                .withExpiresAt(
                        new Date(System.currentTimeMillis() + 1000L * 3600))
                .sign(algo));
    }

}
