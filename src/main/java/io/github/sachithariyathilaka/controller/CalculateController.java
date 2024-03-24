package io.github.sachithariyathilaka.controller;

import io.github.sachithariyathilaka.enums.OperationEnum;
import io.github.sachithariyathilaka.resource.APIResponse;
import io.github.sachithariyathilaka.service.CalculateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller layer for the organize rest endpoints.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/24
 */
@RequestMapping("/api/calculate")
@RestController
public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    /**
     * Endpoint for calculate two values.
     *
     * @param   operation the operation
     * @param   value1 the first value
     * @param   value2 the second value
     *
     * @return  the value
     */
    @GetMapping("/")
    public ResponseEntity<APIResponse<Integer>> calculate(
            @RequestParam("operation") OperationEnum operation,
            @RequestParam("value1") int value1,
            @RequestParam("value2") int value2) {

        APIResponse<Integer> apiResponse = new APIResponse<>(
                200,
                "Calculated successfully!",
                calculateService.calculate(operation, value1, value2));
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
