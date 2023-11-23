package cn.wwinter.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SchemaTableStatisticsWithBuffer implements Serializable {
    private String tableSchema;

    private String tableName;

    private Long rowsFetched;

    private String fetchLatency;

    private Long rowsInserted;

    private String insertLatency;

    private Long rowsUpdated;

    private String updateLatency;

    private Long rowsDeleted;

    private String deleteLatency;

    private BigDecimal ioReadRequests;

    private String ioRead;

    private String ioReadLatency;

    private BigDecimal ioWriteRequests;

    private String ioWrite;

    private String ioWriteLatency;

    private BigDecimal ioMiscRequests;

    private String ioMiscLatency;

    private String innodbBufferAllocated;

    private String innodbBufferData;

    private String innodbBufferFree;

    private Long innodbBufferPages;

    private Long innodbBufferPagesHashed;

    private Long innodbBufferPagesOld;

    private BigDecimal innodbBufferRowsCached;

    private static final long serialVersionUID = 1L;

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getRowsFetched() {
        return rowsFetched;
    }

    public void setRowsFetched(Long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    public String getFetchLatency() {
        return fetchLatency;
    }

    public void setFetchLatency(String fetchLatency) {
        this.fetchLatency = fetchLatency;
    }

    public Long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency;
    }

    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency;
    }

    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    public BigDecimal getIoReadRequests() {
        return ioReadRequests;
    }

    public void setIoReadRequests(BigDecimal ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    public String getIoRead() {
        return ioRead;
    }

    public void setIoRead(String ioRead) {
        this.ioRead = ioRead;
    }

    public String getIoReadLatency() {
        return ioReadLatency;
    }

    public void setIoReadLatency(String ioReadLatency) {
        this.ioReadLatency = ioReadLatency;
    }

    public BigDecimal getIoWriteRequests() {
        return ioWriteRequests;
    }

    public void setIoWriteRequests(BigDecimal ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    public String getIoWrite() {
        return ioWrite;
    }

    public void setIoWrite(String ioWrite) {
        this.ioWrite = ioWrite;
    }

    public String getIoWriteLatency() {
        return ioWriteLatency;
    }

    public void setIoWriteLatency(String ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency;
    }

    public BigDecimal getIoMiscRequests() {
        return ioMiscRequests;
    }

    public void setIoMiscRequests(BigDecimal ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    public String getIoMiscLatency() {
        return ioMiscLatency;
    }

    public void setIoMiscLatency(String ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency;
    }

    public String getInnodbBufferAllocated() {
        return innodbBufferAllocated;
    }

    public void setInnodbBufferAllocated(String innodbBufferAllocated) {
        this.innodbBufferAllocated = innodbBufferAllocated;
    }

    public String getInnodbBufferData() {
        return innodbBufferData;
    }

    public void setInnodbBufferData(String innodbBufferData) {
        this.innodbBufferData = innodbBufferData;
    }

    public String getInnodbBufferFree() {
        return innodbBufferFree;
    }

    public void setInnodbBufferFree(String innodbBufferFree) {
        this.innodbBufferFree = innodbBufferFree;
    }

    public Long getInnodbBufferPages() {
        return innodbBufferPages;
    }

    public void setInnodbBufferPages(Long innodbBufferPages) {
        this.innodbBufferPages = innodbBufferPages;
    }

    public Long getInnodbBufferPagesHashed() {
        return innodbBufferPagesHashed;
    }

    public void setInnodbBufferPagesHashed(Long innodbBufferPagesHashed) {
        this.innodbBufferPagesHashed = innodbBufferPagesHashed;
    }

    public Long getInnodbBufferPagesOld() {
        return innodbBufferPagesOld;
    }

    public void setInnodbBufferPagesOld(Long innodbBufferPagesOld) {
        this.innodbBufferPagesOld = innodbBufferPagesOld;
    }

    public BigDecimal getInnodbBufferRowsCached() {
        return innodbBufferRowsCached;
    }

    public void setInnodbBufferRowsCached(BigDecimal innodbBufferRowsCached) {
        this.innodbBufferRowsCached = innodbBufferRowsCached;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", rowsFetched=").append(rowsFetched);
        sb.append(", fetchLatency=").append(fetchLatency);
        sb.append(", rowsInserted=").append(rowsInserted);
        sb.append(", insertLatency=").append(insertLatency);
        sb.append(", rowsUpdated=").append(rowsUpdated);
        sb.append(", updateLatency=").append(updateLatency);
        sb.append(", rowsDeleted=").append(rowsDeleted);
        sb.append(", deleteLatency=").append(deleteLatency);
        sb.append(", ioReadRequests=").append(ioReadRequests);
        sb.append(", ioRead=").append(ioRead);
        sb.append(", ioReadLatency=").append(ioReadLatency);
        sb.append(", ioWriteRequests=").append(ioWriteRequests);
        sb.append(", ioWrite=").append(ioWrite);
        sb.append(", ioWriteLatency=").append(ioWriteLatency);
        sb.append(", ioMiscRequests=").append(ioMiscRequests);
        sb.append(", ioMiscLatency=").append(ioMiscLatency);
        sb.append(", innodbBufferAllocated=").append(innodbBufferAllocated);
        sb.append(", innodbBufferData=").append(innodbBufferData);
        sb.append(", innodbBufferFree=").append(innodbBufferFree);
        sb.append(", innodbBufferPages=").append(innodbBufferPages);
        sb.append(", innodbBufferPagesHashed=").append(innodbBufferPagesHashed);
        sb.append(", innodbBufferPagesOld=").append(innodbBufferPagesOld);
        sb.append(", innodbBufferRowsCached=").append(innodbBufferRowsCached);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}