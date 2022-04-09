package com.example.demo.controllers.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotBlank;
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
@ApiModel(value="EquipmentRequest", discriminator = "equipmentRequest")
@Schema(name = "EquipmentRequest")
public class EquipmentRequestDto {

    @JsonProperty
    @ApiModelProperty(
            name = "Идентификатор",
            example = "12"
    )
    @NotNull
    private Integer id;

    @JsonProperty
    @ApiModelProperty(
            name = "Наименование оборудования",
            example = "Бур педальный"
    )
    @NotBlank
    private String title;

    @JsonProperty
    @ApiModelProperty(
            name = "Тип оборудования",
            example = "underground-equipment"
    )
    @NotBlank
    private Type type;

    @JsonProperty
    @ApiModelProperty(
            name = "Требуемое количество",
            example = "3"
    )
    @NotNull
    private Integer amount;

    @JsonProperty
    @ApiModelProperty(name = "Дата")
    @NotNull
    private Date date;

    @JsonProperty
    @ApiModelProperty(name = "Обоснование")
    @NotBlank
    private String comment;

    @JsonProperty
    @ApiModelProperty(
            name = "Статус заявки",
            example = "underground-equipment"
    )
    private Status status;


    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public enum Status {
        PENDING("STATUS_PENDING"),
        REJECT("STATUS_REJECT"),
        APPROVE("STATUS_APPROVE");

        private static Map<String, Status> FORMAT_MAP = Stream
                .of(Status.values())
                .collect(toMap(s -> s.name, Function.<Status>identity()));

        private final String name;

        Status(String name) {
            this.name = name;
        }

        @JsonCreator
        public Status fromString(String string) {
            Status status = FORMAT_MAP.get(string);
            if (status == null) {
                throw new IllegalArgumentException(string + " has no corresponding value");
            }
            return status;
        }
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public enum Type {
        GROUND("ground-equipment"),
        UNDERGROUND("underground-equipment");

        private static Map<String, Type> FORMAT_MAP = Stream
                .of(Type.values())
                .collect(toMap(s -> s.name, Function.<Type>identity()));

        private final String name;

        Type(String name) {
            this.name = name;
        }

        @JsonCreator
        public Type fromString(String string) {
            Type type = FORMAT_MAP.get(string);
            if (type == null) {
                throw new IllegalArgumentException(string + " has no corresponding value");
            }
            return type;
        }
    }
}
