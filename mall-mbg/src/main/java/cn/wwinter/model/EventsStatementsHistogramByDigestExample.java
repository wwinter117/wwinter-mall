package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class EventsStatementsHistogramByDigestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventsStatementsHistogramByDigestExample() {
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

        public Criteria andSchemaNameIsNull() {
            addCriterion("SCHEMA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchemaNameIsNotNull() {
            addCriterion("SCHEMA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaNameEqualTo(String value) {
            addCriterion("SCHEMA_NAME =", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotEqualTo(String value) {
            addCriterion("SCHEMA_NAME <>", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameGreaterThan(String value) {
            addCriterion("SCHEMA_NAME >", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEMA_NAME >=", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLessThan(String value) {
            addCriterion("SCHEMA_NAME <", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLessThanOrEqualTo(String value) {
            addCriterion("SCHEMA_NAME <=", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameLike(String value) {
            addCriterion("SCHEMA_NAME like", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotLike(String value) {
            addCriterion("SCHEMA_NAME not like", value, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameIn(List<String> values) {
            addCriterion("SCHEMA_NAME in", values, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotIn(List<String> values) {
            addCriterion("SCHEMA_NAME not in", values, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameBetween(String value1, String value2) {
            addCriterion("SCHEMA_NAME between", value1, value2, "schemaName");
            return (Criteria) this;
        }

        public Criteria andSchemaNameNotBetween(String value1, String value2) {
            addCriterion("SCHEMA_NAME not between", value1, value2, "schemaName");
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

        public Criteria andBucketNumberIsNull() {
            addCriterion("BUCKET_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBucketNumberIsNotNull() {
            addCriterion("BUCKET_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBucketNumberEqualTo(Integer value) {
            addCriterion("BUCKET_NUMBER =", value, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberNotEqualTo(Integer value) {
            addCriterion("BUCKET_NUMBER <>", value, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberGreaterThan(Integer value) {
            addCriterion("BUCKET_NUMBER >", value, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUCKET_NUMBER >=", value, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberLessThan(Integer value) {
            addCriterion("BUCKET_NUMBER <", value, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberLessThanOrEqualTo(Integer value) {
            addCriterion("BUCKET_NUMBER <=", value, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberIn(List<Integer> values) {
            addCriterion("BUCKET_NUMBER in", values, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberNotIn(List<Integer> values) {
            addCriterion("BUCKET_NUMBER not in", values, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberBetween(Integer value1, Integer value2) {
            addCriterion("BUCKET_NUMBER between", value1, value2, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("BUCKET_NUMBER not between", value1, value2, "bucketNumber");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowIsNull() {
            addCriterion("BUCKET_TIMER_LOW is null");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowIsNotNull() {
            addCriterion("BUCKET_TIMER_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_LOW =", value, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowNotEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_LOW <>", value, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowGreaterThan(Long value) {
            addCriterion("BUCKET_TIMER_LOW >", value, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowGreaterThanOrEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_LOW >=", value, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowLessThan(Long value) {
            addCriterion("BUCKET_TIMER_LOW <", value, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowLessThanOrEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_LOW <=", value, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowIn(List<Long> values) {
            addCriterion("BUCKET_TIMER_LOW in", values, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowNotIn(List<Long> values) {
            addCriterion("BUCKET_TIMER_LOW not in", values, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowBetween(Long value1, Long value2) {
            addCriterion("BUCKET_TIMER_LOW between", value1, value2, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerLowNotBetween(Long value1, Long value2) {
            addCriterion("BUCKET_TIMER_LOW not between", value1, value2, "bucketTimerLow");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighIsNull() {
            addCriterion("BUCKET_TIMER_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighIsNotNull() {
            addCriterion("BUCKET_TIMER_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_HIGH =", value, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighNotEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_HIGH <>", value, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighGreaterThan(Long value) {
            addCriterion("BUCKET_TIMER_HIGH >", value, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighGreaterThanOrEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_HIGH >=", value, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighLessThan(Long value) {
            addCriterion("BUCKET_TIMER_HIGH <", value, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighLessThanOrEqualTo(Long value) {
            addCriterion("BUCKET_TIMER_HIGH <=", value, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighIn(List<Long> values) {
            addCriterion("BUCKET_TIMER_HIGH in", values, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighNotIn(List<Long> values) {
            addCriterion("BUCKET_TIMER_HIGH not in", values, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighBetween(Long value1, Long value2) {
            addCriterion("BUCKET_TIMER_HIGH between", value1, value2, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andBucketTimerHighNotBetween(Long value1, Long value2) {
            addCriterion("BUCKET_TIMER_HIGH not between", value1, value2, "bucketTimerHigh");
            return (Criteria) this;
        }

        public Criteria andCountBucketIsNull() {
            addCriterion("COUNT_BUCKET is null");
            return (Criteria) this;
        }

        public Criteria andCountBucketIsNotNull() {
            addCriterion("COUNT_BUCKET is not null");
            return (Criteria) this;
        }

        public Criteria andCountBucketEqualTo(Long value) {
            addCriterion("COUNT_BUCKET =", value, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketNotEqualTo(Long value) {
            addCriterion("COUNT_BUCKET <>", value, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketGreaterThan(Long value) {
            addCriterion("COUNT_BUCKET >", value, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_BUCKET >=", value, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketLessThan(Long value) {
            addCriterion("COUNT_BUCKET <", value, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_BUCKET <=", value, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketIn(List<Long> values) {
            addCriterion("COUNT_BUCKET in", values, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketNotIn(List<Long> values) {
            addCriterion("COUNT_BUCKET not in", values, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketBetween(Long value1, Long value2) {
            addCriterion("COUNT_BUCKET between", value1, value2, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_BUCKET not between", value1, value2, "countBucket");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerIsNull() {
            addCriterion("COUNT_BUCKET_AND_LOWER is null");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerIsNotNull() {
            addCriterion("COUNT_BUCKET_AND_LOWER is not null");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerEqualTo(Long value) {
            addCriterion("COUNT_BUCKET_AND_LOWER =", value, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerNotEqualTo(Long value) {
            addCriterion("COUNT_BUCKET_AND_LOWER <>", value, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerGreaterThan(Long value) {
            addCriterion("COUNT_BUCKET_AND_LOWER >", value, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_BUCKET_AND_LOWER >=", value, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerLessThan(Long value) {
            addCriterion("COUNT_BUCKET_AND_LOWER <", value, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_BUCKET_AND_LOWER <=", value, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerIn(List<Long> values) {
            addCriterion("COUNT_BUCKET_AND_LOWER in", values, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerNotIn(List<Long> values) {
            addCriterion("COUNT_BUCKET_AND_LOWER not in", values, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerBetween(Long value1, Long value2) {
            addCriterion("COUNT_BUCKET_AND_LOWER between", value1, value2, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andCountBucketAndLowerNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_BUCKET_AND_LOWER not between", value1, value2, "countBucketAndLower");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileIsNull() {
            addCriterion("BUCKET_QUANTILE is null");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileIsNotNull() {
            addCriterion("BUCKET_QUANTILE is not null");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileEqualTo(Double value) {
            addCriterion("BUCKET_QUANTILE =", value, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileNotEqualTo(Double value) {
            addCriterion("BUCKET_QUANTILE <>", value, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileGreaterThan(Double value) {
            addCriterion("BUCKET_QUANTILE >", value, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileGreaterThanOrEqualTo(Double value) {
            addCriterion("BUCKET_QUANTILE >=", value, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileLessThan(Double value) {
            addCriterion("BUCKET_QUANTILE <", value, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileLessThanOrEqualTo(Double value) {
            addCriterion("BUCKET_QUANTILE <=", value, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileIn(List<Double> values) {
            addCriterion("BUCKET_QUANTILE in", values, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileNotIn(List<Double> values) {
            addCriterion("BUCKET_QUANTILE not in", values, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileBetween(Double value1, Double value2) {
            addCriterion("BUCKET_QUANTILE between", value1, value2, "bucketQuantile");
            return (Criteria) this;
        }

        public Criteria andBucketQuantileNotBetween(Double value1, Double value2) {
            addCriterion("BUCKET_QUANTILE not between", value1, value2, "bucketQuantile");
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