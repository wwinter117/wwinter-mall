package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsErrorsSummaryByUserByErrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsErrorsSummaryByUserByErrorExample() {
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

        public Criteria andErrorNumberIsNull() {
            addCriterion("ERROR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andErrorNumberIsNotNull() {
            addCriterion("ERROR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNumberEqualTo(Integer value) {
            addCriterion("ERROR_NUMBER =", value, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberNotEqualTo(Integer value) {
            addCriterion("ERROR_NUMBER <>", value, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberGreaterThan(Integer value) {
            addCriterion("ERROR_NUMBER >", value, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERROR_NUMBER >=", value, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberLessThan(Integer value) {
            addCriterion("ERROR_NUMBER <", value, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ERROR_NUMBER <=", value, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberIn(List<Integer> values) {
            addCriterion("ERROR_NUMBER in", values, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberNotIn(List<Integer> values) {
            addCriterion("ERROR_NUMBER not in", values, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_NUMBER between", value1, value2, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_NUMBER not between", value1, value2, "errorNumber");
            return (Criteria) this;
        }

        public Criteria andErrorNameIsNull() {
            addCriterion("ERROR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andErrorNameIsNotNull() {
            addCriterion("ERROR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andErrorNameEqualTo(String value) {
            addCriterion("ERROR_NAME =", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameNotEqualTo(String value) {
            addCriterion("ERROR_NAME <>", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameGreaterThan(String value) {
            addCriterion("ERROR_NAME >", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_NAME >=", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameLessThan(String value) {
            addCriterion("ERROR_NAME <", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameLessThanOrEqualTo(String value) {
            addCriterion("ERROR_NAME <=", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameLike(String value) {
            addCriterion("ERROR_NAME like", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameNotLike(String value) {
            addCriterion("ERROR_NAME not like", value, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameIn(List<String> values) {
            addCriterion("ERROR_NAME in", values, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameNotIn(List<String> values) {
            addCriterion("ERROR_NAME not in", values, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameBetween(String value1, String value2) {
            addCriterion("ERROR_NAME between", value1, value2, "errorName");
            return (Criteria) this;
        }

        public Criteria andErrorNameNotBetween(String value1, String value2) {
            addCriterion("ERROR_NAME not between", value1, value2, "errorName");
            return (Criteria) this;
        }

        public Criteria andSqlStateIsNull() {
            addCriterion("SQL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSqlStateIsNotNull() {
            addCriterion("SQL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlStateEqualTo(String value) {
            addCriterion("SQL_STATE =", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateNotEqualTo(String value) {
            addCriterion("SQL_STATE <>", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateGreaterThan(String value) {
            addCriterion("SQL_STATE >", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_STATE >=", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateLessThan(String value) {
            addCriterion("SQL_STATE <", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateLessThanOrEqualTo(String value) {
            addCriterion("SQL_STATE <=", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateLike(String value) {
            addCriterion("SQL_STATE like", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateNotLike(String value) {
            addCriterion("SQL_STATE not like", value, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateIn(List<String> values) {
            addCriterion("SQL_STATE in", values, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateNotIn(List<String> values) {
            addCriterion("SQL_STATE not in", values, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateBetween(String value1, String value2) {
            addCriterion("SQL_STATE between", value1, value2, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSqlStateNotBetween(String value1, String value2) {
            addCriterion("SQL_STATE not between", value1, value2, "sqlState");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedIsNull() {
            addCriterion("SUM_ERROR_RAISED is null");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedIsNotNull() {
            addCriterion("SUM_ERROR_RAISED is not null");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED =", value, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedNotEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED <>", value, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedGreaterThan(Long value) {
            addCriterion("SUM_ERROR_RAISED >", value, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED >=", value, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedLessThan(Long value) {
            addCriterion("SUM_ERROR_RAISED <", value, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED <=", value, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedIn(List<Long> values) {
            addCriterion("SUM_ERROR_RAISED in", values, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedNotIn(List<Long> values) {
            addCriterion("SUM_ERROR_RAISED not in", values, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_RAISED between", value1, value2, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorRaisedNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_RAISED not between", value1, value2, "sumErrorRaised");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledIsNull() {
            addCriterion("SUM_ERROR_HANDLED is null");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledIsNotNull() {
            addCriterion("SUM_ERROR_HANDLED is not null");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED =", value, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledNotEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED <>", value, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledGreaterThan(Long value) {
            addCriterion("SUM_ERROR_HANDLED >", value, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED >=", value, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledLessThan(Long value) {
            addCriterion("SUM_ERROR_HANDLED <", value, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED <=", value, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledIn(List<Long> values) {
            addCriterion("SUM_ERROR_HANDLED in", values, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledNotIn(List<Long> values) {
            addCriterion("SUM_ERROR_HANDLED not in", values, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_HANDLED between", value1, value2, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andSumErrorHandledNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_HANDLED not between", value1, value2, "sumErrorHandled");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNull() {
            addCriterion("FIRST_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNotNull() {
            addCriterion("FIRST_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenEqualTo(Date value) {
            addCriterion("FIRST_SEEN =", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotEqualTo(Date value) {
            addCriterion("FIRST_SEEN <>", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThan(Date value) {
            addCriterion("FIRST_SEEN >", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEEN >=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThan(Date value) {
            addCriterion("FIRST_SEEN <", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEEN <=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIn(List<Date> values) {
            addCriterion("FIRST_SEEN in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotIn(List<Date> values) {
            addCriterion("FIRST_SEEN not in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEEN between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEEN not between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNull() {
            addCriterion("LAST_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNotNull() {
            addCriterion("LAST_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andLastSeenEqualTo(Date value) {
            addCriterion("LAST_SEEN =", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotEqualTo(Date value) {
            addCriterion("LAST_SEEN <>", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThan(Date value) {
            addCriterion("LAST_SEEN >", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_SEEN >=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThan(Date value) {
            addCriterion("LAST_SEEN <", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThanOrEqualTo(Date value) {
            addCriterion("LAST_SEEN <=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIn(List<Date> values) {
            addCriterion("LAST_SEEN in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotIn(List<Date> values) {
            addCriterion("LAST_SEEN not in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenBetween(Date value1, Date value2) {
            addCriterion("LAST_SEEN between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotBetween(Date value1, Date value2) {
            addCriterion("LAST_SEEN not between", value1, value2, "lastSeen");
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