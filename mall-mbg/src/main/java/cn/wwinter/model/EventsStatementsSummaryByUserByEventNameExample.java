package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class EventsStatementsSummaryByUserByEventNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsStatementsSummaryByUserByEventNameExample() {
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

        public Criteria andUserIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("USER =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("USER <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("USER >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("USER <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("USER like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("USER not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("USER in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("USER not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "user");
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