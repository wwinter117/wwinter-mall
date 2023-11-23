package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class RoleEdgesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleEdgesExample() {
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

        public Criteria andFromHostIsNull() {
            addCriterion("FROM_HOST is null");
            return (Criteria) this;
        }

        public Criteria andFromHostIsNotNull() {
            addCriterion("FROM_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andFromHostEqualTo(String value) {
            addCriterion("FROM_HOST =", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostNotEqualTo(String value) {
            addCriterion("FROM_HOST <>", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostGreaterThan(String value) {
            addCriterion("FROM_HOST >", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_HOST >=", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostLessThan(String value) {
            addCriterion("FROM_HOST <", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostLessThanOrEqualTo(String value) {
            addCriterion("FROM_HOST <=", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostLike(String value) {
            addCriterion("FROM_HOST like", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostNotLike(String value) {
            addCriterion("FROM_HOST not like", value, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostIn(List<String> values) {
            addCriterion("FROM_HOST in", values, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostNotIn(List<String> values) {
            addCriterion("FROM_HOST not in", values, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostBetween(String value1, String value2) {
            addCriterion("FROM_HOST between", value1, value2, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromHostNotBetween(String value1, String value2) {
            addCriterion("FROM_HOST not between", value1, value2, "fromHost");
            return (Criteria) this;
        }

        public Criteria andFromUserIsNull() {
            addCriterion("FROM_USER is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIsNotNull() {
            addCriterion("FROM_USER is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserEqualTo(String value) {
            addCriterion("FROM_USER =", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotEqualTo(String value) {
            addCriterion("FROM_USER <>", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserGreaterThan(String value) {
            addCriterion("FROM_USER >", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_USER >=", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserLessThan(String value) {
            addCriterion("FROM_USER <", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserLessThanOrEqualTo(String value) {
            addCriterion("FROM_USER <=", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserLike(String value) {
            addCriterion("FROM_USER like", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotLike(String value) {
            addCriterion("FROM_USER not like", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserIn(List<String> values) {
            addCriterion("FROM_USER in", values, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotIn(List<String> values) {
            addCriterion("FROM_USER not in", values, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserBetween(String value1, String value2) {
            addCriterion("FROM_USER between", value1, value2, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotBetween(String value1, String value2) {
            addCriterion("FROM_USER not between", value1, value2, "fromUser");
            return (Criteria) this;
        }

        public Criteria andToHostIsNull() {
            addCriterion("TO_HOST is null");
            return (Criteria) this;
        }

        public Criteria andToHostIsNotNull() {
            addCriterion("TO_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andToHostEqualTo(String value) {
            addCriterion("TO_HOST =", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostNotEqualTo(String value) {
            addCriterion("TO_HOST <>", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostGreaterThan(String value) {
            addCriterion("TO_HOST >", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostGreaterThanOrEqualTo(String value) {
            addCriterion("TO_HOST >=", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostLessThan(String value) {
            addCriterion("TO_HOST <", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostLessThanOrEqualTo(String value) {
            addCriterion("TO_HOST <=", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostLike(String value) {
            addCriterion("TO_HOST like", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostNotLike(String value) {
            addCriterion("TO_HOST not like", value, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostIn(List<String> values) {
            addCriterion("TO_HOST in", values, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostNotIn(List<String> values) {
            addCriterion("TO_HOST not in", values, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostBetween(String value1, String value2) {
            addCriterion("TO_HOST between", value1, value2, "toHost");
            return (Criteria) this;
        }

        public Criteria andToHostNotBetween(String value1, String value2) {
            addCriterion("TO_HOST not between", value1, value2, "toHost");
            return (Criteria) this;
        }

        public Criteria andToUserIsNull() {
            addCriterion("TO_USER is null");
            return (Criteria) this;
        }

        public Criteria andToUserIsNotNull() {
            addCriterion("TO_USER is not null");
            return (Criteria) this;
        }

        public Criteria andToUserEqualTo(String value) {
            addCriterion("TO_USER =", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotEqualTo(String value) {
            addCriterion("TO_USER <>", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserGreaterThan(String value) {
            addCriterion("TO_USER >", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserGreaterThanOrEqualTo(String value) {
            addCriterion("TO_USER >=", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLessThan(String value) {
            addCriterion("TO_USER <", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLessThanOrEqualTo(String value) {
            addCriterion("TO_USER <=", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLike(String value) {
            addCriterion("TO_USER like", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotLike(String value) {
            addCriterion("TO_USER not like", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserIn(List<String> values) {
            addCriterion("TO_USER in", values, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotIn(List<String> values) {
            addCriterion("TO_USER not in", values, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserBetween(String value1, String value2) {
            addCriterion("TO_USER between", value1, value2, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotBetween(String value1, String value2) {
            addCriterion("TO_USER not between", value1, value2, "toUser");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionIsNull() {
            addCriterion("WITH_ADMIN_OPTION is null");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionIsNotNull() {
            addCriterion("WITH_ADMIN_OPTION is not null");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionEqualTo(String value) {
            addCriterion("WITH_ADMIN_OPTION =", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionNotEqualTo(String value) {
            addCriterion("WITH_ADMIN_OPTION <>", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionGreaterThan(String value) {
            addCriterion("WITH_ADMIN_OPTION >", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionGreaterThanOrEqualTo(String value) {
            addCriterion("WITH_ADMIN_OPTION >=", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionLessThan(String value) {
            addCriterion("WITH_ADMIN_OPTION <", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionLessThanOrEqualTo(String value) {
            addCriterion("WITH_ADMIN_OPTION <=", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionLike(String value) {
            addCriterion("WITH_ADMIN_OPTION like", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionNotLike(String value) {
            addCriterion("WITH_ADMIN_OPTION not like", value, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionIn(List<String> values) {
            addCriterion("WITH_ADMIN_OPTION in", values, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionNotIn(List<String> values) {
            addCriterion("WITH_ADMIN_OPTION not in", values, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionBetween(String value1, String value2) {
            addCriterion("WITH_ADMIN_OPTION between", value1, value2, "withAdminOption");
            return (Criteria) this;
        }

        public Criteria andWithAdminOptionNotBetween(String value1, String value2) {
            addCriterion("WITH_ADMIN_OPTION not between", value1, value2, "withAdminOption");
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