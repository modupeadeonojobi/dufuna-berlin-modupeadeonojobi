package com.dufuna.berlin.imodupsy.tax.service;

import java.math.BigDecimal;

/**
 * @author iModupsy
 * @created 11/07/2022
 */
public interface TaxCalService {
    BigDecimal calculateTax(double income);
}
