package cn.wwinter.model;

import java.io.Serializable;

public class Hosts implements Serializable {
    private String host;

    private Long currentConnections;

    private Long totalConnections;

    private Long maxSessionControlledMemory;

    private Long maxSessionTotalMemory;

    private static final long serialVersionUID = 1L;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Long getCurrentConnections() {
        return currentConnections;
    }

    public void setCurrentConnections(Long currentConnections) {
        this.currentConnections = currentConnections;
    }

    public Long getTotalConnections() {
        return totalConnections;
    }

    public void setTotalConnections(Long totalConnections) {
        this.totalConnections = totalConnections;
    }

    public Long getMaxSessionControlledMemory() {
        return maxSessionControlledMemory;
    }

    public void setMaxSessionControlledMemory(Long maxSessionControlledMemory) {
        this.maxSessionControlledMemory = maxSessionControlledMemory;
    }

    public Long getMaxSessionTotalMemory() {
        return maxSessionTotalMemory;
    }

    public void setMaxSessionTotalMemory(Long maxSessionTotalMemory) {
        this.maxSessionTotalMemory = maxSessionTotalMemory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", host=").append(host);
        sb.append(", currentConnections=").append(currentConnections);
        sb.append(", totalConnections=").append(totalConnections);
        sb.append(", maxSessionControlledMemory=").append(maxSessionControlledMemory);
        sb.append(", maxSessionTotalMemory=").append(maxSessionTotalMemory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}