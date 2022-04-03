package com.example.demo.controllers.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Date;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/**
 * Description
 *
 * @author bse71
 * Created on 27.03.2022
 * @since
 */
@ApiModel(value="Credentials", discriminator = "credentials")
@Schema(name = "Credentials")
public class AuthDto {

    @JsonProperty
    @ApiModelProperty(name = "Логин")
    private String login;

    @JsonProperty
    @ApiModelProperty(name = "Пароль")
    private String pass;

}
