package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class MetadataLocksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MetadataLocksExample() {
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

        public Criteria andObjectTypeIsNull() {
            addCriterion("OBJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIsNotNull() {
            addCriterion("OBJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObjectTypeEqualTo(String value) {
            addCriterion("OBJECT_TYPE =", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotEqualTo(String value) {
            addCriterion("OBJECT_TYPE <>", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThan(String value) {
            addCriterion("OBJECT_TYPE >", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJECT_TYPE >=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThan(String value) {
            addCriterion("OBJECT_TYPE <", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJECT_TYPE <=", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeLike(String value) {
            addCriterion("OBJECT_TYPE like", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotLike(String value) {
            addCriterion("OBJECT_TYPE not like", value, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeIn(List<String> values) {
            addCriterion("OBJECT_TYPE in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotIn(List<String> values) {
            addCriterion("OBJECT_TYPE not in", values, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeBetween(String value1, String value2) {
            addCriterion("OBJECT_TYPE between", value1, value2, "objectType");
            return (Criteria) this;
        }

        public Criteria andObjectTypeNotBetween(String value1, String value2) {
            addCriterion("OBJECT_TYPE not between", value1, value2, "objectType");
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

        public Criteria andColumnNameIsNull() {
            addCriterion("COLUMN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("COLUMN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("COLUMN_NAME =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("COLUMN_NAME <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("COLUMN_NAME >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("COLUMN_NAME <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("COLUMN_NAME like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("COLUMN_NAME not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("COLUMN_NAME in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("COLUMN_NAME not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME not between", value1, value2, "columnName");
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

        public Criteria andLockDurationIsNull() {
            addCriterion("LOCK_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andLockDurationIsNotNull() {
            addCriterion("LOCK_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andLockDurationEqualTo(String value) {
            addCriterion("LOCK_DURATION =", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationNotEqualTo(String value) {
            addCriterion("LOCK_DURATION <>", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationGreaterThan(String value) {
            addCriterion("LOCK_DURATION >", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_DURATION >=", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationLessThan(String value) {
            addCriterion("LOCK_DURATION <", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationLessThanOrEqualTo(String value) {
            addCriterion("LOCK_DURATION <=", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationLike(String value) {
            addCriterion("LOCK_DURATION like", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationNotLike(String value) {
            addCriterion("LOCK_DURATION not like", value, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationIn(List<String> values) {
            addCriterion("LOCK_DURATION in", values, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationNotIn(List<String> values) {
            addCriterion("LOCK_DURATION not in", values, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationBetween(String value1, String value2) {
            addCriterion("LOCK_DURATION between", value1, value2, "lockDuration");
            return (Criteria) this;
        }

        public Criteria andLockDurationNotBetween(String value1, String value2) {
            addCriterion("LOCK_DURATION not between", value1, value2, "lockDuration");
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

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdIsNull() {
            addCriterion("OWNER_THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdIsNotNull() {
            addCriterion("OWNER_THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdEqualTo(Long value) {
            addCriterion("OWNER_THREAD_ID =", value, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdNotEqualTo(Long value) {
            addCriterion("OWNER_THREAD_ID <>", value, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdGreaterThan(Long value) {
            addCriterion("OWNER_THREAD_ID >", value, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OWNER_THREAD_ID >=", value, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdLessThan(Long value) {
            addCriterion("OWNER_THREAD_ID <", value, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("OWNER_THREAD_ID <=", value, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdIn(List<Long> values) {
            addCriterion("OWNER_THREAD_ID in", values, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdNotIn(List<Long> values) {
            addCriterion("OWNER_THREAD_ID not in", values, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdBetween(Long value1, Long value2) {
            addCriterion("OWNER_THREAD_ID between", value1, value2, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("OWNER_THREAD_ID not between", value1, value2, "ownerThreadId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdIsNull() {
            addCriterion("OWNER_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdIsNotNull() {
            addCriterion("OWNER_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdEqualTo(Long value) {
            addCriterion("OWNER_EVENT_ID =", value, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdNotEqualTo(Long value) {
            addCriterion("OWNER_EVENT_ID <>", value, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdGreaterThan(Long value) {
            addCriterion("OWNER_EVENT_ID >", value, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OWNER_EVENT_ID >=", value, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdLessThan(Long value) {
            addCriterion("OWNER_EVENT_ID <", value, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdLessThanOrEqualTo(Long value) {
            addCriterion("OWNER_EVENT_ID <=", value, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdIn(List<Long> values) {
            addCriterion("OWNER_EVENT_ID in", values, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdNotIn(List<Long> values) {
            addCriterion("OWNER_EVENT_ID not in", values, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdBetween(Long value1, Long value2) {
            addCriterion("OWNER_EVENT_ID between", value1, value2, "ownerEventId");
            return (Criteria) this;
        }

        public Criteria andOwnerEventIdNotBetween(Long value1, Long value2) {
            addCriterion("OWNER_EVENT_ID not between", value1, value2, "ownerEventId");
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