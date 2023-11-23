package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class MemoryGlobalByCurrentBytesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemoryGlobalByCurrentBytesExample() {
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

        public Criteria andEventNameIsNull() {
            addCriterion("event_name is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("event_name is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("event_name =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("event_name <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("event_name >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("event_name >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("event_name <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("event_name <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("event_name like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("event_name not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("event_name in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("event_name not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("event_name between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("event_name not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andCurrentCountIsNull() {
            addCriterion("current_count is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountIsNotNull() {
            addCriterion("current_count is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountEqualTo(Long value) {
            addCriterion("current_count =", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountNotEqualTo(Long value) {
            addCriterion("current_count <>", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountGreaterThan(Long value) {
            addCriterion("current_count >", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountGreaterThanOrEqualTo(Long value) {
            addCriterion("current_count >=", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountLessThan(Long value) {
            addCriterion("current_count <", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountLessThanOrEqualTo(Long value) {
            addCriterion("current_count <=", value, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountIn(List<Long> values) {
            addCriterion("current_count in", values, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountNotIn(List<Long> values) {
            addCriterion("current_count not in", values, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountBetween(Long value1, Long value2) {
            addCriterion("current_count between", value1, value2, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentCountNotBetween(Long value1, Long value2) {
            addCriterion("current_count not between", value1, value2, "currentCount");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocIsNull() {
            addCriterion("current_alloc is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocIsNotNull() {
            addCriterion("current_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocEqualTo(String value) {
            addCriterion("current_alloc =", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocNotEqualTo(String value) {
            addCriterion("current_alloc <>", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocGreaterThan(String value) {
            addCriterion("current_alloc >", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocGreaterThanOrEqualTo(String value) {
            addCriterion("current_alloc >=", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocLessThan(String value) {
            addCriterion("current_alloc <", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocLessThanOrEqualTo(String value) {
            addCriterion("current_alloc <=", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocLike(String value) {
            addCriterion("current_alloc like", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocNotLike(String value) {
            addCriterion("current_alloc not like", value, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocIn(List<String> values) {
            addCriterion("current_alloc in", values, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocNotIn(List<String> values) {
            addCriterion("current_alloc not in", values, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocBetween(String value1, String value2) {
            addCriterion("current_alloc between", value1, value2, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAllocNotBetween(String value1, String value2) {
            addCriterion("current_alloc not between", value1, value2, "currentAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocIsNull() {
            addCriterion("current_avg_alloc is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocIsNotNull() {
            addCriterion("current_avg_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocEqualTo(String value) {
            addCriterion("current_avg_alloc =", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocNotEqualTo(String value) {
            addCriterion("current_avg_alloc <>", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocGreaterThan(String value) {
            addCriterion("current_avg_alloc >", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocGreaterThanOrEqualTo(String value) {
            addCriterion("current_avg_alloc >=", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocLessThan(String value) {
            addCriterion("current_avg_alloc <", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocLessThanOrEqualTo(String value) {
            addCriterion("current_avg_alloc <=", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocLike(String value) {
            addCriterion("current_avg_alloc like", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocNotLike(String value) {
            addCriterion("current_avg_alloc not like", value, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocIn(List<String> values) {
            addCriterion("current_avg_alloc in", values, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocNotIn(List<String> values) {
            addCriterion("current_avg_alloc not in", values, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocBetween(String value1, String value2) {
            addCriterion("current_avg_alloc between", value1, value2, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andCurrentAvgAllocNotBetween(String value1, String value2) {
            addCriterion("current_avg_alloc not between", value1, value2, "currentAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighCountIsNull() {
            addCriterion("high_count is null");
            return (Criteria) this;
        }

        public Criteria andHighCountIsNotNull() {
            addCriterion("high_count is not null");
            return (Criteria) this;
        }

        public Criteria andHighCountEqualTo(Long value) {
            addCriterion("high_count =", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountNotEqualTo(Long value) {
            addCriterion("high_count <>", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountGreaterThan(Long value) {
            addCriterion("high_count >", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountGreaterThanOrEqualTo(Long value) {
            addCriterion("high_count >=", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountLessThan(Long value) {
            addCriterion("high_count <", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountLessThanOrEqualTo(Long value) {
            addCriterion("high_count <=", value, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountIn(List<Long> values) {
            addCriterion("high_count in", values, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountNotIn(List<Long> values) {
            addCriterion("high_count not in", values, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountBetween(Long value1, Long value2) {
            addCriterion("high_count between", value1, value2, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighCountNotBetween(Long value1, Long value2) {
            addCriterion("high_count not between", value1, value2, "highCount");
            return (Criteria) this;
        }

        public Criteria andHighAllocIsNull() {
            addCriterion("high_alloc is null");
            return (Criteria) this;
        }

        public Criteria andHighAllocIsNotNull() {
            addCriterion("high_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andHighAllocEqualTo(String value) {
            addCriterion("high_alloc =", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocNotEqualTo(String value) {
            addCriterion("high_alloc <>", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocGreaterThan(String value) {
            addCriterion("high_alloc >", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocGreaterThanOrEqualTo(String value) {
            addCriterion("high_alloc >=", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocLessThan(String value) {
            addCriterion("high_alloc <", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocLessThanOrEqualTo(String value) {
            addCriterion("high_alloc <=", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocLike(String value) {
            addCriterion("high_alloc like", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocNotLike(String value) {
            addCriterion("high_alloc not like", value, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocIn(List<String> values) {
            addCriterion("high_alloc in", values, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocNotIn(List<String> values) {
            addCriterion("high_alloc not in", values, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocBetween(String value1, String value2) {
            addCriterion("high_alloc between", value1, value2, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAllocNotBetween(String value1, String value2) {
            addCriterion("high_alloc not between", value1, value2, "highAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocIsNull() {
            addCriterion("high_avg_alloc is null");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocIsNotNull() {
            addCriterion("high_avg_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocEqualTo(String value) {
            addCriterion("high_avg_alloc =", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocNotEqualTo(String value) {
            addCriterion("high_avg_alloc <>", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocGreaterThan(String value) {
            addCriterion("high_avg_alloc >", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocGreaterThanOrEqualTo(String value) {
            addCriterion("high_avg_alloc >=", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocLessThan(String value) {
            addCriterion("high_avg_alloc <", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocLessThanOrEqualTo(String value) {
            addCriterion("high_avg_alloc <=", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocLike(String value) {
            addCriterion("high_avg_alloc like", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocNotLike(String value) {
            addCriterion("high_avg_alloc not like", value, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocIn(List<String> values) {
            addCriterion("high_avg_alloc in", values, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocNotIn(List<String> values) {
            addCriterion("high_avg_alloc not in", values, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocBetween(String value1, String value2) {
            addCriterion("high_avg_alloc between", value1, value2, "highAvgAlloc");
            return (Criteria) this;
        }

        public Criteria andHighAvgAllocNotBetween(String value1, String value2) {
            addCriterion("high_avg_alloc not between", value1, value2, "highAvgAlloc");
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