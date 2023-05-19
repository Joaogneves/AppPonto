package com.joao.ponto.dto;

import com.joao.ponto.entity.Employee;
import com.joao.ponto.entity.Workload;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    private String name;
    private String office;
    private String workplace;
    private List<Workload> workloads = new ArrayList<>();
    private Long id;

    public EmployeeDto(){}
    public EmployeeDto(Employee entity) {
        BeanUtils.copyProperties(entity, this);
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
}
