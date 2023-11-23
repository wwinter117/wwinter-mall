package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class SchemataExtensionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchemataExtensionsExample() {
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

        public Criteria andCatalogNameIsNull() {
            addCriterion("CATALOG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCatalogNameIsNotNull() {
            addCriterion("CATALOG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogNameEqualTo(String value) {
            addCriterion("CATALOG_NAME =", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotEqualTo(String value) {
            addCriterion("CATALOG_NAME <>", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameGreaterThan(String value) {
            addCriterion("CATALOG_NAME >", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATALOG_NAME >=", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameLessThan(String value) {
            addCriterion("CATALOG_NAME <", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameLessThanOrEqualTo(String value) {
            addCriterion("CATALOG_NAME <=", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameLike(String value) {
            addCriterion("CATALOG_NAME like", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotLike(String value) {
            addCriterion("CATALOG_NAME not like", value, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameIn(List<String> values) {
            addCriterion("CATALOG_NAME in", values, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotIn(List<String> values) {
            addCriterion("CATALOG_NAME not in", values, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameBetween(String value1, String value2) {
            addCriterion("CATALOG_NAME between", value1, value2, "catalogName");
            return (Criteria) this;
        }

        public Criteria andCatalogNameNotBetween(String value1, String value2) {
            addCriterion("CATALOG_NAME not between", value1, value2, "catalogName");
            return (Criteria) this;
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

        public Criteria andOptionsIsNull() {
            addCriterion("OPTIONS is null");
            return (Criteria) this;
        }

        public Criteria andOptionsIsNotNull() {
            addCriterion("OPTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andOptionsEqualTo(String value) {
            addCriterion("OPTIONS =", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotEqualTo(String value) {
            addCriterion("OPTIONS <>", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThan(String value) {
            addCriterion("OPTIONS >", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("OPTIONS >=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThan(String value) {
            addCriterion("OPTIONS <", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLessThanOrEqualTo(String value) {
            addCriterion("OPTIONS <=", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsLike(String value) {
            addCriterion("OPTIONS like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotLike(String value) {
            addCriterion("OPTIONS not like", value, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsIn(List<String> values) {
            addCriterion("OPTIONS in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotIn(List<String> values) {
            addCriterion("OPTIONS not in", values, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsBetween(String value1, String value2) {
            addCriterion("OPTIONS between", value1, value2, "options");
            return (Criteria) this;
        }

        public Criteria andOptionsNotBetween(String value1, String value2) {
            addCriterion("OPTIONS not between", value1, value2, "options");
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