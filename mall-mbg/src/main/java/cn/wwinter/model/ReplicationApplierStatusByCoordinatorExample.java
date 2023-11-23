package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplicationApplierStatusByCoordinatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationApplierStatusByCoordinatorExample() {
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

        public Criteria andLastErrorNumberIsNull() {
            addCriterion("LAST_ERROR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberIsNotNull() {
            addCriterion("LAST_ERROR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberEqualTo(Integer value) {
            addCriterion("LAST_ERROR_NUMBER =", value, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberNotEqualTo(Integer value) {
            addCriterion("LAST_ERROR_NUMBER <>", value, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberGreaterThan(Integer value) {
            addCriterion("LAST_ERROR_NUMBER >", value, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_ERROR_NUMBER >=", value, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberLessThan(Integer value) {
            addCriterion("LAST_ERROR_NUMBER <", value, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_ERROR_NUMBER <=", value, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberIn(List<Integer> values) {
            addCriterion("LAST_ERROR_NUMBER in", values, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberNotIn(List<Integer> values) {
            addCriterion("LAST_ERROR_NUMBER not in", values, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberBetween(Integer value1, Integer value2) {
            addCriterion("LAST_ERROR_NUMBER between", value1, value2, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_ERROR_NUMBER not between", value1, value2, "lastErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageIsNull() {
            addCriterion("LAST_ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageIsNotNull() {
            addCriterion("LAST_ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageEqualTo(String value) {
            addCriterion("LAST_ERROR_MESSAGE =", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageNotEqualTo(String value) {
            addCriterion("LAST_ERROR_MESSAGE <>", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageGreaterThan(String value) {
            addCriterion("LAST_ERROR_MESSAGE >", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_ERROR_MESSAGE >=", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageLessThan(String value) {
            addCriterion("LAST_ERROR_MESSAGE <", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("LAST_ERROR_MESSAGE <=", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageLike(String value) {
            addCriterion("LAST_ERROR_MESSAGE like", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageNotLike(String value) {
            addCriterion("LAST_ERROR_MESSAGE not like", value, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageIn(List<String> values) {
            addCriterion("LAST_ERROR_MESSAGE in", values, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageNotIn(List<String> values) {
            addCriterion("LAST_ERROR_MESSAGE not in", values, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageBetween(String value1, String value2) {
            addCriterion("LAST_ERROR_MESSAGE between", value1, value2, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorMessageNotBetween(String value1, String value2) {
            addCriterion("LAST_ERROR_MESSAGE not between", value1, value2, "lastErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampIsNull() {
            addCriterion("LAST_ERROR_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampIsNotNull() {
            addCriterion("LAST_ERROR_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampEqualTo(Date value) {
            addCriterion("LAST_ERROR_TIMESTAMP =", value, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampNotEqualTo(Date value) {
            addCriterion("LAST_ERROR_TIMESTAMP <>", value, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampGreaterThan(Date value) {
            addCriterion("LAST_ERROR_TIMESTAMP >", value, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_ERROR_TIMESTAMP >=", value, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampLessThan(Date value) {
            addCriterion("LAST_ERROR_TIMESTAMP <", value, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_ERROR_TIMESTAMP <=", value, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampIn(List<Date> values) {
            addCriterion("LAST_ERROR_TIMESTAMP in", values, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampNotIn(List<Date> values) {
            addCriterion("LAST_ERROR_TIMESTAMP not in", values, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_ERROR_TIMESTAMP between", value1, value2, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastErrorTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_ERROR_TIMESTAMP not between", value1, value2, "lastErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionIsNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionIsNotNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEqualTo(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION =", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionNotEqualTo(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION <>", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionGreaterThan(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION >", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION >=", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionLessThan(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION <", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionLessThanOrEqualTo(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION <=", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionLike(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION like", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionNotLike(String value) {
            addCriterion("LAST_PROCESSED_TRANSACTION not like", value, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionIn(List<String> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION in", values, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionNotIn(List<String> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION not in", values, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionBetween(String value1, String value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION between", value1, value2, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionNotBetween(String value1, String value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION not between", value1, value2, "lastProcessedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampIsNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampIsNotNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP =", value, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampNotEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <>", value, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampGreaterThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >", value, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >=", value, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampLessThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <", value, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <=", value, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP in", values, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampNotIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not in", values, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP between", value1, value2, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionOriginalCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not between", value1, value2, "lastProcessedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampIsNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampIsNotNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP =", value, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampNotEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <>", value, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampGreaterThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >", value, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >=", value, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampLessThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <", value, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <=", value, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP in", values, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampNotIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not in", values, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP between", value1, value2, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionImmediateCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not between", value1, value2, "lastProcessedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampIsNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampIsNotNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP =", value, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampNotEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP <>", value, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampGreaterThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP >", value, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP >=", value, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampLessThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP <", value, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP <=", value, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP in", values, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampNotIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP not in", values, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP between", value1, value2, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionStartBufferTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP not between", value1, value2, "lastProcessedTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampIsNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampIsNotNull() {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP =", value, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampNotEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP <>", value, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampGreaterThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP >", value, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP >=", value, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampLessThan(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP <", value, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP <=", value, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP in", values, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampNotIn(List<Date> values) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP not in", values, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP between", value1, value2, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastProcessedTransactionEndBufferTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP not between", value1, value2, "lastProcessedTransactionEndBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionIsNull() {
            addCriterion("PROCESSING_TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionIsNotNull() {
            addCriterion("PROCESSING_TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionEqualTo(String value) {
            addCriterion("PROCESSING_TRANSACTION =", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionNotEqualTo(String value) {
            addCriterion("PROCESSING_TRANSACTION <>", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionGreaterThan(String value) {
            addCriterion("PROCESSING_TRANSACTION >", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSING_TRANSACTION >=", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionLessThan(String value) {
            addCriterion("PROCESSING_TRANSACTION <", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionLessThanOrEqualTo(String value) {
            addCriterion("PROCESSING_TRANSACTION <=", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionLike(String value) {
            addCriterion("PROCESSING_TRANSACTION like", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionNotLike(String value) {
            addCriterion("PROCESSING_TRANSACTION not like", value, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionIn(List<String> values) {
            addCriterion("PROCESSING_TRANSACTION in", values, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionNotIn(List<String> values) {
            addCriterion("PROCESSING_TRANSACTION not in", values, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionBetween(String value1, String value2) {
            addCriterion("PROCESSING_TRANSACTION between", value1, value2, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionNotBetween(String value1, String value2) {
            addCriterion("PROCESSING_TRANSACTION not between", value1, value2, "processingTransaction");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampIsNull() {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampIsNotNull() {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP =", value, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampNotEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <>", value, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampGreaterThan(Date value) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >", value, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >=", value, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampLessThan(Date value) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <", value, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <=", value, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampIn(List<Date> values) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP in", values, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampNotIn(List<Date> values) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not in", values, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP between", value1, value2, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionOriginalCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not between", value1, value2, "processingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampIsNull() {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampIsNotNull() {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP =", value, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampNotEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <>", value, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampGreaterThan(Date value) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >", value, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >=", value, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampLessThan(Date value) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <", value, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <=", value, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampIn(List<Date> values) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP in", values, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampNotIn(List<Date> values) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not in", values, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP between", value1, value2, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionImmediateCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not between", value1, value2, "processingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampIsNull() {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampIsNotNull() {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP =", value, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampNotEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP <>", value, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampGreaterThan(Date value) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP >", value, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP >=", value, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampLessThan(Date value) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP <", value, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampLessThanOrEqualTo(Date value) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP <=", value, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampIn(List<Date> values) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP in", values, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampNotIn(List<Date> values) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP not in", values, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampBetween(Date value1, Date value2) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP between", value1, value2, "processingTransactionStartBufferTimestamp");
            return (Criteria) this;
        }

        public Criteria andProcessingTransactionStartBufferTimestampNotBetween(Date value1, Date value2) {
            addCriterion("PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP not between", value1, value2, "processingTransactionStartBufferTimestamp");
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