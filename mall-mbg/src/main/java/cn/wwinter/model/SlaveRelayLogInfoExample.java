package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class SlaveRelayLogInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlaveRelayLogInfoExample() {
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

        public Criteria andNumberOfLinesIsNull() {
            addCriterion("Number_of_lines is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesIsNotNull() {
            addCriterion("Number_of_lines is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesEqualTo(Integer value) {
            addCriterion("Number_of_lines =", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesNotEqualTo(Integer value) {
            addCriterion("Number_of_lines <>", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesGreaterThan(Integer value) {
            addCriterion("Number_of_lines >", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number_of_lines >=", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesLessThan(Integer value) {
            addCriterion("Number_of_lines <", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesLessThanOrEqualTo(Integer value) {
            addCriterion("Number_of_lines <=", value, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesIn(List<Integer> values) {
            addCriterion("Number_of_lines in", values, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesNotIn(List<Integer> values) {
            addCriterion("Number_of_lines not in", values, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_lines between", value1, value2, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andNumberOfLinesNotBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_lines not between", value1, value2, "numberOfLines");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosIsNull() {
            addCriterion("Relay_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosIsNotNull() {
            addCriterion("Relay_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosEqualTo(Long value) {
            addCriterion("Relay_log_pos =", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosNotEqualTo(Long value) {
            addCriterion("Relay_log_pos <>", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosGreaterThan(Long value) {
            addCriterion("Relay_log_pos >", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosGreaterThanOrEqualTo(Long value) {
            addCriterion("Relay_log_pos >=", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosLessThan(Long value) {
            addCriterion("Relay_log_pos <", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosLessThanOrEqualTo(Long value) {
            addCriterion("Relay_log_pos <=", value, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosIn(List<Long> values) {
            addCriterion("Relay_log_pos in", values, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosNotIn(List<Long> values) {
            addCriterion("Relay_log_pos not in", values, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosBetween(Long value1, Long value2) {
            addCriterion("Relay_log_pos between", value1, value2, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andRelayLogPosNotBetween(Long value1, Long value2) {
            addCriterion("Relay_log_pos not between", value1, value2, "relayLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosIsNull() {
            addCriterion("Master_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosIsNotNull() {
            addCriterion("Master_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosEqualTo(Long value) {
            addCriterion("Master_log_pos =", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosNotEqualTo(Long value) {
            addCriterion("Master_log_pos <>", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosGreaterThan(Long value) {
            addCriterion("Master_log_pos >", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosGreaterThanOrEqualTo(Long value) {
            addCriterion("Master_log_pos >=", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosLessThan(Long value) {
            addCriterion("Master_log_pos <", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosLessThanOrEqualTo(Long value) {
            addCriterion("Master_log_pos <=", value, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosIn(List<Long> values) {
            addCriterion("Master_log_pos in", values, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosNotIn(List<Long> values) {
            addCriterion("Master_log_pos not in", values, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosBetween(Long value1, Long value2) {
            addCriterion("Master_log_pos between", value1, value2, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andMasterLogPosNotBetween(Long value1, Long value2) {
            addCriterion("Master_log_pos not between", value1, value2, "masterLogPos");
            return (Criteria) this;
        }

        public Criteria andSqlDelayIsNull() {
            addCriterion("Sql_delay is null");
            return (Criteria) this;
        }

        public Criteria andSqlDelayIsNotNull() {
            addCriterion("Sql_delay is not null");
            return (Criteria) this;
        }

        public Criteria andSqlDelayEqualTo(Integer value) {
            addCriterion("Sql_delay =", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayNotEqualTo(Integer value) {
            addCriterion("Sql_delay <>", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayGreaterThan(Integer value) {
            addCriterion("Sql_delay >", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sql_delay >=", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayLessThan(Integer value) {
            addCriterion("Sql_delay <", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayLessThanOrEqualTo(Integer value) {
            addCriterion("Sql_delay <=", value, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayIn(List<Integer> values) {
            addCriterion("Sql_delay in", values, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayNotIn(List<Integer> values) {
            addCriterion("Sql_delay not in", values, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayBetween(Integer value1, Integer value2) {
            addCriterion("Sql_delay between", value1, value2, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andSqlDelayNotBetween(Integer value1, Integer value2) {
            addCriterion("Sql_delay not between", value1, value2, "sqlDelay");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersIsNull() {
            addCriterion("Number_of_workers is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersIsNotNull() {
            addCriterion("Number_of_workers is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersEqualTo(Integer value) {
            addCriterion("Number_of_workers =", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersNotEqualTo(Integer value) {
            addCriterion("Number_of_workers <>", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersGreaterThan(Integer value) {
            addCriterion("Number_of_workers >", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number_of_workers >=", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersLessThan(Integer value) {
            addCriterion("Number_of_workers <", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersLessThanOrEqualTo(Integer value) {
            addCriterion("Number_of_workers <=", value, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersIn(List<Integer> values) {
            addCriterion("Number_of_workers in", values, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersNotIn(List<Integer> values) {
            addCriterion("Number_of_workers not in", values, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_workers between", value1, value2, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andNumberOfWorkersNotBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_workers not between", value1, value2, "numberOfWorkers");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameIsNull() {
            addCriterion("Privilege_checks_username is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameIsNotNull() {
            addCriterion("Privilege_checks_username is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameEqualTo(String value) {
            addCriterion("Privilege_checks_username =", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameNotEqualTo(String value) {
            addCriterion("Privilege_checks_username <>", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameGreaterThan(String value) {
            addCriterion("Privilege_checks_username >", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Privilege_checks_username >=", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameLessThan(String value) {
            addCriterion("Privilege_checks_username <", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameLessThanOrEqualTo(String value) {
            addCriterion("Privilege_checks_username <=", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameLike(String value) {
            addCriterion("Privilege_checks_username like", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameNotLike(String value) {
            addCriterion("Privilege_checks_username not like", value, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameIn(List<String> values) {
            addCriterion("Privilege_checks_username in", values, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameNotIn(List<String> values) {
            addCriterion("Privilege_checks_username not in", values, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameBetween(String value1, String value2) {
            addCriterion("Privilege_checks_username between", value1, value2, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksUsernameNotBetween(String value1, String value2) {
            addCriterion("Privilege_checks_username not between", value1, value2, "privilegeChecksUsername");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameIsNull() {
            addCriterion("Privilege_checks_hostname is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameIsNotNull() {
            addCriterion("Privilege_checks_hostname is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameEqualTo(String value) {
            addCriterion("Privilege_checks_hostname =", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameNotEqualTo(String value) {
            addCriterion("Privilege_checks_hostname <>", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameGreaterThan(String value) {
            addCriterion("Privilege_checks_hostname >", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("Privilege_checks_hostname >=", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameLessThan(String value) {
            addCriterion("Privilege_checks_hostname <", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameLessThanOrEqualTo(String value) {
            addCriterion("Privilege_checks_hostname <=", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameLike(String value) {
            addCriterion("Privilege_checks_hostname like", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameNotLike(String value) {
            addCriterion("Privilege_checks_hostname not like", value, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameIn(List<String> values) {
            addCriterion("Privilege_checks_hostname in", values, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameNotIn(List<String> values) {
            addCriterion("Privilege_checks_hostname not in", values, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameBetween(String value1, String value2) {
            addCriterion("Privilege_checks_hostname between", value1, value2, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andPrivilegeChecksHostnameNotBetween(String value1, String value2) {
            addCriterion("Privilege_checks_hostname not between", value1, value2, "privilegeChecksHostname");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatIsNull() {
            addCriterion("Require_row_format is null");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatIsNotNull() {
            addCriterion("Require_row_format is not null");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatEqualTo(Boolean value) {
            addCriterion("Require_row_format =", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatNotEqualTo(Boolean value) {
            addCriterion("Require_row_format <>", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatGreaterThan(Boolean value) {
            addCriterion("Require_row_format >", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Require_row_format >=", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatLessThan(Boolean value) {
            addCriterion("Require_row_format <", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatLessThanOrEqualTo(Boolean value) {
            addCriterion("Require_row_format <=", value, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatIn(List<Boolean> values) {
            addCriterion("Require_row_format in", values, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatNotIn(List<Boolean> values) {
            addCriterion("Require_row_format not in", values, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatBetween(Boolean value1, Boolean value2) {
            addCriterion("Require_row_format between", value1, value2, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireRowFormatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Require_row_format not between", value1, value2, "requireRowFormat");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckIsNull() {
            addCriterion("Require_table_primary_key_check is null");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckIsNotNull() {
            addCriterion("Require_table_primary_key_check is not null");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckEqualTo(String value) {
            addCriterion("Require_table_primary_key_check =", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotEqualTo(String value) {
            addCriterion("Require_table_primary_key_check <>", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckGreaterThan(String value) {
            addCriterion("Require_table_primary_key_check >", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckGreaterThanOrEqualTo(String value) {
            addCriterion("Require_table_primary_key_check >=", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckLessThan(String value) {
            addCriterion("Require_table_primary_key_check <", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckLessThanOrEqualTo(String value) {
            addCriterion("Require_table_primary_key_check <=", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckLike(String value) {
            addCriterion("Require_table_primary_key_check like", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotLike(String value) {
            addCriterion("Require_table_primary_key_check not like", value, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckIn(List<String> values) {
            addCriterion("Require_table_primary_key_check in", values, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotIn(List<String> values) {
            addCriterion("Require_table_primary_key_check not in", values, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckBetween(String value1, String value2) {
            addCriterion("Require_table_primary_key_check between", value1, value2, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andRequireTablePrimaryKeyCheckNotBetween(String value1, String value2) {
            addCriterion("Require_table_primary_key_check not between", value1, value2, "requireTablePrimaryKeyCheck");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeIsNull() {
            addCriterion("Assign_gtids_to_anonymous_transactions_type is null");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeIsNotNull() {
            addCriterion("Assign_gtids_to_anonymous_transactions_type is not null");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeEqualTo(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type =", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotEqualTo(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type <>", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeGreaterThan(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type >", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type >=", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeLessThan(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type <", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeLessThanOrEqualTo(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type <=", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeLike(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type like", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotLike(String value) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type not like", value, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeIn(List<String> values) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type in", values, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotIn(List<String> values) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type not in", values, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeBetween(String value1, String value2) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type between", value1, value2, "assignGtidsToAnonymousTransactionsType");
            return (Criteria) this;
        }

        public Criteria andAssignGtidsToAnonymousTransactionsTypeNotBetween(String value1, String value2) {
            addCriterion("Assign_gtids_to_anonymous_transactions_type not between", value1, value2, "assignGtidsToAnonymousTransactionsType");
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