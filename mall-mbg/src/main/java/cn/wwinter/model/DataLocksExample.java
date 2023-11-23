package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class DataLocksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataLocksExample() {
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

        public Criteria andEngineLockIdIsNull() {
            addCriterion("ENGINE_LOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdIsNotNull() {
            addCriterion("ENGINE_LOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdEqualTo(String value) {
            addCriterion("ENGINE_LOCK_ID =", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdNotEqualTo(String value) {
            addCriterion("ENGINE_LOCK_ID <>", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdGreaterThan(String value) {
            addCriterion("ENGINE_LOCK_ID >", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdGreaterThanOrEqualTo(String value) {
            addCriterion("ENGINE_LOCK_ID >=", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdLessThan(String value) {
            addCriterion("ENGINE_LOCK_ID <", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdLessThanOrEqualTo(String value) {
            addCriterion("ENGINE_LOCK_ID <=", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdLike(String value) {
            addCriterion("ENGINE_LOCK_ID like", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdNotLike(String value) {
            addCriterion("ENGINE_LOCK_ID not like", value, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdIn(List<String> values) {
            addCriterion("ENGINE_LOCK_ID in", values, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdNotIn(List<String> values) {
            addCriterion("ENGINE_LOCK_ID not in", values, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdBetween(String value1, String value2) {
            addCriterion("ENGINE_LOCK_ID between", value1, value2, "engineLockId");
            return (Criteria) this;
        }

        public Criteria andEngineLockIdNotBetween(String value1, String value2) {
            addCriterion("ENGINE_LOCK_ID not between", value1, value2, "engineLockId");
            return (Criteria) this;
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

        public Criteria andEngineTransactionIdIsNull() {
            addCriterion("ENGINE_TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdIsNotNull() {
            addCriterion("ENGINE_TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdEqualTo(Long value) {
            addCriterion("ENGINE_TRANSACTION_ID =", value, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdNotEqualTo(Long value) {
            addCriterion("ENGINE_TRANSACTION_ID <>", value, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdGreaterThan(Long value) {
            addCriterion("ENGINE_TRANSACTION_ID >", value, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ENGINE_TRANSACTION_ID >=", value, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdLessThan(Long value) {
            addCriterion("ENGINE_TRANSACTION_ID <", value, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdLessThanOrEqualTo(Long value) {
            addCriterion("ENGINE_TRANSACTION_ID <=", value, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdIn(List<Long> values) {
            addCriterion("ENGINE_TRANSACTION_ID in", values, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdNotIn(List<Long> values) {
            addCriterion("ENGINE_TRANSACTION_ID not in", values, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdBetween(Long value1, Long value2) {
            addCriterion("ENGINE_TRANSACTION_ID between", value1, value2, "engineTransactionId");
            return (Criteria) this;
        }

        public Criteria andEngineTransactionIdNotBetween(Long value1, Long value2) {
            addCriterion("ENGINE_TRANSACTION_ID not between", value1, value2, "engineTransactionId");
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

        public Criteria andEventIdIsNull() {
            addCriterion("EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Long value) {
            addCriterion("EVENT_ID =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Long value) {
            addCriterion("EVENT_ID <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Long value) {
            addCriterion("EVENT_ID >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Long value) {
            addCriterion("EVENT_ID <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Long> values) {
            addCriterion("EVENT_ID in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Long> values) {
            addCriterion("EVENT_ID not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNull() {
            addCriterion("OBJECT_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIsNotNull() {
            addCriterion("OBJECT_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA =", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA <>", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThan(String value) {
            addCriterion("OBJECT_SCHEMA >", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA >=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThan(String value) {
            addCriterion("OBJECT_SCHEMA <", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_SCHEMA <=", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaLike(String value) {
            addCriterion("OBJECT_SCHEMA like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotLike(String value) {
            addCriterion("OBJECT_SCHEMA not like", value, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaIn(List<String> values) {
            addCriterion("OBJECT_SCHEMA in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotIn(List<String> values) {
            addCriterion("OBJECT_SCHEMA not in", values, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaBetween(String value1, String value2) {
            addCriterion("OBJECT_SCHEMA between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectSchemaNotBetween(String value1, String value2) {
            addCriterion("OBJECT_SCHEMA not between", value1, value2, "objectSchema");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNull() {
            addCriterion("OBJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andObjectNameIsNotNull() {
            addCriterion("OBJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andObjectNameEqualTo(String value) {
            addCriterion("OBJECT_NAME =", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotEqualTo(String value) {
            addCriterion("OBJECT_NAME <>", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThan(String value) {
            addCriterion("OBJECT_NAME >", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME >=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThan(String value) {
            addCriterion("OBJECT_NAME <", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_NAME <=", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameLike(String value) {
            addCriterion("OBJECT_NAME like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotLike(String value) {
            addCriterion("OBJECT_NAME not like", value, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameIn(List<String> values) {
            addCriterion("OBJECT_NAME in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotIn(List<String> values) {
            addCriterion("OBJECT_NAME not in", values, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andObjectNameNotBetween(String value1, String value2) {
            addCriterion("OBJECT_NAME not between", value1, value2, "objectName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameIsNull() {
            addCriterion("PARTITION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPartitionNameIsNotNull() {
            addCriterion("PARTITION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionNameEqualTo(String value) {
            addCriterion("PARTITION_NAME =", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotEqualTo(String value) {
            addCriterion("PARTITION_NAME <>", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameGreaterThan(String value) {
            addCriterion("PARTITION_NAME >", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARTITION_NAME >=", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameLessThan(String value) {
            addCriterion("PARTITION_NAME <", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameLessThanOrEqualTo(String value) {
            addCriterion("PARTITION_NAME <=", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameLike(String value) {
            addCriterion("PARTITION_NAME like", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotLike(String value) {
            addCriterion("PARTITION_NAME not like", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameIn(List<String> values) {
            addCriterion("PARTITION_NAME in", values, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotIn(List<String> values) {
            addCriterion("PARTITION_NAME not in", values, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameBetween(String value1, String value2) {
            addCriterion("PARTITION_NAME between", value1, value2, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotBetween(String value1, String value2) {
            addCriterion("PARTITION_NAME not between", value1, value2, "partitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameIsNull() {
            addCriterion("SUBPARTITION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameIsNotNull() {
            addCriterion("SUBPARTITION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameEqualTo(String value) {
            addCriterion("SUBPARTITION_NAME =", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameNotEqualTo(String value) {
            addCriterion("SUBPARTITION_NAME <>", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameGreaterThan(String value) {
            addCriterion("SUBPARTITION_NAME >", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBPARTITION_NAME >=", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameLessThan(String value) {
            addCriterion("SUBPARTITION_NAME <", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameLessThanOrEqualTo(String value) {
            addCriterion("SUBPARTITION_NAME <=", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameLike(String value) {
            addCriterion("SUBPARTITION_NAME like", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameNotLike(String value) {
            addCriterion("SUBPARTITION_NAME not like", value, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameIn(List<String> values) {
            addCriterion("SUBPARTITION_NAME in", values, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameNotIn(List<String> values) {
            addCriterion("SUBPARTITION_NAME not in", values, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameBetween(String value1, String value2) {
            addCriterion("SUBPARTITION_NAME between", value1, value2, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andSubpartitionNameNotBetween(String value1, String value2) {
            addCriterion("SUBPARTITION_NAME not between", value1, value2, "subpartitionName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNull() {
            addCriterion("INDEX_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNotNull() {
            addCriterion("INDEX_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNameEqualTo(String value) {
            addCriterion("INDEX_NAME =", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotEqualTo(String value) {
            addCriterion("INDEX_NAME <>", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThan(String value) {
            addCriterion("INDEX_NAME >", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_NAME >=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThan(String value) {
            addCriterion("INDEX_NAME <", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThanOrEqualTo(String value) {
            addCriterion("INDEX_NAME <=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLike(String value) {
            addCriterion("INDEX_NAME like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotLike(String value) {
            addCriterion("INDEX_NAME not like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIn(List<String> values) {
            addCriterion("INDEX_NAME in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotIn(List<String> values) {
            addCriterion("INDEX_NAME not in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameBetween(String value1, String value2) {
            addCriterion("INDEX_NAME between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotBetween(String value1, String value2) {
            addCriterion("INDEX_NAME not between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginIsNull() {
            addCriterion("OBJECT_INSTANCE_BEGIN is null");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginIsNotNull() {
            addCriterion("OBJECT_INSTANCE_BEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN =", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginNotEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN <>", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginGreaterThan(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN >", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginGreaterThanOrEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN >=", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginLessThan(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN <", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginLessThanOrEqualTo(Long value) {
            addCriterion("OBJECT_INSTANCE_BEGIN <=", value, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginIn(List<Long> values) {
            addCriterion("OBJECT_INSTANCE_BEGIN in", values, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginNotIn(List<Long> values) {
            addCriterion("OBJECT_INSTANCE_BEGIN not in", values, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginBetween(Long value1, Long value2) {
            addCriterion("OBJECT_INSTANCE_BEGIN between", value1, value2, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andObjectInstanceBeginNotBetween(Long value1, Long value2) {
            addCriterion("OBJECT_INSTANCE_BEGIN not between", value1, value2, "objectInstanceBegin");
            return (Criteria) this;
        }

        public Criteria andLockTypeIsNull() {
            addCriterion("LOCK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLockTypeIsNotNull() {
            addCriterion("LOCK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLockTypeEqualTo(String value) {
            addCriterion("LOCK_TYPE =", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeNotEqualTo(String value) {
            addCriterion("LOCK_TYPE <>", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeGreaterThan(String value) {
            addCriterion("LOCK_TYPE >", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_TYPE >=", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeLessThan(String value) {
            addCriterion("LOCK_TYPE <", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeLessThanOrEqualTo(String value) {
            addCriterion("LOCK_TYPE <=", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeLike(String value) {
            addCriterion("LOCK_TYPE like", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeNotLike(String value) {
            addCriterion("LOCK_TYPE not like", value, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeIn(List<String> values) {
            addCriterion("LOCK_TYPE in", values, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeNotIn(List<String> values) {
            addCriterion("LOCK_TYPE not in", values, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeBetween(String value1, String value2) {
            addCriterion("LOCK_TYPE between", value1, value2, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockTypeNotBetween(String value1, String value2) {
            addCriterion("LOCK_TYPE not between", value1, value2, "lockType");
            return (Criteria) this;
        }

        public Criteria andLockModeIsNull() {
            addCriterion("LOCK_MODE is null");
            return (Criteria) this;
        }

        public Criteria andLockModeIsNotNull() {
            addCriterion("LOCK_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andLockModeEqualTo(String value) {
            addCriterion("LOCK_MODE =", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeNotEqualTo(String value) {
            addCriterion("LOCK_MODE <>", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeGreaterThan(String value) {
            addCriterion("LOCK_MODE >", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_MODE >=", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeLessThan(String value) {
            addCriterion("LOCK_MODE <", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeLessThanOrEqualTo(String value) {
            addCriterion("LOCK_MODE <=", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeLike(String value) {
            addCriterion("LOCK_MODE like", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeNotLike(String value) {
            addCriterion("LOCK_MODE not like", value, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeIn(List<String> values) {
            addCriterion("LOCK_MODE in", values, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeNotIn(List<String> values) {
            addCriterion("LOCK_MODE not in", values, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeBetween(String value1, String value2) {
            addCriterion("LOCK_MODE between", value1, value2, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockModeNotBetween(String value1, String value2) {
            addCriterion("LOCK_MODE not between", value1, value2, "lockMode");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("LOCK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("LOCK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(String value) {
            addCriterion("LOCK_STATUS =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(String value) {
            addCriterion("LOCK_STATUS <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(String value) {
            addCriterion("LOCK_STATUS >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_STATUS >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(String value) {
            addCriterion("LOCK_STATUS <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(String value) {
            addCriterion("LOCK_STATUS <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLike(String value) {
            addCriterion("LOCK_STATUS like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotLike(String value) {
            addCriterion("LOCK_STATUS not like", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<String> values) {
            addCriterion("LOCK_STATUS in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<String> values) {
            addCriterion("LOCK_STATUS not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(String value1, String value2) {
            addCriterion("LOCK_STATUS between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(String value1, String value2) {
            addCriterion("LOCK_STATUS not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockDataIsNull() {
            addCriterion("LOCK_DATA is null");
            return (Criteria) this;
        }

        public Criteria andLockDataIsNotNull() {
            addCriterion("LOCK_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andLockDataEqualTo(String value) {
            addCriterion("LOCK_DATA =", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataNotEqualTo(String value) {
            addCriterion("LOCK_DATA <>", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataGreaterThan(String value) {
            addCriterion("LOCK_DATA >", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_DATA >=", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataLessThan(String value) {
            addCriterion("LOCK_DATA <", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataLessThanOrEqualTo(String value) {
            addCriterion("LOCK_DATA <=", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataLike(String value) {
            addCriterion("LOCK_DATA like", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataNotLike(String value) {
            addCriterion("LOCK_DATA not like", value, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataIn(List<String> values) {
            addCriterion("LOCK_DATA in", values, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataNotIn(List<String> values) {
            addCriterion("LOCK_DATA not in", values, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataBetween(String value1, String value2) {
            addCriterion("LOCK_DATA between", value1, value2, "lockData");
            return (Criteria) this;
        }

        public Criteria andLockDataNotBetween(String value1, String value2) {
            addCriterion("LOCK_DATA not between", value1, value2, "lockData");
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