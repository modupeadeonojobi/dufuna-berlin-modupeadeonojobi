package com.dufuna.berlin.imodupsy.lekki;

import com.dufuna.berlin.imodupsy.lekki.model.LekkiProperty;
import com.dufuna.berlin.imodupsy.lekki.service.MockLekkiPropertyService;

import java.time.LocalDate;

/**
 * @author iModupsy
 * @created 29/06/2022
 */


public class MockLekkiPropertyApp {
    public static MockLekkiPropertyService mockLekkiPropertyService = new MockLekkiPropertyService();

    public static void main(String[] args) {

        saveLekkiProperty();
        getLekkiProperty();
    }

    public static LekkiProperty createLekkiProperty() {
        LekkiProperty lekkiProperty = new LekkiProperty();
        lekkiProperty.setPropertyId(1L);
        lekkiProperty.setPropertyAddress("Plot 234 Oscar way");
        lekkiProperty.setPropertyType("House");
        lekkiProperty.setNumberOfBedrooms(4L);
        lekkiProperty.setNumberOfSittingRooms(2L);
        lekkiProperty.setNumberOfKitchens(2L);
        lekkiProperty.setNumberOfBathrooms(8L);
        lekkiProperty.setNumberOfToilets(8L);
        lekkiProperty.setPropertyOwner("Jane Doe");
        lekkiProperty.setDescription("Red Duplex");
        lekkiProperty.setValidFrom(LocalDate.of(2022, 6, 26));
        lekkiProperty.setValidTo(LocalDate.of(2024, 6, 26));
        return lekkiProperty;
    }

    public static void saveLekkiProperty() {
        mockLekkiPropertyService.saveProperty(createLekkiProperty());
    }

    public static void getLekkiProperty() {
        mockLekkiPropertyService.getProperty();
    }
}
