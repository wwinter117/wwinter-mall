package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ThreadsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThreadsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdIsNull() {
            addCriterion("PROCESSLIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdIsNotNull() {
            addCriterion("PROCESSLIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID =", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdNotEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID <>", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdGreaterThan(Long value) {
            addCriterion("PROCESSLIST_ID >", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID >=", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdLessThan(Long value) {
            addCriterion("PROCESSLIST_ID <", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdLessThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID <=", value, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdIn(List<Long> values) {
            addCriterion("PROCESSLIST_ID in", values, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdNotIn(List<Long> values) {
            addCriterion("PROCESSLIST_ID not in", values, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_ID between", value1, value2, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistIdNotBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_ID not between", value1, value2, "processlistId");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserIsNull() {
            addCriterion("PROCESSLIST_USER is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserIsNotNull() {
            addCriterion("PROCESSLIST_USER is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserEqualTo(String value) {
            addCriterion("PROCESSLIST_USER =", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserNotEqualTo(String value) {
            addCriterion("PROCESSLIST_USER <>", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserGreaterThan(String value) {
            addCriterion("PROCESSLIST_USER >", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_USER >=", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserLessThan(String value) {
            addCriterion("PROCESSLIST_USER <", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserLessThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_USER <=", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserLike(String value) {
            addCriterion("PROCESSLIST_USER like", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserNotLike(String value) {
            addCriterion("PROCESSLIST_USER not like", value, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserIn(List<String> values) {
            addCriterion("PROCESSLIST_USER in", values, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserNotIn(List<String> values) {
            addCriterion("PROCESSLIST_USER not in", values, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_USER between", value1, value2, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistUserNotBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_USER not between", value1, value2, "processlistUser");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostIsNull() {
            addCriterion("PROCESSLIST_HOST is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostIsNotNull() {
            addCriterion("PROCESSLIST_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostEqualTo(String value) {
            addCriterion("PROCESSLIST_HOST =", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostNotEqualTo(String value) {
            addCriterion("PROCESSLIST_HOST <>", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostGreaterThan(String value) {
            addCriterion("PROCESSLIST_HOST >", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_HOST >=", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostLessThan(String value) {
            addCriterion("PROCESSLIST_HOST <", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostLessThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_HOST <=", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostLike(String value) {
            addCriterion("PROCESSLIST_HOST like", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostNotLike(String value) {
            addCriterion("PROCESSLIST_HOST not like", value, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostIn(List<String> values) {
            addCriterion("PROCESSLIST_HOST in", values, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostNotIn(List<String> values) {
            addCriterion("PROCESSLIST_HOST not in", values, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_HOST between", value1, value2, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistHostNotBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_HOST not between", value1, value2, "processlistHost");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbIsNull() {
            addCriterion("PROCESSLIST_DB is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbIsNotNull() {
            addCriterion("PROCESSLIST_DB is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbEqualTo(String value) {
            addCriterion("PROCESSLIST_DB =", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbNotEqualTo(String value) {
            addCriterion("PROCESSLIST_DB <>", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbGreaterThan(String value) {
            addCriterion("PROCESSLIST_DB >", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_DB >=", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbLessThan(String value) {
            addCriterion("PROCESSLIST_DB <", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbLessThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_DB <=", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbLike(String value) {
            addCriterion("PROCESSLIST_DB like", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbNotLike(String value) {
            addCriterion("PROCESSLIST_DB not like", value, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbIn(List<String> values) {
            addCriterion("PROCESSLIST_DB in", values, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbNotIn(List<String> values) {
            addCriterion("PROCESSLIST_DB not in", values, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_DB between", value1, value2, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistDbNotBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_DB not between", value1, value2, "processlistDb");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandIsNull() {
            addCriterion("PROCESSLIST_COMMAND is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandIsNotNull() {
            addCriterion("PROCESSLIST_COMMAND is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandEqualTo(String value) {
            addCriterion("PROCESSLIST_COMMAND =", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandNotEqualTo(String value) {
            addCriterion("PROCESSLIST_COMMAND <>", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandGreaterThan(String value) {
            addCriterion("PROCESSLIST_COMMAND >", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_COMMAND >=", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandLessThan(String value) {
            addCriterion("PROCESSLIST_COMMAND <", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandLessThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_COMMAND <=", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandLike(String value) {
            addCriterion("PROCESSLIST_COMMAND like", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandNotLike(String value) {
            addCriterion("PROCESSLIST_COMMAND not like", value, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandIn(List<String> values) {
            addCriterion("PROCESSLIST_COMMAND in", values, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandNotIn(List<String> values) {
            addCriterion("PROCESSLIST_COMMAND not in", values, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_COMMAND between", value1, value2, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistCommandNotBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_COMMAND not between", value1, value2, "processlistCommand");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeIsNull() {
            addCriterion("PROCESSLIST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeIsNotNull() {
            addCriterion("PROCESSLIST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeEqualTo(Long value) {
            addCriterion("PROCESSLIST_TIME =", value, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeNotEqualTo(Long value) {
            addCriterion("PROCESSLIST_TIME <>", value, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeGreaterThan(Long value) {
            addCriterion("PROCESSLIST_TIME >", value, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_TIME >=", value, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeLessThan(Long value) {
            addCriterion("PROCESSLIST_TIME <", value, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeLessThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_TIME <=", value, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeIn(List<Long> values) {
            addCriterion("PROCESSLIST_TIME in", values, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeNotIn(List<Long> values) {
            addCriterion("PROCESSLIST_TIME not in", values, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_TIME between", value1, value2, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistTimeNotBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_TIME not between", value1, value2, "processlistTime");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateIsNull() {
            addCriterion("PROCESSLIST_STATE is null");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateIsNotNull() {
            addCriterion("PROCESSLIST_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateEqualTo(String value) {
            addCriterion("PROCESSLIST_STATE =", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateNotEqualTo(String value) {
            addCriterion("PROCESSLIST_STATE <>", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateGreaterThan(String value) {
            addCriterion("PROCESSLIST_STATE >", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_STATE >=", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateLessThan(String value) {
            addCriterion("PROCESSLIST_STATE <", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateLessThanOrEqualTo(String value) {
            addCriterion("PROCESSLIST_STATE <=", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateLike(String value) {
            addCriterion("PROCESSLIST_STATE like", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateNotLike(String value) {
            addCriterion("PROCESSLIST_STATE not like", value, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateIn(List<String> values) {
            addCriterion("PROCESSLIST_STATE in", values, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateNotIn(List<String> values) {
            addCriterion("PROCESSLIST_STATE not in", values, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_STATE between", value1, value2, "processlistState");
            return (Criteria) this;
        }

        public Criteria andProcesslistStateNotBetween(String value1, String value2) {
            addCriterion("PROCESSLIST_STATE not between", value1, value2, "processlistState");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdIsNull() {
            addCriterion("PARENT_THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdIsNotNull() {
            addCriterion("PARENT_THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdEqualTo(Long value) {
            addCriterion("PARENT_THREAD_ID =", value, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdNotEqualTo(Long value) {
            addCriterion("PARENT_THREAD_ID <>", value, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdGreaterThan(Long value) {
            addCriterion("PARENT_THREAD_ID >", value, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_THREAD_ID >=", value, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdLessThan(Long value) {
            addCriterion("PARENT_THREAD_ID <", value, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_THREAD_ID <=", value, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdIn(List<Long> values) {
            addCriterion("PARENT_THREAD_ID in", values, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdNotIn(List<Long> values) {
            addCriterion("PARENT_THREAD_ID not in", values, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_THREAD_ID between", value1, value2, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andParentThreadIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_THREAD_ID not between", value1, value2, "parentThreadId");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("ROLE is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("ROLE =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("ROLE <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("ROLE >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("ROLE <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("ROLE <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("ROLE like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("ROLE not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("ROLE in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("ROLE not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("ROLE between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("ROLE not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andInstrumentedIsNull() {
            addCriterion("INSTRUMENTED is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentedIsNotNull() {
            addCriterion("INSTRUMENTED is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentedEqualTo(String value) {
            addCriterion("INSTRUMENTED =", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedNotEqualTo(String value) {
            addCriterion("INSTRUMENTED <>", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedGreaterThan(String value) {
            addCriterion("INSTRUMENTED >", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedGreaterThanOrEqualTo(String value) {
            addCriterion("INSTRUMENTED >=", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedLessThan(String value) {
            addCriterion("INSTRUMENTED <", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedLessThanOrEqualTo(String value) {
            addCriterion("INSTRUMENTED <=", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedLike(String value) {
            addCriterion("INSTRUMENTED like", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedNotLike(String value) {
            addCriterion("INSTRUMENTED not like", value, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedIn(List<String> values) {
            addCriterion("INSTRUMENTED in", values, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedNotIn(List<String> values) {
            addCriterion("INSTRUMENTED not in", values, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedBetween(String value1, String value2) {
            addCriterion("INSTRUMENTED between", value1, value2, "instrumented");
            return (Criteria) this;
        }

        public Criteria andInstrumentedNotBetween(String value1, String value2) {
            addCriterion("INSTRUMENTED not between", value1, value2, "instrumented");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNull() {
            addCriterion("HISTORY is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIsNotNull() {
            addCriterion("HISTORY is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryEqualTo(String value) {
            addCriterion("HISTORY =", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotEqualTo(String value) {
            addCriterion("HISTORY <>", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThan(String value) {
            addCriterion("HISTORY >", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("HISTORY >=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThan(String value) {
            addCriterion("HISTORY <", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLessThanOrEqualTo(String value) {
            addCriterion("HISTORY <=", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryLike(String value) {
            addCriterion("HISTORY like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotLike(String value) {
            addCriterion("HISTORY not like", value, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryIn(List<String> values) {
            addCriterion("HISTORY in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotIn(List<String> values) {
            addCriterion("HISTORY not in", values, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryBetween(String value1, String value2) {
            addCriterion("HISTORY between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andHistoryNotBetween(String value1, String value2) {
            addCriterion("HISTORY not between", value1, value2, "history");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeIsNull() {
            addCriterion("CONNECTION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeIsNotNull() {
            addCriterion("CONNECTION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeEqualTo(String value) {
            addCriterion("CONNECTION_TYPE =", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeNotEqualTo(String value) {
            addCriterion("CONNECTION_TYPE <>", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeGreaterThan(String value) {
            addCriterion("CONNECTION_TYPE >", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONNECTION_TYPE >=", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeLessThan(String value) {
            addCriterion("CONNECTION_TYPE <", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeLessThanOrEqualTo(String value) {
            addCriterion("CONNECTION_TYPE <=", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeLike(String value) {
            addCriterion("CONNECTION_TYPE like", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeNotLike(String value) {
            addCriterion("CONNECTION_TYPE not like", value, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeIn(List<String> values) {
            addCriterion("CONNECTION_TYPE in", values, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeNotIn(List<String> values) {
            addCriterion("CONNECTION_TYPE not in", values, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeBetween(String value1, String value2) {
            addCriterion("CONNECTION_TYPE between", value1, value2, "connectionType");
            return (Criteria) this;
        }

        public Criteria andConnectionTypeNotBetween(String value1, String value2) {
            addCriterion("CONNECTION_TYPE not between", value1, value2, "connectionType");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdIsNull() {
            addCriterion("THREAD_OS_ID is null");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdIsNotNull() {
            addCriterion("THREAD_OS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdEqualTo(Long value) {
            addCriterion("THREAD_OS_ID =", value, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdNotEqualTo(Long value) {
            addCriterion("THREAD_OS_ID <>", value, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdGreaterThan(Long value) {
            addCriterion("THREAD_OS_ID >", value, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("THREAD_OS_ID >=", value, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdLessThan(Long value) {
            addCriterion("THREAD_OS_ID <", value, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdLessThanOrEqualTo(Long value) {
            addCriterion("THREAD_OS_ID <=", value, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdIn(List<Long> values) {
            addCriterion("THREAD_OS_ID in", values, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdNotIn(List<Long> values) {
            addCriterion("THREAD_OS_ID not in", values, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdBetween(Long value1, Long value2) {
            addCriterion("THREAD_OS_ID between", value1, value2, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andThreadOsIdNotBetween(Long value1, Long value2) {
            addCriterion("THREAD_OS_ID not between", value1, value2, "threadOsId");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIsNull() {
            addCriterion("RESOURCE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIsNotNull() {
            addCriterion("RESOURCE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andResourceGroupEqualTo(String value) {
            addCriterion("RESOURCE_GROUP =", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupNotEqualTo(String value) {
            addCriterion("RESOURCE_GROUP <>", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupGreaterThan(String value) {
            addCriterion("RESOURCE_GROUP >", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_GROUP >=", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupLessThan(String value) {
            addCriterion("RESOURCE_GROUP <", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_GROUP <=", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupLike(String value) {
            addCriterion("RESOURCE_GROUP like", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupNotLike(String value) {
            addCriterion("RESOURCE_GROUP not like", value, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupIn(List<String> values) {
            addCriterion("RESOURCE_GROUP in", values, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupNotIn(List<String> values) {
            addCriterion("RESOURCE_GROUP not in", values, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupBetween(String value1, String value2) {
            addCriterion("RESOURCE_GROUP between", value1, value2, "resourceGroup");
            return (Criteria) this;
        }

        public Criteria andResourceGroupNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_GROUP not between", value1, value2, "resourceGroup");
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

        public Criteria andControlledMemoryIsNull() {
            addCriterion("CONTROLLED_MEMORY is null");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryIsNotNull() {
            addCriterion("CONTROLLED_MEMORY is not null");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryEqualTo(Long value) {
            addCriterion("CONTROLLED_MEMORY =", value, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryNotEqualTo(Long value) {
            addCriterion("CONTROLLED_MEMORY <>", value, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryGreaterThan(Long value) {
            addCriterion("CONTROLLED_MEMORY >", value, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTROLLED_MEMORY >=", value, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryLessThan(Long value) {
            addCriterion("CONTROLLED_MEMORY <", value, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryLessThanOrEqualTo(Long value) {
            addCriterion("CONTROLLED_MEMORY <=", value, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryIn(List<Long> values) {
            addCriterion("CONTROLLED_MEMORY in", values, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryNotIn(List<Long> values) {
            addCriterion("CONTROLLED_MEMORY not in", values, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryBetween(Long value1, Long value2) {
            addCriterion("CONTROLLED_MEMORY between", value1, value2, "controlledMemory");
            return (Criteria) this;
        }

        public Criteria andControlledMemoryNotBetween(Long value1, Long value2) {
            addCriterion("CONTROLLED_MEMORY not between", value1, value2, "controlledMemory");
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

        public Criteria andTotalMemoryIsNull() {
            addCriterion("TOTAL_MEMORY is null");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryIsNotNull() {
            addCriterion("TOTAL_MEMORY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryEqualTo(Long value) {
            addCriterion("TOTAL_MEMORY =", value, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryNotEqualTo(Long value) {
            addCriterion("TOTAL_MEMORY <>", value, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryGreaterThan(Long value) {
            addCriterion("TOTAL_MEMORY >", value, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_MEMORY >=", value, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryLessThan(Long value) {
            addCriterion("TOTAL_MEMORY <", value, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_MEMORY <=", value, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryIn(List<Long> values) {
            addCriterion("TOTAL_MEMORY in", values, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryNotIn(List<Long> values) {
            addCriterion("TOTAL_MEMORY not in", values, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryBetween(Long value1, Long value2) {
            addCriterion("TOTAL_MEMORY between", value1, value2, "totalMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_MEMORY not between", value1, value2, "totalMemory");
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

        public Criteria andTelemetryActiveIsNull() {
            addCriterion("TELEMETRY_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveIsNotNull() {
            addCriterion("TELEMETRY_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveEqualTo(String value) {
            addCriterion("TELEMETRY_ACTIVE =", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveNotEqualTo(String value) {
            addCriterion("TELEMETRY_ACTIVE <>", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveGreaterThan(String value) {
            addCriterion("TELEMETRY_ACTIVE >", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveGreaterThanOrEqualTo(String value) {
            addCriterion("TELEMETRY_ACTIVE >=", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveLessThan(String value) {
            addCriterion("TELEMETRY_ACTIVE <", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveLessThanOrEqualTo(String value) {
            addCriterion("TELEMETRY_ACTIVE <=", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveLike(String value) {
            addCriterion("TELEMETRY_ACTIVE like", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveNotLike(String value) {
            addCriterion("TELEMETRY_ACTIVE not like", value, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveIn(List<String> values) {
            addCriterion("TELEMETRY_ACTIVE in", values, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveNotIn(List<String> values) {
            addCriterion("TELEMETRY_ACTIVE not in", values, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveBetween(String value1, String value2) {
            addCriterion("TELEMETRY_ACTIVE between", value1, value2, "telemetryActive");
            return (Criteria) this;
        }

        public Criteria andTelemetryActiveNotBetween(String value1, String value2) {
            addCriterion("TELEMETRY_ACTIVE not between", value1, value2, "telemetryActive");
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