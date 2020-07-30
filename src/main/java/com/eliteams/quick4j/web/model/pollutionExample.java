package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class pollutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public pollutionExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNull() {
            addCriterion("TJNF is null");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNotNull() {
            addCriterion("TJNF is not null");
            return (Criteria) this;
        }

        public Criteria andTjnfEqualTo(Integer value) {
            addCriterion("TJNF =", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotEqualTo(Integer value) {
            addCriterion("TJNF <>", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThan(Integer value) {
            addCriterion("TJNF >", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThanOrEqualTo(Integer value) {
            addCriterion("TJNF >=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThan(Integer value) {
            addCriterion("TJNF <", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThanOrEqualTo(Integer value) {
            addCriterion("TJNF <=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfIn(List<Integer> values) {
            addCriterion("TJNF in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotIn(List<Integer> values) {
            addCriterion("TJNF not in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfBetween(Integer value1, Integer value2) {
            addCriterion("TJNF between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotBetween(Integer value1, Integer value2) {
            addCriterion("TJNF not between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNull() {
            addCriterion("XZQHDM is null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNotNull() {
            addCriterion("XZQHDM is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmEqualTo(String value) {
            addCriterion("XZQHDM =", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotEqualTo(String value) {
            addCriterion("XZQHDM <>", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThan(String value) {
            addCriterion("XZQHDM >", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHDM >=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThan(String value) {
            addCriterion("XZQHDM <", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThanOrEqualTo(String value) {
            addCriterion("XZQHDM <=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLike(String value) {
            addCriterion("XZQHDM like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotLike(String value) {
            addCriterion("XZQHDM not like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIn(List<String> values) {
            addCriterion("XZQHDM in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotIn(List<String> values) {
            addCriterion("XZQHDM not in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmBetween(String value1, String value2) {
            addCriterion("XZQHDM between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotBetween(String value1, String value2) {
            addCriterion("XZQHDM not between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNull() {
            addCriterion("XZQHMC is null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNotNull() {
            addCriterion("XZQHMC is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcEqualTo(String value) {
            addCriterion("XZQHMC =", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotEqualTo(String value) {
            addCriterion("XZQHMC <>", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThan(String value) {
            addCriterion("XZQHMC >", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHMC >=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThan(String value) {
            addCriterion("XZQHMC <", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThanOrEqualTo(String value) {
            addCriterion("XZQHMC <=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLike(String value) {
            addCriterion("XZQHMC like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotLike(String value) {
            addCriterion("XZQHMC not like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIn(List<String> values) {
            addCriterion("XZQHMC in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotIn(List<String> values) {
            addCriterion("XZQHMC not in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcBetween(String value1, String value2) {
            addCriterion("XZQHMC between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotBetween(String value1, String value2) {
            addCriterion("XZQHMC not between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andShxydmIsNull() {
            addCriterion("SHXYDM is null");
            return (Criteria) this;
        }

        public Criteria andShxydmIsNotNull() {
            addCriterion("SHXYDM is not null");
            return (Criteria) this;
        }

        public Criteria andShxydmEqualTo(String value) {
            addCriterion("SHXYDM =", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotEqualTo(String value) {
            addCriterion("SHXYDM <>", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmGreaterThan(String value) {
            addCriterion("SHXYDM >", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmGreaterThanOrEqualTo(String value) {
            addCriterion("SHXYDM >=", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmLessThan(String value) {
            addCriterion("SHXYDM <", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmLessThanOrEqualTo(String value) {
            addCriterion("SHXYDM <=", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmLike(String value) {
            addCriterion("SHXYDM like", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotLike(String value) {
            addCriterion("SHXYDM not like", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmIn(List<String> values) {
            addCriterion("SHXYDM in", values, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotIn(List<String> values) {
            addCriterion("SHXYDM not in", values, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmBetween(String value1, String value2) {
            addCriterion("SHXYDM between", value1, value2, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotBetween(String value1, String value2) {
            addCriterion("SHXYDM not between", value1, value2, "shxydm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNull() {
            addCriterion("ZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNotNull() {
            addCriterion("ZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmEqualTo(String value) {
            addCriterion("ZZJGDM =", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotEqualTo(String value) {
            addCriterion("ZZJGDM <>", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThan(String value) {
            addCriterion("ZZJGDM >", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZJGDM >=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThan(String value) {
            addCriterion("ZZJGDM <", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThanOrEqualTo(String value) {
            addCriterion("ZZJGDM <=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLike(String value) {
            addCriterion("ZZJGDM like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotLike(String value) {
            addCriterion("ZZJGDM not like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIn(List<String> values) {
            addCriterion("ZZJGDM in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotIn(List<String> values) {
            addCriterion("ZZJGDM not in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmBetween(String value1, String value2) {
            addCriterion("ZZJGDM between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotBetween(String value1, String value2) {
            addCriterion("ZZJGDM not between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcIsNull() {
            addCriterion("TBDWXXMC is null");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcIsNotNull() {
            addCriterion("TBDWXXMC is not null");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcEqualTo(String value) {
            addCriterion("TBDWXXMC =", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotEqualTo(String value) {
            addCriterion("TBDWXXMC <>", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcGreaterThan(String value) {
            addCriterion("TBDWXXMC >", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcGreaterThanOrEqualTo(String value) {
            addCriterion("TBDWXXMC >=", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcLessThan(String value) {
            addCriterion("TBDWXXMC <", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcLessThanOrEqualTo(String value) {
            addCriterion("TBDWXXMC <=", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcLike(String value) {
            addCriterion("TBDWXXMC like", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotLike(String value) {
            addCriterion("TBDWXXMC not like", value, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcIn(List<String> values) {
            addCriterion("TBDWXXMC in", values, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotIn(List<String> values) {
            addCriterion("TBDWXXMC not in", values, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcBetween(String value1, String value2) {
            addCriterion("TBDWXXMC between", value1, value2, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andTbdwxxmcNotBetween(String value1, String value2) {
            addCriterion("TBDWXXMC not between", value1, value2, "tbdwxxmc");
            return (Criteria) this;
        }

        public Criteria andKzdyIsNull() {
            addCriterion("KZDY is null");
            return (Criteria) this;
        }

        public Criteria andKzdyIsNotNull() {
            addCriterion("KZDY is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyEqualTo(String value) {
            addCriterion("KZDY =", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotEqualTo(String value) {
            addCriterion("KZDY <>", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyGreaterThan(String value) {
            addCriterion("KZDY >", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyGreaterThanOrEqualTo(String value) {
            addCriterion("KZDY >=", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLessThan(String value) {
            addCriterion("KZDY <", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLessThanOrEqualTo(String value) {
            addCriterion("KZDY <=", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyLike(String value) {
            addCriterion("KZDY like", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotLike(String value) {
            addCriterion("KZDY not like", value, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyIn(List<String> values) {
            addCriterion("KZDY in", values, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotIn(List<String> values) {
            addCriterion("KZDY not in", values, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyBetween(String value1, String value2) {
            addCriterion("KZDY between", value1, value2, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdyNotBetween(String value1, String value2) {
            addCriterion("KZDY not between", value1, value2, "kzdy");
            return (Criteria) this;
        }

        public Criteria andKzdmIsNull() {
            addCriterion("KZDM is null");
            return (Criteria) this;
        }

        public Criteria andKzdmIsNotNull() {
            addCriterion("KZDM is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmEqualTo(String value) {
            addCriterion("KZDM =", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotEqualTo(String value) {
            addCriterion("KZDM <>", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmGreaterThan(String value) {
            addCriterion("KZDM >", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmGreaterThanOrEqualTo(String value) {
            addCriterion("KZDM >=", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLessThan(String value) {
            addCriterion("KZDM <", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLessThanOrEqualTo(String value) {
            addCriterion("KZDM <=", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmLike(String value) {
            addCriterion("KZDM like", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotLike(String value) {
            addCriterion("KZDM not like", value, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmIn(List<String> values) {
            addCriterion("KZDM in", values, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotIn(List<String> values) {
            addCriterion("KZDM not in", values, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmBetween(String value1, String value2) {
            addCriterion("KZDM between", value1, value2, "kzdm");
            return (Criteria) this;
        }

        public Criteria andKzdmNotBetween(String value1, String value2) {
            addCriterion("KZDM not between", value1, value2, "kzdm");
            return (Criteria) this;
        }

        public Criteria andQyztIsNull() {
            addCriterion("QYZT is null");
            return (Criteria) this;
        }

        public Criteria andQyztIsNotNull() {
            addCriterion("QYZT is not null");
            return (Criteria) this;
        }

        public Criteria andQyztEqualTo(String value) {
            addCriterion("QYZT =", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotEqualTo(String value) {
            addCriterion("QYZT <>", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztGreaterThan(String value) {
            addCriterion("QYZT >", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztGreaterThanOrEqualTo(String value) {
            addCriterion("QYZT >=", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztLessThan(String value) {
            addCriterion("QYZT <", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztLessThanOrEqualTo(String value) {
            addCriterion("QYZT <=", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztLike(String value) {
            addCriterion("QYZT like", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotLike(String value) {
            addCriterion("QYZT not like", value, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztIn(List<String> values) {
            addCriterion("QYZT in", values, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotIn(List<String> values) {
            addCriterion("QYZT not in", values, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztBetween(String value1, String value2) {
            addCriterion("QYZT between", value1, value2, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztNotBetween(String value1, String value2) {
            addCriterion("QYZT not between", value1, value2, "qyzt");
            return (Criteria) this;
        }

        public Criteria andQyztmcIsNull() {
            addCriterion("QYZTMC is null");
            return (Criteria) this;
        }

        public Criteria andQyztmcIsNotNull() {
            addCriterion("QYZTMC is not null");
            return (Criteria) this;
        }

        public Criteria andQyztmcEqualTo(String value) {
            addCriterion("QYZTMC =", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcNotEqualTo(String value) {
            addCriterion("QYZTMC <>", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcGreaterThan(String value) {
            addCriterion("QYZTMC >", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcGreaterThanOrEqualTo(String value) {
            addCriterion("QYZTMC >=", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcLessThan(String value) {
            addCriterion("QYZTMC <", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcLessThanOrEqualTo(String value) {
            addCriterion("QYZTMC <=", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcLike(String value) {
            addCriterion("QYZTMC like", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcNotLike(String value) {
            addCriterion("QYZTMC not like", value, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcIn(List<String> values) {
            addCriterion("QYZTMC in", values, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcNotIn(List<String> values) {
            addCriterion("QYZTMC not in", values, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcBetween(String value1, String value2) {
            addCriterion("QYZTMC between", value1, value2, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andQyztmcNotBetween(String value1, String value2) {
            addCriterion("QYZTMC not between", value1, value2, "qyztmc");
            return (Criteria) this;
        }

        public Criteria andCymIsNull() {
            addCriterion("CYM is null");
            return (Criteria) this;
        }

        public Criteria andCymIsNotNull() {
            addCriterion("CYM is not null");
            return (Criteria) this;
        }

        public Criteria andCymEqualTo(String value) {
            addCriterion("CYM =", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotEqualTo(String value) {
            addCriterion("CYM <>", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThan(String value) {
            addCriterion("CYM >", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymGreaterThanOrEqualTo(String value) {
            addCriterion("CYM >=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThan(String value) {
            addCriterion("CYM <", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLessThanOrEqualTo(String value) {
            addCriterion("CYM <=", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymLike(String value) {
            addCriterion("CYM like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotLike(String value) {
            addCriterion("CYM not like", value, "cym");
            return (Criteria) this;
        }

        public Criteria andCymIn(List<String> values) {
            addCriterion("CYM in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotIn(List<String> values) {
            addCriterion("CYM not in", values, "cym");
            return (Criteria) this;
        }

        public Criteria andCymBetween(String value1, String value2) {
            addCriterion("CYM between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andCymNotBetween(String value1, String value2) {
            addCriterion("CYM not between", value1, value2, "cym");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmIsNull() {
            addCriterion("PWXKZBM is null");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmIsNotNull() {
            addCriterion("PWXKZBM is not null");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmEqualTo(String value) {
            addCriterion("PWXKZBM =", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmNotEqualTo(String value) {
            addCriterion("PWXKZBM <>", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmGreaterThan(String value) {
            addCriterion("PWXKZBM >", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmGreaterThanOrEqualTo(String value) {
            addCriterion("PWXKZBM >=", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmLessThan(String value) {
            addCriterion("PWXKZBM <", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmLessThanOrEqualTo(String value) {
            addCriterion("PWXKZBM <=", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmLike(String value) {
            addCriterion("PWXKZBM like", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmNotLike(String value) {
            addCriterion("PWXKZBM not like", value, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmIn(List<String> values) {
            addCriterion("PWXKZBM in", values, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmNotIn(List<String> values) {
            addCriterion("PWXKZBM not in", values, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmBetween(String value1, String value2) {
            addCriterion("PWXKZBM between", value1, value2, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andPwxkzbmNotBetween(String value1, String value2) {
            addCriterion("PWXKZBM not between", value1, value2, "pwxkzbm");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrIsNull() {
            addCriterion("HTQYFDR is null");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrIsNotNull() {
            addCriterion("HTQYFDR is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrEqualTo(String value) {
            addCriterion("HTQYFDR =", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrNotEqualTo(String value) {
            addCriterion("HTQYFDR <>", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrGreaterThan(String value) {
            addCriterion("HTQYFDR >", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrGreaterThanOrEqualTo(String value) {
            addCriterion("HTQYFDR >=", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrLessThan(String value) {
            addCriterion("HTQYFDR <", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrLessThanOrEqualTo(String value) {
            addCriterion("HTQYFDR <=", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrLike(String value) {
            addCriterion("HTQYFDR like", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrNotLike(String value) {
            addCriterion("HTQYFDR not like", value, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrIn(List<String> values) {
            addCriterion("HTQYFDR in", values, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrNotIn(List<String> values) {
            addCriterion("HTQYFDR not in", values, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrBetween(String value1, String value2) {
            addCriterion("HTQYFDR between", value1, value2, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andHtqyfdrNotBetween(String value1, String value2) {
            addCriterion("HTQYFDR not between", value1, value2, "htqyfdr");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsIsNull() {
            addCriterion("XXDZS_ZZQ_ZXS is null");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsIsNotNull() {
            addCriterion("XXDZS_ZZQ_ZXS is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsEqualTo(String value) {
            addCriterion("XXDZS_ZZQ_ZXS =", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsNotEqualTo(String value) {
            addCriterion("XXDZS_ZZQ_ZXS <>", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsGreaterThan(String value) {
            addCriterion("XXDZS_ZZQ_ZXS >", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZS_ZZQ_ZXS >=", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsLessThan(String value) {
            addCriterion("XXDZS_ZZQ_ZXS <", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsLessThanOrEqualTo(String value) {
            addCriterion("XXDZS_ZZQ_ZXS <=", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsLike(String value) {
            addCriterion("XXDZS_ZZQ_ZXS like", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsNotLike(String value) {
            addCriterion("XXDZS_ZZQ_ZXS not like", value, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsIn(List<String> values) {
            addCriterion("XXDZS_ZZQ_ZXS in", values, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsNotIn(List<String> values) {
            addCriterion("XXDZS_ZZQ_ZXS not in", values, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsBetween(String value1, String value2) {
            addCriterion("XXDZS_ZZQ_ZXS between", value1, value2, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzsZzqZxsNotBetween(String value1, String value2) {
            addCriterion("XXDZS_ZZQ_ZXS not between", value1, value2, "xxdzsZzqZxs");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMIsNull() {
            addCriterion("XXDZDQ_S_Z_M is null");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMIsNotNull() {
            addCriterion("XXDZDQ_S_Z_M is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M =", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M <>", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMGreaterThan(String value) {
            addCriterion("XXDZDQ_S_Z_M >", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M >=", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMLessThan(String value) {
            addCriterion("XXDZDQ_S_Z_M <", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMLessThanOrEqualTo(String value) {
            addCriterion("XXDZDQ_S_Z_M <=", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMLike(String value) {
            addCriterion("XXDZDQ_S_Z_M like", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotLike(String value) {
            addCriterion("XXDZDQ_S_Z_M not like", value, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMIn(List<String> values) {
            addCriterion("XXDZDQ_S_Z_M in", values, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotIn(List<String> values) {
            addCriterion("XXDZDQ_S_Z_M not in", values, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMBetween(String value1, String value2) {
            addCriterion("XXDZDQ_S_Z_M between", value1, value2, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzdqSZMNotBetween(String value1, String value2) {
            addCriterion("XXDZDQ_S_Z_M not between", value1, value2, "xxdzdqSZM");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQIsNull() {
            addCriterion("XXDZX_Q_S_Q is null");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQIsNotNull() {
            addCriterion("XXDZX_Q_S_Q is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q =", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q <>", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQGreaterThan(String value) {
            addCriterion("XXDZX_Q_S_Q >", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q >=", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQLessThan(String value) {
            addCriterion("XXDZX_Q_S_Q <", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQLessThanOrEqualTo(String value) {
            addCriterion("XXDZX_Q_S_Q <=", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQLike(String value) {
            addCriterion("XXDZX_Q_S_Q like", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotLike(String value) {
            addCriterion("XXDZX_Q_S_Q not like", value, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQIn(List<String> values) {
            addCriterion("XXDZX_Q_S_Q in", values, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotIn(List<String> values) {
            addCriterion("XXDZX_Q_S_Q not in", values, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQBetween(String value1, String value2) {
            addCriterion("XXDZX_Q_S_Q between", value1, value2, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxQSQNotBetween(String value1, String value2) {
            addCriterion("XXDZX_Q_S_Q not between", value1, value2, "xxdzxQSQ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZIsNull() {
            addCriterion("XXDZX_Z is null");
            return (Criteria) this;
        }

        public Criteria andXxdzxZIsNotNull() {
            addCriterion("XXDZX_Z is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzxZEqualTo(String value) {
            addCriterion("XXDZX_Z =", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotEqualTo(String value) {
            addCriterion("XXDZX_Z <>", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZGreaterThan(String value) {
            addCriterion("XXDZX_Z >", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZX_Z >=", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZLessThan(String value) {
            addCriterion("XXDZX_Z <", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZLessThanOrEqualTo(String value) {
            addCriterion("XXDZX_Z <=", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZLike(String value) {
            addCriterion("XXDZX_Z like", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotLike(String value) {
            addCriterion("XXDZX_Z not like", value, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZIn(List<String> values) {
            addCriterion("XXDZX_Z in", values, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotIn(List<String> values) {
            addCriterion("XXDZX_Z not in", values, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZBetween(String value1, String value2) {
            addCriterion("XXDZX_Z between", value1, value2, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzxZNotBetween(String value1, String value2) {
            addCriterion("XXDZX_Z not between", value1, value2, "xxdzxZ");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphIsNull() {
            addCriterion("XXDZJ_C_MPH is null");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphIsNotNull() {
            addCriterion("XXDZJ_C_MPH is not null");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH =", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH <>", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphGreaterThan(String value) {
            addCriterion("XXDZJ_C_MPH >", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphGreaterThanOrEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH >=", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphLessThan(String value) {
            addCriterion("XXDZJ_C_MPH <", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphLessThanOrEqualTo(String value) {
            addCriterion("XXDZJ_C_MPH <=", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphLike(String value) {
            addCriterion("XXDZJ_C_MPH like", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotLike(String value) {
            addCriterion("XXDZJ_C_MPH not like", value, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphIn(List<String> values) {
            addCriterion("XXDZJ_C_MPH in", values, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotIn(List<String> values) {
            addCriterion("XXDZJ_C_MPH not in", values, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphBetween(String value1, String value2) {
            addCriterion("XXDZJ_C_MPH between", value1, value2, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andXxdzjCMphNotBetween(String value1, String value2) {
            addCriterion("XXDZJ_C_MPH not between", value1, value2, "xxdzjCMph");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNull() {
            addCriterion("ZXJD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNotNull() {
            addCriterion("ZXJD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdDEqualTo(Integer value) {
            addCriterion("ZXJD_D =", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotEqualTo(Integer value) {
            addCriterion("ZXJD_D <>", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThan(Integer value) {
            addCriterion("ZXJD_D >", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_D >=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThan(Integer value) {
            addCriterion("ZXJD_D <", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_D <=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDIn(List<Integer> values) {
            addCriterion("ZXJD_D in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotIn(List<Integer> values) {
            addCriterion("ZXJD_D not in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_D between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_D not between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNull() {
            addCriterion("ZXJD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNotNull() {
            addCriterion("ZXJD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdFEqualTo(Integer value) {
            addCriterion("ZXJD_F =", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotEqualTo(Integer value) {
            addCriterion("ZXJD_F <>", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThan(Integer value) {
            addCriterion("ZXJD_F >", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_F >=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThan(Integer value) {
            addCriterion("ZXJD_F <", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_F <=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFIn(List<Integer> values) {
            addCriterion("ZXJD_F in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotIn(List<Integer> values) {
            addCriterion("ZXJD_F not in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_F between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_F not between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNull() {
            addCriterion("ZXJD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNotNull() {
            addCriterion("ZXJD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdMEqualTo(Integer value) {
            addCriterion("ZXJD_M =", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotEqualTo(Integer value) {
            addCriterion("ZXJD_M <>", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThan(Integer value) {
            addCriterion("ZXJD_M >", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_M >=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThan(Integer value) {
            addCriterion("ZXJD_M <", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_M <=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMIn(List<Integer> values) {
            addCriterion("ZXJD_M in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotIn(List<Integer> values) {
            addCriterion("ZXJD_M not in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_M between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_M not between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andJdGIsNull() {
            addCriterion("JD_G is null");
            return (Criteria) this;
        }

        public Criteria andJdGIsNotNull() {
            addCriterion("JD_G is not null");
            return (Criteria) this;
        }

        public Criteria andJdGEqualTo(Double value) {
            addCriterion("JD_G =", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGNotEqualTo(Double value) {
            addCriterion("JD_G <>", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGGreaterThan(Double value) {
            addCriterion("JD_G >", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGGreaterThanOrEqualTo(Double value) {
            addCriterion("JD_G >=", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGLessThan(Double value) {
            addCriterion("JD_G <", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGLessThanOrEqualTo(Double value) {
            addCriterion("JD_G <=", value, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGIn(List<Double> values) {
            addCriterion("JD_G in", values, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGNotIn(List<Double> values) {
            addCriterion("JD_G not in", values, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGBetween(Double value1, Double value2) {
            addCriterion("JD_G between", value1, value2, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdGNotBetween(Double value1, Double value2) {
            addCriterion("JD_G not between", value1, value2, "jdG");
            return (Criteria) this;
        }

        public Criteria andJdZcxdIsNull() {
            addCriterion("JD_ZCXD is null");
            return (Criteria) this;
        }

        public Criteria andJdZcxdIsNotNull() {
            addCriterion("JD_ZCXD is not null");
            return (Criteria) this;
        }

        public Criteria andJdZcxdEqualTo(Double value) {
            addCriterion("JD_ZCXD =", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdNotEqualTo(Double value) {
            addCriterion("JD_ZCXD <>", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdGreaterThan(Double value) {
            addCriterion("JD_ZCXD >", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdGreaterThanOrEqualTo(Double value) {
            addCriterion("JD_ZCXD >=", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdLessThan(Double value) {
            addCriterion("JD_ZCXD <", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdLessThanOrEqualTo(Double value) {
            addCriterion("JD_ZCXD <=", value, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdIn(List<Double> values) {
            addCriterion("JD_ZCXD in", values, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdNotIn(List<Double> values) {
            addCriterion("JD_ZCXD not in", values, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdBetween(Double value1, Double value2) {
            addCriterion("JD_ZCXD between", value1, value2, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andJdZcxdNotBetween(Double value1, Double value2) {
            addCriterion("JD_ZCXD not between", value1, value2, "jdZcxd");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNull() {
            addCriterion("ZXWD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNotNull() {
            addCriterion("ZXWD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdDEqualTo(Integer value) {
            addCriterion("ZXWD_D =", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotEqualTo(Integer value) {
            addCriterion("ZXWD_D <>", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThan(Integer value) {
            addCriterion("ZXWD_D >", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_D >=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThan(Integer value) {
            addCriterion("ZXWD_D <", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_D <=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDIn(List<Integer> values) {
            addCriterion("ZXWD_D in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotIn(List<Integer> values) {
            addCriterion("ZXWD_D not in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_D between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_D not between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNull() {
            addCriterion("ZXWD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNotNull() {
            addCriterion("ZXWD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdFEqualTo(Integer value) {
            addCriterion("ZXWD_F =", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotEqualTo(Integer value) {
            addCriterion("ZXWD_F <>", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThan(Integer value) {
            addCriterion("ZXWD_F >", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_F >=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThan(Integer value) {
            addCriterion("ZXWD_F <", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_F <=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFIn(List<Integer> values) {
            addCriterion("ZXWD_F in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotIn(List<Integer> values) {
            addCriterion("ZXWD_F not in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_F between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_F not between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNull() {
            addCriterion("ZXWD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNotNull() {
            addCriterion("ZXWD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdMEqualTo(Integer value) {
            addCriterion("ZXWD_M =", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotEqualTo(Integer value) {
            addCriterion("ZXWD_M <>", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThan(Integer value) {
            addCriterion("ZXWD_M >", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_M >=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThan(Integer value) {
            addCriterion("ZXWD_M <", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_M <=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMIn(List<Integer> values) {
            addCriterion("ZXWD_M in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotIn(List<Integer> values) {
            addCriterion("ZXWD_M not in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_M between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_M not between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andWdGIsNull() {
            addCriterion("WD_G is null");
            return (Criteria) this;
        }

        public Criteria andWdGIsNotNull() {
            addCriterion("WD_G is not null");
            return (Criteria) this;
        }

        public Criteria andWdGEqualTo(Double value) {
            addCriterion("WD_G =", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGNotEqualTo(Double value) {
            addCriterion("WD_G <>", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGGreaterThan(Double value) {
            addCriterion("WD_G >", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGGreaterThanOrEqualTo(Double value) {
            addCriterion("WD_G >=", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGLessThan(Double value) {
            addCriterion("WD_G <", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGLessThanOrEqualTo(Double value) {
            addCriterion("WD_G <=", value, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGIn(List<Double> values) {
            addCriterion("WD_G in", values, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGNotIn(List<Double> values) {
            addCriterion("WD_G not in", values, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGBetween(Double value1, Double value2) {
            addCriterion("WD_G between", value1, value2, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdGNotBetween(Double value1, Double value2) {
            addCriterion("WD_G not between", value1, value2, "wdG");
            return (Criteria) this;
        }

        public Criteria andWdZcxdIsNull() {
            addCriterion("WD_ZCXD is null");
            return (Criteria) this;
        }

        public Criteria andWdZcxdIsNotNull() {
            addCriterion("WD_ZCXD is not null");
            return (Criteria) this;
        }

        public Criteria andWdZcxdEqualTo(Double value) {
            addCriterion("WD_ZCXD =", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdNotEqualTo(Double value) {
            addCriterion("WD_ZCXD <>", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdGreaterThan(Double value) {
            addCriterion("WD_ZCXD >", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdGreaterThanOrEqualTo(Double value) {
            addCriterion("WD_ZCXD >=", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdLessThan(Double value) {
            addCriterion("WD_ZCXD <", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdLessThanOrEqualTo(Double value) {
            addCriterion("WD_ZCXD <=", value, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdIn(List<Double> values) {
            addCriterion("WD_ZCXD in", values, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdNotIn(List<Double> values) {
            addCriterion("WD_ZCXD not in", values, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdBetween(Double value1, Double value2) {
            addCriterion("WD_ZCXD between", value1, value2, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andWdZcxdNotBetween(Double value1, Double value2) {
            addCriterion("WD_ZCXD not between", value1, value2, "wdZcxd");
            return (Criteria) this;
        }

        public Criteria andLxfsDhIsNull() {
            addCriterion("LXFS_DH is null");
            return (Criteria) this;
        }

        public Criteria andLxfsDhIsNotNull() {
            addCriterion("LXFS_DH is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsDhEqualTo(String value) {
            addCriterion("LXFS_DH =", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhNotEqualTo(String value) {
            addCriterion("LXFS_DH <>", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhGreaterThan(String value) {
            addCriterion("LXFS_DH >", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhGreaterThanOrEqualTo(String value) {
            addCriterion("LXFS_DH >=", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhLessThan(String value) {
            addCriterion("LXFS_DH <", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhLessThanOrEqualTo(String value) {
            addCriterion("LXFS_DH <=", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhLike(String value) {
            addCriterion("LXFS_DH like", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhNotLike(String value) {
            addCriterion("LXFS_DH not like", value, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhIn(List<String> values) {
            addCriterion("LXFS_DH in", values, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhNotIn(List<String> values) {
            addCriterion("LXFS_DH not in", values, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhBetween(String value1, String value2) {
            addCriterion("LXFS_DH between", value1, value2, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsDhNotBetween(String value1, String value2) {
            addCriterion("LXFS_DH not between", value1, value2, "lxfsDh");
            return (Criteria) this;
        }

        public Criteria andLxfsSjIsNull() {
            addCriterion("LXFS_SJ is null");
            return (Criteria) this;
        }

        public Criteria andLxfsSjIsNotNull() {
            addCriterion("LXFS_SJ is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsSjEqualTo(String value) {
            addCriterion("LXFS_SJ =", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjNotEqualTo(String value) {
            addCriterion("LXFS_SJ <>", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjGreaterThan(String value) {
            addCriterion("LXFS_SJ >", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjGreaterThanOrEqualTo(String value) {
            addCriterion("LXFS_SJ >=", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjLessThan(String value) {
            addCriterion("LXFS_SJ <", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjLessThanOrEqualTo(String value) {
            addCriterion("LXFS_SJ <=", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjLike(String value) {
            addCriterion("LXFS_SJ like", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjNotLike(String value) {
            addCriterion("LXFS_SJ not like", value, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjIn(List<String> values) {
            addCriterion("LXFS_SJ in", values, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjNotIn(List<String> values) {
            addCriterion("LXFS_SJ not in", values, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjBetween(String value1, String value2) {
            addCriterion("LXFS_SJ between", value1, value2, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsSjNotBetween(String value1, String value2) {
            addCriterion("LXFS_SJ not between", value1, value2, "lxfsSj");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrIsNull() {
            addCriterion("LXFS_LXR is null");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrIsNotNull() {
            addCriterion("LXFS_LXR is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrEqualTo(String value) {
            addCriterion("LXFS_LXR =", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrNotEqualTo(String value) {
            addCriterion("LXFS_LXR <>", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrGreaterThan(String value) {
            addCriterion("LXFS_LXR >", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrGreaterThanOrEqualTo(String value) {
            addCriterion("LXFS_LXR >=", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrLessThan(String value) {
            addCriterion("LXFS_LXR <", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrLessThanOrEqualTo(String value) {
            addCriterion("LXFS_LXR <=", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrLike(String value) {
            addCriterion("LXFS_LXR like", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrNotLike(String value) {
            addCriterion("LXFS_LXR not like", value, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrIn(List<String> values) {
            addCriterion("LXFS_LXR in", values, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrNotIn(List<String> values) {
            addCriterion("LXFS_LXR not in", values, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrBetween(String value1, String value2) {
            addCriterion("LXFS_LXR between", value1, value2, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsLxrNotBetween(String value1, String value2) {
            addCriterion("LXFS_LXR not between", value1, value2, "lxfsLxr");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmIsNull() {
            addCriterion("LXFS_CZHM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmIsNotNull() {
            addCriterion("LXFS_CZHM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmEqualTo(String value) {
            addCriterion("LXFS_CZHM =", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmNotEqualTo(String value) {
            addCriterion("LXFS_CZHM <>", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmGreaterThan(String value) {
            addCriterion("LXFS_CZHM >", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFS_CZHM >=", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmLessThan(String value) {
            addCriterion("LXFS_CZHM <", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmLessThanOrEqualTo(String value) {
            addCriterion("LXFS_CZHM <=", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmLike(String value) {
            addCriterion("LXFS_CZHM like", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmNotLike(String value) {
            addCriterion("LXFS_CZHM not like", value, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmIn(List<String> values) {
            addCriterion("LXFS_CZHM in", values, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmNotIn(List<String> values) {
            addCriterion("LXFS_CZHM not in", values, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmBetween(String value1, String value2) {
            addCriterion("LXFS_CZHM between", value1, value2, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsCzhmNotBetween(String value1, String value2) {
            addCriterion("LXFS_CZHM not between", value1, value2, "lxfsCzhm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmIsNull() {
            addCriterion("LXFS_YZBM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmIsNotNull() {
            addCriterion("LXFS_YZBM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmEqualTo(String value) {
            addCriterion("LXFS_YZBM =", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmNotEqualTo(String value) {
            addCriterion("LXFS_YZBM <>", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmGreaterThan(String value) {
            addCriterion("LXFS_YZBM >", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFS_YZBM >=", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmLessThan(String value) {
            addCriterion("LXFS_YZBM <", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmLessThanOrEqualTo(String value) {
            addCriterion("LXFS_YZBM <=", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmLike(String value) {
            addCriterion("LXFS_YZBM like", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmNotLike(String value) {
            addCriterion("LXFS_YZBM not like", value, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmIn(List<String> values) {
            addCriterion("LXFS_YZBM in", values, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmNotIn(List<String> values) {
            addCriterion("LXFS_YZBM not in", values, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmBetween(String value1, String value2) {
            addCriterion("LXFS_YZBM between", value1, value2, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsYzbmNotBetween(String value1, String value2) {
            addCriterion("LXFS_YZBM not between", value1, value2, "lxfsYzbm");
            return (Criteria) this;
        }

        public Criteria andDjzclxIsNull() {
            addCriterion("DJZCLX is null");
            return (Criteria) this;
        }

        public Criteria andDjzclxIsNotNull() {
            addCriterion("DJZCLX is not null");
            return (Criteria) this;
        }

        public Criteria andDjzclxEqualTo(String value) {
            addCriterion("DJZCLX =", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotEqualTo(String value) {
            addCriterion("DJZCLX <>", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxGreaterThan(String value) {
            addCriterion("DJZCLX >", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxGreaterThanOrEqualTo(String value) {
            addCriterion("DJZCLX >=", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxLessThan(String value) {
            addCriterion("DJZCLX <", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxLessThanOrEqualTo(String value) {
            addCriterion("DJZCLX <=", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxLike(String value) {
            addCriterion("DJZCLX like", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotLike(String value) {
            addCriterion("DJZCLX not like", value, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxIn(List<String> values) {
            addCriterion("DJZCLX in", values, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotIn(List<String> values) {
            addCriterion("DJZCLX not in", values, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxBetween(String value1, String value2) {
            addCriterion("DJZCLX between", value1, value2, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxNotBetween(String value1, String value2) {
            addCriterion("DJZCLX not between", value1, value2, "djzclx");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcIsNull() {
            addCriterion("DJZCLXMC is null");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcIsNotNull() {
            addCriterion("DJZCLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcEqualTo(String value) {
            addCriterion("DJZCLXMC =", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcNotEqualTo(String value) {
            addCriterion("DJZCLXMC <>", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcGreaterThan(String value) {
            addCriterion("DJZCLXMC >", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcGreaterThanOrEqualTo(String value) {
            addCriterion("DJZCLXMC >=", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcLessThan(String value) {
            addCriterion("DJZCLXMC <", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcLessThanOrEqualTo(String value) {
            addCriterion("DJZCLXMC <=", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcLike(String value) {
            addCriterion("DJZCLXMC like", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcNotLike(String value) {
            addCriterion("DJZCLXMC not like", value, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcIn(List<String> values) {
            addCriterion("DJZCLXMC in", values, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcNotIn(List<String> values) {
            addCriterion("DJZCLXMC not in", values, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcBetween(String value1, String value2) {
            addCriterion("DJZCLXMC between", value1, value2, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andDjzclxmcNotBetween(String value1, String value2) {
            addCriterion("DJZCLXMC not between", value1, value2, "djzclxmc");
            return (Criteria) this;
        }

        public Criteria andQygmIsNull() {
            addCriterion("QYGM is null");
            return (Criteria) this;
        }

        public Criteria andQygmIsNotNull() {
            addCriterion("QYGM is not null");
            return (Criteria) this;
        }

        public Criteria andQygmEqualTo(String value) {
            addCriterion("QYGM =", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotEqualTo(String value) {
            addCriterion("QYGM <>", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmGreaterThan(String value) {
            addCriterion("QYGM >", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmGreaterThanOrEqualTo(String value) {
            addCriterion("QYGM >=", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmLessThan(String value) {
            addCriterion("QYGM <", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmLessThanOrEqualTo(String value) {
            addCriterion("QYGM <=", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmLike(String value) {
            addCriterion("QYGM like", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotLike(String value) {
            addCriterion("QYGM not like", value, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmIn(List<String> values) {
            addCriterion("QYGM in", values, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotIn(List<String> values) {
            addCriterion("QYGM not in", values, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmBetween(String value1, String value2) {
            addCriterion("QYGM between", value1, value2, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmNotBetween(String value1, String value2) {
            addCriterion("QYGM not between", value1, value2, "qygm");
            return (Criteria) this;
        }

        public Criteria andQygmmcIsNull() {
            addCriterion("QYGMMC is null");
            return (Criteria) this;
        }

        public Criteria andQygmmcIsNotNull() {
            addCriterion("QYGMMC is not null");
            return (Criteria) this;
        }

        public Criteria andQygmmcEqualTo(String value) {
            addCriterion("QYGMMC =", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcNotEqualTo(String value) {
            addCriterion("QYGMMC <>", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcGreaterThan(String value) {
            addCriterion("QYGMMC >", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcGreaterThanOrEqualTo(String value) {
            addCriterion("QYGMMC >=", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcLessThan(String value) {
            addCriterion("QYGMMC <", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcLessThanOrEqualTo(String value) {
            addCriterion("QYGMMC <=", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcLike(String value) {
            addCriterion("QYGMMC like", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcNotLike(String value) {
            addCriterion("QYGMMC not like", value, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcIn(List<String> values) {
            addCriterion("QYGMMC in", values, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcNotIn(List<String> values) {
            addCriterion("QYGMMC not in", values, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcBetween(String value1, String value2) {
            addCriterion("QYGMMC between", value1, value2, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andQygmmcNotBetween(String value1, String value2) {
            addCriterion("QYGMMC not between", value1, value2, "qygmmc");
            return (Criteria) this;
        }

        public Criteria andSsjtgsIsNull() {
            addCriterion("SSJTGS is null");
            return (Criteria) this;
        }

        public Criteria andSsjtgsIsNotNull() {
            addCriterion("SSJTGS is not null");
            return (Criteria) this;
        }

        public Criteria andSsjtgsEqualTo(String value) {
            addCriterion("SSJTGS =", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotEqualTo(String value) {
            addCriterion("SSJTGS <>", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsGreaterThan(String value) {
            addCriterion("SSJTGS >", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsGreaterThanOrEqualTo(String value) {
            addCriterion("SSJTGS >=", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsLessThan(String value) {
            addCriterion("SSJTGS <", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsLessThanOrEqualTo(String value) {
            addCriterion("SSJTGS <=", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsLike(String value) {
            addCriterion("SSJTGS like", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotLike(String value) {
            addCriterion("SSJTGS not like", value, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsIn(List<String> values) {
            addCriterion("SSJTGS in", values, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotIn(List<String> values) {
            addCriterion("SSJTGS not in", values, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsBetween(String value1, String value2) {
            addCriterion("SSJTGS between", value1, value2, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andSsjtgsNotBetween(String value1, String value2) {
            addCriterion("SSJTGS not between", value1, value2, "ssjtgs");
            return (Criteria) this;
        }

        public Criteria andXylbdmIsNull() {
            addCriterion("XYLBDM is null");
            return (Criteria) this;
        }

        public Criteria andXylbdmIsNotNull() {
            addCriterion("XYLBDM is not null");
            return (Criteria) this;
        }

        public Criteria andXylbdmEqualTo(String value) {
            addCriterion("XYLBDM =", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotEqualTo(String value) {
            addCriterion("XYLBDM <>", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmGreaterThan(String value) {
            addCriterion("XYLBDM >", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmGreaterThanOrEqualTo(String value) {
            addCriterion("XYLBDM >=", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmLessThan(String value) {
            addCriterion("XYLBDM <", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmLessThanOrEqualTo(String value) {
            addCriterion("XYLBDM <=", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmLike(String value) {
            addCriterion("XYLBDM like", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotLike(String value) {
            addCriterion("XYLBDM not like", value, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmIn(List<String> values) {
            addCriterion("XYLBDM in", values, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotIn(List<String> values) {
            addCriterion("XYLBDM not in", values, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmBetween(String value1, String value2) {
            addCriterion("XYLBDM between", value1, value2, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbdmNotBetween(String value1, String value2) {
            addCriterion("XYLBDM not between", value1, value2, "xylbdm");
            return (Criteria) this;
        }

        public Criteria andXylbmcIsNull() {
            addCriterion("XYLBMC is null");
            return (Criteria) this;
        }

        public Criteria andXylbmcIsNotNull() {
            addCriterion("XYLBMC is not null");
            return (Criteria) this;
        }

        public Criteria andXylbmcEqualTo(String value) {
            addCriterion("XYLBMC =", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotEqualTo(String value) {
            addCriterion("XYLBMC <>", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcGreaterThan(String value) {
            addCriterion("XYLBMC >", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcGreaterThanOrEqualTo(String value) {
            addCriterion("XYLBMC >=", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcLessThan(String value) {
            addCriterion("XYLBMC <", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcLessThanOrEqualTo(String value) {
            addCriterion("XYLBMC <=", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcLike(String value) {
            addCriterion("XYLBMC like", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotLike(String value) {
            addCriterion("XYLBMC not like", value, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcIn(List<String> values) {
            addCriterion("XYLBMC in", values, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotIn(List<String> values) {
            addCriterion("XYLBMC not in", values, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcBetween(String value1, String value2) {
            addCriterion("XYLBMC between", value1, value2, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andXylbmcNotBetween(String value1, String value2) {
            addCriterion("XYLBMC not between", value1, value2, "xylbmc");
            return (Criteria) this;
        }

        public Criteria andKysjYIsNull() {
            addCriterion("KYSJ_Y is null");
            return (Criteria) this;
        }

        public Criteria andKysjYIsNotNull() {
            addCriterion("KYSJ_Y is not null");
            return (Criteria) this;
        }

        public Criteria andKysjYEqualTo(Integer value) {
            addCriterion("KYSJ_Y =", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYNotEqualTo(Integer value) {
            addCriterion("KYSJ_Y <>", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYGreaterThan(Integer value) {
            addCriterion("KYSJ_Y >", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYGreaterThanOrEqualTo(Integer value) {
            addCriterion("KYSJ_Y >=", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYLessThan(Integer value) {
            addCriterion("KYSJ_Y <", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYLessThanOrEqualTo(Integer value) {
            addCriterion("KYSJ_Y <=", value, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYIn(List<Integer> values) {
            addCriterion("KYSJ_Y in", values, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYNotIn(List<Integer> values) {
            addCriterion("KYSJ_Y not in", values, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYBetween(Integer value1, Integer value2) {
            addCriterion("KYSJ_Y between", value1, value2, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjYNotBetween(Integer value1, Integer value2) {
            addCriterion("KYSJ_Y not between", value1, value2, "kysjY");
            return (Criteria) this;
        }

        public Criteria andKysjNIsNull() {
            addCriterion("KYSJ_N is null");
            return (Criteria) this;
        }

        public Criteria andKysjNIsNotNull() {
            addCriterion("KYSJ_N is not null");
            return (Criteria) this;
        }

        public Criteria andKysjNEqualTo(Integer value) {
            addCriterion("KYSJ_N =", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNNotEqualTo(Integer value) {
            addCriterion("KYSJ_N <>", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNGreaterThan(Integer value) {
            addCriterion("KYSJ_N >", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNGreaterThanOrEqualTo(Integer value) {
            addCriterion("KYSJ_N >=", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNLessThan(Integer value) {
            addCriterion("KYSJ_N <", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNLessThanOrEqualTo(Integer value) {
            addCriterion("KYSJ_N <=", value, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNIn(List<Integer> values) {
            addCriterion("KYSJ_N in", values, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNNotIn(List<Integer> values) {
            addCriterion("KYSJ_N not in", values, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNBetween(Integer value1, Integer value2) {
            addCriterion("KYSJ_N between", value1, value2, "kysjN");
            return (Criteria) this;
        }

        public Criteria andKysjNNotBetween(Integer value1, Integer value2) {
            addCriterion("KYSJ_N not between", value1, value2, "kysjN");
            return (Criteria) this;
        }

        public Criteria andSzlydmIsNull() {
            addCriterion("SZLYDM is null");
            return (Criteria) this;
        }

        public Criteria andSzlydmIsNotNull() {
            addCriterion("SZLYDM is not null");
            return (Criteria) this;
        }

        public Criteria andSzlydmEqualTo(String value) {
            addCriterion("SZLYDM =", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotEqualTo(String value) {
            addCriterion("SZLYDM <>", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmGreaterThan(String value) {
            addCriterion("SZLYDM >", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmGreaterThanOrEqualTo(String value) {
            addCriterion("SZLYDM >=", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLessThan(String value) {
            addCriterion("SZLYDM <", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLessThanOrEqualTo(String value) {
            addCriterion("SZLYDM <=", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmLike(String value) {
            addCriterion("SZLYDM like", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotLike(String value) {
            addCriterion("SZLYDM not like", value, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmIn(List<String> values) {
            addCriterion("SZLYDM in", values, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotIn(List<String> values) {
            addCriterion("SZLYDM not in", values, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmBetween(String value1, String value2) {
            addCriterion("SZLYDM between", value1, value2, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlydmNotBetween(String value1, String value2) {
            addCriterion("SZLYDM not between", value1, value2, "szlydm");
            return (Criteria) this;
        }

        public Criteria andSzlymcIsNull() {
            addCriterion("SZLYMC is null");
            return (Criteria) this;
        }

        public Criteria andSzlymcIsNotNull() {
            addCriterion("SZLYMC is not null");
            return (Criteria) this;
        }

        public Criteria andSzlymcEqualTo(String value) {
            addCriterion("SZLYMC =", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotEqualTo(String value) {
            addCriterion("SZLYMC <>", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcGreaterThan(String value) {
            addCriterion("SZLYMC >", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcGreaterThanOrEqualTo(String value) {
            addCriterion("SZLYMC >=", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLessThan(String value) {
            addCriterion("SZLYMC <", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLessThanOrEqualTo(String value) {
            addCriterion("SZLYMC <=", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcLike(String value) {
            addCriterion("SZLYMC like", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotLike(String value) {
            addCriterion("SZLYMC not like", value, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcIn(List<String> values) {
            addCriterion("SZLYMC in", values, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotIn(List<String> values) {
            addCriterion("SZLYMC not in", values, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcBetween(String value1, String value2) {
            addCriterion("SZLYMC between", value1, value2, "szlymc");
            return (Criteria) this;
        }

        public Criteria andSzlymcNotBetween(String value1, String value2) {
            addCriterion("SZLYMC not between", value1, value2, "szlymc");
            return (Criteria) this;
        }

        public Criteria andPsqxdmIsNull() {
            addCriterion("PSQXDM is null");
            return (Criteria) this;
        }

        public Criteria andPsqxdmIsNotNull() {
            addCriterion("PSQXDM is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxdmEqualTo(String value) {
            addCriterion("PSQXDM =", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotEqualTo(String value) {
            addCriterion("PSQXDM <>", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmGreaterThan(String value) {
            addCriterion("PSQXDM >", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXDM >=", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmLessThan(String value) {
            addCriterion("PSQXDM <", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmLessThanOrEqualTo(String value) {
            addCriterion("PSQXDM <=", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmLike(String value) {
            addCriterion("PSQXDM like", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotLike(String value) {
            addCriterion("PSQXDM not like", value, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmIn(List<String> values) {
            addCriterion("PSQXDM in", values, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotIn(List<String> values) {
            addCriterion("PSQXDM not in", values, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmBetween(String value1, String value2) {
            addCriterion("PSQXDM between", value1, value2, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxdmNotBetween(String value1, String value2) {
            addCriterion("PSQXDM not between", value1, value2, "psqxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxIsNull() {
            addCriterion("PSQXLX is null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxIsNotNull() {
            addCriterion("PSQXLX is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxEqualTo(String value) {
            addCriterion("PSQXLX =", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotEqualTo(String value) {
            addCriterion("PSQXLX <>", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxGreaterThan(String value) {
            addCriterion("PSQXLX >", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXLX >=", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxLessThan(String value) {
            addCriterion("PSQXLX <", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxLessThanOrEqualTo(String value) {
            addCriterion("PSQXLX <=", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxLike(String value) {
            addCriterion("PSQXLX like", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotLike(String value) {
            addCriterion("PSQXLX not like", value, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxIn(List<String> values) {
            addCriterion("PSQXLX in", values, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotIn(List<String> values) {
            addCriterion("PSQXLX not in", values, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxBetween(String value1, String value2) {
            addCriterion("PSQXLX between", value1, value2, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPsqxlxNotBetween(String value1, String value2) {
            addCriterion("PSQXLX not between", value1, value2, "psqxlx");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmIsNull() {
            addCriterion("PRDWSCLCDM is null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmIsNotNull() {
            addCriterion("PRDWSCLCDM is not null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmEqualTo(String value) {
            addCriterion("PRDWSCLCDM =", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotEqualTo(String value) {
            addCriterion("PRDWSCLCDM <>", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmGreaterThan(String value) {
            addCriterion("PRDWSCLCDM >", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmGreaterThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCDM >=", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmLessThan(String value) {
            addCriterion("PRDWSCLCDM <", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmLessThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCDM <=", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmLike(String value) {
            addCriterion("PRDWSCLCDM like", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotLike(String value) {
            addCriterion("PRDWSCLCDM not like", value, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmIn(List<String> values) {
            addCriterion("PRDWSCLCDM in", values, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotIn(List<String> values) {
            addCriterion("PRDWSCLCDM not in", values, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmBetween(String value1, String value2) {
            addCriterion("PRDWSCLCDM between", value1, value2, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcdmNotBetween(String value1, String value2) {
            addCriterion("PRDWSCLCDM not between", value1, value2, "prdwsclcdm");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcIsNull() {
            addCriterion("PRDWSCLCMC is null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcIsNotNull() {
            addCriterion("PRDWSCLCMC is not null");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcEqualTo(String value) {
            addCriterion("PRDWSCLCMC =", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotEqualTo(String value) {
            addCriterion("PRDWSCLCMC <>", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcGreaterThan(String value) {
            addCriterion("PRDWSCLCMC >", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcGreaterThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCMC >=", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcLessThan(String value) {
            addCriterion("PRDWSCLCMC <", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcLessThanOrEqualTo(String value) {
            addCriterion("PRDWSCLCMC <=", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcLike(String value) {
            addCriterion("PRDWSCLCMC like", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotLike(String value) {
            addCriterion("PRDWSCLCMC not like", value, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcIn(List<String> values) {
            addCriterion("PRDWSCLCMC in", values, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotIn(List<String> values) {
            addCriterion("PRDWSCLCMC not in", values, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcBetween(String value1, String value2) {
            addCriterion("PRDWSCLCMC between", value1, value2, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andPrdwsclcmcNotBetween(String value1, String value2) {
            addCriterion("PRDWSCLCMC not between", value1, value2, "prdwsclcmc");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNull() {
            addCriterion("SNSTDM is null");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNotNull() {
            addCriterion("SNSTDM is not null");
            return (Criteria) this;
        }

        public Criteria andSnstdmEqualTo(String value) {
            addCriterion("SNSTDM =", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotEqualTo(String value) {
            addCriterion("SNSTDM <>", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThan(String value) {
            addCriterion("SNSTDM >", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTDM >=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThan(String value) {
            addCriterion("SNSTDM <", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThanOrEqualTo(String value) {
            addCriterion("SNSTDM <=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLike(String value) {
            addCriterion("SNSTDM like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotLike(String value) {
            addCriterion("SNSTDM not like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmIn(List<String> values) {
            addCriterion("SNSTDM in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotIn(List<String> values) {
            addCriterion("SNSTDM not in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmBetween(String value1, String value2) {
            addCriterion("SNSTDM between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotBetween(String value1, String value2) {
            addCriterion("SNSTDM not between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNull() {
            addCriterion("SNSTMC is null");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNotNull() {
            addCriterion("SNSTMC is not null");
            return (Criteria) this;
        }

        public Criteria andSnstmcEqualTo(String value) {
            addCriterion("SNSTMC =", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotEqualTo(String value) {
            addCriterion("SNSTMC <>", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThan(String value) {
            addCriterion("SNSTMC >", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTMC >=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThan(String value) {
            addCriterion("SNSTMC <", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThanOrEqualTo(String value) {
            addCriterion("SNSTMC <=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLike(String value) {
            addCriterion("SNSTMC like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotLike(String value) {
            addCriterion("SNSTMC not like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcIn(List<String> values) {
            addCriterion("SNSTMC in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotIn(List<String> values) {
            addCriterion("SNSTMC not in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcBetween(String value1, String value2) {
            addCriterion("SNSTMC between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotBetween(String value1, String value2) {
            addCriterion("SNSTMC not between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andQslDIsNull() {
            addCriterion("QSL_D is null");
            return (Criteria) this;
        }

        public Criteria andQslDIsNotNull() {
            addCriterion("QSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQslDEqualTo(Double value) {
            addCriterion("QSL_D =", value, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDNotEqualTo(Double value) {
            addCriterion("QSL_D <>", value, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDGreaterThan(Double value) {
            addCriterion("QSL_D >", value, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDGreaterThanOrEqualTo(Double value) {
            addCriterion("QSL_D >=", value, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDLessThan(Double value) {
            addCriterion("QSL_D <", value, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDLessThanOrEqualTo(Double value) {
            addCriterion("QSL_D <=", value, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDIn(List<Double> values) {
            addCriterion("QSL_D in", values, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDNotIn(List<Double> values) {
            addCriterion("QSL_D not in", values, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDBetween(Double value1, Double value2) {
            addCriterion("QSL_D between", value1, value2, "qslD");
            return (Criteria) this;
        }

        public Criteria andQslDNotBetween(Double value1, Double value2) {
            addCriterion("QSL_D not between", value1, value2, "qslD");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyIsNull() {
            addCriterion("GYZCZ_DNJG_WY is null");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyIsNotNull() {
            addCriterion("GYZCZ_DNJG_WY is not null");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyEqualTo(Double value) {
            addCriterion("GYZCZ_DNJG_WY =", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyNotEqualTo(Double value) {
            addCriterion("GYZCZ_DNJG_WY <>", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyGreaterThan(Double value) {
            addCriterion("GYZCZ_DNJG_WY >", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyGreaterThanOrEqualTo(Double value) {
            addCriterion("GYZCZ_DNJG_WY >=", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyLessThan(Double value) {
            addCriterion("GYZCZ_DNJG_WY <", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyLessThanOrEqualTo(Double value) {
            addCriterion("GYZCZ_DNJG_WY <=", value, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyIn(List<Double> values) {
            addCriterion("GYZCZ_DNJG_WY in", values, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyNotIn(List<Double> values) {
            addCriterion("GYZCZ_DNJG_WY not in", values, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyBetween(Double value1, Double value2) {
            addCriterion("GYZCZ_DNJG_WY between", value1, value2, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andGyzczDnjgWyNotBetween(Double value1, Double value2) {
            addCriterion("GYZCZ_DNJG_WY not between", value1, value2, "gyzczDnjgWy");
            return (Criteria) this;
        }

        public Criteria andSzsqyIsNull() {
            addCriterion("SZSQY is null");
            return (Criteria) this;
        }

        public Criteria andSzsqyIsNotNull() {
            addCriterion("SZSQY is not null");
            return (Criteria) this;
        }

        public Criteria andSzsqyEqualTo(String value) {
            addCriterion("SZSQY =", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyNotEqualTo(String value) {
            addCriterion("SZSQY <>", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyGreaterThan(String value) {
            addCriterion("SZSQY >", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyGreaterThanOrEqualTo(String value) {
            addCriterion("SZSQY >=", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyLessThan(String value) {
            addCriterion("SZSQY <", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyLessThanOrEqualTo(String value) {
            addCriterion("SZSQY <=", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyLike(String value) {
            addCriterion("SZSQY like", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyNotLike(String value) {
            addCriterion("SZSQY not like", value, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyIn(List<String> values) {
            addCriterion("SZSQY in", values, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyNotIn(List<String> values) {
            addCriterion("SZSQY not in", values, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyBetween(String value1, String value2) {
            addCriterion("SZSQY between", value1, value2, "szsqy");
            return (Criteria) this;
        }

        public Criteria andSzsqyNotBetween(String value1, String value2) {
            addCriterion("SZSQY not between", value1, value2, "szsqy");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsIsNull() {
            addCriterion("NZCSCSJ_XS is null");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsIsNotNull() {
            addCriterion("NZCSCSJ_XS is not null");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsEqualTo(Integer value) {
            addCriterion("NZCSCSJ_XS =", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsNotEqualTo(Integer value) {
            addCriterion("NZCSCSJ_XS <>", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsGreaterThan(Integer value) {
            addCriterion("NZCSCSJ_XS >", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsGreaterThanOrEqualTo(Integer value) {
            addCriterion("NZCSCSJ_XS >=", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsLessThan(Integer value) {
            addCriterion("NZCSCSJ_XS <", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsLessThanOrEqualTo(Integer value) {
            addCriterion("NZCSCSJ_XS <=", value, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsIn(List<Integer> values) {
            addCriterion("NZCSCSJ_XS in", values, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsNotIn(List<Integer> values) {
            addCriterion("NZCSCSJ_XS not in", values, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsBetween(Integer value1, Integer value2) {
            addCriterion("NZCSCSJ_XS between", value1, value2, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andNzcscsjXsNotBetween(Integer value1, Integer value2) {
            addCriterion("NZCSCSJ_XS not between", value1, value2, "nzcscsjXs");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzIsNull() {
            addCriterion("WXFWZHJYXKZ is null");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzIsNotNull() {
            addCriterion("WXFWZHJYXKZ is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzEqualTo(String value) {
            addCriterion("WXFWZHJYXKZ =", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzNotEqualTo(String value) {
            addCriterion("WXFWZHJYXKZ <>", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzGreaterThan(String value) {
            addCriterion("WXFWZHJYXKZ >", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzGreaterThanOrEqualTo(String value) {
            addCriterion("WXFWZHJYXKZ >=", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzLessThan(String value) {
            addCriterion("WXFWZHJYXKZ <", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzLessThanOrEqualTo(String value) {
            addCriterion("WXFWZHJYXKZ <=", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzLike(String value) {
            addCriterion("WXFWZHJYXKZ like", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzNotLike(String value) {
            addCriterion("WXFWZHJYXKZ not like", value, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzIn(List<String> values) {
            addCriterion("WXFWZHJYXKZ in", values, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzNotIn(List<String> values) {
            addCriterion("WXFWZHJYXKZ not in", values, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzBetween(String value1, String value2) {
            addCriterion("WXFWZHJYXKZ between", value1, value2, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andWxfwzhjyxkzNotBetween(String value1, String value2) {
            addCriterion("WXFWZHJYXKZ not between", value1, value2, "wxfwzhjyxkz");
            return (Criteria) this;
        }

        public Criteria andPwxkbjIsNull() {
            addCriterion("PWXKBJ is null");
            return (Criteria) this;
        }

        public Criteria andPwxkbjIsNotNull() {
            addCriterion("PWXKBJ is not null");
            return (Criteria) this;
        }

        public Criteria andPwxkbjEqualTo(String value) {
            addCriterion("PWXKBJ =", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjNotEqualTo(String value) {
            addCriterion("PWXKBJ <>", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjGreaterThan(String value) {
            addCriterion("PWXKBJ >", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjGreaterThanOrEqualTo(String value) {
            addCriterion("PWXKBJ >=", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjLessThan(String value) {
            addCriterion("PWXKBJ <", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjLessThanOrEqualTo(String value) {
            addCriterion("PWXKBJ <=", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjLike(String value) {
            addCriterion("PWXKBJ like", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjNotLike(String value) {
            addCriterion("PWXKBJ not like", value, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjIn(List<String> values) {
            addCriterion("PWXKBJ in", values, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjNotIn(List<String> values) {
            addCriterion("PWXKBJ not in", values, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjBetween(String value1, String value2) {
            addCriterion("PWXKBJ between", value1, value2, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andPwxkbjNotBetween(String value1, String value2) {
            addCriterion("PWXKBJ not between", value1, value2, "pwxkbj");
            return (Criteria) this;
        }

        public Criteria andWtxhlDIsNull() {
            addCriterion("WTXHL_D is null");
            return (Criteria) this;
        }

        public Criteria andWtxhlDIsNotNull() {
            addCriterion("WTXHL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWtxhlDEqualTo(Double value) {
            addCriterion("WTXHL_D =", value, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDNotEqualTo(Double value) {
            addCriterion("WTXHL_D <>", value, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDGreaterThan(Double value) {
            addCriterion("WTXHL_D >", value, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDGreaterThanOrEqualTo(Double value) {
            addCriterion("WTXHL_D >=", value, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDLessThan(Double value) {
            addCriterion("WTXHL_D <", value, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDLessThanOrEqualTo(Double value) {
            addCriterion("WTXHL_D <=", value, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDIn(List<Double> values) {
            addCriterion("WTXHL_D in", values, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDNotIn(List<Double> values) {
            addCriterion("WTXHL_D not in", values, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDBetween(Double value1, Double value2) {
            addCriterion("WTXHL_D between", value1, value2, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andWtxhlDNotBetween(Double value1, Double value2) {
            addCriterion("WTXHL_D not between", value1, value2, "wtxhlD");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjIsNull() {
            addCriterion("ZDPWDWBJ is null");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjIsNotNull() {
            addCriterion("ZDPWDWBJ is not null");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjEqualTo(String value) {
            addCriterion("ZDPWDWBJ =", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjNotEqualTo(String value) {
            addCriterion("ZDPWDWBJ <>", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjGreaterThan(String value) {
            addCriterion("ZDPWDWBJ >", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjGreaterThanOrEqualTo(String value) {
            addCriterion("ZDPWDWBJ >=", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjLessThan(String value) {
            addCriterion("ZDPWDWBJ <", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjLessThanOrEqualTo(String value) {
            addCriterion("ZDPWDWBJ <=", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjLike(String value) {
            addCriterion("ZDPWDWBJ like", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjNotLike(String value) {
            addCriterion("ZDPWDWBJ not like", value, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjIn(List<String> values) {
            addCriterion("ZDPWDWBJ in", values, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjNotIn(List<String> values) {
            addCriterion("ZDPWDWBJ not in", values, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjBetween(String value1, String value2) {
            addCriterion("ZDPWDWBJ between", value1, value2, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andZdpwdwbjNotBetween(String value1, String value2) {
            addCriterion("ZDPWDWBJ not between", value1, value2, "zdpwdwbj");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDIsNull() {
            addCriterion("QZ_RLMXHL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDIsNotNull() {
            addCriterion("QZ_RLMXHL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDEqualTo(Double value) {
            addCriterion("QZ_RLMXHL_D =", value, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDNotEqualTo(Double value) {
            addCriterion("QZ_RLMXHL_D <>", value, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDGreaterThan(Double value) {
            addCriterion("QZ_RLMXHL_D >", value, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMXHL_D >=", value, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDLessThan(Double value) {
            addCriterion("QZ_RLMXHL_D <", value, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMXHL_D <=", value, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDIn(List<Double> values) {
            addCriterion("QZ_RLMXHL_D in", values, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDNotIn(List<Double> values) {
            addCriterion("QZ_RLMXHL_D not in", values, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMXHL_D between", value1, value2, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmxhlDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMXHL_D not between", value1, value2, "qzRlmxhlD");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsIsNull() {
            addCriterion("QZ_RLMPJHLL_BFS is null");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsIsNotNull() {
            addCriterion("QZ_RLMPJHLL_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsEqualTo(Double value) {
            addCriterion("QZ_RLMPJHLL_BFS =", value, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsNotEqualTo(Double value) {
            addCriterion("QZ_RLMPJHLL_BFS <>", value, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsGreaterThan(Double value) {
            addCriterion("QZ_RLMPJHLL_BFS >", value, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMPJHLL_BFS >=", value, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsLessThan(Double value) {
            addCriterion("QZ_RLMPJHLL_BFS <", value, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsLessThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMPJHLL_BFS <=", value, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsIn(List<Double> values) {
            addCriterion("QZ_RLMPJHLL_BFS in", values, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsNotIn(List<Double> values) {
            addCriterion("QZ_RLMPJHLL_BFS not in", values, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMPJHLL_BFS between", value1, value2, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhllBfsNotBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMPJHLL_BFS not between", value1, value2, "qzRlmpjhllBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsIsNull() {
            addCriterion("QZ_RLMPJHF_BFS is null");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsIsNotNull() {
            addCriterion("QZ_RLMPJHF_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsEqualTo(Double value) {
            addCriterion("QZ_RLMPJHF_BFS =", value, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsNotEqualTo(Double value) {
            addCriterion("QZ_RLMPJHF_BFS <>", value, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsGreaterThan(Double value) {
            addCriterion("QZ_RLMPJHF_BFS >", value, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMPJHF_BFS >=", value, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsLessThan(Double value) {
            addCriterion("QZ_RLMPJHF_BFS <", value, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsLessThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMPJHF_BFS <=", value, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsIn(List<Double> values) {
            addCriterion("QZ_RLMPJHF_BFS in", values, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsNotIn(List<Double> values) {
            addCriterion("QZ_RLMPJHF_BFS not in", values, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMPJHF_BFS between", value1, value2, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhfBfsNotBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMPJHF_BFS not between", value1, value2, "qzRlmpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsIsNull() {
            addCriterion("QZ_RLMPJHJHF_BFS is null");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsIsNotNull() {
            addCriterion("QZ_RLMPJHJHF_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsEqualTo(Double value) {
            addCriterion("QZ_RLMPJHJHF_BFS =", value, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsNotEqualTo(Double value) {
            addCriterion("QZ_RLMPJHJHF_BFS <>", value, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsGreaterThan(Double value) {
            addCriterion("QZ_RLMPJHJHF_BFS >", value, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMPJHJHF_BFS >=", value, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsLessThan(Double value) {
            addCriterion("QZ_RLMPJHJHF_BFS <", value, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsLessThanOrEqualTo(Double value) {
            addCriterion("QZ_RLMPJHJHF_BFS <=", value, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsIn(List<Double> values) {
            addCriterion("QZ_RLMPJHJHF_BFS in", values, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsNotIn(List<Double> values) {
            addCriterion("QZ_RLMPJHJHF_BFS not in", values, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMPJHJHF_BFS between", value1, value2, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andQzRlmpjhjhfBfsNotBetween(Double value1, Double value2) {
            addCriterion("QZ_RLMPJHJHF_BFS not between", value1, value2, "qzRlmpjhjhfBfs");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDIsNull() {
            addCriterion("RLYXHL_D is null");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDIsNotNull() {
            addCriterion("RLYXHL_D is not null");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDEqualTo(Double value) {
            addCriterion("RLYXHL_D =", value, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDNotEqualTo(Double value) {
            addCriterion("RLYXHL_D <>", value, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDGreaterThan(Double value) {
            addCriterion("RLYXHL_D >", value, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDGreaterThanOrEqualTo(Double value) {
            addCriterion("RLYXHL_D >=", value, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDLessThan(Double value) {
            addCriterion("RLYXHL_D <", value, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDLessThanOrEqualTo(Double value) {
            addCriterion("RLYXHL_D <=", value, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDIn(List<Double> values) {
            addCriterion("RLYXHL_D in", values, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDNotIn(List<Double> values) {
            addCriterion("RLYXHL_D not in", values, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDBetween(Double value1, Double value2) {
            addCriterion("RLYXHL_D between", value1, value2, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlyxhlDNotBetween(Double value1, Double value2) {
            addCriterion("RLYXHL_D not between", value1, value2, "rlyxhlD");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsIsNull() {
            addCriterion("RLYPJHSL_BFS is null");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsIsNotNull() {
            addCriterion("RLYPJHSL_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsEqualTo(Double value) {
            addCriterion("RLYPJHSL_BFS =", value, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsNotEqualTo(Double value) {
            addCriterion("RLYPJHSL_BFS <>", value, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsGreaterThan(Double value) {
            addCriterion("RLYPJHSL_BFS >", value, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("RLYPJHSL_BFS >=", value, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsLessThan(Double value) {
            addCriterion("RLYPJHSL_BFS <", value, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsLessThanOrEqualTo(Double value) {
            addCriterion("RLYPJHSL_BFS <=", value, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsIn(List<Double> values) {
            addCriterion("RLYPJHSL_BFS in", values, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsNotIn(List<Double> values) {
            addCriterion("RLYPJHSL_BFS not in", values, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsBetween(Double value1, Double value2) {
            addCriterion("RLYPJHSL_BFS between", value1, value2, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andRlypjhslBfsNotBetween(Double value1, Double value2) {
            addCriterion("RLYPJHSL_BFS not between", value1, value2, "rlypjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtxhlDIsNull() {
            addCriterion("JTXHL_D is null");
            return (Criteria) this;
        }

        public Criteria andJtxhlDIsNotNull() {
            addCriterion("JTXHL_D is not null");
            return (Criteria) this;
        }

        public Criteria andJtxhlDEqualTo(Double value) {
            addCriterion("JTXHL_D =", value, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDNotEqualTo(Double value) {
            addCriterion("JTXHL_D <>", value, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDGreaterThan(Double value) {
            addCriterion("JTXHL_D >", value, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDGreaterThanOrEqualTo(Double value) {
            addCriterion("JTXHL_D >=", value, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDLessThan(Double value) {
            addCriterion("JTXHL_D <", value, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDLessThanOrEqualTo(Double value) {
            addCriterion("JTXHL_D <=", value, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDIn(List<Double> values) {
            addCriterion("JTXHL_D in", values, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDNotIn(List<Double> values) {
            addCriterion("JTXHL_D not in", values, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDBetween(Double value1, Double value2) {
            addCriterion("JTXHL_D between", value1, value2, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtxhlDNotBetween(Double value1, Double value2) {
            addCriterion("JTXHL_D not between", value1, value2, "jtxhlD");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsIsNull() {
            addCriterion("JTPJHSL_BFS is null");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsIsNotNull() {
            addCriterion("JTPJHSL_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsEqualTo(Double value) {
            addCriterion("JTPJHSL_BFS =", value, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsNotEqualTo(Double value) {
            addCriterion("JTPJHSL_BFS <>", value, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsGreaterThan(Double value) {
            addCriterion("JTPJHSL_BFS >", value, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("JTPJHSL_BFS >=", value, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsLessThan(Double value) {
            addCriterion("JTPJHSL_BFS <", value, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsLessThanOrEqualTo(Double value) {
            addCriterion("JTPJHSL_BFS <=", value, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsIn(List<Double> values) {
            addCriterion("JTPJHSL_BFS in", values, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsNotIn(List<Double> values) {
            addCriterion("JTPJHSL_BFS not in", values, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsBetween(Double value1, Double value2) {
            addCriterion("JTPJHSL_BFS between", value1, value2, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhslBfsNotBetween(Double value1, Double value2) {
            addCriterion("JTPJHSL_BFS not between", value1, value2, "jtpjhslBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsIsNull() {
            addCriterion("JTPJHF_BFS is null");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsIsNotNull() {
            addCriterion("JTPJHF_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsEqualTo(Double value) {
            addCriterion("JTPJHF_BFS =", value, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsNotEqualTo(Double value) {
            addCriterion("JTPJHF_BFS <>", value, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsGreaterThan(Double value) {
            addCriterion("JTPJHF_BFS >", value, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("JTPJHF_BFS >=", value, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsLessThan(Double value) {
            addCriterion("JTPJHF_BFS <", value, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsLessThanOrEqualTo(Double value) {
            addCriterion("JTPJHF_BFS <=", value, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsIn(List<Double> values) {
            addCriterion("JTPJHF_BFS in", values, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsNotIn(List<Double> values) {
            addCriterion("JTPJHF_BFS not in", values, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsBetween(Double value1, Double value2) {
            addCriterion("JTPJHF_BFS between", value1, value2, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andJtpjhfBfsNotBetween(Double value1, Double value2) {
            addCriterion("JTPJHF_BFS not between", value1, value2, "jtpjhfBfs");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmIsNull() {
            addCriterion("TRQXHL_WLFM is null");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmIsNotNull() {
            addCriterion("TRQXHL_WLFM is not null");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmEqualTo(Double value) {
            addCriterion("TRQXHL_WLFM =", value, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmNotEqualTo(Double value) {
            addCriterion("TRQXHL_WLFM <>", value, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmGreaterThan(Double value) {
            addCriterion("TRQXHL_WLFM >", value, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmGreaterThanOrEqualTo(Double value) {
            addCriterion("TRQXHL_WLFM >=", value, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmLessThan(Double value) {
            addCriterion("TRQXHL_WLFM <", value, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmLessThanOrEqualTo(Double value) {
            addCriterion("TRQXHL_WLFM <=", value, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmIn(List<Double> values) {
            addCriterion("TRQXHL_WLFM in", values, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmNotIn(List<Double> values) {
            addCriterion("TRQXHL_WLFM not in", values, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmBetween(Double value1, Double value2) {
            addCriterion("TRQXHL_WLFM between", value1, value2, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andTrqxhlWlfmNotBetween(Double value1, Double value2) {
            addCriterion("TRQXHL_WLFM not between", value1, value2, "trqxhlWlfm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmIsNull() {
            addCriterion("QTRYXHL_DBZM is null");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmIsNotNull() {
            addCriterion("QTRYXHL_DBZM is not null");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmEqualTo(Double value) {
            addCriterion("QTRYXHL_DBZM =", value, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmNotEqualTo(Double value) {
            addCriterion("QTRYXHL_DBZM <>", value, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmGreaterThan(Double value) {
            addCriterion("QTRYXHL_DBZM >", value, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmGreaterThanOrEqualTo(Double value) {
            addCriterion("QTRYXHL_DBZM >=", value, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmLessThan(Double value) {
            addCriterion("QTRYXHL_DBZM <", value, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmLessThanOrEqualTo(Double value) {
            addCriterion("QTRYXHL_DBZM <=", value, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmIn(List<Double> values) {
            addCriterion("QTRYXHL_DBZM in", values, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmNotIn(List<Double> values) {
            addCriterion("QTRYXHL_DBZM not in", values, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmBetween(Double value1, Double value2) {
            addCriterion("QTRYXHL_DBZM between", value1, value2, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andQtryxhlDbzmNotBetween(Double value1, Double value2) {
            addCriterion("QTRYXHL_DBZM not between", value1, value2, "qtryxhlDbzm");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIsNull() {
            addCriterion("YDL_WQWS is null");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIsNotNull() {
            addCriterion("YDL_WQWS is not null");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsEqualTo(Double value) {
            addCriterion("YDL_WQWS =", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotEqualTo(Double value) {
            addCriterion("YDL_WQWS <>", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsGreaterThan(Double value) {
            addCriterion("YDL_WQWS >", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsGreaterThanOrEqualTo(Double value) {
            addCriterion("YDL_WQWS >=", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsLessThan(Double value) {
            addCriterion("YDL_WQWS <", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsLessThanOrEqualTo(Double value) {
            addCriterion("YDL_WQWS <=", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIn(List<Double> values) {
            addCriterion("YDL_WQWS in", values, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotIn(List<Double> values) {
            addCriterion("YDL_WQWS not in", values, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsBetween(Double value1, Double value2) {
            addCriterion("YDL_WQWS between", value1, value2, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotBetween(Double value1, Double value2) {
            addCriterion("YDL_WQWS not between", value1, value2, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andGyglsTIsNull() {
            addCriterion("GYGLS_T is null");
            return (Criteria) this;
        }

        public Criteria andGyglsTIsNotNull() {
            addCriterion("GYGLS_T is not null");
            return (Criteria) this;
        }

        public Criteria andGyglsTEqualTo(Integer value) {
            addCriterion("GYGLS_T =", value, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTNotEqualTo(Integer value) {
            addCriterion("GYGLS_T <>", value, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTGreaterThan(Integer value) {
            addCriterion("GYGLS_T >", value, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_T >=", value, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTLessThan(Integer value) {
            addCriterion("GYGLS_T <", value, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_T <=", value, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTIn(List<Integer> values) {
            addCriterion("GYGLS_T in", values, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTNotIn(List<Integer> values) {
            addCriterion("GYGLS_T not in", values, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_T between", value1, value2, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsTNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_T not between", value1, value2, "gyglsT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TIsNull() {
            addCriterion("GYGLS_UP20_T is null");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TIsNotNull() {
            addCriterion("GYGLS_UP20_T is not null");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_T =", value, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TNotEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_T <>", value, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TGreaterThan(Integer value) {
            addCriterion("GYGLS_UP20_T >", value, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_T >=", value, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TLessThan(Integer value) {
            addCriterion("GYGLS_UP20_T <", value, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_T <=", value, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TIn(List<Integer> values) {
            addCriterion("GYGLS_UP20_T in", values, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TNotIn(List<Integer> values) {
            addCriterion("GYGLS_UP20_T not in", values, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_UP20_T between", value1, value2, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_UP20_T not between", value1, value2, "gyglsUp20T");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTIsNull() {
            addCriterion("GYGLS_UP20_TL_T is null");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTIsNotNull() {
            addCriterion("GYGLS_UP20_TL_T is not null");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_TL_T =", value, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTNotEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_TL_T <>", value, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTGreaterThan(Integer value) {
            addCriterion("GYGLS_UP20_TL_T >", value, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_TL_T >=", value, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTLessThan(Integer value) {
            addCriterion("GYGLS_UP20_TL_T <", value, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_UP20_TL_T <=", value, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTIn(List<Integer> values) {
            addCriterion("GYGLS_UP20_TL_T in", values, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTNotIn(List<Integer> values) {
            addCriterion("GYGLS_UP20_TL_T not in", values, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_UP20_TL_T between", value1, value2, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGyglsUp20TlTNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_UP20_TL_T not between", value1, value2, "gyglsUp20TlT");
            return (Criteria) this;
        }

        public Criteria andGygls1020TIsNull() {
            addCriterion("GYGLS_10-20_T is null");
            return (Criteria) this;
        }

        public Criteria andGygls1020TIsNotNull() {
            addCriterion("GYGLS_10-20_T is not null");
            return (Criteria) this;
        }

        public Criteria andGygls1020TEqualTo(Integer value) {
            addCriterion("GYGLS_10-20_T =", value, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TNotEqualTo(Integer value) {
            addCriterion("GYGLS_10-20_T <>", value, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TGreaterThan(Integer value) {
            addCriterion("GYGLS_10-20_T >", value, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_10-20_T >=", value, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TLessThan(Integer value) {
            addCriterion("GYGLS_10-20_T <", value, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_10-20_T <=", value, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TIn(List<Integer> values) {
            addCriterion("GYGLS_10-20_T in", values, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TNotIn(List<Integer> values) {
            addCriterion("GYGLS_10-20_T not in", values, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_10-20_T between", value1, value2, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGygls1020TNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_10-20_T not between", value1, value2, "gygls1020T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TIsNull() {
            addCriterion("GYGLS_DOWN10_T is null");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TIsNotNull() {
            addCriterion("GYGLS_DOWN10_T is not null");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TEqualTo(Integer value) {
            addCriterion("GYGLS_DOWN10_T =", value, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TNotEqualTo(Integer value) {
            addCriterion("GYGLS_DOWN10_T <>", value, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TGreaterThan(Integer value) {
            addCriterion("GYGLS_DOWN10_T >", value, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_DOWN10_T >=", value, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TLessThan(Integer value) {
            addCriterion("GYGLS_DOWN10_T <", value, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLS_DOWN10_T <=", value, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TIn(List<Integer> values) {
            addCriterion("GYGLS_DOWN10_T in", values, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TNotIn(List<Integer> values) {
            addCriterion("GYGLS_DOWN10_T not in", values, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_DOWN10_T between", value1, value2, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglsDown10TNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLS_DOWN10_T not between", value1, value2, "gyglsDown10T");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdIsNull() {
            addCriterion("GYGLZDS_ZD is null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdIsNotNull() {
            addCriterion("GYGLZDS_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdEqualTo(Integer value) {
            addCriterion("GYGLZDS_ZD =", value, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdNotEqualTo(Integer value) {
            addCriterion("GYGLZDS_ZD <>", value, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdGreaterThan(Integer value) {
            addCriterion("GYGLZDS_ZD >", value, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_ZD >=", value, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdLessThan(Integer value) {
            addCriterion("GYGLZDS_ZD <", value, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_ZD <=", value, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdIn(List<Integer> values) {
            addCriterion("GYGLZDS_ZD in", values, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdNotIn(List<Integer> values) {
            addCriterion("GYGLZDS_ZD not in", values, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_ZD between", value1, value2, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsZdNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_ZD not between", value1, value2, "gyglzdsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdIsNull() {
            addCriterion("GYGLZDS_UP20_ZD is null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdIsNotNull() {
            addCriterion("GYGLZDS_UP20_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_ZD =", value, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdNotEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_ZD <>", value, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdGreaterThan(Integer value) {
            addCriterion("GYGLZDS_UP20_ZD >", value, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_ZD >=", value, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdLessThan(Integer value) {
            addCriterion("GYGLZDS_UP20_ZD <", value, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_ZD <=", value, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdIn(List<Integer> values) {
            addCriterion("GYGLZDS_UP20_ZD in", values, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdNotIn(List<Integer> values) {
            addCriterion("GYGLZDS_UP20_ZD not in", values, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_UP20_ZD between", value1, value2, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20ZdNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_UP20_ZD not between", value1, value2, "gyglzdsUp20Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdIsNull() {
            addCriterion("GYGLZDS_UP20_TS_ZD is null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdIsNotNull() {
            addCriterion("GYGLZDS_UP20_TS_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_TS_ZD =", value, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdNotEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_TS_ZD <>", value, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdGreaterThan(Integer value) {
            addCriterion("GYGLZDS_UP20_TS_ZD >", value, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_TS_ZD >=", value, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdLessThan(Integer value) {
            addCriterion("GYGLZDS_UP20_TS_ZD <", value, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_UP20_TS_ZD <=", value, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdIn(List<Integer> values) {
            addCriterion("GYGLZDS_UP20_TS_ZD in", values, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdNotIn(List<Integer> values) {
            addCriterion("GYGLZDS_UP20_TS_ZD not in", values, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_UP20_TS_ZD between", value1, value2, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsUp20TsZdNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_UP20_TS_ZD not between", value1, value2, "gyglzdsUp20TsZd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdIsNull() {
            addCriterion("GYGLZDS_10-20_ZD is null");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdIsNotNull() {
            addCriterion("GYGLZDS_10-20_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdEqualTo(Integer value) {
            addCriterion("GYGLZDS_10-20_ZD =", value, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdNotEqualTo(Integer value) {
            addCriterion("GYGLZDS_10-20_ZD <>", value, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdGreaterThan(Integer value) {
            addCriterion("GYGLZDS_10-20_ZD >", value, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_10-20_ZD >=", value, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdLessThan(Integer value) {
            addCriterion("GYGLZDS_10-20_ZD <", value, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_10-20_ZD <=", value, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdIn(List<Integer> values) {
            addCriterion("GYGLZDS_10-20_ZD in", values, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdNotIn(List<Integer> values) {
            addCriterion("GYGLZDS_10-20_ZD not in", values, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_10-20_ZD between", value1, value2, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzds1020ZdNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_10-20_ZD not between", value1, value2, "gyglzds1020Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdIsNull() {
            addCriterion("GYGLZDS_DOWN10_ZD is null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdIsNotNull() {
            addCriterion("GYGLZDS_DOWN10_ZD is not null");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdEqualTo(Integer value) {
            addCriterion("GYGLZDS_DOWN10_ZD =", value, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdNotEqualTo(Integer value) {
            addCriterion("GYGLZDS_DOWN10_ZD <>", value, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdGreaterThan(Integer value) {
            addCriterion("GYGLZDS_DOWN10_ZD >", value, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_DOWN10_ZD >=", value, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdLessThan(Integer value) {
            addCriterion("GYGLZDS_DOWN10_ZD <", value, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdLessThanOrEqualTo(Integer value) {
            addCriterion("GYGLZDS_DOWN10_ZD <=", value, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdIn(List<Integer> values) {
            addCriterion("GYGLZDS_DOWN10_ZD in", values, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdNotIn(List<Integer> values) {
            addCriterion("GYGLZDS_DOWN10_ZD not in", values, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_DOWN10_ZD between", value1, value2, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyglzdsDown10ZdNotBetween(Integer value1, Integer value2) {
            addCriterion("GYGLZDS_DOWN10_ZD not between", value1, value2, "gyglzdsDown10Zd");
            return (Criteria) this;
        }

        public Criteria andGyylsZIsNull() {
            addCriterion("GYYLS_Z is null");
            return (Criteria) this;
        }

        public Criteria andGyylsZIsNotNull() {
            addCriterion("GYYLS_Z is not null");
            return (Criteria) this;
        }

        public Criteria andGyylsZEqualTo(Integer value) {
            addCriterion("GYYLS_Z =", value, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZNotEqualTo(Integer value) {
            addCriterion("GYYLS_Z <>", value, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZGreaterThan(Integer value) {
            addCriterion("GYYLS_Z >", value, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYYLS_Z >=", value, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZLessThan(Integer value) {
            addCriterion("GYYLS_Z <", value, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZLessThanOrEqualTo(Integer value) {
            addCriterion("GYYLS_Z <=", value, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZIn(List<Integer> values) {
            addCriterion("GYYLS_Z in", values, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZNotIn(List<Integer> values) {
            addCriterion("GYYLS_Z not in", values, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZBetween(Integer value1, Integer value2) {
            addCriterion("GYYLS_Z between", value1, value2, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyylsZNotBetween(Integer value1, Integer value2) {
            addCriterion("GYYLS_Z not between", value1, value2, "gyylsZ");
            return (Criteria) this;
        }

        public Criteria andGyyslDIsNull() {
            addCriterion("GYYSL_D is null");
            return (Criteria) this;
        }

        public Criteria andGyyslDIsNotNull() {
            addCriterion("GYYSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andGyyslDEqualTo(Double value) {
            addCriterion("GYYSL_D =", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDNotEqualTo(Double value) {
            addCriterion("GYYSL_D <>", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDGreaterThan(Double value) {
            addCriterion("GYYSL_D >", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDGreaterThanOrEqualTo(Double value) {
            addCriterion("GYYSL_D >=", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDLessThan(Double value) {
            addCriterion("GYYSL_D <", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDLessThanOrEqualTo(Double value) {
            addCriterion("GYYSL_D <=", value, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDIn(List<Double> values) {
            addCriterion("GYYSL_D in", values, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDNotIn(List<Double> values) {
            addCriterion("GYYSL_D not in", values, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDBetween(Double value1, Double value2) {
            addCriterion("GYYSL_D between", value1, value2, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andGyyslDNotBetween(Double value1, Double value2) {
            addCriterion("GYYSL_D not between", value1, value2, "gyyslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDIsNull() {
            addCriterion("QZ_QSL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzQslDIsNotNull() {
            addCriterion("QZ_QSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzQslDEqualTo(Double value) {
            addCriterion("QZ_QSL_D =", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDNotEqualTo(Double value) {
            addCriterion("QZ_QSL_D <>", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDGreaterThan(Double value) {
            addCriterion("QZ_QSL_D >", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_QSL_D >=", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDLessThan(Double value) {
            addCriterion("QZ_QSL_D <", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_QSL_D <=", value, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDIn(List<Double> values) {
            addCriterion("QZ_QSL_D in", values, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDNotIn(List<Double> values) {
            addCriterion("QZ_QSL_D not in", values, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDBetween(Double value1, Double value2) {
            addCriterion("QZ_QSL_D between", value1, value2, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzQslDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_QSL_D not between", value1, value2, "qzQslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDIsNull() {
            addCriterion("QZ_ZFYSL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDIsNotNull() {
            addCriterion("QZ_ZFYSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDEqualTo(Double value) {
            addCriterion("QZ_ZFYSL_D =", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDNotEqualTo(Double value) {
            addCriterion("QZ_ZFYSL_D <>", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDGreaterThan(Double value) {
            addCriterion("QZ_ZFYSL_D >", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_ZFYSL_D >=", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDLessThan(Double value) {
            addCriterion("QZ_ZFYSL_D <", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_ZFYSL_D <=", value, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDIn(List<Double> values) {
            addCriterion("QZ_ZFYSL_D in", values, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDNotIn(List<Double> values) {
            addCriterion("QZ_ZFYSL_D not in", values, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDBetween(Double value1, Double value2) {
            addCriterion("QZ_ZFYSL_D between", value1, value2, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andQzZfyslDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_ZFYSL_D not between", value1, value2, "qzZfyslD");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1IsNull() {
            addCriterion("ZYYFCLYL1 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1IsNotNull() {
            addCriterion("ZYYFCLYL1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1EqualTo(Double value) {
            addCriterion("ZYYFCLYL1 =", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1NotEqualTo(Double value) {
            addCriterion("ZYYFCLYL1 <>", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1GreaterThan(Double value) {
            addCriterion("ZYYFCLYL1 >", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL1 >=", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1LessThan(Double value) {
            addCriterion("ZYYFCLYL1 <", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1LessThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL1 <=", value, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1In(List<Double> values) {
            addCriterion("ZYYFCLYL1 in", values, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1NotIn(List<Double> values) {
            addCriterion("ZYYFCLYL1 not in", values, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1Between(Double value1, Double value2) {
            addCriterion("ZYYFCLYL1 between", value1, value2, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl1NotBetween(Double value1, Double value2) {
            addCriterion("ZYYFCLYL1 not between", value1, value2, "zyyfclyl1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1IsNull() {
            addCriterion("ZYYFCLYL_JLDW1 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1IsNotNull() {
            addCriterion("ZYYFCLYL_JLDW1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1EqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 =", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 <>", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1GreaterThan(String value) {
            addCriterion("ZYYFCLYL_JLDW1 >", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 >=", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1LessThan(String value) {
            addCriterion("ZYYFCLYL_JLDW1 <", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW1 <=", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1Like(String value) {
            addCriterion("ZYYFCLYL_JLDW1 like", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotLike(String value) {
            addCriterion("ZYYFCLYL_JLDW1 not like", value, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1In(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW1 in", values, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW1 not in", values, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW1 between", value1, value2, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw1NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW1 not between", value1, value2, "zyyfclylJldw1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1IsNull() {
            addCriterion("ZYYFCLYL_BNSJ1 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1IsNotNull() {
            addCriterion("ZYYFCLYL_BNSJ1 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1EqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ1 =", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1NotEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ1 <>", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1GreaterThan(Double value) {
            addCriterion("ZYYFCLYL_BNSJ1 >", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ1 >=", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1LessThan(Double value) {
            addCriterion("ZYYFCLYL_BNSJ1 <", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1LessThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ1 <=", value, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1In(List<Double> values) {
            addCriterion("ZYYFCLYL_BNSJ1 in", values, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1NotIn(List<Double> values) {
            addCriterion("ZYYFCLYL_BNSJ1 not in", values, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1Between(Double value1, Double value2) {
            addCriterion("ZYYFCLYL_BNSJ1 between", value1, value2, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj1NotBetween(Double value1, Double value2) {
            addCriterion("ZYYFCLYL_BNSJ1 not between", value1, value2, "zyyfclylBnsj1");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2IsNull() {
            addCriterion("ZYYFCLYL2 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2IsNotNull() {
            addCriterion("ZYYFCLYL2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2EqualTo(Double value) {
            addCriterion("ZYYFCLYL2 =", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2NotEqualTo(Double value) {
            addCriterion("ZYYFCLYL2 <>", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2GreaterThan(Double value) {
            addCriterion("ZYYFCLYL2 >", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL2 >=", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2LessThan(Double value) {
            addCriterion("ZYYFCLYL2 <", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2LessThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL2 <=", value, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2In(List<Double> values) {
            addCriterion("ZYYFCLYL2 in", values, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2NotIn(List<Double> values) {
            addCriterion("ZYYFCLYL2 not in", values, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2Between(Double value1, Double value2) {
            addCriterion("ZYYFCLYL2 between", value1, value2, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl2NotBetween(Double value1, Double value2) {
            addCriterion("ZYYFCLYL2 not between", value1, value2, "zyyfclyl2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2IsNull() {
            addCriterion("ZYYFCLYL_JLDW2 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2IsNotNull() {
            addCriterion("ZYYFCLYL_JLDW2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2EqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 =", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 <>", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2GreaterThan(String value) {
            addCriterion("ZYYFCLYL_JLDW2 >", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 >=", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2LessThan(String value) {
            addCriterion("ZYYFCLYL_JLDW2 <", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW2 <=", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2Like(String value) {
            addCriterion("ZYYFCLYL_JLDW2 like", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotLike(String value) {
            addCriterion("ZYYFCLYL_JLDW2 not like", value, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2In(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW2 in", values, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW2 not in", values, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW2 between", value1, value2, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw2NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW2 not between", value1, value2, "zyyfclylJldw2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2IsNull() {
            addCriterion("ZYYFCLYL_BNSJ2 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2IsNotNull() {
            addCriterion("ZYYFCLYL_BNSJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2EqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ2 =", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2NotEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ2 <>", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2GreaterThan(Double value) {
            addCriterion("ZYYFCLYL_BNSJ2 >", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ2 >=", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2LessThan(Double value) {
            addCriterion("ZYYFCLYL_BNSJ2 <", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2LessThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ2 <=", value, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2In(List<Double> values) {
            addCriterion("ZYYFCLYL_BNSJ2 in", values, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2NotIn(List<Double> values) {
            addCriterion("ZYYFCLYL_BNSJ2 not in", values, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2Between(Double value1, Double value2) {
            addCriterion("ZYYFCLYL_BNSJ2 between", value1, value2, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj2NotBetween(Double value1, Double value2) {
            addCriterion("ZYYFCLYL_BNSJ2 not between", value1, value2, "zyyfclylBnsj2");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3IsNull() {
            addCriterion("ZYYFCLYL3 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3IsNotNull() {
            addCriterion("ZYYFCLYL3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3EqualTo(Double value) {
            addCriterion("ZYYFCLYL3 =", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3NotEqualTo(Double value) {
            addCriterion("ZYYFCLYL3 <>", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3GreaterThan(Double value) {
            addCriterion("ZYYFCLYL3 >", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL3 >=", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3LessThan(Double value) {
            addCriterion("ZYYFCLYL3 <", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3LessThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL3 <=", value, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3In(List<Double> values) {
            addCriterion("ZYYFCLYL3 in", values, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3NotIn(List<Double> values) {
            addCriterion("ZYYFCLYL3 not in", values, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3Between(Double value1, Double value2) {
            addCriterion("ZYYFCLYL3 between", value1, value2, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclyl3NotBetween(Double value1, Double value2) {
            addCriterion("ZYYFCLYL3 not between", value1, value2, "zyyfclyl3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3IsNull() {
            addCriterion("ZYYFCLYL_JLDW3 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3IsNotNull() {
            addCriterion("ZYYFCLYL_JLDW3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3EqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 =", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 <>", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3GreaterThan(String value) {
            addCriterion("ZYYFCLYL_JLDW3 >", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 >=", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3LessThan(String value) {
            addCriterion("ZYYFCLYL_JLDW3 <", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3LessThanOrEqualTo(String value) {
            addCriterion("ZYYFCLYL_JLDW3 <=", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3Like(String value) {
            addCriterion("ZYYFCLYL_JLDW3 like", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotLike(String value) {
            addCriterion("ZYYFCLYL_JLDW3 not like", value, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3In(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW3 in", values, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotIn(List<String> values) {
            addCriterion("ZYYFCLYL_JLDW3 not in", values, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3Between(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW3 between", value1, value2, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylJldw3NotBetween(String value1, String value2) {
            addCriterion("ZYYFCLYL_JLDW3 not between", value1, value2, "zyyfclylJldw3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3IsNull() {
            addCriterion("ZYYFCLYL_BNSJ3 is null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3IsNotNull() {
            addCriterion("ZYYFCLYL_BNSJ3 is not null");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3EqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ3 =", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3NotEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ3 <>", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3GreaterThan(Double value) {
            addCriterion("ZYYFCLYL_BNSJ3 >", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ3 >=", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3LessThan(Double value) {
            addCriterion("ZYYFCLYL_BNSJ3 <", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3LessThanOrEqualTo(Double value) {
            addCriterion("ZYYFCLYL_BNSJ3 <=", value, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3In(List<Double> values) {
            addCriterion("ZYYFCLYL_BNSJ3 in", values, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3NotIn(List<Double> values) {
            addCriterion("ZYYFCLYL_BNSJ3 not in", values, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3Between(Double value1, Double value2) {
            addCriterion("ZYYFCLYL_BNSJ3 between", value1, value2, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZyyfclylBnsj3NotBetween(Double value1, Double value2) {
            addCriterion("ZYYFCLYL_BNSJ3 not between", value1, value2, "zyyfclylBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1IsNull() {
            addCriterion("ZYCPSCQK1 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1IsNotNull() {
            addCriterion("ZYCPSCQK1 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1EqualTo(Double value) {
            addCriterion("ZYCPSCQK1 =", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1NotEqualTo(Double value) {
            addCriterion("ZYCPSCQK1 <>", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1GreaterThan(Double value) {
            addCriterion("ZYCPSCQK1 >", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK1 >=", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1LessThan(Double value) {
            addCriterion("ZYCPSCQK1 <", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1LessThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK1 <=", value, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1In(List<Double> values) {
            addCriterion("ZYCPSCQK1 in", values, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1NotIn(List<Double> values) {
            addCriterion("ZYCPSCQK1 not in", values, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1Between(Double value1, Double value2) {
            addCriterion("ZYCPSCQK1 between", value1, value2, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk1NotBetween(Double value1, Double value2) {
            addCriterion("ZYCPSCQK1 not between", value1, value2, "zycpscqk1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1IsNull() {
            addCriterion("ZYCPSCQK_JLDW1 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1IsNotNull() {
            addCriterion("ZYCPSCQK_JLDW1 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1EqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 =", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 <>", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1GreaterThan(String value) {
            addCriterion("ZYCPSCQK_JLDW1 >", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 >=", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1LessThan(String value) {
            addCriterion("ZYCPSCQK_JLDW1 <", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW1 <=", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1Like(String value) {
            addCriterion("ZYCPSCQK_JLDW1 like", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotLike(String value) {
            addCriterion("ZYCPSCQK_JLDW1 not like", value, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1In(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW1 in", values, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW1 not in", values, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW1 between", value1, value2, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw1NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW1 not between", value1, value2, "zycpscqkJldw1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1IsNull() {
            addCriterion("ZYCPSCQK_BNSJ1 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1IsNotNull() {
            addCriterion("ZYCPSCQK_BNSJ1 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1EqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ1 =", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1NotEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ1 <>", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1GreaterThan(Double value) {
            addCriterion("ZYCPSCQK_BNSJ1 >", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ1 >=", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1LessThan(Double value) {
            addCriterion("ZYCPSCQK_BNSJ1 <", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1LessThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ1 <=", value, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1In(List<Double> values) {
            addCriterion("ZYCPSCQK_BNSJ1 in", values, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1NotIn(List<Double> values) {
            addCriterion("ZYCPSCQK_BNSJ1 not in", values, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1Between(Double value1, Double value2) {
            addCriterion("ZYCPSCQK_BNSJ1 between", value1, value2, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj1NotBetween(Double value1, Double value2) {
            addCriterion("ZYCPSCQK_BNSJ1 not between", value1, value2, "zycpscqkBnsj1");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2IsNull() {
            addCriterion("ZYCPSCQK2 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2IsNotNull() {
            addCriterion("ZYCPSCQK2 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2EqualTo(Double value) {
            addCriterion("ZYCPSCQK2 =", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2NotEqualTo(Double value) {
            addCriterion("ZYCPSCQK2 <>", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2GreaterThan(Double value) {
            addCriterion("ZYCPSCQK2 >", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK2 >=", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2LessThan(Double value) {
            addCriterion("ZYCPSCQK2 <", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2LessThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK2 <=", value, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2In(List<Double> values) {
            addCriterion("ZYCPSCQK2 in", values, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2NotIn(List<Double> values) {
            addCriterion("ZYCPSCQK2 not in", values, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2Between(Double value1, Double value2) {
            addCriterion("ZYCPSCQK2 between", value1, value2, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk2NotBetween(Double value1, Double value2) {
            addCriterion("ZYCPSCQK2 not between", value1, value2, "zycpscqk2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2IsNull() {
            addCriterion("ZYCPSCQK_JLDW2 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2IsNotNull() {
            addCriterion("ZYCPSCQK_JLDW2 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2EqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 =", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 <>", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2GreaterThan(String value) {
            addCriterion("ZYCPSCQK_JLDW2 >", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 >=", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2LessThan(String value) {
            addCriterion("ZYCPSCQK_JLDW2 <", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW2 <=", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2Like(String value) {
            addCriterion("ZYCPSCQK_JLDW2 like", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotLike(String value) {
            addCriterion("ZYCPSCQK_JLDW2 not like", value, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2In(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW2 in", values, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW2 not in", values, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW2 between", value1, value2, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw2NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW2 not between", value1, value2, "zycpscqkJldw2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2IsNull() {
            addCriterion("ZYCPSCQK_BNSJ2 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2IsNotNull() {
            addCriterion("ZYCPSCQK_BNSJ2 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2EqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ2 =", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2NotEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ2 <>", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2GreaterThan(Double value) {
            addCriterion("ZYCPSCQK_BNSJ2 >", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ2 >=", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2LessThan(Double value) {
            addCriterion("ZYCPSCQK_BNSJ2 <", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2LessThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ2 <=", value, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2In(List<Double> values) {
            addCriterion("ZYCPSCQK_BNSJ2 in", values, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2NotIn(List<Double> values) {
            addCriterion("ZYCPSCQK_BNSJ2 not in", values, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2Between(Double value1, Double value2) {
            addCriterion("ZYCPSCQK_BNSJ2 between", value1, value2, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj2NotBetween(Double value1, Double value2) {
            addCriterion("ZYCPSCQK_BNSJ2 not between", value1, value2, "zycpscqkBnsj2");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3IsNull() {
            addCriterion("ZYCPSCQK3 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3IsNotNull() {
            addCriterion("ZYCPSCQK3 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3EqualTo(Double value) {
            addCriterion("ZYCPSCQK3 =", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3NotEqualTo(Double value) {
            addCriterion("ZYCPSCQK3 <>", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3GreaterThan(Double value) {
            addCriterion("ZYCPSCQK3 >", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK3 >=", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3LessThan(Double value) {
            addCriterion("ZYCPSCQK3 <", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3LessThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK3 <=", value, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3In(List<Double> values) {
            addCriterion("ZYCPSCQK3 in", values, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3NotIn(List<Double> values) {
            addCriterion("ZYCPSCQK3 not in", values, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3Between(Double value1, Double value2) {
            addCriterion("ZYCPSCQK3 between", value1, value2, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqk3NotBetween(Double value1, Double value2) {
            addCriterion("ZYCPSCQK3 not between", value1, value2, "zycpscqk3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3IsNull() {
            addCriterion("ZYCPSCQK_JLDW3 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3IsNotNull() {
            addCriterion("ZYCPSCQK_JLDW3 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3EqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 =", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 <>", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3GreaterThan(String value) {
            addCriterion("ZYCPSCQK_JLDW3 >", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3GreaterThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 >=", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3LessThan(String value) {
            addCriterion("ZYCPSCQK_JLDW3 <", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3LessThanOrEqualTo(String value) {
            addCriterion("ZYCPSCQK_JLDW3 <=", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3Like(String value) {
            addCriterion("ZYCPSCQK_JLDW3 like", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotLike(String value) {
            addCriterion("ZYCPSCQK_JLDW3 not like", value, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3In(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW3 in", values, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotIn(List<String> values) {
            addCriterion("ZYCPSCQK_JLDW3 not in", values, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3Between(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW3 between", value1, value2, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkJldw3NotBetween(String value1, String value2) {
            addCriterion("ZYCPSCQK_JLDW3 not between", value1, value2, "zycpscqkJldw3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3IsNull() {
            addCriterion("ZYCPSCQK_BNSJ3 is null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3IsNotNull() {
            addCriterion("ZYCPSCQK_BNSJ3 is not null");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3EqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ3 =", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3NotEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ3 <>", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3GreaterThan(Double value) {
            addCriterion("ZYCPSCQK_BNSJ3 >", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3GreaterThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ3 >=", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3LessThan(Double value) {
            addCriterion("ZYCPSCQK_BNSJ3 <", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3LessThanOrEqualTo(Double value) {
            addCriterion("ZYCPSCQK_BNSJ3 <=", value, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3In(List<Double> values) {
            addCriterion("ZYCPSCQK_BNSJ3 in", values, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3NotIn(List<Double> values) {
            addCriterion("ZYCPSCQK_BNSJ3 not in", values, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3Between(Double value1, Double value2) {
            addCriterion("ZYCPSCQK_BNSJ3 between", value1, value2, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andZycpscqkBnsj3NotBetween(Double value1, Double value2) {
            addCriterion("ZYCPSCQK_BNSJ3 not between", value1, value2, "zycpscqkBnsj3");
            return (Criteria) this;
        }

        public Criteria andGyfscllDIsNull() {
            addCriterion("GYFSCLL_D is null");
            return (Criteria) this;
        }

        public Criteria andGyfscllDIsNotNull() {
            addCriterion("GYFSCLL_D is not null");
            return (Criteria) this;
        }

        public Criteria andGyfscllDEqualTo(Double value) {
            addCriterion("GYFSCLL_D =", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDNotEqualTo(Double value) {
            addCriterion("GYFSCLL_D <>", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDGreaterThan(Double value) {
            addCriterion("GYFSCLL_D >", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDGreaterThanOrEqualTo(Double value) {
            addCriterion("GYFSCLL_D >=", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDLessThan(Double value) {
            addCriterion("GYFSCLL_D <", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDLessThanOrEqualTo(Double value) {
            addCriterion("GYFSCLL_D <=", value, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDIn(List<Double> values) {
            addCriterion("GYFSCLL_D in", values, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDNotIn(List<Double> values) {
            addCriterion("GYFSCLL_D not in", values, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDBetween(Double value1, Double value2) {
            addCriterion("GYFSCLL_D between", value1, value2, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfscllDNotBetween(Double value1, Double value2) {
            addCriterion("GYFSCLL_D not between", value1, value2, "gyfscllD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDIsNull() {
            addCriterion("GYFSPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andGyfspflDIsNotNull() {
            addCriterion("GYFSPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andGyfspflDEqualTo(Double value) {
            addCriterion("GYFSPFL_D =", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDNotEqualTo(Double value) {
            addCriterion("GYFSPFL_D <>", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDGreaterThan(Double value) {
            addCriterion("GYFSPFL_D >", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDGreaterThanOrEqualTo(Double value) {
            addCriterion("GYFSPFL_D >=", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDLessThan(Double value) {
            addCriterion("GYFSPFL_D <", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDLessThanOrEqualTo(Double value) {
            addCriterion("GYFSPFL_D <=", value, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDIn(List<Double> values) {
            addCriterion("GYFSPFL_D in", values, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDNotIn(List<Double> values) {
            addCriterion("GYFSPFL_D not in", values, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDBetween(Double value1, Double value2) {
            addCriterion("GYFSPFL_D between", value1, value2, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andGyfspflDNotBetween(Double value1, Double value2) {
            addCriterion("GYFSPFL_D not between", value1, value2, "gyfspflD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDIsNull() {
            addCriterion("QZ_ZJPRHJD_D is null");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDIsNotNull() {
            addCriterion("QZ_ZJPRHJD_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDEqualTo(Double value) {
            addCriterion("QZ_ZJPRHJD_D =", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDNotEqualTo(Double value) {
            addCriterion("QZ_ZJPRHJD_D <>", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDGreaterThan(Double value) {
            addCriterion("QZ_ZJPRHJD_D >", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_ZJPRHJD_D >=", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDLessThan(Double value) {
            addCriterion("QZ_ZJPRHJD_D <", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_ZJPRHJD_D <=", value, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDIn(List<Double> values) {
            addCriterion("QZ_ZJPRHJD_D in", values, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDNotIn(List<Double> values) {
            addCriterion("QZ_ZJPRHJD_D not in", values, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDBetween(Double value1, Double value2) {
            addCriterion("QZ_ZJPRHJD_D between", value1, value2, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzZjprhjdDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_ZJPRHJD_D not between", value1, value2, "qzZjprhjdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDIsNull() {
            addCriterion("QZ_PRWSCLCD_D is null");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDIsNotNull() {
            addCriterion("QZ_PRWSCLCD_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDEqualTo(Double value) {
            addCriterion("QZ_PRWSCLCD_D =", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDNotEqualTo(Double value) {
            addCriterion("QZ_PRWSCLCD_D <>", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDGreaterThan(Double value) {
            addCriterion("QZ_PRWSCLCD_D >", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_PRWSCLCD_D >=", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDLessThan(Double value) {
            addCriterion("QZ_PRWSCLCD_D <", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_PRWSCLCD_D <=", value, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDIn(List<Double> values) {
            addCriterion("QZ_PRWSCLCD_D in", values, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDNotIn(List<Double> values) {
            addCriterion("QZ_PRWSCLCD_D not in", values, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDBetween(Double value1, Double value2) {
            addCriterion("QZ_PRWSCLCD_D between", value1, value2, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andQzPrwsclcdDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_PRWSCLCD_D not between", value1, value2, "qzPrwsclcdD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDIsNull() {
            addCriterion("HXXYLCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDIsNotNull() {
            addCriterion("HXXYLCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDEqualTo(Double value) {
            addCriterion("HXXYLCSL_D =", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDNotEqualTo(Double value) {
            addCriterion("HXXYLCSL_D <>", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDGreaterThan(Double value) {
            addCriterion("HXXYLCSL_D >", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("HXXYLCSL_D >=", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDLessThan(Double value) {
            addCriterion("HXXYLCSL_D <", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDLessThanOrEqualTo(Double value) {
            addCriterion("HXXYLCSL_D <=", value, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDIn(List<Double> values) {
            addCriterion("HXXYLCSL_D in", values, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDNotIn(List<Double> values) {
            addCriterion("HXXYLCSL_D not in", values, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDBetween(Double value1, Double value2) {
            addCriterion("HXXYLCSL_D between", value1, value2, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylcslDNotBetween(Double value1, Double value2) {
            addCriterion("HXXYLCSL_D not between", value1, value2, "hxxylcslD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDIsNull() {
            addCriterion("HXXYLPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDIsNotNull() {
            addCriterion("HXXYLPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDEqualTo(Double value) {
            addCriterion("HXXYLPFL_D =", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDNotEqualTo(Double value) {
            addCriterion("HXXYLPFL_D <>", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDGreaterThan(Double value) {
            addCriterion("HXXYLPFL_D >", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDGreaterThanOrEqualTo(Double value) {
            addCriterion("HXXYLPFL_D >=", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDLessThan(Double value) {
            addCriterion("HXXYLPFL_D <", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDLessThanOrEqualTo(Double value) {
            addCriterion("HXXYLPFL_D <=", value, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDIn(List<Double> values) {
            addCriterion("HXXYLPFL_D in", values, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDNotIn(List<Double> values) {
            addCriterion("HXXYLPFL_D not in", values, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDBetween(Double value1, Double value2) {
            addCriterion("HXXYLPFL_D between", value1, value2, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andHxxylpflDNotBetween(Double value1, Double value2) {
            addCriterion("HXXYLPFL_D not between", value1, value2, "hxxylpflD");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSIsNull() {
            addCriterion("PRWSCLCDHXXYLND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSIsNotNull() {
            addCriterion("PRWSCLCDHXXYLND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSEqualTo(Double value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S =", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSNotEqualTo(Double value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S <>", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSGreaterThan(Double value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S >", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S >=", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSLessThan(Double value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S <", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSLessThanOrEqualTo(Double value) {
            addCriterion("PRWSCLCDHXXYLND_HK_S <=", value, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSIn(List<Double> values) {
            addCriterion("PRWSCLCDHXXYLND_HK_S in", values, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSNotIn(List<Double> values) {
            addCriterion("PRWSCLCDHXXYLND_HK_S not in", values, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSBetween(Double value1, Double value2) {
            addCriterion("PRWSCLCDHXXYLND_HK_S between", value1, value2, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdhxxylndHkSNotBetween(Double value1, Double value2) {
            addCriterion("PRWSCLCDHXXYLND_HK_S not between", value1, value2, "prwsclcdhxxylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSIsNull() {
            addCriterion("PRWSCLCDADND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSIsNotNull() {
            addCriterion("PRWSCLCDADND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSEqualTo(Double value) {
            addCriterion("PRWSCLCDADND_HK_S =", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSNotEqualTo(Double value) {
            addCriterion("PRWSCLCDADND_HK_S <>", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSGreaterThan(Double value) {
            addCriterion("PRWSCLCDADND_HK_S >", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("PRWSCLCDADND_HK_S >=", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSLessThan(Double value) {
            addCriterion("PRWSCLCDADND_HK_S <", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSLessThanOrEqualTo(Double value) {
            addCriterion("PRWSCLCDADND_HK_S <=", value, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSIn(List<Double> values) {
            addCriterion("PRWSCLCDADND_HK_S in", values, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSNotIn(List<Double> values) {
            addCriterion("PRWSCLCDADND_HK_S not in", values, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSBetween(Double value1, Double value2) {
            addCriterion("PRWSCLCDADND_HK_S between", value1, value2, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdadndHkSNotBetween(Double value1, Double value2) {
            addCriterion("PRWSCLCDADND_HK_S not between", value1, value2, "prwsclcdadndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSIsNull() {
            addCriterion("PRWSCLCDSYLND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSIsNotNull() {
            addCriterion("PRWSCLCDSYLND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSEqualTo(Double value) {
            addCriterion("PRWSCLCDSYLND_HK_S =", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSNotEqualTo(Double value) {
            addCriterion("PRWSCLCDSYLND_HK_S <>", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSGreaterThan(Double value) {
            addCriterion("PRWSCLCDSYLND_HK_S >", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("PRWSCLCDSYLND_HK_S >=", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSLessThan(Double value) {
            addCriterion("PRWSCLCDSYLND_HK_S <", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSLessThanOrEqualTo(Double value) {
            addCriterion("PRWSCLCDSYLND_HK_S <=", value, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSIn(List<Double> values) {
            addCriterion("PRWSCLCDSYLND_HK_S in", values, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSNotIn(List<Double> values) {
            addCriterion("PRWSCLCDSYLND_HK_S not in", values, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSBetween(Double value1, Double value2) {
            addCriterion("PRWSCLCDSYLND_HK_S between", value1, value2, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andPrwsclcdsylndHkSNotBetween(Double value1, Double value2) {
            addCriterion("PRWSCLCDSYLND_HK_S not between", value1, value2, "prwsclcdsylndHkS");
            return (Criteria) this;
        }

        public Criteria andAdcslDIsNull() {
            addCriterion("ADCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andAdcslDIsNotNull() {
            addCriterion("ADCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andAdcslDEqualTo(Double value) {
            addCriterion("ADCSL_D =", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDNotEqualTo(Double value) {
            addCriterion("ADCSL_D <>", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDGreaterThan(Double value) {
            addCriterion("ADCSL_D >", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("ADCSL_D >=", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDLessThan(Double value) {
            addCriterion("ADCSL_D <", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDLessThanOrEqualTo(Double value) {
            addCriterion("ADCSL_D <=", value, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDIn(List<Double> values) {
            addCriterion("ADCSL_D in", values, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDNotIn(List<Double> values) {
            addCriterion("ADCSL_D not in", values, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDBetween(Double value1, Double value2) {
            addCriterion("ADCSL_D between", value1, value2, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdcslDNotBetween(Double value1, Double value2) {
            addCriterion("ADCSL_D not between", value1, value2, "adcslD");
            return (Criteria) this;
        }

        public Criteria andAdpflDIsNull() {
            addCriterion("ADPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andAdpflDIsNotNull() {
            addCriterion("ADPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andAdpflDEqualTo(Double value) {
            addCriterion("ADPFL_D =", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDNotEqualTo(Double value) {
            addCriterion("ADPFL_D <>", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDGreaterThan(Double value) {
            addCriterion("ADPFL_D >", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDGreaterThanOrEqualTo(Double value) {
            addCriterion("ADPFL_D >=", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDLessThan(Double value) {
            addCriterion("ADPFL_D <", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDLessThanOrEqualTo(Double value) {
            addCriterion("ADPFL_D <=", value, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDIn(List<Double> values) {
            addCriterion("ADPFL_D in", values, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDNotIn(List<Double> values) {
            addCriterion("ADPFL_D not in", values, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDBetween(Double value1, Double value2) {
            addCriterion("ADPFL_D between", value1, value2, "adpflD");
            return (Criteria) this;
        }

        public Criteria andAdpflDNotBetween(Double value1, Double value2) {
            addCriterion("ADPFL_D not between", value1, value2, "adpflD");
            return (Criteria) this;
        }

        public Criteria andZdcslDIsNull() {
            addCriterion("ZDCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andZdcslDIsNotNull() {
            addCriterion("ZDCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andZdcslDEqualTo(Double value) {
            addCriterion("ZDCSL_D =", value, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDNotEqualTo(Double value) {
            addCriterion("ZDCSL_D <>", value, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDGreaterThan(Double value) {
            addCriterion("ZDCSL_D >", value, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("ZDCSL_D >=", value, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDLessThan(Double value) {
            addCriterion("ZDCSL_D <", value, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDLessThanOrEqualTo(Double value) {
            addCriterion("ZDCSL_D <=", value, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDIn(List<Double> values) {
            addCriterion("ZDCSL_D in", values, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDNotIn(List<Double> values) {
            addCriterion("ZDCSL_D not in", values, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDBetween(Double value1, Double value2) {
            addCriterion("ZDCSL_D between", value1, value2, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdcslDNotBetween(Double value1, Double value2) {
            addCriterion("ZDCSL_D not between", value1, value2, "zdcslD");
            return (Criteria) this;
        }

        public Criteria andZdpflDIsNull() {
            addCriterion("ZDPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andZdpflDIsNotNull() {
            addCriterion("ZDPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andZdpflDEqualTo(Double value) {
            addCriterion("ZDPFL_D =", value, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDNotEqualTo(Double value) {
            addCriterion("ZDPFL_D <>", value, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDGreaterThan(Double value) {
            addCriterion("ZDPFL_D >", value, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDGreaterThanOrEqualTo(Double value) {
            addCriterion("ZDPFL_D >=", value, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDLessThan(Double value) {
            addCriterion("ZDPFL_D <", value, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDLessThanOrEqualTo(Double value) {
            addCriterion("ZDPFL_D <=", value, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDIn(List<Double> values) {
            addCriterion("ZDPFL_D in", values, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDNotIn(List<Double> values) {
            addCriterion("ZDPFL_D not in", values, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDBetween(Double value1, Double value2) {
            addCriterion("ZDPFL_D between", value1, value2, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZdpflDNotBetween(Double value1, Double value2) {
            addCriterion("ZDPFL_D not between", value1, value2, "zdpflD");
            return (Criteria) this;
        }

        public Criteria andZpcslDIsNull() {
            addCriterion("ZPCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andZpcslDIsNotNull() {
            addCriterion("ZPCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andZpcslDEqualTo(Double value) {
            addCriterion("ZPCSL_D =", value, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDNotEqualTo(Double value) {
            addCriterion("ZPCSL_D <>", value, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDGreaterThan(Double value) {
            addCriterion("ZPCSL_D >", value, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("ZPCSL_D >=", value, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDLessThan(Double value) {
            addCriterion("ZPCSL_D <", value, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDLessThanOrEqualTo(Double value) {
            addCriterion("ZPCSL_D <=", value, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDIn(List<Double> values) {
            addCriterion("ZPCSL_D in", values, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDNotIn(List<Double> values) {
            addCriterion("ZPCSL_D not in", values, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDBetween(Double value1, Double value2) {
            addCriterion("ZPCSL_D between", value1, value2, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZpcslDNotBetween(Double value1, Double value2) {
            addCriterion("ZPCSL_D not between", value1, value2, "zpcslD");
            return (Criteria) this;
        }

        public Criteria andZppflDIsNull() {
            addCriterion("ZPPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andZppflDIsNotNull() {
            addCriterion("ZPPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andZppflDEqualTo(Double value) {
            addCriterion("ZPPFL_D =", value, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDNotEqualTo(Double value) {
            addCriterion("ZPPFL_D <>", value, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDGreaterThan(Double value) {
            addCriterion("ZPPFL_D >", value, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDGreaterThanOrEqualTo(Double value) {
            addCriterion("ZPPFL_D >=", value, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDLessThan(Double value) {
            addCriterion("ZPPFL_D <", value, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDLessThanOrEqualTo(Double value) {
            addCriterion("ZPPFL_D <=", value, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDIn(List<Double> values) {
            addCriterion("ZPPFL_D in", values, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDNotIn(List<Double> values) {
            addCriterion("ZPPFL_D not in", values, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDBetween(Double value1, Double value2) {
            addCriterion("ZPPFL_D between", value1, value2, "zppflD");
            return (Criteria) this;
        }

        public Criteria andZppflDNotBetween(Double value1, Double value2) {
            addCriterion("ZPPFL_D not between", value1, value2, "zppflD");
            return (Criteria) this;
        }

        public Criteria andSylcslDIsNull() {
            addCriterion("SYLCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andSylcslDIsNotNull() {
            addCriterion("SYLCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andSylcslDEqualTo(Double value) {
            addCriterion("SYLCSL_D =", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDNotEqualTo(Double value) {
            addCriterion("SYLCSL_D <>", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDGreaterThan(Double value) {
            addCriterion("SYLCSL_D >", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("SYLCSL_D >=", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDLessThan(Double value) {
            addCriterion("SYLCSL_D <", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDLessThanOrEqualTo(Double value) {
            addCriterion("SYLCSL_D <=", value, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDIn(List<Double> values) {
            addCriterion("SYLCSL_D in", values, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDNotIn(List<Double> values) {
            addCriterion("SYLCSL_D not in", values, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDBetween(Double value1, Double value2) {
            addCriterion("SYLCSL_D between", value1, value2, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylcslDNotBetween(Double value1, Double value2) {
            addCriterion("SYLCSL_D not between", value1, value2, "sylcslD");
            return (Criteria) this;
        }

        public Criteria andSylpflDIsNull() {
            addCriterion("SYLPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andSylpflDIsNotNull() {
            addCriterion("SYLPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andSylpflDEqualTo(Double value) {
            addCriterion("SYLPFL_D =", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDNotEqualTo(Double value) {
            addCriterion("SYLPFL_D <>", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDGreaterThan(Double value) {
            addCriterion("SYLPFL_D >", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDGreaterThanOrEqualTo(Double value) {
            addCriterion("SYLPFL_D >=", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDLessThan(Double value) {
            addCriterion("SYLPFL_D <", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDLessThanOrEqualTo(Double value) {
            addCriterion("SYLPFL_D <=", value, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDIn(List<Double> values) {
            addCriterion("SYLPFL_D in", values, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDNotIn(List<Double> values) {
            addCriterion("SYLPFL_D not in", values, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDBetween(Double value1, Double value2) {
            addCriterion("SYLPFL_D between", value1, value2, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andSylpflDNotBetween(Double value1, Double value2) {
            addCriterion("SYLPFL_D not between", value1, value2, "sylpflD");
            return (Criteria) this;
        }

        public Criteria andHffcslQkIsNull() {
            addCriterion("HFFCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andHffcslQkIsNotNull() {
            addCriterion("HFFCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andHffcslQkEqualTo(Double value) {
            addCriterion("HFFCSL_QK =", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkNotEqualTo(Double value) {
            addCriterion("HFFCSL_QK <>", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkGreaterThan(Double value) {
            addCriterion("HFFCSL_QK >", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("HFFCSL_QK >=", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkLessThan(Double value) {
            addCriterion("HFFCSL_QK <", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkLessThanOrEqualTo(Double value) {
            addCriterion("HFFCSL_QK <=", value, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkIn(List<Double> values) {
            addCriterion("HFFCSL_QK in", values, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkNotIn(List<Double> values) {
            addCriterion("HFFCSL_QK not in", values, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkBetween(Double value1, Double value2) {
            addCriterion("HFFCSL_QK between", value1, value2, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffcslQkNotBetween(Double value1, Double value2) {
            addCriterion("HFFCSL_QK not between", value1, value2, "hffcslQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkIsNull() {
            addCriterion("HFFPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andHffpflQkIsNotNull() {
            addCriterion("HFFPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andHffpflQkEqualTo(Double value) {
            addCriterion("HFFPFL_QK =", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkNotEqualTo(Double value) {
            addCriterion("HFFPFL_QK <>", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkGreaterThan(Double value) {
            addCriterion("HFFPFL_QK >", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("HFFPFL_QK >=", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkLessThan(Double value) {
            addCriterion("HFFPFL_QK <", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkLessThanOrEqualTo(Double value) {
            addCriterion("HFFPFL_QK <=", value, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkIn(List<Double> values) {
            addCriterion("HFFPFL_QK in", values, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkNotIn(List<Double> values) {
            addCriterion("HFFPFL_QK not in", values, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkBetween(Double value1, Double value2) {
            addCriterion("HFFPFL_QK between", value1, value2, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andHffpflQkNotBetween(Double value1, Double value2) {
            addCriterion("HFFPFL_QK not between", value1, value2, "hffpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkIsNull() {
            addCriterion("QHWCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkIsNotNull() {
            addCriterion("QHWCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkEqualTo(Double value) {
            addCriterion("QHWCSL_QK =", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkNotEqualTo(Double value) {
            addCriterion("QHWCSL_QK <>", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkGreaterThan(Double value) {
            addCriterion("QHWCSL_QK >", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("QHWCSL_QK >=", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkLessThan(Double value) {
            addCriterion("QHWCSL_QK <", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkLessThanOrEqualTo(Double value) {
            addCriterion("QHWCSL_QK <=", value, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkIn(List<Double> values) {
            addCriterion("QHWCSL_QK in", values, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkNotIn(List<Double> values) {
            addCriterion("QHWCSL_QK not in", values, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkBetween(Double value1, Double value2) {
            addCriterion("QHWCSL_QK between", value1, value2, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwcslQkNotBetween(Double value1, Double value2) {
            addCriterion("QHWCSL_QK not between", value1, value2, "qhwcslQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkIsNull() {
            addCriterion("QHWPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkIsNotNull() {
            addCriterion("QHWPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkEqualTo(Double value) {
            addCriterion("QHWPFL_QK =", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkNotEqualTo(Double value) {
            addCriterion("QHWPFL_QK <>", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkGreaterThan(Double value) {
            addCriterion("QHWPFL_QK >", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("QHWPFL_QK >=", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkLessThan(Double value) {
            addCriterion("QHWPFL_QK <", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkLessThanOrEqualTo(Double value) {
            addCriterion("QHWPFL_QK <=", value, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkIn(List<Double> values) {
            addCriterion("QHWPFL_QK in", values, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkNotIn(List<Double> values) {
            addCriterion("QHWPFL_QK not in", values, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkBetween(Double value1, Double value2) {
            addCriterion("QHWPFL_QK between", value1, value2, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andQhwpflQkNotBetween(Double value1, Double value2) {
            addCriterion("QHWPFL_QK not between", value1, value2, "qhwpflQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkIsNull() {
            addCriterion("FSSCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsscslQkIsNotNull() {
            addCriterion("FSSCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsscslQkEqualTo(Double value) {
            addCriterion("FSSCSL_QK =", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkNotEqualTo(Double value) {
            addCriterion("FSSCSL_QK <>", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkGreaterThan(Double value) {
            addCriterion("FSSCSL_QK >", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSSCSL_QK >=", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkLessThan(Double value) {
            addCriterion("FSSCSL_QK <", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkLessThanOrEqualTo(Double value) {
            addCriterion("FSSCSL_QK <=", value, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkIn(List<Double> values) {
            addCriterion("FSSCSL_QK in", values, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkNotIn(List<Double> values) {
            addCriterion("FSSCSL_QK not in", values, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkBetween(Double value1, Double value2) {
            addCriterion("FSSCSL_QK between", value1, value2, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsscslQkNotBetween(Double value1, Double value2) {
            addCriterion("FSSCSL_QK not between", value1, value2, "fsscslQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkIsNull() {
            addCriterion("FSSPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsspflQkIsNotNull() {
            addCriterion("FSSPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsspflQkEqualTo(Double value) {
            addCriterion("FSSPFL_QK =", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkNotEqualTo(Double value) {
            addCriterion("FSSPFL_QK <>", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkGreaterThan(Double value) {
            addCriterion("FSSPFL_QK >", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSSPFL_QK >=", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkLessThan(Double value) {
            addCriterion("FSSPFL_QK <", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkLessThanOrEqualTo(Double value) {
            addCriterion("FSSPFL_QK <=", value, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkIn(List<Double> values) {
            addCriterion("FSSPFL_QK in", values, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkNotIn(List<Double> values) {
            addCriterion("FSSPFL_QK not in", values, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkBetween(Double value1, Double value2) {
            addCriterion("FSSPFL_QK between", value1, value2, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsspflQkNotBetween(Double value1, Double value2) {
            addCriterion("FSSPFL_QK not between", value1, value2, "fsspflQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkIsNull() {
            addCriterion("FSQCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkIsNotNull() {
            addCriterion("FSQCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkEqualTo(Double value) {
            addCriterion("FSQCSL_QK =", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkNotEqualTo(Double value) {
            addCriterion("FSQCSL_QK <>", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkGreaterThan(Double value) {
            addCriterion("FSQCSL_QK >", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSQCSL_QK >=", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkLessThan(Double value) {
            addCriterion("FSQCSL_QK <", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FSQCSL_QK <=", value, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkIn(List<Double> values) {
            addCriterion("FSQCSL_QK in", values, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkNotIn(List<Double> values) {
            addCriterion("FSQCSL_QK not in", values, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkBetween(Double value1, Double value2) {
            addCriterion("FSQCSL_QK between", value1, value2, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FSQCSL_QK not between", value1, value2, "fsqcslQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkIsNull() {
            addCriterion("FSQPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkIsNotNull() {
            addCriterion("FSQPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkEqualTo(Double value) {
            addCriterion("FSQPFL_QK =", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkNotEqualTo(Double value) {
            addCriterion("FSQPFL_QK <>", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkGreaterThan(Double value) {
            addCriterion("FSQPFL_QK >", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSQPFL_QK >=", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkLessThan(Double value) {
            addCriterion("FSQPFL_QK <", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FSQPFL_QK <=", value, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkIn(List<Double> values) {
            addCriterion("FSQPFL_QK in", values, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkNotIn(List<Double> values) {
            addCriterion("FSQPFL_QK not in", values, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkBetween(Double value1, Double value2) {
            addCriterion("FSQPFL_QK between", value1, value2, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsqpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FSQPFL_QK not between", value1, value2, "fsqpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkIsNull() {
            addCriterion("FSGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkIsNotNull() {
            addCriterion("FSGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkEqualTo(Double value) {
            addCriterion("FSGCSL_QK =", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkNotEqualTo(Double value) {
            addCriterion("FSGCSL_QK <>", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkGreaterThan(Double value) {
            addCriterion("FSGCSL_QK >", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSGCSL_QK >=", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkLessThan(Double value) {
            addCriterion("FSGCSL_QK <", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FSGCSL_QK <=", value, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkIn(List<Double> values) {
            addCriterion("FSGCSL_QK in", values, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkNotIn(List<Double> values) {
            addCriterion("FSGCSL_QK not in", values, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkBetween(Double value1, Double value2) {
            addCriterion("FSGCSL_QK between", value1, value2, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FSGCSL_QK not between", value1, value2, "fsgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkIsNull() {
            addCriterion("FSGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkIsNotNull() {
            addCriterion("FSGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkEqualTo(Double value) {
            addCriterion("FSGPFL_QK =", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkNotEqualTo(Double value) {
            addCriterion("FSGPFL_QK <>", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkGreaterThan(Double value) {
            addCriterion("FSGPFL_QK >", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSGPFL_QK >=", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkLessThan(Double value) {
            addCriterion("FSGPFL_QK <", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FSGPFL_QK <=", value, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkIn(List<Double> values) {
            addCriterion("FSGPFL_QK in", values, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkNotIn(List<Double> values) {
            addCriterion("FSGPFL_QK not in", values, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkBetween(Double value1, Double value2) {
            addCriterion("FSGPFL_QK between", value1, value2, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FSGPFL_QK not between", value1, value2, "fsgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1IsNull() {
            addCriterion("FSGCSL_QK_DUP1 is null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1IsNotNull() {
            addCriterion("FSGCSL_QK_DUP1 is not null");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1EqualTo(Double value) {
            addCriterion("FSGCSL_QK_DUP1 =", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1NotEqualTo(Double value) {
            addCriterion("FSGCSL_QK_DUP1 <>", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1GreaterThan(Double value) {
            addCriterion("FSGCSL_QK_DUP1 >", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1GreaterThanOrEqualTo(Double value) {
            addCriterion("FSGCSL_QK_DUP1 >=", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1LessThan(Double value) {
            addCriterion("FSGCSL_QK_DUP1 <", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1LessThanOrEqualTo(Double value) {
            addCriterion("FSGCSL_QK_DUP1 <=", value, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1In(List<Double> values) {
            addCriterion("FSGCSL_QK_DUP1 in", values, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1NotIn(List<Double> values) {
            addCriterion("FSGCSL_QK_DUP1 not in", values, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1Between(Double value1, Double value2) {
            addCriterion("FSGCSL_QK_DUP1 between", value1, value2, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgcslQkDup1NotBetween(Double value1, Double value2) {
            addCriterion("FSGCSL_QK_DUP1 not between", value1, value2, "fsgcslQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1IsNull() {
            addCriterion("FSGPFL_QK_DUP1 is null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1IsNotNull() {
            addCriterion("FSGPFL_QK_DUP1 is not null");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1EqualTo(Double value) {
            addCriterion("FSGPFL_QK_DUP1 =", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1NotEqualTo(Double value) {
            addCriterion("FSGPFL_QK_DUP1 <>", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1GreaterThan(Double value) {
            addCriterion("FSGPFL_QK_DUP1 >", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1GreaterThanOrEqualTo(Double value) {
            addCriterion("FSGPFL_QK_DUP1 >=", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1LessThan(Double value) {
            addCriterion("FSGPFL_QK_DUP1 <", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1LessThanOrEqualTo(Double value) {
            addCriterion("FSGPFL_QK_DUP1 <=", value, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1In(List<Double> values) {
            addCriterion("FSGPFL_QK_DUP1 in", values, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1NotIn(List<Double> values) {
            addCriterion("FSGPFL_QK_DUP1 not in", values, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1Between(Double value1, Double value2) {
            addCriterion("FSGPFL_QK_DUP1 between", value1, value2, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFsgpflQkDup1NotBetween(Double value1, Double value2) {
            addCriterion("FSGPFL_QK_DUP1 not between", value1, value2, "fsgpflQkDup1");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkIsNull() {
            addCriterion("FSZGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkIsNotNull() {
            addCriterion("FSZGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkEqualTo(Double value) {
            addCriterion("FSZGCSL_QK =", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkNotEqualTo(Double value) {
            addCriterion("FSZGCSL_QK <>", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkGreaterThan(Double value) {
            addCriterion("FSZGCSL_QK >", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSZGCSL_QK >=", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkLessThan(Double value) {
            addCriterion("FSZGCSL_QK <", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FSZGCSL_QK <=", value, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkIn(List<Double> values) {
            addCriterion("FSZGCSL_QK in", values, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkNotIn(List<Double> values) {
            addCriterion("FSZGCSL_QK not in", values, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkBetween(Double value1, Double value2) {
            addCriterion("FSZGCSL_QK between", value1, value2, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FSZGCSL_QK not between", value1, value2, "fszgcslQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkIsNull() {
            addCriterion("FSZGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkIsNotNull() {
            addCriterion("FSZGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkEqualTo(Double value) {
            addCriterion("FSZGPFL_QK =", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkNotEqualTo(Double value) {
            addCriterion("FSZGPFL_QK <>", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkGreaterThan(Double value) {
            addCriterion("FSZGPFL_QK >", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSZGPFL_QK >=", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkLessThan(Double value) {
            addCriterion("FSZGPFL_QK <", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FSZGPFL_QK <=", value, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkIn(List<Double> values) {
            addCriterion("FSZGPFL_QK in", values, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkNotIn(List<Double> values) {
            addCriterion("FSZGPFL_QK not in", values, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkBetween(Double value1, Double value2) {
            addCriterion("FSZGPFL_QK between", value1, value2, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszgpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FSZGPFL_QK not between", value1, value2, "fszgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkIsNull() {
            addCriterion("FSLJGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkIsNotNull() {
            addCriterion("FSLJGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkEqualTo(Double value) {
            addCriterion("FSLJGCSL_QK =", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkNotEqualTo(Double value) {
            addCriterion("FSLJGCSL_QK <>", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkGreaterThan(Double value) {
            addCriterion("FSLJGCSL_QK >", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSLJGCSL_QK >=", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkLessThan(Double value) {
            addCriterion("FSLJGCSL_QK <", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FSLJGCSL_QK <=", value, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkIn(List<Double> values) {
            addCriterion("FSLJGCSL_QK in", values, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkNotIn(List<Double> values) {
            addCriterion("FSLJGCSL_QK not in", values, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkBetween(Double value1, Double value2) {
            addCriterion("FSLJGCSL_QK between", value1, value2, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FSLJGCSL_QK not between", value1, value2, "fsljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkIsNull() {
            addCriterion("FSLJGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkIsNotNull() {
            addCriterion("FSLJGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkEqualTo(Double value) {
            addCriterion("FSLJGPFL_QK =", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkNotEqualTo(Double value) {
            addCriterion("FSLJGPFL_QK <>", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkGreaterThan(Double value) {
            addCriterion("FSLJGPFL_QK >", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FSLJGPFL_QK >=", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkLessThan(Double value) {
            addCriterion("FSLJGPFL_QK <", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FSLJGPFL_QK <=", value, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkIn(List<Double> values) {
            addCriterion("FSLJGPFL_QK in", values, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkNotIn(List<Double> values) {
            addCriterion("FSLJGPFL_QK not in", values, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkBetween(Double value1, Double value2) {
            addCriterion("FSLJGPFL_QK between", value1, value2, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFsljgpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FSLJGPFL_QK not between", value1, value2, "fsljgpflQk");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmIsNull() {
            addCriterion("GYFQPFL_WLFM is null");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmIsNotNull() {
            addCriterion("GYFQPFL_WLFM is not null");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmEqualTo(Double value) {
            addCriterion("GYFQPFL_WLFM =", value, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmNotEqualTo(Double value) {
            addCriterion("GYFQPFL_WLFM <>", value, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmGreaterThan(Double value) {
            addCriterion("GYFQPFL_WLFM >", value, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmGreaterThanOrEqualTo(Double value) {
            addCriterion("GYFQPFL_WLFM >=", value, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmLessThan(Double value) {
            addCriterion("GYFQPFL_WLFM <", value, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmLessThanOrEqualTo(Double value) {
            addCriterion("GYFQPFL_WLFM <=", value, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmIn(List<Double> values) {
            addCriterion("GYFQPFL_WLFM in", values, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmNotIn(List<Double> values) {
            addCriterion("GYFQPFL_WLFM not in", values, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmBetween(Double value1, Double value2) {
            addCriterion("GYFQPFL_WLFM between", value1, value2, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andGyfqpflWlfmNotBetween(Double value1, Double value2) {
            addCriterion("GYFQPFL_WLFM not between", value1, value2, "gyfqpflWlfm");
            return (Criteria) this;
        }

        public Criteria andEyhscslDIsNull() {
            addCriterion("EYHSCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andEyhscslDIsNotNull() {
            addCriterion("EYHSCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andEyhscslDEqualTo(Double value) {
            addCriterion("EYHSCSL_D =", value, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDNotEqualTo(Double value) {
            addCriterion("EYHSCSL_D <>", value, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDGreaterThan(Double value) {
            addCriterion("EYHSCSL_D >", value, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDGreaterThanOrEqualTo(Double value) {
            addCriterion("EYHSCSL_D >=", value, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDLessThan(Double value) {
            addCriterion("EYHSCSL_D <", value, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDLessThanOrEqualTo(Double value) {
            addCriterion("EYHSCSL_D <=", value, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDIn(List<Double> values) {
            addCriterion("EYHSCSL_D in", values, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDNotIn(List<Double> values) {
            addCriterion("EYHSCSL_D not in", values, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDBetween(Double value1, Double value2) {
            addCriterion("EYHSCSL_D between", value1, value2, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhscslDNotBetween(Double value1, Double value2) {
            addCriterion("EYHSCSL_D not between", value1, value2, "eyhscslD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDIsNull() {
            addCriterion("EYHSPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andEyhspflDIsNotNull() {
            addCriterion("EYHSPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andEyhspflDEqualTo(Double value) {
            addCriterion("EYHSPFL_D =", value, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDNotEqualTo(Double value) {
            addCriterion("EYHSPFL_D <>", value, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDGreaterThan(Double value) {
            addCriterion("EYHSPFL_D >", value, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDGreaterThanOrEqualTo(Double value) {
            addCriterion("EYHSPFL_D >=", value, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDLessThan(Double value) {
            addCriterion("EYHSPFL_D <", value, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDLessThanOrEqualTo(Double value) {
            addCriterion("EYHSPFL_D <=", value, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDIn(List<Double> values) {
            addCriterion("EYHSPFL_D in", values, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDNotIn(List<Double> values) {
            addCriterion("EYHSPFL_D not in", values, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDBetween(Double value1, Double value2) {
            addCriterion("EYHSPFL_D between", value1, value2, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andEyhspflDNotBetween(Double value1, Double value2) {
            addCriterion("EYHSPFL_D not between", value1, value2, "eyhspflD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDIsNull() {
            addCriterion("DYHWCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDIsNotNull() {
            addCriterion("DYHWCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDEqualTo(Double value) {
            addCriterion("DYHWCSL_D =", value, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDNotEqualTo(Double value) {
            addCriterion("DYHWCSL_D <>", value, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDGreaterThan(Double value) {
            addCriterion("DYHWCSL_D >", value, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("DYHWCSL_D >=", value, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDLessThan(Double value) {
            addCriterion("DYHWCSL_D <", value, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDLessThanOrEqualTo(Double value) {
            addCriterion("DYHWCSL_D <=", value, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDIn(List<Double> values) {
            addCriterion("DYHWCSL_D in", values, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDNotIn(List<Double> values) {
            addCriterion("DYHWCSL_D not in", values, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDBetween(Double value1, Double value2) {
            addCriterion("DYHWCSL_D between", value1, value2, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwcslDNotBetween(Double value1, Double value2) {
            addCriterion("DYHWCSL_D not between", value1, value2, "dyhwcslD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDIsNull() {
            addCriterion("DYHWPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDIsNotNull() {
            addCriterion("DYHWPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDEqualTo(Double value) {
            addCriterion("DYHWPFL_D =", value, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDNotEqualTo(Double value) {
            addCriterion("DYHWPFL_D <>", value, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDGreaterThan(Double value) {
            addCriterion("DYHWPFL_D >", value, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDGreaterThanOrEqualTo(Double value) {
            addCriterion("DYHWPFL_D >=", value, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDLessThan(Double value) {
            addCriterion("DYHWPFL_D <", value, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDLessThanOrEqualTo(Double value) {
            addCriterion("DYHWPFL_D <=", value, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDIn(List<Double> values) {
            addCriterion("DYHWPFL_D in", values, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDNotIn(List<Double> values) {
            addCriterion("DYHWPFL_D not in", values, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDBetween(Double value1, Double value2) {
            addCriterion("DYHWPFL_D between", value1, value2, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andDyhwpflDNotBetween(Double value1, Double value2) {
            addCriterion("DYHWPFL_D not between", value1, value2, "dyhwpflD");
            return (Criteria) this;
        }

        public Criteria andYccslDIsNull() {
            addCriterion("YCCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andYccslDIsNotNull() {
            addCriterion("YCCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYccslDEqualTo(Double value) {
            addCriterion("YCCSL_D =", value, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDNotEqualTo(Double value) {
            addCriterion("YCCSL_D <>", value, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDGreaterThan(Double value) {
            addCriterion("YCCSL_D >", value, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDGreaterThanOrEqualTo(Double value) {
            addCriterion("YCCSL_D >=", value, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDLessThan(Double value) {
            addCriterion("YCCSL_D <", value, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDLessThanOrEqualTo(Double value) {
            addCriterion("YCCSL_D <=", value, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDIn(List<Double> values) {
            addCriterion("YCCSL_D in", values, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDNotIn(List<Double> values) {
            addCriterion("YCCSL_D not in", values, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDBetween(Double value1, Double value2) {
            addCriterion("YCCSL_D between", value1, value2, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYccslDNotBetween(Double value1, Double value2) {
            addCriterion("YCCSL_D not between", value1, value2, "yccslD");
            return (Criteria) this;
        }

        public Criteria andYcpflDIsNull() {
            addCriterion("YCPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andYcpflDIsNotNull() {
            addCriterion("YCPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYcpflDEqualTo(Double value) {
            addCriterion("YCPFL_D =", value, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDNotEqualTo(Double value) {
            addCriterion("YCPFL_D <>", value, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDGreaterThan(Double value) {
            addCriterion("YCPFL_D >", value, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDGreaterThanOrEqualTo(Double value) {
            addCriterion("YCPFL_D >=", value, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDLessThan(Double value) {
            addCriterion("YCPFL_D <", value, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDLessThanOrEqualTo(Double value) {
            addCriterion("YCPFL_D <=", value, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDIn(List<Double> values) {
            addCriterion("YCPFL_D in", values, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDNotIn(List<Double> values) {
            addCriterion("YCPFL_D not in", values, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDBetween(Double value1, Double value2) {
            addCriterion("YCPFL_D between", value1, value2, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andYcpflDNotBetween(Double value1, Double value2) {
            addCriterion("YCPFL_D not between", value1, value2, "ycpflD");
            return (Criteria) this;
        }

        public Criteria andVocscslDIsNull() {
            addCriterion("VOCSCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andVocscslDIsNotNull() {
            addCriterion("VOCSCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andVocscslDEqualTo(Double value) {
            addCriterion("VOCSCSL_D =", value, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDNotEqualTo(Double value) {
            addCriterion("VOCSCSL_D <>", value, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDGreaterThan(Double value) {
            addCriterion("VOCSCSL_D >", value, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDGreaterThanOrEqualTo(Double value) {
            addCriterion("VOCSCSL_D >=", value, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDLessThan(Double value) {
            addCriterion("VOCSCSL_D <", value, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDLessThanOrEqualTo(Double value) {
            addCriterion("VOCSCSL_D <=", value, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDIn(List<Double> values) {
            addCriterion("VOCSCSL_D in", values, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDNotIn(List<Double> values) {
            addCriterion("VOCSCSL_D not in", values, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDBetween(Double value1, Double value2) {
            addCriterion("VOCSCSL_D between", value1, value2, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocscslDNotBetween(Double value1, Double value2) {
            addCriterion("VOCSCSL_D not between", value1, value2, "vocscslD");
            return (Criteria) this;
        }

        public Criteria andVocspflDIsNull() {
            addCriterion("VOCSPFL_D is null");
            return (Criteria) this;
        }

        public Criteria andVocspflDIsNotNull() {
            addCriterion("VOCSPFL_D is not null");
            return (Criteria) this;
        }

        public Criteria andVocspflDEqualTo(Double value) {
            addCriterion("VOCSPFL_D =", value, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDNotEqualTo(Double value) {
            addCriterion("VOCSPFL_D <>", value, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDGreaterThan(Double value) {
            addCriterion("VOCSPFL_D >", value, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDGreaterThanOrEqualTo(Double value) {
            addCriterion("VOCSPFL_D >=", value, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDLessThan(Double value) {
            addCriterion("VOCSPFL_D <", value, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDLessThanOrEqualTo(Double value) {
            addCriterion("VOCSPFL_D <=", value, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDIn(List<Double> values) {
            addCriterion("VOCSPFL_D in", values, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDNotIn(List<Double> values) {
            addCriterion("VOCSPFL_D not in", values, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDBetween(Double value1, Double value2) {
            addCriterion("VOCSPFL_D between", value1, value2, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andVocspflDNotBetween(Double value1, Double value2) {
            addCriterion("VOCSPFL_D not between", value1, value2, "vocspflD");
            return (Criteria) this;
        }

        public Criteria andFqscslQkIsNull() {
            addCriterion("FQSCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqscslQkIsNotNull() {
            addCriterion("FQSCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqscslQkEqualTo(Double value) {
            addCriterion("FQSCSL_QK =", value, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkNotEqualTo(Double value) {
            addCriterion("FQSCSL_QK <>", value, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkGreaterThan(Double value) {
            addCriterion("FQSCSL_QK >", value, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQSCSL_QK >=", value, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkLessThan(Double value) {
            addCriterion("FQSCSL_QK <", value, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkLessThanOrEqualTo(Double value) {
            addCriterion("FQSCSL_QK <=", value, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkIn(List<Double> values) {
            addCriterion("FQSCSL_QK in", values, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkNotIn(List<Double> values) {
            addCriterion("FQSCSL_QK not in", values, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkBetween(Double value1, Double value2) {
            addCriterion("FQSCSL_QK between", value1, value2, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqscslQkNotBetween(Double value1, Double value2) {
            addCriterion("FQSCSL_QK not between", value1, value2, "fqscslQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkIsNull() {
            addCriterion("FQSPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqspflQkIsNotNull() {
            addCriterion("FQSPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqspflQkEqualTo(Double value) {
            addCriterion("FQSPFL_QK =", value, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkNotEqualTo(Double value) {
            addCriterion("FQSPFL_QK <>", value, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkGreaterThan(Double value) {
            addCriterion("FQSPFL_QK >", value, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQSPFL_QK >=", value, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkLessThan(Double value) {
            addCriterion("FQSPFL_QK <", value, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkLessThanOrEqualTo(Double value) {
            addCriterion("FQSPFL_QK <=", value, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkIn(List<Double> values) {
            addCriterion("FQSPFL_QK in", values, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkNotIn(List<Double> values) {
            addCriterion("FQSPFL_QK not in", values, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkBetween(Double value1, Double value2) {
            addCriterion("FQSPFL_QK between", value1, value2, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqspflQkNotBetween(Double value1, Double value2) {
            addCriterion("FQSPFL_QK not between", value1, value2, "fqspflQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkIsNull() {
            addCriterion("FQQCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkIsNotNull() {
            addCriterion("FQQCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkEqualTo(Double value) {
            addCriterion("FQQCSL_QK =", value, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkNotEqualTo(Double value) {
            addCriterion("FQQCSL_QK <>", value, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkGreaterThan(Double value) {
            addCriterion("FQQCSL_QK >", value, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQQCSL_QK >=", value, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkLessThan(Double value) {
            addCriterion("FQQCSL_QK <", value, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FQQCSL_QK <=", value, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkIn(List<Double> values) {
            addCriterion("FQQCSL_QK in", values, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkNotIn(List<Double> values) {
            addCriterion("FQQCSL_QK not in", values, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkBetween(Double value1, Double value2) {
            addCriterion("FQQCSL_QK between", value1, value2, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FQQCSL_QK not between", value1, value2, "fqqcslQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkIsNull() {
            addCriterion("FQQPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkIsNotNull() {
            addCriterion("FQQPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkEqualTo(Double value) {
            addCriterion("FQQPFL_QK =", value, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkNotEqualTo(Double value) {
            addCriterion("FQQPFL_QK <>", value, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkGreaterThan(Double value) {
            addCriterion("FQQPFL_QK >", value, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQQPFL_QK >=", value, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkLessThan(Double value) {
            addCriterion("FQQPFL_QK <", value, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FQQPFL_QK <=", value, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkIn(List<Double> values) {
            addCriterion("FQQPFL_QK in", values, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkNotIn(List<Double> values) {
            addCriterion("FQQPFL_QK not in", values, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkBetween(Double value1, Double value2) {
            addCriterion("FQQPFL_QK between", value1, value2, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqqpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FQQPFL_QK not between", value1, value2, "fqqpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkIsNull() {
            addCriterion("FQGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkIsNotNull() {
            addCriterion("FQGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkEqualTo(Double value) {
            addCriterion("FQGCSL_QK =", value, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkNotEqualTo(Double value) {
            addCriterion("FQGCSL_QK <>", value, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkGreaterThan(Double value) {
            addCriterion("FQGCSL_QK >", value, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQGCSL_QK >=", value, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkLessThan(Double value) {
            addCriterion("FQGCSL_QK <", value, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FQGCSL_QK <=", value, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkIn(List<Double> values) {
            addCriterion("FQGCSL_QK in", values, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkNotIn(List<Double> values) {
            addCriterion("FQGCSL_QK not in", values, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkBetween(Double value1, Double value2) {
            addCriterion("FQGCSL_QK between", value1, value2, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FQGCSL_QK not between", value1, value2, "fqgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkIsNull() {
            addCriterion("FQGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkIsNotNull() {
            addCriterion("FQGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkEqualTo(Double value) {
            addCriterion("FQGPFL_QK =", value, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkNotEqualTo(Double value) {
            addCriterion("FQGPFL_QK <>", value, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkGreaterThan(Double value) {
            addCriterion("FQGPFL_QK >", value, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQGPFL_QK >=", value, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkLessThan(Double value) {
            addCriterion("FQGPFL_QK <", value, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FQGPFL_QK <=", value, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkIn(List<Double> values) {
            addCriterion("FQGPFL_QK in", values, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkNotIn(List<Double> values) {
            addCriterion("FQGPFL_QK not in", values, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkBetween(Double value1, Double value2) {
            addCriterion("FQGPFL_QK between", value1, value2, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqgpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FQGPFL_QK not between", value1, value2, "fqgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkIsNull() {
            addCriterion("FQZGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkIsNotNull() {
            addCriterion("FQZGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkEqualTo(Double value) {
            addCriterion("FQZGCSL_QK =", value, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkNotEqualTo(Double value) {
            addCriterion("FQZGCSL_QK <>", value, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkGreaterThan(Double value) {
            addCriterion("FQZGCSL_QK >", value, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQZGCSL_QK >=", value, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkLessThan(Double value) {
            addCriterion("FQZGCSL_QK <", value, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FQZGCSL_QK <=", value, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkIn(List<Double> values) {
            addCriterion("FQZGCSL_QK in", values, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkNotIn(List<Double> values) {
            addCriterion("FQZGCSL_QK not in", values, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkBetween(Double value1, Double value2) {
            addCriterion("FQZGCSL_QK between", value1, value2, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FQZGCSL_QK not between", value1, value2, "fqzgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkIsNull() {
            addCriterion("FQZGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkIsNotNull() {
            addCriterion("FQZGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkEqualTo(Double value) {
            addCriterion("FQZGPFL_QK =", value, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkNotEqualTo(Double value) {
            addCriterion("FQZGPFL_QK <>", value, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkGreaterThan(Double value) {
            addCriterion("FQZGPFL_QK >", value, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQZGPFL_QK >=", value, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkLessThan(Double value) {
            addCriterion("FQZGPFL_QK <", value, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FQZGPFL_QK <=", value, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkIn(List<Double> values) {
            addCriterion("FQZGPFL_QK in", values, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkNotIn(List<Double> values) {
            addCriterion("FQZGPFL_QK not in", values, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkBetween(Double value1, Double value2) {
            addCriterion("FQZGPFL_QK between", value1, value2, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqzgpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FQZGPFL_QK not between", value1, value2, "fqzgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkIsNull() {
            addCriterion("FQLJGCSL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkIsNotNull() {
            addCriterion("FQLJGCSL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkEqualTo(Double value) {
            addCriterion("FQLJGCSL_QK =", value, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkNotEqualTo(Double value) {
            addCriterion("FQLJGCSL_QK <>", value, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkGreaterThan(Double value) {
            addCriterion("FQLJGCSL_QK >", value, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQLJGCSL_QK >=", value, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkLessThan(Double value) {
            addCriterion("FQLJGCSL_QK <", value, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkLessThanOrEqualTo(Double value) {
            addCriterion("FQLJGCSL_QK <=", value, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkIn(List<Double> values) {
            addCriterion("FQLJGCSL_QK in", values, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkNotIn(List<Double> values) {
            addCriterion("FQLJGCSL_QK not in", values, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkBetween(Double value1, Double value2) {
            addCriterion("FQLJGCSL_QK between", value1, value2, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgcslQkNotBetween(Double value1, Double value2) {
            addCriterion("FQLJGCSL_QK not between", value1, value2, "fqljgcslQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkIsNull() {
            addCriterion("FQLJGPFL_QK is null");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkIsNotNull() {
            addCriterion("FQLJGPFL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkEqualTo(Double value) {
            addCriterion("FQLJGPFL_QK =", value, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkNotEqualTo(Double value) {
            addCriterion("FQLJGPFL_QK <>", value, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkGreaterThan(Double value) {
            addCriterion("FQLJGPFL_QK >", value, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkGreaterThanOrEqualTo(Double value) {
            addCriterion("FQLJGPFL_QK >=", value, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkLessThan(Double value) {
            addCriterion("FQLJGPFL_QK <", value, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkLessThanOrEqualTo(Double value) {
            addCriterion("FQLJGPFL_QK <=", value, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkIn(List<Double> values) {
            addCriterion("FQLJGPFL_QK in", values, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkNotIn(List<Double> values) {
            addCriterion("FQLJGPFL_QK not in", values, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkBetween(Double value1, Double value2) {
            addCriterion("FQLJGPFL_QK between", value1, value2, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFqljgpflQkNotBetween(Double value1, Double value2) {
            addCriterion("FQLJGPFL_QK not between", value1, value2, "fqljgpflQk");
            return (Criteria) this;
        }

        public Criteria andFszlsssTIsNull() {
            addCriterion("FSZLSSS_T is null");
            return (Criteria) this;
        }

        public Criteria andFszlsssTIsNotNull() {
            addCriterion("FSZLSSS_T is not null");
            return (Criteria) this;
        }

        public Criteria andFszlsssTEqualTo(Integer value) {
            addCriterion("FSZLSSS_T =", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTNotEqualTo(Integer value) {
            addCriterion("FSZLSSS_T <>", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTGreaterThan(Integer value) {
            addCriterion("FSZLSSS_T >", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTGreaterThanOrEqualTo(Integer value) {
            addCriterion("FSZLSSS_T >=", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTLessThan(Integer value) {
            addCriterion("FSZLSSS_T <", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTLessThanOrEqualTo(Integer value) {
            addCriterion("FSZLSSS_T <=", value, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTIn(List<Integer> values) {
            addCriterion("FSZLSSS_T in", values, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTNotIn(List<Integer> values) {
            addCriterion("FSZLSSS_T not in", values, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTBetween(Integer value1, Integer value2) {
            addCriterion("FSZLSSS_T between", value1, value2, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlsssTNotBetween(Integer value1, Integer value2) {
            addCriterion("FSZLSSS_T not between", value1, value2, "fszlsssT");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRIsNull() {
            addCriterion("FSZLSSCLNL_D_R is null");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRIsNotNull() {
            addCriterion("FSZLSSCLNL_D_R is not null");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDREqualTo(Double value) {
            addCriterion("FSZLSSCLNL_D_R =", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRNotEqualTo(Double value) {
            addCriterion("FSZLSSCLNL_D_R <>", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRGreaterThan(Double value) {
            addCriterion("FSZLSSCLNL_D_R >", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRGreaterThanOrEqualTo(Double value) {
            addCriterion("FSZLSSCLNL_D_R >=", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRLessThan(Double value) {
            addCriterion("FSZLSSCLNL_D_R <", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRLessThanOrEqualTo(Double value) {
            addCriterion("FSZLSSCLNL_D_R <=", value, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRIn(List<Double> values) {
            addCriterion("FSZLSSCLNL_D_R in", values, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRNotIn(List<Double> values) {
            addCriterion("FSZLSSCLNL_D_R not in", values, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRBetween(Double value1, Double value2) {
            addCriterion("FSZLSSCLNL_D_R between", value1, value2, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlDRNotBetween(Double value1, Double value2) {
            addCriterion("FSZLSSCLNL_D_R not between", value1, value2, "fszlssclnlDR");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyIsNull() {
            addCriterion("FSZLSSYXFY_WY is null");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyIsNotNull() {
            addCriterion("FSZLSSYXFY_WY is not null");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyEqualTo(Double value) {
            addCriterion("FSZLSSYXFY_WY =", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyNotEqualTo(Double value) {
            addCriterion("FSZLSSYXFY_WY <>", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyGreaterThan(Double value) {
            addCriterion("FSZLSSYXFY_WY >", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyGreaterThanOrEqualTo(Double value) {
            addCriterion("FSZLSSYXFY_WY >=", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyLessThan(Double value) {
            addCriterion("FSZLSSYXFY_WY <", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyLessThanOrEqualTo(Double value) {
            addCriterion("FSZLSSYXFY_WY <=", value, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyIn(List<Double> values) {
            addCriterion("FSZLSSYXFY_WY in", values, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyNotIn(List<Double> values) {
            addCriterion("FSZLSSYXFY_WY not in", values, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyBetween(Double value1, Double value2) {
            addCriterion("FSZLSSYXFY_WY between", value1, value2, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlssyxfyWyNotBetween(Double value1, Double value2) {
            addCriterion("FSZLSSYXFY_WY not between", value1, value2, "fszlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTIsNull() {
            addCriterion("FQZLSSS_T is null");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTIsNotNull() {
            addCriterion("FQZLSSS_T is not null");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTEqualTo(Integer value) {
            addCriterion("FQZLSSS_T =", value, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTNotEqualTo(Integer value) {
            addCriterion("FQZLSSS_T <>", value, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTGreaterThan(Integer value) {
            addCriterion("FQZLSSS_T >", value, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTGreaterThanOrEqualTo(Integer value) {
            addCriterion("FQZLSSS_T >=", value, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTLessThan(Integer value) {
            addCriterion("FQZLSSS_T <", value, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTLessThanOrEqualTo(Integer value) {
            addCriterion("FQZLSSS_T <=", value, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTIn(List<Integer> values) {
            addCriterion("FQZLSSS_T in", values, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTNotIn(List<Integer> values) {
            addCriterion("FQZLSSS_T not in", values, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTBetween(Integer value1, Integer value2) {
            addCriterion("FQZLSSS_T between", value1, value2, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlsssTNotBetween(Integer value1, Integer value2) {
            addCriterion("FQZLSSS_T not between", value1, value2, "fqzlsssT");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSIsNull() {
            addCriterion("FQZLSSCLNL_LFM_S is null");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSIsNotNull() {
            addCriterion("FQZLSSCLNL_LFM_S is not null");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSEqualTo(Double value) {
            addCriterion("FQZLSSCLNL_LFM_S =", value, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSNotEqualTo(Double value) {
            addCriterion("FQZLSSCLNL_LFM_S <>", value, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSGreaterThan(Double value) {
            addCriterion("FQZLSSCLNL_LFM_S >", value, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSGreaterThanOrEqualTo(Double value) {
            addCriterion("FQZLSSCLNL_LFM_S >=", value, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSLessThan(Double value) {
            addCriterion("FQZLSSCLNL_LFM_S <", value, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSLessThanOrEqualTo(Double value) {
            addCriterion("FQZLSSCLNL_LFM_S <=", value, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSIn(List<Double> values) {
            addCriterion("FQZLSSCLNL_LFM_S in", values, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSNotIn(List<Double> values) {
            addCriterion("FQZLSSCLNL_LFM_S not in", values, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSBetween(Double value1, Double value2) {
            addCriterion("FQZLSSCLNL_LFM_S between", value1, value2, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssclnlLfmSNotBetween(Double value1, Double value2) {
            addCriterion("FQZLSSCLNL_LFM_S not between", value1, value2, "fqzlssclnlLfmS");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyIsNull() {
            addCriterion("FQZLSSYXFY_WY is null");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyIsNotNull() {
            addCriterion("FQZLSSYXFY_WY is not null");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyEqualTo(Double value) {
            addCriterion("FQZLSSYXFY_WY =", value, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyNotEqualTo(Double value) {
            addCriterion("FQZLSSYXFY_WY <>", value, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyGreaterThan(Double value) {
            addCriterion("FQZLSSYXFY_WY >", value, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyGreaterThanOrEqualTo(Double value) {
            addCriterion("FQZLSSYXFY_WY >=", value, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyLessThan(Double value) {
            addCriterion("FQZLSSYXFY_WY <", value, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyLessThanOrEqualTo(Double value) {
            addCriterion("FQZLSSYXFY_WY <=", value, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyIn(List<Double> values) {
            addCriterion("FQZLSSYXFY_WY in", values, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyNotIn(List<Double> values) {
            addCriterion("FQZLSSYXFY_WY not in", values, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyBetween(Double value1, Double value2) {
            addCriterion("FQZLSSYXFY_WY between", value1, value2, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFqzlssyxfyWyNotBetween(Double value1, Double value2) {
            addCriterion("FQZLSSYXFY_WY not between", value1, value2, "fqzlssyxfyWy");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssIsNull() {
            addCriterion("FSZLSSSBH_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssIsNotNull() {
            addCriterion("FSZLSSSBH_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssEqualTo(String value) {
            addCriterion("FSZLSSSBH_WRZLSS =", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssNotEqualTo(String value) {
            addCriterion("FSZLSSSBH_WRZLSS <>", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssGreaterThan(String value) {
            addCriterion("FSZLSSSBH_WRZLSS >", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("FSZLSSSBH_WRZLSS >=", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssLessThan(String value) {
            addCriterion("FSZLSSSBH_WRZLSS <", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssLessThanOrEqualTo(String value) {
            addCriterion("FSZLSSSBH_WRZLSS <=", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssLike(String value) {
            addCriterion("FSZLSSSBH_WRZLSS like", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssNotLike(String value) {
            addCriterion("FSZLSSSBH_WRZLSS not like", value, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssIn(List<String> values) {
            addCriterion("FSZLSSSBH_WRZLSS in", values, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssNotIn(List<String> values) {
            addCriterion("FSZLSSSBH_WRZLSS not in", values, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssBetween(String value1, String value2) {
            addCriterion("FSZLSSSBH_WRZLSS between", value1, value2, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlsssbhWrzlssNotBetween(String value1, String value2) {
            addCriterion("FSZLSSSBH_WRZLSS not between", value1, value2, "fszlsssbhWrzlss");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRIsNull() {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R is null");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRIsNotNull() {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R is not null");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDREqualTo(Double value) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R =", value, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRNotEqualTo(Double value) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R <>", value, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRGreaterThan(Double value) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R >", value, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRGreaterThanOrEqualTo(Double value) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R >=", value, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRLessThan(Double value) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R <", value, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRLessThanOrEqualTo(Double value) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R <=", value, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRIn(List<Double> values) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R in", values, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRNotIn(List<Double> values) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R not in", values, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRBetween(Double value1, Double value2) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R between", value1, value2, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFszlssclnlWrzlssDRNotBetween(Double value1, Double value2) {
            addCriterion("FSZLSSCLNL_WRZLSS_D_R not between", value1, value2, "fszlssclnlWrzlssDR");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssIsNull() {
            addCriterion("FSCLGYDM_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssIsNotNull() {
            addCriterion("FSCLGYDM_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssEqualTo(String value) {
            addCriterion("FSCLGYDM_WRZLSS =", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssNotEqualTo(String value) {
            addCriterion("FSCLGYDM_WRZLSS <>", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssGreaterThan(String value) {
            addCriterion("FSCLGYDM_WRZLSS >", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("FSCLGYDM_WRZLSS >=", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssLessThan(String value) {
            addCriterion("FSCLGYDM_WRZLSS <", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssLessThanOrEqualTo(String value) {
            addCriterion("FSCLGYDM_WRZLSS <=", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssLike(String value) {
            addCriterion("FSCLGYDM_WRZLSS like", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssNotLike(String value) {
            addCriterion("FSCLGYDM_WRZLSS not like", value, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssIn(List<String> values) {
            addCriterion("FSCLGYDM_WRZLSS in", values, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssNotIn(List<String> values) {
            addCriterion("FSCLGYDM_WRZLSS not in", values, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssBetween(String value1, String value2) {
            addCriterion("FSCLGYDM_WRZLSS between", value1, value2, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgydmWrzlssNotBetween(String value1, String value2) {
            addCriterion("FSCLGYDM_WRZLSS not between", value1, value2, "fsclgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssIsNull() {
            addCriterion("FSCLGYMC_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssIsNotNull() {
            addCriterion("FSCLGYMC_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssEqualTo(String value) {
            addCriterion("FSCLGYMC_WRZLSS =", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssNotEqualTo(String value) {
            addCriterion("FSCLGYMC_WRZLSS <>", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssGreaterThan(String value) {
            addCriterion("FSCLGYMC_WRZLSS >", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("FSCLGYMC_WRZLSS >=", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssLessThan(String value) {
            addCriterion("FSCLGYMC_WRZLSS <", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssLessThanOrEqualTo(String value) {
            addCriterion("FSCLGYMC_WRZLSS <=", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssLike(String value) {
            addCriterion("FSCLGYMC_WRZLSS like", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssNotLike(String value) {
            addCriterion("FSCLGYMC_WRZLSS not like", value, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssIn(List<String> values) {
            addCriterion("FSCLGYMC_WRZLSS in", values, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssNotIn(List<String> values) {
            addCriterion("FSCLGYMC_WRZLSS not in", values, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssBetween(String value1, String value2) {
            addCriterion("FSCLGYMC_WRZLSS between", value1, value2, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFsclgymcWrzlssNotBetween(String value1, String value2) {
            addCriterion("FSCLGYMC_WRZLSS not between", value1, value2, "fsclgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDIsNull() {
            addCriterion("FSCLL_WRZLSS_D is null");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDIsNotNull() {
            addCriterion("FSCLL_WRZLSS_D is not null");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDEqualTo(Double value) {
            addCriterion("FSCLL_WRZLSS_D =", value, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDNotEqualTo(Double value) {
            addCriterion("FSCLL_WRZLSS_D <>", value, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDGreaterThan(Double value) {
            addCriterion("FSCLL_WRZLSS_D >", value, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDGreaterThanOrEqualTo(Double value) {
            addCriterion("FSCLL_WRZLSS_D >=", value, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDLessThan(Double value) {
            addCriterion("FSCLL_WRZLSS_D <", value, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDLessThanOrEqualTo(Double value) {
            addCriterion("FSCLL_WRZLSS_D <=", value, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDIn(List<Double> values) {
            addCriterion("FSCLL_WRZLSS_D in", values, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDNotIn(List<Double> values) {
            addCriterion("FSCLL_WRZLSS_D not in", values, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDBetween(Double value1, Double value2) {
            addCriterion("FSCLL_WRZLSS_D between", value1, value2, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllWrzlssDNotBetween(Double value1, Double value2) {
            addCriterion("FSCLL_WRZLSS_D not between", value1, value2, "fscllWrzlssD");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssIsNull() {
            addCriterion("FSCLLXDM_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssIsNotNull() {
            addCriterion("FSCLLXDM_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssEqualTo(String value) {
            addCriterion("FSCLLXDM_WRZLSS =", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssNotEqualTo(String value) {
            addCriterion("FSCLLXDM_WRZLSS <>", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssGreaterThan(String value) {
            addCriterion("FSCLLXDM_WRZLSS >", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("FSCLLXDM_WRZLSS >=", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssLessThan(String value) {
            addCriterion("FSCLLXDM_WRZLSS <", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssLessThanOrEqualTo(String value) {
            addCriterion("FSCLLXDM_WRZLSS <=", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssLike(String value) {
            addCriterion("FSCLLXDM_WRZLSS like", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssNotLike(String value) {
            addCriterion("FSCLLXDM_WRZLSS not like", value, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssIn(List<String> values) {
            addCriterion("FSCLLXDM_WRZLSS in", values, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssNotIn(List<String> values) {
            addCriterion("FSCLLXDM_WRZLSS not in", values, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssBetween(String value1, String value2) {
            addCriterion("FSCLLXDM_WRZLSS between", value1, value2, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxdmWrzlssNotBetween(String value1, String value2) {
            addCriterion("FSCLLXDM_WRZLSS not between", value1, value2, "fscllxdmWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssIsNull() {
            addCriterion("FSCLLXMC_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssIsNotNull() {
            addCriterion("FSCLLXMC_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssEqualTo(String value) {
            addCriterion("FSCLLXMC_WRZLSS =", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssNotEqualTo(String value) {
            addCriterion("FSCLLXMC_WRZLSS <>", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssGreaterThan(String value) {
            addCriterion("FSCLLXMC_WRZLSS >", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("FSCLLXMC_WRZLSS >=", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssLessThan(String value) {
            addCriterion("FSCLLXMC_WRZLSS <", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssLessThanOrEqualTo(String value) {
            addCriterion("FSCLLXMC_WRZLSS <=", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssLike(String value) {
            addCriterion("FSCLLXMC_WRZLSS like", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssNotLike(String value) {
            addCriterion("FSCLLXMC_WRZLSS not like", value, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssIn(List<String> values) {
            addCriterion("FSCLLXMC_WRZLSS in", values, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssNotIn(List<String> values) {
            addCriterion("FSCLLXMC_WRZLSS not in", values, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssBetween(String value1, String value2) {
            addCriterion("FSCLLXMC_WRZLSS between", value1, value2, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andFscllxmcWrzlssNotBetween(String value1, String value2) {
            addCriterion("FSCLLXMC_WRZLSS not between", value1, value2, "fscllxmcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssIsNull() {
            addCriterion("TLGYDM_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssIsNotNull() {
            addCriterion("TLGYDM_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssEqualTo(String value) {
            addCriterion("TLGYDM_WRZLSS =", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssNotEqualTo(String value) {
            addCriterion("TLGYDM_WRZLSS <>", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssGreaterThan(String value) {
            addCriterion("TLGYDM_WRZLSS >", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("TLGYDM_WRZLSS >=", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssLessThan(String value) {
            addCriterion("TLGYDM_WRZLSS <", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssLessThanOrEqualTo(String value) {
            addCriterion("TLGYDM_WRZLSS <=", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssLike(String value) {
            addCriterion("TLGYDM_WRZLSS like", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssNotLike(String value) {
            addCriterion("TLGYDM_WRZLSS not like", value, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssIn(List<String> values) {
            addCriterion("TLGYDM_WRZLSS in", values, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssNotIn(List<String> values) {
            addCriterion("TLGYDM_WRZLSS not in", values, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssBetween(String value1, String value2) {
            addCriterion("TLGYDM_WRZLSS between", value1, value2, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgydmWrzlssNotBetween(String value1, String value2) {
            addCriterion("TLGYDM_WRZLSS not between", value1, value2, "tlgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssIsNull() {
            addCriterion("TLGYMC_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssIsNotNull() {
            addCriterion("TLGYMC_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssEqualTo(String value) {
            addCriterion("TLGYMC_WRZLSS =", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssNotEqualTo(String value) {
            addCriterion("TLGYMC_WRZLSS <>", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssGreaterThan(String value) {
            addCriterion("TLGYMC_WRZLSS >", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("TLGYMC_WRZLSS >=", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssLessThan(String value) {
            addCriterion("TLGYMC_WRZLSS <", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssLessThanOrEqualTo(String value) {
            addCriterion("TLGYMC_WRZLSS <=", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssLike(String value) {
            addCriterion("TLGYMC_WRZLSS like", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssNotLike(String value) {
            addCriterion("TLGYMC_WRZLSS not like", value, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssIn(List<String> values) {
            addCriterion("TLGYMC_WRZLSS in", values, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssNotIn(List<String> values) {
            addCriterion("TLGYMC_WRZLSS not in", values, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssBetween(String value1, String value2) {
            addCriterion("TLGYMC_WRZLSS between", value1, value2, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlgymcWrzlssNotBetween(String value1, String value2) {
            addCriterion("TLGYMC_WRZLSS not between", value1, value2, "tlgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsIsNull() {
            addCriterion("TLSSQCXL_WRZLSS_BFS is null");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsIsNotNull() {
            addCriterion("TLSSQCXL_WRZLSS_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsEqualTo(Double value) {
            addCriterion("TLSSQCXL_WRZLSS_BFS =", value, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsNotEqualTo(Double value) {
            addCriterion("TLSSQCXL_WRZLSS_BFS <>", value, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsGreaterThan(Double value) {
            addCriterion("TLSSQCXL_WRZLSS_BFS >", value, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("TLSSQCXL_WRZLSS_BFS >=", value, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsLessThan(Double value) {
            addCriterion("TLSSQCXL_WRZLSS_BFS <", value, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsLessThanOrEqualTo(Double value) {
            addCriterion("TLSSQCXL_WRZLSS_BFS <=", value, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsIn(List<Double> values) {
            addCriterion("TLSSQCXL_WRZLSS_BFS in", values, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsNotIn(List<Double> values) {
            addCriterion("TLSSQCXL_WRZLSS_BFS not in", values, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsBetween(Double value1, Double value2) {
            addCriterion("TLSSQCXL_WRZLSS_BFS between", value1, value2, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssqcxlWrzlssBfsNotBetween(Double value1, Double value2) {
            addCriterion("TLSSQCXL_WRZLSS_BFS not between", value1, value2, "tlssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSIsNull() {
            addCriterion("TLSSYXSJ_WRZLSS_S is null");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSIsNotNull() {
            addCriterion("TLSSYXSJ_WRZLSS_S is not null");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSEqualTo(Integer value) {
            addCriterion("TLSSYXSJ_WRZLSS_S =", value, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSNotEqualTo(Integer value) {
            addCriterion("TLSSYXSJ_WRZLSS_S <>", value, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSGreaterThan(Integer value) {
            addCriterion("TLSSYXSJ_WRZLSS_S >", value, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSGreaterThanOrEqualTo(Integer value) {
            addCriterion("TLSSYXSJ_WRZLSS_S >=", value, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSLessThan(Integer value) {
            addCriterion("TLSSYXSJ_WRZLSS_S <", value, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSLessThanOrEqualTo(Integer value) {
            addCriterion("TLSSYXSJ_WRZLSS_S <=", value, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSIn(List<Integer> values) {
            addCriterion("TLSSYXSJ_WRZLSS_S in", values, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSNotIn(List<Integer> values) {
            addCriterion("TLSSYXSJ_WRZLSS_S not in", values, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSBetween(Integer value1, Integer value2) {
            addCriterion("TLSSYXSJ_WRZLSS_S between", value1, value2, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTlssyxsjWrzlssSNotBetween(Integer value1, Integer value2) {
            addCriterion("TLSSYXSJ_WRZLSS_S not between", value1, value2, "tlssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssIsNull() {
            addCriterion("TXGYDM_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssIsNotNull() {
            addCriterion("TXGYDM_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssEqualTo(String value) {
            addCriterion("TXGYDM_WRZLSS =", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssNotEqualTo(String value) {
            addCriterion("TXGYDM_WRZLSS <>", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssGreaterThan(String value) {
            addCriterion("TXGYDM_WRZLSS >", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("TXGYDM_WRZLSS >=", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssLessThan(String value) {
            addCriterion("TXGYDM_WRZLSS <", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssLessThanOrEqualTo(String value) {
            addCriterion("TXGYDM_WRZLSS <=", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssLike(String value) {
            addCriterion("TXGYDM_WRZLSS like", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssNotLike(String value) {
            addCriterion("TXGYDM_WRZLSS not like", value, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssIn(List<String> values) {
            addCriterion("TXGYDM_WRZLSS in", values, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssNotIn(List<String> values) {
            addCriterion("TXGYDM_WRZLSS not in", values, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssBetween(String value1, String value2) {
            addCriterion("TXGYDM_WRZLSS between", value1, value2, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgydmWrzlssNotBetween(String value1, String value2) {
            addCriterion("TXGYDM_WRZLSS not between", value1, value2, "txgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssIsNull() {
            addCriterion("TXGYMC_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssIsNotNull() {
            addCriterion("TXGYMC_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssEqualTo(String value) {
            addCriterion("TXGYMC_WRZLSS =", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssNotEqualTo(String value) {
            addCriterion("TXGYMC_WRZLSS <>", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssGreaterThan(String value) {
            addCriterion("TXGYMC_WRZLSS >", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("TXGYMC_WRZLSS >=", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssLessThan(String value) {
            addCriterion("TXGYMC_WRZLSS <", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssLessThanOrEqualTo(String value) {
            addCriterion("TXGYMC_WRZLSS <=", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssLike(String value) {
            addCriterion("TXGYMC_WRZLSS like", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssNotLike(String value) {
            addCriterion("TXGYMC_WRZLSS not like", value, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssIn(List<String> values) {
            addCriterion("TXGYMC_WRZLSS in", values, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssNotIn(List<String> values) {
            addCriterion("TXGYMC_WRZLSS not in", values, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssBetween(String value1, String value2) {
            addCriterion("TXGYMC_WRZLSS between", value1, value2, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxgymcWrzlssNotBetween(String value1, String value2) {
            addCriterion("TXGYMC_WRZLSS not between", value1, value2, "txgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsIsNull() {
            addCriterion("TXSSQCXL_WRZLSS_BFS is null");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsIsNotNull() {
            addCriterion("TXSSQCXL_WRZLSS_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsEqualTo(Double value) {
            addCriterion("TXSSQCXL_WRZLSS_BFS =", value, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsNotEqualTo(Double value) {
            addCriterion("TXSSQCXL_WRZLSS_BFS <>", value, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsGreaterThan(Double value) {
            addCriterion("TXSSQCXL_WRZLSS_BFS >", value, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("TXSSQCXL_WRZLSS_BFS >=", value, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsLessThan(Double value) {
            addCriterion("TXSSQCXL_WRZLSS_BFS <", value, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsLessThanOrEqualTo(Double value) {
            addCriterion("TXSSQCXL_WRZLSS_BFS <=", value, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsIn(List<Double> values) {
            addCriterion("TXSSQCXL_WRZLSS_BFS in", values, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsNotIn(List<Double> values) {
            addCriterion("TXSSQCXL_WRZLSS_BFS not in", values, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsBetween(Double value1, Double value2) {
            addCriterion("TXSSQCXL_WRZLSS_BFS between", value1, value2, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssqcxlWrzlssBfsNotBetween(Double value1, Double value2) {
            addCriterion("TXSSQCXL_WRZLSS_BFS not between", value1, value2, "txssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSIsNull() {
            addCriterion("TXSSYXSJ_WRZLSS_S is null");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSIsNotNull() {
            addCriterion("TXSSYXSJ_WRZLSS_S is not null");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSEqualTo(Integer value) {
            addCriterion("TXSSYXSJ_WRZLSS_S =", value, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSNotEqualTo(Integer value) {
            addCriterion("TXSSYXSJ_WRZLSS_S <>", value, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSGreaterThan(Integer value) {
            addCriterion("TXSSYXSJ_WRZLSS_S >", value, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSGreaterThanOrEqualTo(Integer value) {
            addCriterion("TXSSYXSJ_WRZLSS_S >=", value, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSLessThan(Integer value) {
            addCriterion("TXSSYXSJ_WRZLSS_S <", value, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSLessThanOrEqualTo(Integer value) {
            addCriterion("TXSSYXSJ_WRZLSS_S <=", value, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSIn(List<Integer> values) {
            addCriterion("TXSSYXSJ_WRZLSS_S in", values, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSNotIn(List<Integer> values) {
            addCriterion("TXSSYXSJ_WRZLSS_S not in", values, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSBetween(Integer value1, Integer value2) {
            addCriterion("TXSSYXSJ_WRZLSS_S between", value1, value2, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTxssyxsjWrzlssSNotBetween(Integer value1, Integer value2) {
            addCriterion("TXSSYXSJ_WRZLSS_S not between", value1, value2, "txssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssIsNull() {
            addCriterion("CCGYDM_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssIsNotNull() {
            addCriterion("CCGYDM_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssEqualTo(String value) {
            addCriterion("CCGYDM_WRZLSS =", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssNotEqualTo(String value) {
            addCriterion("CCGYDM_WRZLSS <>", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssGreaterThan(String value) {
            addCriterion("CCGYDM_WRZLSS >", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("CCGYDM_WRZLSS >=", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssLessThan(String value) {
            addCriterion("CCGYDM_WRZLSS <", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssLessThanOrEqualTo(String value) {
            addCriterion("CCGYDM_WRZLSS <=", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssLike(String value) {
            addCriterion("CCGYDM_WRZLSS like", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssNotLike(String value) {
            addCriterion("CCGYDM_WRZLSS not like", value, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssIn(List<String> values) {
            addCriterion("CCGYDM_WRZLSS in", values, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssNotIn(List<String> values) {
            addCriterion("CCGYDM_WRZLSS not in", values, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssBetween(String value1, String value2) {
            addCriterion("CCGYDM_WRZLSS between", value1, value2, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgydmWrzlssNotBetween(String value1, String value2) {
            addCriterion("CCGYDM_WRZLSS not between", value1, value2, "ccgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssIsNull() {
            addCriterion("CCGYMC_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssIsNotNull() {
            addCriterion("CCGYMC_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssEqualTo(String value) {
            addCriterion("CCGYMC_WRZLSS =", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssNotEqualTo(String value) {
            addCriterion("CCGYMC_WRZLSS <>", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssGreaterThan(String value) {
            addCriterion("CCGYMC_WRZLSS >", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("CCGYMC_WRZLSS >=", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssLessThan(String value) {
            addCriterion("CCGYMC_WRZLSS <", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssLessThanOrEqualTo(String value) {
            addCriterion("CCGYMC_WRZLSS <=", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssLike(String value) {
            addCriterion("CCGYMC_WRZLSS like", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssNotLike(String value) {
            addCriterion("CCGYMC_WRZLSS not like", value, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssIn(List<String> values) {
            addCriterion("CCGYMC_WRZLSS in", values, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssNotIn(List<String> values) {
            addCriterion("CCGYMC_WRZLSS not in", values, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssBetween(String value1, String value2) {
            addCriterion("CCGYMC_WRZLSS between", value1, value2, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcgymcWrzlssNotBetween(String value1, String value2) {
            addCriterion("CCGYMC_WRZLSS not between", value1, value2, "ccgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsIsNull() {
            addCriterion("CCSSQCXL_WRZLSS_BFS is null");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsIsNotNull() {
            addCriterion("CCSSQCXL_WRZLSS_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsEqualTo(Double value) {
            addCriterion("CCSSQCXL_WRZLSS_BFS =", value, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsNotEqualTo(Double value) {
            addCriterion("CCSSQCXL_WRZLSS_BFS <>", value, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsGreaterThan(Double value) {
            addCriterion("CCSSQCXL_WRZLSS_BFS >", value, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("CCSSQCXL_WRZLSS_BFS >=", value, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsLessThan(Double value) {
            addCriterion("CCSSQCXL_WRZLSS_BFS <", value, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsLessThanOrEqualTo(Double value) {
            addCriterion("CCSSQCXL_WRZLSS_BFS <=", value, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsIn(List<Double> values) {
            addCriterion("CCSSQCXL_WRZLSS_BFS in", values, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsNotIn(List<Double> values) {
            addCriterion("CCSSQCXL_WRZLSS_BFS not in", values, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsBetween(Double value1, Double value2) {
            addCriterion("CCSSQCXL_WRZLSS_BFS between", value1, value2, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssqcxlWrzlssBfsNotBetween(Double value1, Double value2) {
            addCriterion("CCSSQCXL_WRZLSS_BFS not between", value1, value2, "ccssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSIsNull() {
            addCriterion("CCSSYXSJ_WRZLSS_S is null");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSIsNotNull() {
            addCriterion("CCSSYXSJ_WRZLSS_S is not null");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSEqualTo(Double value) {
            addCriterion("CCSSYXSJ_WRZLSS_S =", value, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSNotEqualTo(Double value) {
            addCriterion("CCSSYXSJ_WRZLSS_S <>", value, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSGreaterThan(Double value) {
            addCriterion("CCSSYXSJ_WRZLSS_S >", value, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSGreaterThanOrEqualTo(Double value) {
            addCriterion("CCSSYXSJ_WRZLSS_S >=", value, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSLessThan(Double value) {
            addCriterion("CCSSYXSJ_WRZLSS_S <", value, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSLessThanOrEqualTo(Double value) {
            addCriterion("CCSSYXSJ_WRZLSS_S <=", value, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSIn(List<Double> values) {
            addCriterion("CCSSYXSJ_WRZLSS_S in", values, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSNotIn(List<Double> values) {
            addCriterion("CCSSYXSJ_WRZLSS_S not in", values, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSBetween(Double value1, Double value2) {
            addCriterion("CCSSYXSJ_WRZLSS_S between", value1, value2, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andCcssyxsjWrzlssSNotBetween(Double value1, Double value2) {
            addCriterion("CCSSYXSJ_WRZLSS_S not between", value1, value2, "ccssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssIsNull() {
            addCriterion("TVOCSGYDM_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssIsNotNull() {
            addCriterion("TVOCSGYDM_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssEqualTo(String value) {
            addCriterion("TVOCSGYDM_WRZLSS =", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssNotEqualTo(String value) {
            addCriterion("TVOCSGYDM_WRZLSS <>", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssGreaterThan(String value) {
            addCriterion("TVOCSGYDM_WRZLSS >", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("TVOCSGYDM_WRZLSS >=", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssLessThan(String value) {
            addCriterion("TVOCSGYDM_WRZLSS <", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssLessThanOrEqualTo(String value) {
            addCriterion("TVOCSGYDM_WRZLSS <=", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssLike(String value) {
            addCriterion("TVOCSGYDM_WRZLSS like", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssNotLike(String value) {
            addCriterion("TVOCSGYDM_WRZLSS not like", value, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssIn(List<String> values) {
            addCriterion("TVOCSGYDM_WRZLSS in", values, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssNotIn(List<String> values) {
            addCriterion("TVOCSGYDM_WRZLSS not in", values, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssBetween(String value1, String value2) {
            addCriterion("TVOCSGYDM_WRZLSS between", value1, value2, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgydmWrzlssNotBetween(String value1, String value2) {
            addCriterion("TVOCSGYDM_WRZLSS not between", value1, value2, "tvocsgydmWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssIsNull() {
            addCriterion("TVOCSGYMC_WRZLSS is null");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssIsNotNull() {
            addCriterion("TVOCSGYMC_WRZLSS is not null");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssEqualTo(String value) {
            addCriterion("TVOCSGYMC_WRZLSS =", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssNotEqualTo(String value) {
            addCriterion("TVOCSGYMC_WRZLSS <>", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssGreaterThan(String value) {
            addCriterion("TVOCSGYMC_WRZLSS >", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssGreaterThanOrEqualTo(String value) {
            addCriterion("TVOCSGYMC_WRZLSS >=", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssLessThan(String value) {
            addCriterion("TVOCSGYMC_WRZLSS <", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssLessThanOrEqualTo(String value) {
            addCriterion("TVOCSGYMC_WRZLSS <=", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssLike(String value) {
            addCriterion("TVOCSGYMC_WRZLSS like", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssNotLike(String value) {
            addCriterion("TVOCSGYMC_WRZLSS not like", value, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssIn(List<String> values) {
            addCriterion("TVOCSGYMC_WRZLSS in", values, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssNotIn(List<String> values) {
            addCriterion("TVOCSGYMC_WRZLSS not in", values, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssBetween(String value1, String value2) {
            addCriterion("TVOCSGYMC_WRZLSS between", value1, value2, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsgymcWrzlssNotBetween(String value1, String value2) {
            addCriterion("TVOCSGYMC_WRZLSS not between", value1, value2, "tvocsgymcWrzlss");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsIsNull() {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS is null");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsIsNotNull() {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS is not null");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsEqualTo(Double value) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS =", value, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsNotEqualTo(Double value) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS <>", value, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsGreaterThan(Double value) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS >", value, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsGreaterThanOrEqualTo(Double value) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS >=", value, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsLessThan(Double value) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS <", value, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsLessThanOrEqualTo(Double value) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS <=", value, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsIn(List<Double> values) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS in", values, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsNotIn(List<Double> values) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS not in", values, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsBetween(Double value1, Double value2) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS between", value1, value2, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssqcxlWrzlssBfsNotBetween(Double value1, Double value2) {
            addCriterion("TVOCSSSQCXL_WRZLSS_BFS not between", value1, value2, "tvocsssqcxlWrzlssBfs");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSIsNull() {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S is null");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSIsNotNull() {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S is not null");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSEqualTo(Double value) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S =", value, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSNotEqualTo(Double value) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S <>", value, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSGreaterThan(Double value) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S >", value, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSGreaterThanOrEqualTo(Double value) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S >=", value, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSLessThan(Double value) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S <", value, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSLessThanOrEqualTo(Double value) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S <=", value, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSIn(List<Double> values) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S in", values, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSNotIn(List<Double> values) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S not in", values, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSBetween(Double value1, Double value2) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S between", value1, value2, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andTvocsssyxsjWrzlssSNotBetween(Double value1, Double value2) {
            addCriterion("TVOCSSSYXSJ_WRZLSS_S not between", value1, value2, "tvocsssyxsjWrzlssS");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDIsNull() {
            addCriterion("YBGYGTFWCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDIsNotNull() {
            addCriterion("YBGYGTFWCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDEqualTo(Double value) {
            addCriterion("YBGYGTFWCSL_D =", value, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDNotEqualTo(Double value) {
            addCriterion("YBGYGTFWCSL_D <>", value, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDGreaterThan(Double value) {
            addCriterion("YBGYGTFWCSL_D >", value, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWCSL_D >=", value, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDLessThan(Double value) {
            addCriterion("YBGYGTFWCSL_D <", value, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDLessThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWCSL_D <=", value, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDIn(List<Double> values) {
            addCriterion("YBGYGTFWCSL_D in", values, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDNotIn(List<Double> values) {
            addCriterion("YBGYGTFWCSL_D not in", values, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWCSL_D between", value1, value2, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwcslDNotBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWCSL_D not between", value1, value2, "ybgygtfwcslD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDIsNull() {
            addCriterion("YBGYGTFWLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDIsNotNull() {
            addCriterion("YBGYGTFWLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDEqualTo(Double value) {
            addCriterion("YBGYGTFWLYL_D =", value, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDNotEqualTo(Double value) {
            addCriterion("YBGYGTFWLYL_D <>", value, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDGreaterThan(Double value) {
            addCriterion("YBGYGTFWLYL_D >", value, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDGreaterThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWLYL_D >=", value, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDLessThan(Double value) {
            addCriterion("YBGYGTFWLYL_D <", value, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDLessThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWLYL_D <=", value, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDIn(List<Double> values) {
            addCriterion("YBGYGTFWLYL_D in", values, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDNotIn(List<Double> values) {
            addCriterion("YBGYGTFWLYL_D not in", values, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWLYL_D between", value1, value2, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwlylDNotBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWLYL_D not between", value1, value2, "ybgygtfwlylD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDIsNull() {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDIsNotNull() {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D =", value, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDNotEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D <>", value, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDGreaterThan(Double value) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D >", value, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D >=", value, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDLessThan(Double value) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D <", value, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D <=", value, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDIn(List<Double> values) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D in", values, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDNotIn(List<Double> values) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D not in", values, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDBetween(Double value1, Double value2) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D between", value1, value2, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtZhlywnzclDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_YBGYGT_ZHLYWNZCL_D not between", value1, value2, "qzYbgygtZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDIsNull() {
            addCriterion("YBGYGTFWCZL_D is null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDIsNotNull() {
            addCriterion("YBGYGTFWCZL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDEqualTo(Double value) {
            addCriterion("YBGYGTFWCZL_D =", value, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDNotEqualTo(Double value) {
            addCriterion("YBGYGTFWCZL_D <>", value, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDGreaterThan(Double value) {
            addCriterion("YBGYGTFWCZL_D >", value, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDGreaterThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWCZL_D >=", value, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDLessThan(Double value) {
            addCriterion("YBGYGTFWCZL_D <", value, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDLessThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWCZL_D <=", value, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDIn(List<Double> values) {
            addCriterion("YBGYGTFWCZL_D in", values, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDNotIn(List<Double> values) {
            addCriterion("YBGYGTFWCZL_D not in", values, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWCZL_D between", value1, value2, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwczlDNotBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWCZL_D not between", value1, value2, "ybgygtfwczlD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDIsNull() {
            addCriterion("QZ_YBGYGT_CZWNZCL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDIsNotNull() {
            addCriterion("QZ_YBGYGT_CZWNZCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D =", value, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDNotEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D <>", value, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDGreaterThan(Double value) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D >", value, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D >=", value, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDLessThan(Double value) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D <", value, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D <=", value, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDIn(List<Double> values) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D in", values, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDNotIn(List<Double> values) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D not in", values, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDBetween(Double value1, Double value2) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D between", value1, value2, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzYbgygtCzwnzclDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_YBGYGT_CZWNZCL_D not between", value1, value2, "qzYbgygtCzwnzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDIsNull() {
            addCriterion("YBGYGTFWZCL_D is null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDIsNotNull() {
            addCriterion("YBGYGTFWZCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDEqualTo(Double value) {
            addCriterion("YBGYGTFWZCL_D =", value, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDNotEqualTo(Double value) {
            addCriterion("YBGYGTFWZCL_D <>", value, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDGreaterThan(Double value) {
            addCriterion("YBGYGTFWZCL_D >", value, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDGreaterThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWZCL_D >=", value, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDLessThan(Double value) {
            addCriterion("YBGYGTFWZCL_D <", value, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDLessThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWZCL_D <=", value, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDIn(List<Double> values) {
            addCriterion("YBGYGTFWZCL_D in", values, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDNotIn(List<Double> values) {
            addCriterion("YBGYGTFWZCL_D not in", values, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWZCL_D between", value1, value2, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwzclDNotBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWZCL_D not between", value1, value2, "ybgygtfwzclD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDIsNull() {
            addCriterion("YBGYGTFWDQL_D is null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDIsNotNull() {
            addCriterion("YBGYGTFWDQL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDEqualTo(Double value) {
            addCriterion("YBGYGTFWDQL_D =", value, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDNotEqualTo(Double value) {
            addCriterion("YBGYGTFWDQL_D <>", value, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDGreaterThan(Double value) {
            addCriterion("YBGYGTFWDQL_D >", value, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDGreaterThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWDQL_D >=", value, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDLessThan(Double value) {
            addCriterion("YBGYGTFWDQL_D <", value, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDLessThanOrEqualTo(Double value) {
            addCriterion("YBGYGTFWDQL_D <=", value, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDIn(List<Double> values) {
            addCriterion("YBGYGTFWDQL_D in", values, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDNotIn(List<Double> values) {
            addCriterion("YBGYGTFWDQL_D not in", values, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWDQL_D between", value1, value2, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andYbgygtfwdqlDNotBetween(Double value1, Double value2) {
            addCriterion("YBGYGTFWDQL_D not between", value1, value2, "ybgygtfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDIsNull() {
            addCriterion("WXFWCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDIsNotNull() {
            addCriterion("WXFWCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDEqualTo(Double value) {
            addCriterion("WXFWCSL_D =", value, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDNotEqualTo(Double value) {
            addCriterion("WXFWCSL_D <>", value, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDGreaterThan(Double value) {
            addCriterion("WXFWCSL_D >", value, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDGreaterThanOrEqualTo(Double value) {
            addCriterion("WXFWCSL_D >=", value, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDLessThan(Double value) {
            addCriterion("WXFWCSL_D <", value, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDLessThanOrEqualTo(Double value) {
            addCriterion("WXFWCSL_D <=", value, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDIn(List<Double> values) {
            addCriterion("WXFWCSL_D in", values, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDNotIn(List<Double> values) {
            addCriterion("WXFWCSL_D not in", values, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDBetween(Double value1, Double value2) {
            addCriterion("WXFWCSL_D between", value1, value2, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwcslDNotBetween(Double value1, Double value2) {
            addCriterion("WXFWCSL_D not between", value1, value2, "wxfwcslD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDIsNull() {
            addCriterion("WXFWZHLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDIsNotNull() {
            addCriterion("WXFWZHLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDEqualTo(Double value) {
            addCriterion("WXFWZHLYL_D =", value, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDNotEqualTo(Double value) {
            addCriterion("WXFWZHLYL_D <>", value, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDGreaterThan(Double value) {
            addCriterion("WXFWZHLYL_D >", value, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDGreaterThanOrEqualTo(Double value) {
            addCriterion("WXFWZHLYL_D >=", value, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDLessThan(Double value) {
            addCriterion("WXFWZHLYL_D <", value, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDLessThanOrEqualTo(Double value) {
            addCriterion("WXFWZHLYL_D <=", value, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDIn(List<Double> values) {
            addCriterion("WXFWZHLYL_D in", values, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDNotIn(List<Double> values) {
            addCriterion("WXFWZHLYL_D not in", values, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDBetween(Double value1, Double value2) {
            addCriterion("WXFWZHLYL_D between", value1, value2, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwzhlylDNotBetween(Double value1, Double value2) {
            addCriterion("WXFWZHLYL_D not between", value1, value2, "wxfwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDIsNull() {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDIsNotNull() {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDEqualTo(Double value) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D =", value, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDNotEqualTo(Double value) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D <>", value, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDGreaterThan(Double value) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D >", value, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D >=", value, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDLessThan(Double value) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D <", value, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D <=", value, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDIn(List<Double> values) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D in", values, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDNotIn(List<Double> values) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D not in", values, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D between", value1, value2, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwZhlywnzclDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_ZHLYWNZCL_D not between", value1, value2, "qzWxfwZhlywnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDIsNull() {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDIsNotNull() {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D =", value, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDNotEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D <>", value, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDGreaterThan(Double value) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D >", value, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D >=", value, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDLessThan(Double value) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D <", value, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D <=", value, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDIn(List<Double> values) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D in", values, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDNotIn(List<Double> values) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D not in", values, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D between", value1, value2, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwzhlylDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_SCZDWZHLYL_D not between", value1, value2, "qzWxfwSczdwzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDIsNull() {
            addCriterion("WXFWCLL_D is null");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDIsNotNull() {
            addCriterion("WXFWCLL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDEqualTo(Double value) {
            addCriterion("WXFWCLL_D =", value, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDNotEqualTo(Double value) {
            addCriterion("WXFWCLL_D <>", value, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDGreaterThan(Double value) {
            addCriterion("WXFWCLL_D >", value, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDGreaterThanOrEqualTo(Double value) {
            addCriterion("WXFWCLL_D >=", value, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDLessThan(Double value) {
            addCriterion("WXFWCLL_D <", value, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDLessThanOrEqualTo(Double value) {
            addCriterion("WXFWCLL_D <=", value, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDIn(List<Double> values) {
            addCriterion("WXFWCLL_D in", values, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDNotIn(List<Double> values) {
            addCriterion("WXFWCLL_D not in", values, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDBetween(Double value1, Double value2) {
            addCriterion("WXFWCLL_D between", value1, value2, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwcllDNotBetween(Double value1, Double value2) {
            addCriterion("WXFWCLL_D not between", value1, value2, "wxfwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDIsNull() {
            addCriterion("QZ_WXFW_CLWNZCL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDIsNotNull() {
            addCriterion("QZ_WXFW_CLWNZCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDEqualTo(Double value) {
            addCriterion("QZ_WXFW_CLWNZCL_D =", value, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDNotEqualTo(Double value) {
            addCriterion("QZ_WXFW_CLWNZCL_D <>", value, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDGreaterThan(Double value) {
            addCriterion("QZ_WXFW_CLWNZCL_D >", value, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_CLWNZCL_D >=", value, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDLessThan(Double value) {
            addCriterion("QZ_WXFW_CLWNZCL_D <", value, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_CLWNZCL_D <=", value, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDIn(List<Double> values) {
            addCriterion("QZ_WXFW_CLWNZCL_D in", values, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDNotIn(List<Double> values) {
            addCriterion("QZ_WXFW_CLWNZCL_D not in", values, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_CLWNZCL_D between", value1, value2, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwClwnzclDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_CLWNZCL_D not between", value1, value2, "qzWxfwClwnzclD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDIsNull() {
            addCriterion("QZ_WXFW_SCZDWCLL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDIsNotNull() {
            addCriterion("QZ_WXFW_SCZDWCLL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWCLL_D =", value, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDNotEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWCLL_D <>", value, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDGreaterThan(Double value) {
            addCriterion("QZ_WXFW_SCZDWCLL_D >", value, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWCLL_D >=", value, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDLessThan(Double value) {
            addCriterion("QZ_WXFW_SCZDWCLL_D <", value, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_WXFW_SCZDWCLL_D <=", value, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDIn(List<Double> values) {
            addCriterion("QZ_WXFW_SCZDWCLL_D in", values, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDNotIn(List<Double> values) {
            addCriterion("QZ_WXFW_SCZDWCLL_D not in", values, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_SCZDWCLL_D between", value1, value2, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andQzWxfwSczdwcllDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_WXFW_SCZDWCLL_D not between", value1, value2, "qzWxfwSczdwcllD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDIsNull() {
            addCriterion("WXFWZCL_D is null");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDIsNotNull() {
            addCriterion("WXFWZCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDEqualTo(Double value) {
            addCriterion("WXFWZCL_D =", value, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDNotEqualTo(Double value) {
            addCriterion("WXFWZCL_D <>", value, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDGreaterThan(Double value) {
            addCriterion("WXFWZCL_D >", value, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDGreaterThanOrEqualTo(Double value) {
            addCriterion("WXFWZCL_D >=", value, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDLessThan(Double value) {
            addCriterion("WXFWZCL_D <", value, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDLessThanOrEqualTo(Double value) {
            addCriterion("WXFWZCL_D <=", value, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDIn(List<Double> values) {
            addCriterion("WXFWZCL_D in", values, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDNotIn(List<Double> values) {
            addCriterion("WXFWZCL_D not in", values, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDBetween(Double value1, Double value2) {
            addCriterion("WXFWZCL_D between", value1, value2, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwzclDNotBetween(Double value1, Double value2) {
            addCriterion("WXFWZCL_D not between", value1, value2, "wxfwzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDIsNull() {
            addCriterion("WXFWLJZCL_D is null");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDIsNotNull() {
            addCriterion("WXFWLJZCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDEqualTo(Double value) {
            addCriterion("WXFWLJZCL_D =", value, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDNotEqualTo(Double value) {
            addCriterion("WXFWLJZCL_D <>", value, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDGreaterThan(Double value) {
            addCriterion("WXFWLJZCL_D >", value, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDGreaterThanOrEqualTo(Double value) {
            addCriterion("WXFWLJZCL_D >=", value, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDLessThan(Double value) {
            addCriterion("WXFWLJZCL_D <", value, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDLessThanOrEqualTo(Double value) {
            addCriterion("WXFWLJZCL_D <=", value, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDIn(List<Double> values) {
            addCriterion("WXFWLJZCL_D in", values, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDNotIn(List<Double> values) {
            addCriterion("WXFWLJZCL_D not in", values, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDBetween(Double value1, Double value2) {
            addCriterion("WXFWLJZCL_D between", value1, value2, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwljzclDNotBetween(Double value1, Double value2) {
            addCriterion("WXFWLJZCL_D not between", value1, value2, "wxfwljzclD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDIsNull() {
            addCriterion("WXFWDQL_D is null");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDIsNotNull() {
            addCriterion("WXFWDQL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDEqualTo(Double value) {
            addCriterion("WXFWDQL_D =", value, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDNotEqualTo(Double value) {
            addCriterion("WXFWDQL_D <>", value, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDGreaterThan(Double value) {
            addCriterion("WXFWDQL_D >", value, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDGreaterThanOrEqualTo(Double value) {
            addCriterion("WXFWDQL_D >=", value, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDLessThan(Double value) {
            addCriterion("WXFWDQL_D <", value, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDLessThanOrEqualTo(Double value) {
            addCriterion("WXFWDQL_D <=", value, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDIn(List<Double> values) {
            addCriterion("WXFWDQL_D in", values, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDNotIn(List<Double> values) {
            addCriterion("WXFWDQL_D not in", values, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDBetween(Double value1, Double value2) {
            addCriterion("WXFWDQL_D between", value1, value2, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwdqlDNotBetween(Double value1, Double value2) {
            addCriterion("WXFWDQL_D not between", value1, value2, "wxfwdqlD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDIsNull() {
            addCriterion("WXFWNBNZHLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDIsNotNull() {
            addCriterion("WXFWNBNZHLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDEqualTo(Double value) {
            addCriterion("WXFWNBNZHLYL_D =", value, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDNotEqualTo(Double value) {
            addCriterion("WXFWNBNZHLYL_D <>", value, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDGreaterThan(Double value) {
            addCriterion("WXFWNBNZHLYL_D >", value, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDGreaterThanOrEqualTo(Double value) {
            addCriterion("WXFWNBNZHLYL_D >=", value, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDLessThan(Double value) {
            addCriterion("WXFWNBNZHLYL_D <", value, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDLessThanOrEqualTo(Double value) {
            addCriterion("WXFWNBNZHLYL_D <=", value, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDIn(List<Double> values) {
            addCriterion("WXFWNBNZHLYL_D in", values, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDNotIn(List<Double> values) {
            addCriterion("WXFWNBNZHLYL_D not in", values, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDBetween(Double value1, Double value2) {
            addCriterion("WXFWNBNZHLYL_D between", value1, value2, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andWxfwnbnzhlylDNotBetween(Double value1, Double value2) {
            addCriterion("WXFWNBNZHLYL_D not between", value1, value2, "wxfwnbnzhlylD");
            return (Criteria) this;
        }

        public Criteria andFsbhIsNull() {
            addCriterion("FSBH is null");
            return (Criteria) this;
        }

        public Criteria andFsbhIsNotNull() {
            addCriterion("FSBH is not null");
            return (Criteria) this;
        }

        public Criteria andFsbhEqualTo(String value) {
            addCriterion("FSBH =", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhNotEqualTo(String value) {
            addCriterion("FSBH <>", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhGreaterThan(String value) {
            addCriterion("FSBH >", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhGreaterThanOrEqualTo(String value) {
            addCriterion("FSBH >=", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhLessThan(String value) {
            addCriterion("FSBH <", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhLessThanOrEqualTo(String value) {
            addCriterion("FSBH <=", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhLike(String value) {
            addCriterion("FSBH like", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhNotLike(String value) {
            addCriterion("FSBH not like", value, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhIn(List<String> values) {
            addCriterion("FSBH in", values, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhNotIn(List<String> values) {
            addCriterion("FSBH not in", values, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhBetween(String value1, String value2) {
            addCriterion("FSBH between", value1, value2, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFsbhNotBetween(String value1, String value2) {
            addCriterion("FSBH not between", value1, value2, "fsbh");
            return (Criteria) this;
        }

        public Criteria andFqbhIsNull() {
            addCriterion("FQBH is null");
            return (Criteria) this;
        }

        public Criteria andFqbhIsNotNull() {
            addCriterion("FQBH is not null");
            return (Criteria) this;
        }

        public Criteria andFqbhEqualTo(String value) {
            addCriterion("FQBH =", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhNotEqualTo(String value) {
            addCriterion("FQBH <>", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhGreaterThan(String value) {
            addCriterion("FQBH >", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhGreaterThanOrEqualTo(String value) {
            addCriterion("FQBH >=", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhLessThan(String value) {
            addCriterion("FQBH <", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhLessThanOrEqualTo(String value) {
            addCriterion("FQBH <=", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhLike(String value) {
            addCriterion("FQBH like", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhNotLike(String value) {
            addCriterion("FQBH not like", value, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhIn(List<String> values) {
            addCriterion("FQBH in", values, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhNotIn(List<String> values) {
            addCriterion("FQBH not in", values, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhBetween(String value1, String value2) {
            addCriterion("FQBH between", value1, value2, "fqbh");
            return (Criteria) this;
        }

        public Criteria andFqbhNotBetween(String value1, String value2) {
            addCriterion("FQBH not between", value1, value2, "fqbh");
            return (Criteria) this;
        }

        public Criteria andJytlcMIsNull() {
            addCriterion("JYTLC_M is null");
            return (Criteria) this;
        }

        public Criteria andJytlcMIsNotNull() {
            addCriterion("JYTLC_M is not null");
            return (Criteria) this;
        }

        public Criteria andJytlcMEqualTo(Double value) {
            addCriterion("JYTLC_M =", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMNotEqualTo(Double value) {
            addCriterion("JYTLC_M <>", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMGreaterThan(Double value) {
            addCriterion("JYTLC_M >", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMGreaterThanOrEqualTo(Double value) {
            addCriterion("JYTLC_M >=", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMLessThan(Double value) {
            addCriterion("JYTLC_M <", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMLessThanOrEqualTo(Double value) {
            addCriterion("JYTLC_M <=", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMIn(List<Double> values) {
            addCriterion("JYTLC_M in", values, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMNotIn(List<Double> values) {
            addCriterion("JYTLC_M not in", values, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMBetween(Double value1, Double value2) {
            addCriterion("JYTLC_M between", value1, value2, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMNotBetween(Double value1, Double value2) {
            addCriterion("JYTLC_M not between", value1, value2, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
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

        public Criteria andHtqyBl1IsNull() {
            addCriterion("htqy_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1IsNotNull() {
            addCriterion("htqy_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1EqualTo(String value) {
            addCriterion("htqy_bl1 =", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1NotEqualTo(String value) {
            addCriterion("htqy_bl1 <>", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1GreaterThan(String value) {
            addCriterion("htqy_bl1 >", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl1 >=", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1LessThan(String value) {
            addCriterion("htqy_bl1 <", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl1 <=", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1Like(String value) {
            addCriterion("htqy_bl1 like", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1NotLike(String value) {
            addCriterion("htqy_bl1 not like", value, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1In(List<String> values) {
            addCriterion("htqy_bl1 in", values, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1NotIn(List<String> values) {
            addCriterion("htqy_bl1 not in", values, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1Between(String value1, String value2) {
            addCriterion("htqy_bl1 between", value1, value2, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl1NotBetween(String value1, String value2) {
            addCriterion("htqy_bl1 not between", value1, value2, "htqyBl1");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2IsNull() {
            addCriterion("htqy_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2IsNotNull() {
            addCriterion("htqy_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2EqualTo(String value) {
            addCriterion("htqy_bl2 =", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2NotEqualTo(String value) {
            addCriterion("htqy_bl2 <>", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2GreaterThan(String value) {
            addCriterion("htqy_bl2 >", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl2 >=", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2LessThan(String value) {
            addCriterion("htqy_bl2 <", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl2 <=", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2Like(String value) {
            addCriterion("htqy_bl2 like", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2NotLike(String value) {
            addCriterion("htqy_bl2 not like", value, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2In(List<String> values) {
            addCriterion("htqy_bl2 in", values, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2NotIn(List<String> values) {
            addCriterion("htqy_bl2 not in", values, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2Between(String value1, String value2) {
            addCriterion("htqy_bl2 between", value1, value2, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl2NotBetween(String value1, String value2) {
            addCriterion("htqy_bl2 not between", value1, value2, "htqyBl2");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3IsNull() {
            addCriterion("htqy_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3IsNotNull() {
            addCriterion("htqy_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3EqualTo(String value) {
            addCriterion("htqy_bl3 =", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3NotEqualTo(String value) {
            addCriterion("htqy_bl3 <>", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3GreaterThan(String value) {
            addCriterion("htqy_bl3 >", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl3 >=", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3LessThan(String value) {
            addCriterion("htqy_bl3 <", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl3 <=", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3Like(String value) {
            addCriterion("htqy_bl3 like", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3NotLike(String value) {
            addCriterion("htqy_bl3 not like", value, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3In(List<String> values) {
            addCriterion("htqy_bl3 in", values, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3NotIn(List<String> values) {
            addCriterion("htqy_bl3 not in", values, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3Between(String value1, String value2) {
            addCriterion("htqy_bl3 between", value1, value2, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl3NotBetween(String value1, String value2) {
            addCriterion("htqy_bl3 not between", value1, value2, "htqyBl3");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4IsNull() {
            addCriterion("htqy_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4IsNotNull() {
            addCriterion("htqy_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4EqualTo(String value) {
            addCriterion("htqy_bl4 =", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4NotEqualTo(String value) {
            addCriterion("htqy_bl4 <>", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4GreaterThan(String value) {
            addCriterion("htqy_bl4 >", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl4 >=", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4LessThan(String value) {
            addCriterion("htqy_bl4 <", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl4 <=", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4Like(String value) {
            addCriterion("htqy_bl4 like", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4NotLike(String value) {
            addCriterion("htqy_bl4 not like", value, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4In(List<String> values) {
            addCriterion("htqy_bl4 in", values, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4NotIn(List<String> values) {
            addCriterion("htqy_bl4 not in", values, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4Between(String value1, String value2) {
            addCriterion("htqy_bl4 between", value1, value2, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl4NotBetween(String value1, String value2) {
            addCriterion("htqy_bl4 not between", value1, value2, "htqyBl4");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5IsNull() {
            addCriterion("htqy_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5IsNotNull() {
            addCriterion("htqy_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5EqualTo(String value) {
            addCriterion("htqy_bl5 =", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5NotEqualTo(String value) {
            addCriterion("htqy_bl5 <>", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5GreaterThan(String value) {
            addCriterion("htqy_bl5 >", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl5 >=", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5LessThan(String value) {
            addCriterion("htqy_bl5 <", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl5 <=", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5Like(String value) {
            addCriterion("htqy_bl5 like", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5NotLike(String value) {
            addCriterion("htqy_bl5 not like", value, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5In(List<String> values) {
            addCriterion("htqy_bl5 in", values, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5NotIn(List<String> values) {
            addCriterion("htqy_bl5 not in", values, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5Between(String value1, String value2) {
            addCriterion("htqy_bl5 between", value1, value2, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl5NotBetween(String value1, String value2) {
            addCriterion("htqy_bl5 not between", value1, value2, "htqyBl5");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6IsNull() {
            addCriterion("htqy_bl6 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6IsNotNull() {
            addCriterion("htqy_bl6 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6EqualTo(String value) {
            addCriterion("htqy_bl6 =", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6NotEqualTo(String value) {
            addCriterion("htqy_bl6 <>", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6GreaterThan(String value) {
            addCriterion("htqy_bl6 >", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl6 >=", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6LessThan(String value) {
            addCriterion("htqy_bl6 <", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl6 <=", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6Like(String value) {
            addCriterion("htqy_bl6 like", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6NotLike(String value) {
            addCriterion("htqy_bl6 not like", value, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6In(List<String> values) {
            addCriterion("htqy_bl6 in", values, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6NotIn(List<String> values) {
            addCriterion("htqy_bl6 not in", values, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6Between(String value1, String value2) {
            addCriterion("htqy_bl6 between", value1, value2, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl6NotBetween(String value1, String value2) {
            addCriterion("htqy_bl6 not between", value1, value2, "htqyBl6");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7IsNull() {
            addCriterion("htqy_bl7 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7IsNotNull() {
            addCriterion("htqy_bl7 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7EqualTo(String value) {
            addCriterion("htqy_bl7 =", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7NotEqualTo(String value) {
            addCriterion("htqy_bl7 <>", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7GreaterThan(String value) {
            addCriterion("htqy_bl7 >", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl7 >=", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7LessThan(String value) {
            addCriterion("htqy_bl7 <", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl7 <=", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7Like(String value) {
            addCriterion("htqy_bl7 like", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7NotLike(String value) {
            addCriterion("htqy_bl7 not like", value, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7In(List<String> values) {
            addCriterion("htqy_bl7 in", values, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7NotIn(List<String> values) {
            addCriterion("htqy_bl7 not in", values, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7Between(String value1, String value2) {
            addCriterion("htqy_bl7 between", value1, value2, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl7NotBetween(String value1, String value2) {
            addCriterion("htqy_bl7 not between", value1, value2, "htqyBl7");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8IsNull() {
            addCriterion("htqy_bl8 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8IsNotNull() {
            addCriterion("htqy_bl8 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8EqualTo(String value) {
            addCriterion("htqy_bl8 =", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8NotEqualTo(String value) {
            addCriterion("htqy_bl8 <>", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8GreaterThan(String value) {
            addCriterion("htqy_bl8 >", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl8 >=", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8LessThan(String value) {
            addCriterion("htqy_bl8 <", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl8 <=", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8Like(String value) {
            addCriterion("htqy_bl8 like", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8NotLike(String value) {
            addCriterion("htqy_bl8 not like", value, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8In(List<String> values) {
            addCriterion("htqy_bl8 in", values, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8NotIn(List<String> values) {
            addCriterion("htqy_bl8 not in", values, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8Between(String value1, String value2) {
            addCriterion("htqy_bl8 between", value1, value2, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl8NotBetween(String value1, String value2) {
            addCriterion("htqy_bl8 not between", value1, value2, "htqyBl8");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9IsNull() {
            addCriterion("htqy_bl9 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9IsNotNull() {
            addCriterion("htqy_bl9 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9EqualTo(String value) {
            addCriterion("htqy_bl9 =", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9NotEqualTo(String value) {
            addCriterion("htqy_bl9 <>", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9GreaterThan(String value) {
            addCriterion("htqy_bl9 >", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl9 >=", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9LessThan(String value) {
            addCriterion("htqy_bl9 <", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl9 <=", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9Like(String value) {
            addCriterion("htqy_bl9 like", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9NotLike(String value) {
            addCriterion("htqy_bl9 not like", value, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9In(List<String> values) {
            addCriterion("htqy_bl9 in", values, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9NotIn(List<String> values) {
            addCriterion("htqy_bl9 not in", values, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9Between(String value1, String value2) {
            addCriterion("htqy_bl9 between", value1, value2, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl9NotBetween(String value1, String value2) {
            addCriterion("htqy_bl9 not between", value1, value2, "htqyBl9");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10IsNull() {
            addCriterion("htqy_bl10 is null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10IsNotNull() {
            addCriterion("htqy_bl10 is not null");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10EqualTo(String value) {
            addCriterion("htqy_bl10 =", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10NotEqualTo(String value) {
            addCriterion("htqy_bl10 <>", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10GreaterThan(String value) {
            addCriterion("htqy_bl10 >", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10GreaterThanOrEqualTo(String value) {
            addCriterion("htqy_bl10 >=", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10LessThan(String value) {
            addCriterion("htqy_bl10 <", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10LessThanOrEqualTo(String value) {
            addCriterion("htqy_bl10 <=", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10Like(String value) {
            addCriterion("htqy_bl10 like", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10NotLike(String value) {
            addCriterion("htqy_bl10 not like", value, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10In(List<String> values) {
            addCriterion("htqy_bl10 in", values, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10NotIn(List<String> values) {
            addCriterion("htqy_bl10 not in", values, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10Between(String value1, String value2) {
            addCriterion("htqy_bl10 between", value1, value2, "htqyBl10");
            return (Criteria) this;
        }

        public Criteria andHtqyBl10NotBetween(String value1, String value2) {
            addCriterion("htqy_bl10 not between", value1, value2, "htqyBl10");
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