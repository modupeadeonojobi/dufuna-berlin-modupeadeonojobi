package com.dufuna.berlin.imodupsy.lekki.service;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;

/**
 * @author iModupsy
 * @created 29/06/2022
 */
public interface LekkiPropertyService {

    void saveProperty(LekkiProperty lekkiProperty);

    LekkiProperty getProperty();
}
