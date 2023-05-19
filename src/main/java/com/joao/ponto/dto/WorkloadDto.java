package com.joao.ponto.dto;

import com.joao.ponto.entity.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WorkloadDto {
    private LocalDateTime entrance;
    private LocalDateTime lunch;
    private LocalDateTime lunchReturn;

    private LocalDateTime departure;
    private LocalDate serviceDay;
    private Employee employee;

    private Long id;

    public WorkloadDto(){}

    public WorkloadDto(LocalDateTime entrance, LocalDateTime lunch, LocalDateTime lunchReturn, LocalDateTime departure, LocalDate serviceDay, Employee employee, Long id) {
        this.entrance = entrance;
        this.lunch = lunch;
        this.lunchReturn = lunchReturn;
        this.departure = departure;
        this.serviceDay = serviceDay;
        this.employee = employee;
        this.id = id;
    }

    public LocalDateTime getEntrance() {
        return entrance;
    }

    public void setEntrance(LocalDateTime entrance) {
        this.entrance = entrance;
    }

    public LocalDateTime getLunch() {
        return lunch;
    }

    public void setLunch(LocalDateTime lunch) {
        this.lunch = lunch;
    }

    public LocalDateTime getLunchReturn() {
        return lunchReturn;
    }

    public void setLunchReturn(LocalDateTime lunchReturn) {
        this.lunchReturn = lunchReturn;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
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
