package com.joao.ponto.service.impl;

import com.joao.ponto.dto.WorkloadToUpdateDto;
import com.joao.ponto.entity.Employee;
import com.joao.ponto.entity.Workload;
import com.joao.ponto.repository.EmployeeRepository;
import com.joao.ponto.repository.WorkloadRepository;
import com.joao.ponto.service.IWorkloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkLoadService implements IWorkloadService {
    @Autowired
    private WorkloadRepository repository;

    @Autowired
    private EmployeeService service;
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Workload save(Workload workload) {
        workload.setEmployee(service.findById(workload.getEmployee().getId()));
        return repository.save(workload);
    }

    @Override
    public List<Workload> findAll() {
        return repository.findAll();
    }

    @Override
    public Workload findById(Long id) {
        return repository.findById(id).orElseThrow();
    }
    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Workload update(Long id, WorkloadToUpdateDto workloadToUpdateDto) {
        Workload workload = repository.findById(id).orElseThrow();
        workload.setDeparture(workloadToUpdateDto.getDeparture());
        workload.setEntrance(workloadToUpdateDto.getEntrance());
        workload.setLunch(workloadToUpdateDto.getLunch());
        workload.setLunchReturn(workloadToUpdateDto.getLunchReturn());
        workload.setServiceDay(workloadToUpdateDto.getServiceDay());
        return repository.save(workload);
    }
    public List<Workload> findAllByEmployee(Long employeeId) {
        Employee employee = service.findById(employeeId);
        return repository.findAllByEmployee(employeeId);
    }
}
