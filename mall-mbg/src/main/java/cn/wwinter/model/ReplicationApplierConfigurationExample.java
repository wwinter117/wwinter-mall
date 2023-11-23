package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ReplicationApplierConfigurationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationApplierConfigurationExample() {
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

        public Criteria andChannelNameIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("CHANNEL_NAME like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayIsNull() {
            addCriterion("DESIRED_DELAY is null");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayIsNotNull() {
            addCriterion("DESIRED_DELAY is not null");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayEqualTo(Integer value) {
            addCriterion("DESIRED_DELAY =", value, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayNotEqualTo(Integer value) {
            addCriterion("DESIRED_DELAY <>", value, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayGreaterThan(Integer value) {
            addCriterion("DESIRED_DELAY >", value, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("DESIRED_DELAY >=", value, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayLessThan(Integer value) {
            addCriterion("DESIRED_DELAY <", value, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayLessThanOrEqualTo(Integer value) {
            addCriterion("DESIRED_DELAY <=", value, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayIn(List<Integer> values) {
            addCriterion("DESIRED_DELAY in", values, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayNotIn(List<Integer> values) {
            addCriterion("DESIRED_DELAY not in", values, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayBetween(Integer value1, Integer value2) {
            addCriterion("DESIRED_DELAY between", value1, value2, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andDesiredDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("DESIRED_DELAY not between", value1, value2, "desiredDelay");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatIsNull() {
            addCriterion("REQUIRE_ROW_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatIsNotNull() {
            addCriterion("REQUIRE_ROW_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatEqualTo(String value) {
            addCriterion("REQUIRE_ROW_FORMAT =", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatNotEqualTo(String value) {
            addCriterion("REQUIRE_ROW_FORMAT <>", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatGreaterThan(String value) {
            addCriterion("REQUIRE_ROW_FORMAT >", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_ROW_FORMAT >=", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatLessThan(String value) {
            addCriterion("REQUIRE_ROW_FORMAT <", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_ROW_FORMAT <=", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatLike(String value) {
            addCriterion("REQUIRE_ROW_FORMAT like", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatNotLike(String value) {
            addCriterion("REQUIRE_ROW_FORMAT not like", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatIn(List<String> values) {
            addCriterion("REQUIRE_ROW_FORMAT in", values, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatNotIn(List<String> values) {
            addCriterion("REQUIRE_ROW_FORMAT not in", values, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatBetween(String value1, String value2) {
            addCriterion("REQUIRE_ROW_FORMAT between", value1, value2, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_ROW_FORMAT not between", value1, value2, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckIsNull() {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckIsNotNull() {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckEqualTo(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK =", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotEqualTo(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK <>", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckGreaterThan(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK >", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckGreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK >=", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckLessThan(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK <", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckLessThanOrEqualTo(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK <=", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckLike(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK like", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotLike(String value) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK not like", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckIn(List<String> values) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK in", values, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotIn(List<String> values) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK not in", values, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckBetween(String value1, String value2) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK between", value1, value2, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotBetween(String value1, String value2) {
            addCriterion("REQUIRE_TABLE_PRIMARY_KEY_CHECK not between", value1, value2, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeIsNull() {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeIsNotNull() {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeEqualTo(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE =", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotEqualTo(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE <>", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeGreaterThan(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE >", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE >=", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeLessThan(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE <", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeLessThanOrEqualTo(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE <=", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeLike(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE like", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotLike(String value) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE not like", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeIn(List<String> values) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE in", values, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotIn(List<String> values) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE not in", values, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeBetween(String value1, String value2) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE between", value1, value2, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotBetween(String value1, String value2) {
            addCriterion("ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS_TYPE not between", value1, value2, "assignGtidsToAnonymousTransactionsType");
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