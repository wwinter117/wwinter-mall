package cn.wwinter.model;

import java.io.Serializable;

public class InnodbRedoLogFiles implements Serializable {
    private Long fileId;

    private String fileName;

    private Long startLsn;

    private Long endLsn;

    private Long sizeInBytes;

    private Byte isFull;

    private Integer consumerLevel;

    private static final long serialVersionUID = 1L;

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getStartLsn() {
        return startLsn;
    }

    public void setStartLsn(Long startLsn) {
        this.startLsn = startLsn;
    }

    public Long getEndLsn() {
        return endLsn;
    }

    public void setEndLsn(Long endLsn) {
        this.endLsn = endLsn;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public Byte getIsFull() {
        return isFull;
    }

    public void setIsFull(Byte isFull) {
        this.isFull = isFull;
    }

    public Integer getConsumerLevel() {
        return consumerLevel;
    }

    public void setConsumerLevel(Integer consumerLevel) {
        this.consumerLevel = consumerLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileId=").append(fileId);
        sb.append(", fileName=").append(fileName);
        sb.append(", startLsn=").append(startLsn);
        sb.append(", endLsn=").append(endLsn);
        sb.append(", sizeInBytes=").append(sizeInBytes);
        sb.append(", isFull=").append(isFull);
        sb.append(", consumerLevel=").append(consumerLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}