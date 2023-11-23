package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class SetupMetricsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SetupMetricsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMeterIsNull() {
            addCriterion("METER is null");
            return (Criteria) this;
        }

        public Criteria andMeterIsNotNull() {
            addCriterion("METER is not null");
            return (Criteria) this;
        }

        public Criteria andMeterEqualTo(String value) {
            addCriterion("METER =", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterNotEqualTo(String value) {
            addCriterion("METER <>", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterGreaterThan(String value) {
            addCriterion("METER >", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterGreaterThanOrEqualTo(String value) {
            addCriterion("METER >=", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterLessThan(String value) {
            addCriterion("METER <", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterLessThanOrEqualTo(String value) {
            addCriterion("METER <=", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterLike(String value) {
            addCriterion("METER like", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterNotLike(String value) {
            addCriterion("METER not like", value, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterIn(List<String> values) {
            addCriterion("METER in", values, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterNotIn(List<String> values) {
            addCriterion("METER not in", values, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterBetween(String value1, String value2) {
            addCriterion("METER between", value1, value2, "meter");
            return (Criteria) this;
        }

        public Criteria andMeterNotBetween(String value1, String value2) {
            addCriterion("METER not between", value1, value2, "meter");
            return (Criteria) this;
        }

        public Criteria andMetricTypeIsNull() {
            addCriterion("METRIC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMetricTypeIsNotNull() {
            addCriterion("METRIC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMetricTypeEqualTo(String value) {
            addCriterion("METRIC_TYPE =", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeNotEqualTo(String value) {
            addCriterion("METRIC_TYPE <>", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeGreaterThan(String value) {
            addCriterion("METRIC_TYPE >", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeGreaterThanOrEqualTo(String value) {
            addCriterion("METRIC_TYPE >=", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeLessThan(String value) {
            addCriterion("METRIC_TYPE <", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeLessThanOrEqualTo(String value) {
            addCriterion("METRIC_TYPE <=", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeLike(String value) {
            addCriterion("METRIC_TYPE like", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeNotLike(String value) {
            addCriterion("METRIC_TYPE not like", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeIn(List<String> values) {
            addCriterion("METRIC_TYPE in", values, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeNotIn(List<String> values) {
            addCriterion("METRIC_TYPE not in", values, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeBetween(String value1, String value2) {
            addCriterion("METRIC_TYPE between", value1, value2, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeNotBetween(String value1, String value2) {
            addCriterion("METRIC_TYPE not between", value1, value2, "metricType");
            return (Criteria) this;
        }

        public Criteria andNumTypeIsNull() {
            addCriterion("NUM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumTypeIsNotNull() {
            addCriterion("NUM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumTypeEqualTo(String value) {
            addCriterion("NUM_TYPE =", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotEqualTo(String value) {
            addCriterion("NUM_TYPE <>", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeGreaterThan(String value) {
            addCriterion("NUM_TYPE >", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_TYPE >=", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeLessThan(String value) {
            addCriterion("NUM_TYPE <", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeLessThanOrEqualTo(String value) {
            addCriterion("NUM_TYPE <=", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeLike(String value) {
            addCriterion("NUM_TYPE like", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotLike(String value) {
            addCriterion("NUM_TYPE not like", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeIn(List<String> values) {
            addCriterion("NUM_TYPE in", values, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotIn(List<String> values) {
            addCriterion("NUM_TYPE not in", values, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeBetween(String value1, String value2) {
            addCriterion("NUM_TYPE between", value1, value2, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotBetween(String value1, String value2) {
            addCriterion("NUM_TYPE not between", value1, value2, "numType");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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