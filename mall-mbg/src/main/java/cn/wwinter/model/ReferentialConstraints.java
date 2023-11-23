package cn.wwinter.model;

import java.io.Serializable;

public class ReferentialConstraints implements Serializable {
    private String constraintCatalog;

    private String constraintSchema;

    private String constraintName;

    private String uniqueConstraintCatalog;

    private String uniqueConstraintSchema;

    private String uniqueConstraintName;

    private String matchOption;

    private String updateRule;

    private String deleteRule;

    private String tableName;

    private String referencedTableName;

    private static final long serialVersionUID = 1L;

    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog;
    }

    public String getConstraintSchema() {
        return constraintSchema;
    }

    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog;
    }

    public String getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema;
    }

    public String getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    public void setUniqueConstraintName(String uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName;
    }

    public String getMatchOption() {
        return matchOption;
    }

    public void setMatchOption(String matchOption) {
        this.matchOption = matchOption;
    }

    public String getUpdateRule() {
        return updateRule;
    }

    public void setUpdateRule(String updateRule) {
        this.updateRule = updateRule;
    }

    public String getDeleteRule() {
        return deleteRule;
    }

    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getReferencedTableName() {
        return referencedTableName;
    }

    public void setReferencedTableName(String referencedTableName) {
        this.referencedTableName = referencedTableName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", constraintCatalog=").append(constraintCatalog);
        sb.append(", constraintSchema=").append(constraintSchema);
        sb.append(", constraintName=").append(constraintName);
        sb.append(", uniqueConstraintCatalog=").append(uniqueConstraintCatalog);
        sb.append(", uniqueConstraintSchema=").append(uniqueConstraintSchema);
        sb.append(", uniqueConstraintName=").append(uniqueConstraintName);
        sb.append(", matchOption=").append(matchOption);
        sb.append(", updateRule=").append(updateRule);
        sb.append(", deleteRule=").append(deleteRule);
        sb.append(", tableName=").append(tableName);
        sb.append(", referencedTableName=").append(referencedTableName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}