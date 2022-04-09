package com.example.demo.controllers.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
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
@ApiModel(value="ApproveEquipmentRequest", discriminator = "approveEquipmentRequestDto")
@Schema(name = "ApproveEquipmentRequest")
public class ApproveEquipmentRequestDto {

    @JsonProperty
    @ApiModelProperty(
            name = "Идентификатор",
            example = "12"
    )
    @NotNull
    private Integer id;

    @JsonProperty
    @ApiModelProperty(name = "Дата")
    @NotNull
    private Date date;
}
