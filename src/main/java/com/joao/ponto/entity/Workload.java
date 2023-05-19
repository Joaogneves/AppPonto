package com.joao.ponto.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "workload")
public class Workload {
    @Column(nullable = false) private LocalDateTime entrance;
    @Column(nullable = false) private LocalDateTime lunch;
    @Column(nullable = false) private LocalDateTime lunchReturn;
    @Column(nullable = false) private LocalDateTime departure;
    @Column(nullable = false) private LocalDate serviceDay;
    @ManyToOne
    private Employee employee;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Workload(){}
    public Workload(LocalDateTime entrance, LocalDateTime lunch, LocalDateTime lunchReturn, LocalDateTime departure, LocalDate day, Employee employee, Long id) {
        this.entrance = entrance;
        this.lunch = lunch;
        this.lunchReturn = lunchReturn;
        this.departure = departure;
        this.serviceDay = day;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workload workload = (Workload) o;
        return Objects.equals(id, workload.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
