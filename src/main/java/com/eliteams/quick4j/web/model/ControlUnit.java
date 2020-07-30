package com.eliteams.quick4j.web.model;

public class ControlUnit {
    private Integer id;

    private String unitName;

    private String includeSection;

    private String watershed;

    private String locProvince;

    private String involveCity;

    private String involveCounty;

    private String involveVillage;

    private Integer villageAmount;

    private String involveRiver;

    private String unitType;

    private String waterResource;

    private Integer isDel;

    private String hrRiver;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    public String getIncludeSection() {
        return includeSection;
    }

    public void setIncludeSection(String includeSection) {
        this.includeSection = includeSection == null ? null : includeSection.trim();
    }

    public String getWatershed() {
        return watershed;
    }

    public void setWatershed(String watershed) {
        this.watershed = watershed == null ? null : watershed.trim();
    }

    public String getLocProvince() {
        return locProvince;
    }

    public void setLocProvince(String locProvince) {
        this.locProvince = locProvince == null ? null : locProvince.trim();
    }

    public String getInvolveCity() {
        return involveCity;
    }

    public void setInvolveCity(String involveCity) {
        this.involveCity = involveCity == null ? null : involveCity.trim();
    }

    public String getInvolveCounty() {
        return involveCounty;
    }

    public void setInvolveCounty(String involveCounty) {
        this.involveCounty = involveCounty == null ? null : involveCounty.trim();
    }

    public String getInvolveVillage() {
        return involveVillage;
    }

    public void setInvolveVillage(String involveVillage) {
        this.involveVillage = involveVillage == null ? null : involveVillage.trim();
    }

    public Integer getVillageAmount() {
        return villageAmount;
    }

    public void setVillageAmount(Integer villageAmount) {
        this.villageAmount = villageAmount;
    }

    public String getInvolveRiver() {
        return involveRiver;
    }

    public void setInvolveRiver(String involveRiver) {
        this.involveRiver = involveRiver == null ? null : involveRiver.trim();
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType == null ? null : unitType.trim();
    }

    public String getWaterResource() {
        return waterResource;
    }

    public void setWaterResource(String waterResource) {
        this.waterResource = waterResource == null ? null : waterResource.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getHrRiver() {
        return hrRiver;
    }

    public void setHrRiver(String hrRiver) {
        this.hrRiver = hrRiver == null ? null : hrRiver.trim();
    }
}