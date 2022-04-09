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
@ApiModel(value="Report", discriminator = "report")
@Schema(name = "Report")
public class ReportDto {

    @JsonProperty
    private String organizationName;

    @JsonProperty
    private String organizationAddress;

    @JsonProperty
    private Integer okud;

    @JsonProperty
    private Integer okpo;
    
    @JsonProperty
    private String official;

    @JsonProperty
    private String fio;

    @JsonProperty
    private Long phoneNumber;

    @JsonProperty
    private String email;

    @JsonProperty
    private Long date;

    //Раздел 1. Добыча нефти, тонн
    @JsonProperty
    private OilExtractedValueDto standartPump;

    @JsonProperty
    private OilExtractedValueDto electricPump;

    @JsonProperty
    private OilExtractedValueDto compressor;

    @JsonProperty
    private OilExtractedValueDto fountainPump;

    @JsonProperty
    private OilExtractedValueDto otherPump;

    @JsonProperty
    private OilExtractedValueDto totalPumpExtracted;

    @JsonProperty
    private OilExtractedValueDto extractedOldWells;

    @JsonProperty
    private OilExtractedValueDto extractedLastYearWells;

    @JsonProperty
    private OilExtractedValueDto extractedNewWells;

    @JsonProperty
    private OilExtractedValueDto randomOilProduction;

    @JsonProperty
    private OilExtractedValueDto explorationWell;

    @JsonProperty
    private OilExtractedValueDto totalExtractedOil;

    //Раздел 2. Баланс календарного времени фонда нефтяных скважин, часов
    @JsonProperty
    private WellValueDto totalWellsBalans;

    @JsonProperty
    private WellValueDto newWellsBalans;

    //Раздел 3. Ввод в действие скважин, единиц
    @JsonProperty
    private CommissioningWellValueDto commissioningOilWell;

    @JsonProperty
    private CommissioningWellValueDto explorianOilWell;

    @JsonProperty
    private CommissioningWellValueDto commissioningPumpWell;

    @JsonProperty
    private CommissioningWellValueDto commissioningElectroPumpWell;

    @JsonProperty
    private CommissioningWellValueDto commissioningCompressorWell;

    @JsonProperty
    private CommissioningWellValueDto commissioningFountainPumpWell;

    @JsonProperty
    private CommissioningWellValueDto commissioningInjectionPumpWell;

    @JsonProperty
    private CommissioningWellValueDto commissioningInjectionPumpAfterOilWell;

    //Раздел 4. Добыча нефти из пластов, разрабатываемых с применением
    //методов искусственного воздействия на пласт, тонн
    @JsonProperty
    private ArtificialStimulationMethodsDto  totalImpact;

    @JsonProperty
    private ArtificialStimulationMethodsDto impactWaterInjection;

    @JsonProperty
    private ArtificialStimulationMethodsDto impactHydrodynamicMethods;

    @JsonProperty
    private ArtificialStimulationMethodsDto impactNewMethods;

    @JsonProperty
    private ArtificialStimulationMethodsDto impactNewPhysicoChemicalMethods;

    @JsonProperty
    private ArtificialStimulationMethodsDto impactNewThermalMethods;

    //Раздел 5. Фонд скважин на конец отчетного периода, единиц
    @JsonProperty
    private FundReportingPeriodDto fundReportingPeriod;

    //Раздел 6. Добыча нефтяного (попутного) газа, тысяч кубических метров
    @JsonProperty
    private ProductionAssociateGasDto productionAssociateGas;

    //Раздел 7. Движение нефти (включая газовый конденсат) с начала года, тонн
    @JsonProperty
    private OilMovementDto oilMovement;

    //Раздел 8. Подготовка нефти (включая газовый конденсат), тонн
    @JsonProperty
    private OilPreparationDto oilPreparation;
}
