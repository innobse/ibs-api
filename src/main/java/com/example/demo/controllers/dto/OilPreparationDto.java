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
        value="OilPreparationTable",
        description="Oil Preparation Table"
)
@Schema(
        name = "OilPreparationTable",
        title = "Oil Preparation Table"
)
public class OilPreparationDto {

    @JsonProperty
    private double liquidIntake;

    @JsonProperty
    private double receivedOil;

    @JsonProperty
    private double preparedOil;

    @JsonProperty
    private double oilLosses;
}
