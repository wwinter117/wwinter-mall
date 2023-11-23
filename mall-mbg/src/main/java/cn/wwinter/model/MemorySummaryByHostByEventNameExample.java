package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class MemorySummaryByHostByEventNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemorySummaryByHostByEventNameExample() {
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

        public Criteria andCountAllocIsNull() {
            addCriterion("COUNT_ALLOC is null");
            return (Criteria) this;
        }

        public Criteria andCountAllocIsNotNull() {
            addCriterion("COUNT_ALLOC is not null");
            return (Criteria) this;
        }

        public Criteria andCountAllocEqualTo(Long value) {
            addCriterion("COUNT_ALLOC =", value, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocNotEqualTo(Long value) {
            addCriterion("COUNT_ALLOC <>", value, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocGreaterThan(Long value) {
            addCriterion("COUNT_ALLOC >", value, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_ALLOC >=", value, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocLessThan(Long value) {
            addCriterion("COUNT_ALLOC <", value, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_ALLOC <=", value, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocIn(List<Long> values) {
            addCriterion("COUNT_ALLOC in", values, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocNotIn(List<Long> values) {
            addCriterion("COUNT_ALLOC not in", values, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocBetween(Long value1, Long value2) {
            addCriterion("COUNT_ALLOC between", value1, value2, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountAllocNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_ALLOC not between", value1, value2, "countAlloc");
            return (Criteria) this;
        }

        public Criteria andCountFreeIsNull() {
            addCriterion("COUNT_FREE is null");
            return (Criteria) this;
        }

        public Criteria andCountFreeIsNotNull() {
            addCriterion("COUNT_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andCountFreeEqualTo(Long value) {
            addCriterion("COUNT_FREE =", value, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeNotEqualTo(Long value) {
            addCriterion("COUNT_FREE <>", value, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeGreaterThan(Long value) {
            addCriterion("COUNT_FREE >", value, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_FREE >=", value, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeLessThan(Long value) {
            addCriterion("COUNT_FREE <", value, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_FREE <=", value, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeIn(List<Long> values) {
            addCriterion("COUNT_FREE in", values, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeNotIn(List<Long> values) {
            addCriterion("COUNT_FREE not in", values, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeBetween(Long value1, Long value2) {
            addCriterion("COUNT_FREE between", value1, value2, "countFree");
            return (Criteria) this;
        }

        public Criteria andCountFreeNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_FREE not between", value1, value2, "countFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocIsNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocIsNotNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC =", value, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocNotEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC <>", value, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocGreaterThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC >", value, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC >=", value, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocLessThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC <", value, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC <=", value, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC in", values, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocNotIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC not in", values, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC between", value1, value2, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesAllocNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_ALLOC not between", value1, value2, "sumNumberOfBytesAlloc");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeIsNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE is null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeIsNotNull() {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE is not null");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE =", value, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeNotEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE <>", value, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeGreaterThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE >", value, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE >=", value, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeLessThan(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE <", value, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeLessThanOrEqualTo(Long value) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE <=", value, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE in", values, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeNotIn(List<Long> values) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE not in", values, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE between", value1, value2, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andSumNumberOfBytesFreeNotBetween(Long value1, Long value2) {
            addCriterion("SUM_NUMBER_OF_BYTES_FREE not between", value1, value2, "sumNumberOfBytesFree");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedIsNull() {
            addCriterion("LOW_COUNT_USED is null");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedIsNotNull() {
            addCriterion("LOW_COUNT_USED is not null");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedEqualTo(Long value) {
            addCriterion("LOW_COUNT_USED =", value, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedNotEqualTo(Long value) {
            addCriterion("LOW_COUNT_USED <>", value, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedGreaterThan(Long value) {
            addCriterion("LOW_COUNT_USED >", value, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("LOW_COUNT_USED >=", value, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedLessThan(Long value) {
            addCriterion("LOW_COUNT_USED <", value, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedLessThanOrEqualTo(Long value) {
            addCriterion("LOW_COUNT_USED <=", value, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedIn(List<Long> values) {
            addCriterion("LOW_COUNT_USED in", values, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedNotIn(List<Long> values) {
            addCriterion("LOW_COUNT_USED not in", values, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedBetween(Long value1, Long value2) {
            addCriterion("LOW_COUNT_USED between", value1, value2, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowCountUsedNotBetween(Long value1, Long value2) {
            addCriterion("LOW_COUNT_USED not between", value1, value2, "lowCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedIsNull() {
            addCriterion("CURRENT_COUNT_USED is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedIsNotNull() {
            addCriterion("CURRENT_COUNT_USED is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedEqualTo(Long value) {
            addCriterion("CURRENT_COUNT_USED =", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedNotEqualTo(Long value) {
            addCriterion("CURRENT_COUNT_USED <>", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedGreaterThan(Long value) {
            addCriterion("CURRENT_COUNT_USED >", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_COUNT_USED >=", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedLessThan(Long value) {
            addCriterion("CURRENT_COUNT_USED <", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_COUNT_USED <=", value, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedIn(List<Long> values) {
            addCriterion("CURRENT_COUNT_USED in", values, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedNotIn(List<Long> values) {
            addCriterion("CURRENT_COUNT_USED not in", values, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedBetween(Long value1, Long value2) {
            addCriterion("CURRENT_COUNT_USED between", value1, value2, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentCountUsedNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_COUNT_USED not between", value1, value2, "currentCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedIsNull() {
            addCriterion("HIGH_COUNT_USED is null");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedIsNotNull() {
            addCriterion("HIGH_COUNT_USED is not null");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedEqualTo(Long value) {
            addCriterion("HIGH_COUNT_USED =", value, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedNotEqualTo(Long value) {
            addCriterion("HIGH_COUNT_USED <>", value, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedGreaterThan(Long value) {
            addCriterion("HIGH_COUNT_USED >", value, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("HIGH_COUNT_USED >=", value, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedLessThan(Long value) {
            addCriterion("HIGH_COUNT_USED <", value, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedLessThanOrEqualTo(Long value) {
            addCriterion("HIGH_COUNT_USED <=", value, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedIn(List<Long> values) {
            addCriterion("HIGH_COUNT_USED in", values, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedNotIn(List<Long> values) {
            addCriterion("HIGH_COUNT_USED not in", values, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedBetween(Long value1, Long value2) {
            addCriterion("HIGH_COUNT_USED between", value1, value2, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andHighCountUsedNotBetween(Long value1, Long value2) {
            addCriterion("HIGH_COUNT_USED not between", value1, value2, "highCountUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedIsNull() {
            addCriterion("LOW_NUMBER_OF_BYTES_USED is null");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedIsNotNull() {
            addCriterion("LOW_NUMBER_OF_BYTES_USED is not null");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedEqualTo(Long value) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED =", value, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedNotEqualTo(Long value) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED <>", value, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedGreaterThan(Long value) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED >", value, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED >=", value, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedLessThan(Long value) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED <", value, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedLessThanOrEqualTo(Long value) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED <=", value, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedIn(List<Long> values) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED in", values, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedNotIn(List<Long> values) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED not in", values, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedBetween(Long value1, Long value2) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED between", value1, value2, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andLowNumberOfBytesUsedNotBetween(Long value1, Long value2) {
            addCriterion("LOW_NUMBER_OF_BYTES_USED not between", value1, value2, "lowNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedIsNull() {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED is null");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedIsNotNull() {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedEqualTo(Long value) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED =", value, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedNotEqualTo(Long value) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED <>", value, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedGreaterThan(Long value) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED >", value, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED >=", value, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedLessThan(Long value) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED <", value, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED <=", value, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedIn(List<Long> values) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED in", values, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedNotIn(List<Long> values) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED not in", values, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedBetween(Long value1, Long value2) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED between", value1, value2, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andCurrentNumberOfBytesUsedNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_NUMBER_OF_BYTES_USED not between", value1, value2, "currentNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedIsNull() {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED is null");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedIsNotNull() {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED is not null");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedEqualTo(Long value) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED =", value, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedNotEqualTo(Long value) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED <>", value, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedGreaterThan(Long value) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED >", value, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedGreaterThanOrEqualTo(Long value) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED >=", value, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedLessThan(Long value) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED <", value, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedLessThanOrEqualTo(Long value) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED <=", value, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedIn(List<Long> values) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED in", values, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedNotIn(List<Long> values) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED not in", values, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedBetween(Long value1, Long value2) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED between", value1, value2, "highNumberOfBytesUsed");
            return (Criteria) this;
        }

        public Criteria andHighNumberOfBytesUsedNotBetween(Long value1, Long value2) {
            addCriterion("HIGH_NUMBER_OF_BYTES_USED not between", value1, value2, "highNumberOfBytesUsed");
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