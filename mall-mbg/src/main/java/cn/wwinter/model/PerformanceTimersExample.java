package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class PerformanceTimersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerformanceTimersExample() {
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

        public Criteria andTimerNameIsNull() {
            addCriterion("TIMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTimerNameIsNotNull() {
            addCriterion("TIMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTimerNameEqualTo(String value) {
            addCriterion("TIMER_NAME =", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotEqualTo(String value) {
            addCriterion("TIMER_NAME <>", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameGreaterThan(String value) {
            addCriterion("TIMER_NAME >", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameGreaterThanOrEqualTo(String value) {
            addCriterion("TIMER_NAME >=", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLessThan(String value) {
            addCriterion("TIMER_NAME <", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLessThanOrEqualTo(String value) {
            addCriterion("TIMER_NAME <=", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameLike(String value) {
            addCriterion("TIMER_NAME like", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotLike(String value) {
            addCriterion("TIMER_NAME not like", value, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameIn(List<String> values) {
            addCriterion("TIMER_NAME in", values, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotIn(List<String> values) {
            addCriterion("TIMER_NAME not in", values, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameBetween(String value1, String value2) {
            addCriterion("TIMER_NAME between", value1, value2, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerNameNotBetween(String value1, String value2) {
            addCriterion("TIMER_NAME not between", value1, value2, "timerName");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyIsNull() {
            addCriterion("TIMER_FREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyIsNotNull() {
            addCriterion("TIMER_FREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyEqualTo(Long value) {
            addCriterion("TIMER_FREQUENCY =", value, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyNotEqualTo(Long value) {
            addCriterion("TIMER_FREQUENCY <>", value, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyGreaterThan(Long value) {
            addCriterion("TIMER_FREQUENCY >", value, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_FREQUENCY >=", value, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyLessThan(Long value) {
            addCriterion("TIMER_FREQUENCY <", value, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_FREQUENCY <=", value, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyIn(List<Long> values) {
            addCriterion("TIMER_FREQUENCY in", values, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyNotIn(List<Long> values) {
            addCriterion("TIMER_FREQUENCY not in", values, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyBetween(Long value1, Long value2) {
            addCriterion("TIMER_FREQUENCY between", value1, value2, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerFrequencyNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_FREQUENCY not between", value1, value2, "timerFrequency");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionIsNull() {
            addCriterion("TIMER_RESOLUTION is null");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionIsNotNull() {
            addCriterion("TIMER_RESOLUTION is not null");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionEqualTo(Long value) {
            addCriterion("TIMER_RESOLUTION =", value, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionNotEqualTo(Long value) {
            addCriterion("TIMER_RESOLUTION <>", value, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionGreaterThan(Long value) {
            addCriterion("TIMER_RESOLUTION >", value, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_RESOLUTION >=", value, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionLessThan(Long value) {
            addCriterion("TIMER_RESOLUTION <", value, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_RESOLUTION <=", value, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionIn(List<Long> values) {
            addCriterion("TIMER_RESOLUTION in", values, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionNotIn(List<Long> values) {
            addCriterion("TIMER_RESOLUTION not in", values, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionBetween(Long value1, Long value2) {
            addCriterion("TIMER_RESOLUTION between", value1, value2, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerResolutionNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_RESOLUTION not between", value1, value2, "timerResolution");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadIsNull() {
            addCriterion("TIMER_OVERHEAD is null");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadIsNotNull() {
            addCriterion("TIMER_OVERHEAD is not null");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadEqualTo(Long value) {
            addCriterion("TIMER_OVERHEAD =", value, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadNotEqualTo(Long value) {
            addCriterion("TIMER_OVERHEAD <>", value, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadGreaterThan(Long value) {
            addCriterion("TIMER_OVERHEAD >", value, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_OVERHEAD >=", value, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadLessThan(Long value) {
            addCriterion("TIMER_OVERHEAD <", value, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_OVERHEAD <=", value, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadIn(List<Long> values) {
            addCriterion("TIMER_OVERHEAD in", values, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadNotIn(List<Long> values) {
            addCriterion("TIMER_OVERHEAD not in", values, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadBetween(Long value1, Long value2) {
            addCriterion("TIMER_OVERHEAD between", value1, value2, "timerOverhead");
            return (Criteria) this;
        }

        public Criteria andTimerOverheadNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_OVERHEAD not between", value1, value2, "timerOverhead");
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