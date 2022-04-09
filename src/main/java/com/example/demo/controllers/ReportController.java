package com.example.demo.controllers;

import com.example.demo.controllers.dto.ReportDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.*;

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

    @ApiOperation("Посмотреть список отчетов")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            produces = APPLICATION_JSON_VALUE
    )
    public List<ReportDto> get(
            @RequestParam("pageNumber") Long page,
            @RequestParam("pageSize") Long countPerPage) {
        return null;
    }

    @ApiOperation("Посмотреть отчет")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            value = "/{id}",
            produces = APPLICATION_JSON_VALUE
    )
    public ReportDto get(@PathVariable("id") Long id) {
        return null;
    }

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

    @ApiOperation("Обновление отчета")
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

    @ApiOperation("Экспорт отчета в файл")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 200, message = "Запрос принят"),
                    @ApiResponse(code = 400, message = "Невалидный запрос"),
                    @ApiResponse(code = 500, message = "Внутренняя ошибка сервера")
            })
    @PostMapping(
            value = "download/{id}",
            produces = APPLICATION_OCTET_STREAM_VALUE
    )
    public byte[] get(
            @PathVariable("id") Long id,
            @RequestParam("format") String format) {

        //  Здесь допустимы html5 и pdf
        return null;
    }

}
