package com.dufuna.berlin.imodupsy.lekki;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;
import com.dufuna.berlin.imodupsy.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.imodupsy.lekki.service.MockLekkiPropertyService;

/**
 * @author iModupsy
 * @created 29/06/2022
 */


public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiPropertyService service = new MockLekkiPropertyService();
        String[] propertyType = { "Duplex", "Flat", "Bungalow", "Semi-detached"};
        String[] propertyAddress = { "John Paul avenue", "Maria close", "Pure haven way", "Dan Close"};

        for (int i = 0; i < propertyAddress.length; i++) {
            LekkiProperty property = new LekkiProperty((long) i, propertyAddress[i], propertyType[i]);
            service.saveProperty(property);
            System.out.println(service.getProperty((long) i));
        }
        System.out.println(service.getProperties());
    }



}
