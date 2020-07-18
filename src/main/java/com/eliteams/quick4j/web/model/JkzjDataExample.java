package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class JkzjDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JkzjDataExample() {
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

        public Criteria andCsNameIsNull() {
            addCriterion("cs_name is null");
            return (Criteria) this;
        }

        public Criteria andCsNameIsNotNull() {
            addCriterion("cs_name is not null");
            return (Criteria) this;
        }

        public Criteria andCsNameEqualTo(String value) {
            addCriterion("cs_name =", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameNotEqualTo(String value) {
            addCriterion("cs_name <>", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameGreaterThan(String value) {
            addCriterion("cs_name >", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameGreaterThanOrEqualTo(String value) {
            addCriterion("cs_name >=", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameLessThan(String value) {
            addCriterion("cs_name <", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameLessThanOrEqualTo(String value) {
            addCriterion("cs_name <=", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameLike(String value) {
            addCriterion("cs_name like", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameNotLike(String value) {
            addCriterion("cs_name not like", value, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameIn(List<String> values) {
            addCriterion("cs_name in", values, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameNotIn(List<String> values) {
            addCriterion("cs_name not in", values, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameBetween(String value1, String value2) {
            addCriterion("cs_name between", value1, value2, "csName");
            return (Criteria) this;
        }

        public Criteria andCsNameNotBetween(String value1, String value2) {
            addCriterion("cs_name not between", value1, value2, "csName");
            return (Criteria) this;
        }

        public Criteria andJbpxIsNull() {
            addCriterion("jbpx is null");
            return (Criteria) this;
        }

        public Criteria andJbpxIsNotNull() {
            addCriterion("jbpx is not null");
            return (Criteria) this;
        }

        public Criteria andJbpxEqualTo(Integer value) {
            addCriterion("jbpx =", value, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxNotEqualTo(Integer value) {
            addCriterion("jbpx <>", value, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxGreaterThan(Integer value) {
            addCriterion("jbpx >", value, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxGreaterThanOrEqualTo(Integer value) {
            addCriterion("jbpx >=", value, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxLessThan(Integer value) {
            addCriterion("jbpx <", value, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxLessThanOrEqualTo(Integer value) {
            addCriterion("jbpx <=", value, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxIn(List<Integer> values) {
            addCriterion("jbpx in", values, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxNotIn(List<Integer> values) {
            addCriterion("jbpx not in", values, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxBetween(Integer value1, Integer value2) {
            addCriterion("jbpx between", value1, value2, "jbpx");
            return (Criteria) this;
        }

        public Criteria andJbpxNotBetween(Integer value1, Integer value2) {
            addCriterion("jbpx not between", value1, value2, "jbpx");
            return (Criteria) this;
        }

        public Criteria andHjJkzjIsNull() {
            addCriterion("hj_jkzj is null");
            return (Criteria) this;
        }

        public Criteria andHjJkzjIsNotNull() {
            addCriterion("hj_jkzj is not null");
            return (Criteria) this;
        }

        public Criteria andHjJkzjEqualTo(String value) {
            addCriterion("hj_jkzj =", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjNotEqualTo(String value) {
            addCriterion("hj_jkzj <>", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjGreaterThan(String value) {
            addCriterion("hj_jkzj >", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjGreaterThanOrEqualTo(String value) {
            addCriterion("hj_jkzj >=", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjLessThan(String value) {
            addCriterion("hj_jkzj <", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjLessThanOrEqualTo(String value) {
            addCriterion("hj_jkzj <=", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjLike(String value) {
            addCriterion("hj_jkzj like", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjNotLike(String value) {
            addCriterion("hj_jkzj not like", value, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjIn(List<String> values) {
            addCriterion("hj_jkzj in", values, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjNotIn(List<String> values) {
            addCriterion("hj_jkzj not in", values, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjBetween(String value1, String value2) {
            addCriterion("hj_jkzj between", value1, value2, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andHjJkzjNotBetween(String value1, String value2) {
            addCriterion("hj_jkzj not between", value1, value2, "hjJkzj");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
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