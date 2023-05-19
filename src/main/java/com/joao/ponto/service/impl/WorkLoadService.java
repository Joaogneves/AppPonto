package com.joao.ponto.service.impl;

import com.joao.ponto.entity.Workload;
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


    @Override
    public Workload save(Workload workload) {
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
}
