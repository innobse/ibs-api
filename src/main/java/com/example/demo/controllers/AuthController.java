package com.example.demo.controllers;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.controllers.dto.AuthDto;
import com.example.demo.controllers.dto.EquipmentRequestDto;
import com.example.demo.controllers.dto.TokenDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Description
 *
 * @author bse71
 * Created on 27.03.2022
 * @since
 */
@RestController
@RequestMapping("/api/v1/user")
public class AuthController {

    @ApiOperation("Авторизация пользователя")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            value = "/login",
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE
    )
    public TokenDto login(
            @RequestBody
            @ApiParam(value = "Credentials", required = true)
                    AuthDto authDto) {
        Algorithm algo = Algorithm.HMAC256("1234");
        return new TokenDto(
                JWT.create()
                        .withSubject("IBS")
                        .withClaim("roles", Collections.singletonList("ROLE_USER"))
                        .withExpiresAt(
                                new Date(System.currentTimeMillis() + 1000L * 3600))
                        .sign(algo));
    }

    @ApiOperation("Выход пользователя")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят")
            })
    @PostMapping("/logout")
    public void logout() {

    }

}
