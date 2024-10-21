package br.com.erudio.controllers

import br.com.erudio.exceptions.UnsupportedMathOperationException
import br.com.erudio.services.MathService
import br.com.erudio.utils.Utils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController(val mathService: MathService) {

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    fun sum(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo))
                throw UnsupportedMathOperationException("Please, set a numeric value")

        return mathService.sun(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo))
    }

    @GetMapping("/sub/{numberOne}/{numberTwo}")
    fun sub(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo))
                throw UnsupportedMathOperationException("Please, set a numeric value")

        return mathService.sub(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo))
    }

    @GetMapping("/multi/{numberOne}/{numberTwo}")
    fun multi(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo))
                throw UnsupportedMathOperationException("Please, set a numeric value")

        return mathService.multi(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo))
    }

    @GetMapping("/div/{numberOne}/{numberTwo}")
    fun div(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo))
                throw UnsupportedMathOperationException("Please, set a numeric value")

        return mathService.div(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo))
    }

    @GetMapping("/mean/{numberOne}/{numberTwo}")
    fun mean(@PathVariable(value = "numberOne") numberOne: String?,
            @PathVariable(value = "numberTwo") numberTwo: String?): Double {
        if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo))
                throw UnsupportedMathOperationException("Please, set a numeric value")

        return mathService.mean(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo))
    }

    @GetMapping("/sqrt/{number}")
    fun sqrt(@PathVariable(value = "number") number: String?): Double {
        if (!Utils.isNumeric(number))
                throw UnsupportedMathOperationException("Please, set a numeric value")

        return mathService.sqrt(Utils.convertToDouble(number))
    }
}