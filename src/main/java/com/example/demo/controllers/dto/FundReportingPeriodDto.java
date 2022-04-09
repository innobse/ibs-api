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
        value="FundReportingPeriodTable",
        description="Fund Reporting Period Table"
)
@Schema(
        name = "FundReportingPeriodTable",
        title = "Fund Reporting Period Table"
)
public class FundReportingPeriodDto {

    @JsonProperty
    private int givingOilAndGas;

    @JsonProperty
    private int stoppedLastMonth;

    @JsonProperty
    private int totalOperating;

    @JsonProperty
    private int notGiveProductLastMonth;

    @JsonProperty
    private int awaitingAfterDrilling;

    @JsonProperty
    private int awaitingDrillingNow;

    @JsonProperty
    private int entireOperationalFund;

    @JsonProperty
    private int telemechanizedFund;

    @JsonProperty
    private int givingWaterWell;

    @JsonProperty
    private int injectionGivingWaterWell;

    @JsonProperty
    private int currentGivingWaterWell;

    @JsonProperty
    private int controlGivingWaterWell;

    @JsonProperty
    private int absorbingWell;

    @JsonProperty
    private int inConservationWell;

    @JsonProperty
    private int inAwaitingLiquidationWell;

    @JsonProperty
    private int liquidatedAfterOperationWell;

    @JsonProperty
    private int liquidatedAfterDrillingWell;


    @JsonProperty
    private int arrivedWell;

    @JsonProperty
    private int droppedWell;
}
