package cn.wwinter.model;

import java.util.ArrayList;
import java.util.List;

public class ReplicationConnectionConfigurationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplicationConnectionConfigurationExample() {
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

        public Criteria andPortIsNull() {
            addCriterion("PORT is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("PORT is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("PORT =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("PORT <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("PORT >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("PORT >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("PORT <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("PORT <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("PORT in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("PORT not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("PORT between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("PORT not between", value1, value2, "port");
            return (Criteria) this;
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

        public Criteria andNetworkInterfaceIsNull() {
            addCriterion("NETWORK_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceIsNotNull() {
            addCriterion("NETWORK_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceEqualTo(String value) {
            addCriterion("NETWORK_INTERFACE =", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceNotEqualTo(String value) {
            addCriterion("NETWORK_INTERFACE <>", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceGreaterThan(String value) {
            addCriterion("NETWORK_INTERFACE >", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_INTERFACE >=", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceLessThan(String value) {
            addCriterion("NETWORK_INTERFACE <", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_INTERFACE <=", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceLike(String value) {
            addCriterion("NETWORK_INTERFACE like", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceNotLike(String value) {
            addCriterion("NETWORK_INTERFACE not like", value, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceIn(List<String> values) {
            addCriterion("NETWORK_INTERFACE in", values, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceNotIn(List<String> values) {
            addCriterion("NETWORK_INTERFACE not in", values, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceBetween(String value1, String value2) {
            addCriterion("NETWORK_INTERFACE between", value1, value2, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andNetworkInterfaceNotBetween(String value1, String value2) {
            addCriterion("NETWORK_INTERFACE not between", value1, value2, "networkInterface");
            return (Criteria) this;
        }

        public Criteria andAutoPositionIsNull() {
            addCriterion("AUTO_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andAutoPositionIsNotNull() {
            addCriterion("AUTO_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andAutoPositionEqualTo(String value) {
            addCriterion("AUTO_POSITION =", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionNotEqualTo(String value) {
            addCriterion("AUTO_POSITION <>", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionGreaterThan(String value) {
            addCriterion("AUTO_POSITION >", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_POSITION >=", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionLessThan(String value) {
            addCriterion("AUTO_POSITION <", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionLessThanOrEqualTo(String value) {
            addCriterion("AUTO_POSITION <=", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionLike(String value) {
            addCriterion("AUTO_POSITION like", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionNotLike(String value) {
            addCriterion("AUTO_POSITION not like", value, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionIn(List<String> values) {
            addCriterion("AUTO_POSITION in", values, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionNotIn(List<String> values) {
            addCriterion("AUTO_POSITION not in", values, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionBetween(String value1, String value2) {
            addCriterion("AUTO_POSITION between", value1, value2, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andAutoPositionNotBetween(String value1, String value2) {
            addCriterion("AUTO_POSITION not between", value1, value2, "autoPosition");
            return (Criteria) this;
        }

        public Criteria andSslAllowedIsNull() {
            addCriterion("SSL_ALLOWED is null");
            return (Criteria) this;
        }

        public Criteria andSslAllowedIsNotNull() {
            addCriterion("SSL_ALLOWED is not null");
            return (Criteria) this;
        }

        public Criteria andSslAllowedEqualTo(String value) {
            addCriterion("SSL_ALLOWED =", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedNotEqualTo(String value) {
            addCriterion("SSL_ALLOWED <>", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedGreaterThan(String value) {
            addCriterion("SSL_ALLOWED >", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_ALLOWED >=", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedLessThan(String value) {
            addCriterion("SSL_ALLOWED <", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedLessThanOrEqualTo(String value) {
            addCriterion("SSL_ALLOWED <=", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedLike(String value) {
            addCriterion("SSL_ALLOWED like", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedNotLike(String value) {
            addCriterion("SSL_ALLOWED not like", value, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedIn(List<String> values) {
            addCriterion("SSL_ALLOWED in", values, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedNotIn(List<String> values) {
            addCriterion("SSL_ALLOWED not in", values, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedBetween(String value1, String value2) {
            addCriterion("SSL_ALLOWED between", value1, value2, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslAllowedNotBetween(String value1, String value2) {
            addCriterion("SSL_ALLOWED not between", value1, value2, "sslAllowed");
            return (Criteria) this;
        }

        public Criteria andSslCaFileIsNull() {
            addCriterion("SSL_CA_FILE is null");
            return (Criteria) this;
        }

        public Criteria andSslCaFileIsNotNull() {
            addCriterion("SSL_CA_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andSslCaFileEqualTo(String value) {
            addCriterion("SSL_CA_FILE =", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileNotEqualTo(String value) {
            addCriterion("SSL_CA_FILE <>", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileGreaterThan(String value) {
            addCriterion("SSL_CA_FILE >", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_CA_FILE >=", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileLessThan(String value) {
            addCriterion("SSL_CA_FILE <", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileLessThanOrEqualTo(String value) {
            addCriterion("SSL_CA_FILE <=", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileLike(String value) {
            addCriterion("SSL_CA_FILE like", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileNotLike(String value) {
            addCriterion("SSL_CA_FILE not like", value, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileIn(List<String> values) {
            addCriterion("SSL_CA_FILE in", values, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileNotIn(List<String> values) {
            addCriterion("SSL_CA_FILE not in", values, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileBetween(String value1, String value2) {
            addCriterion("SSL_CA_FILE between", value1, value2, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaFileNotBetween(String value1, String value2) {
            addCriterion("SSL_CA_FILE not between", value1, value2, "sslCaFile");
            return (Criteria) this;
        }

        public Criteria andSslCaPathIsNull() {
            addCriterion("SSL_CA_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSslCaPathIsNotNull() {
            addCriterion("SSL_CA_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSslCaPathEqualTo(String value) {
            addCriterion("SSL_CA_PATH =", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathNotEqualTo(String value) {
            addCriterion("SSL_CA_PATH <>", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathGreaterThan(String value) {
            addCriterion("SSL_CA_PATH >", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_CA_PATH >=", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathLessThan(String value) {
            addCriterion("SSL_CA_PATH <", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathLessThanOrEqualTo(String value) {
            addCriterion("SSL_CA_PATH <=", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathLike(String value) {
            addCriterion("SSL_CA_PATH like", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathNotLike(String value) {
            addCriterion("SSL_CA_PATH not like", value, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathIn(List<String> values) {
            addCriterion("SSL_CA_PATH in", values, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathNotIn(List<String> values) {
            addCriterion("SSL_CA_PATH not in", values, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathBetween(String value1, String value2) {
            addCriterion("SSL_CA_PATH between", value1, value2, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCaPathNotBetween(String value1, String value2) {
            addCriterion("SSL_CA_PATH not between", value1, value2, "sslCaPath");
            return (Criteria) this;
        }

        public Criteria andSslCertificateIsNull() {
            addCriterion("SSL_CERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andSslCertificateIsNotNull() {
            addCriterion("SSL_CERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andSslCertificateEqualTo(String value) {
            addCriterion("SSL_CERTIFICATE =", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateNotEqualTo(String value) {
            addCriterion("SSL_CERTIFICATE <>", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateGreaterThan(String value) {
            addCriterion("SSL_CERTIFICATE >", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_CERTIFICATE >=", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateLessThan(String value) {
            addCriterion("SSL_CERTIFICATE <", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateLessThanOrEqualTo(String value) {
            addCriterion("SSL_CERTIFICATE <=", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateLike(String value) {
            addCriterion("SSL_CERTIFICATE like", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateNotLike(String value) {
            addCriterion("SSL_CERTIFICATE not like", value, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateIn(List<String> values) {
            addCriterion("SSL_CERTIFICATE in", values, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateNotIn(List<String> values) {
            addCriterion("SSL_CERTIFICATE not in", values, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateBetween(String value1, String value2) {
            addCriterion("SSL_CERTIFICATE between", value1, value2, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCertificateNotBetween(String value1, String value2) {
            addCriterion("SSL_CERTIFICATE not between", value1, value2, "sslCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCipherIsNull() {
            addCriterion("SSL_CIPHER is null");
            return (Criteria) this;
        }

        public Criteria andSslCipherIsNotNull() {
            addCriterion("SSL_CIPHER is not null");
            return (Criteria) this;
        }

        public Criteria andSslCipherEqualTo(String value) {
            addCriterion("SSL_CIPHER =", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotEqualTo(String value) {
            addCriterion("SSL_CIPHER <>", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherGreaterThan(String value) {
            addCriterion("SSL_CIPHER >", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_CIPHER >=", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherLessThan(String value) {
            addCriterion("SSL_CIPHER <", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherLessThanOrEqualTo(String value) {
            addCriterion("SSL_CIPHER <=", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherLike(String value) {
            addCriterion("SSL_CIPHER like", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotLike(String value) {
            addCriterion("SSL_CIPHER not like", value, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherIn(List<String> values) {
            addCriterion("SSL_CIPHER in", values, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotIn(List<String> values) {
            addCriterion("SSL_CIPHER not in", values, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherBetween(String value1, String value2) {
            addCriterion("SSL_CIPHER between", value1, value2, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslCipherNotBetween(String value1, String value2) {
            addCriterion("SSL_CIPHER not between", value1, value2, "sslCipher");
            return (Criteria) this;
        }

        public Criteria andSslKeyIsNull() {
            addCriterion("SSL_KEY is null");
            return (Criteria) this;
        }

        public Criteria andSslKeyIsNotNull() {
            addCriterion("SSL_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andSslKeyEqualTo(String value) {
            addCriterion("SSL_KEY =", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyNotEqualTo(String value) {
            addCriterion("SSL_KEY <>", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyGreaterThan(String value) {
            addCriterion("SSL_KEY >", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_KEY >=", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyLessThan(String value) {
            addCriterion("SSL_KEY <", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyLessThanOrEqualTo(String value) {
            addCriterion("SSL_KEY <=", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyLike(String value) {
            addCriterion("SSL_KEY like", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyNotLike(String value) {
            addCriterion("SSL_KEY not like", value, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyIn(List<String> values) {
            addCriterion("SSL_KEY in", values, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyNotIn(List<String> values) {
            addCriterion("SSL_KEY not in", values, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyBetween(String value1, String value2) {
            addCriterion("SSL_KEY between", value1, value2, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslKeyNotBetween(String value1, String value2) {
            addCriterion("SSL_KEY not between", value1, value2, "sslKey");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateIsNull() {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateIsNotNull() {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateEqualTo(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE =", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateNotEqualTo(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE <>", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateGreaterThan(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE >", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE >=", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateLessThan(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE <", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateLessThanOrEqualTo(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE <=", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateLike(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE like", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateNotLike(String value) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE not like", value, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateIn(List<String> values) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE in", values, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateNotIn(List<String> values) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE not in", values, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateBetween(String value1, String value2) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE between", value1, value2, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslVerifyServerCertificateNotBetween(String value1, String value2) {
            addCriterion("SSL_VERIFY_SERVER_CERTIFICATE not between", value1, value2, "sslVerifyServerCertificate");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileIsNull() {
            addCriterion("SSL_CRL_FILE is null");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileIsNotNull() {
            addCriterion("SSL_CRL_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileEqualTo(String value) {
            addCriterion("SSL_CRL_FILE =", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileNotEqualTo(String value) {
            addCriterion("SSL_CRL_FILE <>", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileGreaterThan(String value) {
            addCriterion("SSL_CRL_FILE >", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_CRL_FILE >=", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileLessThan(String value) {
            addCriterion("SSL_CRL_FILE <", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileLessThanOrEqualTo(String value) {
            addCriterion("SSL_CRL_FILE <=", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileLike(String value) {
            addCriterion("SSL_CRL_FILE like", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileNotLike(String value) {
            addCriterion("SSL_CRL_FILE not like", value, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileIn(List<String> values) {
            addCriterion("SSL_CRL_FILE in", values, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileNotIn(List<String> values) {
            addCriterion("SSL_CRL_FILE not in", values, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileBetween(String value1, String value2) {
            addCriterion("SSL_CRL_FILE between", value1, value2, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlFileNotBetween(String value1, String value2) {
            addCriterion("SSL_CRL_FILE not between", value1, value2, "sslCrlFile");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathIsNull() {
            addCriterion("SSL_CRL_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathIsNotNull() {
            addCriterion("SSL_CRL_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathEqualTo(String value) {
            addCriterion("SSL_CRL_PATH =", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathNotEqualTo(String value) {
            addCriterion("SSL_CRL_PATH <>", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathGreaterThan(String value) {
            addCriterion("SSL_CRL_PATH >", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathGreaterThanOrEqualTo(String value) {
            addCriterion("SSL_CRL_PATH >=", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathLessThan(String value) {
            addCriterion("SSL_CRL_PATH <", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathLessThanOrEqualTo(String value) {
            addCriterion("SSL_CRL_PATH <=", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathLike(String value) {
            addCriterion("SSL_CRL_PATH like", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathNotLike(String value) {
            addCriterion("SSL_CRL_PATH not like", value, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathIn(List<String> values) {
            addCriterion("SSL_CRL_PATH in", values, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathNotIn(List<String> values) {
            addCriterion("SSL_CRL_PATH not in", values, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathBetween(String value1, String value2) {
            addCriterion("SSL_CRL_PATH between", value1, value2, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andSslCrlPathNotBetween(String value1, String value2) {
            addCriterion("SSL_CRL_PATH not between", value1, value2, "sslCrlPath");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalIsNull() {
            addCriterion("CONNECTION_RETRY_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalIsNotNull() {
            addCriterion("CONNECTION_RETRY_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalEqualTo(Integer value) {
            addCriterion("CONNECTION_RETRY_INTERVAL =", value, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalNotEqualTo(Integer value) {
            addCriterion("CONNECTION_RETRY_INTERVAL <>", value, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalGreaterThan(Integer value) {
            addCriterion("CONNECTION_RETRY_INTERVAL >", value, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONNECTION_RETRY_INTERVAL >=", value, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalLessThan(Integer value) {
            addCriterion("CONNECTION_RETRY_INTERVAL <", value, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("CONNECTION_RETRY_INTERVAL <=", value, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalIn(List<Integer> values) {
            addCriterion("CONNECTION_RETRY_INTERVAL in", values, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalNotIn(List<Integer> values) {
            addCriterion("CONNECTION_RETRY_INTERVAL not in", values, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalBetween(Integer value1, Integer value2) {
            addCriterion("CONNECTION_RETRY_INTERVAL between", value1, value2, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("CONNECTION_RETRY_INTERVAL not between", value1, value2, "connectionRetryInterval");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountIsNull() {
            addCriterion("CONNECTION_RETRY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountIsNotNull() {
            addCriterion("CONNECTION_RETRY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountEqualTo(Long value) {
            addCriterion("CONNECTION_RETRY_COUNT =", value, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountNotEqualTo(Long value) {
            addCriterion("CONNECTION_RETRY_COUNT <>", value, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountGreaterThan(Long value) {
            addCriterion("CONNECTION_RETRY_COUNT >", value, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountGreaterThanOrEqualTo(Long value) {
            addCriterion("CONNECTION_RETRY_COUNT >=", value, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountLessThan(Long value) {
            addCriterion("CONNECTION_RETRY_COUNT <", value, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountLessThanOrEqualTo(Long value) {
            addCriterion("CONNECTION_RETRY_COUNT <=", value, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountIn(List<Long> values) {
            addCriterion("CONNECTION_RETRY_COUNT in", values, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountNotIn(List<Long> values) {
            addCriterion("CONNECTION_RETRY_COUNT not in", values, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountBetween(Long value1, Long value2) {
            addCriterion("CONNECTION_RETRY_COUNT between", value1, value2, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andConnectionRetryCountNotBetween(Long value1, Long value2) {
            addCriterion("CONNECTION_RETRY_COUNT not between", value1, value2, "connectionRetryCount");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalIsNull() {
            addCriterion("HEARTBEAT_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalIsNotNull() {
            addCriterion("HEARTBEAT_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalEqualTo(Double value) {
            addCriterion("HEARTBEAT_INTERVAL =", value, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalNotEqualTo(Double value) {
            addCriterion("HEARTBEAT_INTERVAL <>", value, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalGreaterThan(Double value) {
            addCriterion("HEARTBEAT_INTERVAL >", value, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalGreaterThanOrEqualTo(Double value) {
            addCriterion("HEARTBEAT_INTERVAL >=", value, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalLessThan(Double value) {
            addCriterion("HEARTBEAT_INTERVAL <", value, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalLessThanOrEqualTo(Double value) {
            addCriterion("HEARTBEAT_INTERVAL <=", value, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalIn(List<Double> values) {
            addCriterion("HEARTBEAT_INTERVAL in", values, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalNotIn(List<Double> values) {
            addCriterion("HEARTBEAT_INTERVAL not in", values, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalBetween(Double value1, Double value2) {
            addCriterion("HEARTBEAT_INTERVAL between", value1, value2, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIntervalNotBetween(Double value1, Double value2) {
            addCriterion("HEARTBEAT_INTERVAL not between", value1, value2, "heartbeatInterval");
            return (Criteria) this;
        }

        public Criteria andTlsVersionIsNull() {
            addCriterion("TLS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andTlsVersionIsNotNull() {
            addCriterion("TLS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andTlsVersionEqualTo(String value) {
            addCriterion("TLS_VERSION =", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionNotEqualTo(String value) {
            addCriterion("TLS_VERSION <>", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionGreaterThan(String value) {
            addCriterion("TLS_VERSION >", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("TLS_VERSION >=", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionLessThan(String value) {
            addCriterion("TLS_VERSION <", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionLessThanOrEqualTo(String value) {
            addCriterion("TLS_VERSION <=", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionLike(String value) {
            addCriterion("TLS_VERSION like", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionNotLike(String value) {
            addCriterion("TLS_VERSION not like", value, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionIn(List<String> values) {
            addCriterion("TLS_VERSION in", values, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionNotIn(List<String> values) {
            addCriterion("TLS_VERSION not in", values, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionBetween(String value1, String value2) {
            addCriterion("TLS_VERSION between", value1, value2, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andTlsVersionNotBetween(String value1, String value2) {
            addCriterion("TLS_VERSION not between", value1, value2, "tlsVersion");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathIsNull() {
            addCriterion("PUBLIC_KEY_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathIsNotNull() {
            addCriterion("PUBLIC_KEY_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathEqualTo(String value) {
            addCriterion("PUBLIC_KEY_PATH =", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathNotEqualTo(String value) {
            addCriterion("PUBLIC_KEY_PATH <>", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathGreaterThan(String value) {
            addCriterion("PUBLIC_KEY_PATH >", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY_PATH >=", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathLessThan(String value) {
            addCriterion("PUBLIC_KEY_PATH <", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_KEY_PATH <=", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathLike(String value) {
            addCriterion("PUBLIC_KEY_PATH like", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathNotLike(String value) {
            addCriterion("PUBLIC_KEY_PATH not like", value, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathIn(List<String> values) {
            addCriterion("PUBLIC_KEY_PATH in", values, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathNotIn(List<String> values) {
            addCriterion("PUBLIC_KEY_PATH not in", values, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY_PATH between", value1, value2, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andPublicKeyPathNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_KEY_PATH not between", value1, value2, "publicKeyPath");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyIsNull() {
            addCriterion("GET_PUBLIC_KEY is null");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyIsNotNull() {
            addCriterion("GET_PUBLIC_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyEqualTo(String value) {
            addCriterion("GET_PUBLIC_KEY =", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyNotEqualTo(String value) {
            addCriterion("GET_PUBLIC_KEY <>", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyGreaterThan(String value) {
            addCriterion("GET_PUBLIC_KEY >", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("GET_PUBLIC_KEY >=", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyLessThan(String value) {
            addCriterion("GET_PUBLIC_KEY <", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("GET_PUBLIC_KEY <=", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyLike(String value) {
            addCriterion("GET_PUBLIC_KEY like", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyNotLike(String value) {
            addCriterion("GET_PUBLIC_KEY not like", value, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyIn(List<String> values) {
            addCriterion("GET_PUBLIC_KEY in", values, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyNotIn(List<String> values) {
            addCriterion("GET_PUBLIC_KEY not in", values, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyBetween(String value1, String value2) {
            addCriterion("GET_PUBLIC_KEY between", value1, value2, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andGetPublicKeyNotBetween(String value1, String value2) {
            addCriterion("GET_PUBLIC_KEY not between", value1, value2, "getPublicKey");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceIsNull() {
            addCriterion("NETWORK_NAMESPACE is null");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceIsNotNull() {
            addCriterion("NETWORK_NAMESPACE is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceEqualTo(String value) {
            addCriterion("NETWORK_NAMESPACE =", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotEqualTo(String value) {
            addCriterion("NETWORK_NAMESPACE <>", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceGreaterThan(String value) {
            addCriterion("NETWORK_NAMESPACE >", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceGreaterThanOrEqualTo(String value) {
            addCriterion("NETWORK_NAMESPACE >=", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceLessThan(String value) {
            addCriterion("NETWORK_NAMESPACE <", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceLessThanOrEqualTo(String value) {
            addCriterion("NETWORK_NAMESPACE <=", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceLike(String value) {
            addCriterion("NETWORK_NAMESPACE like", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotLike(String value) {
            addCriterion("NETWORK_NAMESPACE not like", value, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceIn(List<String> values) {
            addCriterion("NETWORK_NAMESPACE in", values, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotIn(List<String> values) {
            addCriterion("NETWORK_NAMESPACE not in", values, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceBetween(String value1, String value2) {
            addCriterion("NETWORK_NAMESPACE between", value1, value2, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andNetworkNamespaceNotBetween(String value1, String value2) {
            addCriterion("NETWORK_NAMESPACE not between", value1, value2, "networkNamespace");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmIsNull() {
            addCriterion("COMPRESSION_ALGORITHM is null");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmIsNotNull() {
            addCriterion("COMPRESSION_ALGORITHM is not null");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmEqualTo(String value) {
            addCriterion("COMPRESSION_ALGORITHM =", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmNotEqualTo(String value) {
            addCriterion("COMPRESSION_ALGORITHM <>", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmGreaterThan(String value) {
            addCriterion("COMPRESSION_ALGORITHM >", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("COMPRESSION_ALGORITHM >=", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmLessThan(String value) {
            addCriterion("COMPRESSION_ALGORITHM <", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("COMPRESSION_ALGORITHM <=", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmLike(String value) {
            addCriterion("COMPRESSION_ALGORITHM like", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmNotLike(String value) {
            addCriterion("COMPRESSION_ALGORITHM not like", value, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmIn(List<String> values) {
            addCriterion("COMPRESSION_ALGORITHM in", values, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmNotIn(List<String> values) {
            addCriterion("COMPRESSION_ALGORITHM not in", values, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmBetween(String value1, String value2) {
            addCriterion("COMPRESSION_ALGORITHM between", value1, value2, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andCompressionAlgorithmNotBetween(String value1, String value2) {
            addCriterion("COMPRESSION_ALGORITHM not between", value1, value2, "compressionAlgorithm");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelIsNull() {
            addCriterion("ZSTD_COMPRESSION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelIsNotNull() {
            addCriterion("ZSTD_COMPRESSION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelEqualTo(Integer value) {
            addCriterion("ZSTD_COMPRESSION_LEVEL =", value, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelNotEqualTo(Integer value) {
            addCriterion("ZSTD_COMPRESSION_LEVEL <>", value, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelGreaterThan(Integer value) {
            addCriterion("ZSTD_COMPRESSION_LEVEL >", value, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZSTD_COMPRESSION_LEVEL >=", value, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelLessThan(Integer value) {
            addCriterion("ZSTD_COMPRESSION_LEVEL <", value, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelLessThanOrEqualTo(Integer value) {
            addCriterion("ZSTD_COMPRESSION_LEVEL <=", value, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelIn(List<Integer> values) {
            addCriterion("ZSTD_COMPRESSION_LEVEL in", values, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelNotIn(List<Integer> values) {
            addCriterion("ZSTD_COMPRESSION_LEVEL not in", values, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelBetween(Integer value1, Integer value2) {
            addCriterion("ZSTD_COMPRESSION_LEVEL between", value1, value2, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andZstdCompressionLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ZSTD_COMPRESSION_LEVEL not between", value1, value2, "zstdCompressionLevel");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverIsNull() {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER is null");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverIsNotNull() {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER is not null");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverEqualTo(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER =", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverNotEqualTo(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER <>", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverGreaterThan(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER >", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER >=", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverLessThan(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER <", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER <=", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverLike(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER like", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverNotLike(String value) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER not like", value, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverIn(List<String> values) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER in", values, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverNotIn(List<String> values) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER not in", values, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverBetween(String value1, String value2) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER between", value1, value2, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andSourceConnectionAutoFailoverNotBetween(String value1, String value2) {
            addCriterion("SOURCE_CONNECTION_AUTO_FAILOVER not between", value1, value2, "sourceConnectionAutoFailover");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyIsNull() {
            addCriterion("GTID_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyIsNotNull() {
            addCriterion("GTID_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyEqualTo(String value) {
            addCriterion("GTID_ONLY =", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyNotEqualTo(String value) {
            addCriterion("GTID_ONLY <>", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyGreaterThan(String value) {
            addCriterion("GTID_ONLY >", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyGreaterThanOrEqualTo(String value) {
            addCriterion("GTID_ONLY >=", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyLessThan(String value) {
            addCriterion("GTID_ONLY <", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyLessThanOrEqualTo(String value) {
            addCriterion("GTID_ONLY <=", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyLike(String value) {
            addCriterion("GTID_ONLY like", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyNotLike(String value) {
            addCriterion("GTID_ONLY not like", value, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyIn(List<String> values) {
            addCriterion("GTID_ONLY in", values, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyNotIn(List<String> values) {
            addCriterion("GTID_ONLY not in", values, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyBetween(String value1, String value2) {
            addCriterion("GTID_ONLY between", value1, value2, "gtidOnly");
            return (Criteria) this;
        }

        public Criteria andGtidOnlyNotBetween(String value1, String value2) {
            addCriterion("GTID_ONLY not between", value1, value2, "gtidOnly");
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