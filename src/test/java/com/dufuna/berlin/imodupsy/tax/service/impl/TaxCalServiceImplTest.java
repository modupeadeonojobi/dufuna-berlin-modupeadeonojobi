package com.dufuna.berlin.imodupsy.tax.service.impl;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author iModupsy
 * @created 11/07/2022
 */
class TaxCalServiceImplTest {

    private TaxCalServiceImpl service = new TaxCalServiceImpl();


    @Test
    void incomeIsZero_ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.calculateTax(0);
        });
    }

    @Test
    void incomeIs50000_ShouldBeEqualToExpectedOutcome() {
        BigDecimal expectedOutcome = new BigDecimal(9427.5);
        assertEquals(expectedOutcome, service.calculateTax(50000));

    }

    @Test
    void incomeIs18200_ShouldBeEqualToExpectedOutcome() {
        BigDecimal expectedOutcome = new BigDecimal(3458.0);
        assertEquals(expectedOutcome, service.calculateTax(18200));

    }

    @Test
    void incomeIs37000_ShouldBeEqualToExpectedOutcome() {
        BigDecimal expectedOutcome = new BigDecimal(7097.5);
        assertEquals(expectedOutcome, service.calculateTax(37000));

    }

    @Test
    void incomeIs90000_ShouldBeEqualToExpectedOutcome() {
        BigDecimal expectedOutcome = new BigDecimal(24227.5);
        assertEquals(expectedOutcome, service.calculateTax(90000));

    }

    @Test
    void incomeIs180000_ShouldBeEqualToExpectedOutcome() {
        BigDecimal expectedOutcome = new BigDecimal(55105.5);
        assertEquals(expectedOutcome, service.calculateTax(180000));

    }

}