package br.com.erudio.services

import br.com.erudio.exceptions.ExceptionDivisionByZero
import org.springframework.stereotype.Service

@Service
class MathService {
    fun sun(numberOne: Double, numberTwo: Double) = numberOne + numberTwo
    fun sub(numberOne: Double, numberTwo: Double) = numberOne - numberTwo
    fun multi(numberOne: Double, numberTwo: Double) = numberOne * numberTwo
    fun mean(numberOne: Double, numberTwo: Double) = (numberOne + numberTwo) / 2
    fun sqrt(numberOne: Double) = kotlin.math.sqrt(numberOne)

    fun div(numberOne: Double, numberTwo: Double): Double {
        if (numberTwo == 0.0)
            throw ExceptionDivisionByZero("ZeroDivisionError: division by zero")
        return numberOne / numberTwo
    }

}