package com.dufuna.berlin.imodupsy.tax.controller;

import com.dufuna.berlin.imodupsy.tax.constant.ApiRoute;
import com.dufuna.berlin.imodupsy.tax.dto.TaxRequestDto;
import com.dufuna.berlin.imodupsy.tax.service.TaxCalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author iModupsy
 * @created 11/07/2022
 */
@RestController
@CrossOrigin
@RequestMapping(value = ApiRoute.API + ApiRoute.TAX)
@RequiredArgsConstructor
public class TaxController {
    private final TaxCalService taxCalService;

    @PostMapping(value = ApiRoute.CALCULATE)
    public ResponseEntity<?> createCase(@RequestBody TaxRequestDto taxRequestDto) {
        return new ResponseEntity<>(taxCalService.calculateTax(taxRequestDto.getIncome()), HttpStatus.OK);
    }
}
