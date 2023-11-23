package cn.wwinter.model;

import java.io.Serializable;

public class MetadataLocks implements Serializable {
    private Long objectInstanceBegin;

    private String objectType;

    private String objectSchema;

    private String objectName;

    private String columnName;

    private String lockType;

    private String lockDuration;

    private String lockStatus;

    private String source;

    private Long ownerThreadId;

    private Long ownerEventId;

    private static final long serialVersionUID = 1L;

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public String getLockDuration() {
        return lockDuration;
    }

    public void setLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
    }

    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    public Long getOwnerEventId() {
        return ownerEventId;
    }

    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", objectType=").append(objectType);
        sb.append(", objectSchema=").append(objectSchema);
        sb.append(", objectName=").append(objectName);
        sb.append(", columnName=").append(columnName);
        sb.append(", lockType=").append(lockType);
        sb.append(", lockDuration=").append(lockDuration);
        sb.append(", lockStatus=").append(lockStatus);
        sb.append(", source=").append(source);
        sb.append(", ownerThreadId=").append(ownerThreadId);
        sb.append(", ownerEventId=").append(ownerEventId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}