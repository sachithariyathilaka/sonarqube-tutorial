package com.sonarqube.tutorial.controller;

import com.sonarqube.tutorial.enums.OperationEnum;
import com.sonarqube.tutorial.service.CalculateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("calculate")
@RestController
public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/")
    public ResponseEntity<Integer> calculate(
            @RequestParam("operation") OperationEnum operation,
            @RequestParam("value1") int value1,
            @RequestParam("value2") int value2) {
        return new ResponseEntity<>(calculateService.calculate(operation, value1, value2), HttpStatus.OK);
    }
}
