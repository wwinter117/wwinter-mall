package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class EventsStatementsCurrentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsStatementsCurrentExample() {
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

        public Criteria andEndEventIdIsNull() {
            addCriterion("END_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEndEventIdIsNotNull() {
            addCriterion("END_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEndEventIdEqualTo(Long value) {
            addCriterion("END_EVENT_ID =", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdNotEqualTo(Long value) {
            addCriterion("END_EVENT_ID <>", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdGreaterThan(Long value) {
            addCriterion("END_EVENT_ID >", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("END_EVENT_ID >=", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdLessThan(Long value) {
            addCriterion("END_EVENT_ID <", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdLessThanOrEqualTo(Long value) {
            addCriterion("END_EVENT_ID <=", value, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdIn(List<Long> values) {
            addCriterion("END_EVENT_ID in", values, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdNotIn(List<Long> values) {
            addCriterion("END_EVENT_ID not in", values, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdBetween(Long value1, Long value2) {
            addCriterion("END_EVENT_ID between", value1, value2, "endEventId");
            return (Criteria) this;
        }

        public Criteria andEndEventIdNotBetween(Long value1, Long value2) {
            addCriterion("END_EVENT_ID not between", value1, value2, "endEventId");
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

        public Criteria andTimerStartIsNull() {
            addCriterion("TIMER_START is null");
            return (Criteria) this;
        }

        public Criteria andTimerStartIsNotNull() {
            addCriterion("TIMER_START is not null");
            return (Criteria) this;
        }

        public Criteria andTimerStartEqualTo(Long value) {
            addCriterion("TIMER_START =", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartNotEqualTo(Long value) {
            addCriterion("TIMER_START <>", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartGreaterThan(Long value) {
            addCriterion("TIMER_START >", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_START >=", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartLessThan(Long value) {
            addCriterion("TIMER_START <", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_START <=", value, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartIn(List<Long> values) {
            addCriterion("TIMER_START in", values, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartNotIn(List<Long> values) {
            addCriterion("TIMER_START not in", values, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartBetween(Long value1, Long value2) {
            addCriterion("TIMER_START between", value1, value2, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerStartNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_START not between", value1, value2, "timerStart");
            return (Criteria) this;
        }

        public Criteria andTimerEndIsNull() {
            addCriterion("TIMER_END is null");
            return (Criteria) this;
        }

        public Criteria andTimerEndIsNotNull() {
            addCriterion("TIMER_END is not null");
            return (Criteria) this;
        }

        public Criteria andTimerEndEqualTo(Long value) {
            addCriterion("TIMER_END =", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndNotEqualTo(Long value) {
            addCriterion("TIMER_END <>", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndGreaterThan(Long value) {
            addCriterion("TIMER_END >", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_END >=", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndLessThan(Long value) {
            addCriterion("TIMER_END <", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_END <=", value, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndIn(List<Long> values) {
            addCriterion("TIMER_END in", values, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndNotIn(List<Long> values) {
            addCriterion("TIMER_END not in", values, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndBetween(Long value1, Long value2) {
            addCriterion("TIMER_END between", value1, value2, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerEndNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_END not between", value1, value2, "timerEnd");
            return (Criteria) this;
        }

        public Criteria andTimerWaitIsNull() {
            addCriterion("TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andTimerWaitIsNotNull() {
            addCriterion("TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andTimerWaitEqualTo(Long value) {
            addCriterion("TIMER_WAIT =", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitNotEqualTo(Long value) {
            addCriterion("TIMER_WAIT <>", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitGreaterThan(Long value) {
            addCriterion("TIMER_WAIT >", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_WAIT >=", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitLessThan(Long value) {
            addCriterion("TIMER_WAIT <", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_WAIT <=", value, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitIn(List<Long> values) {
            addCriterion("TIMER_WAIT in", values, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitNotIn(List<Long> values) {
            addCriterion("TIMER_WAIT not in", values, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitBetween(Long value1, Long value2) {
            addCriterion("TIMER_WAIT between", value1, value2, "timerWait");
            return (Criteria) this;
        }

        public Criteria andTimerWaitNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_WAIT not between", value1, value2, "timerWait");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNull() {
            addCriterion("LOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNotNull() {
            addCriterion("LOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeEqualTo(Long value) {
            addCriterion("LOCK_TIME =", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotEqualTo(Long value) {
            addCriterion("LOCK_TIME <>", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThan(Long value) {
            addCriterion("LOCK_TIME >", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("LOCK_TIME >=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThan(Long value) {
            addCriterion("LOCK_TIME <", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThanOrEqualTo(Long value) {
            addCriterion("LOCK_TIME <=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIn(List<Long> values) {
            addCriterion("LOCK_TIME in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotIn(List<Long> values) {
            addCriterion("LOCK_TIME not in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeBetween(Long value1, Long value2) {
            addCriterion("LOCK_TIME between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotBetween(Long value1, Long value2) {
            addCriterion("LOCK_TIME not between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("DIGEST is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("DIGEST is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("DIGEST =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("DIGEST <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("DIGEST >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("DIGEST >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("DIGEST <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("DIGEST <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("DIGEST like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("DIGEST not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("DIGEST in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("DIGEST not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("DIGEST between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("DIGEST not between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaIsNull() {
            addCriterion("CURRENT_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaIsNotNull() {
            addCriterion("CURRENT_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaEqualTo(String value) {
            addCriterion("CURRENT_SCHEMA =", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaNotEqualTo(String value) {
            addCriterion("CURRENT_SCHEMA <>", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaGreaterThan(String value) {
            addCriterion("CURRENT_SCHEMA >", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_SCHEMA >=", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaLessThan(String value) {
            addCriterion("CURRENT_SCHEMA <", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_SCHEMA <=", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaLike(String value) {
            addCriterion("CURRENT_SCHEMA like", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaNotLike(String value) {
            addCriterion("CURRENT_SCHEMA not like", value, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaIn(List<String> values) {
            addCriterion("CURRENT_SCHEMA in", values, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaNotIn(List<String> values) {
            addCriterion("CURRENT_SCHEMA not in", values, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaBetween(String value1, String value2) {
            addCriterion("CURRENT_SCHEMA between", value1, value2, "currentSchema");
            return (Criteria) this;
        }

        public Criteria andCurrentSchemaNotBetween(String value1, String value2) {
            addCriterion("CURRENT_SCHEMA not between", value1, value2, "currentSchema");
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

        public Criteria andMysqlErrnoIsNull() {
            addCriterion("MYSQL_ERRNO is null");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoIsNotNull() {
            addCriterion("MYSQL_ERRNO is not null");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoEqualTo(Integer value) {
            addCriterion("MYSQL_ERRNO =", value, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoNotEqualTo(Integer value) {
            addCriterion("MYSQL_ERRNO <>", value, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoGreaterThan(Integer value) {
            addCriterion("MYSQL_ERRNO >", value, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("MYSQL_ERRNO >=", value, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoLessThan(Integer value) {
            addCriterion("MYSQL_ERRNO <", value, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoLessThanOrEqualTo(Integer value) {
            addCriterion("MYSQL_ERRNO <=", value, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoIn(List<Integer> values) {
            addCriterion("MYSQL_ERRNO in", values, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoNotIn(List<Integer> values) {
            addCriterion("MYSQL_ERRNO not in", values, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoBetween(Integer value1, Integer value2) {
            addCriterion("MYSQL_ERRNO between", value1, value2, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andMysqlErrnoNotBetween(Integer value1, Integer value2) {
            addCriterion("MYSQL_ERRNO not between", value1, value2, "mysqlErrno");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateIsNull() {
            addCriterion("RETURNED_SQLSTATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateIsNotNull() {
            addCriterion("RETURNED_SQLSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateEqualTo(String value) {
            addCriterion("RETURNED_SQLSTATE =", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateNotEqualTo(String value) {
            addCriterion("RETURNED_SQLSTATE <>", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateGreaterThan(String value) {
            addCriterion("RETURNED_SQLSTATE >", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNED_SQLSTATE >=", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateLessThan(String value) {
            addCriterion("RETURNED_SQLSTATE <", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateLessThanOrEqualTo(String value) {
            addCriterion("RETURNED_SQLSTATE <=", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateLike(String value) {
            addCriterion("RETURNED_SQLSTATE like", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateNotLike(String value) {
            addCriterion("RETURNED_SQLSTATE not like", value, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateIn(List<String> values) {
            addCriterion("RETURNED_SQLSTATE in", values, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateNotIn(List<String> values) {
            addCriterion("RETURNED_SQLSTATE not in", values, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateBetween(String value1, String value2) {
            addCriterion("RETURNED_SQLSTATE between", value1, value2, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andReturnedSqlstateNotBetween(String value1, String value2) {
            addCriterion("RETURNED_SQLSTATE not between", value1, value2, "returnedSqlstate");
            return (Criteria) this;
        }

        public Criteria andMessageTextIsNull() {
            addCriterion("MESSAGE_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andMessageTextIsNotNull() {
            addCriterion("MESSAGE_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTextEqualTo(String value) {
            addCriterion("MESSAGE_TEXT =", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotEqualTo(String value) {
            addCriterion("MESSAGE_TEXT <>", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextGreaterThan(String value) {
            addCriterion("MESSAGE_TEXT >", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGE_TEXT >=", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextLessThan(String value) {
            addCriterion("MESSAGE_TEXT <", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextLessThanOrEqualTo(String value) {
            addCriterion("MESSAGE_TEXT <=", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextLike(String value) {
            addCriterion("MESSAGE_TEXT like", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotLike(String value) {
            addCriterion("MESSAGE_TEXT not like", value, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextIn(List<String> values) {
            addCriterion("MESSAGE_TEXT in", values, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotIn(List<String> values) {
            addCriterion("MESSAGE_TEXT not in", values, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextBetween(String value1, String value2) {
            addCriterion("MESSAGE_TEXT between", value1, value2, "messageText");
            return (Criteria) this;
        }

        public Criteria andMessageTextNotBetween(String value1, String value2) {
            addCriterion("MESSAGE_TEXT not between", value1, value2, "messageText");
            return (Criteria) this;
        }

        public Criteria andErrorsIsNull() {
            addCriterion("ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andErrorsIsNotNull() {
            addCriterion("ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andErrorsEqualTo(Long value) {
            addCriterion("ERRORS =", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotEqualTo(Long value) {
            addCriterion("ERRORS <>", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsGreaterThan(Long value) {
            addCriterion("ERRORS >", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("ERRORS >=", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsLessThan(Long value) {
            addCriterion("ERRORS <", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsLessThanOrEqualTo(Long value) {
            addCriterion("ERRORS <=", value, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsIn(List<Long> values) {
            addCriterion("ERRORS in", values, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotIn(List<Long> values) {
            addCriterion("ERRORS not in", values, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsBetween(Long value1, Long value2) {
            addCriterion("ERRORS between", value1, value2, "errors");
            return (Criteria) this;
        }

        public Criteria andErrorsNotBetween(Long value1, Long value2) {
            addCriterion("ERRORS not between", value1, value2, "errors");
            return (Criteria) this;
        }

        public Criteria andWarningsIsNull() {
            addCriterion("WARNINGS is null");
            return (Criteria) this;
        }

        public Criteria andWarningsIsNotNull() {
            addCriterion("WARNINGS is not null");
            return (Criteria) this;
        }

        public Criteria andWarningsEqualTo(Long value) {
            addCriterion("WARNINGS =", value, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsNotEqualTo(Long value) {
            addCriterion("WARNINGS <>", value, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsGreaterThan(Long value) {
            addCriterion("WARNINGS >", value, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsGreaterThanOrEqualTo(Long value) {
            addCriterion("WARNINGS >=", value, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsLessThan(Long value) {
            addCriterion("WARNINGS <", value, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsLessThanOrEqualTo(Long value) {
            addCriterion("WARNINGS <=", value, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsIn(List<Long> values) {
            addCriterion("WARNINGS in", values, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsNotIn(List<Long> values) {
            addCriterion("WARNINGS not in", values, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsBetween(Long value1, Long value2) {
            addCriterion("WARNINGS between", value1, value2, "warnings");
            return (Criteria) this;
        }

        public Criteria andWarningsNotBetween(Long value1, Long value2) {
            addCriterion("WARNINGS not between", value1, value2, "warnings");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIsNull() {
            addCriterion("ROWS_AFFECTED is null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIsNotNull() {
            addCriterion("ROWS_AFFECTED is not null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedEqualTo(Long value) {
            addCriterion("ROWS_AFFECTED =", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotEqualTo(Long value) {
            addCriterion("ROWS_AFFECTED <>", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThan(Long value) {
            addCriterion("ROWS_AFFECTED >", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_AFFECTED >=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThan(Long value) {
            addCriterion("ROWS_AFFECTED <", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_AFFECTED <=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIn(List<Long> values) {
            addCriterion("ROWS_AFFECTED in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotIn(List<Long> values) {
            addCriterion("ROWS_AFFECTED not in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedBetween(Long value1, Long value2) {
            addCriterion("ROWS_AFFECTED between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_AFFECTED not between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNull() {
            addCriterion("ROWS_SENT is null");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNotNull() {
            addCriterion("ROWS_SENT is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSentEqualTo(Long value) {
            addCriterion("ROWS_SENT =", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotEqualTo(Long value) {
            addCriterion("ROWS_SENT <>", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThan(Long value) {
            addCriterion("ROWS_SENT >", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_SENT >=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThan(Long value) {
            addCriterion("ROWS_SENT <", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_SENT <=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentIn(List<Long> values) {
            addCriterion("ROWS_SENT in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotIn(List<Long> values) {
            addCriterion("ROWS_SENT not in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentBetween(Long value1, Long value2) {
            addCriterion("ROWS_SENT between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_SENT not between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNull() {
            addCriterion("ROWS_EXAMINED is null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNotNull() {
            addCriterion("ROWS_EXAMINED is not null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedEqualTo(Long value) {
            addCriterion("ROWS_EXAMINED =", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotEqualTo(Long value) {
            addCriterion("ROWS_EXAMINED <>", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThan(Long value) {
            addCriterion("ROWS_EXAMINED >", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThanOrEqualTo(Long value) {
            addCriterion("ROWS_EXAMINED >=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThan(Long value) {
            addCriterion("ROWS_EXAMINED <", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThanOrEqualTo(Long value) {
            addCriterion("ROWS_EXAMINED <=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIn(List<Long> values) {
            addCriterion("ROWS_EXAMINED in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotIn(List<Long> values) {
            addCriterion("ROWS_EXAMINED not in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedBetween(Long value1, Long value2) {
            addCriterion("ROWS_EXAMINED between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotBetween(Long value1, Long value2) {
            addCriterion("ROWS_EXAMINED not between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesIsNull() {
            addCriterion("CREATED_TMP_DISK_TABLES is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesIsNotNull() {
            addCriterion("CREATED_TMP_DISK_TABLES is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesEqualTo(Long value) {
            addCriterion("CREATED_TMP_DISK_TABLES =", value, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesNotEqualTo(Long value) {
            addCriterion("CREATED_TMP_DISK_TABLES <>", value, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesGreaterThan(Long value) {
            addCriterion("CREATED_TMP_DISK_TABLES >", value, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATED_TMP_DISK_TABLES >=", value, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesLessThan(Long value) {
            addCriterion("CREATED_TMP_DISK_TABLES <", value, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesLessThanOrEqualTo(Long value) {
            addCriterion("CREATED_TMP_DISK_TABLES <=", value, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesIn(List<Long> values) {
            addCriterion("CREATED_TMP_DISK_TABLES in", values, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesNotIn(List<Long> values) {
            addCriterion("CREATED_TMP_DISK_TABLES not in", values, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesBetween(Long value1, Long value2) {
            addCriterion("CREATED_TMP_DISK_TABLES between", value1, value2, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpDiskTablesNotBetween(Long value1, Long value2) {
            addCriterion("CREATED_TMP_DISK_TABLES not between", value1, value2, "createdTmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesIsNull() {
            addCriterion("CREATED_TMP_TABLES is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesIsNotNull() {
            addCriterion("CREATED_TMP_TABLES is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesEqualTo(Long value) {
            addCriterion("CREATED_TMP_TABLES =", value, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesNotEqualTo(Long value) {
            addCriterion("CREATED_TMP_TABLES <>", value, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesGreaterThan(Long value) {
            addCriterion("CREATED_TMP_TABLES >", value, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATED_TMP_TABLES >=", value, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesLessThan(Long value) {
            addCriterion("CREATED_TMP_TABLES <", value, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesLessThanOrEqualTo(Long value) {
            addCriterion("CREATED_TMP_TABLES <=", value, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesIn(List<Long> values) {
            addCriterion("CREATED_TMP_TABLES in", values, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesNotIn(List<Long> values) {
            addCriterion("CREATED_TMP_TABLES not in", values, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesBetween(Long value1, Long value2) {
            addCriterion("CREATED_TMP_TABLES between", value1, value2, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andCreatedTmpTablesNotBetween(Long value1, Long value2) {
            addCriterion("CREATED_TMP_TABLES not between", value1, value2, "createdTmpTables");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinIsNull() {
            addCriterion("SELECT_FULL_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinIsNotNull() {
            addCriterion("SELECT_FULL_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinEqualTo(Long value) {
            addCriterion("SELECT_FULL_JOIN =", value, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinNotEqualTo(Long value) {
            addCriterion("SELECT_FULL_JOIN <>", value, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinGreaterThan(Long value) {
            addCriterion("SELECT_FULL_JOIN >", value, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinGreaterThanOrEqualTo(Long value) {
            addCriterion("SELECT_FULL_JOIN >=", value, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinLessThan(Long value) {
            addCriterion("SELECT_FULL_JOIN <", value, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinLessThanOrEqualTo(Long value) {
            addCriterion("SELECT_FULL_JOIN <=", value, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinIn(List<Long> values) {
            addCriterion("SELECT_FULL_JOIN in", values, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinNotIn(List<Long> values) {
            addCriterion("SELECT_FULL_JOIN not in", values, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinBetween(Long value1, Long value2) {
            addCriterion("SELECT_FULL_JOIN between", value1, value2, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullJoinNotBetween(Long value1, Long value2) {
            addCriterion("SELECT_FULL_JOIN not between", value1, value2, "selectFullJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinIsNull() {
            addCriterion("SELECT_FULL_RANGE_JOIN is null");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinIsNotNull() {
            addCriterion("SELECT_FULL_RANGE_JOIN is not null");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinEqualTo(Long value) {
            addCriterion("SELECT_FULL_RANGE_JOIN =", value, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinNotEqualTo(Long value) {
            addCriterion("SELECT_FULL_RANGE_JOIN <>", value, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinGreaterThan(Long value) {
            addCriterion("SELECT_FULL_RANGE_JOIN >", value, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinGreaterThanOrEqualTo(Long value) {
            addCriterion("SELECT_FULL_RANGE_JOIN >=", value, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinLessThan(Long value) {
            addCriterion("SELECT_FULL_RANGE_JOIN <", value, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinLessThanOrEqualTo(Long value) {
            addCriterion("SELECT_FULL_RANGE_JOIN <=", value, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinIn(List<Long> values) {
            addCriterion("SELECT_FULL_RANGE_JOIN in", values, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinNotIn(List<Long> values) {
            addCriterion("SELECT_FULL_RANGE_JOIN not in", values, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinBetween(Long value1, Long value2) {
            addCriterion("SELECT_FULL_RANGE_JOIN between", value1, value2, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectFullRangeJoinNotBetween(Long value1, Long value2) {
            addCriterion("SELECT_FULL_RANGE_JOIN not between", value1, value2, "selectFullRangeJoin");
            return (Criteria) this;
        }

        public Criteria andSelectRangeIsNull() {
            addCriterion("SELECT_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andSelectRangeIsNotNull() {
            addCriterion("SELECT_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSelectRangeEqualTo(Long value) {
            addCriterion("SELECT_RANGE =", value, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeNotEqualTo(Long value) {
            addCriterion("SELECT_RANGE <>", value, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeGreaterThan(Long value) {
            addCriterion("SELECT_RANGE >", value, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("SELECT_RANGE >=", value, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeLessThan(Long value) {
            addCriterion("SELECT_RANGE <", value, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeLessThanOrEqualTo(Long value) {
            addCriterion("SELECT_RANGE <=", value, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeIn(List<Long> values) {
            addCriterion("SELECT_RANGE in", values, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeNotIn(List<Long> values) {
            addCriterion("SELECT_RANGE not in", values, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeBetween(Long value1, Long value2) {
            addCriterion("SELECT_RANGE between", value1, value2, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeNotBetween(Long value1, Long value2) {
            addCriterion("SELECT_RANGE not between", value1, value2, "selectRange");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckIsNull() {
            addCriterion("SELECT_RANGE_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckIsNotNull() {
            addCriterion("SELECT_RANGE_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckEqualTo(Long value) {
            addCriterion("SELECT_RANGE_CHECK =", value, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckNotEqualTo(Long value) {
            addCriterion("SELECT_RANGE_CHECK <>", value, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckGreaterThan(Long value) {
            addCriterion("SELECT_RANGE_CHECK >", value, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckGreaterThanOrEqualTo(Long value) {
            addCriterion("SELECT_RANGE_CHECK >=", value, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckLessThan(Long value) {
            addCriterion("SELECT_RANGE_CHECK <", value, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckLessThanOrEqualTo(Long value) {
            addCriterion("SELECT_RANGE_CHECK <=", value, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckIn(List<Long> values) {
            addCriterion("SELECT_RANGE_CHECK in", values, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckNotIn(List<Long> values) {
            addCriterion("SELECT_RANGE_CHECK not in", values, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckBetween(Long value1, Long value2) {
            addCriterion("SELECT_RANGE_CHECK between", value1, value2, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectRangeCheckNotBetween(Long value1, Long value2) {
            addCriterion("SELECT_RANGE_CHECK not between", value1, value2, "selectRangeCheck");
            return (Criteria) this;
        }

        public Criteria andSelectScanIsNull() {
            addCriterion("SELECT_SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSelectScanIsNotNull() {
            addCriterion("SELECT_SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSelectScanEqualTo(Long value) {
            addCriterion("SELECT_SCAN =", value, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanNotEqualTo(Long value) {
            addCriterion("SELECT_SCAN <>", value, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanGreaterThan(Long value) {
            addCriterion("SELECT_SCAN >", value, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanGreaterThanOrEqualTo(Long value) {
            addCriterion("SELECT_SCAN >=", value, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanLessThan(Long value) {
            addCriterion("SELECT_SCAN <", value, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanLessThanOrEqualTo(Long value) {
            addCriterion("SELECT_SCAN <=", value, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanIn(List<Long> values) {
            addCriterion("SELECT_SCAN in", values, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanNotIn(List<Long> values) {
            addCriterion("SELECT_SCAN not in", values, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanBetween(Long value1, Long value2) {
            addCriterion("SELECT_SCAN between", value1, value2, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSelectScanNotBetween(Long value1, Long value2) {
            addCriterion("SELECT_SCAN not between", value1, value2, "selectScan");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIsNull() {
            addCriterion("SORT_MERGE_PASSES is null");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIsNotNull() {
            addCriterion("SORT_MERGE_PASSES is not null");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesEqualTo(Long value) {
            addCriterion("SORT_MERGE_PASSES =", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotEqualTo(Long value) {
            addCriterion("SORT_MERGE_PASSES <>", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesGreaterThan(Long value) {
            addCriterion("SORT_MERGE_PASSES >", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT_MERGE_PASSES >=", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesLessThan(Long value) {
            addCriterion("SORT_MERGE_PASSES <", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesLessThanOrEqualTo(Long value) {
            addCriterion("SORT_MERGE_PASSES <=", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIn(List<Long> values) {
            addCriterion("SORT_MERGE_PASSES in", values, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotIn(List<Long> values) {
            addCriterion("SORT_MERGE_PASSES not in", values, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesBetween(Long value1, Long value2) {
            addCriterion("SORT_MERGE_PASSES between", value1, value2, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotBetween(Long value1, Long value2) {
            addCriterion("SORT_MERGE_PASSES not between", value1, value2, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortRangeIsNull() {
            addCriterion("SORT_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andSortRangeIsNotNull() {
            addCriterion("SORT_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSortRangeEqualTo(Long value) {
            addCriterion("SORT_RANGE =", value, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeNotEqualTo(Long value) {
            addCriterion("SORT_RANGE <>", value, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeGreaterThan(Long value) {
            addCriterion("SORT_RANGE >", value, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT_RANGE >=", value, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeLessThan(Long value) {
            addCriterion("SORT_RANGE <", value, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeLessThanOrEqualTo(Long value) {
            addCriterion("SORT_RANGE <=", value, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeIn(List<Long> values) {
            addCriterion("SORT_RANGE in", values, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeNotIn(List<Long> values) {
            addCriterion("SORT_RANGE not in", values, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeBetween(Long value1, Long value2) {
            addCriterion("SORT_RANGE between", value1, value2, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRangeNotBetween(Long value1, Long value2) {
            addCriterion("SORT_RANGE not between", value1, value2, "sortRange");
            return (Criteria) this;
        }

        public Criteria andSortRowsIsNull() {
            addCriterion("SORT_ROWS is null");
            return (Criteria) this;
        }

        public Criteria andSortRowsIsNotNull() {
            addCriterion("SORT_ROWS is not null");
            return (Criteria) this;
        }

        public Criteria andSortRowsEqualTo(Long value) {
            addCriterion("SORT_ROWS =", value, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsNotEqualTo(Long value) {
            addCriterion("SORT_ROWS <>", value, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsGreaterThan(Long value) {
            addCriterion("SORT_ROWS >", value, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT_ROWS >=", value, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsLessThan(Long value) {
            addCriterion("SORT_ROWS <", value, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsLessThanOrEqualTo(Long value) {
            addCriterion("SORT_ROWS <=", value, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsIn(List<Long> values) {
            addCriterion("SORT_ROWS in", values, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsNotIn(List<Long> values) {
            addCriterion("SORT_ROWS not in", values, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsBetween(Long value1, Long value2) {
            addCriterion("SORT_ROWS between", value1, value2, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortRowsNotBetween(Long value1, Long value2) {
            addCriterion("SORT_ROWS not between", value1, value2, "sortRows");
            return (Criteria) this;
        }

        public Criteria andSortScanIsNull() {
            addCriterion("SORT_SCAN is null");
            return (Criteria) this;
        }

        public Criteria andSortScanIsNotNull() {
            addCriterion("SORT_SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andSortScanEqualTo(Long value) {
            addCriterion("SORT_SCAN =", value, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanNotEqualTo(Long value) {
            addCriterion("SORT_SCAN <>", value, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanGreaterThan(Long value) {
            addCriterion("SORT_SCAN >", value, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT_SCAN >=", value, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanLessThan(Long value) {
            addCriterion("SORT_SCAN <", value, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanLessThanOrEqualTo(Long value) {
            addCriterion("SORT_SCAN <=", value, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanIn(List<Long> values) {
            addCriterion("SORT_SCAN in", values, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanNotIn(List<Long> values) {
            addCriterion("SORT_SCAN not in", values, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanBetween(Long value1, Long value2) {
            addCriterion("SORT_SCAN between", value1, value2, "sortScan");
            return (Criteria) this;
        }

        public Criteria andSortScanNotBetween(Long value1, Long value2) {
            addCriterion("SORT_SCAN not between", value1, value2, "sortScan");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedIsNull() {
            addCriterion("NO_INDEX_USED is null");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedIsNotNull() {
            addCriterion("NO_INDEX_USED is not null");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedEqualTo(Long value) {
            addCriterion("NO_INDEX_USED =", value, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedNotEqualTo(Long value) {
            addCriterion("NO_INDEX_USED <>", value, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedGreaterThan(Long value) {
            addCriterion("NO_INDEX_USED >", value, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("NO_INDEX_USED >=", value, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedLessThan(Long value) {
            addCriterion("NO_INDEX_USED <", value, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedLessThanOrEqualTo(Long value) {
            addCriterion("NO_INDEX_USED <=", value, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedIn(List<Long> values) {
            addCriterion("NO_INDEX_USED in", values, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedNotIn(List<Long> values) {
            addCriterion("NO_INDEX_USED not in", values, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedBetween(Long value1, Long value2) {
            addCriterion("NO_INDEX_USED between", value1, value2, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoIndexUsedNotBetween(Long value1, Long value2) {
            addCriterion("NO_INDEX_USED not between", value1, value2, "noIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedIsNull() {
            addCriterion("NO_GOOD_INDEX_USED is null");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedIsNotNull() {
            addCriterion("NO_GOOD_INDEX_USED is not null");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedEqualTo(Long value) {
            addCriterion("NO_GOOD_INDEX_USED =", value, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedNotEqualTo(Long value) {
            addCriterion("NO_GOOD_INDEX_USED <>", value, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedGreaterThan(Long value) {
            addCriterion("NO_GOOD_INDEX_USED >", value, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("NO_GOOD_INDEX_USED >=", value, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedLessThan(Long value) {
            addCriterion("NO_GOOD_INDEX_USED <", value, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedLessThanOrEqualTo(Long value) {
            addCriterion("NO_GOOD_INDEX_USED <=", value, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedIn(List<Long> values) {
            addCriterion("NO_GOOD_INDEX_USED in", values, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedNotIn(List<Long> values) {
            addCriterion("NO_GOOD_INDEX_USED not in", values, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedBetween(Long value1, Long value2) {
            addCriterion("NO_GOOD_INDEX_USED between", value1, value2, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNoGoodIndexUsedNotBetween(Long value1, Long value2) {
            addCriterion("NO_GOOD_INDEX_USED not between", value1, value2, "noGoodIndexUsed");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdIsNull() {
            addCriterion("NESTING_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdIsNotNull() {
            addCriterion("NESTING_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID =", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdNotEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID <>", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdGreaterThan(Long value) {
            addCriterion("NESTING_EVENT_ID >", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID >=", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdLessThan(Long value) {
            addCriterion("NESTING_EVENT_ID <", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdLessThanOrEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID <=", value, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdIn(List<Long> values) {
            addCriterion("NESTING_EVENT_ID in", values, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdNotIn(List<Long> values) {
            addCriterion("NESTING_EVENT_ID not in", values, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdBetween(Long value1, Long value2) {
            addCriterion("NESTING_EVENT_ID between", value1, value2, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventIdNotBetween(Long value1, Long value2) {
            addCriterion("NESTING_EVENT_ID not between", value1, value2, "nestingEventId");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeIsNull() {
            addCriterion("NESTING_EVENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeIsNotNull() {
            addCriterion("NESTING_EVENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE =", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE <>", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeGreaterThan(String value) {
            addCriterion("NESTING_EVENT_TYPE >", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE >=", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeLessThan(String value) {
            addCriterion("NESTING_EVENT_TYPE <", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeLessThanOrEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE <=", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeLike(String value) {
            addCriterion("NESTING_EVENT_TYPE like", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotLike(String value) {
            addCriterion("NESTING_EVENT_TYPE not like", value, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeIn(List<String> values) {
            addCriterion("NESTING_EVENT_TYPE in", values, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotIn(List<String> values) {
            addCriterion("NESTING_EVENT_TYPE not in", values, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeBetween(String value1, String value2) {
            addCriterion("NESTING_EVENT_TYPE between", value1, value2, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventTypeNotBetween(String value1, String value2) {
            addCriterion("NESTING_EVENT_TYPE not between", value1, value2, "nestingEventType");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelIsNull() {
            addCriterion("NESTING_EVENT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelIsNotNull() {
            addCriterion("NESTING_EVENT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelEqualTo(Integer value) {
            addCriterion("NESTING_EVENT_LEVEL =", value, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelNotEqualTo(Integer value) {
            addCriterion("NESTING_EVENT_LEVEL <>", value, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelGreaterThan(Integer value) {
            addCriterion("NESTING_EVENT_LEVEL >", value, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("NESTING_EVENT_LEVEL >=", value, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelLessThan(Integer value) {
            addCriterion("NESTING_EVENT_LEVEL <", value, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelLessThanOrEqualTo(Integer value) {
            addCriterion("NESTING_EVENT_LEVEL <=", value, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelIn(List<Integer> values) {
            addCriterion("NESTING_EVENT_LEVEL in", values, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelNotIn(List<Integer> values) {
            addCriterion("NESTING_EVENT_LEVEL not in", values, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelBetween(Integer value1, Integer value2) {
            addCriterion("NESTING_EVENT_LEVEL between", value1, value2, "nestingEventLevel");
            return (Criteria) this;
        }

        public Criteria andNestingEventLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("NESTING_EVENT_LEVEL not between", value1, value2, "nestingEventLevel");
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

        public Criteria andCpuTimeIsNull() {
            addCriterion("CPU_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCpuTimeIsNotNull() {
            addCriterion("CPU_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCpuTimeEqualTo(Long value) {
            addCriterion("CPU_TIME =", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeNotEqualTo(Long value) {
            addCriterion("CPU_TIME <>", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeGreaterThan(Long value) {
            addCriterion("CPU_TIME >", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CPU_TIME >=", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeLessThan(Long value) {
            addCriterion("CPU_TIME <", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeLessThanOrEqualTo(Long value) {
            addCriterion("CPU_TIME <=", value, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeIn(List<Long> values) {
            addCriterion("CPU_TIME in", values, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeNotIn(List<Long> values) {
            addCriterion("CPU_TIME not in", values, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeBetween(Long value1, Long value2) {
            addCriterion("CPU_TIME between", value1, value2, "cpuTime");
            return (Criteria) this;
        }

        public Criteria andCpuTimeNotBetween(Long value1, Long value2) {
            addCriterion("CPU_TIME not between", value1, value2, "cpuTime");
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