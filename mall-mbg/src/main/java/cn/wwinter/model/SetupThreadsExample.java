package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class SetupThreadsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SetupThreadsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("ENABLED =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("ENABLED <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("ENABLED >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLED >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("ENABLED <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("ENABLED <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("ENABLED like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("ENABLED not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("ENABLED in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("ENABLED not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("ENABLED between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("ENABLED not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(String value) {
            addCriterion("HISTORY =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(String value) {
            addCriterion("HISTORY <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(String value) {
            addCriterion("HISTORY >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(String value) {
            addCriterion("HISTORY <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(String value) {
            addCriterion("HISTORY <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLike(String value) {
            addCriterion("HISTORY like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotLike(String value) {
            addCriterion("HISTORY not like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<String> values) {
            addCriterion("HISTORY in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<String> values) {
            addCriterion("HISTORY not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(String value1, String value2) {
            addCriterion("HISTORY between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(String value1, String value2) {
            addCriterion("HISTORY not between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andPropertiesIsNull() {
            addCriterion("PROPERTIES is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesIsNotNull() {
            addCriterion("PROPERTIES is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesEqualTo(String value) {
            addCriterion("PROPERTIES =", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotEqualTo(String value) {
            addCriterion("PROPERTIES <>", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesGreaterThan(String value) {
            addCriterion("PROPERTIES >", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("PROPERTIES >=", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLessThan(String value) {
            addCriterion("PROPERTIES <", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLessThanOrEqualTo(String value) {
            addCriterion("PROPERTIES <=", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesLike(String value) {
            addCriterion("PROPERTIES like", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotLike(String value) {
            addCriterion("PROPERTIES not like", value, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesIn(List<String> values) {
            addCriterion("PROPERTIES in", values, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotIn(List<String> values) {
            addCriterion("PROPERTIES not in", values, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesBetween(String value1, String value2) {
            addCriterion("PROPERTIES between", value1, value2, "properties");
            return (Criteria) this;
        }

        public Criteria andPropertiesNotBetween(String value1, String value2) {
            addCriterion("PROPERTIES not between", value1, value2, "properties");
            return (Criteria) this;
        }

        public Criteria andVolatilityIsNull() {
            addCriterion("VOLATILITY is null");
            return (Criteria) this;
        }

        public Criteria andVolatilityIsNotNull() {
            addCriterion("VOLATILITY is not null");
            return (Criteria) this;
        }

        public Criteria andVolatilityEqualTo(Integer value) {
            addCriterion("VOLATILITY =", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityNotEqualTo(Integer value) {
            addCriterion("VOLATILITY <>", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityGreaterThan(Integer value) {
            addCriterion("VOLATILITY >", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("VOLATILITY >=", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityLessThan(Integer value) {
            addCriterion("VOLATILITY <", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityLessThanOrEqualTo(Integer value) {
            addCriterion("VOLATILITY <=", value, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityIn(List<Integer> values) {
            addCriterion("VOLATILITY in", values, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityNotIn(List<Integer> values) {
            addCriterion("VOLATILITY not in", values, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityBetween(Integer value1, Integer value2) {
            addCriterion("VOLATILITY between", value1, value2, "volatility");
            return (Criteria) this;
        }

        public Criteria andVolatilityNotBetween(Integer value1, Integer value2) {
            addCriterion("VOLATILITY not between", value1, value2, "volatility");
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