package com.joao.ponto.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "employee")
public class Employee {
    @Column(nullable = false, unique = true) private String name;
    @Column(nullable = false) private String office;
    @Column(nullable = false) private String workplace;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE, mappedBy = "employee")
    @Column(nullable = false) private List<Workload> workloads = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private Long id;

    public Employee(){}
    public Employee(String name, String office, String workplace, List<Workload> workloads, Long id) {
        this.name = name;
        this.office = office;
        this.workplace = workplace;
        this.workloads = workloads;
        this.id = id;
    }

    public Employee(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public List<Workload> getWorkloads() {
        return workloads;
    }

    public void setWorkloads(List<Workload> workloads) {
        this.workloads = workloads;
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
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static Employee createFromId(Long id) {
        return new Employee(id);
    }
}
