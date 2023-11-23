package cn.wwinter.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class HostSummaryByStatementLatency implements Serializable {
    private String host;

    private BigDecimal total;

    private String totalLatency;

    private String maxLatency;

    private String lockLatency;

    private String cpuLatency;

    private BigDecimal rowsSent;

    private BigDecimal rowsExamined;

    private BigDecimal rowsAffected;

    private BigDecimal fullScans;

    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getTotalLatency() {
        return totalLatency;
    }

    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    public String getMaxLatency() {
        return maxLatency;
    }

    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    public String getLockLatency() {
        return lockLatency;
    }

    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    public String getCpuLatency() {
        return cpuLatency;
    }

    public void setCpuLatency(String cpuLatency) {
        this.cpuLatency = cpuLatency;
    }

    public BigDecimal getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(BigDecimal rowsSent) {
        this.rowsSent = rowsSent;
    }

    public BigDecimal getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(BigDecimal rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public BigDecimal getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(BigDecimal rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public BigDecimal getFullScans() {
        return fullScans;
    }

    public void setFullScans(BigDecimal fullScans) {
        this.fullScans = fullScans;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", total=").append(total);
        sb.append(", totalLatency=").append(totalLatency);
        sb.append(", maxLatency=").append(maxLatency);
        sb.append(", lockLatency=").append(lockLatency);
        sb.append(", cpuLatency=").append(cpuLatency);
        sb.append(", rowsSent=").append(rowsSent);
        sb.append(", rowsExamined=").append(rowsExamined);
        sb.append(", rowsAffected=").append(rowsAffected);
        sb.append(", fullScans=").append(fullScans);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}