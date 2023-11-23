package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class GlobalGrantsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GlobalGrantsExample() {
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

        public Criteria andUserIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("USER =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("USER <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("USER >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("USER <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("USER like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("USER not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("USER in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("USER not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "user");
            return (Criteria) this;
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

        public Criteria andPrivIsNull() {
            addCriterion("PRIV is null");
            return (Criteria) this;
        }

        public Criteria andPrivIsNotNull() {
            addCriterion("PRIV is not null");
            return (Criteria) this;
        }

        public Criteria andPrivEqualTo(String value) {
            addCriterion("PRIV =", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivNotEqualTo(String value) {
            addCriterion("PRIV <>", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivGreaterThan(String value) {
            addCriterion("PRIV >", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivGreaterThanOrEqualTo(String value) {
            addCriterion("PRIV >=", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivLessThan(String value) {
            addCriterion("PRIV <", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivLessThanOrEqualTo(String value) {
            addCriterion("PRIV <=", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivLike(String value) {
            addCriterion("PRIV like", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivNotLike(String value) {
            addCriterion("PRIV not like", value, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivIn(List<String> values) {
            addCriterion("PRIV in", values, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivNotIn(List<String> values) {
            addCriterion("PRIV not in", values, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivBetween(String value1, String value2) {
            addCriterion("PRIV between", value1, value2, "priv");
            return (Criteria) this;
        }

        public Criteria andPrivNotBetween(String value1, String value2) {
            addCriterion("PRIV not between", value1, value2, "priv");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionIsNull() {
            addCriterion("WITH_GRANT_OPTION is null");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionIsNotNull() {
            addCriterion("WITH_GRANT_OPTION is not null");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionEqualTo(String value) {
            addCriterion("WITH_GRANT_OPTION =", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionNotEqualTo(String value) {
            addCriterion("WITH_GRANT_OPTION <>", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionGreaterThan(String value) {
            addCriterion("WITH_GRANT_OPTION >", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionGreaterThanOrEqualTo(String value) {
            addCriterion("WITH_GRANT_OPTION >=", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionLessThan(String value) {
            addCriterion("WITH_GRANT_OPTION <", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionLessThanOrEqualTo(String value) {
            addCriterion("WITH_GRANT_OPTION <=", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionLike(String value) {
            addCriterion("WITH_GRANT_OPTION like", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionNotLike(String value) {
            addCriterion("WITH_GRANT_OPTION not like", value, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionIn(List<String> values) {
            addCriterion("WITH_GRANT_OPTION in", values, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionNotIn(List<String> values) {
            addCriterion("WITH_GRANT_OPTION not in", values, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionBetween(String value1, String value2) {
            addCriterion("WITH_GRANT_OPTION between", value1, value2, "withGrantOption");
            return (Criteria) this;
        }

        public Criteria andWithGrantOptionNotBetween(String value1, String value2) {
            addCriterion("WITH_GRANT_OPTION not between", value1, value2, "withGrantOption");
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