package cn.wwinter.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XStatementAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XStatementAnalysisExample() {
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

        public Criteria andDbIsNull() {
            addCriterion("db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andFullScanIsNull() {
            addCriterion("full_scan is null");
            return (Criteria) this;
        }

        public Criteria andFullScanIsNotNull() {
            addCriterion("full_scan is not null");
            return (Criteria) this;
        }

        public Criteria andFullScanEqualTo(String value) {
            addCriterion("full_scan =", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotEqualTo(String value) {
            addCriterion("full_scan <>", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanGreaterThan(String value) {
            addCriterion("full_scan >", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanGreaterThanOrEqualTo(String value) {
            addCriterion("full_scan >=", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanLessThan(String value) {
            addCriterion("full_scan <", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanLessThanOrEqualTo(String value) {
            addCriterion("full_scan <=", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanLike(String value) {
            addCriterion("full_scan like", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotLike(String value) {
            addCriterion("full_scan not like", value, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanIn(List<String> values) {
            addCriterion("full_scan in", values, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotIn(List<String> values) {
            addCriterion("full_scan not in", values, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanBetween(String value1, String value2) {
            addCriterion("full_scan between", value1, value2, "fullScan");
            return (Criteria) this;
        }

        public Criteria andFullScanNotBetween(String value1, String value2) {
            addCriterion("full_scan not between", value1, value2, "fullScan");
            return (Criteria) this;
        }

        public Criteria andExecCountIsNull() {
            addCriterion("exec_count is null");
            return (Criteria) this;
        }

        public Criteria andExecCountIsNotNull() {
            addCriterion("exec_count is not null");
            return (Criteria) this;
        }

        public Criteria andExecCountEqualTo(Long value) {
            addCriterion("exec_count =", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotEqualTo(Long value) {
            addCriterion("exec_count <>", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountGreaterThan(Long value) {
            addCriterion("exec_count >", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountGreaterThanOrEqualTo(Long value) {
            addCriterion("exec_count >=", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountLessThan(Long value) {
            addCriterion("exec_count <", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountLessThanOrEqualTo(Long value) {
            addCriterion("exec_count <=", value, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountIn(List<Long> values) {
            addCriterion("exec_count in", values, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotIn(List<Long> values) {
            addCriterion("exec_count not in", values, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountBetween(Long value1, Long value2) {
            addCriterion("exec_count between", value1, value2, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecCountNotBetween(Long value1, Long value2) {
            addCriterion("exec_count not between", value1, value2, "execCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountIsNull() {
            addCriterion("exec_secondary_count is null");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountIsNotNull() {
            addCriterion("exec_secondary_count is not null");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountEqualTo(Long value) {
            addCriterion("exec_secondary_count =", value, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountNotEqualTo(Long value) {
            addCriterion("exec_secondary_count <>", value, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountGreaterThan(Long value) {
            addCriterion("exec_secondary_count >", value, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountGreaterThanOrEqualTo(Long value) {
            addCriterion("exec_secondary_count >=", value, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountLessThan(Long value) {
            addCriterion("exec_secondary_count <", value, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountLessThanOrEqualTo(Long value) {
            addCriterion("exec_secondary_count <=", value, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountIn(List<Long> values) {
            addCriterion("exec_secondary_count in", values, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountNotIn(List<Long> values) {
            addCriterion("exec_secondary_count not in", values, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountBetween(Long value1, Long value2) {
            addCriterion("exec_secondary_count between", value1, value2, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andExecSecondaryCountNotBetween(Long value1, Long value2) {
            addCriterion("exec_secondary_count not between", value1, value2, "execSecondaryCount");
            return (Criteria) this;
        }

        public Criteria andErrCountIsNull() {
            addCriterion("err_count is null");
            return (Criteria) this;
        }

        public Criteria andErrCountIsNotNull() {
            addCriterion("err_count is not null");
            return (Criteria) this;
        }

        public Criteria andErrCountEqualTo(Long value) {
            addCriterion("err_count =", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountNotEqualTo(Long value) {
            addCriterion("err_count <>", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountGreaterThan(Long value) {
            addCriterion("err_count >", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountGreaterThanOrEqualTo(Long value) {
            addCriterion("err_count >=", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountLessThan(Long value) {
            addCriterion("err_count <", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountLessThanOrEqualTo(Long value) {
            addCriterion("err_count <=", value, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountIn(List<Long> values) {
            addCriterion("err_count in", values, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountNotIn(List<Long> values) {
            addCriterion("err_count not in", values, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountBetween(Long value1, Long value2) {
            addCriterion("err_count between", value1, value2, "errCount");
            return (Criteria) this;
        }

        public Criteria andErrCountNotBetween(Long value1, Long value2) {
            addCriterion("err_count not between", value1, value2, "errCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountIsNull() {
            addCriterion("warn_count is null");
            return (Criteria) this;
        }

        public Criteria andWarnCountIsNotNull() {
            addCriterion("warn_count is not null");
            return (Criteria) this;
        }

        public Criteria andWarnCountEqualTo(Long value) {
            addCriterion("warn_count =", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountNotEqualTo(Long value) {
            addCriterion("warn_count <>", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountGreaterThan(Long value) {
            addCriterion("warn_count >", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountGreaterThanOrEqualTo(Long value) {
            addCriterion("warn_count >=", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountLessThan(Long value) {
            addCriterion("warn_count <", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountLessThanOrEqualTo(Long value) {
            addCriterion("warn_count <=", value, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountIn(List<Long> values) {
            addCriterion("warn_count in", values, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountNotIn(List<Long> values) {
            addCriterion("warn_count not in", values, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountBetween(Long value1, Long value2) {
            addCriterion("warn_count between", value1, value2, "warnCount");
            return (Criteria) this;
        }

        public Criteria andWarnCountNotBetween(Long value1, Long value2) {
            addCriterion("warn_count not between", value1, value2, "warnCount");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNull() {
            addCriterion("total_latency is null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIsNotNull() {
            addCriterion("total_latency is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyEqualTo(Long value) {
            addCriterion("total_latency =", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotEqualTo(Long value) {
            addCriterion("total_latency <>", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThan(Long value) {
            addCriterion("total_latency >", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("total_latency >=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThan(Long value) {
            addCriterion("total_latency <", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThanOrEqualTo(Long value) {
            addCriterion("total_latency <=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIn(List<Long> values) {
            addCriterion("total_latency in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotIn(List<Long> values) {
            addCriterion("total_latency not in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyBetween(Long value1, Long value2) {
            addCriterion("total_latency between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotBetween(Long value1, Long value2) {
            addCriterion("total_latency not between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIsNull() {
            addCriterion("max_latency is null");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIsNotNull() {
            addCriterion("max_latency is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyEqualTo(Long value) {
            addCriterion("max_latency =", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotEqualTo(Long value) {
            addCriterion("max_latency <>", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThan(Long value) {
            addCriterion("max_latency >", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("max_latency >=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThan(Long value) {
            addCriterion("max_latency <", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThanOrEqualTo(Long value) {
            addCriterion("max_latency <=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIn(List<Long> values) {
            addCriterion("max_latency in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotIn(List<Long> values) {
            addCriterion("max_latency not in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyBetween(Long value1, Long value2) {
            addCriterion("max_latency between", value1, value2, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotBetween(Long value1, Long value2) {
            addCriterion("max_latency not between", value1, value2, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIsNull() {
            addCriterion("avg_latency is null");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIsNotNull() {
            addCriterion("avg_latency is not null");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyEqualTo(Long value) {
            addCriterion("avg_latency =", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotEqualTo(Long value) {
            addCriterion("avg_latency <>", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThan(Long value) {
            addCriterion("avg_latency >", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("avg_latency >=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThan(Long value) {
            addCriterion("avg_latency <", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThanOrEqualTo(Long value) {
            addCriterion("avg_latency <=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIn(List<Long> values) {
            addCriterion("avg_latency in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotIn(List<Long> values) {
            addCriterion("avg_latency not in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyBetween(Long value1, Long value2) {
            addCriterion("avg_latency between", value1, value2, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotBetween(Long value1, Long value2) {
            addCriterion("avg_latency not between", value1, value2, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyIsNull() {
            addCriterion("lock_latency is null");
            return (Criteria) this;
        }

        public Criteria andLockLatencyIsNotNull() {
            addCriterion("lock_latency is not null");
            return (Criteria) this;
        }

        public Criteria andLockLatencyEqualTo(Long value) {
            addCriterion("lock_latency =", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotEqualTo(Long value) {
            addCriterion("lock_latency <>", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyGreaterThan(Long value) {
            addCriterion("lock_latency >", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("lock_latency >=", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyLessThan(Long value) {
            addCriterion("lock_latency <", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyLessThanOrEqualTo(Long value) {
            addCriterion("lock_latency <=", value, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyIn(List<Long> values) {
            addCriterion("lock_latency in", values, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotIn(List<Long> values) {
            addCriterion("lock_latency not in", values, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyBetween(Long value1, Long value2) {
            addCriterion("lock_latency between", value1, value2, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andLockLatencyNotBetween(Long value1, Long value2) {
            addCriterion("lock_latency not between", value1, value2, "lockLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyIsNull() {
            addCriterion("cpu_latency is null");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyIsNotNull() {
            addCriterion("cpu_latency is not null");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyEqualTo(Long value) {
            addCriterion("cpu_latency =", value, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyNotEqualTo(Long value) {
            addCriterion("cpu_latency <>", value, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyGreaterThan(Long value) {
            addCriterion("cpu_latency >", value, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyGreaterThanOrEqualTo(Long value) {
            addCriterion("cpu_latency >=", value, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyLessThan(Long value) {
            addCriterion("cpu_latency <", value, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyLessThanOrEqualTo(Long value) {
            addCriterion("cpu_latency <=", value, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyIn(List<Long> values) {
            addCriterion("cpu_latency in", values, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyNotIn(List<Long> values) {
            addCriterion("cpu_latency not in", values, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyBetween(Long value1, Long value2) {
            addCriterion("cpu_latency between", value1, value2, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andCpuLatencyNotBetween(Long value1, Long value2) {
            addCriterion("cpu_latency not between", value1, value2, "cpuLatency");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNull() {
            addCriterion("rows_sent is null");
            return (Criteria) this;
        }

        public Criteria andRowsSentIsNotNull() {
            addCriterion("rows_sent is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSentEqualTo(Long value) {
            addCriterion("rows_sent =", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotEqualTo(Long value) {
            addCriterion("rows_sent <>", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThan(Long value) {
            addCriterion("rows_sent >", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_sent >=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThan(Long value) {
            addCriterion("rows_sent <", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentLessThanOrEqualTo(Long value) {
            addCriterion("rows_sent <=", value, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentIn(List<Long> values) {
            addCriterion("rows_sent in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotIn(List<Long> values) {
            addCriterion("rows_sent not in", values, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentBetween(Long value1, Long value2) {
            addCriterion("rows_sent between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentNotBetween(Long value1, Long value2) {
            addCriterion("rows_sent not between", value1, value2, "rowsSent");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgIsNull() {
            addCriterion("rows_sent_avg is null");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgIsNotNull() {
            addCriterion("rows_sent_avg is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg =", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgNotEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg <>", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgGreaterThan(BigDecimal value) {
            addCriterion("rows_sent_avg >", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg >=", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgLessThan(BigDecimal value) {
            addCriterion("rows_sent_avg <", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg <=", value, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgIn(List<BigDecimal> values) {
            addCriterion("rows_sent_avg in", values, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgNotIn(List<BigDecimal> values) {
            addCriterion("rows_sent_avg not in", values, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent_avg between", value1, value2, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsSentAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent_avg not between", value1, value2, "rowsSentAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNull() {
            addCriterion("rows_examined is null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIsNotNull() {
            addCriterion("rows_examined is not null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedEqualTo(Long value) {
            addCriterion("rows_examined =", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotEqualTo(Long value) {
            addCriterion("rows_examined <>", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThan(Long value) {
            addCriterion("rows_examined >", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_examined >=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThan(Long value) {
            addCriterion("rows_examined <", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedLessThanOrEqualTo(Long value) {
            addCriterion("rows_examined <=", value, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedIn(List<Long> values) {
            addCriterion("rows_examined in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotIn(List<Long> values) {
            addCriterion("rows_examined not in", values, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedBetween(Long value1, Long value2) {
            addCriterion("rows_examined between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedNotBetween(Long value1, Long value2) {
            addCriterion("rows_examined not between", value1, value2, "rowsExamined");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgIsNull() {
            addCriterion("rows_examined_avg is null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgIsNotNull() {
            addCriterion("rows_examined_avg is not null");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg =", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgNotEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg <>", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgGreaterThan(BigDecimal value) {
            addCriterion("rows_examined_avg >", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg >=", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgLessThan(BigDecimal value) {
            addCriterion("rows_examined_avg <", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg <=", value, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgIn(List<BigDecimal> values) {
            addCriterion("rows_examined_avg in", values, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgNotIn(List<BigDecimal> values) {
            addCriterion("rows_examined_avg not in", values, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined_avg between", value1, value2, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsExaminedAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined_avg not between", value1, value2, "rowsExaminedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIsNull() {
            addCriterion("rows_affected is null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIsNotNull() {
            addCriterion("rows_affected is not null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedEqualTo(Long value) {
            addCriterion("rows_affected =", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotEqualTo(Long value) {
            addCriterion("rows_affected <>", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThan(Long value) {
            addCriterion("rows_affected >", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_affected >=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThan(Long value) {
            addCriterion("rows_affected <", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedLessThanOrEqualTo(Long value) {
            addCriterion("rows_affected <=", value, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedIn(List<Long> values) {
            addCriterion("rows_affected in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotIn(List<Long> values) {
            addCriterion("rows_affected not in", values, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedBetween(Long value1, Long value2) {
            addCriterion("rows_affected between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedNotBetween(Long value1, Long value2) {
            addCriterion("rows_affected not between", value1, value2, "rowsAffected");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgIsNull() {
            addCriterion("rows_affected_avg is null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgIsNotNull() {
            addCriterion("rows_affected_avg is not null");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgEqualTo(BigDecimal value) {
            addCriterion("rows_affected_avg =", value, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgNotEqualTo(BigDecimal value) {
            addCriterion("rows_affected_avg <>", value, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgGreaterThan(BigDecimal value) {
            addCriterion("rows_affected_avg >", value, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_affected_avg >=", value, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgLessThan(BigDecimal value) {
            addCriterion("rows_affected_avg <", value, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_affected_avg <=", value, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgIn(List<BigDecimal> values) {
            addCriterion("rows_affected_avg in", values, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgNotIn(List<BigDecimal> values) {
            addCriterion("rows_affected_avg not in", values, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_affected_avg between", value1, value2, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andRowsAffectedAvgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_affected_avg not between", value1, value2, "rowsAffectedAvg");
            return (Criteria) this;
        }

        public Criteria andTmpTablesIsNull() {
            addCriterion("tmp_tables is null");
            return (Criteria) this;
        }

        public Criteria andTmpTablesIsNotNull() {
            addCriterion("tmp_tables is not null");
            return (Criteria) this;
        }

        public Criteria andTmpTablesEqualTo(Long value) {
            addCriterion("tmp_tables =", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesNotEqualTo(Long value) {
            addCriterion("tmp_tables <>", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesGreaterThan(Long value) {
            addCriterion("tmp_tables >", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("tmp_tables >=", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesLessThan(Long value) {
            addCriterion("tmp_tables <", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesLessThanOrEqualTo(Long value) {
            addCriterion("tmp_tables <=", value, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesIn(List<Long> values) {
            addCriterion("tmp_tables in", values, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesNotIn(List<Long> values) {
            addCriterion("tmp_tables not in", values, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesBetween(Long value1, Long value2) {
            addCriterion("tmp_tables between", value1, value2, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpTablesNotBetween(Long value1, Long value2) {
            addCriterion("tmp_tables not between", value1, value2, "tmpTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesIsNull() {
            addCriterion("tmp_disk_tables is null");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesIsNotNull() {
            addCriterion("tmp_disk_tables is not null");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesEqualTo(Long value) {
            addCriterion("tmp_disk_tables =", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesNotEqualTo(Long value) {
            addCriterion("tmp_disk_tables <>", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesGreaterThan(Long value) {
            addCriterion("tmp_disk_tables >", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesGreaterThanOrEqualTo(Long value) {
            addCriterion("tmp_disk_tables >=", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesLessThan(Long value) {
            addCriterion("tmp_disk_tables <", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesLessThanOrEqualTo(Long value) {
            addCriterion("tmp_disk_tables <=", value, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesIn(List<Long> values) {
            addCriterion("tmp_disk_tables in", values, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesNotIn(List<Long> values) {
            addCriterion("tmp_disk_tables not in", values, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesBetween(Long value1, Long value2) {
            addCriterion("tmp_disk_tables between", value1, value2, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andTmpDiskTablesNotBetween(Long value1, Long value2) {
            addCriterion("tmp_disk_tables not between", value1, value2, "tmpDiskTables");
            return (Criteria) this;
        }

        public Criteria andRowsSortedIsNull() {
            addCriterion("rows_sorted is null");
            return (Criteria) this;
        }

        public Criteria andRowsSortedIsNotNull() {
            addCriterion("rows_sorted is not null");
            return (Criteria) this;
        }

        public Criteria andRowsSortedEqualTo(Long value) {
            addCriterion("rows_sorted =", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedNotEqualTo(Long value) {
            addCriterion("rows_sorted <>", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedGreaterThan(Long value) {
            addCriterion("rows_sorted >", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_sorted >=", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedLessThan(Long value) {
            addCriterion("rows_sorted <", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedLessThanOrEqualTo(Long value) {
            addCriterion("rows_sorted <=", value, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedIn(List<Long> values) {
            addCriterion("rows_sorted in", values, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedNotIn(List<Long> values) {
            addCriterion("rows_sorted not in", values, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedBetween(Long value1, Long value2) {
            addCriterion("rows_sorted between", value1, value2, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andRowsSortedNotBetween(Long value1, Long value2) {
            addCriterion("rows_sorted not between", value1, value2, "rowsSorted");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIsNull() {
            addCriterion("sort_merge_passes is null");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIsNotNull() {
            addCriterion("sort_merge_passes is not null");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesEqualTo(Long value) {
            addCriterion("sort_merge_passes =", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotEqualTo(Long value) {
            addCriterion("sort_merge_passes <>", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesGreaterThan(Long value) {
            addCriterion("sort_merge_passes >", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesGreaterThanOrEqualTo(Long value) {
            addCriterion("sort_merge_passes >=", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesLessThan(Long value) {
            addCriterion("sort_merge_passes <", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesLessThanOrEqualTo(Long value) {
            addCriterion("sort_merge_passes <=", value, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesIn(List<Long> values) {
            addCriterion("sort_merge_passes in", values, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotIn(List<Long> values) {
            addCriterion("sort_merge_passes not in", values, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesBetween(Long value1, Long value2) {
            addCriterion("sort_merge_passes between", value1, value2, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andSortMergePassesNotBetween(Long value1, Long value2) {
            addCriterion("sort_merge_passes not between", value1, value2, "sortMergePasses");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryIsNull() {
            addCriterion("max_controlled_memory is null");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryIsNotNull() {
            addCriterion("max_controlled_memory is not null");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryEqualTo(Long value) {
            addCriterion("max_controlled_memory =", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryNotEqualTo(Long value) {
            addCriterion("max_controlled_memory <>", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryGreaterThan(Long value) {
            addCriterion("max_controlled_memory >", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryGreaterThanOrEqualTo(Long value) {
            addCriterion("max_controlled_memory >=", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryLessThan(Long value) {
            addCriterion("max_controlled_memory <", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryLessThanOrEqualTo(Long value) {
            addCriterion("max_controlled_memory <=", value, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryIn(List<Long> values) {
            addCriterion("max_controlled_memory in", values, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryNotIn(List<Long> values) {
            addCriterion("max_controlled_memory not in", values, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryBetween(Long value1, Long value2) {
            addCriterion("max_controlled_memory between", value1, value2, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxControlledMemoryNotBetween(Long value1, Long value2) {
            addCriterion("max_controlled_memory not between", value1, value2, "maxControlledMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryIsNull() {
            addCriterion("max_total_memory is null");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryIsNotNull() {
            addCriterion("max_total_memory is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryEqualTo(Long value) {
            addCriterion("max_total_memory =", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryNotEqualTo(Long value) {
            addCriterion("max_total_memory <>", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryGreaterThan(Long value) {
            addCriterion("max_total_memory >", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryGreaterThanOrEqualTo(Long value) {
            addCriterion("max_total_memory >=", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryLessThan(Long value) {
            addCriterion("max_total_memory <", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryLessThanOrEqualTo(Long value) {
            addCriterion("max_total_memory <=", value, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryIn(List<Long> values) {
            addCriterion("max_total_memory in", values, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryNotIn(List<Long> values) {
            addCriterion("max_total_memory not in", values, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryBetween(Long value1, Long value2) {
            addCriterion("max_total_memory between", value1, value2, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andMaxTotalMemoryNotBetween(Long value1, Long value2) {
            addCriterion("max_total_memory not between", value1, value2, "maxTotalMemory");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("digest is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("digest is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("digest =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("digest <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("digest >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("digest >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("digest <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("digest <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("digest like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("digest not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("digest in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("digest not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("digest between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("digest not between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNull() {
            addCriterion("first_seen is null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNotNull() {
            addCriterion("first_seen is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenEqualTo(Date value) {
            addCriterion("first_seen =", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotEqualTo(Date value) {
            addCriterion("first_seen <>", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThan(Date value) {
            addCriterion("first_seen >", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("first_seen >=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThan(Date value) {
            addCriterion("first_seen <", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThanOrEqualTo(Date value) {
            addCriterion("first_seen <=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIn(List<Date> values) {
            addCriterion("first_seen in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotIn(List<Date> values) {
            addCriterion("first_seen not in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenBetween(Date value1, Date value2) {
            addCriterion("first_seen between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotBetween(Date value1, Date value2) {
            addCriterion("first_seen not between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNull() {
            addCriterion("last_seen is null");
            return (Criteria) this;
        }

        public Criteria andLastSeenIsNotNull() {
            addCriterion("last_seen is not null");
            return (Criteria) this;
        }

        public Criteria andLastSeenEqualTo(Date value) {
            addCriterion("last_seen =", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotEqualTo(Date value) {
            addCriterion("last_seen <>", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThan(Date value) {
            addCriterion("last_seen >", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("last_seen >=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThan(Date value) {
            addCriterion("last_seen <", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenLessThanOrEqualTo(Date value) {
            addCriterion("last_seen <=", value, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenIn(List<Date> values) {
            addCriterion("last_seen in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotIn(List<Date> values) {
            addCriterion("last_seen not in", values, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenBetween(Date value1, Date value2) {
            addCriterion("last_seen between", value1, value2, "lastSeen");
            return (Criteria) this;
        }

        public Criteria andLastSeenNotBetween(Date value1, Date value2) {
            addCriterion("last_seen not between", value1, value2, "lastSeen");
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