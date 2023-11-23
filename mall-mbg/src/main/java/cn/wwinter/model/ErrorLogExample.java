package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ErrorLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ErrorLogExample() {
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

        public Criteria andLoggedIsNull() {
            addCriterion("LOGGED is null");
            return (Criteria) this;
        }

        public Criteria andLoggedIsNotNull() {
            addCriterion("LOGGED is not null");
            return (Criteria) this;
        }

        public Criteria andLoggedEqualTo(Date value) {
            addCriterion("LOGGED =", value, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedNotEqualTo(Date value) {
            addCriterion("LOGGED <>", value, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedGreaterThan(Date value) {
            addCriterion("LOGGED >", value, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGGED >=", value, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedLessThan(Date value) {
            addCriterion("LOGGED <", value, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedLessThanOrEqualTo(Date value) {
            addCriterion("LOGGED <=", value, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedIn(List<Date> values) {
            addCriterion("LOGGED in", values, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedNotIn(List<Date> values) {
            addCriterion("LOGGED not in", values, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedBetween(Date value1, Date value2) {
            addCriterion("LOGGED between", value1, value2, "logged");
            return (Criteria) this;
        }

        public Criteria andLoggedNotBetween(Date value1, Date value2) {
            addCriterion("LOGGED not between", value1, value2, "logged");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNull() {
            addCriterion("THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andThreadIdIsNotNull() {
            addCriterion("THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThreadIdEqualTo(Long value) {
            addCriterion("THREAD_ID =", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotEqualTo(Long value) {
            addCriterion("THREAD_ID <>", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThan(Long value) {
            addCriterion("THREAD_ID >", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID >=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThan(Long value) {
            addCriterion("THREAD_ID <", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID <=", value, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdIn(List<Long> values) {
            addCriterion("THREAD_ID in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotIn(List<Long> values) {
            addCriterion("THREAD_ID not in", values, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID not between", value1, value2, "threadId");
            return (Criteria) this;
        }

        public Criteria andPrioIsNull() {
            addCriterion("PRIO is null");
            return (Criteria) this;
        }

        public Criteria andPrioIsNotNull() {
            addCriterion("PRIO is not null");
            return (Criteria) this;
        }

        public Criteria andPrioEqualTo(String value) {
            addCriterion("PRIO =", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioNotEqualTo(String value) {
            addCriterion("PRIO <>", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioGreaterThan(String value) {
            addCriterion("PRIO >", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioGreaterThanOrEqualTo(String value) {
            addCriterion("PRIO >=", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioLessThan(String value) {
            addCriterion("PRIO <", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioLessThanOrEqualTo(String value) {
            addCriterion("PRIO <=", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioLike(String value) {
            addCriterion("PRIO like", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioNotLike(String value) {
            addCriterion("PRIO not like", value, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioIn(List<String> values) {
            addCriterion("PRIO in", values, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioNotIn(List<String> values) {
            addCriterion("PRIO not in", values, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioBetween(String value1, String value2) {
            addCriterion("PRIO between", value1, value2, "prio");
            return (Criteria) this;
        }

        public Criteria andPrioNotBetween(String value1, String value2) {
            addCriterion("PRIO not between", value1, value2, "prio");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("ERROR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("ERROR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("ERROR_CODE =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("ERROR_CODE <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("ERROR_CODE >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("ERROR_CODE <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("ERROR_CODE <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("ERROR_CODE like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("ERROR_CODE not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("ERROR_CODE in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("ERROR_CODE not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("ERROR_CODE between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andSubsystemIsNull() {
            addCriterion("SUBSYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andSubsystemIsNotNull() {
            addCriterion("SUBSYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andSubsystemEqualTo(String value) {
            addCriterion("SUBSYSTEM =", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotEqualTo(String value) {
            addCriterion("SUBSYSTEM <>", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemGreaterThan(String value) {
            addCriterion("SUBSYSTEM >", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEM >=", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemLessThan(String value) {
            addCriterion("SUBSYSTEM <", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemLessThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEM <=", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemLike(String value) {
            addCriterion("SUBSYSTEM like", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotLike(String value) {
            addCriterion("SUBSYSTEM not like", value, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemIn(List<String> values) {
            addCriterion("SUBSYSTEM in", values, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotIn(List<String> values) {
            addCriterion("SUBSYSTEM not in", values, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemBetween(String value1, String value2) {
            addCriterion("SUBSYSTEM between", value1, value2, "subsystem");
            return (Criteria) this;
        }

        public Criteria andSubsystemNotBetween(String value1, String value2) {
            addCriterion("SUBSYSTEM not between", value1, value2, "subsystem");
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