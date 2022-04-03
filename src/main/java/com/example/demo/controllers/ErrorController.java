package com.example.demo.controllers;

import com.example.demo.controllers.dto.ErrorDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Description
 *
 * @author bse71
 * Created on 27.03.2022
 * @since
 */
@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler({Exception.class})
    public ErrorDto error(Exception err) {
        return new ErrorDto(5, "lol");
    }
}
