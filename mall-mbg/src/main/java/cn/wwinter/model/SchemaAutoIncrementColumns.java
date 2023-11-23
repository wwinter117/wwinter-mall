package cn.wwinter.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class SchemaAutoIncrementColumns implements Serializable {
    private String tableSchema;

    private String tableName;

    private String columnName;

    private Integer isSigned;

    private Integer isUnsigned;

    private Long maxValue;

    private Long autoIncrement;

    private BigDecimal autoIncrementRatio;

    private String dataType;

    private String columnType;

    private static final long serialVersionUID = 1L;

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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getIsSigned() {
        return isSigned;
    }

    public void setIsSigned(Integer isSigned) {
        this.isSigned = isSigned;
    }

    public Integer getIsUnsigned() {
        return isUnsigned;
    }

    public void setIsUnsigned(Integer isUnsigned) {
        this.isUnsigned = isUnsigned;
    }

    public Long getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    public Long getAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(Long autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    public BigDecimal getAutoIncrementRatio() {
        return autoIncrementRatio;
    }

    public void setAutoIncrementRatio(BigDecimal autoIncrementRatio) {
        this.autoIncrementRatio = autoIncrementRatio;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", columnName=").append(columnName);
        sb.append(", isSigned=").append(isSigned);
        sb.append(", isUnsigned=").append(isUnsigned);
        sb.append(", maxValue=").append(maxValue);
        sb.append(", autoIncrement=").append(autoIncrement);
        sb.append(", autoIncrementRatio=").append(autoIncrementRatio);
        sb.append(", dataType=").append(dataType);
        sb.append(", columnType=").append(columnType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}