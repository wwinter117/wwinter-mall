package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class KeyringComponentStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeyringComponentStatusExample() {
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

        public Criteria andStatusKeyIsNull() {
            addCriterion("STATUS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andStatusKeyIsNotNull() {
            addCriterion("STATUS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andStatusKeyEqualTo(String value) {
            addCriterion("STATUS_KEY =", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyNotEqualTo(String value) {
            addCriterion("STATUS_KEY <>", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyGreaterThan(String value) {
            addCriterion("STATUS_KEY >", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_KEY >=", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyLessThan(String value) {
            addCriterion("STATUS_KEY <", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyLessThanOrEqualTo(String value) {
            addCriterion("STATUS_KEY <=", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyLike(String value) {
            addCriterion("STATUS_KEY like", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyNotLike(String value) {
            addCriterion("STATUS_KEY not like", value, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyIn(List<String> values) {
            addCriterion("STATUS_KEY in", values, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyNotIn(List<String> values) {
            addCriterion("STATUS_KEY not in", values, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyBetween(String value1, String value2) {
            addCriterion("STATUS_KEY between", value1, value2, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusKeyNotBetween(String value1, String value2) {
            addCriterion("STATUS_KEY not between", value1, value2, "statusKey");
            return (Criteria) this;
        }

        public Criteria andStatusValueIsNull() {
            addCriterion("STATUS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andStatusValueIsNotNull() {
            addCriterion("STATUS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andStatusValueEqualTo(String value) {
            addCriterion("STATUS_VALUE =", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotEqualTo(String value) {
            addCriterion("STATUS_VALUE <>", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueGreaterThan(String value) {
            addCriterion("STATUS_VALUE >", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS_VALUE >=", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueLessThan(String value) {
            addCriterion("STATUS_VALUE <", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueLessThanOrEqualTo(String value) {
            addCriterion("STATUS_VALUE <=", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueLike(String value) {
            addCriterion("STATUS_VALUE like", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotLike(String value) {
            addCriterion("STATUS_VALUE not like", value, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueIn(List<String> values) {
            addCriterion("STATUS_VALUE in", values, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotIn(List<String> values) {
            addCriterion("STATUS_VALUE not in", values, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueBetween(String value1, String value2) {
            addCriterion("STATUS_VALUE between", value1, value2, "statusValue");
            return (Criteria) this;
        }

        public Criteria andStatusValueNotBetween(String value1, String value2) {
            addCriterion("STATUS_VALUE not between", value1, value2, "statusValue");
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