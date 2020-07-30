package com.eliteams.quick4j.web.model;

public class Qmp {
    private Integer id;

    private String tjnf;

	private String watershed;

    private String riverName;

    private String riverLevel;

    private String riverTo;

    private String sectionName;

    private String sectionProperty;

    private String locProvince;

    private String locCity;

    private String locCounty;

    private String testBy;

    private String sectionLevel;

    private String sectionType;

    private String isUrban;

    private String isAddition;

    private String testFrequency;

    private String testItems;

    private Integer locLonD;

    private Integer locLonM;

    private Double locLonS;

    private Integer locLatD;

    private Integer locLatM;

    private Double locLatS;

    private String qualityTarget;

    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTjnf() {
		return tjnf;
	}

	public void setTjnf(String tjnf) {
		this.tjnf = tjnf == null ? null : tjnf.trim();
	}
	
    public String getWatershed() {
        return watershed;
    }

    public void setWatershed(String watershed) {
        this.watershed = watershed == null ? null : watershed.trim();
    }

    public String getRiverName() {
        return riverName;
    }

    public void setRiverName(String riverName) {
        this.riverName = riverName == null ? null : riverName.trim();
    }

    public String getRiverLevel() {
        return riverLevel;
    }

    public void setRiverLevel(String riverLevel) {
        this.riverLevel = riverLevel == null ? null : riverLevel.trim();
    }

    public String getRiverTo() {
        return riverTo;
    }

    public void setRiverTo(String riverTo) {
        this.riverTo = riverTo == null ? null : riverTo.trim();
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName == null ? null : sectionName.trim();
    }

    public String getSectionProperty() {
        return sectionProperty;
    }

    public void setSectionProperty(String sectionProperty) {
        this.sectionProperty = sectionProperty == null ? null : sectionProperty.trim();
    }

    public String getLocProvince() {
        return locProvince;
    }

    public void setLocProvince(String locProvince) {
        this.locProvince = locProvince == null ? null : locProvince.trim();
    }

    public String getLocCity() {
        return locCity;
    }

    public void setLocCity(String locCity) {
        this.locCity = locCity == null ? null : locCity.trim();
    }

    public String getLocCounty() {
        return locCounty;
    }

    public void setLocCounty(String locCounty) {
        this.locCounty = locCounty == null ? null : locCounty.trim();
    }

    public String getTestBy() {
        return testBy;
    }

    public void setTestBy(String testBy) {
        this.testBy = testBy == null ? null : testBy.trim();
    }

    public String getSectionLevel() {
        return sectionLevel;
    }

    public void setSectionLevel(String sectionLevel) {
        this.sectionLevel = sectionLevel == null ? null : sectionLevel.trim();
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType == null ? null : sectionType.trim();
    }

    public String getIsUrban() {
        return isUrban;
    }

    public void setIsUrban(String isUrban) {
        this.isUrban = isUrban == null ? null : isUrban.trim();
    }

    public String getIsAddition() {
        return isAddition;
    }

    public void setIsAddition(String isAddition) {
        this.isAddition = isAddition == null ? null : isAddition.trim();
    }

    public String getTestFrequency() {
        return testFrequency;
    }

    public void setTestFrequency(String testFrequency) {
        this.testFrequency = testFrequency == null ? null : testFrequency.trim();
    }

    public String getTestItems() {
        return testItems;
    }

    public void setTestItems(String testItems) {
        this.testItems = testItems == null ? null : testItems.trim();
    }

    public Integer getLocLonD() {
        return locLonD;
    }

    public void setLocLonD(Integer locLonD) {
        this.locLonD = locLonD;
    }

    public Integer getLocLonM() {
        return locLonM;
    }

    public void setLocLonM(Integer locLonM) {
        this.locLonM = locLonM;
    }

    public Double getLocLonS() {
        return locLonS;
    }

    public void setLocLonS(Double locLonS) {
        this.locLonS = locLonS;
    }

    public Integer getLocLatD() {
        return locLatD;
    }

    public void setLocLatD(Integer locLatD) {
        this.locLatD = locLatD;
    }

    public Integer getLocLatM() {
        return locLatM;
    }

    public void setLocLatM(Integer locLatM) {
        this.locLatM = locLatM;
    }

    public Double getLocLatS() {
        return locLatS;
    }

    public void setLocLatS(Double locLatS) {
        this.locLatS = locLatS;
    }

    public String getQualityTarget() {
        return qualityTarget;
    }

    public void setQualityTarget(String qualityTarget) {
        this.qualityTarget = qualityTarget == null ? null : qualityTarget.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}