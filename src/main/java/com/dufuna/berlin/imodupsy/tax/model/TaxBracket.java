package com.dufuna.berlin.imodupsy.tax.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author iModupsy
 * @created 11/07/2022
 */

@Data
@NoArgsConstructor
public class TaxBracket {

    private double taxBracket1 = 18200;

    private double taxBracket2 = 37000;

    private double taxBracket3 = 90000;

    private double taxBracket4 = 180000;

    private double rate1 = 0.19;

    private double rate2 = 0.325;

    private double rate3 = 0.37;

    private double rate4 = 0.45;

}
