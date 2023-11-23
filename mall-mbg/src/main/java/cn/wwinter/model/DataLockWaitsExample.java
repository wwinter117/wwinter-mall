package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class DataLockWaitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataLockWaitsExample() {
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

        public Criteria andEngineIsNull() {
            addCriterion("ENGINE is null");
            return (Criteria) this;
        }

        public Criteria andEngineIsNotNull() {
            addCriterion("ENGINE is not null");
            return (Criteria) this;
        }

        public Criteria andEngineEqualTo(String value) {
            addCriterion("ENGINE =", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotEqualTo(String value) {
            addCriterion("ENGINE <>", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThan(String value) {
            addCriterion("ENGINE >", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE >=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThan(String value) {
            addCriterion("ENGINE <", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLessThanOrEqualTo(String value) {
            addCriterion("ENGINE <=", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineLike(String value) {
            addCriterion("ENGINE like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotLike(String value) {
            addCriterion("ENGINE not like", value, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineIn(List<String> values) {
            addCriterion("ENGINE in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotIn(List<String> values) {
            addCriterion("ENGINE not in", values, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineBetween(String value1, String value2) {
            addCriterion("ENGINE between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andEngineNotBetween(String value1, String value2) {
            addCriterion("ENGINE not between", value1, value2, "engine");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdIsNull() {
            addCriterion("REQUESTING_ENGINE_LOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdIsNotNull() {
            addCriterion("REQUESTING_ENGINE_LOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdEqualTo(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID =", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdNotEqualTo(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID <>", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdGreaterThan(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID >", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID >=", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdLessThan(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID <", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdLessThanOrEqualTo(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID <=", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdLike(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID like", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdNotLike(String value) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID not like", value, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdIn(List<String> values) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID in", values, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdNotIn(List<String> values) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID not in", values, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdBetween(String value1, String value2) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID between", value1, value2, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineLockIdNotBetween(String value1, String value2) {
            addCriterion("REQUESTING_ENGINE_LOCK_ID not between", value1, value2, "requestingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdIsNull() {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdIsNotNull() {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdEqualTo(Long value) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID =", value, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdNotEqualTo(Long value) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID <>", value, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdGreaterThan(Long value) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID >", value, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID >=", value, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdLessThan(Long value) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID <", value, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdLessThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID <=", value, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdIn(List<Long> values) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID in", values, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdNotIn(List<Long> values) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID not in", values, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID between", value1, value2, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingEngineTransactionIdNotBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_ENGINE_TRANSACTION_ID not between", value1, value2, "requestingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdIsNull() {
            addCriterion("REQUESTING_THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdIsNotNull() {
            addCriterion("REQUESTING_THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdEqualTo(Long value) {
            addCriterion("REQUESTING_THREAD_ID =", value, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdNotEqualTo(Long value) {
            addCriterion("REQUESTING_THREAD_ID <>", value, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdGreaterThan(Long value) {
            addCriterion("REQUESTING_THREAD_ID >", value, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_THREAD_ID >=", value, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdLessThan(Long value) {
            addCriterion("REQUESTING_THREAD_ID <", value, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_THREAD_ID <=", value, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdIn(List<Long> values) {
            addCriterion("REQUESTING_THREAD_ID in", values, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdNotIn(List<Long> values) {
            addCriterion("REQUESTING_THREAD_ID not in", values, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_THREAD_ID between", value1, value2, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_THREAD_ID not between", value1, value2, "requestingThreadId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdIsNull() {
            addCriterion("REQUESTING_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdIsNotNull() {
            addCriterion("REQUESTING_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdEqualTo(Long value) {
            addCriterion("REQUESTING_EVENT_ID =", value, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdNotEqualTo(Long value) {
            addCriterion("REQUESTING_EVENT_ID <>", value, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdGreaterThan(Long value) {
            addCriterion("REQUESTING_EVENT_ID >", value, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_EVENT_ID >=", value, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdLessThan(Long value) {
            addCriterion("REQUESTING_EVENT_ID <", value, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdLessThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_EVENT_ID <=", value, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdIn(List<Long> values) {
            addCriterion("REQUESTING_EVENT_ID in", values, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdNotIn(List<Long> values) {
            addCriterion("REQUESTING_EVENT_ID not in", values, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_EVENT_ID between", value1, value2, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingEventIdNotBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_EVENT_ID not between", value1, value2, "requestingEventId");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginIsNull() {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginIsNotNull() {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginEqualTo(Long value) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN =", value, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginNotEqualTo(Long value) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN <>", value, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginGreaterThan(Long value) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN >", value, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginGreaterThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN >=", value, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginLessThan(Long value) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN <", value, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginLessThanOrEqualTo(Long value) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN <=", value, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginIn(List<Long> values) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN in", values, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginNotIn(List<Long> values) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN not in", values, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN between", value1, value2, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andRequestingObjectInstanceBeginNotBetween(Long value1, Long value2) {
            addCriterion("REQUESTING_OBJECT_INSTANCE_BEGIN not between", value1, value2, "requestingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdIsNull() {
            addCriterion("BLOCKING_ENGINE_LOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdIsNotNull() {
            addCriterion("BLOCKING_ENGINE_LOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdEqualTo(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID =", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdNotEqualTo(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID <>", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdGreaterThan(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID >", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdGreaterThanOrEqualTo(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID >=", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdLessThan(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID <", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdLessThanOrEqualTo(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID <=", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdLike(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID like", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdNotLike(String value) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID not like", value, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdIn(List<String> values) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID in", values, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdNotIn(List<String> values) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID not in", values, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdBetween(String value1, String value2) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID between", value1, value2, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineLockIdNotBetween(String value1, String value2) {
            addCriterion("BLOCKING_ENGINE_LOCK_ID not between", value1, value2, "blockingEngineLockId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdIsNull() {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdIsNotNull() {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdEqualTo(Long value) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID =", value, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdNotEqualTo(Long value) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID <>", value, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdGreaterThan(Long value) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID >", value, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID >=", value, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdLessThan(Long value) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID <", value, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdLessThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID <=", value, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdIn(List<Long> values) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID in", values, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdNotIn(List<Long> values) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID not in", values, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID between", value1, value2, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingEngineTransactionIdNotBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_ENGINE_TRANSACTION_ID not between", value1, value2, "blockingEngineTransactionId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdIsNull() {
            addCriterion("BLOCKING_THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdIsNotNull() {
            addCriterion("BLOCKING_THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdEqualTo(Long value) {
            addCriterion("BLOCKING_THREAD_ID =", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdNotEqualTo(Long value) {
            addCriterion("BLOCKING_THREAD_ID <>", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdGreaterThan(Long value) {
            addCriterion("BLOCKING_THREAD_ID >", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_THREAD_ID >=", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdLessThan(Long value) {
            addCriterion("BLOCKING_THREAD_ID <", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_THREAD_ID <=", value, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdIn(List<Long> values) {
            addCriterion("BLOCKING_THREAD_ID in", values, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdNotIn(List<Long> values) {
            addCriterion("BLOCKING_THREAD_ID not in", values, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_THREAD_ID between", value1, value2, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_THREAD_ID not between", value1, value2, "blockingThreadId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdIsNull() {
            addCriterion("BLOCKING_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdIsNotNull() {
            addCriterion("BLOCKING_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdEqualTo(Long value) {
            addCriterion("BLOCKING_EVENT_ID =", value, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdNotEqualTo(Long value) {
            addCriterion("BLOCKING_EVENT_ID <>", value, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdGreaterThan(Long value) {
            addCriterion("BLOCKING_EVENT_ID >", value, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_EVENT_ID >=", value, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdLessThan(Long value) {
            addCriterion("BLOCKING_EVENT_ID <", value, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdLessThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_EVENT_ID <=", value, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdIn(List<Long> values) {
            addCriterion("BLOCKING_EVENT_ID in", values, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdNotIn(List<Long> values) {
            addCriterion("BLOCKING_EVENT_ID not in", values, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_EVENT_ID between", value1, value2, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingEventIdNotBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_EVENT_ID not between", value1, value2, "blockingEventId");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginIsNull() {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginIsNotNull() {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginEqualTo(Long value) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN =", value, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginNotEqualTo(Long value) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN <>", value, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginGreaterThan(Long value) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN >", value, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginGreaterThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN >=", value, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginLessThan(Long value) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN <", value, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginLessThanOrEqualTo(Long value) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN <=", value, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginIn(List<Long> values) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN in", values, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginNotIn(List<Long> values) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN not in", values, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN between", value1, value2, "blockingObjectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andBlockingObjectInstanceBeginNotBetween(Long value1, Long value2) {
            addCriterion("BLOCKING_OBJECT_INSTANCE_BEGIN not between", value1, value2, "blockingObjectInstanceBegin");
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