package com.dufuna.berlin.imodupsy.lekki.service;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;
import com.dufuna.berlin.imodupsy.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

/**
 * @author iModupsy
 * @created 29/06/2022
 */
public class MockLekkiPropertyService implements LekkiPropertyService {

    SimpleLekkiPropertyRepositoryImpl propertyRepository = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty lekkiProperty) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        return propertyRepository.save(lekkiProperty);
    }

    @Override
    public LekkiProperty getProperty(Long id) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return propertyRepository.findById(id);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return propertyRepository.findAll();
    }
}
