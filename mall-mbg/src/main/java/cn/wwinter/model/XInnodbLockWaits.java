package cn.wwinter.model;

import java.io.Serializable;
import java.util.Date;

public class XInnodbLockWaits implements Serializable {
    private Date waitStarted;

    private Date waitAge;

    private Long waitAgeSecs;

    private String lockedTableSchema;

    private String lockedTableName;

    private String lockedTablePartition;

    private String lockedTableSubpartition;

    private String lockedIndex;

    private String lockedType;

    private Long waitingTrxId;

    private Date waitingTrxStarted;

    private Date waitingTrxAge;

    private Long waitingTrxRowsLocked;

    private Long waitingTrxRowsModified;

    private Long waitingPid;

    private String waitingQuery;

    private String waitingLockId;

    private String waitingLockMode;

    private Long blockingTrxId;

    private Long blockingPid;

    private String blockingQuery;

    private String blockingLockId;

    private String blockingLockMode;

    private Date blockingTrxStarted;

    private Date blockingTrxAge;

    private Long blockingTrxRowsLocked;

    private Long blockingTrxRowsModified;

    private String sqlKillBlockingQuery;

    private String sqlKillBlockingConnection;

    private String lockedTable;

    private static final long serialVersionUID = 1L;

    public Date getWaitStarted() {
        return waitStarted;
    }

    public void setWaitStarted(Date waitStarted) {
        this.waitStarted = waitStarted;
    }

    public Date getWaitAge() {
        return waitAge;
    }

    public void setWaitAge(Date waitAge) {
        this.waitAge = waitAge;
    }

    public Long getWaitAgeSecs() {
        return waitAgeSecs;
    }

    public void setWaitAgeSecs(Long waitAgeSecs) {
        this.waitAgeSecs = waitAgeSecs;
    }

    public String getLockedTableSchema() {
        return lockedTableSchema;
    }

    public void setLockedTableSchema(String lockedTableSchema) {
        this.lockedTableSchema = lockedTableSchema;
    }

    public String getLockedTableName() {
        return lockedTableName;
    }

    public void setLockedTableName(String lockedTableName) {
        this.lockedTableName = lockedTableName;
    }

    public String getLockedTablePartition() {
        return lockedTablePartition;
    }

    public void setLockedTablePartition(String lockedTablePartition) {
        this.lockedTablePartition = lockedTablePartition;
    }

    public String getLockedTableSubpartition() {
        return lockedTableSubpartition;
    }

    public void setLockedTableSubpartition(String lockedTableSubpartition) {
        this.lockedTableSubpartition = lockedTableSubpartition;
    }

    public String getLockedIndex() {
        return lockedIndex;
    }

    public void setLockedIndex(String lockedIndex) {
        this.lockedIndex = lockedIndex;
    }

    public String getLockedType() {
        return lockedType;
    }

    public void setLockedType(String lockedType) {
        this.lockedType = lockedType;
    }

    public Long getWaitingTrxId() {
        return waitingTrxId;
    }

    public void setWaitingTrxId(Long waitingTrxId) {
        this.waitingTrxId = waitingTrxId;
    }

    public Date getWaitingTrxStarted() {
        return waitingTrxStarted;
    }

    public void setWaitingTrxStarted(Date waitingTrxStarted) {
        this.waitingTrxStarted = waitingTrxStarted;
    }

    public Date getWaitingTrxAge() {
        return waitingTrxAge;
    }

    public void setWaitingTrxAge(Date waitingTrxAge) {
        this.waitingTrxAge = waitingTrxAge;
    }

    public Long getWaitingTrxRowsLocked() {
        return waitingTrxRowsLocked;
    }

    public void setWaitingTrxRowsLocked(Long waitingTrxRowsLocked) {
        this.waitingTrxRowsLocked = waitingTrxRowsLocked;
    }

    public Long getWaitingTrxRowsModified() {
        return waitingTrxRowsModified;
    }

    public void setWaitingTrxRowsModified(Long waitingTrxRowsModified) {
        this.waitingTrxRowsModified = waitingTrxRowsModified;
    }

    public Long getWaitingPid() {
        return waitingPid;
    }

    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    public String getWaitingQuery() {
        return waitingQuery;
    }

    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery;
    }

    public String getWaitingLockId() {
        return waitingLockId;
    }

    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    public String getWaitingLockMode() {
        return waitingLockMode;
    }

    public void setWaitingLockMode(String waitingLockMode) {
        this.waitingLockMode = waitingLockMode;
    }

    public Long getBlockingTrxId() {
        return blockingTrxId;
    }

    public void setBlockingTrxId(Long blockingTrxId) {
        this.blockingTrxId = blockingTrxId;
    }

    public Long getBlockingPid() {
        return blockingPid;
    }

    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    public String getBlockingQuery() {
        return blockingQuery;
    }

    public void setBlockingQuery(String blockingQuery) {
        this.blockingQuery = blockingQuery;
    }

    public String getBlockingLockId() {
        return blockingLockId;
    }

    public void setBlockingLockId(String blockingLockId) {
        this.blockingLockId = blockingLockId;
    }

    public String getBlockingLockMode() {
        return blockingLockMode;
    }

    public void setBlockingLockMode(String blockingLockMode) {
        this.blockingLockMode = blockingLockMode;
    }

    public Date getBlockingTrxStarted() {
        return blockingTrxStarted;
    }

    public void setBlockingTrxStarted(Date blockingTrxStarted) {
        this.blockingTrxStarted = blockingTrxStarted;
    }

    public Date getBlockingTrxAge() {
        return blockingTrxAge;
    }

    public void setBlockingTrxAge(Date blockingTrxAge) {
        this.blockingTrxAge = blockingTrxAge;
    }

    public Long getBlockingTrxRowsLocked() {
        return blockingTrxRowsLocked;
    }

    public void setBlockingTrxRowsLocked(Long blockingTrxRowsLocked) {
        this.blockingTrxRowsLocked = blockingTrxRowsLocked;
    }

    public Long getBlockingTrxRowsModified() {
        return blockingTrxRowsModified;
    }

    public void setBlockingTrxRowsModified(Long blockingTrxRowsModified) {
        this.blockingTrxRowsModified = blockingTrxRowsModified;
    }

    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery;
    }

    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection;
    }

    public String getLockedTable() {
        return lockedTable;
    }

    public void setLockedTable(String lockedTable) {
        this.lockedTable = lockedTable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", waitStarted=").append(waitStarted);
        sb.append(", waitAge=").append(waitAge);
        sb.append(", waitAgeSecs=").append(waitAgeSecs);
        sb.append(", lockedTableSchema=").append(lockedTableSchema);
        sb.append(", lockedTableName=").append(lockedTableName);
        sb.append(", lockedTablePartition=").append(lockedTablePartition);
        sb.append(", lockedTableSubpartition=").append(lockedTableSubpartition);
        sb.append(", lockedIndex=").append(lockedIndex);
        sb.append(", lockedType=").append(lockedType);
        sb.append(", waitingTrxId=").append(waitingTrxId);
        sb.append(", waitingTrxStarted=").append(waitingTrxStarted);
        sb.append(", waitingTrxAge=").append(waitingTrxAge);
        sb.append(", waitingTrxRowsLocked=").append(waitingTrxRowsLocked);
        sb.append(", waitingTrxRowsModified=").append(waitingTrxRowsModified);
        sb.append(", waitingPid=").append(waitingPid);
        sb.append(", waitingQuery=").append(waitingQuery);
        sb.append(", waitingLockId=").append(waitingLockId);
        sb.append(", waitingLockMode=").append(waitingLockMode);
        sb.append(", blockingTrxId=").append(blockingTrxId);
        sb.append(", blockingPid=").append(blockingPid);
        sb.append(", blockingQuery=").append(blockingQuery);
        sb.append(", blockingLockId=").append(blockingLockId);
        sb.append(", blockingLockMode=").append(blockingLockMode);
        sb.append(", blockingTrxStarted=").append(blockingTrxStarted);
        sb.append(", blockingTrxAge=").append(blockingTrxAge);
        sb.append(", blockingTrxRowsLocked=").append(blockingTrxRowsLocked);
        sb.append(", blockingTrxRowsModified=").append(blockingTrxRowsModified);
        sb.append(", sqlKillBlockingQuery=").append(sqlKillBlockingQuery);
        sb.append(", sqlKillBlockingConnection=").append(sqlKillBlockingConnection);
        sb.append(", lockedTable=").append(lockedTable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}