package com.example.demo.controllers;

import com.example.demo.controllers.dto.ReportDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Description
 *
 * @author bse71
 * Created on 27.03.2022
 * @since
 */
@RestController
@RequestMapping("/api/v1/report")
public class ReportController {

    @ApiOperation("Подача отчета")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            consumes = APPLICATION_JSON_VALUE
    )
    public void report(
            @RequestBody
            @ApiParam(value = "Report", required = true)
                    ReportDto reportDto) {

    }

    @ApiOperation("Подача отчета")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PutMapping(
            consumes = APPLICATION_JSON_VALUE
    )
    public void update(
            @RequestBody
            @ApiParam(value = "Report", required = true)
                    ReportDto reportDto) {

    }

}
