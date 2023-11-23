package cn.wwinter.model;

import java.io.Serializable;

public class ReplicationApplierConfiguration implements Serializable {
    private String channelName;

    private Integer desiredDelay;

    private String requireRowFormat;

    private String requireTablePrimaryKeyCheck;

    private String assignGtidsToAnonymousTransactionsType;

    private String privilegeChecksUser;

    private String assignGtidsToAnonymousTransactionsValue;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public Integer getDesiredDelay() {
        return desiredDelay;
    }

    public void setDesiredDelay(Integer desiredDelay) {
        this.desiredDelay = desiredDelay;
    }

    public String getRequireRowFormat() {
        return requireRowFormat;
    }

    public void setRequireRowFormat(String requireRowFormat) {
        this.requireRowFormat = requireRowFormat;
    }

    public String getRequireTablePrimaryKeyCheck() {
        return requireTablePrimaryKeyCheck;
    }

    public void setRequireTablePrimaryKeyCheck(String requireTablePrimaryKeyCheck) {
        this.requireTablePrimaryKeyCheck = requireTablePrimaryKeyCheck;
    }

    public String getAssignGtidsToAnonymousTransactionsType() {
        return assignGtidsToAnonymousTransactionsType;
    }

    public void setAssignGtidsToAnonymousTransactionsType(String assignGtidsToAnonymousTransactionsType) {
        this.assignGtidsToAnonymousTransactionsType = assignGtidsToAnonymousTransactionsType;
    }

    public String getPrivilegeChecksUser() {
        return privilegeChecksUser;
    }

    public void setPrivilegeChecksUser(String privilegeChecksUser) {
        this.privilegeChecksUser = privilegeChecksUser;
    }

    public String getAssignGtidsToAnonymousTransactionsValue() {
        return assignGtidsToAnonymousTransactionsValue;
    }

    public void setAssignGtidsToAnonymousTransactionsValue(String assignGtidsToAnonymousTransactionsValue) {
        this.assignGtidsToAnonymousTransactionsValue = assignGtidsToAnonymousTransactionsValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", desiredDelay=").append(desiredDelay);
        sb.append(", requireRowFormat=").append(requireRowFormat);
        sb.append(", requireTablePrimaryKeyCheck=").append(requireTablePrimaryKeyCheck);
        sb.append(", assignGtidsToAnonymousTransactionsType=").append(assignGtidsToAnonymousTransactionsType);
        sb.append(", privilegeChecksUser=").append(privilegeChecksUser);
        sb.append(", assignGtidsToAnonymousTransactionsValue=").append(assignGtidsToAnonymousTransactionsValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}