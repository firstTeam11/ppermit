package com.eliteams.quick4j.web.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class KzdmJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KzdmJbxxExample() {
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

        public Criteria andKzdmBhIsNull() {
            addCriterion("kzdm_bh is null");
            return (Criteria) this;
        }

        public Criteria andKzdmBhIsNotNull() {
            addCriterion("kzdm_bh is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmBhEqualTo(String value) {
            addCriterion("kzdm_bh =", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhNotEqualTo(String value) {
            addCriterion("kzdm_bh <>", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhGreaterThan(String value) {
            addCriterion("kzdm_bh >", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_bh >=", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhLessThan(String value) {
            addCriterion("kzdm_bh <", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhLessThanOrEqualTo(String value) {
            addCriterion("kzdm_bh <=", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhLike(String value) {
            addCriterion("kzdm_bh like", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhNotLike(String value) {
            addCriterion("kzdm_bh not like", value, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhIn(List<String> values) {
            addCriterion("kzdm_bh in", values, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhNotIn(List<String> values) {
            addCriterion("kzdm_bh not in", values, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhBetween(String value1, String value2) {
            addCriterion("kzdm_bh between", value1, value2, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmBhNotBetween(String value1, String value2) {
            addCriterion("kzdm_bh not between", value1, value2, "kzdmBh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhIsNull() {
            addCriterion("kzdm_dybh is null");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhIsNotNull() {
            addCriterion("kzdm_dybh is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhEqualTo(String value) {
            addCriterion("kzdm_dybh =", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhNotEqualTo(String value) {
            addCriterion("kzdm_dybh <>", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhGreaterThan(String value) {
            addCriterion("kzdm_dybh >", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_dybh >=", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhLessThan(String value) {
            addCriterion("kzdm_dybh <", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhLessThanOrEqualTo(String value) {
            addCriterion("kzdm_dybh <=", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhLike(String value) {
            addCriterion("kzdm_dybh like", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhNotLike(String value) {
            addCriterion("kzdm_dybh not like", value, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhIn(List<String> values) {
            addCriterion("kzdm_dybh in", values, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhNotIn(List<String> values) {
            addCriterion("kzdm_dybh not in", values, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhBetween(String value1, String value2) {
            addCriterion("kzdm_dybh between", value1, value2, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDybhNotBetween(String value1, String value2) {
            addCriterion("kzdm_dybh not between", value1, value2, "kzdmDybh");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcIsNull() {
            addCriterion("kzdm_dymc is null");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcIsNotNull() {
            addCriterion("kzdm_dymc is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcEqualTo(String value) {
            addCriterion("kzdm_dymc =", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcNotEqualTo(String value) {
            addCriterion("kzdm_dymc <>", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcGreaterThan(String value) {
            addCriterion("kzdm_dymc >", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_dymc >=", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcLessThan(String value) {
            addCriterion("kzdm_dymc <", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcLessThanOrEqualTo(String value) {
            addCriterion("kzdm_dymc <=", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcLike(String value) {
            addCriterion("kzdm_dymc like", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcNotLike(String value) {
            addCriterion("kzdm_dymc not like", value, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcIn(List<String> values) {
            addCriterion("kzdm_dymc in", values, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcNotIn(List<String> values) {
            addCriterion("kzdm_dymc not in", values, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcBetween(String value1, String value2) {
            addCriterion("kzdm_dymc between", value1, value2, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmDymcNotBetween(String value1, String value2) {
            addCriterion("kzdm_dymc not between", value1, value2, "kzdmDymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcIsNull() {
            addCriterion("kzdm_lymc is null");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcIsNotNull() {
            addCriterion("kzdm_lymc is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcEqualTo(String value) {
            addCriterion("kzdm_lymc =", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcNotEqualTo(String value) {
            addCriterion("kzdm_lymc <>", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcGreaterThan(String value) {
            addCriterion("kzdm_lymc >", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_lymc >=", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcLessThan(String value) {
            addCriterion("kzdm_lymc <", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcLessThanOrEqualTo(String value) {
            addCriterion("kzdm_lymc <=", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcLike(String value) {
            addCriterion("kzdm_lymc like", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcNotLike(String value) {
            addCriterion("kzdm_lymc not like", value, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcIn(List<String> values) {
            addCriterion("kzdm_lymc in", values, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcNotIn(List<String> values) {
            addCriterion("kzdm_lymc not in", values, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcBetween(String value1, String value2) {
            addCriterion("kzdm_lymc between", value1, value2, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmLymcNotBetween(String value1, String value2) {
            addCriterion("kzdm_lymc not between", value1, value2, "kzdmLymc");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlIsNull() {
            addCriterion("kzdm_szhl is null");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlIsNotNull() {
            addCriterion("kzdm_szhl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlEqualTo(String value) {
            addCriterion("kzdm_szhl =", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlNotEqualTo(String value) {
            addCriterion("kzdm_szhl <>", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlGreaterThan(String value) {
            addCriterion("kzdm_szhl >", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_szhl >=", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlLessThan(String value) {
            addCriterion("kzdm_szhl <", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlLessThanOrEqualTo(String value) {
            addCriterion("kzdm_szhl <=", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlLike(String value) {
            addCriterion("kzdm_szhl like", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlNotLike(String value) {
            addCriterion("kzdm_szhl not like", value, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlIn(List<String> values) {
            addCriterion("kzdm_szhl in", values, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlNotIn(List<String> values) {
            addCriterion("kzdm_szhl not in", values, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlBetween(String value1, String value2) {
            addCriterion("kzdm_szhl between", value1, value2, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmSzhlNotBetween(String value1, String value2) {
            addCriterion("kzdm_szhl not between", value1, value2, "kzdmSzhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbIsNull() {
            addCriterion("kzdm_hljb is null");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbIsNotNull() {
            addCriterion("kzdm_hljb is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbEqualTo(String value) {
            addCriterion("kzdm_hljb =", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbNotEqualTo(String value) {
            addCriterion("kzdm_hljb <>", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbGreaterThan(String value) {
            addCriterion("kzdm_hljb >", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_hljb >=", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbLessThan(String value) {
            addCriterion("kzdm_hljb <", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbLessThanOrEqualTo(String value) {
            addCriterion("kzdm_hljb <=", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbLike(String value) {
            addCriterion("kzdm_hljb like", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbNotLike(String value) {
            addCriterion("kzdm_hljb not like", value, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbIn(List<String> values) {
            addCriterion("kzdm_hljb in", values, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbNotIn(List<String> values) {
            addCriterion("kzdm_hljb not in", values, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbBetween(String value1, String value2) {
            addCriterion("kzdm_hljb between", value1, value2, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHljbNotBetween(String value1, String value2) {
            addCriterion("kzdm_hljb not between", value1, value2, "kzdmHljb");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlIsNull() {
            addCriterion("kzdm_hrhl is null");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlIsNotNull() {
            addCriterion("kzdm_hrhl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlEqualTo(String value) {
            addCriterion("kzdm_hrhl =", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlNotEqualTo(String value) {
            addCriterion("kzdm_hrhl <>", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlGreaterThan(String value) {
            addCriterion("kzdm_hrhl >", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_hrhl >=", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlLessThan(String value) {
            addCriterion("kzdm_hrhl <", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlLessThanOrEqualTo(String value) {
            addCriterion("kzdm_hrhl <=", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlLike(String value) {
            addCriterion("kzdm_hrhl like", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlNotLike(String value) {
            addCriterion("kzdm_hrhl not like", value, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlIn(List<String> values) {
            addCriterion("kzdm_hrhl in", values, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlNotIn(List<String> values) {
            addCriterion("kzdm_hrhl not in", values, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlBetween(String value1, String value2) {
            addCriterion("kzdm_hrhl between", value1, value2, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmHrhlNotBetween(String value1, String value2) {
            addCriterion("kzdm_hrhl not between", value1, value2, "kzdmHrhl");
            return (Criteria) this;
        }

        public Criteria andKzdmMcIsNull() {
            addCriterion("kzdm_mc is null");
            return (Criteria) this;
        }

        public Criteria andKzdmMcIsNotNull() {
            addCriterion("kzdm_mc is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmMcEqualTo(String value) {
            addCriterion("kzdm_mc =", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcNotEqualTo(String value) {
            addCriterion("kzdm_mc <>", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcGreaterThan(String value) {
            addCriterion("kzdm_mc >", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_mc >=", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcLessThan(String value) {
            addCriterion("kzdm_mc <", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcLessThanOrEqualTo(String value) {
            addCriterion("kzdm_mc <=", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcLike(String value) {
            addCriterion("kzdm_mc like", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcNotLike(String value) {
            addCriterion("kzdm_mc not like", value, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcIn(List<String> values) {
            addCriterion("kzdm_mc in", values, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcNotIn(List<String> values) {
            addCriterion("kzdm_mc not in", values, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcBetween(String value1, String value2) {
            addCriterion("kzdm_mc between", value1, value2, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmMcNotBetween(String value1, String value2) {
            addCriterion("kzdm_mc not between", value1, value2, "kzdmMc");
            return (Criteria) this;
        }

        public Criteria andKzdmSxIsNull() {
            addCriterion("kzdm_sx is null");
            return (Criteria) this;
        }

        public Criteria andKzdmSxIsNotNull() {
            addCriterion("kzdm_sx is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmSxEqualTo(String value) {
            addCriterion("kzdm_sx =", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxNotEqualTo(String value) {
            addCriterion("kzdm_sx <>", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxGreaterThan(String value) {
            addCriterion("kzdm_sx >", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_sx >=", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxLessThan(String value) {
            addCriterion("kzdm_sx <", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxLessThanOrEqualTo(String value) {
            addCriterion("kzdm_sx <=", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxLike(String value) {
            addCriterion("kzdm_sx like", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxNotLike(String value) {
            addCriterion("kzdm_sx not like", value, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxIn(List<String> values) {
            addCriterion("kzdm_sx in", values, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxNotIn(List<String> values) {
            addCriterion("kzdm_sx not in", values, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxBetween(String value1, String value2) {
            addCriterion("kzdm_sx between", value1, value2, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmSxNotBetween(String value1, String value2) {
            addCriterion("kzdm_sx not between", value1, value2, "kzdmSx");
            return (Criteria) this;
        }

        public Criteria andKzdmShengIsNull() {
            addCriterion("kzdm_sheng is null");
            return (Criteria) this;
        }

        public Criteria andKzdmShengIsNotNull() {
            addCriterion("kzdm_sheng is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmShengEqualTo(String value) {
            addCriterion("kzdm_sheng =", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengNotEqualTo(String value) {
            addCriterion("kzdm_sheng <>", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengGreaterThan(String value) {
            addCriterion("kzdm_sheng >", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_sheng >=", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengLessThan(String value) {
            addCriterion("kzdm_sheng <", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengLessThanOrEqualTo(String value) {
            addCriterion("kzdm_sheng <=", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengLike(String value) {
            addCriterion("kzdm_sheng like", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengNotLike(String value) {
            addCriterion("kzdm_sheng not like", value, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengIn(List<String> values) {
            addCriterion("kzdm_sheng in", values, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengNotIn(List<String> values) {
            addCriterion("kzdm_sheng not in", values, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengBetween(String value1, String value2) {
            addCriterion("kzdm_sheng between", value1, value2, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShengNotBetween(String value1, String value2) {
            addCriterion("kzdm_sheng not between", value1, value2, "kzdmSheng");
            return (Criteria) this;
        }

        public Criteria andKzdmShiIsNull() {
            addCriterion("kzdm_shi is null");
            return (Criteria) this;
        }

        public Criteria andKzdmShiIsNotNull() {
            addCriterion("kzdm_shi is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmShiEqualTo(String value) {
            addCriterion("kzdm_shi =", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiNotEqualTo(String value) {
            addCriterion("kzdm_shi <>", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiGreaterThan(String value) {
            addCriterion("kzdm_shi >", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_shi >=", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiLessThan(String value) {
            addCriterion("kzdm_shi <", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiLessThanOrEqualTo(String value) {
            addCriterion("kzdm_shi <=", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiLike(String value) {
            addCriterion("kzdm_shi like", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiNotLike(String value) {
            addCriterion("kzdm_shi not like", value, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiIn(List<String> values) {
            addCriterion("kzdm_shi in", values, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiNotIn(List<String> values) {
            addCriterion("kzdm_shi not in", values, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiBetween(String value1, String value2) {
            addCriterion("kzdm_shi between", value1, value2, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmShiNotBetween(String value1, String value2) {
            addCriterion("kzdm_shi not between", value1, value2, "kzdmShi");
            return (Criteria) this;
        }

        public Criteria andKzdmQxIsNull() {
            addCriterion("kzdm_qx is null");
            return (Criteria) this;
        }

        public Criteria andKzdmQxIsNotNull() {
            addCriterion("kzdm_qx is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmQxEqualTo(String value) {
            addCriterion("kzdm_qx =", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxNotEqualTo(String value) {
            addCriterion("kzdm_qx <>", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxGreaterThan(String value) {
            addCriterion("kzdm_qx >", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_qx >=", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxLessThan(String value) {
            addCriterion("kzdm_qx <", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxLessThanOrEqualTo(String value) {
            addCriterion("kzdm_qx <=", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxLike(String value) {
            addCriterion("kzdm_qx like", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxNotLike(String value) {
            addCriterion("kzdm_qx not like", value, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxIn(List<String> values) {
            addCriterion("kzdm_qx in", values, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxNotIn(List<String> values) {
            addCriterion("kzdm_qx not in", values, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxBetween(String value1, String value2) {
            addCriterion("kzdm_qx between", value1, value2, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmQxNotBetween(String value1, String value2) {
            addCriterion("kzdm_qx not between", value1, value2, "kzdmQx");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcIsNull() {
            addCriterion("kzdm_czmc is null");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcIsNotNull() {
            addCriterion("kzdm_czmc is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcEqualTo(String value) {
            addCriterion("kzdm_czmc =", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcNotEqualTo(String value) {
            addCriterion("kzdm_czmc <>", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcGreaterThan(String value) {
            addCriterion("kzdm_czmc >", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_czmc >=", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcLessThan(String value) {
            addCriterion("kzdm_czmc <", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcLessThanOrEqualTo(String value) {
            addCriterion("kzdm_czmc <=", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcLike(String value) {
            addCriterion("kzdm_czmc like", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcNotLike(String value) {
            addCriterion("kzdm_czmc not like", value, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcIn(List<String> values) {
            addCriterion("kzdm_czmc in", values, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcNotIn(List<String> values) {
            addCriterion("kzdm_czmc not in", values, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcBetween(String value1, String value2) {
            addCriterion("kzdm_czmc between", value1, value2, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmCzmcNotBetween(String value1, String value2) {
            addCriterion("kzdm_czmc not between", value1, value2, "kzdmCzmc");
            return (Criteria) this;
        }

        public Criteria andKzdmJbIsNull() {
            addCriterion("kzdm_jb is null");
            return (Criteria) this;
        }

        public Criteria andKzdmJbIsNotNull() {
            addCriterion("kzdm_jb is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmJbEqualTo(String value) {
            addCriterion("kzdm_jb =", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbNotEqualTo(String value) {
            addCriterion("kzdm_jb <>", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbGreaterThan(String value) {
            addCriterion("kzdm_jb >", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_jb >=", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbLessThan(String value) {
            addCriterion("kzdm_jb <", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbLessThanOrEqualTo(String value) {
            addCriterion("kzdm_jb <=", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbLike(String value) {
            addCriterion("kzdm_jb like", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbNotLike(String value) {
            addCriterion("kzdm_jb not like", value, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbIn(List<String> values) {
            addCriterion("kzdm_jb in", values, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbNotIn(List<String> values) {
            addCriterion("kzdm_jb not in", values, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbBetween(String value1, String value2) {
            addCriterion("kzdm_jb between", value1, value2, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmJbNotBetween(String value1, String value2) {
            addCriterion("kzdm_jb not between", value1, value2, "kzdmJb");
            return (Criteria) this;
        }

        public Criteria andKzdmLxIsNull() {
            addCriterion("kzdm_lx is null");
            return (Criteria) this;
        }

        public Criteria andKzdmLxIsNotNull() {
            addCriterion("kzdm_lx is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmLxEqualTo(String value) {
            addCriterion("kzdm_lx =", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxNotEqualTo(String value) {
            addCriterion("kzdm_lx <>", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxGreaterThan(String value) {
            addCriterion("kzdm_lx >", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_lx >=", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxLessThan(String value) {
            addCriterion("kzdm_lx <", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxLessThanOrEqualTo(String value) {
            addCriterion("kzdm_lx <=", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxLike(String value) {
            addCriterion("kzdm_lx like", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxNotLike(String value) {
            addCriterion("kzdm_lx not like", value, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxIn(List<String> values) {
            addCriterion("kzdm_lx in", values, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxNotIn(List<String> values) {
            addCriterion("kzdm_lx not in", values, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxBetween(String value1, String value2) {
            addCriterion("kzdm_lx between", value1, value2, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmLxNotBetween(String value1, String value2) {
            addCriterion("kzdm_lx not between", value1, value2, "kzdmLx");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqIsNull() {
            addCriterion("kzdm_sfcq is null");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqIsNotNull() {
            addCriterion("kzdm_sfcq is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqEqualTo(String value) {
            addCriterion("kzdm_sfcq =", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqNotEqualTo(String value) {
            addCriterion("kzdm_sfcq <>", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqGreaterThan(String value) {
            addCriterion("kzdm_sfcq >", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_sfcq >=", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqLessThan(String value) {
            addCriterion("kzdm_sfcq <", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqLessThanOrEqualTo(String value) {
            addCriterion("kzdm_sfcq <=", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqLike(String value) {
            addCriterion("kzdm_sfcq like", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqNotLike(String value) {
            addCriterion("kzdm_sfcq not like", value, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqIn(List<String> values) {
            addCriterion("kzdm_sfcq in", values, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqNotIn(List<String> values) {
            addCriterion("kzdm_sfcq not in", values, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqBetween(String value1, String value2) {
            addCriterion("kzdm_sfcq between", value1, value2, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSfcqNotBetween(String value1, String value2) {
            addCriterion("kzdm_sfcq not between", value1, value2, "kzdmSfcq");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkIsNull() {
            addCriterion("kzdm_szzk is null");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkIsNotNull() {
            addCriterion("kzdm_szzk is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkEqualTo(String value) {
            addCriterion("kzdm_szzk =", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkNotEqualTo(String value) {
            addCriterion("kzdm_szzk <>", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkGreaterThan(String value) {
            addCriterion("kzdm_szzk >", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_szzk >=", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkLessThan(String value) {
            addCriterion("kzdm_szzk <", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkLessThanOrEqualTo(String value) {
            addCriterion("kzdm_szzk <=", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkLike(String value) {
            addCriterion("kzdm_szzk like", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkNotLike(String value) {
            addCriterion("kzdm_szzk not like", value, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkIn(List<String> values) {
            addCriterion("kzdm_szzk in", values, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkNotIn(List<String> values) {
            addCriterion("kzdm_szzk not in", values, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkBetween(String value1, String value2) {
            addCriterion("kzdm_szzk between", value1, value2, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmSzzkNotBetween(String value1, String value2) {
            addCriterion("kzdm_szzk not between", value1, value2, "kzdmSzzk");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcIsNull() {
            addCriterion("kzdm_jcpc is null");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcIsNotNull() {
            addCriterion("kzdm_jcpc is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcEqualTo(String value) {
            addCriterion("kzdm_jcpc =", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcNotEqualTo(String value) {
            addCriterion("kzdm_jcpc <>", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcGreaterThan(String value) {
            addCriterion("kzdm_jcpc >", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_jcpc >=", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcLessThan(String value) {
            addCriterion("kzdm_jcpc <", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcLessThanOrEqualTo(String value) {
            addCriterion("kzdm_jcpc <=", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcLike(String value) {
            addCriterion("kzdm_jcpc like", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcNotLike(String value) {
            addCriterion("kzdm_jcpc not like", value, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcIn(List<String> values) {
            addCriterion("kzdm_jcpc in", values, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcNotIn(List<String> values) {
            addCriterion("kzdm_jcpc not in", values, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcBetween(String value1, String value2) {
            addCriterion("kzdm_jcpc between", value1, value2, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcpcNotBetween(String value1, String value2) {
            addCriterion("kzdm_jcpc not between", value1, value2, "kzdmJcpc");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmIsNull() {
            addCriterion("kzdm_jcxm is null");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmIsNotNull() {
            addCriterion("kzdm_jcxm is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmEqualTo(String value) {
            addCriterion("kzdm_jcxm =", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmNotEqualTo(String value) {
            addCriterion("kzdm_jcxm <>", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmGreaterThan(String value) {
            addCriterion("kzdm_jcxm >", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_jcxm >=", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmLessThan(String value) {
            addCriterion("kzdm_jcxm <", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmLessThanOrEqualTo(String value) {
            addCriterion("kzdm_jcxm <=", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmLike(String value) {
            addCriterion("kzdm_jcxm like", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmNotLike(String value) {
            addCriterion("kzdm_jcxm not like", value, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmIn(List<String> values) {
            addCriterion("kzdm_jcxm in", values, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmNotIn(List<String> values) {
            addCriterion("kzdm_jcxm not in", values, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmBetween(String value1, String value2) {
            addCriterion("kzdm_jcxm between", value1, value2, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJcxmNotBetween(String value1, String value2) {
            addCriterion("kzdm_jcxm not between", value1, value2, "kzdmJcxm");
            return (Criteria) this;
        }

        public Criteria andKzdmJddIsNull() {
            addCriterion("kzdm_jdd is null");
            return (Criteria) this;
        }

        public Criteria andKzdmJddIsNotNull() {
            addCriterion("kzdm_jdd is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmJddEqualTo(Integer value) {
            addCriterion("kzdm_jdd =", value, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddNotEqualTo(Integer value) {
            addCriterion("kzdm_jdd <>", value, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddGreaterThan(Integer value) {
            addCriterion("kzdm_jdd >", value, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddGreaterThanOrEqualTo(Integer value) {
            addCriterion("kzdm_jdd >=", value, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddLessThan(Integer value) {
            addCriterion("kzdm_jdd <", value, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddLessThanOrEqualTo(Integer value) {
            addCriterion("kzdm_jdd <=", value, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddIn(List<Integer> values) {
            addCriterion("kzdm_jdd in", values, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddNotIn(List<Integer> values) {
            addCriterion("kzdm_jdd not in", values, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_jdd between", value1, value2, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJddNotBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_jdd not between", value1, value2, "kzdmJdd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfIsNull() {
            addCriterion("kzdm_jdf is null");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfIsNotNull() {
            addCriterion("kzdm_jdf is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfEqualTo(Integer value) {
            addCriterion("kzdm_jdf =", value, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfNotEqualTo(Integer value) {
            addCriterion("kzdm_jdf <>", value, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfGreaterThan(Integer value) {
            addCriterion("kzdm_jdf >", value, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfGreaterThanOrEqualTo(Integer value) {
            addCriterion("kzdm_jdf >=", value, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfLessThan(Integer value) {
            addCriterion("kzdm_jdf <", value, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfLessThanOrEqualTo(Integer value) {
            addCriterion("kzdm_jdf <=", value, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfIn(List<Integer> values) {
            addCriterion("kzdm_jdf in", values, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfNotIn(List<Integer> values) {
            addCriterion("kzdm_jdf not in", values, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_jdf between", value1, value2, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdfNotBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_jdf not between", value1, value2, "kzdmJdf");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsIsNull() {
            addCriterion("kzdm_jds is null");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsIsNotNull() {
            addCriterion("kzdm_jds is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsEqualTo(Integer value) {
            addCriterion("kzdm_jds =", value, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsNotEqualTo(Integer value) {
            addCriterion("kzdm_jds <>", value, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsGreaterThan(Integer value) {
            addCriterion("kzdm_jds >", value, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("kzdm_jds >=", value, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsLessThan(Integer value) {
            addCriterion("kzdm_jds <", value, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsLessThanOrEqualTo(Integer value) {
            addCriterion("kzdm_jds <=", value, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsIn(List<Integer> values) {
            addCriterion("kzdm_jds in", values, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsNotIn(List<Integer> values) {
            addCriterion("kzdm_jds not in", values, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_jds between", value1, value2, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmJdsNotBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_jds not between", value1, value2, "kzdmJds");
            return (Criteria) this;
        }

        public Criteria andKzdmWddIsNull() {
            addCriterion("kzdm_wdd is null");
            return (Criteria) this;
        }

        public Criteria andKzdmWddIsNotNull() {
            addCriterion("kzdm_wdd is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmWddEqualTo(Integer value) {
            addCriterion("kzdm_wdd =", value, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddNotEqualTo(Integer value) {
            addCriterion("kzdm_wdd <>", value, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddGreaterThan(Integer value) {
            addCriterion("kzdm_wdd >", value, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddGreaterThanOrEqualTo(Integer value) {
            addCriterion("kzdm_wdd >=", value, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddLessThan(Integer value) {
            addCriterion("kzdm_wdd <", value, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddLessThanOrEqualTo(Integer value) {
            addCriterion("kzdm_wdd <=", value, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddIn(List<Integer> values) {
            addCriterion("kzdm_wdd in", values, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddNotIn(List<Integer> values) {
            addCriterion("kzdm_wdd not in", values, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_wdd between", value1, value2, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWddNotBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_wdd not between", value1, value2, "kzdmWdd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfIsNull() {
            addCriterion("kzdm_wdf is null");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfIsNotNull() {
            addCriterion("kzdm_wdf is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfEqualTo(Integer value) {
            addCriterion("kzdm_wdf =", value, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfNotEqualTo(Integer value) {
            addCriterion("kzdm_wdf <>", value, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfGreaterThan(Integer value) {
            addCriterion("kzdm_wdf >", value, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfGreaterThanOrEqualTo(Integer value) {
            addCriterion("kzdm_wdf >=", value, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfLessThan(Integer value) {
            addCriterion("kzdm_wdf <", value, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfLessThanOrEqualTo(Integer value) {
            addCriterion("kzdm_wdf <=", value, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfIn(List<Integer> values) {
            addCriterion("kzdm_wdf in", values, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfNotIn(List<Integer> values) {
            addCriterion("kzdm_wdf not in", values, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_wdf between", value1, value2, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdfNotBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_wdf not between", value1, value2, "kzdmWdf");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsIsNull() {
            addCriterion("kzdm_wds is null");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsIsNotNull() {
            addCriterion("kzdm_wds is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsEqualTo(Integer value) {
            addCriterion("kzdm_wds =", value, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsNotEqualTo(Integer value) {
            addCriterion("kzdm_wds <>", value, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsGreaterThan(Integer value) {
            addCriterion("kzdm_wds >", value, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsGreaterThanOrEqualTo(Integer value) {
            addCriterion("kzdm_wds >=", value, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsLessThan(Integer value) {
            addCriterion("kzdm_wds <", value, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsLessThanOrEqualTo(Integer value) {
            addCriterion("kzdm_wds <=", value, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsIn(List<Integer> values) {
            addCriterion("kzdm_wds in", values, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsNotIn(List<Integer> values) {
            addCriterion("kzdm_wds not in", values, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_wds between", value1, value2, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmWdsNotBetween(Integer value1, Integer value2) {
            addCriterion("kzdm_wds not between", value1, value2, "kzdmWds");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbIsNull() {
            addCriterion("kzdm_szmb is null");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbIsNotNull() {
            addCriterion("kzdm_szmb is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbEqualTo(String value) {
            addCriterion("kzdm_szmb =", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbNotEqualTo(String value) {
            addCriterion("kzdm_szmb <>", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbGreaterThan(String value) {
            addCriterion("kzdm_szmb >", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_szmb >=", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbLessThan(String value) {
            addCriterion("kzdm_szmb <", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbLessThanOrEqualTo(String value) {
            addCriterion("kzdm_szmb <=", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbLike(String value) {
            addCriterion("kzdm_szmb like", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbNotLike(String value) {
            addCriterion("kzdm_szmb not like", value, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbIn(List<String> values) {
            addCriterion("kzdm_szmb in", values, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbNotIn(List<String> values) {
            addCriterion("kzdm_szmb not in", values, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbBetween(String value1, String value2) {
            addCriterion("kzdm_szmb between", value1, value2, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmSzmbNotBetween(String value1, String value2) {
            addCriterion("kzdm_szmb not between", value1, value2, "kzdmSzmb");
            return (Criteria) this;
        }

        public Criteria andKzdmJdIsNull() {
            addCriterion("kzdm_jd is null");
            return (Criteria) this;
        }

        public Criteria andKzdmJdIsNotNull() {
            addCriterion("kzdm_jd is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmJdEqualTo(BigDecimal value) {
            addCriterion("kzdm_jd =", value, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdNotEqualTo(BigDecimal value) {
            addCriterion("kzdm_jd <>", value, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdGreaterThan(BigDecimal value) {
            addCriterion("kzdm_jd >", value, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kzdm_jd >=", value, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdLessThan(BigDecimal value) {
            addCriterion("kzdm_jd <", value, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kzdm_jd <=", value, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdIn(List<BigDecimal> values) {
            addCriterion("kzdm_jd in", values, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdNotIn(List<BigDecimal> values) {
            addCriterion("kzdm_jd not in", values, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kzdm_jd between", value1, value2, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmJdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kzdm_jd not between", value1, value2, "kzdmJd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdIsNull() {
            addCriterion("kzdm_wd is null");
            return (Criteria) this;
        }

        public Criteria andKzdmWdIsNotNull() {
            addCriterion("kzdm_wd is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmWdEqualTo(BigDecimal value) {
            addCriterion("kzdm_wd =", value, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdNotEqualTo(BigDecimal value) {
            addCriterion("kzdm_wd <>", value, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdGreaterThan(BigDecimal value) {
            addCriterion("kzdm_wd >", value, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("kzdm_wd >=", value, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdLessThan(BigDecimal value) {
            addCriterion("kzdm_wd <", value, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("kzdm_wd <=", value, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdIn(List<BigDecimal> values) {
            addCriterion("kzdm_wd in", values, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdNotIn(List<BigDecimal> values) {
            addCriterion("kzdm_wd not in", values, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kzdm_wd between", value1, value2, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmWdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("kzdm_wd not between", value1, value2, "kzdmWd");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlIsNull() {
            addCriterion("kzdm_shhl is null");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlIsNotNull() {
            addCriterion("kzdm_shhl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlEqualTo(String value) {
            addCriterion("kzdm_shhl =", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlNotEqualTo(String value) {
            addCriterion("kzdm_shhl <>", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlGreaterThan(String value) {
            addCriterion("kzdm_shhl >", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_shhl >=", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlLessThan(String value) {
            addCriterion("kzdm_shhl <", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlLessThanOrEqualTo(String value) {
            addCriterion("kzdm_shhl <=", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlLike(String value) {
            addCriterion("kzdm_shhl like", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlNotLike(String value) {
            addCriterion("kzdm_shhl not like", value, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlIn(List<String> values) {
            addCriterion("kzdm_shhl in", values, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlNotIn(List<String> values) {
            addCriterion("kzdm_shhl not in", values, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlBetween(String value1, String value2) {
            addCriterion("kzdm_shhl between", value1, value2, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmShhlNotBetween(String value1, String value2) {
            addCriterion("kzdm_shhl not between", value1, value2, "kzdmShhl");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeIsNull() {
            addCriterion("kzdm_time is null");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeIsNotNull() {
            addCriterion("kzdm_time is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeEqualTo(String value) {
            addCriterion("kzdm_time =", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeNotEqualTo(String value) {
            addCriterion("kzdm_time <>", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeGreaterThan(String value) {
            addCriterion("kzdm_time >", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeGreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_time >=", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeLessThan(String value) {
            addCriterion("kzdm_time <", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeLessThanOrEqualTo(String value) {
            addCriterion("kzdm_time <=", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeLike(String value) {
            addCriterion("kzdm_time like", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeNotLike(String value) {
            addCriterion("kzdm_time not like", value, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeIn(List<String> values) {
            addCriterion("kzdm_time in", values, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeNotIn(List<String> values) {
            addCriterion("kzdm_time not in", values, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeBetween(String value1, String value2) {
            addCriterion("kzdm_time between", value1, value2, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmTimeNotBetween(String value1, String value2) {
            addCriterion("kzdm_time not between", value1, value2, "kzdmTime");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1IsNull() {
            addCriterion("kzdm_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1IsNotNull() {
            addCriterion("kzdm_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1EqualTo(String value) {
            addCriterion("kzdm_bl1 =", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1NotEqualTo(String value) {
            addCriterion("kzdm_bl1 <>", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1GreaterThan(String value) {
            addCriterion("kzdm_bl1 >", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1GreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_bl1 >=", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1LessThan(String value) {
            addCriterion("kzdm_bl1 <", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1LessThanOrEqualTo(String value) {
            addCriterion("kzdm_bl1 <=", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1Like(String value) {
            addCriterion("kzdm_bl1 like", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1NotLike(String value) {
            addCriterion("kzdm_bl1 not like", value, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1In(List<String> values) {
            addCriterion("kzdm_bl1 in", values, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1NotIn(List<String> values) {
            addCriterion("kzdm_bl1 not in", values, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1Between(String value1, String value2) {
            addCriterion("kzdm_bl1 between", value1, value2, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl1NotBetween(String value1, String value2) {
            addCriterion("kzdm_bl1 not between", value1, value2, "kzdmBl1");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2IsNull() {
            addCriterion("kzdm_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2IsNotNull() {
            addCriterion("kzdm_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2EqualTo(String value) {
            addCriterion("kzdm_bl2 =", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2NotEqualTo(String value) {
            addCriterion("kzdm_bl2 <>", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2GreaterThan(String value) {
            addCriterion("kzdm_bl2 >", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2GreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_bl2 >=", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2LessThan(String value) {
            addCriterion("kzdm_bl2 <", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2LessThanOrEqualTo(String value) {
            addCriterion("kzdm_bl2 <=", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2Like(String value) {
            addCriterion("kzdm_bl2 like", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2NotLike(String value) {
            addCriterion("kzdm_bl2 not like", value, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2In(List<String> values) {
            addCriterion("kzdm_bl2 in", values, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2NotIn(List<String> values) {
            addCriterion("kzdm_bl2 not in", values, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2Between(String value1, String value2) {
            addCriterion("kzdm_bl2 between", value1, value2, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl2NotBetween(String value1, String value2) {
            addCriterion("kzdm_bl2 not between", value1, value2, "kzdmBl2");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3IsNull() {
            addCriterion("kzdm_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3IsNotNull() {
            addCriterion("kzdm_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3EqualTo(String value) {
            addCriterion("kzdm_bl3 =", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3NotEqualTo(String value) {
            addCriterion("kzdm_bl3 <>", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3GreaterThan(String value) {
            addCriterion("kzdm_bl3 >", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3GreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_bl3 >=", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3LessThan(String value) {
            addCriterion("kzdm_bl3 <", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3LessThanOrEqualTo(String value) {
            addCriterion("kzdm_bl3 <=", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3Like(String value) {
            addCriterion("kzdm_bl3 like", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3NotLike(String value) {
            addCriterion("kzdm_bl3 not like", value, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3In(List<String> values) {
            addCriterion("kzdm_bl3 in", values, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3NotIn(List<String> values) {
            addCriterion("kzdm_bl3 not in", values, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3Between(String value1, String value2) {
            addCriterion("kzdm_bl3 between", value1, value2, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl3NotBetween(String value1, String value2) {
            addCriterion("kzdm_bl3 not between", value1, value2, "kzdmBl3");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4IsNull() {
            addCriterion("kzdm_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4IsNotNull() {
            addCriterion("kzdm_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4EqualTo(String value) {
            addCriterion("kzdm_bl4 =", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4NotEqualTo(String value) {
            addCriterion("kzdm_bl4 <>", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4GreaterThan(String value) {
            addCriterion("kzdm_bl4 >", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4GreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_bl4 >=", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4LessThan(String value) {
            addCriterion("kzdm_bl4 <", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4LessThanOrEqualTo(String value) {
            addCriterion("kzdm_bl4 <=", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4Like(String value) {
            addCriterion("kzdm_bl4 like", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4NotLike(String value) {
            addCriterion("kzdm_bl4 not like", value, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4In(List<String> values) {
            addCriterion("kzdm_bl4 in", values, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4NotIn(List<String> values) {
            addCriterion("kzdm_bl4 not in", values, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4Between(String value1, String value2) {
            addCriterion("kzdm_bl4 between", value1, value2, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl4NotBetween(String value1, String value2) {
            addCriterion("kzdm_bl4 not between", value1, value2, "kzdmBl4");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5IsNull() {
            addCriterion("kzdm_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5IsNotNull() {
            addCriterion("kzdm_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5EqualTo(String value) {
            addCriterion("kzdm_bl5 =", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5NotEqualTo(String value) {
            addCriterion("kzdm_bl5 <>", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5GreaterThan(String value) {
            addCriterion("kzdm_bl5 >", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5GreaterThanOrEqualTo(String value) {
            addCriterion("kzdm_bl5 >=", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5LessThan(String value) {
            addCriterion("kzdm_bl5 <", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5LessThanOrEqualTo(String value) {
            addCriterion("kzdm_bl5 <=", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5Like(String value) {
            addCriterion("kzdm_bl5 like", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5NotLike(String value) {
            addCriterion("kzdm_bl5 not like", value, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5In(List<String> values) {
            addCriterion("kzdm_bl5 in", values, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5NotIn(List<String> values) {
            addCriterion("kzdm_bl5 not in", values, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5Between(String value1, String value2) {
            addCriterion("kzdm_bl5 between", value1, value2, "kzdmBl5");
            return (Criteria) this;
        }

        public Criteria andKzdmBl5NotBetween(String value1, String value2) {
            addCriterion("kzdm_bl5 not between", value1, value2, "kzdmBl5");
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