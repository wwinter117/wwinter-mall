package cn.wwinter.model;

import java.io.Serializable;

public class TablesExtensions implements Serializable {
    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String engineAttribute;

    private String secondaryEngineAttribute;

    private static final long serialVersionUID = 1L;

    public String getTableCatalog() {
        return tableCatalog;
    }

    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog;
    }

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

    public String getEngineAttribute() {
        return engineAttribute;
    }

    public void setEngineAttribute(String engineAttribute) {
        this.engineAttribute = engineAttribute;
    }

    public String getSecondaryEngineAttribute() {
        return secondaryEngineAttribute;
    }

    public void setSecondaryEngineAttribute(String secondaryEngineAttribute) {
        this.secondaryEngineAttribute = secondaryEngineAttribute;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableCatalog=").append(tableCatalog);
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", engineAttribute=").append(engineAttribute);
        sb.append(", secondaryEngineAttribute=").append(secondaryEngineAttribute);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}