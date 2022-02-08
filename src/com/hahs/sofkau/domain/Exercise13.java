package com.hahs.sofkau.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    Realizar un algoritmo que permita consulta la fecha y hora actual en el formato
    (AAAA/MM/DD) (HH:MM:SS)
 */
public class Exercise13 {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");

    public String getCurrentDate() {
        return now.format(formatter);
    }
}
