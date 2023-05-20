package com.joao.ponto.controller;

import com.joao.ponto.dto.EmployeeDto;
import com.joao.ponto.dto.EmployeeMinDto;
import com.joao.ponto.dto.EmployeeToUpdateDto;
import com.joao.ponto.entity.Employee;
import com.joao.ponto.projection.EmployeeMinDtoProjection;
import com.joao.ponto.service.impl.EmployeeService;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/funcionarios")
public class EmployeeContoller {
    @Autowired
    private EmployeeService service;

    @PostMapping
    public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
        service.save(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee " + employee.getName() + " Saved");
    }

    @GetMapping
    public List<EmployeeMinDto> findAll() {
        return service.findAll().stream().map(EmployeeMinDto::new).toList();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable Long id) {
        Employee employee = service.findById(id);
        return ResponseEntity.ok().body(new EmployeeDto(employee));
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PatchMapping
    public ResponseEntity<Employee> update(@RequestParam(value = "funcionarioId") Long id, @RequestBody EmployeeToUpdateDto employeeToUpdateDto) {
        Employee employee = service.update(id, employeeToUpdateDto);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
