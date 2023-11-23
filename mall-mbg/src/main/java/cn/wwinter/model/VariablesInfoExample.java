package cn.wwinter.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VariablesInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VariablesInfoExample() {
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

        public Criteria andVariableNameIsNull() {
            addCriterion("VARIABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNotNull() {
            addCriterion("VARIABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVariableNameEqualTo(String value) {
            addCriterion("VARIABLE_NAME =", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotEqualTo(String value) {
            addCriterion("VARIABLE_NAME <>", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThan(String value) {
            addCriterion("VARIABLE_NAME >", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME >=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThan(String value) {
            addCriterion("VARIABLE_NAME <", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME <=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLike(String value) {
            addCriterion("VARIABLE_NAME like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotLike(String value) {
            addCriterion("VARIABLE_NAME not like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameIn(List<String> values) {
            addCriterion("VARIABLE_NAME in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotIn(List<String> values) {
            addCriterion("VARIABLE_NAME not in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME not between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableSourceIsNull() {
            addCriterion("VARIABLE_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andVariableSourceIsNotNull() {
            addCriterion("VARIABLE_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andVariableSourceEqualTo(String value) {
            addCriterion("VARIABLE_SOURCE =", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceNotEqualTo(String value) {
            addCriterion("VARIABLE_SOURCE <>", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceGreaterThan(String value) {
            addCriterion("VARIABLE_SOURCE >", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_SOURCE >=", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceLessThan(String value) {
            addCriterion("VARIABLE_SOURCE <", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_SOURCE <=", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceLike(String value) {
            addCriterion("VARIABLE_SOURCE like", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceNotLike(String value) {
            addCriterion("VARIABLE_SOURCE not like", value, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceIn(List<String> values) {
            addCriterion("VARIABLE_SOURCE in", values, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceNotIn(List<String> values) {
            addCriterion("VARIABLE_SOURCE not in", values, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceBetween(String value1, String value2) {
            addCriterion("VARIABLE_SOURCE between", value1, value2, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariableSourceNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_SOURCE not between", value1, value2, "variableSource");
            return (Criteria) this;
        }

        public Criteria andVariablePathIsNull() {
            addCriterion("VARIABLE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andVariablePathIsNotNull() {
            addCriterion("VARIABLE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andVariablePathEqualTo(String value) {
            addCriterion("VARIABLE_PATH =", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathNotEqualTo(String value) {
            addCriterion("VARIABLE_PATH <>", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathGreaterThan(String value) {
            addCriterion("VARIABLE_PATH >", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_PATH >=", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathLessThan(String value) {
            addCriterion("VARIABLE_PATH <", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_PATH <=", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathLike(String value) {
            addCriterion("VARIABLE_PATH like", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathNotLike(String value) {
            addCriterion("VARIABLE_PATH not like", value, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathIn(List<String> values) {
            addCriterion("VARIABLE_PATH in", values, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathNotIn(List<String> values) {
            addCriterion("VARIABLE_PATH not in", values, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathBetween(String value1, String value2) {
            addCriterion("VARIABLE_PATH between", value1, value2, "variablePath");
            return (Criteria) this;
        }

        public Criteria andVariablePathNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_PATH not between", value1, value2, "variablePath");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNull() {
            addCriterion("MIN_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNotNull() {
            addCriterion("MIN_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMinValueEqualTo(String value) {
            addCriterion("MIN_VALUE =", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotEqualTo(String value) {
            addCriterion("MIN_VALUE <>", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThan(String value) {
            addCriterion("MIN_VALUE >", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_VALUE >=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThan(String value) {
            addCriterion("MIN_VALUE <", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThanOrEqualTo(String value) {
            addCriterion("MIN_VALUE <=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLike(String value) {
            addCriterion("MIN_VALUE like", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotLike(String value) {
            addCriterion("MIN_VALUE not like", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueIn(List<String> values) {
            addCriterion("MIN_VALUE in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotIn(List<String> values) {
            addCriterion("MIN_VALUE not in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueBetween(String value1, String value2) {
            addCriterion("MIN_VALUE between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotBetween(String value1, String value2) {
            addCriterion("MIN_VALUE not between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("MAX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("MAX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(String value) {
            addCriterion("MAX_VALUE =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(String value) {
            addCriterion("MAX_VALUE <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(String value) {
            addCriterion("MAX_VALUE >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(String value) {
            addCriterion("MAX_VALUE >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(String value) {
            addCriterion("MAX_VALUE <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(String value) {
            addCriterion("MAX_VALUE <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLike(String value) {
            addCriterion("MAX_VALUE like", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotLike(String value) {
            addCriterion("MAX_VALUE not like", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<String> values) {
            addCriterion("MAX_VALUE in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<String> values) {
            addCriterion("MAX_VALUE not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(String value1, String value2) {
            addCriterion("MAX_VALUE between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(String value1, String value2) {
            addCriterion("MAX_VALUE not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNull() {
            addCriterion("SET_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSetTimeIsNotNull() {
            addCriterion("SET_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSetTimeEqualTo(Date value) {
            addCriterion("SET_TIME =", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotEqualTo(Date value) {
            addCriterion("SET_TIME <>", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThan(Date value) {
            addCriterion("SET_TIME >", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SET_TIME >=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThan(Date value) {
            addCriterion("SET_TIME <", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeLessThanOrEqualTo(Date value) {
            addCriterion("SET_TIME <=", value, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeIn(List<Date> values) {
            addCriterion("SET_TIME in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotIn(List<Date> values) {
            addCriterion("SET_TIME not in", values, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeBetween(Date value1, Date value2) {
            addCriterion("SET_TIME between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetTimeNotBetween(Date value1, Date value2) {
            addCriterion("SET_TIME not between", value1, value2, "setTime");
            return (Criteria) this;
        }

        public Criteria andSetUserIsNull() {
            addCriterion("SET_USER is null");
            return (Criteria) this;
        }

        public Criteria andSetUserIsNotNull() {
            addCriterion("SET_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSetUserEqualTo(String value) {
            addCriterion("SET_USER =", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserNotEqualTo(String value) {
            addCriterion("SET_USER <>", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserGreaterThan(String value) {
            addCriterion("SET_USER >", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserGreaterThanOrEqualTo(String value) {
            addCriterion("SET_USER >=", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserLessThan(String value) {
            addCriterion("SET_USER <", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserLessThanOrEqualTo(String value) {
            addCriterion("SET_USER <=", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserLike(String value) {
            addCriterion("SET_USER like", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserNotLike(String value) {
            addCriterion("SET_USER not like", value, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserIn(List<String> values) {
            addCriterion("SET_USER in", values, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserNotIn(List<String> values) {
            addCriterion("SET_USER not in", values, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserBetween(String value1, String value2) {
            addCriterion("SET_USER between", value1, value2, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetUserNotBetween(String value1, String value2) {
            addCriterion("SET_USER not between", value1, value2, "setUser");
            return (Criteria) this;
        }

        public Criteria andSetHostIsNull() {
            addCriterion("SET_HOST is null");
            return (Criteria) this;
        }

        public Criteria andSetHostIsNotNull() {
            addCriterion("SET_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andSetHostEqualTo(String value) {
            addCriterion("SET_HOST =", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostNotEqualTo(String value) {
            addCriterion("SET_HOST <>", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostGreaterThan(String value) {
            addCriterion("SET_HOST >", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostGreaterThanOrEqualTo(String value) {
            addCriterion("SET_HOST >=", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostLessThan(String value) {
            addCriterion("SET_HOST <", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostLessThanOrEqualTo(String value) {
            addCriterion("SET_HOST <=", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostLike(String value) {
            addCriterion("SET_HOST like", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostNotLike(String value) {
            addCriterion("SET_HOST not like", value, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostIn(List<String> values) {
            addCriterion("SET_HOST in", values, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostNotIn(List<String> values) {
            addCriterion("SET_HOST not in", values, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostBetween(String value1, String value2) {
            addCriterion("SET_HOST between", value1, value2, "setHost");
            return (Criteria) this;
        }

        public Criteria andSetHostNotBetween(String value1, String value2) {
            addCriterion("SET_HOST not between", value1, value2, "setHost");
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