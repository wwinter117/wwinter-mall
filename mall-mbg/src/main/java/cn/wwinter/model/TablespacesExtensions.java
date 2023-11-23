package cn.wwinter.model;

import java.io.Serializable;

public class TablespacesExtensions implements Serializable {
    private String tablespaceName;

    private String engineAttribute;

    private static final long serialVersionUID = 1L;

    public String getTablespaceName() {
        return tablespaceName;
    }

    public void setTablespaceName(String tablespaceName) {
        this.tablespaceName = tablespaceName;
    }

    public String getEngineAttribute() {
        return engineAttribute;
    }

    public void setEngineAttribute(String engineAttribute) {
        this.engineAttribute = engineAttribute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tablespaceName=").append(tablespaceName);
        sb.append(", engineAttribute=").append(engineAttribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}