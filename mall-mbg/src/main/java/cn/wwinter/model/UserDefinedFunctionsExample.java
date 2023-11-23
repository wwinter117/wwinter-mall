package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedFunctionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDefinedFunctionsExample() {
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

        public Criteria andUdfNameIsNull() {
            addCriterion("UDF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUdfNameIsNotNull() {
            addCriterion("UDF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUdfNameEqualTo(String value) {
            addCriterion("UDF_NAME =", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameNotEqualTo(String value) {
            addCriterion("UDF_NAME <>", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameGreaterThan(String value) {
            addCriterion("UDF_NAME >", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameGreaterThanOrEqualTo(String value) {
            addCriterion("UDF_NAME >=", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameLessThan(String value) {
            addCriterion("UDF_NAME <", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameLessThanOrEqualTo(String value) {
            addCriterion("UDF_NAME <=", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameLike(String value) {
            addCriterion("UDF_NAME like", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameNotLike(String value) {
            addCriterion("UDF_NAME not like", value, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameIn(List<String> values) {
            addCriterion("UDF_NAME in", values, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameNotIn(List<String> values) {
            addCriterion("UDF_NAME not in", values, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameBetween(String value1, String value2) {
            addCriterion("UDF_NAME between", value1, value2, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfNameNotBetween(String value1, String value2) {
            addCriterion("UDF_NAME not between", value1, value2, "udfName");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeIsNull() {
            addCriterion("UDF_RETURN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeIsNotNull() {
            addCriterion("UDF_RETURN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeEqualTo(String value) {
            addCriterion("UDF_RETURN_TYPE =", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeNotEqualTo(String value) {
            addCriterion("UDF_RETURN_TYPE <>", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeGreaterThan(String value) {
            addCriterion("UDF_RETURN_TYPE >", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UDF_RETURN_TYPE >=", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeLessThan(String value) {
            addCriterion("UDF_RETURN_TYPE <", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("UDF_RETURN_TYPE <=", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeLike(String value) {
            addCriterion("UDF_RETURN_TYPE like", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeNotLike(String value) {
            addCriterion("UDF_RETURN_TYPE not like", value, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeIn(List<String> values) {
            addCriterion("UDF_RETURN_TYPE in", values, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeNotIn(List<String> values) {
            addCriterion("UDF_RETURN_TYPE not in", values, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeBetween(String value1, String value2) {
            addCriterion("UDF_RETURN_TYPE between", value1, value2, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfReturnTypeNotBetween(String value1, String value2) {
            addCriterion("UDF_RETURN_TYPE not between", value1, value2, "udfReturnType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeIsNull() {
            addCriterion("UDF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUdfTypeIsNotNull() {
            addCriterion("UDF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUdfTypeEqualTo(String value) {
            addCriterion("UDF_TYPE =", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeNotEqualTo(String value) {
            addCriterion("UDF_TYPE <>", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeGreaterThan(String value) {
            addCriterion("UDF_TYPE >", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeGreaterThanOrEqualTo(String value) {
            addCriterion("UDF_TYPE >=", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeLessThan(String value) {
            addCriterion("UDF_TYPE <", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeLessThanOrEqualTo(String value) {
            addCriterion("UDF_TYPE <=", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeLike(String value) {
            addCriterion("UDF_TYPE like", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeNotLike(String value) {
            addCriterion("UDF_TYPE not like", value, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeIn(List<String> values) {
            addCriterion("UDF_TYPE in", values, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeNotIn(List<String> values) {
            addCriterion("UDF_TYPE not in", values, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeBetween(String value1, String value2) {
            addCriterion("UDF_TYPE between", value1, value2, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfTypeNotBetween(String value1, String value2) {
            addCriterion("UDF_TYPE not between", value1, value2, "udfType");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryIsNull() {
            addCriterion("UDF_LIBRARY is null");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryIsNotNull() {
            addCriterion("UDF_LIBRARY is not null");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryEqualTo(String value) {
            addCriterion("UDF_LIBRARY =", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryNotEqualTo(String value) {
            addCriterion("UDF_LIBRARY <>", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryGreaterThan(String value) {
            addCriterion("UDF_LIBRARY >", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryGreaterThanOrEqualTo(String value) {
            addCriterion("UDF_LIBRARY >=", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryLessThan(String value) {
            addCriterion("UDF_LIBRARY <", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryLessThanOrEqualTo(String value) {
            addCriterion("UDF_LIBRARY <=", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryLike(String value) {
            addCriterion("UDF_LIBRARY like", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryNotLike(String value) {
            addCriterion("UDF_LIBRARY not like", value, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryIn(List<String> values) {
            addCriterion("UDF_LIBRARY in", values, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryNotIn(List<String> values) {
            addCriterion("UDF_LIBRARY not in", values, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryBetween(String value1, String value2) {
            addCriterion("UDF_LIBRARY between", value1, value2, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfLibraryNotBetween(String value1, String value2) {
            addCriterion("UDF_LIBRARY not between", value1, value2, "udfLibrary");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountIsNull() {
            addCriterion("UDF_USAGE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountIsNotNull() {
            addCriterion("UDF_USAGE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountEqualTo(Long value) {
            addCriterion("UDF_USAGE_COUNT =", value, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountNotEqualTo(Long value) {
            addCriterion("UDF_USAGE_COUNT <>", value, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountGreaterThan(Long value) {
            addCriterion("UDF_USAGE_COUNT >", value, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountGreaterThanOrEqualTo(Long value) {
            addCriterion("UDF_USAGE_COUNT >=", value, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountLessThan(Long value) {
            addCriterion("UDF_USAGE_COUNT <", value, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountLessThanOrEqualTo(Long value) {
            addCriterion("UDF_USAGE_COUNT <=", value, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountIn(List<Long> values) {
            addCriterion("UDF_USAGE_COUNT in", values, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountNotIn(List<Long> values) {
            addCriterion("UDF_USAGE_COUNT not in", values, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountBetween(Long value1, Long value2) {
            addCriterion("UDF_USAGE_COUNT between", value1, value2, "udfUsageCount");
            return (Criteria) this;
        }

        public Criteria andUdfUsageCountNotBetween(Long value1, Long value2) {
            addCriterion("UDF_USAGE_COUNT not between", value1, value2, "udfUsageCount");
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