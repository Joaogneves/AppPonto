package com.joao.ponto.controller;

import com.joao.ponto.dto.WorkloadDto;
import com.joao.ponto.entity.Workload;
import com.joao.ponto.service.impl.WorkLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "horarios")
public class WorkloadController {

    @Autowired
    private WorkLoadService service;

    @PostMapping
    public ResponseEntity<String> saveWorkLoad(@RequestBody Workload workLoad) {
        service.save(workLoad);
        return ResponseEntity.status(HttpStatus.CREATED).body("Hour saved");
    }

    @GetMapping
    public List<Workload> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<WorkloadDto> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(new WorkloadDto(service.findById(id)));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteTime(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }
}
