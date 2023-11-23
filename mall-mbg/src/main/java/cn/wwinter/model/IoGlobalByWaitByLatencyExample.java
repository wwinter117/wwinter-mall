package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class IoGlobalByWaitByLatencyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IoGlobalByWaitByLatencyExample() {
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
            addCriterion("event_name is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("event_name is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("event_name =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("event_name <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("event_name >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("event_name >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("event_name <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("event_name <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("event_name like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("event_name not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("event_name in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("event_name not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("event_name between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("event_name not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
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

        public Criteria andTotalLatencyEqualTo(String value) {
            addCriterion("total_latency =", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotEqualTo(String value) {
            addCriterion("total_latency <>", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThan(String value) {
            addCriterion("total_latency >", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("total_latency >=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThan(String value) {
            addCriterion("total_latency <", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLessThanOrEqualTo(String value) {
            addCriterion("total_latency <=", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyLike(String value) {
            addCriterion("total_latency like", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotLike(String value) {
            addCriterion("total_latency not like", value, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyIn(List<String> values) {
            addCriterion("total_latency in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotIn(List<String> values) {
            addCriterion("total_latency not in", values, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyBetween(String value1, String value2) {
            addCriterion("total_latency between", value1, value2, "totalLatency");
            return (Criteria) this;
        }

        public Criteria andTotalLatencyNotBetween(String value1, String value2) {
            addCriterion("total_latency not between", value1, value2, "totalLatency");
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

        public Criteria andAvgLatencyEqualTo(String value) {
            addCriterion("avg_latency =", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotEqualTo(String value) {
            addCriterion("avg_latency <>", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThan(String value) {
            addCriterion("avg_latency >", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("avg_latency >=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThan(String value) {
            addCriterion("avg_latency <", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLessThanOrEqualTo(String value) {
            addCriterion("avg_latency <=", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyLike(String value) {
            addCriterion("avg_latency like", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotLike(String value) {
            addCriterion("avg_latency not like", value, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyIn(List<String> values) {
            addCriterion("avg_latency in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotIn(List<String> values) {
            addCriterion("avg_latency not in", values, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyBetween(String value1, String value2) {
            addCriterion("avg_latency between", value1, value2, "avgLatency");
            return (Criteria) this;
        }

        public Criteria andAvgLatencyNotBetween(String value1, String value2) {
            addCriterion("avg_latency not between", value1, value2, "avgLatency");
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

        public Criteria andMaxLatencyEqualTo(String value) {
            addCriterion("max_latency =", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotEqualTo(String value) {
            addCriterion("max_latency <>", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThan(String value) {
            addCriterion("max_latency >", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("max_latency >=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThan(String value) {
            addCriterion("max_latency <", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLessThanOrEqualTo(String value) {
            addCriterion("max_latency <=", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyLike(String value) {
            addCriterion("max_latency like", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotLike(String value) {
            addCriterion("max_latency not like", value, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyIn(List<String> values) {
            addCriterion("max_latency in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotIn(List<String> values) {
            addCriterion("max_latency not in", values, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyBetween(String value1, String value2) {
            addCriterion("max_latency between", value1, value2, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andMaxLatencyNotBetween(String value1, String value2) {
            addCriterion("max_latency not between", value1, value2, "maxLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyIsNull() {
            addCriterion("read_latency is null");
            return (Criteria) this;
        }

        public Criteria andReadLatencyIsNotNull() {
            addCriterion("read_latency is not null");
            return (Criteria) this;
        }

        public Criteria andReadLatencyEqualTo(String value) {
            addCriterion("read_latency =", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyNotEqualTo(String value) {
            addCriterion("read_latency <>", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyGreaterThan(String value) {
            addCriterion("read_latency >", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("read_latency >=", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyLessThan(String value) {
            addCriterion("read_latency <", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyLessThanOrEqualTo(String value) {
            addCriterion("read_latency <=", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyLike(String value) {
            addCriterion("read_latency like", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyNotLike(String value) {
            addCriterion("read_latency not like", value, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyIn(List<String> values) {
            addCriterion("read_latency in", values, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyNotIn(List<String> values) {
            addCriterion("read_latency not in", values, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyBetween(String value1, String value2) {
            addCriterion("read_latency between", value1, value2, "readLatency");
            return (Criteria) this;
        }

        public Criteria andReadLatencyNotBetween(String value1, String value2) {
            addCriterion("read_latency not between", value1, value2, "readLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyIsNull() {
            addCriterion("write_latency is null");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyIsNotNull() {
            addCriterion("write_latency is not null");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyEqualTo(String value) {
            addCriterion("write_latency =", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyNotEqualTo(String value) {
            addCriterion("write_latency <>", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyGreaterThan(String value) {
            addCriterion("write_latency >", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("write_latency >=", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyLessThan(String value) {
            addCriterion("write_latency <", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyLessThanOrEqualTo(String value) {
            addCriterion("write_latency <=", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyLike(String value) {
            addCriterion("write_latency like", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyNotLike(String value) {
            addCriterion("write_latency not like", value, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyIn(List<String> values) {
            addCriterion("write_latency in", values, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyNotIn(List<String> values) {
            addCriterion("write_latency not in", values, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyBetween(String value1, String value2) {
            addCriterion("write_latency between", value1, value2, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andWriteLatencyNotBetween(String value1, String value2) {
            addCriterion("write_latency not between", value1, value2, "writeLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyIsNull() {
            addCriterion("misc_latency is null");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyIsNotNull() {
            addCriterion("misc_latency is not null");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyEqualTo(String value) {
            addCriterion("misc_latency =", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyNotEqualTo(String value) {
            addCriterion("misc_latency <>", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyGreaterThan(String value) {
            addCriterion("misc_latency >", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyGreaterThanOrEqualTo(String value) {
            addCriterion("misc_latency >=", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyLessThan(String value) {
            addCriterion("misc_latency <", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyLessThanOrEqualTo(String value) {
            addCriterion("misc_latency <=", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyLike(String value) {
            addCriterion("misc_latency like", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyNotLike(String value) {
            addCriterion("misc_latency not like", value, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyIn(List<String> values) {
            addCriterion("misc_latency in", values, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyNotIn(List<String> values) {
            addCriterion("misc_latency not in", values, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyBetween(String value1, String value2) {
            addCriterion("misc_latency between", value1, value2, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andMiscLatencyNotBetween(String value1, String value2) {
            addCriterion("misc_latency not between", value1, value2, "miscLatency");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNull() {
            addCriterion("count_read is null");
            return (Criteria) this;
        }

        public Criteria andCountReadIsNotNull() {
            addCriterion("count_read is not null");
            return (Criteria) this;
        }

        public Criteria andCountReadEqualTo(Long value) {
            addCriterion("count_read =", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotEqualTo(Long value) {
            addCriterion("count_read <>", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThan(Long value) {
            addCriterion("count_read >", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadGreaterThanOrEqualTo(Long value) {
            addCriterion("count_read >=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThan(Long value) {
            addCriterion("count_read <", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadLessThanOrEqualTo(Long value) {
            addCriterion("count_read <=", value, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadIn(List<Long> values) {
            addCriterion("count_read in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotIn(List<Long> values) {
            addCriterion("count_read not in", values, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadBetween(Long value1, Long value2) {
            addCriterion("count_read between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andCountReadNotBetween(Long value1, Long value2) {
            addCriterion("count_read not between", value1, value2, "countRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadIsNull() {
            addCriterion("total_read is null");
            return (Criteria) this;
        }

        public Criteria andTotalReadIsNotNull() {
            addCriterion("total_read is not null");
            return (Criteria) this;
        }

        public Criteria andTotalReadEqualTo(String value) {
            addCriterion("total_read =", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotEqualTo(String value) {
            addCriterion("total_read <>", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadGreaterThan(String value) {
            addCriterion("total_read >", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadGreaterThanOrEqualTo(String value) {
            addCriterion("total_read >=", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadLessThan(String value) {
            addCriterion("total_read <", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadLessThanOrEqualTo(String value) {
            addCriterion("total_read <=", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadLike(String value) {
            addCriterion("total_read like", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotLike(String value) {
            addCriterion("total_read not like", value, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadIn(List<String> values) {
            addCriterion("total_read in", values, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotIn(List<String> values) {
            addCriterion("total_read not in", values, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadBetween(String value1, String value2) {
            addCriterion("total_read between", value1, value2, "totalRead");
            return (Criteria) this;
        }

        public Criteria andTotalReadNotBetween(String value1, String value2) {
            addCriterion("total_read not between", value1, value2, "totalRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadIsNull() {
            addCriterion("avg_read is null");
            return (Criteria) this;
        }

        public Criteria andAvgReadIsNotNull() {
            addCriterion("avg_read is not null");
            return (Criteria) this;
        }

        public Criteria andAvgReadEqualTo(String value) {
            addCriterion("avg_read =", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotEqualTo(String value) {
            addCriterion("avg_read <>", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadGreaterThan(String value) {
            addCriterion("avg_read >", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadGreaterThanOrEqualTo(String value) {
            addCriterion("avg_read >=", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadLessThan(String value) {
            addCriterion("avg_read <", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadLessThanOrEqualTo(String value) {
            addCriterion("avg_read <=", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadLike(String value) {
            addCriterion("avg_read like", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotLike(String value) {
            addCriterion("avg_read not like", value, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadIn(List<String> values) {
            addCriterion("avg_read in", values, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotIn(List<String> values) {
            addCriterion("avg_read not in", values, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadBetween(String value1, String value2) {
            addCriterion("avg_read between", value1, value2, "avgRead");
            return (Criteria) this;
        }

        public Criteria andAvgReadNotBetween(String value1, String value2) {
            addCriterion("avg_read not between", value1, value2, "avgRead");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNull() {
            addCriterion("count_write is null");
            return (Criteria) this;
        }

        public Criteria andCountWriteIsNotNull() {
            addCriterion("count_write is not null");
            return (Criteria) this;
        }

        public Criteria andCountWriteEqualTo(Long value) {
            addCriterion("count_write =", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotEqualTo(Long value) {
            addCriterion("count_write <>", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThan(Long value) {
            addCriterion("count_write >", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteGreaterThanOrEqualTo(Long value) {
            addCriterion("count_write >=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThan(Long value) {
            addCriterion("count_write <", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteLessThanOrEqualTo(Long value) {
            addCriterion("count_write <=", value, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteIn(List<Long> values) {
            addCriterion("count_write in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotIn(List<Long> values) {
            addCriterion("count_write not in", values, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteBetween(Long value1, Long value2) {
            addCriterion("count_write between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andCountWriteNotBetween(Long value1, Long value2) {
            addCriterion("count_write not between", value1, value2, "countWrite");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIsNull() {
            addCriterion("total_written is null");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIsNotNull() {
            addCriterion("total_written is not null");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenEqualTo(String value) {
            addCriterion("total_written =", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotEqualTo(String value) {
            addCriterion("total_written <>", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenGreaterThan(String value) {
            addCriterion("total_written >", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenGreaterThanOrEqualTo(String value) {
            addCriterion("total_written >=", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenLessThan(String value) {
            addCriterion("total_written <", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenLessThanOrEqualTo(String value) {
            addCriterion("total_written <=", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenLike(String value) {
            addCriterion("total_written like", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotLike(String value) {
            addCriterion("total_written not like", value, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenIn(List<String> values) {
            addCriterion("total_written in", values, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotIn(List<String> values) {
            addCriterion("total_written not in", values, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenBetween(String value1, String value2) {
            addCriterion("total_written between", value1, value2, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andTotalWrittenNotBetween(String value1, String value2) {
            addCriterion("total_written not between", value1, value2, "totalWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenIsNull() {
            addCriterion("avg_written is null");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenIsNotNull() {
            addCriterion("avg_written is not null");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenEqualTo(String value) {
            addCriterion("avg_written =", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenNotEqualTo(String value) {
            addCriterion("avg_written <>", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenGreaterThan(String value) {
            addCriterion("avg_written >", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenGreaterThanOrEqualTo(String value) {
            addCriterion("avg_written >=", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenLessThan(String value) {
            addCriterion("avg_written <", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenLessThanOrEqualTo(String value) {
            addCriterion("avg_written <=", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenLike(String value) {
            addCriterion("avg_written like", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenNotLike(String value) {
            addCriterion("avg_written not like", value, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenIn(List<String> values) {
            addCriterion("avg_written in", values, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenNotIn(List<String> values) {
            addCriterion("avg_written not in", values, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenBetween(String value1, String value2) {
            addCriterion("avg_written between", value1, value2, "avgWritten");
            return (Criteria) this;
        }

        public Criteria andAvgWrittenNotBetween(String value1, String value2) {
            addCriterion("avg_written not between", value1, value2, "avgWritten");
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