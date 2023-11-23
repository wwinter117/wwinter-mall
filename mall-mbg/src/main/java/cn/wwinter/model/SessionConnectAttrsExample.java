package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class SessionConnectAttrsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SessionConnectAttrsExample() {
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

        public Criteria andProcesslistIdIsNull() {
            addCriterion("PROCESSLIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdIsNotNull() {
            addCriterion("PROCESSLIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID =", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdNotEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID <>", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdGreaterThan(Long value) {
            addCriterion("PROCESSLIST_ID >", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID >=", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdLessThan(Long value) {
            addCriterion("PROCESSLIST_ID <", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdLessThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID <=", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdIn(List<Long> values) {
            addCriterion("PROCESSLIST_ID in", values, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdNotIn(List<Long> values) {
            addCriterion("PROCESSLIST_ID not in", values, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_ID between", value1, value2, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdNotBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_ID not between", value1, value2, "processlistId");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNull() {
            addCriterion("ATTR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAttrNameIsNotNull() {
            addCriterion("ATTR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAttrNameEqualTo(String value) {
            addCriterion("ATTR_NAME =", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotEqualTo(String value) {
            addCriterion("ATTR_NAME <>", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThan(String value) {
            addCriterion("ATTR_NAME >", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME >=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThan(String value) {
            addCriterion("ATTR_NAME <", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLessThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME <=", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameLike(String value) {
            addCriterion("ATTR_NAME like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotLike(String value) {
            addCriterion("ATTR_NAME not like", value, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameIn(List<String> values) {
            addCriterion("ATTR_NAME in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotIn(List<String> values) {
            addCriterion("ATTR_NAME not in", values, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameBetween(String value1, String value2) {
            addCriterion("ATTR_NAME between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrNameNotBetween(String value1, String value2) {
            addCriterion("ATTR_NAME not between", value1, value2, "attrName");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNull() {
            addCriterion("ATTR_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andAttrValueIsNotNull() {
            addCriterion("ATTR_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAttrValueEqualTo(String value) {
            addCriterion("ATTR_VALUE =", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotEqualTo(String value) {
            addCriterion("ATTR_VALUE <>", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThan(String value) {
            addCriterion("ATTR_VALUE >", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE >=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThan(String value) {
            addCriterion("ATTR_VALUE <", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLessThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE <=", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueLike(String value) {
            addCriterion("ATTR_VALUE like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotLike(String value) {
            addCriterion("ATTR_VALUE not like", value, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueIn(List<String> values) {
            addCriterion("ATTR_VALUE in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotIn(List<String> values) {
            addCriterion("ATTR_VALUE not in", values, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andAttrValueNotBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE not between", value1, value2, "attrValue");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionIsNull() {
            addCriterion("ORDINAL_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionIsNotNull() {
            addCriterion("ORDINAL_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION =", value, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionNotEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION <>", value, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionGreaterThan(Integer value) {
            addCriterion("ORDINAL_POSITION >", value, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION >=", value, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionLessThan(Integer value) {
            addCriterion("ORDINAL_POSITION <", value, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionLessThanOrEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION <=", value, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionIn(List<Integer> values) {
            addCriterion("ORDINAL_POSITION in", values, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionNotIn(List<Integer> values) {
            addCriterion("ORDINAL_POSITION not in", values, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionBetween(Integer value1, Integer value2) {
            addCriterion("ORDINAL_POSITION between", value1, value2, "ordinalPosition");
            return (Criteria) this;
        }

        public Criteria andOrdinalPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDINAL_POSITION not between", value1, value2, "ordinalPosition");
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