package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplicationApplierStatusByWorkerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationApplierStatusByWorkerExample() {
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

        public Criteria andWorkerIdIsNull() {
            addCriterion("WORKER_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("WORKER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(Long value) {
            addCriterion("WORKER_ID =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(Long value) {
            addCriterion("WORKER_ID <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(Long value) {
            addCriterion("WORKER_ID >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WORKER_ID >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(Long value) {
            addCriterion("WORKER_ID <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(Long value) {
            addCriterion("WORKER_ID <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<Long> values) {
            addCriterion("WORKER_ID in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<Long> values) {
            addCriterion("WORKER_ID not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(Long value1, Long value2) {
            addCriterion("WORKER_ID between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(Long value1, Long value2) {
            addCriterion("WORKER_ID not between", value1, value2, "workerId");
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

        public Criteria andLastAppliedTransactionIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION =", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionNotEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION <>", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionGreaterThan(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION >", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION >=", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLessThan(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION <", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLessThanOrEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION <=", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLike(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION like", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionNotLike(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION not like", value, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionIn(List<String> values) {
            addCriterion("LAST_APPLIED_TRANSACTION in", values, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionNotIn(List<String> values) {
            addCriterion("LAST_APPLIED_TRANSACTION not in", values, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionBetween(String value1, String value2) {
            addCriterion("LAST_APPLIED_TRANSACTION between", value1, value2, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionNotBetween(String value1, String value2) {
            addCriterion("LAST_APPLIED_TRANSACTION not between", value1, value2, "lastAppliedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP =", value, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampNotEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <>", value, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampGreaterThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >", value, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >=", value, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampLessThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <", value, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <=", value, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP in", values, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampNotIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not in", values, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP between", value1, value2, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionOriginalCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not between", value1, value2, "lastAppliedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP =", value, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampNotEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <>", value, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampGreaterThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >", value, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >=", value, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampLessThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <", value, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <=", value, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP in", values, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampNotIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not in", values, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP between", value1, value2, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionImmediateCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not between", value1, value2, "lastAppliedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP =", value, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampNotEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP <>", value, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampGreaterThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP >", value, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP >=", value, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampLessThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP <", value, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP <=", value, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP in", values, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampNotIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP not in", values, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP between", value1, value2, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionStartApplyTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_START_APPLY_TIMESTAMP not between", value1, value2, "lastAppliedTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP =", value, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampNotEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP <>", value, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampGreaterThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP >", value, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP >=", value, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampLessThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP <", value, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP <=", value, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP in", values, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampNotIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP not in", values, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP between", value1, value2, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionEndApplyTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_END_APPLY_TIMESTAMP not between", value1, value2, "lastAppliedTransactionEndApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionIsNull() {
            addCriterion("APPLYING_TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionIsNotNull() {
            addCriterion("APPLYING_TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION =", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionNotEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION <>", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionGreaterThan(String value) {
            addCriterion("APPLYING_TRANSACTION >", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION >=", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLessThan(String value) {
            addCriterion("APPLYING_TRANSACTION <", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLessThanOrEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION <=", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLike(String value) {
            addCriterion("APPLYING_TRANSACTION like", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionNotLike(String value) {
            addCriterion("APPLYING_TRANSACTION not like", value, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionIn(List<String> values) {
            addCriterion("APPLYING_TRANSACTION in", values, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionNotIn(List<String> values) {
            addCriterion("APPLYING_TRANSACTION not in", values, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionBetween(String value1, String value2) {
            addCriterion("APPLYING_TRANSACTION between", value1, value2, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionNotBetween(String value1, String value2) {
            addCriterion("APPLYING_TRANSACTION not between", value1, value2, "applyingTransaction");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampIsNull() {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampIsNotNull() {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP =", value, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampNotEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <>", value, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampGreaterThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >", value, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >=", value, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampLessThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <", value, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <=", value, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP in", values, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampNotIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not in", values, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP between", value1, value2, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionOriginalCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not between", value1, value2, "applyingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampIsNull() {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampIsNotNull() {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP =", value, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampNotEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <>", value, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampGreaterThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >", value, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >=", value, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampLessThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <", value, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <=", value, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP in", values, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampNotIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not in", values, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP between", value1, value2, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionImmediateCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not between", value1, value2, "applyingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampIsNull() {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampIsNotNull() {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP =", value, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampNotEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP <>", value, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampGreaterThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP >", value, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP >=", value, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampLessThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP <", value, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampLessThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP <=", value, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP in", values, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampNotIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP not in", values, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP between", value1, value2, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionStartApplyTimestampNotBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_START_APPLY_TIMESTAMP not between", value1, value2, "applyingTransactionStartApplyTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountEqualTo(Long value) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT =", value, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountNotEqualTo(Long value) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT <>", value, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountGreaterThan(Long value) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT >", value, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT >=", value, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountLessThan(Long value) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT <", value, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountLessThanOrEqualTo(Long value) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT <=", value, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountIn(List<Long> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT in", values, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountNotIn(List<Long> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT not in", values, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountBetween(Long value1, Long value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT between", value1, value2, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionRetriesCountNotBetween(Long value1, Long value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_RETRIES_COUNT not between", value1, value2, "lastAppliedTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberEqualTo(Integer value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER =", value, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberNotEqualTo(Integer value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER <>", value, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberGreaterThan(Integer value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER >", value, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER >=", value, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberLessThan(Integer value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER <", value, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberLessThanOrEqualTo(Integer value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER <=", value, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberIn(List<Integer> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER in", values, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberNotIn(List<Integer> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER not in", values, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberBetween(Integer value1, Integer value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER between", value1, value2, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER not between", value1, value2, "lastAppliedTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE =", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageNotEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE <>", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageGreaterThan(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE >", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE >=", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageLessThan(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE <", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE <=", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageLike(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE like", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageNotLike(String value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE not like", value, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageIn(List<String> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE in", values, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageNotIn(List<String> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE not in", values, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageBetween(String value1, String value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE between", value1, value2, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorMessageNotBetween(String value1, String value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE not between", value1, value2, "lastAppliedTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampIsNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampIsNotNull() {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP =", value, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampNotEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP <>", value, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampGreaterThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP >", value, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP >=", value, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampLessThan(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP <", value, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP <=", value, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP in", values, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampNotIn(List<Date> values) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP not in", values, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP between", value1, value2, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastAppliedTransactionLastTransientErrorTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_APPLIED_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP not between", value1, value2, "lastAppliedTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountIsNull() {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountIsNotNull() {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountEqualTo(Long value) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT =", value, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountNotEqualTo(Long value) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT <>", value, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountGreaterThan(Long value) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT >", value, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT >=", value, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountLessThan(Long value) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT <", value, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountLessThanOrEqualTo(Long value) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT <=", value, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountIn(List<Long> values) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT in", values, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountNotIn(List<Long> values) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT not in", values, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountBetween(Long value1, Long value2) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT between", value1, value2, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionRetriesCountNotBetween(Long value1, Long value2) {
            addCriterion("APPLYING_TRANSACTION_RETRIES_COUNT not between", value1, value2, "applyingTransactionRetriesCount");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberIsNull() {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberIsNotNull() {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberEqualTo(Integer value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER =", value, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberNotEqualTo(Integer value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER <>", value, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberGreaterThan(Integer value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER >", value, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER >=", value, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberLessThan(Integer value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER <", value, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberLessThanOrEqualTo(Integer value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER <=", value, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberIn(List<Integer> values) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER in", values, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberNotIn(List<Integer> values) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER not in", values, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberBetween(Integer value1, Integer value2) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER between", value1, value2, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_NUMBER not between", value1, value2, "applyingTransactionLastTransientErrorNumber");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageIsNull() {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageIsNotNull() {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE =", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageNotEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE <>", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageGreaterThan(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE >", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE >=", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageLessThan(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE <", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE <=", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageLike(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE like", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageNotLike(String value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE not like", value, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageIn(List<String> values) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE in", values, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageNotIn(List<String> values) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE not in", values, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageBetween(String value1, String value2) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE between", value1, value2, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorMessageNotBetween(String value1, String value2) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_MESSAGE not between", value1, value2, "applyingTransactionLastTransientErrorMessage");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampIsNull() {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampIsNotNull() {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP =", value, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampNotEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP <>", value, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampGreaterThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP >", value, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP >=", value, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampLessThan(Date value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP <", value, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampLessThanOrEqualTo(Date value) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP <=", value, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP in", values, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampNotIn(List<Date> values) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP not in", values, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP between", value1, value2, "applyingTransactionLastTransientErrorTimestamp");
            return (Criteria) this;
        }

        public Criteria andApplyingTransactionLastTransientErrorTimestampNotBetween(Date value1, Date value2) {
            addCriterion("APPLYING_TRANSACTION_LAST_TRANSIENT_ERROR_TIMESTAMP not between", value1, value2, "applyingTransactionLastTransientErrorTimestamp");
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