package com.example.demo.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Description
 *
 * @author bse71
 * Created on 27.03.2022
 * @since
 */
@ApiModel(value="Token", discriminator = "token")
@Schema(name = "Token")
@Data
@AllArgsConstructor
public class TokenDto {

    @JsonProperty
    @ApiModelProperty(
            name = "Токен",
            example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJJQlMiLCJyb2xlcyI6WyJST0xFX1VTRVIiXSwiZXhwIjoxNjQ4Mzk5NDkyfQ.Ff1hDO0UQH_3ISeT45sH9Wkk74E-p-hVXXeEEw8brKM")
    private String token;

}
