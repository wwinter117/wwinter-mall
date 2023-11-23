package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class InnodbRedoLogFilesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnodbRedoLogFilesExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Long value) {
            addCriterion("FILE_ID =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Long value) {
            addCriterion("FILE_ID <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Long value) {
            addCriterion("FILE_ID >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FILE_ID >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Long value) {
            addCriterion("FILE_ID <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Long value) {
            addCriterion("FILE_ID <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Long> values) {
            addCriterion("FILE_ID in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Long> values) {
            addCriterion("FILE_ID not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Long value1, Long value2) {
            addCriterion("FILE_ID between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Long value1, Long value2) {
            addCriterion("FILE_ID not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andStartLsnIsNull() {
            addCriterion("START_LSN is null");
            return (Criteria) this;
        }

        public Criteria andStartLsnIsNotNull() {
            addCriterion("START_LSN is not null");
            return (Criteria) this;
        }

        public Criteria andStartLsnEqualTo(Long value) {
            addCriterion("START_LSN =", value, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnNotEqualTo(Long value) {
            addCriterion("START_LSN <>", value, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnGreaterThan(Long value) {
            addCriterion("START_LSN >", value, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnGreaterThanOrEqualTo(Long value) {
            addCriterion("START_LSN >=", value, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnLessThan(Long value) {
            addCriterion("START_LSN <", value, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnLessThanOrEqualTo(Long value) {
            addCriterion("START_LSN <=", value, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnIn(List<Long> values) {
            addCriterion("START_LSN in", values, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnNotIn(List<Long> values) {
            addCriterion("START_LSN not in", values, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnBetween(Long value1, Long value2) {
            addCriterion("START_LSN between", value1, value2, "startLsn");
            return (Criteria) this;
        }

        public Criteria andStartLsnNotBetween(Long value1, Long value2) {
            addCriterion("START_LSN not between", value1, value2, "startLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnIsNull() {
            addCriterion("END_LSN is null");
            return (Criteria) this;
        }

        public Criteria andEndLsnIsNotNull() {
            addCriterion("END_LSN is not null");
            return (Criteria) this;
        }

        public Criteria andEndLsnEqualTo(Long value) {
            addCriterion("END_LSN =", value, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnNotEqualTo(Long value) {
            addCriterion("END_LSN <>", value, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnGreaterThan(Long value) {
            addCriterion("END_LSN >", value, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnGreaterThanOrEqualTo(Long value) {
            addCriterion("END_LSN >=", value, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnLessThan(Long value) {
            addCriterion("END_LSN <", value, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnLessThanOrEqualTo(Long value) {
            addCriterion("END_LSN <=", value, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnIn(List<Long> values) {
            addCriterion("END_LSN in", values, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnNotIn(List<Long> values) {
            addCriterion("END_LSN not in", values, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnBetween(Long value1, Long value2) {
            addCriterion("END_LSN between", value1, value2, "endLsn");
            return (Criteria) this;
        }

        public Criteria andEndLsnNotBetween(Long value1, Long value2) {
            addCriterion("END_LSN not between", value1, value2, "endLsn");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesIsNull() {
            addCriterion("SIZE_IN_BYTES is null");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesIsNotNull() {
            addCriterion("SIZE_IN_BYTES is not null");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesEqualTo(Long value) {
            addCriterion("SIZE_IN_BYTES =", value, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesNotEqualTo(Long value) {
            addCriterion("SIZE_IN_BYTES <>", value, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesGreaterThan(Long value) {
            addCriterion("SIZE_IN_BYTES >", value, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesGreaterThanOrEqualTo(Long value) {
            addCriterion("SIZE_IN_BYTES >=", value, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesLessThan(Long value) {
            addCriterion("SIZE_IN_BYTES <", value, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesLessThanOrEqualTo(Long value) {
            addCriterion("SIZE_IN_BYTES <=", value, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesIn(List<Long> values) {
            addCriterion("SIZE_IN_BYTES in", values, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesNotIn(List<Long> values) {
            addCriterion("SIZE_IN_BYTES not in", values, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesBetween(Long value1, Long value2) {
            addCriterion("SIZE_IN_BYTES between", value1, value2, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andSizeInBytesNotBetween(Long value1, Long value2) {
            addCriterion("SIZE_IN_BYTES not between", value1, value2, "sizeInBytes");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNull() {
            addCriterion("IS_FULL is null");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNotNull() {
            addCriterion("IS_FULL is not null");
            return (Criteria) this;
        }

        public Criteria andIsFullEqualTo(Byte value) {
            addCriterion("IS_FULL =", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotEqualTo(Byte value) {
            addCriterion("IS_FULL <>", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThan(Byte value) {
            addCriterion("IS_FULL >", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_FULL >=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThan(Byte value) {
            addCriterion("IS_FULL <", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThanOrEqualTo(Byte value) {
            addCriterion("IS_FULL <=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullIn(List<Byte> values) {
            addCriterion("IS_FULL in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotIn(List<Byte> values) {
            addCriterion("IS_FULL not in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullBetween(Byte value1, Byte value2) {
            addCriterion("IS_FULL between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_FULL not between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelIsNull() {
            addCriterion("CONSUMER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelIsNotNull() {
            addCriterion("CONSUMER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelEqualTo(Integer value) {
            addCriterion("CONSUMER_LEVEL =", value, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelNotEqualTo(Integer value) {
            addCriterion("CONSUMER_LEVEL <>", value, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelGreaterThan(Integer value) {
            addCriterion("CONSUMER_LEVEL >", value, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSUMER_LEVEL >=", value, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelLessThan(Integer value) {
            addCriterion("CONSUMER_LEVEL <", value, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CONSUMER_LEVEL <=", value, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelIn(List<Integer> values) {
            addCriterion("CONSUMER_LEVEL in", values, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelNotIn(List<Integer> values) {
            addCriterion("CONSUMER_LEVEL not in", values, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMER_LEVEL between", value1, value2, "consumerLevel");
            return (Criteria) this;
        }

        public Criteria andConsumerLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSUMER_LEVEL not between", value1, value2, "consumerLevel");
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