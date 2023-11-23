package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class TableLockWaitsSummaryByTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableLockWaitsSummaryByTableExample() {
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

        public Criteria andCountStarIsNull() {
            addCriterion("COUNT_STAR is null");
            return (Criteria) this;
        }

        public Criteria andCountStarIsNotNull() {
            addCriterion("COUNT_STAR is not null");
            return (Criteria) this;
        }

        public Criteria andCountStarEqualTo(Long value) {
            addCriterion("COUNT_STAR =", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarNotEqualTo(Long value) {
            addCriterion("COUNT_STAR <>", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarGreaterThan(Long value) {
            addCriterion("COUNT_STAR >", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_STAR >=", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarLessThan(Long value) {
            addCriterion("COUNT_STAR <", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_STAR <=", value, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarIn(List<Long> values) {
            addCriterion("COUNT_STAR in", values, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarNotIn(List<Long> values) {
            addCriterion("COUNT_STAR not in", values, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarBetween(Long value1, Long value2) {
            addCriterion("COUNT_STAR between", value1, value2, "countStar");
            return (Criteria) this;
        }

        public Criteria andCountStarNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_STAR not between", value1, value2, "countStar");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitIsNull() {
            addCriterion("SUM_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitIsNotNull() {
            addCriterion("SUM_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT =", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT <>", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WAIT >", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT >=", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitLessThan(Long value) {
            addCriterion("SUM_TIMER_WAIT <", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT <=", value, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitIn(List<Long> values) {
            addCriterion("SUM_TIMER_WAIT in", values, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WAIT not in", values, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WAIT between", value1, value2, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andSumTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WAIT not between", value1, value2, "sumTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitIsNull() {
            addCriterion("MIN_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitIsNotNull() {
            addCriterion("MIN_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT =", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT <>", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WAIT >", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT >=", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitLessThan(Long value) {
            addCriterion("MIN_TIMER_WAIT <", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT <=", value, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitIn(List<Long> values) {
            addCriterion("MIN_TIMER_WAIT in", values, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WAIT not in", values, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WAIT between", value1, value2, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andMinTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WAIT not between", value1, value2, "minTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitIsNull() {
            addCriterion("AVG_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitIsNotNull() {
            addCriterion("AVG_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT =", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT <>", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WAIT >", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT >=", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitLessThan(Long value) {
            addCriterion("AVG_TIMER_WAIT <", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT <=", value, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitIn(List<Long> values) {
            addCriterion("AVG_TIMER_WAIT in", values, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WAIT not in", values, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WAIT between", value1, value2, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WAIT not between", value1, value2, "avgTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitIsNull() {
            addCriterion("MAX_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitIsNotNull() {
            addCriterion("MAX_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT =", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT <>", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WAIT >", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT >=", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitLessThan(Long value) {
            addCriterion("MAX_TIMER_WAIT <", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT <=", value, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitIn(List<Long> values) {
            addCriterion("MAX_TIMER_WAIT in", values, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WAIT not in", values, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WAIT between", value1, value2, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WAIT not between", value1, value2, "maxTimerWait");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNull() {
            addCriterion("COUNT_READ is null");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNotNull() {
            addCriterion("COUNT_READ is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadEqualTo(Long value) {
            addCriterion("COUNT_READ =", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotEqualTo(Long value) {
            addCriterion("COUNT_READ <>", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThan(Long value) {
            addCriterion("COUNT_READ >", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ >=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThan(Long value) {
            addCriterion("COUNT_READ <", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ <=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadIn(List<Long> values) {
            addCriterion("COUNT_READ in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotIn(List<Long> values) {
            addCriterion("COUNT_READ not in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ not between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadIsNull() {
            addCriterion("SUM_TIMER_READ is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadIsNotNull() {
            addCriterion("SUM_TIMER_READ is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ =", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ <>", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ >", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ >=", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadLessThan(Long value) {
            addCriterion("SUM_TIMER_READ <", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ <=", value, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ in", values, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ not in", values, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ between", value1, value2, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ not between", value1, value2, "sumTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadIsNull() {
            addCriterion("MIN_TIMER_READ is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadIsNotNull() {
            addCriterion("MIN_TIMER_READ is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ =", value, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ <>", value, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ >", value, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ >=", value, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadLessThan(Long value) {
            addCriterion("MIN_TIMER_READ <", value, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ <=", value, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ in", values, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ not in", values, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ between", value1, value2, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ not between", value1, value2, "minTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadIsNull() {
            addCriterion("AVG_TIMER_READ is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadIsNotNull() {
            addCriterion("AVG_TIMER_READ is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ =", value, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ <>", value, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ >", value, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ >=", value, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadLessThan(Long value) {
            addCriterion("AVG_TIMER_READ <", value, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ <=", value, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ in", values, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ not in", values, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ between", value1, value2, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ not between", value1, value2, "avgTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadIsNull() {
            addCriterion("MAX_TIMER_READ is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadIsNotNull() {
            addCriterion("MAX_TIMER_READ is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ =", value, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ <>", value, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ >", value, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ >=", value, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadLessThan(Long value) {
            addCriterion("MAX_TIMER_READ <", value, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ <=", value, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ in", values, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ not in", values, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ between", value1, value2, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ not between", value1, value2, "maxTimerRead");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNull() {
            addCriterion("COUNT_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNotNull() {
            addCriterion("COUNT_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteEqualTo(Long value) {
            addCriterion("COUNT_WRITE =", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotEqualTo(Long value) {
            addCriterion("COUNT_WRITE <>", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThan(Long value) {
            addCriterion("COUNT_WRITE >", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE >=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThan(Long value) {
            addCriterion("COUNT_WRITE <", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE <=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteIn(List<Long> values) {
            addCriterion("COUNT_WRITE in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotIn(List<Long> values) {
            addCriterion("COUNT_WRITE not in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE not between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteIsNull() {
            addCriterion("SUM_TIMER_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteIsNotNull() {
            addCriterion("SUM_TIMER_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE =", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE <>", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WRITE >", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE >=", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLessThan(Long value) {
            addCriterion("SUM_TIMER_WRITE <", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE <=", value, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE in", values, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE not in", values, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE between", value1, value2, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE not between", value1, value2, "sumTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteIsNull() {
            addCriterion("MIN_TIMER_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteIsNotNull() {
            addCriterion("MIN_TIMER_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE =", value, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE <>", value, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WRITE >", value, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE >=", value, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLessThan(Long value) {
            addCriterion("MIN_TIMER_WRITE <", value, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE <=", value, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE in", values, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE not in", values, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE between", value1, value2, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE not between", value1, value2, "minTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteIsNull() {
            addCriterion("AVG_TIMER_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteIsNotNull() {
            addCriterion("AVG_TIMER_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE =", value, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE <>", value, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WRITE >", value, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE >=", value, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLessThan(Long value) {
            addCriterion("AVG_TIMER_WRITE <", value, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE <=", value, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE in", values, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE not in", values, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE between", value1, value2, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE not between", value1, value2, "avgTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteIsNull() {
            addCriterion("MAX_TIMER_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteIsNotNull() {
            addCriterion("MAX_TIMER_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE =", value, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE <>", value, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WRITE >", value, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE >=", value, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLessThan(Long value) {
            addCriterion("MAX_TIMER_WRITE <", value, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE <=", value, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE in", values, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE not in", values, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE between", value1, value2, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE not between", value1, value2, "maxTimerWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalIsNull() {
            addCriterion("COUNT_READ_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalIsNotNull() {
            addCriterion("COUNT_READ_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalEqualTo(Long value) {
            addCriterion("COUNT_READ_NORMAL =", value, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalNotEqualTo(Long value) {
            addCriterion("COUNT_READ_NORMAL <>", value, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalGreaterThan(Long value) {
            addCriterion("COUNT_READ_NORMAL >", value, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_NORMAL >=", value, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalLessThan(Long value) {
            addCriterion("COUNT_READ_NORMAL <", value, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_NORMAL <=", value, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalIn(List<Long> values) {
            addCriterion("COUNT_READ_NORMAL in", values, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalNotIn(List<Long> values) {
            addCriterion("COUNT_READ_NORMAL not in", values, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_NORMAL between", value1, value2, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadNormalNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_NORMAL not between", value1, value2, "countReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalIsNull() {
            addCriterion("SUM_TIMER_READ_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalIsNotNull() {
            addCriterion("SUM_TIMER_READ_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NORMAL =", value, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NORMAL <>", value, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ_NORMAL >", value, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NORMAL >=", value, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalLessThan(Long value) {
            addCriterion("SUM_TIMER_READ_NORMAL <", value, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NORMAL <=", value, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_NORMAL in", values, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_NORMAL not in", values, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_NORMAL between", value1, value2, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNormalNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_NORMAL not between", value1, value2, "sumTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalIsNull() {
            addCriterion("MIN_TIMER_READ_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalIsNotNull() {
            addCriterion("MIN_TIMER_READ_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NORMAL =", value, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NORMAL <>", value, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ_NORMAL >", value, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NORMAL >=", value, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalLessThan(Long value) {
            addCriterion("MIN_TIMER_READ_NORMAL <", value, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NORMAL <=", value, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_NORMAL in", values, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_NORMAL not in", values, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_NORMAL between", value1, value2, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNormalNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_NORMAL not between", value1, value2, "minTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalIsNull() {
            addCriterion("AVG_TIMER_READ_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalIsNotNull() {
            addCriterion("AVG_TIMER_READ_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NORMAL =", value, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NORMAL <>", value, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ_NORMAL >", value, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NORMAL >=", value, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalLessThan(Long value) {
            addCriterion("AVG_TIMER_READ_NORMAL <", value, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NORMAL <=", value, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_NORMAL in", values, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_NORMAL not in", values, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_NORMAL between", value1, value2, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNormalNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_NORMAL not between", value1, value2, "avgTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalIsNull() {
            addCriterion("MAX_TIMER_READ_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalIsNotNull() {
            addCriterion("MAX_TIMER_READ_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NORMAL =", value, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NORMAL <>", value, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ_NORMAL >", value, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NORMAL >=", value, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalLessThan(Long value) {
            addCriterion("MAX_TIMER_READ_NORMAL <", value, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NORMAL <=", value, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_NORMAL in", values, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_NORMAL not in", values, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_NORMAL between", value1, value2, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNormalNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_NORMAL not between", value1, value2, "maxTimerReadNormal");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksIsNull() {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS is null");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksIsNotNull() {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksEqualTo(Long value) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS =", value, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksNotEqualTo(Long value) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS <>", value, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksGreaterThan(Long value) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS >", value, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS >=", value, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksLessThan(Long value) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS <", value, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS <=", value, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksIn(List<Long> values) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS in", values, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksNotIn(List<Long> values) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS not in", values, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS between", value1, value2, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadWithSharedLocksNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_WITH_SHARED_LOCKS not between", value1, value2, "countReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksIsNull() {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksIsNotNull() {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS =", value, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS <>", value, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS >", value, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS >=", value, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksLessThan(Long value) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS <", value, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS <=", value, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS in", values, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS not in", values, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS between", value1, value2, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWithSharedLocksNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_WITH_SHARED_LOCKS not between", value1, value2, "sumTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksIsNull() {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksIsNotNull() {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS =", value, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS <>", value, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS >", value, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS >=", value, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksLessThan(Long value) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS <", value, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS <=", value, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS in", values, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS not in", values, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS between", value1, value2, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWithSharedLocksNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_WITH_SHARED_LOCKS not between", value1, value2, "minTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksIsNull() {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksIsNotNull() {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS =", value, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS <>", value, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS >", value, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS >=", value, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksLessThan(Long value) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS <", value, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS <=", value, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS in", values, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS not in", values, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS between", value1, value2, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWithSharedLocksNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_WITH_SHARED_LOCKS not between", value1, value2, "avgTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksIsNull() {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksIsNotNull() {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS =", value, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS <>", value, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS >", value, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS >=", value, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksLessThan(Long value) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS <", value, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS <=", value, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS in", values, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS not in", values, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS between", value1, value2, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWithSharedLocksNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_WITH_SHARED_LOCKS not between", value1, value2, "maxTimerReadWithSharedLocks");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityIsNull() {
            addCriterion("COUNT_READ_HIGH_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityIsNotNull() {
            addCriterion("COUNT_READ_HIGH_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityEqualTo(Long value) {
            addCriterion("COUNT_READ_HIGH_PRIORITY =", value, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityNotEqualTo(Long value) {
            addCriterion("COUNT_READ_HIGH_PRIORITY <>", value, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityGreaterThan(Long value) {
            addCriterion("COUNT_READ_HIGH_PRIORITY >", value, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_HIGH_PRIORITY >=", value, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityLessThan(Long value) {
            addCriterion("COUNT_READ_HIGH_PRIORITY <", value, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_HIGH_PRIORITY <=", value, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityIn(List<Long> values) {
            addCriterion("COUNT_READ_HIGH_PRIORITY in", values, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityNotIn(List<Long> values) {
            addCriterion("COUNT_READ_HIGH_PRIORITY not in", values, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_HIGH_PRIORITY between", value1, value2, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadHighPriorityNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_HIGH_PRIORITY not between", value1, value2, "countReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityIsNull() {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityIsNotNull() {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY =", value, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY <>", value, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY >", value, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY >=", value, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityLessThan(Long value) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY <", value, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY <=", value, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY in", values, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY not in", values, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY between", value1, value2, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadHighPriorityNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_HIGH_PRIORITY not between", value1, value2, "sumTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityIsNull() {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityIsNotNull() {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY =", value, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY <>", value, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY >", value, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY >=", value, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityLessThan(Long value) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY <", value, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY <=", value, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY in", values, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY not in", values, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY between", value1, value2, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadHighPriorityNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_HIGH_PRIORITY not between", value1, value2, "minTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityIsNull() {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityIsNotNull() {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY =", value, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY <>", value, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY >", value, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY >=", value, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityLessThan(Long value) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY <", value, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY <=", value, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY in", values, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY not in", values, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY between", value1, value2, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadHighPriorityNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_HIGH_PRIORITY not between", value1, value2, "avgTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityIsNull() {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityIsNotNull() {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY =", value, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY <>", value, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY >", value, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY >=", value, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityLessThan(Long value) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY <", value, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY <=", value, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY in", values, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY not in", values, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY between", value1, value2, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadHighPriorityNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_HIGH_PRIORITY not between", value1, value2, "maxTimerReadHighPriority");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertIsNull() {
            addCriterion("COUNT_READ_NO_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertIsNotNull() {
            addCriterion("COUNT_READ_NO_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertEqualTo(Long value) {
            addCriterion("COUNT_READ_NO_INSERT =", value, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertNotEqualTo(Long value) {
            addCriterion("COUNT_READ_NO_INSERT <>", value, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertGreaterThan(Long value) {
            addCriterion("COUNT_READ_NO_INSERT >", value, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_NO_INSERT >=", value, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertLessThan(Long value) {
            addCriterion("COUNT_READ_NO_INSERT <", value, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_NO_INSERT <=", value, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertIn(List<Long> values) {
            addCriterion("COUNT_READ_NO_INSERT in", values, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertNotIn(List<Long> values) {
            addCriterion("COUNT_READ_NO_INSERT not in", values, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_NO_INSERT between", value1, value2, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadNoInsertNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_NO_INSERT not between", value1, value2, "countReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertIsNull() {
            addCriterion("SUM_TIMER_READ_NO_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertIsNotNull() {
            addCriterion("SUM_TIMER_READ_NO_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NO_INSERT =", value, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NO_INSERT <>", value, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ_NO_INSERT >", value, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NO_INSERT >=", value, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertLessThan(Long value) {
            addCriterion("SUM_TIMER_READ_NO_INSERT <", value, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_NO_INSERT <=", value, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_NO_INSERT in", values, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_NO_INSERT not in", values, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_NO_INSERT between", value1, value2, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadNoInsertNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_NO_INSERT not between", value1, value2, "sumTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertIsNull() {
            addCriterion("MIN_TIMER_READ_NO_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertIsNotNull() {
            addCriterion("MIN_TIMER_READ_NO_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NO_INSERT =", value, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NO_INSERT <>", value, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ_NO_INSERT >", value, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NO_INSERT >=", value, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertLessThan(Long value) {
            addCriterion("MIN_TIMER_READ_NO_INSERT <", value, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_NO_INSERT <=", value, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_NO_INSERT in", values, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_NO_INSERT not in", values, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_NO_INSERT between", value1, value2, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadNoInsertNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_NO_INSERT not between", value1, value2, "minTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertIsNull() {
            addCriterion("AVG_TIMER_READ_NO_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertIsNotNull() {
            addCriterion("AVG_TIMER_READ_NO_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NO_INSERT =", value, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NO_INSERT <>", value, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ_NO_INSERT >", value, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NO_INSERT >=", value, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertLessThan(Long value) {
            addCriterion("AVG_TIMER_READ_NO_INSERT <", value, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_NO_INSERT <=", value, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_NO_INSERT in", values, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_NO_INSERT not in", values, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_NO_INSERT between", value1, value2, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadNoInsertNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_NO_INSERT not between", value1, value2, "avgTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertIsNull() {
            addCriterion("MAX_TIMER_READ_NO_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertIsNotNull() {
            addCriterion("MAX_TIMER_READ_NO_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NO_INSERT =", value, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NO_INSERT <>", value, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ_NO_INSERT >", value, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NO_INSERT >=", value, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertLessThan(Long value) {
            addCriterion("MAX_TIMER_READ_NO_INSERT <", value, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_NO_INSERT <=", value, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_NO_INSERT in", values, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_NO_INSERT not in", values, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_NO_INSERT between", value1, value2, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadNoInsertNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_NO_INSERT not between", value1, value2, "maxTimerReadNoInsert");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalIsNull() {
            addCriterion("COUNT_READ_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalIsNotNull() {
            addCriterion("COUNT_READ_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalEqualTo(Long value) {
            addCriterion("COUNT_READ_EXTERNAL =", value, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalNotEqualTo(Long value) {
            addCriterion("COUNT_READ_EXTERNAL <>", value, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalGreaterThan(Long value) {
            addCriterion("COUNT_READ_EXTERNAL >", value, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_EXTERNAL >=", value, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalLessThan(Long value) {
            addCriterion("COUNT_READ_EXTERNAL <", value, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_EXTERNAL <=", value, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalIn(List<Long> values) {
            addCriterion("COUNT_READ_EXTERNAL in", values, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalNotIn(List<Long> values) {
            addCriterion("COUNT_READ_EXTERNAL not in", values, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_EXTERNAL between", value1, value2, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountReadExternalNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_EXTERNAL not between", value1, value2, "countReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalIsNull() {
            addCriterion("SUM_TIMER_READ_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalIsNotNull() {
            addCriterion("SUM_TIMER_READ_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_EXTERNAL =", value, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_EXTERNAL <>", value, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ_EXTERNAL >", value, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_EXTERNAL >=", value, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalLessThan(Long value) {
            addCriterion("SUM_TIMER_READ_EXTERNAL <", value, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_EXTERNAL <=", value, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_EXTERNAL in", values, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_EXTERNAL not in", values, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_EXTERNAL between", value1, value2, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadExternalNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_EXTERNAL not between", value1, value2, "sumTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalIsNull() {
            addCriterion("MIN_TIMER_READ_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalIsNotNull() {
            addCriterion("MIN_TIMER_READ_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_EXTERNAL =", value, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_EXTERNAL <>", value, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ_EXTERNAL >", value, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_EXTERNAL >=", value, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalLessThan(Long value) {
            addCriterion("MIN_TIMER_READ_EXTERNAL <", value, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_EXTERNAL <=", value, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_EXTERNAL in", values, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_EXTERNAL not in", values, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_EXTERNAL between", value1, value2, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadExternalNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_EXTERNAL not between", value1, value2, "minTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalIsNull() {
            addCriterion("AVG_TIMER_READ_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalIsNotNull() {
            addCriterion("AVG_TIMER_READ_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_EXTERNAL =", value, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_EXTERNAL <>", value, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ_EXTERNAL >", value, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_EXTERNAL >=", value, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalLessThan(Long value) {
            addCriterion("AVG_TIMER_READ_EXTERNAL <", value, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_EXTERNAL <=", value, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_EXTERNAL in", values, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_EXTERNAL not in", values, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_EXTERNAL between", value1, value2, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadExternalNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_EXTERNAL not between", value1, value2, "avgTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalIsNull() {
            addCriterion("MAX_TIMER_READ_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalIsNotNull() {
            addCriterion("MAX_TIMER_READ_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_EXTERNAL =", value, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_EXTERNAL <>", value, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ_EXTERNAL >", value, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_EXTERNAL >=", value, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalLessThan(Long value) {
            addCriterion("MAX_TIMER_READ_EXTERNAL <", value, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_EXTERNAL <=", value, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_EXTERNAL in", values, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_EXTERNAL not in", values, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_EXTERNAL between", value1, value2, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadExternalNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_EXTERNAL not between", value1, value2, "maxTimerReadExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteIsNull() {
            addCriterion("COUNT_WRITE_ALLOW_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteIsNotNull() {
            addCriterion("COUNT_WRITE_ALLOW_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteEqualTo(Long value) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE =", value, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteNotEqualTo(Long value) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE <>", value, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteGreaterThan(Long value) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE >", value, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE >=", value, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteLessThan(Long value) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE <", value, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE <=", value, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteIn(List<Long> values) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE in", values, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteNotIn(List<Long> values) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE not in", values, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE between", value1, value2, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteAllowWriteNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_ALLOW_WRITE not between", value1, value2, "countWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteIsNull() {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteIsNotNull() {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE =", value, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE <>", value, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE >", value, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE >=", value, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteLessThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE <", value, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE <=", value, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE in", values, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE not in", values, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE between", value1, value2, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteAllowWriteNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_ALLOW_WRITE not between", value1, value2, "sumTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteIsNull() {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteIsNotNull() {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE =", value, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE <>", value, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE >", value, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE >=", value, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteLessThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE <", value, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE <=", value, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE in", values, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE not in", values, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE between", value1, value2, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteAllowWriteNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_ALLOW_WRITE not between", value1, value2, "minTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteIsNull() {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteIsNotNull() {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE =", value, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE <>", value, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE >", value, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE >=", value, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteLessThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE <", value, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE <=", value, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE in", values, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE not in", values, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE between", value1, value2, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteAllowWriteNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_ALLOW_WRITE not between", value1, value2, "avgTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteIsNull() {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteIsNotNull() {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE =", value, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE <>", value, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE >", value, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE >=", value, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteLessThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE <", value, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE <=", value, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE in", values, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE not in", values, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE between", value1, value2, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteAllowWriteNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_ALLOW_WRITE not between", value1, value2, "maxTimerWriteAllowWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertIsNull() {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertIsNotNull() {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertEqualTo(Long value) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT =", value, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertNotEqualTo(Long value) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT <>", value, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertGreaterThan(Long value) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT >", value, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT >=", value, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertLessThan(Long value) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT <", value, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT <=", value, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertIn(List<Long> values) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT in", values, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertNotIn(List<Long> values) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT not in", values, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT between", value1, value2, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteConcurrentInsertNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_CONCURRENT_INSERT not between", value1, value2, "countWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertIsNull() {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertIsNotNull() {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT =", value, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT <>", value, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT >", value, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT >=", value, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertLessThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT <", value, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT <=", value, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT in", values, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT not in", values, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT between", value1, value2, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteConcurrentInsertNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_CONCURRENT_INSERT not between", value1, value2, "sumTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertIsNull() {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertIsNotNull() {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT =", value, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT <>", value, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT >", value, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT >=", value, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertLessThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT <", value, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT <=", value, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT in", values, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT not in", values, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT between", value1, value2, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteConcurrentInsertNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_CONCURRENT_INSERT not between", value1, value2, "minTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertIsNull() {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertIsNotNull() {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT =", value, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT <>", value, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT >", value, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT >=", value, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertLessThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT <", value, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT <=", value, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT in", values, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT not in", values, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT between", value1, value2, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteConcurrentInsertNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_CONCURRENT_INSERT not between", value1, value2, "avgTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertIsNull() {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertIsNotNull() {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT =", value, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT <>", value, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT >", value, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT >=", value, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertLessThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT <", value, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT <=", value, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT in", values, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT not in", values, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT between", value1, value2, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteConcurrentInsertNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_CONCURRENT_INSERT not between", value1, value2, "maxTimerWriteConcurrentInsert");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityIsNull() {
            addCriterion("COUNT_WRITE_LOW_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityIsNotNull() {
            addCriterion("COUNT_WRITE_LOW_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityEqualTo(Long value) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY =", value, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityNotEqualTo(Long value) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY <>", value, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityGreaterThan(Long value) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY >", value, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY >=", value, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityLessThan(Long value) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY <", value, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY <=", value, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityIn(List<Long> values) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY in", values, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityNotIn(List<Long> values) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY not in", values, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY between", value1, value2, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteLowPriorityNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_LOW_PRIORITY not between", value1, value2, "countWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityIsNull() {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityIsNotNull() {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY =", value, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY <>", value, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY >", value, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY >=", value, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityLessThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY <", value, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY <=", value, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY in", values, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY not in", values, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY between", value1, value2, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteLowPriorityNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_LOW_PRIORITY not between", value1, value2, "sumTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityIsNull() {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityIsNotNull() {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY =", value, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY <>", value, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY >", value, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY >=", value, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityLessThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY <", value, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY <=", value, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY in", values, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY not in", values, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY between", value1, value2, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteLowPriorityNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_LOW_PRIORITY not between", value1, value2, "minTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityIsNull() {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityIsNotNull() {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY =", value, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY <>", value, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY >", value, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY >=", value, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityLessThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY <", value, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY <=", value, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY in", values, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY not in", values, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY between", value1, value2, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteLowPriorityNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_LOW_PRIORITY not between", value1, value2, "avgTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityIsNull() {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityIsNotNull() {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY =", value, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY <>", value, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY >", value, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY >=", value, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityLessThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY <", value, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY <=", value, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY in", values, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY not in", values, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY between", value1, value2, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteLowPriorityNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_LOW_PRIORITY not between", value1, value2, "maxTimerWriteLowPriority");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalIsNull() {
            addCriterion("COUNT_WRITE_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalIsNotNull() {
            addCriterion("COUNT_WRITE_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalEqualTo(Long value) {
            addCriterion("COUNT_WRITE_NORMAL =", value, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalNotEqualTo(Long value) {
            addCriterion("COUNT_WRITE_NORMAL <>", value, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalGreaterThan(Long value) {
            addCriterion("COUNT_WRITE_NORMAL >", value, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_NORMAL >=", value, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalLessThan(Long value) {
            addCriterion("COUNT_WRITE_NORMAL <", value, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_NORMAL <=", value, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalIn(List<Long> values) {
            addCriterion("COUNT_WRITE_NORMAL in", values, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalNotIn(List<Long> values) {
            addCriterion("COUNT_WRITE_NORMAL not in", values, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_NORMAL between", value1, value2, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteNormalNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_NORMAL not between", value1, value2, "countWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalIsNull() {
            addCriterion("SUM_TIMER_WRITE_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalIsNotNull() {
            addCriterion("SUM_TIMER_WRITE_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_NORMAL =", value, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_NORMAL <>", value, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_NORMAL >", value, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_NORMAL >=", value, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalLessThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_NORMAL <", value, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_NORMAL <=", value, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_NORMAL in", values, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_NORMAL not in", values, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_NORMAL between", value1, value2, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteNormalNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_NORMAL not between", value1, value2, "sumTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalIsNull() {
            addCriterion("MIN_TIMER_WRITE_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalIsNotNull() {
            addCriterion("MIN_TIMER_WRITE_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_NORMAL =", value, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_NORMAL <>", value, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_NORMAL >", value, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_NORMAL >=", value, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalLessThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_NORMAL <", value, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_NORMAL <=", value, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_NORMAL in", values, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_NORMAL not in", values, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_NORMAL between", value1, value2, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteNormalNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_NORMAL not between", value1, value2, "minTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalIsNull() {
            addCriterion("AVG_TIMER_WRITE_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalIsNotNull() {
            addCriterion("AVG_TIMER_WRITE_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_NORMAL =", value, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_NORMAL <>", value, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_NORMAL >", value, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_NORMAL >=", value, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalLessThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_NORMAL <", value, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_NORMAL <=", value, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_NORMAL in", values, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_NORMAL not in", values, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_NORMAL between", value1, value2, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteNormalNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_NORMAL not between", value1, value2, "avgTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalIsNull() {
            addCriterion("MAX_TIMER_WRITE_NORMAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalIsNotNull() {
            addCriterion("MAX_TIMER_WRITE_NORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_NORMAL =", value, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_NORMAL <>", value, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_NORMAL >", value, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_NORMAL >=", value, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalLessThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_NORMAL <", value, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_NORMAL <=", value, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_NORMAL in", values, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_NORMAL not in", values, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_NORMAL between", value1, value2, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteNormalNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_NORMAL not between", value1, value2, "maxTimerWriteNormal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalIsNull() {
            addCriterion("COUNT_WRITE_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalIsNotNull() {
            addCriterion("COUNT_WRITE_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalEqualTo(Long value) {
            addCriterion("COUNT_WRITE_EXTERNAL =", value, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalNotEqualTo(Long value) {
            addCriterion("COUNT_WRITE_EXTERNAL <>", value, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalGreaterThan(Long value) {
            addCriterion("COUNT_WRITE_EXTERNAL >", value, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_EXTERNAL >=", value, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalLessThan(Long value) {
            addCriterion("COUNT_WRITE_EXTERNAL <", value, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_WRITE_EXTERNAL <=", value, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalIn(List<Long> values) {
            addCriterion("COUNT_WRITE_EXTERNAL in", values, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalNotIn(List<Long> values) {
            addCriterion("COUNT_WRITE_EXTERNAL not in", values, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_EXTERNAL between", value1, value2, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andCountWriteExternalNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_WRITE_EXTERNAL not between", value1, value2, "countWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalIsNull() {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalIsNotNull() {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL =", value, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL <>", value, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL >", value, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL >=", value, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalLessThan(Long value) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL <", value, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL <=", value, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL in", values, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL not in", values, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL between", value1, value2, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andSumTimerWriteExternalNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WRITE_EXTERNAL not between", value1, value2, "sumTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalIsNull() {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalIsNotNull() {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL =", value, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL <>", value, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL >", value, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL >=", value, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalLessThan(Long value) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL <", value, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL <=", value, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL in", values, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL not in", values, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL between", value1, value2, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMinTimerWriteExternalNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WRITE_EXTERNAL not between", value1, value2, "minTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalIsNull() {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalIsNotNull() {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL =", value, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL <>", value, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL >", value, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL >=", value, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalLessThan(Long value) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL <", value, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL <=", value, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL in", values, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL not in", values, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL between", value1, value2, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andAvgTimerWriteExternalNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WRITE_EXTERNAL not between", value1, value2, "avgTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalIsNull() {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalIsNotNull() {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL =", value, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL <>", value, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL >", value, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL >=", value, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalLessThan(Long value) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL <", value, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL <=", value, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL in", values, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL not in", values, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL between", value1, value2, "maxTimerWriteExternal");
            return (Criteria) this;
        }

        public Criteria andMaxTimerWriteExternalNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WRITE_EXTERNAL not between", value1, value2, "maxTimerWriteExternal");
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