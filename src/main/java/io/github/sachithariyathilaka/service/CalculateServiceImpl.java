package io.github.sachithariyathilaka.service;

import io.github.sachithariyathilaka.enums.OperationEnum;
import org.springframework.stereotype.Service;

/**
 * Service implementation layer for the calculate functionalities.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
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
