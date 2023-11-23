package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplicationConnectionStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationConnectionStatusExample() {
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

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andSourceUuidIsNull() {
            addCriterion("SOURCE_UUID is null");
            return (Criteria) this;
        }

        public Criteria andSourceUuidIsNotNull() {
            addCriterion("SOURCE_UUID is not null");
            return (Criteria) this;
        }

        public Criteria andSourceUuidEqualTo(String value) {
            addCriterion("SOURCE_UUID =", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotEqualTo(String value) {
            addCriterion("SOURCE_UUID <>", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidGreaterThan(String value) {
            addCriterion("SOURCE_UUID >", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_UUID >=", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidLessThan(String value) {
            addCriterion("SOURCE_UUID <", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_UUID <=", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidLike(String value) {
            addCriterion("SOURCE_UUID like", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotLike(String value) {
            addCriterion("SOURCE_UUID not like", value, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidIn(List<String> values) {
            addCriterion("SOURCE_UUID in", values, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotIn(List<String> values) {
            addCriterion("SOURCE_UUID not in", values, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidBetween(String value1, String value2) {
            addCriterion("SOURCE_UUID between", value1, value2, "sourceUuid");
            return (Criteria) this;
        }

        public Criteria andSourceUuidNotBetween(String value1, String value2) {
            addCriterion("SOURCE_UUID not between", value1, value2, "sourceUuid");
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

        public Criteria andCountReceivedHeartbeatsIsNull() {
            addCriterion("COUNT_RECEIVED_HEARTBEATS is null");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsIsNotNull() {
            addCriterion("COUNT_RECEIVED_HEARTBEATS is not null");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsEqualTo(Long value) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS =", value, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsNotEqualTo(Long value) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS <>", value, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsGreaterThan(Long value) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS >", value, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS >=", value, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsLessThan(Long value) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS <", value, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS <=", value, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsIn(List<Long> values) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS in", values, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsNotIn(List<Long> values) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS not in", values, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsBetween(Long value1, Long value2) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS between", value1, value2, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andCountReceivedHeartbeatsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_RECEIVED_HEARTBEATS not between", value1, value2, "countReceivedHeartbeats");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampIsNull() {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampIsNotNull() {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP =", value, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampNotEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP <>", value, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampGreaterThan(Date value) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP >", value, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP >=", value, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampLessThan(Date value) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP <", value, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP <=", value, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampIn(List<Date> values) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP in", values, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampNotIn(List<Date> values) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP not in", values, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP between", value1, value2, "lastHeartbeatTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_HEARTBEAT_TIMESTAMP not between", value1, value2, "lastHeartbeatTimestamp");
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

        public Criteria andLastQueuedTransactionIsNull() {
            addCriterion("LAST_QUEUED_TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionIsNotNull() {
            addCriterion("LAST_QUEUED_TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEqualTo(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION =", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionNotEqualTo(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION <>", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionGreaterThan(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION >", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION >=", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionLessThan(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION <", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionLessThanOrEqualTo(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION <=", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionLike(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION like", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionNotLike(String value) {
            addCriterion("LAST_QUEUED_TRANSACTION not like", value, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionIn(List<String> values) {
            addCriterion("LAST_QUEUED_TRANSACTION in", values, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionNotIn(List<String> values) {
            addCriterion("LAST_QUEUED_TRANSACTION not in", values, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionBetween(String value1, String value2) {
            addCriterion("LAST_QUEUED_TRANSACTION between", value1, value2, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionNotBetween(String value1, String value2) {
            addCriterion("LAST_QUEUED_TRANSACTION not between", value1, value2, "lastQueuedTransaction");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampIsNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampIsNotNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP =", value, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampNotEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <>", value, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampGreaterThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >", value, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >=", value, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampLessThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <", value, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <=", value, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP in", values, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampNotIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not in", values, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP between", value1, value2, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionOriginalCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not between", value1, value2, "lastQueuedTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampIsNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampIsNotNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP =", value, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampNotEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <>", value, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampGreaterThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >", value, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >=", value, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampLessThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <", value, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <=", value, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP in", values, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampNotIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not in", values, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP between", value1, value2, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionImmediateCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not between", value1, value2, "lastQueuedTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampIsNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampIsNotNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP =", value, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampNotEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP <>", value, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampGreaterThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP >", value, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP >=", value, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampLessThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP <", value, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP <=", value, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP in", values, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampNotIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP not in", values, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP between", value1, value2, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionStartQueueTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP not between", value1, value2, "lastQueuedTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampIsNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampIsNotNull() {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP =", value, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampNotEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP <>", value, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampGreaterThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP >", value, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP >=", value, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampLessThan(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP <", value, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP <=", value, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP in", values, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampNotIn(List<Date> values) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP not in", values, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP between", value1, value2, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastQueuedTransactionEndQueueTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP not between", value1, value2, "lastQueuedTransactionEndQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionIsNull() {
            addCriterion("QUEUEING_TRANSACTION is null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionIsNotNull() {
            addCriterion("QUEUEING_TRANSACTION is not null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionEqualTo(String value) {
            addCriterion("QUEUEING_TRANSACTION =", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionNotEqualTo(String value) {
            addCriterion("QUEUEING_TRANSACTION <>", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionGreaterThan(String value) {
            addCriterion("QUEUEING_TRANSACTION >", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionGreaterThanOrEqualTo(String value) {
            addCriterion("QUEUEING_TRANSACTION >=", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionLessThan(String value) {
            addCriterion("QUEUEING_TRANSACTION <", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionLessThanOrEqualTo(String value) {
            addCriterion("QUEUEING_TRANSACTION <=", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionLike(String value) {
            addCriterion("QUEUEING_TRANSACTION like", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionNotLike(String value) {
            addCriterion("QUEUEING_TRANSACTION not like", value, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionIn(List<String> values) {
            addCriterion("QUEUEING_TRANSACTION in", values, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionNotIn(List<String> values) {
            addCriterion("QUEUEING_TRANSACTION not in", values, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionBetween(String value1, String value2) {
            addCriterion("QUEUEING_TRANSACTION between", value1, value2, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionNotBetween(String value1, String value2) {
            addCriterion("QUEUEING_TRANSACTION not between", value1, value2, "queueingTransaction");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampIsNull() {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampIsNotNull() {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP =", value, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampNotEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <>", value, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampGreaterThan(Date value) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >", value, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP >=", value, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampLessThan(Date value) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <", value, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP <=", value, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampIn(List<Date> values) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP in", values, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampNotIn(List<Date> values) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not in", values, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP between", value1, value2, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionOriginalCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP not between", value1, value2, "queueingTransactionOriginalCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampIsNull() {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampIsNotNull() {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP =", value, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampNotEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <>", value, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampGreaterThan(Date value) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >", value, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP >=", value, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampLessThan(Date value) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <", value, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampLessThanOrEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP <=", value, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampIn(List<Date> values) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP in", values, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampNotIn(List<Date> values) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not in", values, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampBetween(Date value1, Date value2) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP between", value1, value2, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionImmediateCommitTimestampNotBetween(Date value1, Date value2) {
            addCriterion("QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP not between", value1, value2, "queueingTransactionImmediateCommitTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampIsNull() {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampIsNotNull() {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP =", value, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampNotEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP <>", value, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampGreaterThan(Date value) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP >", value, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP >=", value, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampLessThan(Date value) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP <", value, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampLessThanOrEqualTo(Date value) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP <=", value, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampIn(List<Date> values) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP in", values, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampNotIn(List<Date> values) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP not in", values, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampBetween(Date value1, Date value2) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP between", value1, value2, "queueingTransactionStartQueueTimestamp");
            return (Criteria) this;
        }

        public Criteria andQueueingTransactionStartQueueTimestampNotBetween(Date value1, Date value2) {
            addCriterion("QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP not between", value1, value2, "queueingTransactionStartQueueTimestamp");
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