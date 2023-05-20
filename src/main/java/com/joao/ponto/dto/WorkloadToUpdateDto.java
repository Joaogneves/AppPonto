package com.joao.ponto.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class WorkloadToUpdateDto {
    private LocalTime entrance;
    private LocalTime lunch;
    private LocalTime lunchReturn;

    private LocalTime departure;
    private LocalDate serviceDay;

    public LocalTime getEntrance() {
        return entrance;
    }

    public void setEntrance(LocalTime entrance) {
        this.entrance = entrance;
    }

    public LocalTime getLunch() {
        return lunch;
    }

    public void setLunch(LocalTime lunch) {
        this.lunch = lunch;
    }

    public LocalTime getLunchReturn() {
        return lunchReturn;
    }

    public void setLunchReturn(LocalTime lunchReturn) {
        this.lunchReturn = lunchReturn;
    }

    public LocalTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    public LocalDate getServiceDay() {
        return serviceDay;
    }

    public void setServiceDay(LocalDate serviceDay) {
        this.serviceDay = serviceDay;
    }
}
