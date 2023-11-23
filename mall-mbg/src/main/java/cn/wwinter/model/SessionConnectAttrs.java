package cn.wwinter.model;

import java.io.Serializable;

public class SessionConnectAttrs implements Serializable {
    private Long processlistId;

    private String attrName;

    private String attrValue;

    private Integer ordinalPosition;

    private static final long serialVersionUID = 1L;

    public Long getProcesslistId() {
        return processlistId;
    }

    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processlistId=").append(processlistId);
        sb.append(", attrName=").append(attrName);
        sb.append(", attrValue=").append(attrValue);
        sb.append(", ordinalPosition=").append(ordinalPosition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}