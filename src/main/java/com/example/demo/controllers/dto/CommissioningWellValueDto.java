package com.example.demo.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Description
 *
 * @author bse71
 * Created on 04.04.2022
 * @since
 */
@ApiModel(
        value="CommissioningWellTable",
        description="Commissioning Well Table"
)
@Schema(
        name = "CommissioningWellTable",
        title = "Commissioning Well Table"
)
public class CommissioningWellValueDto {

    @JsonProperty
    private int totalCommissioningNewWellValue;

    @JsonProperty
    private int afterDrillingWellValue;

    @JsonProperty
    private int conservationWellValue;

    @JsonProperty
    private int otherWellValue;

    @JsonProperty
    private int lastYearWellValue;
}
