package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class KzdyJbxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KzdyJbxxExample() {
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

        public Criteria andKzdyBhIsNull() {
            addCriterion("kzdy_bh is null");
            return (Criteria) this;
        }

        public Criteria andKzdyBhIsNotNull() {
            addCriterion("kzdy_bh is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyBhEqualTo(String value) {
            addCriterion("kzdy_bh =", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhNotEqualTo(String value) {
            addCriterion("kzdy_bh <>", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhGreaterThan(String value) {
            addCriterion("kzdy_bh >", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_bh >=", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhLessThan(String value) {
            addCriterion("kzdy_bh <", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhLessThanOrEqualTo(String value) {
            addCriterion("kzdy_bh <=", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhLike(String value) {
            addCriterion("kzdy_bh like", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhNotLike(String value) {
            addCriterion("kzdy_bh not like", value, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhIn(List<String> values) {
            addCriterion("kzdy_bh in", values, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhNotIn(List<String> values) {
            addCriterion("kzdy_bh not in", values, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhBetween(String value1, String value2) {
            addCriterion("kzdy_bh between", value1, value2, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyBhNotBetween(String value1, String value2) {
            addCriterion("kzdy_bh not between", value1, value2, "kzdyBh");
            return (Criteria) this;
        }

        public Criteria andKzdyMcIsNull() {
            addCriterion("kzdy_mc is null");
            return (Criteria) this;
        }

        public Criteria andKzdyMcIsNotNull() {
            addCriterion("kzdy_mc is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyMcEqualTo(String value) {
            addCriterion("kzdy_mc =", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcNotEqualTo(String value) {
            addCriterion("kzdy_mc <>", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcGreaterThan(String value) {
            addCriterion("kzdy_mc >", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_mc >=", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcLessThan(String value) {
            addCriterion("kzdy_mc <", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcLessThanOrEqualTo(String value) {
            addCriterion("kzdy_mc <=", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcLike(String value) {
            addCriterion("kzdy_mc like", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcNotLike(String value) {
            addCriterion("kzdy_mc not like", value, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcIn(List<String> values) {
            addCriterion("kzdy_mc in", values, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcNotIn(List<String> values) {
            addCriterion("kzdy_mc not in", values, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcBetween(String value1, String value2) {
            addCriterion("kzdy_mc between", value1, value2, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyMcNotBetween(String value1, String value2) {
            addCriterion("kzdy_mc not between", value1, value2, "kzdyMc");
            return (Criteria) this;
        }

        public Criteria andKzdyJbIsNull() {
            addCriterion("kzdy_jb is null");
            return (Criteria) this;
        }

        public Criteria andKzdyJbIsNotNull() {
            addCriterion("kzdy_jb is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyJbEqualTo(String value) {
            addCriterion("kzdy_jb =", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbNotEqualTo(String value) {
            addCriterion("kzdy_jb <>", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbGreaterThan(String value) {
            addCriterion("kzdy_jb >", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_jb >=", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbLessThan(String value) {
            addCriterion("kzdy_jb <", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbLessThanOrEqualTo(String value) {
            addCriterion("kzdy_jb <=", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbLike(String value) {
            addCriterion("kzdy_jb like", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbNotLike(String value) {
            addCriterion("kzdy_jb not like", value, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbIn(List<String> values) {
            addCriterion("kzdy_jb in", values, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbNotIn(List<String> values) {
            addCriterion("kzdy_jb not in", values, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbBetween(String value1, String value2) {
            addCriterion("kzdy_jb between", value1, value2, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyJbNotBetween(String value1, String value2) {
            addCriterion("kzdy_jb not between", value1, value2, "kzdyJb");
            return (Criteria) this;
        }

        public Criteria andKzdyShengIsNull() {
            addCriterion("kzdy_sheng is null");
            return (Criteria) this;
        }

        public Criteria andKzdyShengIsNotNull() {
            addCriterion("kzdy_sheng is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyShengEqualTo(String value) {
            addCriterion("kzdy_sheng =", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengNotEqualTo(String value) {
            addCriterion("kzdy_sheng <>", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengGreaterThan(String value) {
            addCriterion("kzdy_sheng >", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_sheng >=", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengLessThan(String value) {
            addCriterion("kzdy_sheng <", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengLessThanOrEqualTo(String value) {
            addCriterion("kzdy_sheng <=", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengLike(String value) {
            addCriterion("kzdy_sheng like", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengNotLike(String value) {
            addCriterion("kzdy_sheng not like", value, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengIn(List<String> values) {
            addCriterion("kzdy_sheng in", values, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengNotIn(List<String> values) {
            addCriterion("kzdy_sheng not in", values, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengBetween(String value1, String value2) {
            addCriterion("kzdy_sheng between", value1, value2, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShengNotBetween(String value1, String value2) {
            addCriterion("kzdy_sheng not between", value1, value2, "kzdySheng");
            return (Criteria) this;
        }

        public Criteria andKzdyShiIsNull() {
            addCriterion("kzdy_shi is null");
            return (Criteria) this;
        }

        public Criteria andKzdyShiIsNotNull() {
            addCriterion("kzdy_shi is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyShiEqualTo(String value) {
            addCriterion("kzdy_shi =", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiNotEqualTo(String value) {
            addCriterion("kzdy_shi <>", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiGreaterThan(String value) {
            addCriterion("kzdy_shi >", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_shi >=", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiLessThan(String value) {
            addCriterion("kzdy_shi <", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiLessThanOrEqualTo(String value) {
            addCriterion("kzdy_shi <=", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiLike(String value) {
            addCriterion("kzdy_shi like", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiNotLike(String value) {
            addCriterion("kzdy_shi not like", value, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiIn(List<String> values) {
            addCriterion("kzdy_shi in", values, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiNotIn(List<String> values) {
            addCriterion("kzdy_shi not in", values, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiBetween(String value1, String value2) {
            addCriterion("kzdy_shi between", value1, value2, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyShiNotBetween(String value1, String value2) {
            addCriterion("kzdy_shi not between", value1, value2, "kzdyShi");
            return (Criteria) this;
        }

        public Criteria andKzdyQxIsNull() {
            addCriterion("kzdy_qx is null");
            return (Criteria) this;
        }

        public Criteria andKzdyQxIsNotNull() {
            addCriterion("kzdy_qx is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyQxEqualTo(String value) {
            addCriterion("kzdy_qx =", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxNotEqualTo(String value) {
            addCriterion("kzdy_qx <>", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxGreaterThan(String value) {
            addCriterion("kzdy_qx >", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_qx >=", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxLessThan(String value) {
            addCriterion("kzdy_qx <", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxLessThanOrEqualTo(String value) {
            addCriterion("kzdy_qx <=", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxLike(String value) {
            addCriterion("kzdy_qx like", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxNotLike(String value) {
            addCriterion("kzdy_qx not like", value, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxIn(List<String> values) {
            addCriterion("kzdy_qx in", values, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxNotIn(List<String> values) {
            addCriterion("kzdy_qx not in", values, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxBetween(String value1, String value2) {
            addCriterion("kzdy_qx between", value1, value2, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyQxNotBetween(String value1, String value2) {
            addCriterion("kzdy_qx not between", value1, value2, "kzdyQx");
            return (Criteria) this;
        }

        public Criteria andKzdyXzIsNull() {
            addCriterion("kzdy_xz is null");
            return (Criteria) this;
        }

        public Criteria andKzdyXzIsNotNull() {
            addCriterion("kzdy_xz is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyXzEqualTo(String value) {
            addCriterion("kzdy_xz =", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzNotEqualTo(String value) {
            addCriterion("kzdy_xz <>", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzGreaterThan(String value) {
            addCriterion("kzdy_xz >", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_xz >=", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzLessThan(String value) {
            addCriterion("kzdy_xz <", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzLessThanOrEqualTo(String value) {
            addCriterion("kzdy_xz <=", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzLike(String value) {
            addCriterion("kzdy_xz like", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzNotLike(String value) {
            addCriterion("kzdy_xz not like", value, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzIn(List<String> values) {
            addCriterion("kzdy_xz in", values, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzNotIn(List<String> values) {
            addCriterion("kzdy_xz not in", values, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzBetween(String value1, String value2) {
            addCriterion("kzdy_xz between", value1, value2, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzNotBetween(String value1, String value2) {
            addCriterion("kzdy_xz not between", value1, value2, "kzdyXz");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsIsNull() {
            addCriterion("kzdy_xzs is null");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsIsNotNull() {
            addCriterion("kzdy_xzs is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsEqualTo(Integer value) {
            addCriterion("kzdy_xzs =", value, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsNotEqualTo(Integer value) {
            addCriterion("kzdy_xzs <>", value, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsGreaterThan(Integer value) {
            addCriterion("kzdy_xzs >", value, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsGreaterThanOrEqualTo(Integer value) {
            addCriterion("kzdy_xzs >=", value, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsLessThan(Integer value) {
            addCriterion("kzdy_xzs <", value, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsLessThanOrEqualTo(Integer value) {
            addCriterion("kzdy_xzs <=", value, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsIn(List<Integer> values) {
            addCriterion("kzdy_xzs in", values, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsNotIn(List<Integer> values) {
            addCriterion("kzdy_xzs not in", values, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsBetween(Integer value1, Integer value2) {
            addCriterion("kzdy_xzs between", value1, value2, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyXzsNotBetween(Integer value1, Integer value2) {
            addCriterion("kzdy_xzs not between", value1, value2, "kzdyXzs");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcIsNull() {
            addCriterion("kzdy_lymc is null");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcIsNotNull() {
            addCriterion("kzdy_lymc is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcEqualTo(String value) {
            addCriterion("kzdy_lymc =", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcNotEqualTo(String value) {
            addCriterion("kzdy_lymc <>", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcGreaterThan(String value) {
            addCriterion("kzdy_lymc >", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_lymc >=", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcLessThan(String value) {
            addCriterion("kzdy_lymc <", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcLessThanOrEqualTo(String value) {
            addCriterion("kzdy_lymc <=", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcLike(String value) {
            addCriterion("kzdy_lymc like", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcNotLike(String value) {
            addCriterion("kzdy_lymc not like", value, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcIn(List<String> values) {
            addCriterion("kzdy_lymc in", values, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcNotIn(List<String> values) {
            addCriterion("kzdy_lymc not in", values, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcBetween(String value1, String value2) {
            addCriterion("kzdy_lymc between", value1, value2, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdyLymcNotBetween(String value1, String value2) {
            addCriterion("kzdy_lymc not between", value1, value2, "kzdyLymc");
            return (Criteria) this;
        }

        public Criteria andKzdySxIsNull() {
            addCriterion("kzdy_sx is null");
            return (Criteria) this;
        }

        public Criteria andKzdySxIsNotNull() {
            addCriterion("kzdy_sx is not null");
            return (Criteria) this;
        }

        public Criteria andKzdySxEqualTo(String value) {
            addCriterion("kzdy_sx =", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxNotEqualTo(String value) {
            addCriterion("kzdy_sx <>", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxGreaterThan(String value) {
            addCriterion("kzdy_sx >", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_sx >=", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxLessThan(String value) {
            addCriterion("kzdy_sx <", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxLessThanOrEqualTo(String value) {
            addCriterion("kzdy_sx <=", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxLike(String value) {
            addCriterion("kzdy_sx like", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxNotLike(String value) {
            addCriterion("kzdy_sx not like", value, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxIn(List<String> values) {
            addCriterion("kzdy_sx in", values, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxNotIn(List<String> values) {
            addCriterion("kzdy_sx not in", values, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxBetween(String value1, String value2) {
            addCriterion("kzdy_sx between", value1, value2, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdySxNotBetween(String value1, String value2) {
            addCriterion("kzdy_sx not between", value1, value2, "kzdySx");
            return (Criteria) this;
        }

        public Criteria andKzdyGlIsNull() {
            addCriterion("kzdy_gl is null");
            return (Criteria) this;
        }

        public Criteria andKzdyGlIsNotNull() {
            addCriterion("kzdy_gl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyGlEqualTo(String value) {
            addCriterion("kzdy_gl =", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlNotEqualTo(String value) {
            addCriterion("kzdy_gl <>", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlGreaterThan(String value) {
            addCriterion("kzdy_gl >", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_gl >=", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlLessThan(String value) {
            addCriterion("kzdy_gl <", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlLessThanOrEqualTo(String value) {
            addCriterion("kzdy_gl <=", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlLike(String value) {
            addCriterion("kzdy_gl like", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlNotLike(String value) {
            addCriterion("kzdy_gl not like", value, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlIn(List<String> values) {
            addCriterion("kzdy_gl in", values, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlNotIn(List<String> values) {
            addCriterion("kzdy_gl not in", values, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlBetween(String value1, String value2) {
            addCriterion("kzdy_gl between", value1, value2, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdyGlNotBetween(String value1, String value2) {
            addCriterion("kzdy_gl not between", value1, value2, "kzdyGl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlIsNull() {
            addCriterion("kzdy_1jzl is null");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlIsNotNull() {
            addCriterion("kzdy_1jzl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlEqualTo(String value) {
            addCriterion("kzdy_1jzl =", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlNotEqualTo(String value) {
            addCriterion("kzdy_1jzl <>", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlGreaterThan(String value) {
            addCriterion("kzdy_1jzl >", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_1jzl >=", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlLessThan(String value) {
            addCriterion("kzdy_1jzl <", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlLessThanOrEqualTo(String value) {
            addCriterion("kzdy_1jzl <=", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlLike(String value) {
            addCriterion("kzdy_1jzl like", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlNotLike(String value) {
            addCriterion("kzdy_1jzl not like", value, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlIn(List<String> values) {
            addCriterion("kzdy_1jzl in", values, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlNotIn(List<String> values) {
            addCriterion("kzdy_1jzl not in", values, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlBetween(String value1, String value2) {
            addCriterion("kzdy_1jzl between", value1, value2, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy1jzlNotBetween(String value1, String value2) {
            addCriterion("kzdy_1jzl not between", value1, value2, "kzdy1jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlIsNull() {
            addCriterion("kzdy_2jzl is null");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlIsNotNull() {
            addCriterion("kzdy_2jzl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlEqualTo(String value) {
            addCriterion("kzdy_2jzl =", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlNotEqualTo(String value) {
            addCriterion("kzdy_2jzl <>", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlGreaterThan(String value) {
            addCriterion("kzdy_2jzl >", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_2jzl >=", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlLessThan(String value) {
            addCriterion("kzdy_2jzl <", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlLessThanOrEqualTo(String value) {
            addCriterion("kzdy_2jzl <=", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlLike(String value) {
            addCriterion("kzdy_2jzl like", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlNotLike(String value) {
            addCriterion("kzdy_2jzl not like", value, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlIn(List<String> values) {
            addCriterion("kzdy_2jzl in", values, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlNotIn(List<String> values) {
            addCriterion("kzdy_2jzl not in", values, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlBetween(String value1, String value2) {
            addCriterion("kzdy_2jzl between", value1, value2, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy2jzlNotBetween(String value1, String value2) {
            addCriterion("kzdy_2jzl not between", value1, value2, "kzdy2jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlIsNull() {
            addCriterion("kzdy_3jzl is null");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlIsNotNull() {
            addCriterion("kzdy_3jzl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlEqualTo(String value) {
            addCriterion("kzdy_3jzl =", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlNotEqualTo(String value) {
            addCriterion("kzdy_3jzl <>", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlGreaterThan(String value) {
            addCriterion("kzdy_3jzl >", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_3jzl >=", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlLessThan(String value) {
            addCriterion("kzdy_3jzl <", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlLessThanOrEqualTo(String value) {
            addCriterion("kzdy_3jzl <=", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlLike(String value) {
            addCriterion("kzdy_3jzl like", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlNotLike(String value) {
            addCriterion("kzdy_3jzl not like", value, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlIn(List<String> values) {
            addCriterion("kzdy_3jzl in", values, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlNotIn(List<String> values) {
            addCriterion("kzdy_3jzl not in", values, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlBetween(String value1, String value2) {
            addCriterion("kzdy_3jzl between", value1, value2, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy3jzlNotBetween(String value1, String value2) {
            addCriterion("kzdy_3jzl not between", value1, value2, "kzdy3jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlIsNull() {
            addCriterion("kzdy_4jzl is null");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlIsNotNull() {
            addCriterion("kzdy_4jzl is not null");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlEqualTo(String value) {
            addCriterion("kzdy_4jzl =", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlNotEqualTo(String value) {
            addCriterion("kzdy_4jzl <>", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlGreaterThan(String value) {
            addCriterion("kzdy_4jzl >", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_4jzl >=", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlLessThan(String value) {
            addCriterion("kzdy_4jzl <", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlLessThanOrEqualTo(String value) {
            addCriterion("kzdy_4jzl <=", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlLike(String value) {
            addCriterion("kzdy_4jzl like", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlNotLike(String value) {
            addCriterion("kzdy_4jzl not like", value, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlIn(List<String> values) {
            addCriterion("kzdy_4jzl in", values, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlNotIn(List<String> values) {
            addCriterion("kzdy_4jzl not in", values, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlBetween(String value1, String value2) {
            addCriterion("kzdy_4jzl between", value1, value2, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdy4jzlNotBetween(String value1, String value2) {
            addCriterion("kzdy_4jzl not between", value1, value2, "kzdy4jzl");
            return (Criteria) this;
        }

        public Criteria andKzdySydIsNull() {
            addCriterion("kzdy_syd is null");
            return (Criteria) this;
        }

        public Criteria andKzdySydIsNotNull() {
            addCriterion("kzdy_syd is not null");
            return (Criteria) this;
        }

        public Criteria andKzdySydEqualTo(String value) {
            addCriterion("kzdy_syd =", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydNotEqualTo(String value) {
            addCriterion("kzdy_syd <>", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydGreaterThan(String value) {
            addCriterion("kzdy_syd >", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydGreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_syd >=", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydLessThan(String value) {
            addCriterion("kzdy_syd <", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydLessThanOrEqualTo(String value) {
            addCriterion("kzdy_syd <=", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydLike(String value) {
            addCriterion("kzdy_syd like", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydNotLike(String value) {
            addCriterion("kzdy_syd not like", value, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydIn(List<String> values) {
            addCriterion("kzdy_syd in", values, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydNotIn(List<String> values) {
            addCriterion("kzdy_syd not in", values, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydBetween(String value1, String value2) {
            addCriterion("kzdy_syd between", value1, value2, "kzdySyd");
            return (Criteria) this;
        }

        public Criteria andKzdySydNotBetween(String value1, String value2) {
            addCriterion("kzdy_syd not between", value1, value2, "kzdySyd");
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

        public Criteria andKzdyBl1IsNull() {
            addCriterion("kzdy_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1IsNotNull() {
            addCriterion("kzdy_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1EqualTo(String value) {
            addCriterion("kzdy_bl1 =", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1NotEqualTo(String value) {
            addCriterion("kzdy_bl1 <>", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1GreaterThan(String value) {
            addCriterion("kzdy_bl1 >", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1GreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_bl1 >=", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1LessThan(String value) {
            addCriterion("kzdy_bl1 <", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1LessThanOrEqualTo(String value) {
            addCriterion("kzdy_bl1 <=", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1Like(String value) {
            addCriterion("kzdy_bl1 like", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1NotLike(String value) {
            addCriterion("kzdy_bl1 not like", value, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1In(List<String> values) {
            addCriterion("kzdy_bl1 in", values, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1NotIn(List<String> values) {
            addCriterion("kzdy_bl1 not in", values, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1Between(String value1, String value2) {
            addCriterion("kzdy_bl1 between", value1, value2, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl1NotBetween(String value1, String value2) {
            addCriterion("kzdy_bl1 not between", value1, value2, "kzdyBl1");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2IsNull() {
            addCriterion("kzdy_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2IsNotNull() {
            addCriterion("kzdy_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2EqualTo(String value) {
            addCriterion("kzdy_bl2 =", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2NotEqualTo(String value) {
            addCriterion("kzdy_bl2 <>", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2GreaterThan(String value) {
            addCriterion("kzdy_bl2 >", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2GreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_bl2 >=", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2LessThan(String value) {
            addCriterion("kzdy_bl2 <", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2LessThanOrEqualTo(String value) {
            addCriterion("kzdy_bl2 <=", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2Like(String value) {
            addCriterion("kzdy_bl2 like", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2NotLike(String value) {
            addCriterion("kzdy_bl2 not like", value, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2In(List<String> values) {
            addCriterion("kzdy_bl2 in", values, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2NotIn(List<String> values) {
            addCriterion("kzdy_bl2 not in", values, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2Between(String value1, String value2) {
            addCriterion("kzdy_bl2 between", value1, value2, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl2NotBetween(String value1, String value2) {
            addCriterion("kzdy_bl2 not between", value1, value2, "kzdyBl2");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3IsNull() {
            addCriterion("kzdy_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3IsNotNull() {
            addCriterion("kzdy_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3EqualTo(String value) {
            addCriterion("kzdy_bl3 =", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3NotEqualTo(String value) {
            addCriterion("kzdy_bl3 <>", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3GreaterThan(String value) {
            addCriterion("kzdy_bl3 >", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3GreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_bl3 >=", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3LessThan(String value) {
            addCriterion("kzdy_bl3 <", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3LessThanOrEqualTo(String value) {
            addCriterion("kzdy_bl3 <=", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3Like(String value) {
            addCriterion("kzdy_bl3 like", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3NotLike(String value) {
            addCriterion("kzdy_bl3 not like", value, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3In(List<String> values) {
            addCriterion("kzdy_bl3 in", values, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3NotIn(List<String> values) {
            addCriterion("kzdy_bl3 not in", values, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3Between(String value1, String value2) {
            addCriterion("kzdy_bl3 between", value1, value2, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl3NotBetween(String value1, String value2) {
            addCriterion("kzdy_bl3 not between", value1, value2, "kzdyBl3");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4IsNull() {
            addCriterion("kzdy_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4IsNotNull() {
            addCriterion("kzdy_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4EqualTo(String value) {
            addCriterion("kzdy_bl4 =", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4NotEqualTo(String value) {
            addCriterion("kzdy_bl4 <>", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4GreaterThan(String value) {
            addCriterion("kzdy_bl4 >", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4GreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_bl4 >=", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4LessThan(String value) {
            addCriterion("kzdy_bl4 <", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4LessThanOrEqualTo(String value) {
            addCriterion("kzdy_bl4 <=", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4Like(String value) {
            addCriterion("kzdy_bl4 like", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4NotLike(String value) {
            addCriterion("kzdy_bl4 not like", value, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4In(List<String> values) {
            addCriterion("kzdy_bl4 in", values, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4NotIn(List<String> values) {
            addCriterion("kzdy_bl4 not in", values, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4Between(String value1, String value2) {
            addCriterion("kzdy_bl4 between", value1, value2, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl4NotBetween(String value1, String value2) {
            addCriterion("kzdy_bl4 not between", value1, value2, "kzdyBl4");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5IsNull() {
            addCriterion("kzdy_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5IsNotNull() {
            addCriterion("kzdy_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5EqualTo(String value) {
            addCriterion("kzdy_bl5 =", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5NotEqualTo(String value) {
            addCriterion("kzdy_bl5 <>", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5GreaterThan(String value) {
            addCriterion("kzdy_bl5 >", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5GreaterThanOrEqualTo(String value) {
            addCriterion("kzdy_bl5 >=", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5LessThan(String value) {
            addCriterion("kzdy_bl5 <", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5LessThanOrEqualTo(String value) {
            addCriterion("kzdy_bl5 <=", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5Like(String value) {
            addCriterion("kzdy_bl5 like", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5NotLike(String value) {
            addCriterion("kzdy_bl5 not like", value, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5In(List<String> values) {
            addCriterion("kzdy_bl5 in", values, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5NotIn(List<String> values) {
            addCriterion("kzdy_bl5 not in", values, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5Between(String value1, String value2) {
            addCriterion("kzdy_bl5 between", value1, value2, "kzdyBl5");
            return (Criteria) this;
        }

        public Criteria andKzdyBl5NotBetween(String value1, String value2) {
            addCriterion("kzdy_bl5 not between", value1, value2, "kzdyBl5");
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