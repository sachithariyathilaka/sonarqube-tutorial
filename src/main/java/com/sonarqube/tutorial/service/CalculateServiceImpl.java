package com.sonarqube.tutorial.service;

import com.sonarqube.tutorial.enums.OperationEnum;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

    @Override
    public int calculate(OperationEnum operationEnum, int value1, int value2) {
        switch (operationEnum)
        {
            case ADDITION -> {
                return value1 + value2;
            }

            case SUBTRACTION -> {
                return value1 - value2;
            }

            case MULTIPLICATION -> {
                return value1 * value2;
            }

            case DIVISION -> {
                return value1 / value2;
            }
        }

        return 0;
    }
}
