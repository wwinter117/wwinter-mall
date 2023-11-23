package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class GtidExecutedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtidExecutedExample() {
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

        public Criteria andSourceUuidIsNull() {
            addCriterion("source_uuid is null");
            return (Criteria) this;
        }

        public Criteria andSourceUuidIsNotNull() {
            addCriterion("source_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andSourceUuidEqualTo(String value) {
            addCriterion("source_uuid =", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotEqualTo(String value) {
            addCriterion("source_uuid <>", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidGreaterThan(String value) {
            addCriterion("source_uuid >", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidGreaterThanOrEqualTo(String value) {
            addCriterion("source_uuid >=", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidLessThan(String value) {
            addCriterion("source_uuid <", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidLessThanOrEqualTo(String value) {
            addCriterion("source_uuid <=", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidLike(String value) {
            addCriterion("source_uuid like", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotLike(String value) {
            addCriterion("source_uuid not like", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidIn(List<String> values) {
            addCriterion("source_uuid in", values, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotIn(List<String> values) {
            addCriterion("source_uuid not in", values, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidBetween(String value1, String value2) {
            addCriterion("source_uuid between", value1, value2, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotBetween(String value1, String value2) {
            addCriterion("source_uuid not between", value1, value2, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andIntervalStartIsNull() {
            addCriterion("interval_start is null");
            return (Criteria) this;
        }

        public Criteria andIntervalStartIsNotNull() {
            addCriterion("interval_start is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalStartEqualTo(Long value) {
            addCriterion("interval_start =", value, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartNotEqualTo(Long value) {
            addCriterion("interval_start <>", value, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartGreaterThan(Long value) {
            addCriterion("interval_start >", value, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartGreaterThanOrEqualTo(Long value) {
            addCriterion("interval_start >=", value, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartLessThan(Long value) {
            addCriterion("interval_start <", value, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartLessThanOrEqualTo(Long value) {
            addCriterion("interval_start <=", value, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartIn(List<Long> values) {
            addCriterion("interval_start in", values, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartNotIn(List<Long> values) {
            addCriterion("interval_start not in", values, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartBetween(Long value1, Long value2) {
            addCriterion("interval_start between", value1, value2, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalStartNotBetween(Long value1, Long value2) {
            addCriterion("interval_start not between", value1, value2, "intervalStart");
            return (Criteria) this;
        }

        public Criteria andIntervalEndIsNull() {
            addCriterion("interval_end is null");
            return (Criteria) this;
        }

        public Criteria andIntervalEndIsNotNull() {
            addCriterion("interval_end is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalEndEqualTo(Long value) {
            addCriterion("interval_end =", value, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndNotEqualTo(Long value) {
            addCriterion("interval_end <>", value, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndGreaterThan(Long value) {
            addCriterion("interval_end >", value, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndGreaterThanOrEqualTo(Long value) {
            addCriterion("interval_end >=", value, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndLessThan(Long value) {
            addCriterion("interval_end <", value, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndLessThanOrEqualTo(Long value) {
            addCriterion("interval_end <=", value, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndIn(List<Long> values) {
            addCriterion("interval_end in", values, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndNotIn(List<Long> values) {
            addCriterion("interval_end not in", values, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndBetween(Long value1, Long value2) {
            addCriterion("interval_end between", value1, value2, "intervalEnd");
            return (Criteria) this;
        }

        public Criteria andIntervalEndNotBetween(Long value1, Long value2) {
            addCriterion("interval_end not between", value1, value2, "intervalEnd");
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