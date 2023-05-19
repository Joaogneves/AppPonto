package com.joao.ponto.repository;

import com.joao.ponto.entity.Workload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkloadRepository extends JpaRepository<Workload, Long> {
}
