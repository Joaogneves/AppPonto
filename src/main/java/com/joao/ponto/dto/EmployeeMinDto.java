package com.joao.ponto.dto;

import com.joao.ponto.entity.Employee;
import com.joao.ponto.entity.Workload;
import com.joao.ponto.projection.EmployeeMinDtoProjection;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMinDto {
    private String name;
    private String office;
    private String workplace;
    private Long id;

    public EmployeeMinDto(){}

    public EmployeeMinDto(String name, String office, String workplace, Long id) {
        this.name = name;
        this.office = office;
        this.workplace = workplace;
        this.id = id;
    }

  /*  public EmployeeMinDto(EmployeeMinDtoProjection projection){
        name = projection.getName();
        office = projection.getOffice();
        workplace = projection.getWorkplace();
        id = projection.getId();
    }*/

    public EmployeeMinDto(Employee employee) {
        BeanUtils.copyProperties(employee, this);
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
