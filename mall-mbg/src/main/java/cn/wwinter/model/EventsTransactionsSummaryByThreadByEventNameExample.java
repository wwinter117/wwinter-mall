package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class EventsTransactionsSummaryByThreadByEventNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsTransactionsSummaryByThreadByEventNameExample() {
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

        public Criteria andEventNameIsNull() {
            addCriterion("EVENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("EVENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("EVENT_NAME =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("EVENT_NAME <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("EVENT_NAME >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("EVENT_NAME <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("EVENT_NAME like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("EVENT_NAME not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("EVENT_NAME in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("EVENT_NAME not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("EVENT_NAME between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("EVENT_NAME not between", value1, value2, "eventName");
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

        public Criteria andCountReadWriteIsNull() {
            addCriterion("COUNT_READ_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteIsNotNull() {
            addCriterion("COUNT_READ_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteEqualTo(Long value) {
            addCriterion("COUNT_READ_WRITE =", value, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteNotEqualTo(Long value) {
            addCriterion("COUNT_READ_WRITE <>", value, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteGreaterThan(Long value) {
            addCriterion("COUNT_READ_WRITE >", value, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_WRITE >=", value, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteLessThan(Long value) {
            addCriterion("COUNT_READ_WRITE <", value, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_WRITE <=", value, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteIn(List<Long> values) {
            addCriterion("COUNT_READ_WRITE in", values, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteNotIn(List<Long> values) {
            addCriterion("COUNT_READ_WRITE not in", values, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_WRITE between", value1, value2, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadWriteNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_WRITE not between", value1, value2, "countReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteIsNull() {
            addCriterion("SUM_TIMER_READ_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteIsNotNull() {
            addCriterion("SUM_TIMER_READ_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WRITE =", value, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WRITE <>", value, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ_WRITE >", value, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WRITE >=", value, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteLessThan(Long value) {
            addCriterion("SUM_TIMER_READ_WRITE <", value, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_WRITE <=", value, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_WRITE in", values, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_WRITE not in", values, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_WRITE between", value1, value2, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadWriteNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_WRITE not between", value1, value2, "sumTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteIsNull() {
            addCriterion("MIN_TIMER_READ_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteIsNotNull() {
            addCriterion("MIN_TIMER_READ_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WRITE =", value, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WRITE <>", value, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ_WRITE >", value, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WRITE >=", value, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteLessThan(Long value) {
            addCriterion("MIN_TIMER_READ_WRITE <", value, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_WRITE <=", value, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_WRITE in", values, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_WRITE not in", values, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_WRITE between", value1, value2, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadWriteNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_WRITE not between", value1, value2, "minTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteIsNull() {
            addCriterion("AVG_TIMER_READ_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteIsNotNull() {
            addCriterion("AVG_TIMER_READ_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WRITE =", value, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WRITE <>", value, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ_WRITE >", value, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WRITE >=", value, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteLessThan(Long value) {
            addCriterion("AVG_TIMER_READ_WRITE <", value, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_WRITE <=", value, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_WRITE in", values, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_WRITE not in", values, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_WRITE between", value1, value2, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadWriteNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_WRITE not between", value1, value2, "avgTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteIsNull() {
            addCriterion("MAX_TIMER_READ_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteIsNotNull() {
            addCriterion("MAX_TIMER_READ_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WRITE =", value, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WRITE <>", value, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ_WRITE >", value, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WRITE >=", value, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteLessThan(Long value) {
            addCriterion("MAX_TIMER_READ_WRITE <", value, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_WRITE <=", value, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_WRITE in", values, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_WRITE not in", values, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_WRITE between", value1, value2, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadWriteNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_WRITE not between", value1, value2, "maxTimerReadWrite");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyIsNull() {
            addCriterion("COUNT_READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyIsNotNull() {
            addCriterion("COUNT_READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyEqualTo(Long value) {
            addCriterion("COUNT_READ_ONLY =", value, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyNotEqualTo(Long value) {
            addCriterion("COUNT_READ_ONLY <>", value, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyGreaterThan(Long value) {
            addCriterion("COUNT_READ_ONLY >", value, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_ONLY >=", value, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyLessThan(Long value) {
            addCriterion("COUNT_READ_ONLY <", value, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_READ_ONLY <=", value, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyIn(List<Long> values) {
            addCriterion("COUNT_READ_ONLY in", values, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyNotIn(List<Long> values) {
            addCriterion("COUNT_READ_ONLY not in", values, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_ONLY between", value1, value2, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andCountReadOnlyNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_READ_ONLY not between", value1, value2, "countReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyIsNull() {
            addCriterion("SUM_TIMER_READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyIsNotNull() {
            addCriterion("SUM_TIMER_READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_ONLY =", value, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_ONLY <>", value, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyGreaterThan(Long value) {
            addCriterion("SUM_TIMER_READ_ONLY >", value, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_ONLY >=", value, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyLessThan(Long value) {
            addCriterion("SUM_TIMER_READ_ONLY <", value, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_READ_ONLY <=", value, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_ONLY in", values, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_READ_ONLY not in", values, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_ONLY between", value1, value2, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andSumTimerReadOnlyNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_READ_ONLY not between", value1, value2, "sumTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyIsNull() {
            addCriterion("MIN_TIMER_READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyIsNotNull() {
            addCriterion("MIN_TIMER_READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_ONLY =", value, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_ONLY <>", value, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyGreaterThan(Long value) {
            addCriterion("MIN_TIMER_READ_ONLY >", value, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_ONLY >=", value, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyLessThan(Long value) {
            addCriterion("MIN_TIMER_READ_ONLY <", value, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_READ_ONLY <=", value, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_ONLY in", values, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_READ_ONLY not in", values, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_ONLY between", value1, value2, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMinTimerReadOnlyNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_READ_ONLY not between", value1, value2, "minTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyIsNull() {
            addCriterion("AVG_TIMER_READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyIsNotNull() {
            addCriterion("AVG_TIMER_READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_ONLY =", value, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_ONLY <>", value, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyGreaterThan(Long value) {
            addCriterion("AVG_TIMER_READ_ONLY >", value, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_ONLY >=", value, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyLessThan(Long value) {
            addCriterion("AVG_TIMER_READ_ONLY <", value, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_READ_ONLY <=", value, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_ONLY in", values, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_READ_ONLY not in", values, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_ONLY between", value1, value2, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andAvgTimerReadOnlyNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_READ_ONLY not between", value1, value2, "avgTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyIsNull() {
            addCriterion("MAX_TIMER_READ_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyIsNotNull() {
            addCriterion("MAX_TIMER_READ_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_ONLY =", value, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_ONLY <>", value, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyGreaterThan(Long value) {
            addCriterion("MAX_TIMER_READ_ONLY >", value, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_ONLY >=", value, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyLessThan(Long value) {
            addCriterion("MAX_TIMER_READ_ONLY <", value, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_READ_ONLY <=", value, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_ONLY in", values, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_READ_ONLY not in", values, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_ONLY between", value1, value2, "maxTimerReadOnly");
            return (Criteria) this;
        }

        public Criteria andMaxTimerReadOnlyNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_READ_ONLY not between", value1, value2, "maxTimerReadOnly");
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