package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HostCacheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HostCacheExample() {
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

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("HOST is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("HOST is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("HOST =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("HOST <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("HOST >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("HOST >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("HOST <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("HOST <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("HOST like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("HOST not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("HOST in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("HOST not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("HOST between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("HOST not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostValidatedIsNull() {
            addCriterion("HOST_VALIDATED is null");
            return (Criteria) this;
        }

        public Criteria andHostValidatedIsNotNull() {
            addCriterion("HOST_VALIDATED is not null");
            return (Criteria) this;
        }

        public Criteria andHostValidatedEqualTo(String value) {
            addCriterion("HOST_VALIDATED =", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedNotEqualTo(String value) {
            addCriterion("HOST_VALIDATED <>", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedGreaterThan(String value) {
            addCriterion("HOST_VALIDATED >", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_VALIDATED >=", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedLessThan(String value) {
            addCriterion("HOST_VALIDATED <", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedLessThanOrEqualTo(String value) {
            addCriterion("HOST_VALIDATED <=", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedLike(String value) {
            addCriterion("HOST_VALIDATED like", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedNotLike(String value) {
            addCriterion("HOST_VALIDATED not like", value, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedIn(List<String> values) {
            addCriterion("HOST_VALIDATED in", values, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedNotIn(List<String> values) {
            addCriterion("HOST_VALIDATED not in", values, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedBetween(String value1, String value2) {
            addCriterion("HOST_VALIDATED between", value1, value2, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andHostValidatedNotBetween(String value1, String value2) {
            addCriterion("HOST_VALIDATED not between", value1, value2, "hostValidated");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsIsNull() {
            addCriterion("SUM_CONNECT_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsIsNotNull() {
            addCriterion("SUM_CONNECT_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsEqualTo(Long value) {
            addCriterion("SUM_CONNECT_ERRORS =", value, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsNotEqualTo(Long value) {
            addCriterion("SUM_CONNECT_ERRORS <>", value, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsGreaterThan(Long value) {
            addCriterion("SUM_CONNECT_ERRORS >", value, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_CONNECT_ERRORS >=", value, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsLessThan(Long value) {
            addCriterion("SUM_CONNECT_ERRORS <", value, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsLessThanOrEqualTo(Long value) {
            addCriterion("SUM_CONNECT_ERRORS <=", value, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsIn(List<Long> values) {
            addCriterion("SUM_CONNECT_ERRORS in", values, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsNotIn(List<Long> values) {
            addCriterion("SUM_CONNECT_ERRORS not in", values, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsBetween(Long value1, Long value2) {
            addCriterion("SUM_CONNECT_ERRORS between", value1, value2, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andSumConnectErrorsNotBetween(Long value1, Long value2) {
            addCriterion("SUM_CONNECT_ERRORS not between", value1, value2, "sumConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsIsNull() {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsIsNotNull() {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsEqualTo(Long value) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS =", value, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS <>", value, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsGreaterThan(Long value) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS >", value, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS >=", value, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsLessThan(Long value) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS <", value, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS <=", value, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsIn(List<Long> values) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS in", values, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS not in", values, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS between", value1, value2, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostBlockedErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_HOST_BLOCKED_ERRORS not between", value1, value2, "countHostBlockedErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsIsNull() {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsIsNotNull() {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS =", value, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS <>", value, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsGreaterThan(Long value) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS >", value, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS >=", value, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsLessThan(Long value) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS <", value, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS <=", value, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsIn(List<Long> values) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS in", values, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS not in", values, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS between", value1, value2, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoTransientErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_NAMEINFO_TRANSIENT_ERRORS not between", value1, value2, "countNameinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsIsNull() {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsIsNotNull() {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS =", value, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS <>", value, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsGreaterThan(Long value) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS >", value, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS >=", value, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsLessThan(Long value) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS <", value, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS <=", value, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsIn(List<Long> values) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS in", values, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS not in", values, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS between", value1, value2, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountNameinfoPermanentErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_NAMEINFO_PERMANENT_ERRORS not between", value1, value2, "countNameinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsIsNull() {
            addCriterion("COUNT_FORMAT_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsIsNotNull() {
            addCriterion("COUNT_FORMAT_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsEqualTo(Long value) {
            addCriterion("COUNT_FORMAT_ERRORS =", value, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_FORMAT_ERRORS <>", value, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsGreaterThan(Long value) {
            addCriterion("COUNT_FORMAT_ERRORS >", value, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_FORMAT_ERRORS >=", value, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsLessThan(Long value) {
            addCriterion("COUNT_FORMAT_ERRORS <", value, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_FORMAT_ERRORS <=", value, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsIn(List<Long> values) {
            addCriterion("COUNT_FORMAT_ERRORS in", values, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_FORMAT_ERRORS not in", values, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_FORMAT_ERRORS between", value1, value2, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountFormatErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_FORMAT_ERRORS not between", value1, value2, "countFormatErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsIsNull() {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsIsNotNull() {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS =", value, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS <>", value, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsGreaterThan(Long value) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS >", value, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS >=", value, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsLessThan(Long value) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS <", value, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS <=", value, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsIn(List<Long> values) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS in", values, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS not in", values, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS between", value1, value2, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoTransientErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_ADDRINFO_TRANSIENT_ERRORS not between", value1, value2, "countAddrinfoTransientErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsIsNull() {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsIsNotNull() {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS =", value, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS <>", value, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsGreaterThan(Long value) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS >", value, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS >=", value, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsLessThan(Long value) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS <", value, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS <=", value, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsIn(List<Long> values) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS in", values, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS not in", values, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS between", value1, value2, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountAddrinfoPermanentErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_ADDRINFO_PERMANENT_ERRORS not between", value1, value2, "countAddrinfoPermanentErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsIsNull() {
            addCriterion("COUNT_FCRDNS_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsIsNotNull() {
            addCriterion("COUNT_FCRDNS_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsEqualTo(Long value) {
            addCriterion("COUNT_FCRDNS_ERRORS =", value, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_FCRDNS_ERRORS <>", value, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsGreaterThan(Long value) {
            addCriterion("COUNT_FCRDNS_ERRORS >", value, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_FCRDNS_ERRORS >=", value, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsLessThan(Long value) {
            addCriterion("COUNT_FCRDNS_ERRORS <", value, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_FCRDNS_ERRORS <=", value, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsIn(List<Long> values) {
            addCriterion("COUNT_FCRDNS_ERRORS in", values, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_FCRDNS_ERRORS not in", values, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_FCRDNS_ERRORS between", value1, value2, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountFcrdnsErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_FCRDNS_ERRORS not between", value1, value2, "countFcrdnsErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsIsNull() {
            addCriterion("COUNT_HOST_ACL_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsIsNotNull() {
            addCriterion("COUNT_HOST_ACL_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsEqualTo(Long value) {
            addCriterion("COUNT_HOST_ACL_ERRORS =", value, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_HOST_ACL_ERRORS <>", value, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsGreaterThan(Long value) {
            addCriterion("COUNT_HOST_ACL_ERRORS >", value, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_HOST_ACL_ERRORS >=", value, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsLessThan(Long value) {
            addCriterion("COUNT_HOST_ACL_ERRORS <", value, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_HOST_ACL_ERRORS <=", value, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsIn(List<Long> values) {
            addCriterion("COUNT_HOST_ACL_ERRORS in", values, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_HOST_ACL_ERRORS not in", values, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_HOST_ACL_ERRORS between", value1, value2, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountHostAclErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_HOST_ACL_ERRORS not between", value1, value2, "countHostAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsIsNull() {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsIsNotNull() {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsEqualTo(Long value) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS =", value, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS <>", value, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsGreaterThan(Long value) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS >", value, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS >=", value, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsLessThan(Long value) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS <", value, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS <=", value, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsIn(List<Long> values) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS in", values, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS not in", values, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS between", value1, value2, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountNoAuthPluginErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_NO_AUTH_PLUGIN_ERRORS not between", value1, value2, "countNoAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsIsNull() {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsIsNotNull() {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsEqualTo(Long value) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS =", value, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS <>", value, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsGreaterThan(Long value) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS >", value, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS >=", value, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsLessThan(Long value) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS <", value, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS <=", value, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsIn(List<Long> values) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS in", values, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS not in", values, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS between", value1, value2, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthPluginErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_AUTH_PLUGIN_ERRORS not between", value1, value2, "countAuthPluginErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsIsNull() {
            addCriterion("COUNT_HANDSHAKE_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsIsNotNull() {
            addCriterion("COUNT_HANDSHAKE_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsEqualTo(Long value) {
            addCriterion("COUNT_HANDSHAKE_ERRORS =", value, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_HANDSHAKE_ERRORS <>", value, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsGreaterThan(Long value) {
            addCriterion("COUNT_HANDSHAKE_ERRORS >", value, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_HANDSHAKE_ERRORS >=", value, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsLessThan(Long value) {
            addCriterion("COUNT_HANDSHAKE_ERRORS <", value, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_HANDSHAKE_ERRORS <=", value, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsIn(List<Long> values) {
            addCriterion("COUNT_HANDSHAKE_ERRORS in", values, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_HANDSHAKE_ERRORS not in", values, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_HANDSHAKE_ERRORS between", value1, value2, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountHandshakeErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_HANDSHAKE_ERRORS not between", value1, value2, "countHandshakeErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsIsNull() {
            addCriterion("COUNT_PROXY_USER_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsIsNotNull() {
            addCriterion("COUNT_PROXY_USER_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ERRORS =", value, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ERRORS <>", value, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsGreaterThan(Long value) {
            addCriterion("COUNT_PROXY_USER_ERRORS >", value, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ERRORS >=", value, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsLessThan(Long value) {
            addCriterion("COUNT_PROXY_USER_ERRORS <", value, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ERRORS <=", value, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsIn(List<Long> values) {
            addCriterion("COUNT_PROXY_USER_ERRORS in", values, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_PROXY_USER_ERRORS not in", values, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_PROXY_USER_ERRORS between", value1, value2, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_PROXY_USER_ERRORS not between", value1, value2, "countProxyUserErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsIsNull() {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsIsNotNull() {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS =", value, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS <>", value, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsGreaterThan(Long value) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS >", value, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS >=", value, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsLessThan(Long value) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS <", value, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS <=", value, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsIn(List<Long> values) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS in", values, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS not in", values, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS between", value1, value2, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountProxyUserAclErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_PROXY_USER_ACL_ERRORS not between", value1, value2, "countProxyUserAclErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsIsNull() {
            addCriterion("COUNT_AUTHENTICATION_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsIsNotNull() {
            addCriterion("COUNT_AUTHENTICATION_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsEqualTo(Long value) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS =", value, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS <>", value, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsGreaterThan(Long value) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS >", value, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS >=", value, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsLessThan(Long value) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS <", value, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS <=", value, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsIn(List<Long> values) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS in", values, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS not in", values, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS between", value1, value2, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountAuthenticationErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_AUTHENTICATION_ERRORS not between", value1, value2, "countAuthenticationErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsIsNull() {
            addCriterion("COUNT_SSL_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsIsNotNull() {
            addCriterion("COUNT_SSL_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsEqualTo(Long value) {
            addCriterion("COUNT_SSL_ERRORS =", value, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_SSL_ERRORS <>", value, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsGreaterThan(Long value) {
            addCriterion("COUNT_SSL_ERRORS >", value, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_SSL_ERRORS >=", value, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsLessThan(Long value) {
            addCriterion("COUNT_SSL_ERRORS <", value, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_SSL_ERRORS <=", value, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsIn(List<Long> values) {
            addCriterion("COUNT_SSL_ERRORS in", values, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_SSL_ERRORS not in", values, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_SSL_ERRORS between", value1, value2, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountSslErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_SSL_ERRORS not between", value1, value2, "countSslErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsIsNull() {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsIsNotNull() {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS =", value, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS <>", value, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsGreaterThan(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS >", value, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS >=", value, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsLessThan(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS <", value, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS <=", value, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsIn(List<Long> values) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS in", values, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS not in", values, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS between", value1, value2, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_ERRORS not between", value1, value2, "countMaxUserConnectionsErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsIsNull() {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsIsNotNull() {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS =", value, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS <>", value, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsGreaterThan(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS >", value, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS >=", value, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsLessThan(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS <", value, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS <=", value, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsIn(List<Long> values) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS in", values, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS not in", values, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS between", value1, value2, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountMaxUserConnectionsPerHourErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_MAX_USER_CONNECTIONS_PER_HOUR_ERRORS not between", value1, value2, "countMaxUserConnectionsPerHourErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsIsNull() {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsIsNotNull() {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsEqualTo(Long value) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS =", value, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS <>", value, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsGreaterThan(Long value) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS >", value, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS >=", value, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsLessThan(Long value) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS <", value, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS <=", value, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsIn(List<Long> values) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS in", values, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS not in", values, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS between", value1, value2, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountDefaultDatabaseErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_DEFAULT_DATABASE_ERRORS not between", value1, value2, "countDefaultDatabaseErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsIsNull() {
            addCriterion("COUNT_INIT_CONNECT_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsIsNotNull() {
            addCriterion("COUNT_INIT_CONNECT_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsEqualTo(Long value) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS =", value, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS <>", value, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsGreaterThan(Long value) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS >", value, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS >=", value, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsLessThan(Long value) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS <", value, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS <=", value, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsIn(List<Long> values) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS in", values, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS not in", values, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS between", value1, value2, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountInitConnectErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_INIT_CONNECT_ERRORS not between", value1, value2, "countInitConnectErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsIsNull() {
            addCriterion("COUNT_LOCAL_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsIsNotNull() {
            addCriterion("COUNT_LOCAL_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsEqualTo(Long value) {
            addCriterion("COUNT_LOCAL_ERRORS =", value, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_LOCAL_ERRORS <>", value, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsGreaterThan(Long value) {
            addCriterion("COUNT_LOCAL_ERRORS >", value, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_LOCAL_ERRORS >=", value, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsLessThan(Long value) {
            addCriterion("COUNT_LOCAL_ERRORS <", value, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_LOCAL_ERRORS <=", value, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsIn(List<Long> values) {
            addCriterion("COUNT_LOCAL_ERRORS in", values, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_LOCAL_ERRORS not in", values, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_LOCAL_ERRORS between", value1, value2, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountLocalErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_LOCAL_ERRORS not between", value1, value2, "countLocalErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsIsNull() {
            addCriterion("COUNT_UNKNOWN_ERRORS is null");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsIsNotNull() {
            addCriterion("COUNT_UNKNOWN_ERRORS is not null");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsEqualTo(Long value) {
            addCriterion("COUNT_UNKNOWN_ERRORS =", value, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsNotEqualTo(Long value) {
            addCriterion("COUNT_UNKNOWN_ERRORS <>", value, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsGreaterThan(Long value) {
            addCriterion("COUNT_UNKNOWN_ERRORS >", value, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_UNKNOWN_ERRORS >=", value, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsLessThan(Long value) {
            addCriterion("COUNT_UNKNOWN_ERRORS <", value, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_UNKNOWN_ERRORS <=", value, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsIn(List<Long> values) {
            addCriterion("COUNT_UNKNOWN_ERRORS in", values, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsNotIn(List<Long> values) {
            addCriterion("COUNT_UNKNOWN_ERRORS not in", values, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsBetween(Long value1, Long value2) {
            addCriterion("COUNT_UNKNOWN_ERRORS between", value1, value2, "countUnknownErrors");
            return (Criteria) this;
        }

        public Criteria andCountUnknownErrorsNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_UNKNOWN_ERRORS not between", value1, value2, "countUnknownErrors");
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

        public Criteria andFirstErrorSeenIsNull() {
            addCriterion("FIRST_ERROR_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenIsNotNull() {
            addCriterion("FIRST_ERROR_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenEqualTo(Date value) {
            addCriterion("FIRST_ERROR_SEEN =", value, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenNotEqualTo(Date value) {
            addCriterion("FIRST_ERROR_SEEN <>", value, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenGreaterThan(Date value) {
            addCriterion("FIRST_ERROR_SEEN >", value, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_ERROR_SEEN >=", value, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenLessThan(Date value) {
            addCriterion("FIRST_ERROR_SEEN <", value, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_ERROR_SEEN <=", value, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenIn(List<Date> values) {
            addCriterion("FIRST_ERROR_SEEN in", values, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenNotIn(List<Date> values) {
            addCriterion("FIRST_ERROR_SEEN not in", values, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenBetween(Date value1, Date value2) {
            addCriterion("FIRST_ERROR_SEEN between", value1, value2, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andFirstErrorSeenNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_ERROR_SEEN not between", value1, value2, "firstErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenIsNull() {
            addCriterion("LAST_ERROR_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenIsNotNull() {
            addCriterion("LAST_ERROR_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenEqualTo(Date value) {
            addCriterion("LAST_ERROR_SEEN =", value, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenNotEqualTo(Date value) {
            addCriterion("LAST_ERROR_SEEN <>", value, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenGreaterThan(Date value) {
            addCriterion("LAST_ERROR_SEEN >", value, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_ERROR_SEEN >=", value, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenLessThan(Date value) {
            addCriterion("LAST_ERROR_SEEN <", value, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenLessThanOrEqualTo(Date value) {
            addCriterion("LAST_ERROR_SEEN <=", value, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenIn(List<Date> values) {
            addCriterion("LAST_ERROR_SEEN in", values, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenNotIn(List<Date> values) {
            addCriterion("LAST_ERROR_SEEN not in", values, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenBetween(Date value1, Date value2) {
            addCriterion("LAST_ERROR_SEEN between", value1, value2, "lastErrorSeen");
            return (Criteria) this;
        }

        public Criteria andLastErrorSeenNotBetween(Date value1, Date value2) {
            addCriterion("LAST_ERROR_SEEN not between", value1, value2, "lastErrorSeen");
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