package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ReplicationGroupMembersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationGroupMembersExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberHostIsNull() {
            addCriterion("MEMBER_HOST is null");
            return (Criteria) this;
        }

        public Criteria andMemberHostIsNotNull() {
            addCriterion("MEMBER_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andMemberHostEqualTo(String value) {
            addCriterion("MEMBER_HOST =", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostNotEqualTo(String value) {
            addCriterion("MEMBER_HOST <>", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostGreaterThan(String value) {
            addCriterion("MEMBER_HOST >", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_HOST >=", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostLessThan(String value) {
            addCriterion("MEMBER_HOST <", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_HOST <=", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostLike(String value) {
            addCriterion("MEMBER_HOST like", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostNotLike(String value) {
            addCriterion("MEMBER_HOST not like", value, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostIn(List<String> values) {
            addCriterion("MEMBER_HOST in", values, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostNotIn(List<String> values) {
            addCriterion("MEMBER_HOST not in", values, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostBetween(String value1, String value2) {
            addCriterion("MEMBER_HOST between", value1, value2, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberHostNotBetween(String value1, String value2) {
            addCriterion("MEMBER_HOST not between", value1, value2, "memberHost");
            return (Criteria) this;
        }

        public Criteria andMemberPortIsNull() {
            addCriterion("MEMBER_PORT is null");
            return (Criteria) this;
        }

        public Criteria andMemberPortIsNotNull() {
            addCriterion("MEMBER_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPortEqualTo(Integer value) {
            addCriterion("MEMBER_PORT =", value, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortNotEqualTo(Integer value) {
            addCriterion("MEMBER_PORT <>", value, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortGreaterThan(Integer value) {
            addCriterion("MEMBER_PORT >", value, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_PORT >=", value, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortLessThan(Integer value) {
            addCriterion("MEMBER_PORT <", value, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_PORT <=", value, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortIn(List<Integer> values) {
            addCriterion("MEMBER_PORT in", values, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortNotIn(List<Integer> values) {
            addCriterion("MEMBER_PORT not in", values, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_PORT between", value1, value2, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberPortNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_PORT not between", value1, value2, "memberPort");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNull() {
            addCriterion("MEMBER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMemberStateIsNotNull() {
            addCriterion("MEMBER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStateEqualTo(String value) {
            addCriterion("MEMBER_STATE =", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotEqualTo(String value) {
            addCriterion("MEMBER_STATE <>", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThan(String value) {
            addCriterion("MEMBER_STATE >", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATE >=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThan(String value) {
            addCriterion("MEMBER_STATE <", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATE <=", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateLike(String value) {
            addCriterion("MEMBER_STATE like", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotLike(String value) {
            addCriterion("MEMBER_STATE not like", value, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateIn(List<String> values) {
            addCriterion("MEMBER_STATE in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotIn(List<String> values) {
            addCriterion("MEMBER_STATE not in", values, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateBetween(String value1, String value2) {
            addCriterion("MEMBER_STATE between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberStateNotBetween(String value1, String value2) {
            addCriterion("MEMBER_STATE not between", value1, value2, "memberState");
            return (Criteria) this;
        }

        public Criteria andMemberRoleIsNull() {
            addCriterion("MEMBER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andMemberRoleIsNotNull() {
            addCriterion("MEMBER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRoleEqualTo(String value) {
            addCriterion("MEMBER_ROLE =", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotEqualTo(String value) {
            addCriterion("MEMBER_ROLE <>", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleGreaterThan(String value) {
            addCriterion("MEMBER_ROLE >", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ROLE >=", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleLessThan(String value) {
            addCriterion("MEMBER_ROLE <", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ROLE <=", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleLike(String value) {
            addCriterion("MEMBER_ROLE like", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotLike(String value) {
            addCriterion("MEMBER_ROLE not like", value, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleIn(List<String> values) {
            addCriterion("MEMBER_ROLE in", values, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotIn(List<String> values) {
            addCriterion("MEMBER_ROLE not in", values, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleBetween(String value1, String value2) {
            addCriterion("MEMBER_ROLE between", value1, value2, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberRoleNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ROLE not between", value1, value2, "memberRole");
            return (Criteria) this;
        }

        public Criteria andMemberVersionIsNull() {
            addCriterion("MEMBER_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andMemberVersionIsNotNull() {
            addCriterion("MEMBER_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMemberVersionEqualTo(String value) {
            addCriterion("MEMBER_VERSION =", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionNotEqualTo(String value) {
            addCriterion("MEMBER_VERSION <>", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionGreaterThan(String value) {
            addCriterion("MEMBER_VERSION >", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_VERSION >=", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionLessThan(String value) {
            addCriterion("MEMBER_VERSION <", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_VERSION <=", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionLike(String value) {
            addCriterion("MEMBER_VERSION like", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionNotLike(String value) {
            addCriterion("MEMBER_VERSION not like", value, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionIn(List<String> values) {
            addCriterion("MEMBER_VERSION in", values, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionNotIn(List<String> values) {
            addCriterion("MEMBER_VERSION not in", values, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionBetween(String value1, String value2) {
            addCriterion("MEMBER_VERSION between", value1, value2, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberVersionNotBetween(String value1, String value2) {
            addCriterion("MEMBER_VERSION not between", value1, value2, "memberVersion");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackIsNull() {
            addCriterion("MEMBER_COMMUNICATION_STACK is null");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackIsNotNull() {
            addCriterion("MEMBER_COMMUNICATION_STACK is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackEqualTo(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK =", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackNotEqualTo(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK <>", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackGreaterThan(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK >", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK >=", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackLessThan(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK <", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK <=", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackLike(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK like", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackNotLike(String value) {
            addCriterion("MEMBER_COMMUNICATION_STACK not like", value, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackIn(List<String> values) {
            addCriterion("MEMBER_COMMUNICATION_STACK in", values, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackNotIn(List<String> values) {
            addCriterion("MEMBER_COMMUNICATION_STACK not in", values, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackBetween(String value1, String value2) {
            addCriterion("MEMBER_COMMUNICATION_STACK between", value1, value2, "memberCommunicationStack");
            return (Criteria) this;
        }

        public Criteria andMemberCommunicationStackNotBetween(String value1, String value2) {
            addCriterion("MEMBER_COMMUNICATION_STACK not between", value1, value2, "memberCommunicationStack");
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