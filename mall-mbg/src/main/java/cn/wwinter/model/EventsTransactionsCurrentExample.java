package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class EventsTransactionsCurrentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsTransactionsCurrentExample() {
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

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTrxIdIsNull() {
            addCriterion("TRX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrxIdIsNotNull() {
            addCriterion("TRX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrxIdEqualTo(Long value) {
            addCriterion("TRX_ID =", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdNotEqualTo(Long value) {
            addCriterion("TRX_ID <>", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdGreaterThan(Long value) {
            addCriterion("TRX_ID >", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TRX_ID >=", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdLessThan(Long value) {
            addCriterion("TRX_ID <", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdLessThanOrEqualTo(Long value) {
            addCriterion("TRX_ID <=", value, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdIn(List<Long> values) {
            addCriterion("TRX_ID in", values, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdNotIn(List<Long> values) {
            addCriterion("TRX_ID not in", values, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdBetween(Long value1, Long value2) {
            addCriterion("TRX_ID between", value1, value2, "trxId");
            return (Criteria) this;
        }

        public Criteria andTrxIdNotBetween(Long value1, Long value2) {
            addCriterion("TRX_ID not between", value1, value2, "trxId");
            return (Criteria) this;
        }

        public Criteria andGtidIsNull() {
            addCriterion("GTID is null");
            return (Criteria) this;
        }

        public Criteria andGtidIsNotNull() {
            addCriterion("GTID is not null");
            return (Criteria) this;
        }

        public Criteria andGtidEqualTo(String value) {
            addCriterion("GTID =", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotEqualTo(String value) {
            addCriterion("GTID <>", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThan(String value) {
            addCriterion("GTID >", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidGreaterThanOrEqualTo(String value) {
            addCriterion("GTID >=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThan(String value) {
            addCriterion("GTID <", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLessThanOrEqualTo(String value) {
            addCriterion("GTID <=", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidLike(String value) {
            addCriterion("GTID like", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotLike(String value) {
            addCriterion("GTID not like", value, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidIn(List<String> values) {
            addCriterion("GTID in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotIn(List<String> values) {
            addCriterion("GTID not in", values, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidBetween(String value1, String value2) {
            addCriterion("GTID between", value1, value2, "gtid");
            return (Criteria) this;
        }

        public Criteria andGtidNotBetween(String value1, String value2) {
            addCriterion("GTID not between", value1, value2, "gtid");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdIsNull() {
            addCriterion("XID_FORMAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdIsNotNull() {
            addCriterion("XID_FORMAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdEqualTo(Integer value) {
            addCriterion("XID_FORMAT_ID =", value, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdNotEqualTo(Integer value) {
            addCriterion("XID_FORMAT_ID <>", value, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdGreaterThan(Integer value) {
            addCriterion("XID_FORMAT_ID >", value, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("XID_FORMAT_ID >=", value, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdLessThan(Integer value) {
            addCriterion("XID_FORMAT_ID <", value, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdLessThanOrEqualTo(Integer value) {
            addCriterion("XID_FORMAT_ID <=", value, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdIn(List<Integer> values) {
            addCriterion("XID_FORMAT_ID in", values, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdNotIn(List<Integer> values) {
            addCriterion("XID_FORMAT_ID not in", values, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdBetween(Integer value1, Integer value2) {
            addCriterion("XID_FORMAT_ID between", value1, value2, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidFormatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("XID_FORMAT_ID not between", value1, value2, "xidFormatId");
            return (Criteria) this;
        }

        public Criteria andXidGtridIsNull() {
            addCriterion("XID_GTRID is null");
            return (Criteria) this;
        }

        public Criteria andXidGtridIsNotNull() {
            addCriterion("XID_GTRID is not null");
            return (Criteria) this;
        }

        public Criteria andXidGtridEqualTo(String value) {
            addCriterion("XID_GTRID =", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridNotEqualTo(String value) {
            addCriterion("XID_GTRID <>", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridGreaterThan(String value) {
            addCriterion("XID_GTRID >", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridGreaterThanOrEqualTo(String value) {
            addCriterion("XID_GTRID >=", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridLessThan(String value) {
            addCriterion("XID_GTRID <", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridLessThanOrEqualTo(String value) {
            addCriterion("XID_GTRID <=", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridLike(String value) {
            addCriterion("XID_GTRID like", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridNotLike(String value) {
            addCriterion("XID_GTRID not like", value, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridIn(List<String> values) {
            addCriterion("XID_GTRID in", values, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridNotIn(List<String> values) {
            addCriterion("XID_GTRID not in", values, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridBetween(String value1, String value2) {
            addCriterion("XID_GTRID between", value1, value2, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidGtridNotBetween(String value1, String value2) {
            addCriterion("XID_GTRID not between", value1, value2, "xidGtrid");
            return (Criteria) this;
        }

        public Criteria andXidBqualIsNull() {
            addCriterion("XID_BQUAL is null");
            return (Criteria) this;
        }

        public Criteria andXidBqualIsNotNull() {
            addCriterion("XID_BQUAL is not null");
            return (Criteria) this;
        }

        public Criteria andXidBqualEqualTo(String value) {
            addCriterion("XID_BQUAL =", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualNotEqualTo(String value) {
            addCriterion("XID_BQUAL <>", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualGreaterThan(String value) {
            addCriterion("XID_BQUAL >", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualGreaterThanOrEqualTo(String value) {
            addCriterion("XID_BQUAL >=", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualLessThan(String value) {
            addCriterion("XID_BQUAL <", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualLessThanOrEqualTo(String value) {
            addCriterion("XID_BQUAL <=", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualLike(String value) {
            addCriterion("XID_BQUAL like", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualNotLike(String value) {
            addCriterion("XID_BQUAL not like", value, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualIn(List<String> values) {
            addCriterion("XID_BQUAL in", values, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualNotIn(List<String> values) {
            addCriterion("XID_BQUAL not in", values, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualBetween(String value1, String value2) {
            addCriterion("XID_BQUAL between", value1, value2, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXidBqualNotBetween(String value1, String value2) {
            addCriterion("XID_BQUAL not between", value1, value2, "xidBqual");
            return (Criteria) this;
        }

        public Criteria andXaStateIsNull() {
            addCriterion("XA_STATE is null");
            return (Criteria) this;
        }

        public Criteria andXaStateIsNotNull() {
            addCriterion("XA_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andXaStateEqualTo(String value) {
            addCriterion("XA_STATE =", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateNotEqualTo(String value) {
            addCriterion("XA_STATE <>", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateGreaterThan(String value) {
            addCriterion("XA_STATE >", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateGreaterThanOrEqualTo(String value) {
            addCriterion("XA_STATE >=", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateLessThan(String value) {
            addCriterion("XA_STATE <", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateLessThanOrEqualTo(String value) {
            addCriterion("XA_STATE <=", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateLike(String value) {
            addCriterion("XA_STATE like", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateNotLike(String value) {
            addCriterion("XA_STATE not like", value, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateIn(List<String> values) {
            addCriterion("XA_STATE in", values, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateNotIn(List<String> values) {
            addCriterion("XA_STATE not in", values, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateBetween(String value1, String value2) {
            addCriterion("XA_STATE between", value1, value2, "xaState");
            return (Criteria) this;
        }

        public Criteria andXaStateNotBetween(String value1, String value2) {
            addCriterion("XA_STATE not between", value1, value2, "xaState");
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

        public Criteria andAccessModeIsNull() {
            addCriterion("ACCESS_MODE is null");
            return (Criteria) this;
        }

        public Criteria andAccessModeIsNotNull() {
            addCriterion("ACCESS_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andAccessModeEqualTo(String value) {
            addCriterion("ACCESS_MODE =", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotEqualTo(String value) {
            addCriterion("ACCESS_MODE <>", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeGreaterThan(String value) {
            addCriterion("ACCESS_MODE >", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_MODE >=", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLessThan(String value) {
            addCriterion("ACCESS_MODE <", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_MODE <=", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeLike(String value) {
            addCriterion("ACCESS_MODE like", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotLike(String value) {
            addCriterion("ACCESS_MODE not like", value, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeIn(List<String> values) {
            addCriterion("ACCESS_MODE in", values, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotIn(List<String> values) {
            addCriterion("ACCESS_MODE not in", values, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeBetween(String value1, String value2) {
            addCriterion("ACCESS_MODE between", value1, value2, "accessMode");
            return (Criteria) this;
        }

        public Criteria andAccessModeNotBetween(String value1, String value2) {
            addCriterion("ACCESS_MODE not between", value1, value2, "accessMode");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelIsNull() {
            addCriterion("ISOLATION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelIsNotNull() {
            addCriterion("ISOLATION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelEqualTo(String value) {
            addCriterion("ISOLATION_LEVEL =", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelNotEqualTo(String value) {
            addCriterion("ISOLATION_LEVEL <>", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelGreaterThan(String value) {
            addCriterion("ISOLATION_LEVEL >", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ISOLATION_LEVEL >=", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelLessThan(String value) {
            addCriterion("ISOLATION_LEVEL <", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelLessThanOrEqualTo(String value) {
            addCriterion("ISOLATION_LEVEL <=", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelLike(String value) {
            addCriterion("ISOLATION_LEVEL like", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelNotLike(String value) {
            addCriterion("ISOLATION_LEVEL not like", value, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelIn(List<String> values) {
            addCriterion("ISOLATION_LEVEL in", values, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelNotIn(List<String> values) {
            addCriterion("ISOLATION_LEVEL not in", values, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelBetween(String value1, String value2) {
            addCriterion("ISOLATION_LEVEL between", value1, value2, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andIsolationLevelNotBetween(String value1, String value2) {
            addCriterion("ISOLATION_LEVEL not between", value1, value2, "isolationLevel");
            return (Criteria) this;
        }

        public Criteria andAutocommitIsNull() {
            addCriterion("AUTOCOMMIT is null");
            return (Criteria) this;
        }

        public Criteria andAutocommitIsNotNull() {
            addCriterion("AUTOCOMMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAutocommitEqualTo(String value) {
            addCriterion("AUTOCOMMIT =", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitNotEqualTo(String value) {
            addCriterion("AUTOCOMMIT <>", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitGreaterThan(String value) {
            addCriterion("AUTOCOMMIT >", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitGreaterThanOrEqualTo(String value) {
            addCriterion("AUTOCOMMIT >=", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitLessThan(String value) {
            addCriterion("AUTOCOMMIT <", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitLessThanOrEqualTo(String value) {
            addCriterion("AUTOCOMMIT <=", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitLike(String value) {
            addCriterion("AUTOCOMMIT like", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitNotLike(String value) {
            addCriterion("AUTOCOMMIT not like", value, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitIn(List<String> values) {
            addCriterion("AUTOCOMMIT in", values, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitNotIn(List<String> values) {
            addCriterion("AUTOCOMMIT not in", values, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitBetween(String value1, String value2) {
            addCriterion("AUTOCOMMIT between", value1, value2, "autocommit");
            return (Criteria) this;
        }

        public Criteria andAutocommitNotBetween(String value1, String value2) {
            addCriterion("AUTOCOMMIT not between", value1, value2, "autocommit");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsIsNull() {
            addCriterion("NUMBER_OF_SAVEPOINTS is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsIsNotNull() {
            addCriterion("NUMBER_OF_SAVEPOINTS is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsEqualTo(Long value) {
            addCriterion("NUMBER_OF_SAVEPOINTS =", value, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsNotEqualTo(Long value) {
            addCriterion("NUMBER_OF_SAVEPOINTS <>", value, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsGreaterThan(Long value) {
            addCriterion("NUMBER_OF_SAVEPOINTS >", value, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_SAVEPOINTS >=", value, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsLessThan(Long value) {
            addCriterion("NUMBER_OF_SAVEPOINTS <", value, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsLessThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_SAVEPOINTS <=", value, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsIn(List<Long> values) {
            addCriterion("NUMBER_OF_SAVEPOINTS in", values, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsNotIn(List<Long> values) {
            addCriterion("NUMBER_OF_SAVEPOINTS not in", values, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_SAVEPOINTS between", value1, value2, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfSavepointsNotBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_SAVEPOINTS not between", value1, value2, "numberOfSavepoints");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointIsNull() {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointIsNotNull() {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointEqualTo(Long value) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT =", value, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointNotEqualTo(Long value) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT <>", value, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointGreaterThan(Long value) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT >", value, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT >=", value, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointLessThan(Long value) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT <", value, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointLessThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT <=", value, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointIn(List<Long> values) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT in", values, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointNotIn(List<Long> values) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT not in", values, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT between", value1, value2, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfRollbackToSavepointNotBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_ROLLBACK_TO_SAVEPOINT not between", value1, value2, "numberOfRollbackToSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointIsNull() {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointIsNotNull() {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointEqualTo(Long value) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT =", value, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointNotEqualTo(Long value) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT <>", value, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointGreaterThan(Long value) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT >", value, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT >=", value, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointLessThan(Long value) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT <", value, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointLessThanOrEqualTo(Long value) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT <=", value, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointIn(List<Long> values) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT in", values, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointNotIn(List<Long> values) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT not in", values, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT between", value1, value2, "numberOfReleaseSavepoint");
            return (Criteria) this;
        }

        public Criteria andNumberOfReleaseSavepointNotBetween(Long value1, Long value2) {
            addCriterion("NUMBER_OF_RELEASE_SAVEPOINT not between", value1, value2, "numberOfReleaseSavepoint");
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