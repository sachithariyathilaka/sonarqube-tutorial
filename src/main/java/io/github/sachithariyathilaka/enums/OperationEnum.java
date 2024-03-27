package io.github.sachithariyathilaka.enums;

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

        if (OperationEnum.ADDITION.isEqual(name))
            return OperationEnum.ADDITION;
        else if (OperationEnum.SUBTRACTION.isEqual(name))
            return OperationEnum.SUBTRACTION;
        else if (OperationEnum.MULTIPLICATION.isEqual(name))
            return OperationEnum.MULTIPLICATION;
        else if (OperationEnum.DIVISION.isEqual(name))
            return OperationEnum.DIVISION;
        else
            return null;
    }
}
