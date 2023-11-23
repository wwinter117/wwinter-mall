package cn.wwinter.model;

import java.io.Serializable;

public class PreparedStatementsInstances implements Serializable {
    private Long objectInstanceBegin;

    private Long statementId;

    private String statementName;

    private Long ownerThreadId;

    private Long ownerEventId;

    private String ownerObjectType;

    private String ownerObjectSchema;

    private String ownerObjectName;

    private String executionEngine;

    private Long timerPrepare;

    private Long countReprepare;

    private Long countExecute;

    private Long sumTimerExecute;

    private Long minTimerExecute;

    private Long avgTimerExecute;

    private Long maxTimerExecute;

    private Long sumLockTime;

    private Long sumErrors;

    private Long sumWarnings;

    private Long sumRowsAffected;

    private Long sumRowsSent;

    private Long sumRowsExamined;

    private Long sumCreatedTmpDiskTables;

    private Long sumCreatedTmpTables;

    private Long sumSelectFullJoin;

    private Long sumSelectFullRangeJoin;

    private Long sumSelectRange;

    private Long sumSelectRangeCheck;

    private Long sumSelectScan;

    private Long sumSortMergePasses;

    private Long sumSortRange;

    private Long sumSortRows;

    private Long sumSortScan;

    private Long sumNoIndexUsed;

    private Long sumNoGoodIndexUsed;

    private Long sumCpuTime;

    private Long maxControlledMemory;

    private Long maxTotalMemory;

    private Long countSecondary;

    private String sqlText;

    private static final long serialVersionUID = 1L;

    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    public Long getStatementId() {
        return statementId;
    }

    public void setStatementId(Long statementId) {
        this.statementId = statementId;
    }

    public String getStatementName() {
        return statementName;
    }

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    public Long getOwnerThreadId() {
        return ownerThreadId;
    }

    public void setOwnerThreadId(Long ownerThreadId) {
        this.ownerThreadId = ownerThreadId;
    }

    public Long getOwnerEventId() {
        return ownerEventId;
    }

    public void setOwnerEventId(Long ownerEventId) {
        this.ownerEventId = ownerEventId;
    }

    public String getOwnerObjectType() {
        return ownerObjectType;
    }

    public void setOwnerObjectType(String ownerObjectType) {
        this.ownerObjectType = ownerObjectType;
    }

    public String getOwnerObjectSchema() {
        return ownerObjectSchema;
    }

    public void setOwnerObjectSchema(String ownerObjectSchema) {
        this.ownerObjectSchema = ownerObjectSchema;
    }

    public String getOwnerObjectName() {
        return ownerObjectName;
    }

    public void setOwnerObjectName(String ownerObjectName) {
        this.ownerObjectName = ownerObjectName;
    }

    public String getExecutionEngine() {
        return executionEngine;
    }

    public void setExecutionEngine(String executionEngine) {
        this.executionEngine = executionEngine;
    }

    public Long getTimerPrepare() {
        return timerPrepare;
    }

    public void setTimerPrepare(Long timerPrepare) {
        this.timerPrepare = timerPrepare;
    }

    public Long getCountReprepare() {
        return countReprepare;
    }

    public void setCountReprepare(Long countReprepare) {
        this.countReprepare = countReprepare;
    }

    public Long getCountExecute() {
        return countExecute;
    }

    public void setCountExecute(Long countExecute) {
        this.countExecute = countExecute;
    }

    public Long getSumTimerExecute() {
        return sumTimerExecute;
    }

    public void setSumTimerExecute(Long sumTimerExecute) {
        this.sumTimerExecute = sumTimerExecute;
    }

    public Long getMinTimerExecute() {
        return minTimerExecute;
    }

    public void setMinTimerExecute(Long minTimerExecute) {
        this.minTimerExecute = minTimerExecute;
    }

    public Long getAvgTimerExecute() {
        return avgTimerExecute;
    }

    public void setAvgTimerExecute(Long avgTimerExecute) {
        this.avgTimerExecute = avgTimerExecute;
    }

    public Long getMaxTimerExecute() {
        return maxTimerExecute;
    }

    public void setMaxTimerExecute(Long maxTimerExecute) {
        this.maxTimerExecute = maxTimerExecute;
    }

    public Long getSumLockTime() {
        return sumLockTime;
    }

    public void setSumLockTime(Long sumLockTime) {
        this.sumLockTime = sumLockTime;
    }

    public Long getSumErrors() {
        return sumErrors;
    }

    public void setSumErrors(Long sumErrors) {
        this.sumErrors = sumErrors;
    }

    public Long getSumWarnings() {
        return sumWarnings;
    }

    public void setSumWarnings(Long sumWarnings) {
        this.sumWarnings = sumWarnings;
    }

    public Long getSumRowsAffected() {
        return sumRowsAffected;
    }

    public void setSumRowsAffected(Long sumRowsAffected) {
        this.sumRowsAffected = sumRowsAffected;
    }

    public Long getSumRowsSent() {
        return sumRowsSent;
    }

    public void setSumRowsSent(Long sumRowsSent) {
        this.sumRowsSent = sumRowsSent;
    }

    public Long getSumRowsExamined() {
        return sumRowsExamined;
    }

    public void setSumRowsExamined(Long sumRowsExamined) {
        this.sumRowsExamined = sumRowsExamined;
    }

    public Long getSumCreatedTmpDiskTables() {
        return sumCreatedTmpDiskTables;
    }

    public void setSumCreatedTmpDiskTables(Long sumCreatedTmpDiskTables) {
        this.sumCreatedTmpDiskTables = sumCreatedTmpDiskTables;
    }

    public Long getSumCreatedTmpTables() {
        return sumCreatedTmpTables;
    }

    public void setSumCreatedTmpTables(Long sumCreatedTmpTables) {
        this.sumCreatedTmpTables = sumCreatedTmpTables;
    }

    public Long getSumSelectFullJoin() {
        return sumSelectFullJoin;
    }

    public void setSumSelectFullJoin(Long sumSelectFullJoin) {
        this.sumSelectFullJoin = sumSelectFullJoin;
    }

    public Long getSumSelectFullRangeJoin() {
        return sumSelectFullRangeJoin;
    }

    public void setSumSelectFullRangeJoin(Long sumSelectFullRangeJoin) {
        this.sumSelectFullRangeJoin = sumSelectFullRangeJoin;
    }

    public Long getSumSelectRange() {
        return sumSelectRange;
    }

    public void setSumSelectRange(Long sumSelectRange) {
        this.sumSelectRange = sumSelectRange;
    }

    public Long getSumSelectRangeCheck() {
        return sumSelectRangeCheck;
    }

    public void setSumSelectRangeCheck(Long sumSelectRangeCheck) {
        this.sumSelectRangeCheck = sumSelectRangeCheck;
    }

    public Long getSumSelectScan() {
        return sumSelectScan;
    }

    public void setSumSelectScan(Long sumSelectScan) {
        this.sumSelectScan = sumSelectScan;
    }

    public Long getSumSortMergePasses() {
        return sumSortMergePasses;
    }

    public void setSumSortMergePasses(Long sumSortMergePasses) {
        this.sumSortMergePasses = sumSortMergePasses;
    }

    public Long getSumSortRange() {
        return sumSortRange;
    }

    public void setSumSortRange(Long sumSortRange) {
        this.sumSortRange = sumSortRange;
    }

    public Long getSumSortRows() {
        return sumSortRows;
    }

    public void setSumSortRows(Long sumSortRows) {
        this.sumSortRows = sumSortRows;
    }

    public Long getSumSortScan() {
        return sumSortScan;
    }

    public void setSumSortScan(Long sumSortScan) {
        this.sumSortScan = sumSortScan;
    }

    public Long getSumNoIndexUsed() {
        return sumNoIndexUsed;
    }

    public void setSumNoIndexUsed(Long sumNoIndexUsed) {
        this.sumNoIndexUsed = sumNoIndexUsed;
    }

    public Long getSumNoGoodIndexUsed() {
        return sumNoGoodIndexUsed;
    }

    public void setSumNoGoodIndexUsed(Long sumNoGoodIndexUsed) {
        this.sumNoGoodIndexUsed = sumNoGoodIndexUsed;
    }

    public Long getSumCpuTime() {
        return sumCpuTime;
    }

    public void setSumCpuTime(Long sumCpuTime) {
        this.sumCpuTime = sumCpuTime;
    }

    public Long getMaxControlledMemory() {
        return maxControlledMemory;
    }

    public void setMaxControlledMemory(Long maxControlledMemory) {
        this.maxControlledMemory = maxControlledMemory;
    }

    public Long getMaxTotalMemory() {
        return maxTotalMemory;
    }

    public void setMaxTotalMemory(Long maxTotalMemory) {
        this.maxTotalMemory = maxTotalMemory;
    }

    public Long getCountSecondary() {
        return countSecondary;
    }

    public void setCountSecondary(Long countSecondary) {
        this.countSecondary = countSecondary;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", objectInstanceBegin=").append(objectInstanceBegin);
        sb.append(", statementId=").append(statementId);
        sb.append(", statementName=").append(statementName);
        sb.append(", ownerThreadId=").append(ownerThreadId);
        sb.append(", ownerEventId=").append(ownerEventId);
        sb.append(", ownerObjectType=").append(ownerObjectType);
        sb.append(", ownerObjectSchema=").append(ownerObjectSchema);
        sb.append(", ownerObjectName=").append(ownerObjectName);
        sb.append(", executionEngine=").append(executionEngine);
        sb.append(", timerPrepare=").append(timerPrepare);
        sb.append(", countReprepare=").append(countReprepare);
        sb.append(", countExecute=").append(countExecute);
        sb.append(", sumTimerExecute=").append(sumTimerExecute);
        sb.append(", minTimerExecute=").append(minTimerExecute);
        sb.append(", avgTimerExecute=").append(avgTimerExecute);
        sb.append(", maxTimerExecute=").append(maxTimerExecute);
        sb.append(", sumLockTime=").append(sumLockTime);
        sb.append(", sumErrors=").append(sumErrors);
        sb.append(", sumWarnings=").append(sumWarnings);
        sb.append(", sumRowsAffected=").append(sumRowsAffected);
        sb.append(", sumRowsSent=").append(sumRowsSent);
        sb.append(", sumRowsExamined=").append(sumRowsExamined);
        sb.append(", sumCreatedTmpDiskTables=").append(sumCreatedTmpDiskTables);
        sb.append(", sumCreatedTmpTables=").append(sumCreatedTmpTables);
        sb.append(", sumSelectFullJoin=").append(sumSelectFullJoin);
        sb.append(", sumSelectFullRangeJoin=").append(sumSelectFullRangeJoin);
        sb.append(", sumSelectRange=").append(sumSelectRange);
        sb.append(", sumSelectRangeCheck=").append(sumSelectRangeCheck);
        sb.append(", sumSelectScan=").append(sumSelectScan);
        sb.append(", sumSortMergePasses=").append(sumSortMergePasses);
        sb.append(", sumSortRange=").append(sumSortRange);
        sb.append(", sumSortRows=").append(sumSortRows);
        sb.append(", sumSortScan=").append(sumSortScan);
        sb.append(", sumNoIndexUsed=").append(sumNoIndexUsed);
        sb.append(", sumNoGoodIndexUsed=").append(sumNoGoodIndexUsed);
        sb.append(", sumCpuTime=").append(sumCpuTime);
        sb.append(", maxControlledMemory=").append(maxControlledMemory);
        sb.append(", maxTotalMemory=").append(maxTotalMemory);
        sb.append(", countSecondary=").append(countSecondary);
        sb.append(", sqlText=").append(sqlText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}