package com.dufuna.berlin.imodupsy.lekki.repository;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;

import java.util.List;

/**
 * @author iModupsy
 * @created 29/06/2022
 */
public interface SimpleLekkiPropertyRepository {

    LekkiProperty save(LekkiProperty lekkiProperty);

    LekkiProperty findById(Long id);

    List<LekkiProperty> findAll();

    void update(LekkiProperty lekkiProperty);

}
