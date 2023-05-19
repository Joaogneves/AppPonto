package com.joao.ponto.dto;

import com.joao.ponto.entity.Employee;

import java.time.LocalDate;
import java.time.LocalTime;

public class WorkloadDto {
    private LocalTime entrance;
    private LocalTime lunch;
    private LocalTime lunchReturn;

    private LocalTime departure;
    private LocalDate serviceDay;
    private Employee employee;

    private Long id;

    public WorkloadDto(){}

    public WorkloadDto(LocalTime entrance, LocalTime lunch, LocalTime lunchReturn, LocalTime departure, LocalDate serviceDay, Employee employee, Long id) {
        this.entrance = entrance;
        this.lunch = lunch;
        this.lunchReturn = lunchReturn;
        this.departure = departure;
        this.serviceDay = serviceDay;
        this.employee = employee;
        this.id = id;
    }

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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
