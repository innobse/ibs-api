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
        value="WellValueTable",
        description="Well Value Table"
)
@Schema(
        name = "WellValueTable",
        title = "Well Value Table"
)
public class WellValueDto {

    @JsonProperty
    private float exploatingFund;

    @JsonProperty
    private float operatingFundTotal;

    @JsonProperty
    private float operatingFundExploit;

    @JsonProperty
    private float operatingFundDowntime;

    @JsonProperty
    private float withoutProductionTotal;

    @JsonProperty
    private float withoutProductionLastYear;

    @JsonProperty
    private float awaitingWellsTime;

}
