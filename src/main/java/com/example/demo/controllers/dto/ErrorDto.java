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
@ApiModel(value="Error", discriminator = "error")
@Schema(name = "Error")
@Data
@AllArgsConstructor
public class ErrorDto {

    @JsonProperty
    @ApiModelProperty(
            name = "Код ошибки"
    )
    private Integer code;

    @JsonProperty
    @ApiModelProperty(
            name = "Описание ошибки"
    )
    private String message;

}
