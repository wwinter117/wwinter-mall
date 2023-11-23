package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplicationApplierGlobalFiltersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationApplierGlobalFiltersExample() {
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

        public Criteria andFilterNameIsNull() {
            addCriterion("FILTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFilterNameIsNotNull() {
            addCriterion("FILTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilterNameEqualTo(String value) {
            addCriterion("FILTER_NAME =", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameNotEqualTo(String value) {
            addCriterion("FILTER_NAME <>", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameGreaterThan(String value) {
            addCriterion("FILTER_NAME >", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILTER_NAME >=", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameLessThan(String value) {
            addCriterion("FILTER_NAME <", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameLessThanOrEqualTo(String value) {
            addCriterion("FILTER_NAME <=", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameLike(String value) {
            addCriterion("FILTER_NAME like", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameNotLike(String value) {
            addCriterion("FILTER_NAME not like", value, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameIn(List<String> values) {
            addCriterion("FILTER_NAME in", values, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameNotIn(List<String> values) {
            addCriterion("FILTER_NAME not in", values, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameBetween(String value1, String value2) {
            addCriterion("FILTER_NAME between", value1, value2, "filterName");
            return (Criteria) this;
        }

        public Criteria andFilterNameNotBetween(String value1, String value2) {
            addCriterion("FILTER_NAME not between", value1, value2, "filterName");
            return (Criteria) this;
        }

        public Criteria andConfiguredByIsNull() {
            addCriterion("CONFIGURED_BY is null");
            return (Criteria) this;
        }

        public Criteria andConfiguredByIsNotNull() {
            addCriterion("CONFIGURED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andConfiguredByEqualTo(String value) {
            addCriterion("CONFIGURED_BY =", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByNotEqualTo(String value) {
            addCriterion("CONFIGURED_BY <>", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByGreaterThan(String value) {
            addCriterion("CONFIGURED_BY >", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIGURED_BY >=", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByLessThan(String value) {
            addCriterion("CONFIGURED_BY <", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByLessThanOrEqualTo(String value) {
            addCriterion("CONFIGURED_BY <=", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByLike(String value) {
            addCriterion("CONFIGURED_BY like", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByNotLike(String value) {
            addCriterion("CONFIGURED_BY not like", value, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByIn(List<String> values) {
            addCriterion("CONFIGURED_BY in", values, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByNotIn(List<String> values) {
            addCriterion("CONFIGURED_BY not in", values, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByBetween(String value1, String value2) {
            addCriterion("CONFIGURED_BY between", value1, value2, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andConfiguredByNotBetween(String value1, String value2) {
            addCriterion("CONFIGURED_BY not between", value1, value2, "configuredBy");
            return (Criteria) this;
        }

        public Criteria andActiveSinceIsNull() {
            addCriterion("ACTIVE_SINCE is null");
            return (Criteria) this;
        }

        public Criteria andActiveSinceIsNotNull() {
            addCriterion("ACTIVE_SINCE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveSinceEqualTo(Date value) {
            addCriterion("ACTIVE_SINCE =", value, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceNotEqualTo(Date value) {
            addCriterion("ACTIVE_SINCE <>", value, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceGreaterThan(Date value) {
            addCriterion("ACTIVE_SINCE >", value, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTIVE_SINCE >=", value, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceLessThan(Date value) {
            addCriterion("ACTIVE_SINCE <", value, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceLessThanOrEqualTo(Date value) {
            addCriterion("ACTIVE_SINCE <=", value, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceIn(List<Date> values) {
            addCriterion("ACTIVE_SINCE in", values, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceNotIn(List<Date> values) {
            addCriterion("ACTIVE_SINCE not in", values, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceBetween(Date value1, Date value2) {
            addCriterion("ACTIVE_SINCE between", value1, value2, "activeSince");
            return (Criteria) this;
        }

        public Criteria andActiveSinceNotBetween(Date value1, Date value2) {
            addCriterion("ACTIVE_SINCE not between", value1, value2, "activeSince");
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