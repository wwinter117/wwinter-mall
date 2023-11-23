package cn.wwinter.model;

import java.io.Serializable;

public class DataLocks implements Serializable {
    private String engineLockId;

    private String engine;

    private Long engineTransactionId;

    private Long threadId;

    private Long eventId;

    private String objectSchema;

    private String objectName;

    private String partitionName;

    private String subpartitionName;

    private String indexName;

    private Long objectInstanceBegin;

    private String lockType;

    private String lockMode;

    private String lockStatus;

    private String lockData;

    private static final long serialVersionUID = 1L;

    public String getEngineLockId() {
        return engineLockId;
    }

    public void setEngineLockId(String engineLockId) {
        this.engineLockId = engineLockId;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Long getEngineTransactionId() {
        return engineTransactionId;
    }

    public void setEngineTransactionId(Long engineTransactionId) {
        this.engineTransactionId = engineTransactionId;
    }

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getObjectSchema() {
        return objectSchema;
    }

    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getPartitionName() {
        return partitionName;
    }

    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    public String getSubpartitionName() {
        return subpartitionName;
    }

    public void setSubpartitionName(String subpartitionName) {
        this.subpartitionName = subpartitionName;
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getLockData() {
        return lockData;
    }

    public void setLockData(String lockData) {
        this.lockData = lockData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", engineLockId=").append(engineLockId);
        sb.append(", engine=").append(engine);
        sb.append(", engineTransactionId=").append(engineTransactionId);
        sb.append(", threadId=").append(threadId);
        sb.append(", eventId=").append(eventId);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", partitionName=").append(partitionName);
        sb.append(", subpartitionName=").append(subpartitionName);
        sb.append(", indexName=").append(indexName);
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", lockType=").append(lockType);
        sb.append(", lockMode=").append(lockMode);
        sb.append(", lockStatus=").append(lockStatus);
        sb.append(", lockData=").append(lockData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}