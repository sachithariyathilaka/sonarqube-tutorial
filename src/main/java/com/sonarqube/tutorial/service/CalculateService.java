package com.sonarqube.tutorial.service;

import com.sonarqube.tutorial.enums.OperationEnum;

public interface CalculateService {
    int calculate(OperationEnum operationEnum, int value1, int value2);
}
