package com.joao.ponto.controller;

import com.joao.ponto.entity.Workload;
import com.joao.ponto.service.impl.WorkLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping(value = "horarios")
public class WorkloadController {

    @Autowired
    private WorkLoadService service;

    @PostMapping
    public ResponseEntity<String> saveWorkLoad(@RequestBody Workload workLoad) {
        service.save(workLoad);
        return ResponseEntity.ok().body("Hour saved");
    }
}
