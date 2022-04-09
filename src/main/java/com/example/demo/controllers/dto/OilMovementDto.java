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
        value="OilMovementTable",
        description="Oil Movement Table"
)
@Schema(
        name = "OilMovementTable",
        title = "Oil Movement Table"
)
public class OilMovementDto {

    @JsonProperty
    private double remainsBeginning;

    @JsonProperty
    private double extracted;

    @JsonProperty
    private double received;

    @JsonProperty
    private double total;

    @JsonProperty
    private double expenditureOnNeeds;

    @JsonProperty
    private double lossesTotal;

    @JsonProperty
    private double passedTotal;

    @JsonProperty
    private double oilGasFactory;

    @JsonProperty
    private double gasFactory;

    @JsonProperty
    private double handedOil;

    @JsonProperty
    private double export;

    @JsonProperty
    private double drilling;

    @JsonProperty
    private double otherMineFactory;

    @JsonProperty
    private double otherFactory;

    @JsonProperty
    private double totalExpense;

    @JsonProperty
    private double remainsEnd;

    @JsonProperty
    private double remainsEndOilPipelinesAndTanks;

    @JsonProperty
    private String transcriptAmountOil;
}
