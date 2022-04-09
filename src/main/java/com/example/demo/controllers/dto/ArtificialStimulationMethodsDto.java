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
        value="ArtificialStimulationMethodsTable",
        description="Artificial Stimulation Methods Table"
)
@Schema(
        name = "ArtificialStimulationMethodsTable",
        title = "Artificial Stimulation Methods Table"
)
public class ArtificialStimulationMethodsDto {

    @JsonProperty
    private double impactFormation;

    @JsonProperty
    private double increaseProduction;
}
