package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ReplicationAsynchronousConnectionFailoverManagedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationAsynchronousConnectionFailoverManagedExample() {
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

        public Criteria andChannelNameIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("CHANNEL_NAME like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andManagedNameIsNull() {
            addCriterion("MANAGED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andManagedNameIsNotNull() {
            addCriterion("MANAGED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andManagedNameEqualTo(String value) {
            addCriterion("MANAGED_NAME =", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotEqualTo(String value) {
            addCriterion("MANAGED_NAME <>", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameGreaterThan(String value) {
            addCriterion("MANAGED_NAME >", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGED_NAME >=", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameLessThan(String value) {
            addCriterion("MANAGED_NAME <", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameLessThanOrEqualTo(String value) {
            addCriterion("MANAGED_NAME <=", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameLike(String value) {
            addCriterion("MANAGED_NAME like", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotLike(String value) {
            addCriterion("MANAGED_NAME not like", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameIn(List<String> values) {
            addCriterion("MANAGED_NAME in", values, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotIn(List<String> values) {
            addCriterion("MANAGED_NAME not in", values, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameBetween(String value1, String value2) {
            addCriterion("MANAGED_NAME between", value1, value2, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotBetween(String value1, String value2) {
            addCriterion("MANAGED_NAME not between", value1, value2, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedTypeIsNull() {
            addCriterion("MANAGED_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andManagedTypeIsNotNull() {
            addCriterion("MANAGED_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andManagedTypeEqualTo(String value) {
            addCriterion("MANAGED_TYPE =", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeNotEqualTo(String value) {
            addCriterion("MANAGED_TYPE <>", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeGreaterThan(String value) {
            addCriterion("MANAGED_TYPE >", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGED_TYPE >=", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeLessThan(String value) {
            addCriterion("MANAGED_TYPE <", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeLessThanOrEqualTo(String value) {
            addCriterion("MANAGED_TYPE <=", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeLike(String value) {
            addCriterion("MANAGED_TYPE like", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeNotLike(String value) {
            addCriterion("MANAGED_TYPE not like", value, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeIn(List<String> values) {
            addCriterion("MANAGED_TYPE in", values, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeNotIn(List<String> values) {
            addCriterion("MANAGED_TYPE not in", values, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeBetween(String value1, String value2) {
            addCriterion("MANAGED_TYPE between", value1, value2, "managedType");
            return (Criteria) this;
        }

        public Criteria andManagedTypeNotBetween(String value1, String value2) {
            addCriterion("MANAGED_TYPE not between", value1, value2, "managedType");
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