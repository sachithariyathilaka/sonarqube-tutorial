package io.github.sachithariyathilaka.service;

import io.github.sachithariyathilaka.enums.OperationEnum;

/**
 * Service layer for the calculate functionalities.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
public interface CalculateService {
    int calculate(OperationEnum operationEnum, int value1, int value2);
}
