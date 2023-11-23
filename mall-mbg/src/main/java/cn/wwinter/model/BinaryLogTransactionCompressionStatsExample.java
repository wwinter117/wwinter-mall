package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BinaryLogTransactionCompressionStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BinaryLogTransactionCompressionStatsExample() {
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

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("LOG_TYPE like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("LOG_TYPE not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeIsNull() {
            addCriterion("COMPRESSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeIsNotNull() {
            addCriterion("COMPRESSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeEqualTo(String value) {
            addCriterion("COMPRESSION_TYPE =", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotEqualTo(String value) {
            addCriterion("COMPRESSION_TYPE <>", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeGreaterThan(String value) {
            addCriterion("COMPRESSION_TYPE >", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMPRESSION_TYPE >=", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeLessThan(String value) {
            addCriterion("COMPRESSION_TYPE <", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeLessThanOrEqualTo(String value) {
            addCriterion("COMPRESSION_TYPE <=", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeLike(String value) {
            addCriterion("COMPRESSION_TYPE like", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotLike(String value) {
            addCriterion("COMPRESSION_TYPE not like", value, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeIn(List<String> values) {
            addCriterion("COMPRESSION_TYPE in", values, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotIn(List<String> values) {
            addCriterion("COMPRESSION_TYPE not in", values, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeBetween(String value1, String value2) {
            addCriterion("COMPRESSION_TYPE between", value1, value2, "compressionType");
            return (Criteria) this;
        }

        public Criteria andCompressionTypeNotBetween(String value1, String value2) {
            addCriterion("COMPRESSION_TYPE not between", value1, value2, "compressionType");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterIsNull() {
            addCriterion("TRANSACTION_COUNTER is null");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterIsNotNull() {
            addCriterion("TRANSACTION_COUNTER is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterEqualTo(Long value) {
            addCriterion("TRANSACTION_COUNTER =", value, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterNotEqualTo(Long value) {
            addCriterion("TRANSACTION_COUNTER <>", value, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterGreaterThan(Long value) {
            addCriterion("TRANSACTION_COUNTER >", value, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSACTION_COUNTER >=", value, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterLessThan(Long value) {
            addCriterion("TRANSACTION_COUNTER <", value, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterLessThanOrEqualTo(Long value) {
            addCriterion("TRANSACTION_COUNTER <=", value, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterIn(List<Long> values) {
            addCriterion("TRANSACTION_COUNTER in", values, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterNotIn(List<Long> values) {
            addCriterion("TRANSACTION_COUNTER not in", values, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterBetween(Long value1, Long value2) {
            addCriterion("TRANSACTION_COUNTER between", value1, value2, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andTransactionCounterNotBetween(Long value1, Long value2) {
            addCriterion("TRANSACTION_COUNTER not between", value1, value2, "transactionCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterIsNull() {
            addCriterion("COMPRESSED_BYTES_COUNTER is null");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterIsNotNull() {
            addCriterion("COMPRESSED_BYTES_COUNTER is not null");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterEqualTo(Long value) {
            addCriterion("COMPRESSED_BYTES_COUNTER =", value, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterNotEqualTo(Long value) {
            addCriterion("COMPRESSED_BYTES_COUNTER <>", value, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterGreaterThan(Long value) {
            addCriterion("COMPRESSED_BYTES_COUNTER >", value, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPRESSED_BYTES_COUNTER >=", value, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterLessThan(Long value) {
            addCriterion("COMPRESSED_BYTES_COUNTER <", value, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterLessThanOrEqualTo(Long value) {
            addCriterion("COMPRESSED_BYTES_COUNTER <=", value, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterIn(List<Long> values) {
            addCriterion("COMPRESSED_BYTES_COUNTER in", values, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterNotIn(List<Long> values) {
            addCriterion("COMPRESSED_BYTES_COUNTER not in", values, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterBetween(Long value1, Long value2) {
            addCriterion("COMPRESSED_BYTES_COUNTER between", value1, value2, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressedBytesCounterNotBetween(Long value1, Long value2) {
            addCriterion("COMPRESSED_BYTES_COUNTER not between", value1, value2, "compressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterIsNull() {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER is null");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterIsNotNull() {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER is not null");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterEqualTo(Long value) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER =", value, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterNotEqualTo(Long value) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER <>", value, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterGreaterThan(Long value) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER >", value, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterGreaterThanOrEqualTo(Long value) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER >=", value, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterLessThan(Long value) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER <", value, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterLessThanOrEqualTo(Long value) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER <=", value, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterIn(List<Long> values) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER in", values, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterNotIn(List<Long> values) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER not in", values, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterBetween(Long value1, Long value2) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER between", value1, value2, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andUncompressedBytesCounterNotBetween(Long value1, Long value2) {
            addCriterion("UNCOMPRESSED_BYTES_COUNTER not between", value1, value2, "uncompressedBytesCounter");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageIsNull() {
            addCriterion("COMPRESSION_PERCENTAGE is null");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageIsNotNull() {
            addCriterion("COMPRESSION_PERCENTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageEqualTo(Short value) {
            addCriterion("COMPRESSION_PERCENTAGE =", value, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageNotEqualTo(Short value) {
            addCriterion("COMPRESSION_PERCENTAGE <>", value, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageGreaterThan(Short value) {
            addCriterion("COMPRESSION_PERCENTAGE >", value, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageGreaterThanOrEqualTo(Short value) {
            addCriterion("COMPRESSION_PERCENTAGE >=", value, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageLessThan(Short value) {
            addCriterion("COMPRESSION_PERCENTAGE <", value, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageLessThanOrEqualTo(Short value) {
            addCriterion("COMPRESSION_PERCENTAGE <=", value, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageIn(List<Short> values) {
            addCriterion("COMPRESSION_PERCENTAGE in", values, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageNotIn(List<Short> values) {
            addCriterion("COMPRESSION_PERCENTAGE not in", values, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageBetween(Short value1, Short value2) {
            addCriterion("COMPRESSION_PERCENTAGE between", value1, value2, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andCompressionPercentageNotBetween(Short value1, Short value2) {
            addCriterion("COMPRESSION_PERCENTAGE not between", value1, value2, "compressionPercentage");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesIsNull() {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES is null");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesIsNotNull() {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES =", value, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesNotEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES <>", value, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesGreaterThan(Long value) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES >", value, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES >=", value, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesLessThan(Long value) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES <", value, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesLessThanOrEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES <=", value, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesIn(List<Long> values) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES in", values, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesNotIn(List<Long> values) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES not in", values, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesBetween(Long value1, Long value2) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES between", value1, value2, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionCompressedBytesNotBetween(Long value1, Long value2) {
            addCriterion("FIRST_TRANSACTION_COMPRESSED_BYTES not between", value1, value2, "firstTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesIsNull() {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES is null");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesIsNotNull() {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES =", value, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesNotEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES <>", value, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesGreaterThan(Long value) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES >", value, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES >=", value, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesLessThan(Long value) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES <", value, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesLessThanOrEqualTo(Long value) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES <=", value, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesIn(List<Long> values) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES in", values, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesNotIn(List<Long> values) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES not in", values, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesBetween(Long value1, Long value2) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES between", value1, value2, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionUncompressedBytesNotBetween(Long value1, Long value2) {
            addCriterion("FIRST_TRANSACTION_UNCOMPRESSED_BYTES not between", value1, value2, "firstTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampIsNull() {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampIsNotNull() {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampEqualTo(Date value) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP =", value, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampNotEqualTo(Date value) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP <>", value, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampGreaterThan(Date value) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP >", value, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP >=", value, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampLessThan(Date value) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP <", value, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP <=", value, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampIn(List<Date> values) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP in", values, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampNotIn(List<Date> values) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP not in", values, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampBetween(Date value1, Date value2) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP between", value1, value2, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andFirstTransactionTimestampNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_TRANSACTION_TIMESTAMP not between", value1, value2, "firstTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesIsNull() {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES is null");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesIsNotNull() {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES is not null");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES =", value, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesNotEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES <>", value, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesGreaterThan(Long value) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES >", value, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES >=", value, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesLessThan(Long value) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES <", value, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesLessThanOrEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES <=", value, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesIn(List<Long> values) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES in", values, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesNotIn(List<Long> values) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES not in", values, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesBetween(Long value1, Long value2) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES between", value1, value2, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionCompressedBytesNotBetween(Long value1, Long value2) {
            addCriterion("LAST_TRANSACTION_COMPRESSED_BYTES not between", value1, value2, "lastTransactionCompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesIsNull() {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES is null");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesIsNotNull() {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES is not null");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES =", value, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesNotEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES <>", value, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesGreaterThan(Long value) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES >", value, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES >=", value, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesLessThan(Long value) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES <", value, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesLessThanOrEqualTo(Long value) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES <=", value, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesIn(List<Long> values) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES in", values, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesNotIn(List<Long> values) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES not in", values, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesBetween(Long value1, Long value2) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES between", value1, value2, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionUncompressedBytesNotBetween(Long value1, Long value2) {
            addCriterion("LAST_TRANSACTION_UNCOMPRESSED_BYTES not between", value1, value2, "lastTransactionUncompressedBytes");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampIsNull() {
            addCriterion("LAST_TRANSACTION_TIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampIsNotNull() {
            addCriterion("LAST_TRANSACTION_TIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampEqualTo(Date value) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP =", value, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampNotEqualTo(Date value) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP <>", value, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampGreaterThan(Date value) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP >", value, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP >=", value, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampLessThan(Date value) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP <", value, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampLessThanOrEqualTo(Date value) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP <=", value, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampIn(List<Date> values) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP in", values, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampNotIn(List<Date> values) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP not in", values, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampBetween(Date value1, Date value2) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP between", value1, value2, "lastTransactionTimestamp");
            return (Criteria) this;
        }

        public Criteria andLastTransactionTimestampNotBetween(Date value1, Date value2) {
            addCriterion("LAST_TRANSACTION_TIMESTAMP not between", value1, value2, "lastTransactionTimestamp");
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