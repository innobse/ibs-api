package com.example.demo.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Description
 *
 * @author bse71
 * Created on 27.03.2022
 * @since
 */
@ApiModel(value="RejectEquipmentRequest", discriminator = "rejectEquipmentRequestDto")
@Schema(name = "RejectEquipmentRequest")
public class RejectEquipmentRequestDto {

    @JsonProperty
    @ApiModelProperty(
            name = "Идентификатор",
            example = "12"
    )
    @NotNull
    private Integer id;

    @JsonProperty
    @ApiModelProperty(name = "Причина отказа")
    @NotBlank
    private String reason;
}
