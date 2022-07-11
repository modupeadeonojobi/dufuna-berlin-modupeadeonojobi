package com.dufuna.berlin.imodupsy.tax.service.impl;

import com.dufuna.berlin.imodupsy.tax.model.TaxBracket;
import com.dufuna.berlin.imodupsy.tax.service.TaxCalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author iModupsy
 * @created 11/07/2022
 */
@Service
@RequiredArgsConstructor
public class TaxCalServiceImpl implements TaxCalService {

    @Override
    public BigDecimal calculateTax(double income) {
        TaxBracket bracket = new TaxBracket();
        double taxPayable = 0.0;

        if (income <= 0) {
            throw new IllegalArgumentException("Income can not be 0 or less than 0");
        } else if (income <= bracket.getTaxBracket1()) {
            taxPayable = income * bracket.getRate1();
        } else if (income <= bracket.getTaxBracket2()) {
            taxPayable = 987.50 + bracket.getRate2() * (income - bracket.getTaxBracket1());
        } else if (income <= bracket.getTaxBracket3()) {
            taxPayable = 4617.50 + bracket.getRate3() * (income - bracket.getTaxBracket2());
        } else if (income <= bracket.getTaxBracket4()) {
            taxPayable = 14605.50 + bracket.getRate4() * (income - bracket.getTaxBracket3());
        }
        return BigDecimal.valueOf(taxPayable).round(MathContext.DECIMAL32);
    }
}
