package cn.wwinter.model;

import java.io.Serializable;

public class Parameters implements Serializable {
    private String specificCatalog;

    private String specificSchema;

    private String specificName;

    private Long ordinalPosition;

    private String parameterMode;

    private String parameterName;

    private Long characterMaximumLength;

    private Long characterOctetLength;

    private Integer numericPrecision;

    private Long numericScale;

    private Integer datetimePrecision;

    private String characterSetName;

    private String collationName;

    private String routineType;

    private String dataType;

    private String dtdIdentifier;

    private static final long serialVersionUID = 1L;

    public String getSpecificCatalog() {
        return specificCatalog;
    }

    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog;
    }

    public String getSpecificSchema() {
        return specificSchema;
    }

    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema;
    }

    public String getSpecificName() {
        return specificName;
    }

    public void setSpecificName(String specificName) {
        this.specificName = specificName;
    }

    public Long getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(Long ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getParameterMode() {
        return parameterMode;
    }

    public void setParameterMode(String parameterMode) {
        this.parameterMode = parameterMode;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public Long getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(Long characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public Long getCharacterOctetLength() {
        return characterOctetLength;
    }

    public void setCharacterOctetLength(Long characterOctetLength) {
        this.characterOctetLength = characterOctetLength;
    }

    public Integer getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(Integer numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public Long getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(Long numericScale) {
        this.numericScale = numericScale;
    }

    public Integer getDatetimePrecision() {
        return datetimePrecision;
    }

    public void setDatetimePrecision(Integer datetimePrecision) {
        this.datetimePrecision = datetimePrecision;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getCollationName() {
        return collationName;
    }

    public void setCollationName(String collationName) {
        this.collationName = collationName;
    }

    public String getRoutineType() {
        return routineType;
    }

    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDtdIdentifier() {
        return dtdIdentifier;
    }

    public void setDtdIdentifier(String dtdIdentifier) {
        this.dtdIdentifier = dtdIdentifier;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", ordinalPosition=").append(ordinalPosition);
        sb.append(", parameterMode=").append(parameterMode);
        sb.append(", parameterName=").append(parameterName);
        sb.append(", characterMaximumLength=").append(characterMaximumLength);
        sb.append(", characterOctetLength=").append(characterOctetLength);
        sb.append(", numericPrecision=").append(numericPrecision);
        sb.append(", numericScale=").append(numericScale);
        sb.append(", datetimePrecision=").append(datetimePrecision);
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", collationName=").append(collationName);
        sb.append(", routineType=").append(routineType);
        sb.append(", dataType=").append(dataType);
        sb.append(", dtdIdentifier=").append(dtdIdentifier);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}