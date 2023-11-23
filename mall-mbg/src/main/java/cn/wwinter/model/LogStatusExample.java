package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class LogStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogStatusExample() {
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

        public Criteria andServerUuidIsNull() {
            addCriterion("SERVER_UUID is null");
            return (Criteria) this;
        }

        public Criteria andServerUuidIsNotNull() {
            addCriterion("SERVER_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andServerUuidEqualTo(String value) {
            addCriterion("SERVER_UUID =", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidNotEqualTo(String value) {
            addCriterion("SERVER_UUID <>", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidGreaterThan(String value) {
            addCriterion("SERVER_UUID >", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_UUID >=", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidLessThan(String value) {
            addCriterion("SERVER_UUID <", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidLessThanOrEqualTo(String value) {
            addCriterion("SERVER_UUID <=", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidLike(String value) {
            addCriterion("SERVER_UUID like", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidNotLike(String value) {
            addCriterion("SERVER_UUID not like", value, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidIn(List<String> values) {
            addCriterion("SERVER_UUID in", values, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidNotIn(List<String> values) {
            addCriterion("SERVER_UUID not in", values, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidBetween(String value1, String value2) {
            addCriterion("SERVER_UUID between", value1, value2, "serverUuid");
            return (Criteria) this;
        }

        public Criteria andServerUuidNotBetween(String value1, String value2) {
            addCriterion("SERVER_UUID not between", value1, value2, "serverUuid");
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