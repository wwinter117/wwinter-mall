package cn.wwinter.model;

import java.io.Serializable;

public class SlaveMasterInfo implements Serializable {
    private String channelName;

    private Integer numberOfLines;

    private Long masterLogPos;

    private String host;

    private Integer port;

    private Integer connectRetry;

    private Boolean enabledSsl;

    private Boolean sslVerifyServerCert;

    private Float heartbeat;

    private Long retryCount;

    private Boolean enabledAutoPosition;

    private Boolean getPublicKey;

    private String masterCompressionAlgorithm;

    private Integer masterZstdCompressionLevel;

    private Boolean sourceConnectionAutoFailover;

    private Boolean gtidOnly;

    private String masterLogName;

    private String userName;

    private String userPassword;

    private String sslCa;

    private String sslCapath;

    private String sslCert;

    private String sslCipher;

    private String sslKey;

    private String bind;

    private String ignoredServerIds;

    private String uuid;

    private String sslCrl;

    private String sslCrlpath;

    private String tlsVersion;

    private String publicKeyPath;

    private String networkNamespace;

    private String tlsCiphersuites;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getNumberOfLines() {
        return numberOfLines;
    }

    public void setNumberOfLines(Integer numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    public Long getMasterLogPos() {
        return masterLogPos;
    }

    public void setMasterLogPos(Long masterLogPos) {
        this.masterLogPos = masterLogPos;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getConnectRetry() {
        return connectRetry;
    }

    public void setConnectRetry(Integer connectRetry) {
        this.connectRetry = connectRetry;
    }

    public Boolean getEnabledSsl() {
        return enabledSsl;
    }

    public void setEnabledSsl(Boolean enabledSsl) {
        this.enabledSsl = enabledSsl;
    }

    public Boolean getSslVerifyServerCert() {
        return sslVerifyServerCert;
    }

    public void setSslVerifyServerCert(Boolean sslVerifyServerCert) {
        this.sslVerifyServerCert = sslVerifyServerCert;
    }

    public Float getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(Float heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Long getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Long retryCount) {
        this.retryCount = retryCount;
    }

    public Boolean getEnabledAutoPosition() {
        return enabledAutoPosition;
    }

    public void setEnabledAutoPosition(Boolean enabledAutoPosition) {
        this.enabledAutoPosition = enabledAutoPosition;
    }

    public Boolean getGetPublicKey() {
        return getPublicKey;
    }

    public void setGetPublicKey(Boolean getPublicKey) {
        this.getPublicKey = getPublicKey;
    }

    public String getMasterCompressionAlgorithm() {
        return masterCompressionAlgorithm;
    }

    public void setMasterCompressionAlgorithm(String masterCompressionAlgorithm) {
        this.masterCompressionAlgorithm = masterCompressionAlgorithm;
    }

    public Integer getMasterZstdCompressionLevel() {
        return masterZstdCompressionLevel;
    }

    public void setMasterZstdCompressionLevel(Integer masterZstdCompressionLevel) {
        this.masterZstdCompressionLevel = masterZstdCompressionLevel;
    }

    public Boolean getSourceConnectionAutoFailover() {
        return sourceConnectionAutoFailover;
    }

    public void setSourceConnectionAutoFailover(Boolean sourceConnectionAutoFailover) {
        this.sourceConnectionAutoFailover = sourceConnectionAutoFailover;
    }

    public Boolean getGtidOnly() {
        return gtidOnly;
    }

    public void setGtidOnly(Boolean gtidOnly) {
        this.gtidOnly = gtidOnly;
    }

    public String getMasterLogName() {
        return masterLogName;
    }

    public void setMasterLogName(String masterLogName) {
        this.masterLogName = masterLogName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getSslCa() {
        return sslCa;
    }

    public void setSslCa(String sslCa) {
        this.sslCa = sslCa;
    }

    public String getSslCapath() {
        return sslCapath;
    }

    public void setSslCapath(String sslCapath) {
        this.sslCapath = sslCapath;
    }

    public String getSslCert() {
        return sslCert;
    }

    public void setSslCert(String sslCert) {
        this.sslCert = sslCert;
    }

    public String getSslCipher() {
        return sslCipher;
    }

    public void setSslCipher(String sslCipher) {
        this.sslCipher = sslCipher;
    }

    public String getSslKey() {
        return sslKey;
    }

    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    public String getIgnoredServerIds() {
        return ignoredServerIds;
    }

    public void setIgnoredServerIds(String ignoredServerIds) {
        this.ignoredServerIds = ignoredServerIds;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSslCrl() {
        return sslCrl;
    }

    public void setSslCrl(String sslCrl) {
        this.sslCrl = sslCrl;
    }

    public String getSslCrlpath() {
        return sslCrlpath;
    }

    public void setSslCrlpath(String sslCrlpath) {
        this.sslCrlpath = sslCrlpath;
    }

    public String getTlsVersion() {
        return tlsVersion;
    }

    public void setTlsVersion(String tlsVersion) {
        this.tlsVersion = tlsVersion;
    }

    public String getPublicKeyPath() {
        return publicKeyPath;
    }

    public void setPublicKeyPath(String publicKeyPath) {
        this.publicKeyPath = publicKeyPath;
    }

    public String getNetworkNamespace() {
        return networkNamespace;
    }

    public void setNetworkNamespace(String networkNamespace) {
        this.networkNamespace = networkNamespace;
    }

    public String getTlsCiphersuites() {
        return tlsCiphersuites;
    }

    public void setTlsCiphersuites(String tlsCiphersuites) {
        this.tlsCiphersuites = tlsCiphersuites;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", numberOfLines=").append(numberOfLines);
        sb.append(", masterLogPos=").append(masterLogPos);
        sb.append(", host=").append(host);
        sb.append(", port=").append(port);
        sb.append(", connectRetry=").append(connectRetry);
        sb.append(", enabledSsl=").append(enabledSsl);
        sb.append(", sslVerifyServerCert=").append(sslVerifyServerCert);
        sb.append(", heartbeat=").append(heartbeat);
        sb.append(", retryCount=").append(retryCount);
        sb.append(", enabledAutoPosition=").append(enabledAutoPosition);
        sb.append(", getPublicKey=").append(getPublicKey);
        sb.append(", masterCompressionAlgorithm=").append(masterCompressionAlgorithm);
        sb.append(", masterZstdCompressionLevel=").append(masterZstdCompressionLevel);
        sb.append(", sourceConnectionAutoFailover=").append(sourceConnectionAutoFailover);
        sb.append(", gtidOnly=").append(gtidOnly);
        sb.append(", masterLogName=").append(masterLogName);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", sslCa=").append(sslCa);
        sb.append(", sslCapath=").append(sslCapath);
        sb.append(", sslCert=").append(sslCert);
        sb.append(", sslCipher=").append(sslCipher);
        sb.append(", sslKey=").append(sslKey);
        sb.append(", bind=").append(bind);
        sb.append(", ignoredServerIds=").append(ignoredServerIds);
        sb.append(", uuid=").append(uuid);
        sb.append(", sslCrl=").append(sslCrl);
        sb.append(", sslCrlpath=").append(sslCrlpath);
        sb.append(", tlsVersion=").append(tlsVersion);
        sb.append(", publicKeyPath=").append(publicKeyPath);
        sb.append(", networkNamespace=").append(networkNamespace);
        sb.append(", tlsCiphersuites=").append(tlsCiphersuites);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}