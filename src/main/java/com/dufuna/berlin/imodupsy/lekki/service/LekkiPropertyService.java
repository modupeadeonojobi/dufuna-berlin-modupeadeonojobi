package com.dufuna.berlin.imodupsy.lekki.service;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;

import java.util.List;

/**
 * @author iModupsy
 * @created 29/06/2022
 */
public interface LekkiPropertyService {

    LekkiProperty saveProperty(LekkiProperty lekkiProperty);

    LekkiProperty getProperty(Long id);

    List<LekkiProperty> getProperties();
}
