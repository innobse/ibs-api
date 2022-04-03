package com.example.demo.controllers;

import com.example.demo.controllers.dto.EquipmentRequestDto;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Description
 *
 * @author bse71
 * Created on 27.03.2022
 * @since
 */
@RestController
@RequestMapping("/api/v1/equipment-request")
public class RequestController {

    @ApiOperation("Получение всех заявок на оборудование")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @GetMapping(
            produces = APPLICATION_JSON_VALUE
    )
    public List<EquipmentRequestDto> allRequests() {
        return new ArrayList<>();
    }

    @ApiOperation("Получение заявки по id")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @GetMapping(
            value = "/{id}",
            produces = APPLICATION_JSON_VALUE
    )
    public EquipmentRequestDto getOne(
            @PathVariable Long id) {
        return new EquipmentRequestDto();
    }

    @ApiOperation("Редактирование заявки")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PutMapping(
            value = "/{id}",
            consumes = APPLICATION_JSON_VALUE
    )
    public void update(
            @PathVariable Long id) {

    }

    @ApiOperation("Удаление заявки")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @DeleteMapping(
            value = "/{id}"
    )
    public void delete(
            @PathVariable Long id) {

    }

    @ApiOperation("Заявка на получение оборудования")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            consumes = APPLICATION_JSON_VALUE
    )
    public void newRequest(
            @RequestBody
            @ApiParam(value = "EquipmentRequest", required = true)
                    EquipmentRequestDto equipmentRequestDto) {
    }

    @ApiOperation("Удовлетворение заявки")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            value = "/{id}/approve",
            consumes = APPLICATION_JSON_VALUE
    )
    public void approve(
            @PathVariable Long id) {

    }

    @ApiOperation("Отказ по заявке")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping("/{id}/reject")
    public void reject(
            @PathVariable Long id) {

    }

}
