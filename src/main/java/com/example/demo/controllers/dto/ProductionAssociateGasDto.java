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
        value="ProductionAssociateGasTable",
        description="Production Associate Gas Table"
)
@Schema(
        name = "ProductionAssociateGasTable",
        title = "Production Associate Gas Table"
)
public class ProductionAssociateGasDto {

    @JsonProperty
    private double factGasProduction;

    @JsonProperty
    private double consumptionGas;

    @JsonProperty
    private double technologicalLosses;

    @JsonProperty
    private double burnedGas;
}
