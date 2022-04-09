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
        value="OilExtractedTable",
        description="Oil Extracted Table"
)
@Schema(
        name = "OilExtractedTable",
        title = "Oil Extracted Table"
)
public class OilExtractedValueDto {

    @JsonProperty
    private double yearProduction;

    @JsonProperty
    private double countedMounth;

    @JsonProperty
    private double uncountedMonth;

    @JsonProperty
    private double averageDebit;

    @JsonProperty
    private double numberOfWells;

    @JsonProperty
    private double extractedFromWells;
}
