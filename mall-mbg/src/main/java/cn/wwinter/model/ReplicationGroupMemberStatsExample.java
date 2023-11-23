package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ReplicationGroupMemberStatsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationGroupMemberStatsExample() {
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

        public Criteria andViewIdIsNull() {
            addCriterion("VIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andViewIdIsNotNull() {
            addCriterion("VIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andViewIdEqualTo(String value) {
            addCriterion("VIEW_ID =", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotEqualTo(String value) {
            addCriterion("VIEW_ID <>", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThan(String value) {
            addCriterion("VIEW_ID >", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_ID >=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThan(String value) {
            addCriterion("VIEW_ID <", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLessThanOrEqualTo(String value) {
            addCriterion("VIEW_ID <=", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdLike(String value) {
            addCriterion("VIEW_ID like", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotLike(String value) {
            addCriterion("VIEW_ID not like", value, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdIn(List<String> values) {
            addCriterion("VIEW_ID in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotIn(List<String> values) {
            addCriterion("VIEW_ID not in", values, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdBetween(String value1, String value2) {
            addCriterion("VIEW_ID between", value1, value2, "viewId");
            return (Criteria) this;
        }

        public Criteria andViewIdNotBetween(String value1, String value2) {
            addCriterion("VIEW_ID not between", value1, value2, "viewId");
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

        public Criteria andCountTransactionsInQueueIsNull() {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE =", value, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE <>", value, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE >", value, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE >=", value, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE <", value, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE <=", value, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE in", values, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE not in", values, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE between", value1, value2, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsInQueueNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE not between", value1, value2, "countTransactionsInQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedIsNull() {
            addCriterion("COUNT_TRANSACTIONS_CHECKED is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_CHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED =", value, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED <>", value, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED >", value, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED >=", value, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED <", value, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED <=", value, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED in", values, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED not in", values, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED between", value1, value2, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsCheckedNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED not between", value1, value2, "countTransactionsChecked");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedIsNull() {
            addCriterion("COUNT_CONFLICTS_DETECTED is null");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedIsNotNull() {
            addCriterion("COUNT_CONFLICTS_DETECTED is not null");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED =", value, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedNotEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED <>", value, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedGreaterThan(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED >", value, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED >=", value, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedLessThan(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED <", value, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED <=", value, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedIn(List<Long> values) {
            addCriterion("COUNT_CONFLICTS_DETECTED in", values, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedNotIn(List<Long> values) {
            addCriterion("COUNT_CONFLICTS_DETECTED not in", values, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedBetween(Long value1, Long value2) {
            addCriterion("COUNT_CONFLICTS_DETECTED between", value1, value2, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountConflictsDetectedNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_CONFLICTS_DETECTED not between", value1, value2, "countConflictsDetected");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingIsNull() {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING =", value, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING <>", value, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING >", value, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING >=", value, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING <", value, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING <=", value, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING in", values, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING not in", values, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING between", value1, value2, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRowsValidatingNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING not between", value1, value2, "countTransactionsRowsValidating");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueIsNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE =", value, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE <>", value, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE >", value, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE >=", value, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE <", value, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE <=", value, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE in", values, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE not in", values, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE between", value1, value2, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteInApplierQueueNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE not between", value1, value2, "countTransactionsRemoteInApplierQueue");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedIsNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED =", value, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED <>", value, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED >", value, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED >=", value, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED <", value, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED <=", value, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED in", values, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED not in", values, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED between", value1, value2, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsRemoteAppliedNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED not between", value1, value2, "countTransactionsRemoteApplied");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedIsNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED =", value, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED <>", value, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED >", value, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED >=", value, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED <", value, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED <=", value, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED in", values, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED not in", values, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED between", value1, value2, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalProposedNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED not between", value1, value2, "countTransactionsLocalProposed");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackIsNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK is null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK is not null");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK =", value, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK <>", value, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK >", value, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK >=", value, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK <", value, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK <=", value, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK in", values, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK not in", values, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK between", value1, value2, "countTransactionsLocalRollback");
            return (Criteria) this;
        }

        public Criteria andCountTransactionsLocalRollbackNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK not between", value1, value2, "countTransactionsLocalRollback");
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