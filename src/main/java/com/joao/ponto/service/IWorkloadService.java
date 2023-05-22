package com.joao.ponto.service;

import com.joao.ponto.entity.Workload;

import java.util.List;

public interface IWorkloadService {
    public Workload save(Workload workload);
    //public List<Workload> findAll();
    //public Workload findById(Long id);
    public void delete(Long id);
}
