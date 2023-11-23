package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class SocketSummaryByEventNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SocketSummaryByEventNameExample() {
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

        public Criteria andSumNumberOfBytesReadIsNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_READ is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadIsNotNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_READ is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ =", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadNotEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ <>", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadGreaterThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ >", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ >=", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadLessThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ <", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ <=", value, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ in", values, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadNotIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ not in", values, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ between", value1, value2, "sumNumberOfBytesRead");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesReadNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_READ not between", value1, value2, "sumNumberOfBytesRead");
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

        public Criteria andSumNumberOfBytesWriteIsNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteIsNotNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE =", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteNotEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE <>", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteGreaterThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE >", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE >=", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteLessThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE <", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE <=", value, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE in", values, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteNotIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE not in", values, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE between", value1, value2, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesWriteNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_WRITE not between", value1, value2, "sumNumberOfBytesWrite");
            return (Criteria) this;
        }

        public Criteria andCountMiscIsNull() {
            addCriterion("COUNT_MISC is null");
            return (Criteria) this;
        }

        public Criteria andCountMiscIsNotNull() {
            addCriterion("COUNT_MISC is not null");
            return (Criteria) this;
        }

        public Criteria andCountMiscEqualTo(Long value) {
            addCriterion("COUNT_MISC =", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotEqualTo(Long value) {
            addCriterion("COUNT_MISC <>", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscGreaterThan(Long value) {
            addCriterion("COUNT_MISC >", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_MISC >=", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscLessThan(Long value) {
            addCriterion("COUNT_MISC <", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_MISC <=", value, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscIn(List<Long> values) {
            addCriterion("COUNT_MISC in", values, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotIn(List<Long> values) {
            addCriterion("COUNT_MISC not in", values, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscBetween(Long value1, Long value2) {
            addCriterion("COUNT_MISC between", value1, value2, "countMisc");
            return (Criteria) this;
        }

        public Criteria andCountMiscNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_MISC not between", value1, value2, "countMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscIsNull() {
            addCriterion("SUM_TIMER_MISC is null");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscIsNotNull() {
            addCriterion("SUM_TIMER_MISC is not null");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscEqualTo(Long value) {
            addCriterion("SUM_TIMER_MISC =", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_MISC <>", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscGreaterThan(Long value) {
            addCriterion("SUM_TIMER_MISC >", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_MISC >=", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscLessThan(Long value) {
            addCriterion("SUM_TIMER_MISC <", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_MISC <=", value, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscIn(List<Long> values) {
            addCriterion("SUM_TIMER_MISC in", values, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_MISC not in", values, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_MISC between", value1, value2, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andSumTimerMiscNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_MISC not between", value1, value2, "sumTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscIsNull() {
            addCriterion("MIN_TIMER_MISC is null");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscIsNotNull() {
            addCriterion("MIN_TIMER_MISC is not null");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscEqualTo(Long value) {
            addCriterion("MIN_TIMER_MISC =", value, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_MISC <>", value, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscGreaterThan(Long value) {
            addCriterion("MIN_TIMER_MISC >", value, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_MISC >=", value, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscLessThan(Long value) {
            addCriterion("MIN_TIMER_MISC <", value, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_MISC <=", value, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscIn(List<Long> values) {
            addCriterion("MIN_TIMER_MISC in", values, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_MISC not in", values, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_MISC between", value1, value2, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMinTimerMiscNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_MISC not between", value1, value2, "minTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscIsNull() {
            addCriterion("AVG_TIMER_MISC is null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscIsNotNull() {
            addCriterion("AVG_TIMER_MISC is not null");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscEqualTo(Long value) {
            addCriterion("AVG_TIMER_MISC =", value, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_MISC <>", value, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscGreaterThan(Long value) {
            addCriterion("AVG_TIMER_MISC >", value, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_MISC >=", value, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscLessThan(Long value) {
            addCriterion("AVG_TIMER_MISC <", value, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_MISC <=", value, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscIn(List<Long> values) {
            addCriterion("AVG_TIMER_MISC in", values, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_MISC not in", values, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_MISC between", value1, value2, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andAvgTimerMiscNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_MISC not between", value1, value2, "avgTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscIsNull() {
            addCriterion("MAX_TIMER_MISC is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscIsNotNull() {
            addCriterion("MAX_TIMER_MISC is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscEqualTo(Long value) {
            addCriterion("MAX_TIMER_MISC =", value, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_MISC <>", value, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscGreaterThan(Long value) {
            addCriterion("MAX_TIMER_MISC >", value, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_MISC >=", value, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscLessThan(Long value) {
            addCriterion("MAX_TIMER_MISC <", value, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_MISC <=", value, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscIn(List<Long> values) {
            addCriterion("MAX_TIMER_MISC in", values, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_MISC not in", values, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_MISC between", value1, value2, "maxTimerMisc");
            return (Criteria) this;
        }

        public Criteria andMaxTimerMiscNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_MISC not between", value1, value2, "maxTimerMisc");
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