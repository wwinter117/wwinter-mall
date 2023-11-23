package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class PreparedStatementsInstancesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreparedStatementsInstancesExample() {
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

        public Criteria andStatementIdIsNull() {
            addCriterion("STATEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatementIdIsNotNull() {
            addCriterion("STATEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatementIdEqualTo(Long value) {
            addCriterion("STATEMENT_ID =", value, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdNotEqualTo(Long value) {
            addCriterion("STATEMENT_ID <>", value, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdGreaterThan(Long value) {
            addCriterion("STATEMENT_ID >", value, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdGreaterThanOrEqualTo(Long value) {
            addCriterion("STATEMENT_ID >=", value, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdLessThan(Long value) {
            addCriterion("STATEMENT_ID <", value, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdLessThanOrEqualTo(Long value) {
            addCriterion("STATEMENT_ID <=", value, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdIn(List<Long> values) {
            addCriterion("STATEMENT_ID in", values, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdNotIn(List<Long> values) {
            addCriterion("STATEMENT_ID not in", values, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdBetween(Long value1, Long value2) {
            addCriterion("STATEMENT_ID between", value1, value2, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementIdNotBetween(Long value1, Long value2) {
            addCriterion("STATEMENT_ID not between", value1, value2, "statementId");
            return (Criteria) this;
        }

        public Criteria andStatementNameIsNull() {
            addCriterion("STATEMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStatementNameIsNotNull() {
            addCriterion("STATEMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStatementNameEqualTo(String value) {
            addCriterion("STATEMENT_NAME =", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameNotEqualTo(String value) {
            addCriterion("STATEMENT_NAME <>", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameGreaterThan(String value) {
            addCriterion("STATEMENT_NAME >", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameGreaterThanOrEqualTo(String value) {
            addCriterion("STATEMENT_NAME >=", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameLessThan(String value) {
            addCriterion("STATEMENT_NAME <", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameLessThanOrEqualTo(String value) {
            addCriterion("STATEMENT_NAME <=", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameLike(String value) {
            addCriterion("STATEMENT_NAME like", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameNotLike(String value) {
            addCriterion("STATEMENT_NAME not like", value, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameIn(List<String> values) {
            addCriterion("STATEMENT_NAME in", values, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameNotIn(List<String> values) {
            addCriterion("STATEMENT_NAME not in", values, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameBetween(String value1, String value2) {
            addCriterion("STATEMENT_NAME between", value1, value2, "statementName");
            return (Criteria) this;
        }

        public Criteria andStatementNameNotBetween(String value1, String value2) {
            addCriterion("STATEMENT_NAME not between", value1, value2, "statementName");
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

        public Criteria andOwnerObjectTypeIsNull() {
            addCriterion("OWNER_OBJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeIsNotNull() {
            addCriterion("OWNER_OBJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeEqualTo(String value) {
            addCriterion("OWNER_OBJECT_TYPE =", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeNotEqualTo(String value) {
            addCriterion("OWNER_OBJECT_TYPE <>", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeGreaterThan(String value) {
            addCriterion("OWNER_OBJECT_TYPE >", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_OBJECT_TYPE >=", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeLessThan(String value) {
            addCriterion("OWNER_OBJECT_TYPE <", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeLessThanOrEqualTo(String value) {
            addCriterion("OWNER_OBJECT_TYPE <=", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeLike(String value) {
            addCriterion("OWNER_OBJECT_TYPE like", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeNotLike(String value) {
            addCriterion("OWNER_OBJECT_TYPE not like", value, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeIn(List<String> values) {
            addCriterion("OWNER_OBJECT_TYPE in", values, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeNotIn(List<String> values) {
            addCriterion("OWNER_OBJECT_TYPE not in", values, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeBetween(String value1, String value2) {
            addCriterion("OWNER_OBJECT_TYPE between", value1, value2, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectTypeNotBetween(String value1, String value2) {
            addCriterion("OWNER_OBJECT_TYPE not between", value1, value2, "ownerObjectType");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaIsNull() {
            addCriterion("OWNER_OBJECT_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaIsNotNull() {
            addCriterion("OWNER_OBJECT_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaEqualTo(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA =", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaNotEqualTo(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA <>", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaGreaterThan(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA >", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA >=", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaLessThan(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA <", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaLessThanOrEqualTo(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA <=", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaLike(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA like", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaNotLike(String value) {
            addCriterion("OWNER_OBJECT_SCHEMA not like", value, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaIn(List<String> values) {
            addCriterion("OWNER_OBJECT_SCHEMA in", values, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaNotIn(List<String> values) {
            addCriterion("OWNER_OBJECT_SCHEMA not in", values, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaBetween(String value1, String value2) {
            addCriterion("OWNER_OBJECT_SCHEMA between", value1, value2, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectSchemaNotBetween(String value1, String value2) {
            addCriterion("OWNER_OBJECT_SCHEMA not between", value1, value2, "ownerObjectSchema");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameIsNull() {
            addCriterion("OWNER_OBJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameIsNotNull() {
            addCriterion("OWNER_OBJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameEqualTo(String value) {
            addCriterion("OWNER_OBJECT_NAME =", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameNotEqualTo(String value) {
            addCriterion("OWNER_OBJECT_NAME <>", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameGreaterThan(String value) {
            addCriterion("OWNER_OBJECT_NAME >", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_OBJECT_NAME >=", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameLessThan(String value) {
            addCriterion("OWNER_OBJECT_NAME <", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameLessThanOrEqualTo(String value) {
            addCriterion("OWNER_OBJECT_NAME <=", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameLike(String value) {
            addCriterion("OWNER_OBJECT_NAME like", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameNotLike(String value) {
            addCriterion("OWNER_OBJECT_NAME not like", value, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameIn(List<String> values) {
            addCriterion("OWNER_OBJECT_NAME in", values, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameNotIn(List<String> values) {
            addCriterion("OWNER_OBJECT_NAME not in", values, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameBetween(String value1, String value2) {
            addCriterion("OWNER_OBJECT_NAME between", value1, value2, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andOwnerObjectNameNotBetween(String value1, String value2) {
            addCriterion("OWNER_OBJECT_NAME not between", value1, value2, "ownerObjectName");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineIsNull() {
            addCriterion("EXECUTION_ENGINE is null");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineIsNotNull() {
            addCriterion("EXECUTION_ENGINE is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineEqualTo(String value) {
            addCriterion("EXECUTION_ENGINE =", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineNotEqualTo(String value) {
            addCriterion("EXECUTION_ENGINE <>", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineGreaterThan(String value) {
            addCriterion("EXECUTION_ENGINE >", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ENGINE >=", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineLessThan(String value) {
            addCriterion("EXECUTION_ENGINE <", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineLessThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ENGINE <=", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineLike(String value) {
            addCriterion("EXECUTION_ENGINE like", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineNotLike(String value) {
            addCriterion("EXECUTION_ENGINE not like", value, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineIn(List<String> values) {
            addCriterion("EXECUTION_ENGINE in", values, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineNotIn(List<String> values) {
            addCriterion("EXECUTION_ENGINE not in", values, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineBetween(String value1, String value2) {
            addCriterion("EXECUTION_ENGINE between", value1, value2, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andExecutionEngineNotBetween(String value1, String value2) {
            addCriterion("EXECUTION_ENGINE not between", value1, value2, "executionEngine");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareIsNull() {
            addCriterion("TIMER_PREPARE is null");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareIsNotNull() {
            addCriterion("TIMER_PREPARE is not null");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareEqualTo(Long value) {
            addCriterion("TIMER_PREPARE =", value, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareNotEqualTo(Long value) {
            addCriterion("TIMER_PREPARE <>", value, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareGreaterThan(Long value) {
            addCriterion("TIMER_PREPARE >", value, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_PREPARE >=", value, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareLessThan(Long value) {
            addCriterion("TIMER_PREPARE <", value, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_PREPARE <=", value, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareIn(List<Long> values) {
            addCriterion("TIMER_PREPARE in", values, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareNotIn(List<Long> values) {
            addCriterion("TIMER_PREPARE not in", values, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareBetween(Long value1, Long value2) {
            addCriterion("TIMER_PREPARE between", value1, value2, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andTimerPrepareNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_PREPARE not between", value1, value2, "timerPrepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareIsNull() {
            addCriterion("COUNT_REPREPARE is null");
            return (Criteria) this;
        }

        public Criteria andCountReprepareIsNotNull() {
            addCriterion("COUNT_REPREPARE is not null");
            return (Criteria) this;
        }

        public Criteria andCountReprepareEqualTo(Long value) {
            addCriterion("COUNT_REPREPARE =", value, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareNotEqualTo(Long value) {
            addCriterion("COUNT_REPREPARE <>", value, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareGreaterThan(Long value) {
            addCriterion("COUNT_REPREPARE >", value, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_REPREPARE >=", value, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareLessThan(Long value) {
            addCriterion("COUNT_REPREPARE <", value, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_REPREPARE <=", value, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareIn(List<Long> values) {
            addCriterion("COUNT_REPREPARE in", values, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareNotIn(List<Long> values) {
            addCriterion("COUNT_REPREPARE not in", values, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareBetween(Long value1, Long value2) {
            addCriterion("COUNT_REPREPARE between", value1, value2, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountReprepareNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_REPREPARE not between", value1, value2, "countReprepare");
            return (Criteria) this;
        }

        public Criteria andCountExecuteIsNull() {
            addCriterion("COUNT_EXECUTE is null");
            return (Criteria) this;
        }

        public Criteria andCountExecuteIsNotNull() {
            addCriterion("COUNT_EXECUTE is not null");
            return (Criteria) this;
        }

        public Criteria andCountExecuteEqualTo(Long value) {
            addCriterion("COUNT_EXECUTE =", value, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteNotEqualTo(Long value) {
            addCriterion("COUNT_EXECUTE <>", value, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteGreaterThan(Long value) {
            addCriterion("COUNT_EXECUTE >", value, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_EXECUTE >=", value, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteLessThan(Long value) {
            addCriterion("COUNT_EXECUTE <", value, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_EXECUTE <=", value, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteIn(List<Long> values) {
            addCriterion("COUNT_EXECUTE in", values, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteNotIn(List<Long> values) {
            addCriterion("COUNT_EXECUTE not in", values, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteBetween(Long value1, Long value2) {
            addCriterion("COUNT_EXECUTE between", value1, value2, "countExecute");
            return (Criteria) this;
        }

        public Criteria andCountExecuteNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_EXECUTE not between", value1, value2, "countExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteIsNull() {
            addCriterion("SUM_TIMER_EXECUTE is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteIsNotNull() {
            addCriterion("SUM_TIMER_EXECUTE is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteEqualTo(Long value) {
            addCriterion("SUM_TIMER_EXECUTE =", value, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_EXECUTE <>", value, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteGreaterThan(Long value) {
            addCriterion("SUM_TIMER_EXECUTE >", value, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_EXECUTE >=", value, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteLessThan(Long value) {
            addCriterion("SUM_TIMER_EXECUTE <", value, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_EXECUTE <=", value, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteIn(List<Long> values) {
            addCriterion("SUM_TIMER_EXECUTE in", values, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_EXECUTE not in", values, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_EXECUTE between", value1, value2, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumTimerExecuteNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_EXECUTE not between", value1, value2, "sumTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteIsNull() {
            addCriterion("MIN_TIMER_EXECUTE is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteIsNotNull() {
            addCriterion("MIN_TIMER_EXECUTE is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteEqualTo(Long value) {
            addCriterion("MIN_TIMER_EXECUTE =", value, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_EXECUTE <>", value, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteGreaterThan(Long value) {
            addCriterion("MIN_TIMER_EXECUTE >", value, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_EXECUTE >=", value, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteLessThan(Long value) {
            addCriterion("MIN_TIMER_EXECUTE <", value, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_EXECUTE <=", value, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteIn(List<Long> values) {
            addCriterion("MIN_TIMER_EXECUTE in", values, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_EXECUTE not in", values, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_EXECUTE between", value1, value2, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMinTimerExecuteNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_EXECUTE not between", value1, value2, "minTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteIsNull() {
            addCriterion("AVG_TIMER_EXECUTE is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteIsNotNull() {
            addCriterion("AVG_TIMER_EXECUTE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteEqualTo(Long value) {
            addCriterion("AVG_TIMER_EXECUTE =", value, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_EXECUTE <>", value, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteGreaterThan(Long value) {
            addCriterion("AVG_TIMER_EXECUTE >", value, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_EXECUTE >=", value, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteLessThan(Long value) {
            addCriterion("AVG_TIMER_EXECUTE <", value, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_EXECUTE <=", value, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteIn(List<Long> values) {
            addCriterion("AVG_TIMER_EXECUTE in", values, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_EXECUTE not in", values, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_EXECUTE between", value1, value2, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andAvgTimerExecuteNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_EXECUTE not between", value1, value2, "avgTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteIsNull() {
            addCriterion("MAX_TIMER_EXECUTE is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteIsNotNull() {
            addCriterion("MAX_TIMER_EXECUTE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteEqualTo(Long value) {
            addCriterion("MAX_TIMER_EXECUTE =", value, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_EXECUTE <>", value, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteGreaterThan(Long value) {
            addCriterion("MAX_TIMER_EXECUTE >", value, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_EXECUTE >=", value, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteLessThan(Long value) {
            addCriterion("MAX_TIMER_EXECUTE <", value, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_EXECUTE <=", value, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteIn(List<Long> values) {
            addCriterion("MAX_TIMER_EXECUTE in", values, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_EXECUTE not in", values, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_EXECUTE between", value1, value2, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andMaxTimerExecuteNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_EXECUTE not between", value1, value2, "maxTimerExecute");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeIsNull() {
            addCriterion("SUM_LOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeIsNotNull() {
            addCriterion("SUM_LOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME =", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeNotEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME <>", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeGreaterThan(Long value) {
            addCriterion("SUM_LOCK_TIME >", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME >=", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeLessThan(Long value) {
            addCriterion("SUM_LOCK_TIME <", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_LOCK_TIME <=", value, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeIn(List<Long> values) {
            addCriterion("SUM_LOCK_TIME in", values, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeNotIn(List<Long> values) {
            addCriterion("SUM_LOCK_TIME not in", values, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeBetween(Long value1, Long value2) {
            addCriterion("SUM_LOCK_TIME between", value1, value2, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumLockTimeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_LOCK_TIME not between", value1, value2, "sumLockTime");
            return (Criteria) this;
        }

        public Criteria andSumErrorsIsNull() {
            addCriterion("SUM_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andSumErrorsIsNotNull() {
            addCriterion("SUM_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andSumErrorsEqualTo(Long value) {
            addCriterion("SUM_ERRORS =", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsNotEqualTo(Long value) {
            addCriterion("SUM_ERRORS <>", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsGreaterThan(Long value) {
            addCriterion("SUM_ERRORS >", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ERRORS >=", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsLessThan(Long value) {
            addCriterion("SUM_ERRORS <", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ERRORS <=", value, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsIn(List<Long> values) {
            addCriterion("SUM_ERRORS in", values, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsNotIn(List<Long> values) {
            addCriterion("SUM_ERRORS not in", values, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsBetween(Long value1, Long value2) {
            addCriterion("SUM_ERRORS between", value1, value2, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumErrorsNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ERRORS not between", value1, value2, "sumErrors");
            return (Criteria) this;
        }

        public Criteria andSumWarningsIsNull() {
            addCriterion("SUM_WARNINGS is null");
            return (Criteria) this;
        }

        public Criteria andSumWarningsIsNotNull() {
            addCriterion("SUM_WARNINGS is not null");
            return (Criteria) this;
        }

        public Criteria andSumWarningsEqualTo(Long value) {
            addCriterion("SUM_WARNINGS =", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsNotEqualTo(Long value) {
            addCriterion("SUM_WARNINGS <>", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsGreaterThan(Long value) {
            addCriterion("SUM_WARNINGS >", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_WARNINGS >=", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsLessThan(Long value) {
            addCriterion("SUM_WARNINGS <", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsLessThanOrEqualTo(Long value) {
            addCriterion("SUM_WARNINGS <=", value, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsIn(List<Long> values) {
            addCriterion("SUM_WARNINGS in", values, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsNotIn(List<Long> values) {
            addCriterion("SUM_WARNINGS not in", values, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsBetween(Long value1, Long value2) {
            addCriterion("SUM_WARNINGS between", value1, value2, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumWarningsNotBetween(Long value1, Long value2) {
            addCriterion("SUM_WARNINGS not between", value1, value2, "sumWarnings");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedIsNull() {
            addCriterion("SUM_ROWS_AFFECTED is null");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedIsNotNull() {
            addCriterion("SUM_ROWS_AFFECTED is not null");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED =", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedNotEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED <>", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedGreaterThan(Long value) {
            addCriterion("SUM_ROWS_AFFECTED >", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED >=", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedLessThan(Long value) {
            addCriterion("SUM_ROWS_AFFECTED <", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_AFFECTED <=", value, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedIn(List<Long> values) {
            addCriterion("SUM_ROWS_AFFECTED in", values, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedNotIn(List<Long> values) {
            addCriterion("SUM_ROWS_AFFECTED not in", values, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_AFFECTED between", value1, value2, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsAffectedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_AFFECTED not between", value1, value2, "sumRowsAffected");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentIsNull() {
            addCriterion("SUM_ROWS_SENT is null");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentIsNotNull() {
            addCriterion("SUM_ROWS_SENT is not null");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT =", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentNotEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT <>", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentGreaterThan(Long value) {
            addCriterion("SUM_ROWS_SENT >", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT >=", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentLessThan(Long value) {
            addCriterion("SUM_ROWS_SENT <", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_SENT <=", value, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentIn(List<Long> values) {
            addCriterion("SUM_ROWS_SENT in", values, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentNotIn(List<Long> values) {
            addCriterion("SUM_ROWS_SENT not in", values, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_SENT between", value1, value2, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsSentNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_SENT not between", value1, value2, "sumRowsSent");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedIsNull() {
            addCriterion("SUM_ROWS_EXAMINED is null");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedIsNotNull() {
            addCriterion("SUM_ROWS_EXAMINED is not null");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED =", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedNotEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED <>", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedGreaterThan(Long value) {
            addCriterion("SUM_ROWS_EXAMINED >", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED >=", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedLessThan(Long value) {
            addCriterion("SUM_ROWS_EXAMINED <", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ROWS_EXAMINED <=", value, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedIn(List<Long> values) {
            addCriterion("SUM_ROWS_EXAMINED in", values, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedNotIn(List<Long> values) {
            addCriterion("SUM_ROWS_EXAMINED not in", values, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_EXAMINED between", value1, value2, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumRowsExaminedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ROWS_EXAMINED not between", value1, value2, "sumRowsExamined");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesIsNull() {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES is null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesIsNotNull() {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES is not null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES =", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesNotEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES <>", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesGreaterThan(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES >", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES >=", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesLessThan(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES <", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesLessThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES <=", value, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES in", values, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesNotIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES not in", values, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES between", value1, value2, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpDiskTablesNotBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_DISK_TABLES not between", value1, value2, "sumCreatedTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesIsNull() {
            addCriterion("SUM_CREATED_TMP_TABLES is null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesIsNotNull() {
            addCriterion("SUM_CREATED_TMP_TABLES is not null");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES =", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesNotEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES <>", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesGreaterThan(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES >", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES >=", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesLessThan(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES <", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesLessThanOrEqualTo(Long value) {
            addCriterion("SUM_CREATED_TMP_TABLES <=", value, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_TABLES in", values, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesNotIn(List<Long> values) {
            addCriterion("SUM_CREATED_TMP_TABLES not in", values, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_TABLES between", value1, value2, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumCreatedTmpTablesNotBetween(Long value1, Long value2) {
            addCriterion("SUM_CREATED_TMP_TABLES not between", value1, value2, "sumCreatedTmpTables");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinIsNull() {
            addCriterion("SUM_SELECT_FULL_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinIsNotNull() {
            addCriterion("SUM_SELECT_FULL_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN =", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN <>", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinGreaterThan(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN >", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN >=", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinLessThan(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN <", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_JOIN <=", value, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_JOIN in", values, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_JOIN not in", values, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_JOIN between", value1, value2, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullJoinNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_JOIN not between", value1, value2, "sumSelectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinIsNull() {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinIsNotNull() {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN =", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN <>", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinGreaterThan(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN >", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN >=", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinLessThan(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN <", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN <=", value, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN in", values, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN not in", values, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN between", value1, value2, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectFullRangeJoinNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_FULL_RANGE_JOIN not between", value1, value2, "sumSelectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeIsNull() {
            addCriterion("SUM_SELECT_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeIsNotNull() {
            addCriterion("SUM_SELECT_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE =", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE <>", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeGreaterThan(Long value) {
            addCriterion("SUM_SELECT_RANGE >", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE >=", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeLessThan(Long value) {
            addCriterion("SUM_SELECT_RANGE <", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE <=", value, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE in", values, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE not in", values, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE between", value1, value2, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE not between", value1, value2, "sumSelectRange");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckIsNull() {
            addCriterion("SUM_SELECT_RANGE_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckIsNotNull() {
            addCriterion("SUM_SELECT_RANGE_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK =", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK <>", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckGreaterThan(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK >", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK >=", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckLessThan(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK <", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_RANGE_CHECK <=", value, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE_CHECK in", values, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_RANGE_CHECK not in", values, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE_CHECK between", value1, value2, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectRangeCheckNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_RANGE_CHECK not between", value1, value2, "sumSelectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanIsNull() {
            addCriterion("SUM_SELECT_SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanIsNotNull() {
            addCriterion("SUM_SELECT_SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN =", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanNotEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN <>", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanGreaterThan(Long value) {
            addCriterion("SUM_SELECT_SCAN >", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN >=", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanLessThan(Long value) {
            addCriterion("SUM_SELECT_SCAN <", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SELECT_SCAN <=", value, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanIn(List<Long> values) {
            addCriterion("SUM_SELECT_SCAN in", values, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanNotIn(List<Long> values) {
            addCriterion("SUM_SELECT_SCAN not in", values, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_SCAN between", value1, value2, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSelectScanNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SELECT_SCAN not between", value1, value2, "sumSelectScan");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesIsNull() {
            addCriterion("SUM_SORT_MERGE_PASSES is null");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesIsNotNull() {
            addCriterion("SUM_SORT_MERGE_PASSES is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES =", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesNotEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES <>", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesGreaterThan(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES >", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES >=", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesLessThan(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES <", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_MERGE_PASSES <=", value, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesIn(List<Long> values) {
            addCriterion("SUM_SORT_MERGE_PASSES in", values, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesNotIn(List<Long> values) {
            addCriterion("SUM_SORT_MERGE_PASSES not in", values, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_MERGE_PASSES between", value1, value2, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortMergePassesNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_MERGE_PASSES not between", value1, value2, "sumSortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeIsNull() {
            addCriterion("SUM_SORT_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeIsNotNull() {
            addCriterion("SUM_SORT_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE =", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeNotEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE <>", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeGreaterThan(Long value) {
            addCriterion("SUM_SORT_RANGE >", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE >=", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeLessThan(Long value) {
            addCriterion("SUM_SORT_RANGE <", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_RANGE <=", value, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeIn(List<Long> values) {
            addCriterion("SUM_SORT_RANGE in", values, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeNotIn(List<Long> values) {
            addCriterion("SUM_SORT_RANGE not in", values, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_RANGE between", value1, value2, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRangeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_RANGE not between", value1, value2, "sumSortRange");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsIsNull() {
            addCriterion("SUM_SORT_ROWS is null");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsIsNotNull() {
            addCriterion("SUM_SORT_ROWS is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS =", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsNotEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS <>", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsGreaterThan(Long value) {
            addCriterion("SUM_SORT_ROWS >", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS >=", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsLessThan(Long value) {
            addCriterion("SUM_SORT_ROWS <", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_ROWS <=", value, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsIn(List<Long> values) {
            addCriterion("SUM_SORT_ROWS in", values, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsNotIn(List<Long> values) {
            addCriterion("SUM_SORT_ROWS not in", values, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_ROWS between", value1, value2, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortRowsNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_ROWS not between", value1, value2, "sumSortRows");
            return (Criteria) this;
        }

        public Criteria andSumSortScanIsNull() {
            addCriterion("SUM_SORT_SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSumSortScanIsNotNull() {
            addCriterion("SUM_SORT_SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSumSortScanEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN =", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanNotEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN <>", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanGreaterThan(Long value) {
            addCriterion("SUM_SORT_SCAN >", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN >=", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanLessThan(Long value) {
            addCriterion("SUM_SORT_SCAN <", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanLessThanOrEqualTo(Long value) {
            addCriterion("SUM_SORT_SCAN <=", value, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanIn(List<Long> values) {
            addCriterion("SUM_SORT_SCAN in", values, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanNotIn(List<Long> values) {
            addCriterion("SUM_SORT_SCAN not in", values, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_SCAN between", value1, value2, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumSortScanNotBetween(Long value1, Long value2) {
            addCriterion("SUM_SORT_SCAN not between", value1, value2, "sumSortScan");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedIsNull() {
            addCriterion("SUM_NO_INDEX_USED is null");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedIsNotNull() {
            addCriterion("SUM_NO_INDEX_USED is not null");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED =", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedNotEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED <>", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedGreaterThan(Long value) {
            addCriterion("SUM_NO_INDEX_USED >", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED >=", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedLessThan(Long value) {
            addCriterion("SUM_NO_INDEX_USED <", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_INDEX_USED <=", value, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedIn(List<Long> values) {
            addCriterion("SUM_NO_INDEX_USED in", values, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedNotIn(List<Long> values) {
            addCriterion("SUM_NO_INDEX_USED not in", values, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_INDEX_USED between", value1, value2, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoIndexUsedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_INDEX_USED not between", value1, value2, "sumNoIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedIsNull() {
            addCriterion("SUM_NO_GOOD_INDEX_USED is null");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedIsNotNull() {
            addCriterion("SUM_NO_GOOD_INDEX_USED is not null");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED =", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedNotEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED <>", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedGreaterThan(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED >", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED >=", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedLessThan(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED <", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NO_GOOD_INDEX_USED <=", value, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedIn(List<Long> values) {
            addCriterion("SUM_NO_GOOD_INDEX_USED in", values, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedNotIn(List<Long> values) {
            addCriterion("SUM_NO_GOOD_INDEX_USED not in", values, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_GOOD_INDEX_USED between", value1, value2, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumNoGoodIndexUsedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NO_GOOD_INDEX_USED not between", value1, value2, "sumNoGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeIsNull() {
            addCriterion("SUM_CPU_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeIsNotNull() {
            addCriterion("SUM_CPU_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeEqualTo(Long value) {
            addCriterion("SUM_CPU_TIME =", value, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeNotEqualTo(Long value) {
            addCriterion("SUM_CPU_TIME <>", value, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeGreaterThan(Long value) {
            addCriterion("SUM_CPU_TIME >", value, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_CPU_TIME >=", value, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeLessThan(Long value) {
            addCriterion("SUM_CPU_TIME <", value, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_CPU_TIME <=", value, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeIn(List<Long> values) {
            addCriterion("SUM_CPU_TIME in", values, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeNotIn(List<Long> values) {
            addCriterion("SUM_CPU_TIME not in", values, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeBetween(Long value1, Long value2) {
            addCriterion("SUM_CPU_TIME between", value1, value2, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andSumCpuTimeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_CPU_TIME not between", value1, value2, "sumCpuTime");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryIsNull() {
            addCriterion("MAX_CONTROLLED_MEMORY is null");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryIsNotNull() {
            addCriterion("MAX_CONTROLLED_MEMORY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryEqualTo(Long value) {
            addCriterion("MAX_CONTROLLED_MEMORY =", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryNotEqualTo(Long value) {
            addCriterion("MAX_CONTROLLED_MEMORY <>", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryGreaterThan(Long value) {
            addCriterion("MAX_CONTROLLED_MEMORY >", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_CONTROLLED_MEMORY >=", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryLessThan(Long value) {
            addCriterion("MAX_CONTROLLED_MEMORY <", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryLessThanOrEqualTo(Long value) {
            addCriterion("MAX_CONTROLLED_MEMORY <=", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryIn(List<Long> values) {
            addCriterion("MAX_CONTROLLED_MEMORY in", values, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryNotIn(List<Long> values) {
            addCriterion("MAX_CONTROLLED_MEMORY not in", values, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryBetween(Long value1, Long value2) {
            addCriterion("MAX_CONTROLLED_MEMORY between", value1, value2, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryNotBetween(Long value1, Long value2) {
            addCriterion("MAX_CONTROLLED_MEMORY not between", value1, value2, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryIsNull() {
            addCriterion("MAX_TOTAL_MEMORY is null");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryIsNotNull() {
            addCriterion("MAX_TOTAL_MEMORY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryEqualTo(Long value) {
            addCriterion("MAX_TOTAL_MEMORY =", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryNotEqualTo(Long value) {
            addCriterion("MAX_TOTAL_MEMORY <>", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryGreaterThan(Long value) {
            addCriterion("MAX_TOTAL_MEMORY >", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TOTAL_MEMORY >=", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryLessThan(Long value) {
            addCriterion("MAX_TOTAL_MEMORY <", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TOTAL_MEMORY <=", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryIn(List<Long> values) {
            addCriterion("MAX_TOTAL_MEMORY in", values, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryNotIn(List<Long> values) {
            addCriterion("MAX_TOTAL_MEMORY not in", values, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryBetween(Long value1, Long value2) {
            addCriterion("MAX_TOTAL_MEMORY between", value1, value2, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TOTAL_MEMORY not between", value1, value2, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryIsNull() {
            addCriterion("COUNT_SECONDARY is null");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryIsNotNull() {
            addCriterion("COUNT_SECONDARY is not null");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryEqualTo(Long value) {
            addCriterion("COUNT_SECONDARY =", value, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryNotEqualTo(Long value) {
            addCriterion("COUNT_SECONDARY <>", value, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryGreaterThan(Long value) {
            addCriterion("COUNT_SECONDARY >", value, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_SECONDARY >=", value, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryLessThan(Long value) {
            addCriterion("COUNT_SECONDARY <", value, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_SECONDARY <=", value, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryIn(List<Long> values) {
            addCriterion("COUNT_SECONDARY in", values, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryNotIn(List<Long> values) {
            addCriterion("COUNT_SECONDARY not in", values, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryBetween(Long value1, Long value2) {
            addCriterion("COUNT_SECONDARY between", value1, value2, "countSecondary");
            return (Criteria) this;
        }

        public Criteria andCountSecondaryNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_SECONDARY not between", value1, value2, "countSecondary");
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