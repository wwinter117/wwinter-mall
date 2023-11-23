package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ReplicationApplierStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationApplierStatusExample() {
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

        public Criteria andServiceStateIsNull() {
            addCriterion("SERVICE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andServiceStateIsNotNull() {
            addCriterion("SERVICE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceStateEqualTo(String value) {
            addCriterion("SERVICE_STATE =", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotEqualTo(String value) {
            addCriterion("SERVICE_STATE <>", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThan(String value) {
            addCriterion("SERVICE_STATE >", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_STATE >=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThan(String value) {
            addCriterion("SERVICE_STATE <", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_STATE <=", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateLike(String value) {
            addCriterion("SERVICE_STATE like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotLike(String value) {
            addCriterion("SERVICE_STATE not like", value, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateIn(List<String> values) {
            addCriterion("SERVICE_STATE in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotIn(List<String> values) {
            addCriterion("SERVICE_STATE not in", values, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateBetween(String value1, String value2) {
            addCriterion("SERVICE_STATE between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andServiceStateNotBetween(String value1, String value2) {
            addCriterion("SERVICE_STATE not between", value1, value2, "serviceState");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayIsNull() {
            addCriterion("REMAINING_DELAY is null");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayIsNotNull() {
            addCriterion("REMAINING_DELAY is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayEqualTo(Integer value) {
            addCriterion("REMAINING_DELAY =", value, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayNotEqualTo(Integer value) {
            addCriterion("REMAINING_DELAY <>", value, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayGreaterThan(Integer value) {
            addCriterion("REMAINING_DELAY >", value, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("REMAINING_DELAY >=", value, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayLessThan(Integer value) {
            addCriterion("REMAINING_DELAY <", value, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayLessThanOrEqualTo(Integer value) {
            addCriterion("REMAINING_DELAY <=", value, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayIn(List<Integer> values) {
            addCriterion("REMAINING_DELAY in", values, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayNotIn(List<Integer> values) {
            addCriterion("REMAINING_DELAY not in", values, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayBetween(Integer value1, Integer value2) {
            addCriterion("REMAINING_DELAY between", value1, value2, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andRemainingDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("REMAINING_DELAY not between", value1, value2, "remainingDelay");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesIsNull() {
            addCriterion("COUNT_TRANSACTIONS_RETRIES is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_RETRIES is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES =", value, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES <>", value, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES >", value, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES >=", value, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES <", value, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES <=", value, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES in", values, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES not in", values, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES between", value1, value2, "countTransactionsRetries");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRetriesNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_RETRIES not between", value1, value2, "countTransactionsRetries");
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