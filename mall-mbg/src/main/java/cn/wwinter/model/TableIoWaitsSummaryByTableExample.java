package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class TableIoWaitsSummaryByTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableIoWaitsSummaryByTableExample() {
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

        public Criteria andCountFetchIsNull() {
            addCriterion("COUNT_FETCH is null");
            return (Criteria) this;
        }

        public Criteria andCountFetchIsNotNull() {
            addCriterion("COUNT_FETCH is not null");
            return (Criteria) this;
        }

        public Criteria andCountFetchEqualTo(Long value) {
            addCriterion("COUNT_FETCH =", value, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchNotEqualTo(Long value) {
            addCriterion("COUNT_FETCH <>", value, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchGreaterThan(Long value) {
            addCriterion("COUNT_FETCH >", value, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_FETCH >=", value, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchLessThan(Long value) {
            addCriterion("COUNT_FETCH <", value, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_FETCH <=", value, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchIn(List<Long> values) {
            addCriterion("COUNT_FETCH in", values, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchNotIn(List<Long> values) {
            addCriterion("COUNT_FETCH not in", values, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchBetween(Long value1, Long value2) {
            addCriterion("COUNT_FETCH between", value1, value2, "countFetch");
            return (Criteria) this;
        }

        public Criteria andCountFetchNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_FETCH not between", value1, value2, "countFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchIsNull() {
            addCriterion("SUM_TIMER_FETCH is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchIsNotNull() {
            addCriterion("SUM_TIMER_FETCH is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchEqualTo(Long value) {
            addCriterion("SUM_TIMER_FETCH =", value, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_FETCH <>", value, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchGreaterThan(Long value) {
            addCriterion("SUM_TIMER_FETCH >", value, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_FETCH >=", value, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchLessThan(Long value) {
            addCriterion("SUM_TIMER_FETCH <", value, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_FETCH <=", value, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchIn(List<Long> values) {
            addCriterion("SUM_TIMER_FETCH in", values, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_FETCH not in", values, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_FETCH between", value1, value2, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andSumTimerFetchNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_FETCH not between", value1, value2, "sumTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchIsNull() {
            addCriterion("MIN_TIMER_FETCH is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchIsNotNull() {
            addCriterion("MIN_TIMER_FETCH is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchEqualTo(Long value) {
            addCriterion("MIN_TIMER_FETCH =", value, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_FETCH <>", value, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchGreaterThan(Long value) {
            addCriterion("MIN_TIMER_FETCH >", value, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_FETCH >=", value, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchLessThan(Long value) {
            addCriterion("MIN_TIMER_FETCH <", value, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_FETCH <=", value, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchIn(List<Long> values) {
            addCriterion("MIN_TIMER_FETCH in", values, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_FETCH not in", values, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_FETCH between", value1, value2, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMinTimerFetchNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_FETCH not between", value1, value2, "minTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchIsNull() {
            addCriterion("AVG_TIMER_FETCH is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchIsNotNull() {
            addCriterion("AVG_TIMER_FETCH is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchEqualTo(Long value) {
            addCriterion("AVG_TIMER_FETCH =", value, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_FETCH <>", value, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchGreaterThan(Long value) {
            addCriterion("AVG_TIMER_FETCH >", value, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_FETCH >=", value, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchLessThan(Long value) {
            addCriterion("AVG_TIMER_FETCH <", value, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_FETCH <=", value, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchIn(List<Long> values) {
            addCriterion("AVG_TIMER_FETCH in", values, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_FETCH not in", values, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_FETCH between", value1, value2, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andAvgTimerFetchNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_FETCH not between", value1, value2, "avgTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchIsNull() {
            addCriterion("MAX_TIMER_FETCH is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchIsNotNull() {
            addCriterion("MAX_TIMER_FETCH is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchEqualTo(Long value) {
            addCriterion("MAX_TIMER_FETCH =", value, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_FETCH <>", value, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchGreaterThan(Long value) {
            addCriterion("MAX_TIMER_FETCH >", value, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_FETCH >=", value, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchLessThan(Long value) {
            addCriterion("MAX_TIMER_FETCH <", value, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_FETCH <=", value, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchIn(List<Long> values) {
            addCriterion("MAX_TIMER_FETCH in", values, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_FETCH not in", values, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_FETCH between", value1, value2, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andMaxTimerFetchNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_FETCH not between", value1, value2, "maxTimerFetch");
            return (Criteria) this;
        }

        public Criteria andCountInsertIsNull() {
            addCriterion("COUNT_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andCountInsertIsNotNull() {
            addCriterion("COUNT_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andCountInsertEqualTo(Long value) {
            addCriterion("COUNT_INSERT =", value, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertNotEqualTo(Long value) {
            addCriterion("COUNT_INSERT <>", value, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertGreaterThan(Long value) {
            addCriterion("COUNT_INSERT >", value, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_INSERT >=", value, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertLessThan(Long value) {
            addCriterion("COUNT_INSERT <", value, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_INSERT <=", value, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertIn(List<Long> values) {
            addCriterion("COUNT_INSERT in", values, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertNotIn(List<Long> values) {
            addCriterion("COUNT_INSERT not in", values, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertBetween(Long value1, Long value2) {
            addCriterion("COUNT_INSERT between", value1, value2, "countInsert");
            return (Criteria) this;
        }

        public Criteria andCountInsertNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_INSERT not between", value1, value2, "countInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertIsNull() {
            addCriterion("SUM_TIMER_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertIsNotNull() {
            addCriterion("SUM_TIMER_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertEqualTo(Long value) {
            addCriterion("SUM_TIMER_INSERT =", value, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_INSERT <>", value, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertGreaterThan(Long value) {
            addCriterion("SUM_TIMER_INSERT >", value, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_INSERT >=", value, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertLessThan(Long value) {
            addCriterion("SUM_TIMER_INSERT <", value, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_INSERT <=", value, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertIn(List<Long> values) {
            addCriterion("SUM_TIMER_INSERT in", values, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_INSERT not in", values, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_INSERT between", value1, value2, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andSumTimerInsertNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_INSERT not between", value1, value2, "sumTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertIsNull() {
            addCriterion("MIN_TIMER_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertIsNotNull() {
            addCriterion("MIN_TIMER_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertEqualTo(Long value) {
            addCriterion("MIN_TIMER_INSERT =", value, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_INSERT <>", value, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertGreaterThan(Long value) {
            addCriterion("MIN_TIMER_INSERT >", value, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_INSERT >=", value, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertLessThan(Long value) {
            addCriterion("MIN_TIMER_INSERT <", value, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_INSERT <=", value, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertIn(List<Long> values) {
            addCriterion("MIN_TIMER_INSERT in", values, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_INSERT not in", values, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_INSERT between", value1, value2, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMinTimerInsertNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_INSERT not between", value1, value2, "minTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertIsNull() {
            addCriterion("AVG_TIMER_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertIsNotNull() {
            addCriterion("AVG_TIMER_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertEqualTo(Long value) {
            addCriterion("AVG_TIMER_INSERT =", value, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_INSERT <>", value, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertGreaterThan(Long value) {
            addCriterion("AVG_TIMER_INSERT >", value, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_INSERT >=", value, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertLessThan(Long value) {
            addCriterion("AVG_TIMER_INSERT <", value, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_INSERT <=", value, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertIn(List<Long> values) {
            addCriterion("AVG_TIMER_INSERT in", values, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_INSERT not in", values, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_INSERT between", value1, value2, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andAvgTimerInsertNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_INSERT not between", value1, value2, "avgTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertIsNull() {
            addCriterion("MAX_TIMER_INSERT is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertIsNotNull() {
            addCriterion("MAX_TIMER_INSERT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertEqualTo(Long value) {
            addCriterion("MAX_TIMER_INSERT =", value, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_INSERT <>", value, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertGreaterThan(Long value) {
            addCriterion("MAX_TIMER_INSERT >", value, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_INSERT >=", value, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertLessThan(Long value) {
            addCriterion("MAX_TIMER_INSERT <", value, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_INSERT <=", value, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertIn(List<Long> values) {
            addCriterion("MAX_TIMER_INSERT in", values, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_INSERT not in", values, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_INSERT between", value1, value2, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andMaxTimerInsertNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_INSERT not between", value1, value2, "maxTimerInsert");
            return (Criteria) this;
        }

        public Criteria andCountUpdateIsNull() {
            addCriterion("COUNT_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andCountUpdateIsNotNull() {
            addCriterion("COUNT_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCountUpdateEqualTo(Long value) {
            addCriterion("COUNT_UPDATE =", value, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateNotEqualTo(Long value) {
            addCriterion("COUNT_UPDATE <>", value, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateGreaterThan(Long value) {
            addCriterion("COUNT_UPDATE >", value, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_UPDATE >=", value, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateLessThan(Long value) {
            addCriterion("COUNT_UPDATE <", value, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_UPDATE <=", value, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateIn(List<Long> values) {
            addCriterion("COUNT_UPDATE in", values, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateNotIn(List<Long> values) {
            addCriterion("COUNT_UPDATE not in", values, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateBetween(Long value1, Long value2) {
            addCriterion("COUNT_UPDATE between", value1, value2, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andCountUpdateNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_UPDATE not between", value1, value2, "countUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateIsNull() {
            addCriterion("SUM_TIMER_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateIsNotNull() {
            addCriterion("SUM_TIMER_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateEqualTo(Long value) {
            addCriterion("SUM_TIMER_UPDATE =", value, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_UPDATE <>", value, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateGreaterThan(Long value) {
            addCriterion("SUM_TIMER_UPDATE >", value, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_UPDATE >=", value, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateLessThan(Long value) {
            addCriterion("SUM_TIMER_UPDATE <", value, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_UPDATE <=", value, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateIn(List<Long> values) {
            addCriterion("SUM_TIMER_UPDATE in", values, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_UPDATE not in", values, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_UPDATE between", value1, value2, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andSumTimerUpdateNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_UPDATE not between", value1, value2, "sumTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateIsNull() {
            addCriterion("MIN_TIMER_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateIsNotNull() {
            addCriterion("MIN_TIMER_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateEqualTo(Long value) {
            addCriterion("MIN_TIMER_UPDATE =", value, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_UPDATE <>", value, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateGreaterThan(Long value) {
            addCriterion("MIN_TIMER_UPDATE >", value, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_UPDATE >=", value, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateLessThan(Long value) {
            addCriterion("MIN_TIMER_UPDATE <", value, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_UPDATE <=", value, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateIn(List<Long> values) {
            addCriterion("MIN_TIMER_UPDATE in", values, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_UPDATE not in", values, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_UPDATE between", value1, value2, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMinTimerUpdateNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_UPDATE not between", value1, value2, "minTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateIsNull() {
            addCriterion("AVG_TIMER_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateIsNotNull() {
            addCriterion("AVG_TIMER_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateEqualTo(Long value) {
            addCriterion("AVG_TIMER_UPDATE =", value, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_UPDATE <>", value, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateGreaterThan(Long value) {
            addCriterion("AVG_TIMER_UPDATE >", value, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_UPDATE >=", value, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateLessThan(Long value) {
            addCriterion("AVG_TIMER_UPDATE <", value, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_UPDATE <=", value, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateIn(List<Long> values) {
            addCriterion("AVG_TIMER_UPDATE in", values, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_UPDATE not in", values, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_UPDATE between", value1, value2, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andAvgTimerUpdateNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_UPDATE not between", value1, value2, "avgTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateIsNull() {
            addCriterion("MAX_TIMER_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateIsNotNull() {
            addCriterion("MAX_TIMER_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateEqualTo(Long value) {
            addCriterion("MAX_TIMER_UPDATE =", value, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_UPDATE <>", value, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateGreaterThan(Long value) {
            addCriterion("MAX_TIMER_UPDATE >", value, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_UPDATE >=", value, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateLessThan(Long value) {
            addCriterion("MAX_TIMER_UPDATE <", value, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_UPDATE <=", value, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateIn(List<Long> values) {
            addCriterion("MAX_TIMER_UPDATE in", values, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_UPDATE not in", values, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_UPDATE between", value1, value2, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andMaxTimerUpdateNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_UPDATE not between", value1, value2, "maxTimerUpdate");
            return (Criteria) this;
        }

        public Criteria andCountDeleteIsNull() {
            addCriterion("COUNT_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCountDeleteIsNotNull() {
            addCriterion("COUNT_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCountDeleteEqualTo(Long value) {
            addCriterion("COUNT_DELETE =", value, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteNotEqualTo(Long value) {
            addCriterion("COUNT_DELETE <>", value, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteGreaterThan(Long value) {
            addCriterion("COUNT_DELETE >", value, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_DELETE >=", value, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteLessThan(Long value) {
            addCriterion("COUNT_DELETE <", value, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_DELETE <=", value, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteIn(List<Long> values) {
            addCriterion("COUNT_DELETE in", values, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteNotIn(List<Long> values) {
            addCriterion("COUNT_DELETE not in", values, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteBetween(Long value1, Long value2) {
            addCriterion("COUNT_DELETE between", value1, value2, "countDelete");
            return (Criteria) this;
        }

        public Criteria andCountDeleteNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_DELETE not between", value1, value2, "countDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteIsNull() {
            addCriterion("SUM_TIMER_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteIsNotNull() {
            addCriterion("SUM_TIMER_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteEqualTo(Long value) {
            addCriterion("SUM_TIMER_DELETE =", value, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_DELETE <>", value, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteGreaterThan(Long value) {
            addCriterion("SUM_TIMER_DELETE >", value, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_DELETE >=", value, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteLessThan(Long value) {
            addCriterion("SUM_TIMER_DELETE <", value, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_DELETE <=", value, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteIn(List<Long> values) {
            addCriterion("SUM_TIMER_DELETE in", values, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_DELETE not in", values, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_DELETE between", value1, value2, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andSumTimerDeleteNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_DELETE not between", value1, value2, "sumTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteIsNull() {
            addCriterion("MIN_TIMER_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteIsNotNull() {
            addCriterion("MIN_TIMER_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteEqualTo(Long value) {
            addCriterion("MIN_TIMER_DELETE =", value, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_DELETE <>", value, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteGreaterThan(Long value) {
            addCriterion("MIN_TIMER_DELETE >", value, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_DELETE >=", value, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteLessThan(Long value) {
            addCriterion("MIN_TIMER_DELETE <", value, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_DELETE <=", value, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteIn(List<Long> values) {
            addCriterion("MIN_TIMER_DELETE in", values, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_DELETE not in", values, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_DELETE between", value1, value2, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMinTimerDeleteNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_DELETE not between", value1, value2, "minTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteIsNull() {
            addCriterion("AVG_TIMER_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteIsNotNull() {
            addCriterion("AVG_TIMER_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteEqualTo(Long value) {
            addCriterion("AVG_TIMER_DELETE =", value, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_DELETE <>", value, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteGreaterThan(Long value) {
            addCriterion("AVG_TIMER_DELETE >", value, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_DELETE >=", value, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteLessThan(Long value) {
            addCriterion("AVG_TIMER_DELETE <", value, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_DELETE <=", value, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteIn(List<Long> values) {
            addCriterion("AVG_TIMER_DELETE in", values, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_DELETE not in", values, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_DELETE between", value1, value2, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andAvgTimerDeleteNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_DELETE not between", value1, value2, "avgTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteIsNull() {
            addCriterion("MAX_TIMER_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteIsNotNull() {
            addCriterion("MAX_TIMER_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteEqualTo(Long value) {
            addCriterion("MAX_TIMER_DELETE =", value, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_DELETE <>", value, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteGreaterThan(Long value) {
            addCriterion("MAX_TIMER_DELETE >", value, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_DELETE >=", value, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteLessThan(Long value) {
            addCriterion("MAX_TIMER_DELETE <", value, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_DELETE <=", value, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteIn(List<Long> values) {
            addCriterion("MAX_TIMER_DELETE in", values, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_DELETE not in", values, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_DELETE between", value1, value2, "maxTimerDelete");
            return (Criteria) this;
        }

        public Criteria andMaxTimerDeleteNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_DELETE not between", value1, value2, "maxTimerDelete");
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