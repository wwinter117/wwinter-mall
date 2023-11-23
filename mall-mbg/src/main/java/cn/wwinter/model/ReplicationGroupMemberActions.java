package cn.wwinter.model;

import java.io.Serializable;

public class ReplicationGroupMemberActions implements Serializable {
    private String name;

    private String event;

    private Boolean enabled;

    private String type;

    private Byte priority;

    private String errorHandling;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public String getErrorHandling() {
        return errorHandling;
    }

    public void setErrorHandling(String errorHandling) {
        this.errorHandling = errorHandling;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", event=").append(event);
        sb.append(", enabled=").append(enabled);
        sb.append(", type=").append(type);
        sb.append(", priority=").append(priority);
        sb.append(", errorHandling=").append(errorHandling);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}