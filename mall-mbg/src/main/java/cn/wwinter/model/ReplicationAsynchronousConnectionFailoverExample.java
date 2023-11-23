package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ReplicationAsynchronousConnectionFailoverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationAsynchronousConnectionFailoverExample() {
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
            addCriterion("Channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("Channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("Channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("Channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("Channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("Channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("Channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("Channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("Channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("Channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("Channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("Channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("Channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("Channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("Host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("Host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("Host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("Host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("Host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("Host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("Host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("Host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("Host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("Host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("Host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("Host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("Host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("Host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("Port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("Port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("Port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("Port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("Port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("Port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("Port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("Port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("Port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("Port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("Port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("Port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceIsNull() {
            addCriterion("Network_namespace is null");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceIsNotNull() {
            addCriterion("Network_namespace is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceEqualTo(String value) {
            addCriterion("Network_namespace =", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotEqualTo(String value) {
            addCriterion("Network_namespace <>", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceGreaterThan(String value) {
            addCriterion("Network_namespace >", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceGreaterThanOrEqualTo(String value) {
            addCriterion("Network_namespace >=", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceLessThan(String value) {
            addCriterion("Network_namespace <", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceLessThanOrEqualTo(String value) {
            addCriterion("Network_namespace <=", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceLike(String value) {
            addCriterion("Network_namespace like", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotLike(String value) {
            addCriterion("Network_namespace not like", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceIn(List<String> values) {
            addCriterion("Network_namespace in", values, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotIn(List<String> values) {
            addCriterion("Network_namespace not in", values, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceBetween(String value1, String value2) {
            addCriterion("Network_namespace between", value1, value2, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotBetween(String value1, String value2) {
            addCriterion("Network_namespace not between", value1, value2, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andManagedNameIsNull() {
            addCriterion("Managed_name is null");
            return (Criteria) this;
        }

        public Criteria andManagedNameIsNotNull() {
            addCriterion("Managed_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagedNameEqualTo(String value) {
            addCriterion("Managed_name =", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotEqualTo(String value) {
            addCriterion("Managed_name <>", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameGreaterThan(String value) {
            addCriterion("Managed_name >", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameGreaterThanOrEqualTo(String value) {
            addCriterion("Managed_name >=", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameLessThan(String value) {
            addCriterion("Managed_name <", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameLessThanOrEqualTo(String value) {
            addCriterion("Managed_name <=", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameLike(String value) {
            addCriterion("Managed_name like", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotLike(String value) {
            addCriterion("Managed_name not like", value, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameIn(List<String> values) {
            addCriterion("Managed_name in", values, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotIn(List<String> values) {
            addCriterion("Managed_name not in", values, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameBetween(String value1, String value2) {
            addCriterion("Managed_name between", value1, value2, "managedName");
            return (Criteria) this;
        }

        public Criteria andManagedNameNotBetween(String value1, String value2) {
            addCriterion("Managed_name not between", value1, value2, "managedName");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("Weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("Weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Byte value) {
            addCriterion("Weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Byte value) {
            addCriterion("Weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Byte value) {
            addCriterion("Weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Byte value) {
            addCriterion("Weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Byte value) {
            addCriterion("Weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Byte value) {
            addCriterion("Weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Byte> values) {
            addCriterion("Weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Byte> values) {
            addCriterion("Weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Byte value1, Byte value2) {
            addCriterion("Weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Byte value1, Byte value2) {
            addCriterion("Weight not between", value1, value2, "weight");
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