package cn.wwinter.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HostSummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HostSummaryExample() {
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

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andStatementsIsNull() {
            addCriterion("statements is null");
            return (Criteria) this;
        }

        public Criteria andStatementsIsNotNull() {
            addCriterion("statements is not null");
            return (Criteria) this;
        }

        public Criteria andStatementsEqualTo(BigDecimal value) {
            addCriterion("statements =", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsNotEqualTo(BigDecimal value) {
            addCriterion("statements <>", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsGreaterThan(BigDecimal value) {
            addCriterion("statements >", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("statements >=", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsLessThan(BigDecimal value) {
            addCriterion("statements <", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("statements <=", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsIn(List<BigDecimal> values) {
            addCriterion("statements in", values, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsNotIn(List<BigDecimal> values) {
            addCriterion("statements not in", values, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("statements between", value1, value2, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("statements not between", value1, value2, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyIsNull() {
            addCriterion("statement_latency is null");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyIsNotNull() {
            addCriterion("statement_latency is not null");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyEqualTo(String value) {
            addCriterion("statement_latency =", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyNotEqualTo(String value) {
            addCriterion("statement_latency <>", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyGreaterThan(String value) {
            addCriterion("statement_latency >", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("statement_latency >=", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyLessThan(String value) {
            addCriterion("statement_latency <", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyLessThanOrEqualTo(String value) {
            addCriterion("statement_latency <=", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyLike(String value) {
            addCriterion("statement_latency like", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyNotLike(String value) {
            addCriterion("statement_latency not like", value, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyIn(List<String> values) {
            addCriterion("statement_latency in", values, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyNotIn(List<String> values) {
            addCriterion("statement_latency not in", values, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyBetween(String value1, String value2) {
            addCriterion("statement_latency between", value1, value2, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementLatencyNotBetween(String value1, String value2) {
            addCriterion("statement_latency not between", value1, value2, "statementLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyIsNull() {
            addCriterion("statement_avg_latency is null");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyIsNotNull() {
            addCriterion("statement_avg_latency is not null");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyEqualTo(String value) {
            addCriterion("statement_avg_latency =", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyNotEqualTo(String value) {
            addCriterion("statement_avg_latency <>", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyGreaterThan(String value) {
            addCriterion("statement_avg_latency >", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("statement_avg_latency >=", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyLessThan(String value) {
            addCriterion("statement_avg_latency <", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyLessThanOrEqualTo(String value) {
            addCriterion("statement_avg_latency <=", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyLike(String value) {
            addCriterion("statement_avg_latency like", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyNotLike(String value) {
            addCriterion("statement_avg_latency not like", value, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyIn(List<String> values) {
            addCriterion("statement_avg_latency in", values, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyNotIn(List<String> values) {
            addCriterion("statement_avg_latency not in", values, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyBetween(String value1, String value2) {
            addCriterion("statement_avg_latency between", value1, value2, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andStatementAvgLatencyNotBetween(String value1, String value2) {
            addCriterion("statement_avg_latency not between", value1, value2, "statementAvgLatency");
            return (Criteria) this;
        }

        public Criteria andTableScansIsNull() {
            addCriterion("table_scans is null");
            return (Criteria) this;
        }

        public Criteria andTableScansIsNotNull() {
            addCriterion("table_scans is not null");
            return (Criteria) this;
        }

        public Criteria andTableScansEqualTo(BigDecimal value) {
            addCriterion("table_scans =", value, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansNotEqualTo(BigDecimal value) {
            addCriterion("table_scans <>", value, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansGreaterThan(BigDecimal value) {
            addCriterion("table_scans >", value, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("table_scans >=", value, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansLessThan(BigDecimal value) {
            addCriterion("table_scans <", value, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansLessThanOrEqualTo(BigDecimal value) {
            addCriterion("table_scans <=", value, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansIn(List<BigDecimal> values) {
            addCriterion("table_scans in", values, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansNotIn(List<BigDecimal> values) {
            addCriterion("table_scans not in", values, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("table_scans between", value1, value2, "tableScans");
            return (Criteria) this;
        }

        public Criteria andTableScansNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("table_scans not between", value1, value2, "tableScans");
            return (Criteria) this;
        }

        public Criteria andFileIosIsNull() {
            addCriterion("file_ios is null");
            return (Criteria) this;
        }

        public Criteria andFileIosIsNotNull() {
            addCriterion("file_ios is not null");
            return (Criteria) this;
        }

        public Criteria andFileIosEqualTo(BigDecimal value) {
            addCriterion("file_ios =", value, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosNotEqualTo(BigDecimal value) {
            addCriterion("file_ios <>", value, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosGreaterThan(BigDecimal value) {
            addCriterion("file_ios >", value, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("file_ios >=", value, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosLessThan(BigDecimal value) {
            addCriterion("file_ios <", value, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("file_ios <=", value, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosIn(List<BigDecimal> values) {
            addCriterion("file_ios in", values, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosNotIn(List<BigDecimal> values) {
            addCriterion("file_ios not in", values, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_ios between", value1, value2, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_ios not between", value1, value2, "fileIos");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyIsNull() {
            addCriterion("file_io_latency is null");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyIsNotNull() {
            addCriterion("file_io_latency is not null");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyEqualTo(String value) {
            addCriterion("file_io_latency =", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyNotEqualTo(String value) {
            addCriterion("file_io_latency <>", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyGreaterThan(String value) {
            addCriterion("file_io_latency >", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("file_io_latency >=", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyLessThan(String value) {
            addCriterion("file_io_latency <", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyLessThanOrEqualTo(String value) {
            addCriterion("file_io_latency <=", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyLike(String value) {
            addCriterion("file_io_latency like", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyNotLike(String value) {
            addCriterion("file_io_latency not like", value, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyIn(List<String> values) {
            addCriterion("file_io_latency in", values, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyNotIn(List<String> values) {
            addCriterion("file_io_latency not in", values, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyBetween(String value1, String value2) {
            addCriterion("file_io_latency between", value1, value2, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andFileIoLatencyNotBetween(String value1, String value2) {
            addCriterion("file_io_latency not between", value1, value2, "fileIoLatency");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsIsNull() {
            addCriterion("current_connections is null");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsIsNotNull() {
            addCriterion("current_connections is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsEqualTo(BigDecimal value) {
            addCriterion("current_connections =", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsNotEqualTo(BigDecimal value) {
            addCriterion("current_connections <>", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsGreaterThan(BigDecimal value) {
            addCriterion("current_connections >", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_connections >=", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsLessThan(BigDecimal value) {
            addCriterion("current_connections <", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_connections <=", value, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsIn(List<BigDecimal> values) {
            addCriterion("current_connections in", values, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsNotIn(List<BigDecimal> values) {
            addCriterion("current_connections not in", values, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_connections between", value1, value2, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andCurrentConnectionsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_connections not between", value1, value2, "currentConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIsNull() {
            addCriterion("total_connections is null");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIsNotNull() {
            addCriterion("total_connections is not null");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsEqualTo(BigDecimal value) {
            addCriterion("total_connections =", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotEqualTo(BigDecimal value) {
            addCriterion("total_connections <>", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsGreaterThan(BigDecimal value) {
            addCriterion("total_connections >", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_connections >=", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsLessThan(BigDecimal value) {
            addCriterion("total_connections <", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_connections <=", value, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsIn(List<BigDecimal> values) {
            addCriterion("total_connections in", values, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotIn(List<BigDecimal> values) {
            addCriterion("total_connections not in", values, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_connections between", value1, value2, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andTotalConnectionsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_connections not between", value1, value2, "totalConnections");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersIsNull() {
            addCriterion("unique_users is null");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersIsNotNull() {
            addCriterion("unique_users is not null");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersEqualTo(Long value) {
            addCriterion("unique_users =", value, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersNotEqualTo(Long value) {
            addCriterion("unique_users <>", value, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersGreaterThan(Long value) {
            addCriterion("unique_users >", value, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersGreaterThanOrEqualTo(Long value) {
            addCriterion("unique_users >=", value, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersLessThan(Long value) {
            addCriterion("unique_users <", value, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersLessThanOrEqualTo(Long value) {
            addCriterion("unique_users <=", value, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersIn(List<Long> values) {
            addCriterion("unique_users in", values, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersNotIn(List<Long> values) {
            addCriterion("unique_users not in", values, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersBetween(Long value1, Long value2) {
            addCriterion("unique_users between", value1, value2, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andUniqueUsersNotBetween(Long value1, Long value2) {
            addCriterion("unique_users not between", value1, value2, "uniqueUsers");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryIsNull() {
            addCriterion("current_memory is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryIsNotNull() {
            addCriterion("current_memory is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryEqualTo(String value) {
            addCriterion("current_memory =", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryNotEqualTo(String value) {
            addCriterion("current_memory <>", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryGreaterThan(String value) {
            addCriterion("current_memory >", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("current_memory >=", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryLessThan(String value) {
            addCriterion("current_memory <", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryLessThanOrEqualTo(String value) {
            addCriterion("current_memory <=", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryLike(String value) {
            addCriterion("current_memory like", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryNotLike(String value) {
            addCriterion("current_memory not like", value, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryIn(List<String> values) {
            addCriterion("current_memory in", values, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryNotIn(List<String> values) {
            addCriterion("current_memory not in", values, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryBetween(String value1, String value2) {
            addCriterion("current_memory between", value1, value2, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andCurrentMemoryNotBetween(String value1, String value2) {
            addCriterion("current_memory not between", value1, value2, "currentMemory");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedIsNull() {
            addCriterion("total_memory_allocated is null");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedIsNotNull() {
            addCriterion("total_memory_allocated is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedEqualTo(String value) {
            addCriterion("total_memory_allocated =", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedNotEqualTo(String value) {
            addCriterion("total_memory_allocated <>", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedGreaterThan(String value) {
            addCriterion("total_memory_allocated >", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedGreaterThanOrEqualTo(String value) {
            addCriterion("total_memory_allocated >=", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedLessThan(String value) {
            addCriterion("total_memory_allocated <", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedLessThanOrEqualTo(String value) {
            addCriterion("total_memory_allocated <=", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedLike(String value) {
            addCriterion("total_memory_allocated like", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedNotLike(String value) {
            addCriterion("total_memory_allocated not like", value, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedIn(List<String> values) {
            addCriterion("total_memory_allocated in", values, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedNotIn(List<String> values) {
            addCriterion("total_memory_allocated not in", values, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedBetween(String value1, String value2) {
            addCriterion("total_memory_allocated between", value1, value2, "totalMemoryAllocated");
            return (Criteria) this;
        }

        public Criteria andTotalMemoryAllocatedNotBetween(String value1, String value2) {
            addCriterion("total_memory_allocated not between", value1, value2, "totalMemoryAllocated");
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