package io.github.sachithariyathilaka.enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * Enum class for the handle operations.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
public enum OperationEnum {
    ADDITION("Addition"),
    SUBTRACTION("Subtraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division");

    private final String name;

    OperationEnum(String name) {
        this.name = name;
    }

    public boolean isEqual(String value) {
        return name.equals(value);
    }

    public String getValue() {
        return name;
    }

    public static OperationEnum lookUp(String name) {

        Optional<OperationEnum> instance = Arrays.stream(values()).filter(operationEnum -> operationEnum.getValue().equals(name)).findFirst();
        return instance.orElse(null);
    }
}
