package cn.wwinter.model;

import java.io.Serializable;

public class Views implements Serializable {
    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String checkOption;

    private String isUpdatable;

    private String definer;

    private String securityType;

    private String characterSetClient;

    private String collationConnection;

    private String viewDefinition;

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

    public String getCheckOption() {
        return checkOption;
    }

    public void setCheckOption(String checkOption) {
        this.checkOption = checkOption;
    }

    public String getIsUpdatable() {
        return isUpdatable;
    }

    public void setIsUpdatable(String isUpdatable) {
        this.isUpdatable = isUpdatable;
    }

    public String getDefiner() {
        return definer;
    }

    public void setDefiner(String definer) {
        this.definer = definer;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getCharacterSetClient() {
        return characterSetClient;
    }

    public void setCharacterSetClient(String characterSetClient) {
        this.characterSetClient = characterSetClient;
    }

    public String getCollationConnection() {
        return collationConnection;
    }

    public void setCollationConnection(String collationConnection) {
        this.collationConnection = collationConnection;
    }

    public String getViewDefinition() {
        return viewDefinition;
    }

    public void setViewDefinition(String viewDefinition) {
        this.viewDefinition = viewDefinition;
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
        sb.append(", checkOption=").append(checkOption);
        sb.append(", isUpdatable=").append(isUpdatable);
        sb.append(", definer=").append(definer);
        sb.append(", securityType=").append(securityType);
        sb.append(", characterSetClient=").append(characterSetClient);
        sb.append(", collationConnection=").append(collationConnection);
        sb.append(", viewDefinition=").append(viewDefinition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}