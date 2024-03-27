package io.github.sachithariyathilaka.service;

import io.github.sachithariyathilaka.enums.OperationEnum;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Service implementation layer for the calculated functionalities.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
@Service
public class CalculateServiceImpl implements CalculateService {

    @Override
    public int calculate(String operation, int value1, int value2) {

        switch (Objects.requireNonNull(OperationEnum.lookUp(operation)))
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
