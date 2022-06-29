package com.dufuna.berlin.imodupsy.lekki.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author iModupsy
 * @created 29/06/2022
 */
public class LekkiProperty {

    private Long propertyId;

    private String propertyAddress;

    private String PropertyType;

    private Long numberOfBedrooms;

    private Long numberOfSittingRooms;

    private Long numberOfKitchens;

    private Long numberOfBathrooms;

    private Long numberOfToilets;

    private String propertyOwner;

    private String description;

    private LocalDate validFrom;

    private LocalDate validTo;

    public LekkiProperty() {
    }

    public LekkiProperty(Long propertyId, String propertyAddress, String propertyType) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        PropertyType = propertyType;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return PropertyType;
    }

    public void setPropertyType(String propertyType) {
        PropertyType = propertyType;
    }

    public Long getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(Long numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Long getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(Long numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public Long getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(Long numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public Long getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(Long numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public Long getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(Long numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    @Override
    public String toString() {
        return "LekkiProperty{" +
                "propertyId=" + propertyId +
                ", propertyAddress='" + propertyAddress + '\'' +
                ", PropertyType='" + PropertyType + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LekkiProperty)) return false;
        LekkiProperty that = (LekkiProperty) o;
        return Objects.equals(getPropertyId(), that.getPropertyId()) &&
                Objects.equals(getPropertyAddress(), that.getPropertyAddress()) &&
                Objects.equals(getPropertyType(), that.getPropertyType()) &&
                Objects.equals(getNumberOfBedrooms(), that.getNumberOfBedrooms()) &&
                Objects.equals(getNumberOfSittingRooms(), that.getNumberOfSittingRooms()) &&
                Objects.equals(getNumberOfKitchens(), that.getNumberOfKitchens()) &&
                Objects.equals(getNumberOfBathrooms(), that.getNumberOfBathrooms()) &&
                Objects.equals(getNumberOfToilets(), that.getNumberOfToilets()) &&
                Objects.equals(getPropertyOwner(), that.getPropertyOwner()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getValidFrom(), that.getValidFrom()) &&
                Objects.equals(getValidTo(), that.getValidTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyId(), getPropertyAddress(), getPropertyType(), getNumberOfBedrooms(), getNumberOfSittingRooms(), getNumberOfKitchens(), getNumberOfBathrooms(), getNumberOfToilets(), getPropertyOwner(), getDescription(), getValidFrom(), getValidTo());
    }

}
