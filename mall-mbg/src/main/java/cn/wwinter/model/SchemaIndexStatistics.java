package cn.wwinter.model;

import java.io.Serializable;

public class SchemaIndexStatistics implements Serializable {
    private String tableSchema;

    private String tableName;

    private String indexName;

    private Long rowsSelected;

    private String selectLatency;

    private Long rowsInserted;

    private String insertLatency;

    private Long rowsUpdated;

    private String updateLatency;

    private Long rowsDeleted;

    private String deleteLatency;

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

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public Long getRowsSelected() {
        return rowsSelected;
    }

    public void setRowsSelected(Long rowsSelected) {
        this.rowsSelected = rowsSelected;
    }

    public String getSelectLatency() {
        return selectLatency;
    }

    public void setSelectLatency(String selectLatency) {
        this.selectLatency = selectLatency;
    }

    public Long getRowsInserted() {
        return rowsInserted;
    }

    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    public String getInsertLatency() {
        return insertLatency;
    }

    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency;
    }

    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    public String getUpdateLatency() {
        return updateLatency;
    }

    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency;
    }

    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    public String getDeleteLatency() {
        return deleteLatency;
    }

    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tableSchema=").append(tableSchema);
        sb.append(", tableName=").append(tableName);
        sb.append(", indexName=").append(indexName);
        sb.append(", rowsSelected=").append(rowsSelected);
        sb.append(", selectLatency=").append(selectLatency);
        sb.append(", rowsInserted=").append(rowsInserted);
        sb.append(", insertLatency=").append(insertLatency);
        sb.append(", rowsUpdated=").append(rowsUpdated);
        sb.append(", updateLatency=").append(updateLatency);
        sb.append(", rowsDeleted=").append(rowsDeleted);
        sb.append(", deleteLatency=").append(deleteLatency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}