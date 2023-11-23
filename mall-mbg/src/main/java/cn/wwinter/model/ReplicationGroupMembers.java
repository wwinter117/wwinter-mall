package cn.wwinter.model;

import java.io.Serializable;

public class ReplicationGroupMembers implements Serializable {
    private String channelName;

    private String memberId;

    private String memberHost;

    private Integer memberPort;

    private String memberState;

    private String memberRole;

    private String memberVersion;

    private String memberCommunicationStack;

    private static final long serialVersionUID = 1L;

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberHost() {
        return memberHost;
    }

    public void setMemberHost(String memberHost) {
        this.memberHost = memberHost;
    }

    public Integer getMemberPort() {
        return memberPort;
    }

    public void setMemberPort(Integer memberPort) {
        this.memberPort = memberPort;
    }

    public String getMemberState() {
        return memberState;
    }

    public void setMemberState(String memberState) {
        this.memberState = memberState;
    }

    public String getMemberRole() {
        return memberRole;
    }

    public void setMemberRole(String memberRole) {
        this.memberRole = memberRole;
    }

    public String getMemberVersion() {
        return memberVersion;
    }

    public void setMemberVersion(String memberVersion) {
        this.memberVersion = memberVersion;
    }

    public String getMemberCommunicationStack() {
        return memberCommunicationStack;
    }

    public void setMemberCommunicationStack(String memberCommunicationStack) {
        this.memberCommunicationStack = memberCommunicationStack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", channelName=").append(channelName);
        sb.append(", memberId=").append(memberId);
        sb.append(", memberHost=").append(memberHost);
        sb.append(", memberPort=").append(memberPort);
        sb.append(", memberState=").append(memberState);
        sb.append(", memberRole=").append(memberRole);
        sb.append(", memberVersion=").append(memberVersion);
        sb.append(", memberCommunicationStack=").append(memberCommunicationStack);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}