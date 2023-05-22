package com.joao.ponto.entity;

import com.joao.ponto.dto.WorkloadDto;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Table(name = "workload")
public class Workload {
    @Column(nullable = false) private LocalTime entrance;
    @Column(nullable = false) private LocalTime lunch;
    @Column(nullable = false) private LocalTime lunchReturn;
    @Column(nullable = false) private LocalTime departure;
    @Column(nullable = false) private LocalDate serviceDay;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Workload(){}
    public Workload(LocalTime entrance, LocalTime lunch, LocalTime lunchReturn, LocalTime departure, LocalDate day, Employee employee, Long id) {
        this.entrance = entrance;
        this.lunch = lunch;
        this.lunchReturn = lunchReturn;
        this.departure = departure;
        this.serviceDay = day;
        this.employee = employee;
        this.id = id;
    }

    public Workload(WorkloadDto workloadDto) {
        BeanUtils.copyProperties(workloadDto, this);
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
