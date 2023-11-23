package cn.wwinter.model;

import java.io.Serializable;

public class RoleRoutineGrants implements Serializable {
    private String grantor;

    private String grantorHost;

    private String grantee;

    private String granteeHost;

    private String specificCatalog;

    private String specificSchema;

    private String specificName;

    private String routineCatalog;

    private String routineSchema;

    private String routineName;

    private String privilegeType;

    private String isGrantable;

    private static final long serialVersionUID = 1L;

    public String getGrantor() {
        return grantor;
    }

    public void setGrantor(String grantor) {
        this.grantor = grantor;
    }

    public String getGrantorHost() {
        return grantorHost;
    }

    public void setGrantorHost(String grantorHost) {
        this.grantorHost = grantorHost;
    }

    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public String getGranteeHost() {
        return granteeHost;
    }

    public void setGranteeHost(String granteeHost) {
        this.granteeHost = granteeHost;
    }

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

    public String getRoutineCatalog() {
        return routineCatalog;
    }

    public void setRoutineCatalog(String routineCatalog) {
        this.routineCatalog = routineCatalog;
    }

    public String getRoutineSchema() {
        return routineSchema;
    }

    public void setRoutineSchema(String routineSchema) {
        this.routineSchema = routineSchema;
    }

    public String getRoutineName() {
        return routineName;
    }

    public void setRoutineName(String routineName) {
        this.routineName = routineName;
    }

    public String getPrivilegeType() {
        return privilegeType;
    }

    public void setPrivilegeType(String privilegeType) {
        this.privilegeType = privilegeType;
    }

    public String getIsGrantable() {
        return isGrantable;
    }

    public void setIsGrantable(String isGrantable) {
        this.isGrantable = isGrantable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", grantor=").append(grantor);
        sb.append(", grantorHost=").append(grantorHost);
        sb.append(", grantee=").append(grantee);
        sb.append(", granteeHost=").append(granteeHost);
        sb.append(", specificCatalog=").append(specificCatalog);
        sb.append(", specificSchema=").append(specificSchema);
        sb.append(", specificName=").append(specificName);
        sb.append(", routineCatalog=").append(routineCatalog);
        sb.append(", routineSchema=").append(routineSchema);
        sb.append(", routineName=").append(routineName);
        sb.append(", privilegeType=").append(privilegeType);
        sb.append(", isGrantable=").append(isGrantable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}