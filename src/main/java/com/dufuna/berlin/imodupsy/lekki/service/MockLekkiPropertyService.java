package com.dufuna.berlin.imodupsy.lekki.service;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;

/**
 * @author iModupsy
 * @created 29/06/2022
 */
public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public void saveProperty(LekkiProperty lekkiProperty) {
        System.out.println("MockLekkiPropertyService.saveProperty called");

    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
