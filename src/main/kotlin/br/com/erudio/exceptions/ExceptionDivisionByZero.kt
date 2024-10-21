package br.com.erudio.exceptions

import java.lang.RuntimeException

class ExceptionDivisionByZero (exception: String?): RuntimeException(exception) {}