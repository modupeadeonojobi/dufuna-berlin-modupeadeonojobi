package com.dufuna.berlin.imodupsy.lekki.repository;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author iModupsy
 * @created 29/06/2022
 */
public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {

    Map<Long, LekkiProperty> lekkiPropertyHashMap = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty lekkiProperty) {
        Long propertyId = lekkiProperty.getPropertyId();
        lekkiPropertyHashMap.put(propertyId, lekkiProperty);
        return lekkiProperty;
    }

    @Override
    public LekkiProperty findById(Long id) {
        return lekkiPropertyHashMap.get(id);
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(lekkiPropertyHashMap.values());
    }

    @Override
    public void update(LekkiProperty lekkiProperty) {
        Long lekkiPropertyId = lekkiProperty.getPropertyId();
        for (Map.Entry<Long, LekkiProperty> property : lekkiPropertyHashMap.entrySet()) {
            if (lekkiPropertyId == property.getKey()) {
                lekkiPropertyHashMap.put(lekkiPropertyId, lekkiProperty);
            }
        }
    }
}
