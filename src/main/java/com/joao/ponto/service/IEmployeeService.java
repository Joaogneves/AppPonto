package com.joao.ponto.service;

import com.joao.ponto.dto.EmployeeMinDto;
import com.joao.ponto.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public Employee save(Employee employee);
    public List<Employee> findAll();
    public Employee findById(Long id);
    public void delete(Long id);
}
