package com.joao.ponto.repository;

import com.joao.ponto.entity.Workload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WorkloadRepository extends JpaRepository<Workload, Long> {
    @Query(value = "SELECT * FROM WORKLOAD WHERE EMPLOYEE_ID = :employeeId", nativeQuery = true)
    public List<Workload> findAllByEmployee(Long employeeId);
}
