package cn.wwinter.model;

import java.io.Serializable;

public class RoleEdges implements Serializable {
    private String fromHost;

    private String fromUser;

    private String toHost;

    private String toUser;

    private String withAdminOption;

    private static final long serialVersionUID = 1L;

    public String getFromHost() {
        return fromHost;
    }

    public void setFromHost(String fromHost) {
        this.fromHost = fromHost;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToHost() {
        return toHost;
    }

    public void setToHost(String toHost) {
        this.toHost = toHost;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getWithAdminOption() {
        return withAdminOption;
    }

    public void setWithAdminOption(String withAdminOption) {
        this.withAdminOption = withAdminOption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fromHost=").append(fromHost);
        sb.append(", fromUser=").append(fromUser);
        sb.append(", toHost=").append(toHost);
        sb.append(", toUser=").append(toUser);
        sb.append(", withAdminOption=").append(withAdminOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}