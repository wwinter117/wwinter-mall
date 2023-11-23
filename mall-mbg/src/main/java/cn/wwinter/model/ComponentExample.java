package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComponentExample() {
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

        public Criteria andComponentIdIsNull() {
            addCriterion("component_id is null");
            return (Criteria) this;
        }

        public Criteria andComponentIdIsNotNull() {
            addCriterion("component_id is not null");
            return (Criteria) this;
        }

        public Criteria andComponentIdEqualTo(Integer value) {
            addCriterion("component_id =", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotEqualTo(Integer value) {
            addCriterion("component_id <>", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdGreaterThan(Integer value) {
            addCriterion("component_id >", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("component_id >=", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdLessThan(Integer value) {
            addCriterion("component_id <", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdLessThanOrEqualTo(Integer value) {
            addCriterion("component_id <=", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdIn(List<Integer> values) {
            addCriterion("component_id in", values, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotIn(List<Integer> values) {
            addCriterion("component_id not in", values, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdBetween(Integer value1, Integer value2) {
            addCriterion("component_id between", value1, value2, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("component_id not between", value1, value2, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdIsNull() {
            addCriterion("component_group_id is null");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdIsNotNull() {
            addCriterion("component_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdEqualTo(Integer value) {
            addCriterion("component_group_id =", value, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdNotEqualTo(Integer value) {
            addCriterion("component_group_id <>", value, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdGreaterThan(Integer value) {
            addCriterion("component_group_id >", value, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("component_group_id >=", value, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdLessThan(Integer value) {
            addCriterion("component_group_id <", value, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("component_group_id <=", value, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdIn(List<Integer> values) {
            addCriterion("component_group_id in", values, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdNotIn(List<Integer> values) {
            addCriterion("component_group_id not in", values, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("component_group_id between", value1, value2, "componentGroupId");
            return (Criteria) this;
        }

        public Criteria andComponentGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("component_group_id not between", value1, value2, "componentGroupId");
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