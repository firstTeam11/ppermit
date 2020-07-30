package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class control_unitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public control_unitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUnitBhIsNull() {
            addCriterion("unit_bh is null");
            return (Criteria) this;
        }

        public Criteria andUnitBhIsNotNull() {
            addCriterion("unit_bh is not null");
            return (Criteria) this;
        }

        public Criteria andUnitBhEqualTo(String value) {
            addCriterion("unit_bh =", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhNotEqualTo(String value) {
            addCriterion("unit_bh <>", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhGreaterThan(String value) {
            addCriterion("unit_bh >", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhGreaterThanOrEqualTo(String value) {
            addCriterion("unit_bh >=", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhLessThan(String value) {
            addCriterion("unit_bh <", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhLessThanOrEqualTo(String value) {
            addCriterion("unit_bh <=", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhLike(String value) {
            addCriterion("unit_bh like", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhNotLike(String value) {
            addCriterion("unit_bh not like", value, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhIn(List<String> values) {
            addCriterion("unit_bh in", values, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhNotIn(List<String> values) {
            addCriterion("unit_bh not in", values, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhBetween(String value1, String value2) {
            addCriterion("unit_bh between", value1, value2, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitBhNotBetween(String value1, String value2) {
            addCriterion("unit_bh not between", value1, value2, "unitBh");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNull() {
            addCriterion("unit_type is null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIsNotNull() {
            addCriterion("unit_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTypeEqualTo(String value) {
            addCriterion("unit_type =", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotEqualTo(String value) {
            addCriterion("unit_type <>", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThan(String value) {
            addCriterion("unit_type >", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("unit_type >=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThan(String value) {
            addCriterion("unit_type <", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLessThanOrEqualTo(String value) {
            addCriterion("unit_type <=", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeLike(String value) {
            addCriterion("unit_type like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotLike(String value) {
            addCriterion("unit_type not like", value, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeIn(List<String> values) {
            addCriterion("unit_type in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotIn(List<String> values) {
            addCriterion("unit_type not in", values, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeBetween(String value1, String value2) {
            addCriterion("unit_type between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andUnitTypeNotBetween(String value1, String value2) {
            addCriterion("unit_type not between", value1, value2, "unitType");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionIsNull() {
            addCriterion("include_section is null");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionIsNotNull() {
            addCriterion("include_section is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionEqualTo(String value) {
            addCriterion("include_section =", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotEqualTo(String value) {
            addCriterion("include_section <>", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionGreaterThan(String value) {
            addCriterion("include_section >", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionGreaterThanOrEqualTo(String value) {
            addCriterion("include_section >=", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionLessThan(String value) {
            addCriterion("include_section <", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionLessThanOrEqualTo(String value) {
            addCriterion("include_section <=", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionLike(String value) {
            addCriterion("include_section like", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotLike(String value) {
            addCriterion("include_section not like", value, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionIn(List<String> values) {
            addCriterion("include_section in", values, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotIn(List<String> values) {
            addCriterion("include_section not in", values, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionBetween(String value1, String value2) {
            addCriterion("include_section between", value1, value2, "includeSection");
            return (Criteria) this;
        }

        public Criteria andIncludeSectionNotBetween(String value1, String value2) {
            addCriterion("include_section not between", value1, value2, "includeSection");
            return (Criteria) this;
        }

        public Criteria andLocProvinceIsNull() {
            addCriterion("loc_province is null");
            return (Criteria) this;
        }

        public Criteria andLocProvinceIsNotNull() {
            addCriterion("loc_province is not null");
            return (Criteria) this;
        }

        public Criteria andLocProvinceEqualTo(String value) {
            addCriterion("loc_province =", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotEqualTo(String value) {
            addCriterion("loc_province <>", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceGreaterThan(String value) {
            addCriterion("loc_province >", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("loc_province >=", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceLessThan(String value) {
            addCriterion("loc_province <", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceLessThanOrEqualTo(String value) {
            addCriterion("loc_province <=", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceLike(String value) {
            addCriterion("loc_province like", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotLike(String value) {
            addCriterion("loc_province not like", value, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceIn(List<String> values) {
            addCriterion("loc_province in", values, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotIn(List<String> values) {
            addCriterion("loc_province not in", values, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceBetween(String value1, String value2) {
            addCriterion("loc_province between", value1, value2, "locProvince");
            return (Criteria) this;
        }

        public Criteria andLocProvinceNotBetween(String value1, String value2) {
            addCriterion("loc_province not between", value1, value2, "locProvince");
            return (Criteria) this;
        }

        public Criteria andInvolveCityIsNull() {
            addCriterion("involve_city is null");
            return (Criteria) this;
        }

        public Criteria andInvolveCityIsNotNull() {
            addCriterion("involve_city is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveCityEqualTo(String value) {
            addCriterion("involve_city =", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotEqualTo(String value) {
            addCriterion("involve_city <>", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityGreaterThan(String value) {
            addCriterion("involve_city >", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityGreaterThanOrEqualTo(String value) {
            addCriterion("involve_city >=", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityLessThan(String value) {
            addCriterion("involve_city <", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityLessThanOrEqualTo(String value) {
            addCriterion("involve_city <=", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityLike(String value) {
            addCriterion("involve_city like", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotLike(String value) {
            addCriterion("involve_city not like", value, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityIn(List<String> values) {
            addCriterion("involve_city in", values, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotIn(List<String> values) {
            addCriterion("involve_city not in", values, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityBetween(String value1, String value2) {
            addCriterion("involve_city between", value1, value2, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCityNotBetween(String value1, String value2) {
            addCriterion("involve_city not between", value1, value2, "involveCity");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyIsNull() {
            addCriterion("involve_county is null");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyIsNotNull() {
            addCriterion("involve_county is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyEqualTo(String value) {
            addCriterion("involve_county =", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotEqualTo(String value) {
            addCriterion("involve_county <>", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyGreaterThan(String value) {
            addCriterion("involve_county >", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyGreaterThanOrEqualTo(String value) {
            addCriterion("involve_county >=", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyLessThan(String value) {
            addCriterion("involve_county <", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyLessThanOrEqualTo(String value) {
            addCriterion("involve_county <=", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyLike(String value) {
            addCriterion("involve_county like", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotLike(String value) {
            addCriterion("involve_county not like", value, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyIn(List<String> values) {
            addCriterion("involve_county in", values, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotIn(List<String> values) {
            addCriterion("involve_county not in", values, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyBetween(String value1, String value2) {
            addCriterion("involve_county between", value1, value2, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveCountyNotBetween(String value1, String value2) {
            addCriterion("involve_county not between", value1, value2, "involveCounty");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageIsNull() {
            addCriterion("involve_village is null");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageIsNotNull() {
            addCriterion("involve_village is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageEqualTo(String value) {
            addCriterion("involve_village =", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotEqualTo(String value) {
            addCriterion("involve_village <>", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageGreaterThan(String value) {
            addCriterion("involve_village >", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageGreaterThanOrEqualTo(String value) {
            addCriterion("involve_village >=", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageLessThan(String value) {
            addCriterion("involve_village <", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageLessThanOrEqualTo(String value) {
            addCriterion("involve_village <=", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageLike(String value) {
            addCriterion("involve_village like", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotLike(String value) {
            addCriterion("involve_village not like", value, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageIn(List<String> values) {
            addCriterion("involve_village in", values, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotIn(List<String> values) {
            addCriterion("involve_village not in", values, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageBetween(String value1, String value2) {
            addCriterion("involve_village between", value1, value2, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andInvolveVillageNotBetween(String value1, String value2) {
            addCriterion("involve_village not between", value1, value2, "involveVillage");
            return (Criteria) this;
        }

        public Criteria andVillageAmountIsNull() {
            addCriterion("village_amount is null");
            return (Criteria) this;
        }

        public Criteria andVillageAmountIsNotNull() {
            addCriterion("village_amount is not null");
            return (Criteria) this;
        }

        public Criteria andVillageAmountEqualTo(Integer value) {
            addCriterion("village_amount =", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountNotEqualTo(Integer value) {
            addCriterion("village_amount <>", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountGreaterThan(Integer value) {
            addCriterion("village_amount >", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("village_amount >=", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountLessThan(Integer value) {
            addCriterion("village_amount <", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountLessThanOrEqualTo(Integer value) {
            addCriterion("village_amount <=", value, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountIn(List<Integer> values) {
            addCriterion("village_amount in", values, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountNotIn(List<Integer> values) {
            addCriterion("village_amount not in", values, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountBetween(Integer value1, Integer value2) {
            addCriterion("village_amount between", value1, value2, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andVillageAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("village_amount not between", value1, value2, "villageAmount");
            return (Criteria) this;
        }

        public Criteria andWatershedIsNull() {
            addCriterion("watershed is null");
            return (Criteria) this;
        }

        public Criteria andWatershedIsNotNull() {
            addCriterion("watershed is not null");
            return (Criteria) this;
        }

        public Criteria andWatershedEqualTo(String value) {
            addCriterion("watershed =", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotEqualTo(String value) {
            addCriterion("watershed <>", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedGreaterThan(String value) {
            addCriterion("watershed >", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedGreaterThanOrEqualTo(String value) {
            addCriterion("watershed >=", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedLessThan(String value) {
            addCriterion("watershed <", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedLessThanOrEqualTo(String value) {
            addCriterion("watershed <=", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedLike(String value) {
            addCriterion("watershed like", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotLike(String value) {
            addCriterion("watershed not like", value, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedIn(List<String> values) {
            addCriterion("watershed in", values, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotIn(List<String> values) {
            addCriterion("watershed not in", values, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedBetween(String value1, String value2) {
            addCriterion("watershed between", value1, value2, "watershed");
            return (Criteria) this;
        }

        public Criteria andWatershedNotBetween(String value1, String value2) {
            addCriterion("watershed not between", value1, value2, "watershed");
            return (Criteria) this;
        }

        public Criteria andIncludeSxIsNull() {
            addCriterion("include_sx is null");
            return (Criteria) this;
        }

        public Criteria andIncludeSxIsNotNull() {
            addCriterion("include_sx is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeSxEqualTo(String value) {
            addCriterion("include_sx =", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxNotEqualTo(String value) {
            addCriterion("include_sx <>", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxGreaterThan(String value) {
            addCriterion("include_sx >", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxGreaterThanOrEqualTo(String value) {
            addCriterion("include_sx >=", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxLessThan(String value) {
            addCriterion("include_sx <", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxLessThanOrEqualTo(String value) {
            addCriterion("include_sx <=", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxLike(String value) {
            addCriterion("include_sx like", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxNotLike(String value) {
            addCriterion("include_sx not like", value, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxIn(List<String> values) {
            addCriterion("include_sx in", values, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxNotIn(List<String> values) {
            addCriterion("include_sx not in", values, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxBetween(String value1, String value2) {
            addCriterion("include_sx between", value1, value2, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeSxNotBetween(String value1, String value2) {
            addCriterion("include_sx not between", value1, value2, "includeSx");
            return (Criteria) this;
        }

        public Criteria andIncludeGlIsNull() {
            addCriterion("include_gl is null");
            return (Criteria) this;
        }

        public Criteria andIncludeGlIsNotNull() {
            addCriterion("include_gl is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeGlEqualTo(String value) {
            addCriterion("include_gl =", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlNotEqualTo(String value) {
            addCriterion("include_gl <>", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlGreaterThan(String value) {
            addCriterion("include_gl >", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlGreaterThanOrEqualTo(String value) {
            addCriterion("include_gl >=", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlLessThan(String value) {
            addCriterion("include_gl <", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlLessThanOrEqualTo(String value) {
            addCriterion("include_gl <=", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlLike(String value) {
            addCriterion("include_gl like", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlNotLike(String value) {
            addCriterion("include_gl not like", value, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlIn(List<String> values) {
            addCriterion("include_gl in", values, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlNotIn(List<String> values) {
            addCriterion("include_gl not in", values, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlBetween(String value1, String value2) {
            addCriterion("include_gl between", value1, value2, "includeGl");
            return (Criteria) this;
        }

        public Criteria andIncludeGlNotBetween(String value1, String value2) {
            addCriterion("include_gl not between", value1, value2, "includeGl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlIsNull() {
            addCriterion("include_1jzl is null");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlIsNotNull() {
            addCriterion("include_1jzl is not null");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlEqualTo(String value) {
            addCriterion("include_1jzl =", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlNotEqualTo(String value) {
            addCriterion("include_1jzl <>", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlGreaterThan(String value) {
            addCriterion("include_1jzl >", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlGreaterThanOrEqualTo(String value) {
            addCriterion("include_1jzl >=", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlLessThan(String value) {
            addCriterion("include_1jzl <", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlLessThanOrEqualTo(String value) {
            addCriterion("include_1jzl <=", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlLike(String value) {
            addCriterion("include_1jzl like", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlNotLike(String value) {
            addCriterion("include_1jzl not like", value, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlIn(List<String> values) {
            addCriterion("include_1jzl in", values, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlNotIn(List<String> values) {
            addCriterion("include_1jzl not in", values, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlBetween(String value1, String value2) {
            addCriterion("include_1jzl between", value1, value2, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude1jzlNotBetween(String value1, String value2) {
            addCriterion("include_1jzl not between", value1, value2, "include1jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlIsNull() {
            addCriterion("include_2jzl is null");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlIsNotNull() {
            addCriterion("include_2jzl is not null");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlEqualTo(String value) {
            addCriterion("include_2jzl =", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlNotEqualTo(String value) {
            addCriterion("include_2jzl <>", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlGreaterThan(String value) {
            addCriterion("include_2jzl >", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlGreaterThanOrEqualTo(String value) {
            addCriterion("include_2jzl >=", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlLessThan(String value) {
            addCriterion("include_2jzl <", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlLessThanOrEqualTo(String value) {
            addCriterion("include_2jzl <=", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlLike(String value) {
            addCriterion("include_2jzl like", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlNotLike(String value) {
            addCriterion("include_2jzl not like", value, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlIn(List<String> values) {
            addCriterion("include_2jzl in", values, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlNotIn(List<String> values) {
            addCriterion("include_2jzl not in", values, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlBetween(String value1, String value2) {
            addCriterion("include_2jzl between", value1, value2, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude2jzlNotBetween(String value1, String value2) {
            addCriterion("include_2jzl not between", value1, value2, "include2jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlIsNull() {
            addCriterion("include_3jzl is null");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlIsNotNull() {
            addCriterion("include_3jzl is not null");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlEqualTo(String value) {
            addCriterion("include_3jzl =", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlNotEqualTo(String value) {
            addCriterion("include_3jzl <>", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlGreaterThan(String value) {
            addCriterion("include_3jzl >", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlGreaterThanOrEqualTo(String value) {
            addCriterion("include_3jzl >=", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlLessThan(String value) {
            addCriterion("include_3jzl <", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlLessThanOrEqualTo(String value) {
            addCriterion("include_3jzl <=", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlLike(String value) {
            addCriterion("include_3jzl like", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlNotLike(String value) {
            addCriterion("include_3jzl not like", value, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlIn(List<String> values) {
            addCriterion("include_3jzl in", values, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlNotIn(List<String> values) {
            addCriterion("include_3jzl not in", values, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlBetween(String value1, String value2) {
            addCriterion("include_3jzl between", value1, value2, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude3jzlNotBetween(String value1, String value2) {
            addCriterion("include_3jzl not between", value1, value2, "include3jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlIsNull() {
            addCriterion("include_4jzl is null");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlIsNotNull() {
            addCriterion("include_4jzl is not null");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlEqualTo(String value) {
            addCriterion("include_4jzl =", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlNotEqualTo(String value) {
            addCriterion("include_4jzl <>", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlGreaterThan(String value) {
            addCriterion("include_4jzl >", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlGreaterThanOrEqualTo(String value) {
            addCriterion("include_4jzl >=", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlLessThan(String value) {
            addCriterion("include_4jzl <", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlLessThanOrEqualTo(String value) {
            addCriterion("include_4jzl <=", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlLike(String value) {
            addCriterion("include_4jzl like", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlNotLike(String value) {
            addCriterion("include_4jzl not like", value, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlIn(List<String> values) {
            addCriterion("include_4jzl in", values, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlNotIn(List<String> values) {
            addCriterion("include_4jzl not in", values, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlBetween(String value1, String value2) {
            addCriterion("include_4jzl between", value1, value2, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInclude4jzlNotBetween(String value1, String value2) {
            addCriterion("include_4jzl not between", value1, value2, "include4jzl");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverIsNull() {
            addCriterion("involve_river is null");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverIsNotNull() {
            addCriterion("involve_river is not null");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverEqualTo(String value) {
            addCriterion("involve_river =", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotEqualTo(String value) {
            addCriterion("involve_river <>", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverGreaterThan(String value) {
            addCriterion("involve_river >", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverGreaterThanOrEqualTo(String value) {
            addCriterion("involve_river >=", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverLessThan(String value) {
            addCriterion("involve_river <", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverLessThanOrEqualTo(String value) {
            addCriterion("involve_river <=", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverLike(String value) {
            addCriterion("involve_river like", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotLike(String value) {
            addCriterion("involve_river not like", value, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverIn(List<String> values) {
            addCriterion("involve_river in", values, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotIn(List<String> values) {
            addCriterion("involve_river not in", values, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverBetween(String value1, String value2) {
            addCriterion("involve_river between", value1, value2, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andInvolveRiverNotBetween(String value1, String value2) {
            addCriterion("involve_river not between", value1, value2, "involveRiver");
            return (Criteria) this;
        }

        public Criteria andWaterResourceIsNull() {
            addCriterion("water_resource is null");
            return (Criteria) this;
        }

        public Criteria andWaterResourceIsNotNull() {
            addCriterion("water_resource is not null");
            return (Criteria) this;
        }

        public Criteria andWaterResourceEqualTo(String value) {
            addCriterion("water_resource =", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotEqualTo(String value) {
            addCriterion("water_resource <>", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceGreaterThan(String value) {
            addCriterion("water_resource >", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceGreaterThanOrEqualTo(String value) {
            addCriterion("water_resource >=", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceLessThan(String value) {
            addCriterion("water_resource <", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceLessThanOrEqualTo(String value) {
            addCriterion("water_resource <=", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceLike(String value) {
            addCriterion("water_resource like", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotLike(String value) {
            addCriterion("water_resource not like", value, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceIn(List<String> values) {
            addCriterion("water_resource in", values, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotIn(List<String> values) {
            addCriterion("water_resource not in", values, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceBetween(String value1, String value2) {
            addCriterion("water_resource between", value1, value2, "waterResource");
            return (Criteria) this;
        }

        public Criteria andWaterResourceNotBetween(String value1, String value2) {
            addCriterion("water_resource not between", value1, value2, "waterResource");
            return (Criteria) this;
        }

        public Criteria andHrRiverIsNull() {
            addCriterion("hr_river is null");
            return (Criteria) this;
        }

        public Criteria andHrRiverIsNotNull() {
            addCriterion("hr_river is not null");
            return (Criteria) this;
        }

        public Criteria andHrRiverEqualTo(String value) {
            addCriterion("hr_river =", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotEqualTo(String value) {
            addCriterion("hr_river <>", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverGreaterThan(String value) {
            addCriterion("hr_river >", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverGreaterThanOrEqualTo(String value) {
            addCriterion("hr_river >=", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverLessThan(String value) {
            addCriterion("hr_river <", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverLessThanOrEqualTo(String value) {
            addCriterion("hr_river <=", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverLike(String value) {
            addCriterion("hr_river like", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotLike(String value) {
            addCriterion("hr_river not like", value, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverIn(List<String> values) {
            addCriterion("hr_river in", values, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotIn(List<String> values) {
            addCriterion("hr_river not in", values, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverBetween(String value1, String value2) {
            addCriterion("hr_river between", value1, value2, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andHrRiverNotBetween(String value1, String value2) {
            addCriterion("hr_river not between", value1, value2, "hrRiver");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeIsNull() {
            addCriterion("kzdy_time is null");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeIsNotNull() {
            addCriterion("kzdy_time is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeEqualTo(String value) {
            addCriterion("kzdy_time =", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeNotEqualTo(String value) {
            addCriterion("kzdy_time <>", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeGreaterThan(String value) {
            addCriterion("kzdy_time >", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_time >=", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeLessThan(String value) {
            addCriterion("kzdy_time <", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeLessThanOrEqualTo(String value) {
            addCriterion("kzdy_time <=", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeLike(String value) {
            addCriterion("kzdy_time like", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeNotLike(String value) {
            addCriterion("kzdy_time not like", value, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeIn(List<String> values) {
            addCriterion("kzdy_time in", values, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeNotIn(List<String> values) {
            addCriterion("kzdy_time not in", values, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeBetween(String value1, String value2) {
            addCriterion("kzdy_time between", value1, value2, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andKzdyTimeNotBetween(String value1, String value2) {
            addCriterion("kzdy_time not between", value1, value2, "kzdyTime");
            return (Criteria) this;
        }

        public Criteria andBbhIsNull() {
            addCriterion("bbh is null");
            return (Criteria) this;
        }

        public Criteria andBbhIsNotNull() {
            addCriterion("bbh is not null");
            return (Criteria) this;
        }

        public Criteria andBbhEqualTo(String value) {
            addCriterion("bbh =", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhNotEqualTo(String value) {
            addCriterion("bbh <>", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhGreaterThan(String value) {
            addCriterion("bbh >", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhGreaterThanOrEqualTo(String value) {
            addCriterion("bbh >=", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhLessThan(String value) {
            addCriterion("bbh <", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhLessThanOrEqualTo(String value) {
            addCriterion("bbh <=", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhLike(String value) {
            addCriterion("bbh like", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhNotLike(String value) {
            addCriterion("bbh not like", value, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhIn(List<String> values) {
            addCriterion("bbh in", values, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhNotIn(List<String> values) {
            addCriterion("bbh not in", values, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhBetween(String value1, String value2) {
            addCriterion("bbh between", value1, value2, "bbh");
            return (Criteria) this;
        }

        public Criteria andBbhNotBetween(String value1, String value2) {
            addCriterion("bbh not between", value1, value2, "bbh");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andUnitBl1IsNull() {
            addCriterion("unit_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andUnitBl1IsNotNull() {
            addCriterion("unit_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitBl1EqualTo(String value) {
            addCriterion("unit_bl1 =", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1NotEqualTo(String value) {
            addCriterion("unit_bl1 <>", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1GreaterThan(String value) {
            addCriterion("unit_bl1 >", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1GreaterThanOrEqualTo(String value) {
            addCriterion("unit_bl1 >=", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1LessThan(String value) {
            addCriterion("unit_bl1 <", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1LessThanOrEqualTo(String value) {
            addCriterion("unit_bl1 <=", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1Like(String value) {
            addCriterion("unit_bl1 like", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1NotLike(String value) {
            addCriterion("unit_bl1 not like", value, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1In(List<String> values) {
            addCriterion("unit_bl1 in", values, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1NotIn(List<String> values) {
            addCriterion("unit_bl1 not in", values, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1Between(String value1, String value2) {
            addCriterion("unit_bl1 between", value1, value2, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl1NotBetween(String value1, String value2) {
            addCriterion("unit_bl1 not between", value1, value2, "unitBl1");
            return (Criteria) this;
        }

        public Criteria andUnitBl2IsNull() {
            addCriterion("unit_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andUnitBl2IsNotNull() {
            addCriterion("unit_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitBl2EqualTo(String value) {
            addCriterion("unit_bl2 =", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2NotEqualTo(String value) {
            addCriterion("unit_bl2 <>", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2GreaterThan(String value) {
            addCriterion("unit_bl2 >", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2GreaterThanOrEqualTo(String value) {
            addCriterion("unit_bl2 >=", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2LessThan(String value) {
            addCriterion("unit_bl2 <", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2LessThanOrEqualTo(String value) {
            addCriterion("unit_bl2 <=", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2Like(String value) {
            addCriterion("unit_bl2 like", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2NotLike(String value) {
            addCriterion("unit_bl2 not like", value, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2In(List<String> values) {
            addCriterion("unit_bl2 in", values, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2NotIn(List<String> values) {
            addCriterion("unit_bl2 not in", values, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2Between(String value1, String value2) {
            addCriterion("unit_bl2 between", value1, value2, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl2NotBetween(String value1, String value2) {
            addCriterion("unit_bl2 not between", value1, value2, "unitBl2");
            return (Criteria) this;
        }

        public Criteria andUnitBl3IsNull() {
            addCriterion("unit_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andUnitBl3IsNotNull() {
            addCriterion("unit_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitBl3EqualTo(String value) {
            addCriterion("unit_bl3 =", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3NotEqualTo(String value) {
            addCriterion("unit_bl3 <>", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3GreaterThan(String value) {
            addCriterion("unit_bl3 >", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3GreaterThanOrEqualTo(String value) {
            addCriterion("unit_bl3 >=", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3LessThan(String value) {
            addCriterion("unit_bl3 <", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3LessThanOrEqualTo(String value) {
            addCriterion("unit_bl3 <=", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3Like(String value) {
            addCriterion("unit_bl3 like", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3NotLike(String value) {
            addCriterion("unit_bl3 not like", value, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3In(List<String> values) {
            addCriterion("unit_bl3 in", values, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3NotIn(List<String> values) {
            addCriterion("unit_bl3 not in", values, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3Between(String value1, String value2) {
            addCriterion("unit_bl3 between", value1, value2, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl3NotBetween(String value1, String value2) {
            addCriterion("unit_bl3 not between", value1, value2, "unitBl3");
            return (Criteria) this;
        }

        public Criteria andUnitBl4IsNull() {
            addCriterion("unit_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andUnitBl4IsNotNull() {
            addCriterion("unit_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitBl4EqualTo(String value) {
            addCriterion("unit_bl4 =", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4NotEqualTo(String value) {
            addCriterion("unit_bl4 <>", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4GreaterThan(String value) {
            addCriterion("unit_bl4 >", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4GreaterThanOrEqualTo(String value) {
            addCriterion("unit_bl4 >=", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4LessThan(String value) {
            addCriterion("unit_bl4 <", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4LessThanOrEqualTo(String value) {
            addCriterion("unit_bl4 <=", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4Like(String value) {
            addCriterion("unit_bl4 like", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4NotLike(String value) {
            addCriterion("unit_bl4 not like", value, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4In(List<String> values) {
            addCriterion("unit_bl4 in", values, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4NotIn(List<String> values) {
            addCriterion("unit_bl4 not in", values, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4Between(String value1, String value2) {
            addCriterion("unit_bl4 between", value1, value2, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl4NotBetween(String value1, String value2) {
            addCriterion("unit_bl4 not between", value1, value2, "unitBl4");
            return (Criteria) this;
        }

        public Criteria andUnitBl5IsNull() {
            addCriterion("unit_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andUnitBl5IsNotNull() {
            addCriterion("unit_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andUnitBl5EqualTo(String value) {
            addCriterion("unit_bl5 =", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5NotEqualTo(String value) {
            addCriterion("unit_bl5 <>", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5GreaterThan(String value) {
            addCriterion("unit_bl5 >", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5GreaterThanOrEqualTo(String value) {
            addCriterion("unit_bl5 >=", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5LessThan(String value) {
            addCriterion("unit_bl5 <", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5LessThanOrEqualTo(String value) {
            addCriterion("unit_bl5 <=", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5Like(String value) {
            addCriterion("unit_bl5 like", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5NotLike(String value) {
            addCriterion("unit_bl5 not like", value, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5In(List<String> values) {
            addCriterion("unit_bl5 in", values, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5NotIn(List<String> values) {
            addCriterion("unit_bl5 not in", values, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5Between(String value1, String value2) {
            addCriterion("unit_bl5 between", value1, value2, "unitBl5");
            return (Criteria) this;
        }

        public Criteria andUnitBl5NotBetween(String value1, String value2) {
            addCriterion("unit_bl5 not between", value1, value2, "unitBl5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}