package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class TableHandlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableHandlesExample() {
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

        public Criteria andInternalLockIsNull() {
            addCriterion("INTERNAL_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andInternalLockIsNotNull() {
            addCriterion("INTERNAL_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andInternalLockEqualTo(String value) {
            addCriterion("INTERNAL_LOCK =", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockNotEqualTo(String value) {
            addCriterion("INTERNAL_LOCK <>", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockGreaterThan(String value) {
            addCriterion("INTERNAL_LOCK >", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockGreaterThanOrEqualTo(String value) {
            addCriterion("INTERNAL_LOCK >=", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockLessThan(String value) {
            addCriterion("INTERNAL_LOCK <", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockLessThanOrEqualTo(String value) {
            addCriterion("INTERNAL_LOCK <=", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockLike(String value) {
            addCriterion("INTERNAL_LOCK like", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockNotLike(String value) {
            addCriterion("INTERNAL_LOCK not like", value, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockIn(List<String> values) {
            addCriterion("INTERNAL_LOCK in", values, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockNotIn(List<String> values) {
            addCriterion("INTERNAL_LOCK not in", values, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockBetween(String value1, String value2) {
            addCriterion("INTERNAL_LOCK between", value1, value2, "internalLock");
            return (Criteria) this;
        }

        public Criteria andInternalLockNotBetween(String value1, String value2) {
            addCriterion("INTERNAL_LOCK not between", value1, value2, "internalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockIsNull() {
            addCriterion("EXTERNAL_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andExternalLockIsNotNull() {
            addCriterion("EXTERNAL_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andExternalLockEqualTo(String value) {
            addCriterion("EXTERNAL_LOCK =", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockNotEqualTo(String value) {
            addCriterion("EXTERNAL_LOCK <>", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockGreaterThan(String value) {
            addCriterion("EXTERNAL_LOCK >", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockGreaterThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LOCK >=", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockLessThan(String value) {
            addCriterion("EXTERNAL_LOCK <", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockLessThanOrEqualTo(String value) {
            addCriterion("EXTERNAL_LOCK <=", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockLike(String value) {
            addCriterion("EXTERNAL_LOCK like", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockNotLike(String value) {
            addCriterion("EXTERNAL_LOCK not like", value, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockIn(List<String> values) {
            addCriterion("EXTERNAL_LOCK in", values, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockNotIn(List<String> values) {
            addCriterion("EXTERNAL_LOCK not in", values, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LOCK between", value1, value2, "externalLock");
            return (Criteria) this;
        }

        public Criteria andExternalLockNotBetween(String value1, String value2) {
            addCriterion("EXTERNAL_LOCK not between", value1, value2, "externalLock");
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