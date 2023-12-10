package cn.wwinter.model;

import java.io.Serial;
import java.io.Serializable;

public class CmsPreferenceAreaProductRelation implements Serializable {
    @Serial
    private static final long serialVersionUID = 2653516336729862660L;

    private Long id;

    private Long preferenceAreaId;

    private Long productId;

    public CmsPreferenceAreaProductRelation() {
    }

    public CmsPreferenceAreaProductRelation(Long id, Long preferenceAreaId, Long productId) {
        this.id = id;
        this.preferenceAreaId = preferenceAreaId;
        this.productId = productId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPreferenceAreaId() {
        return preferenceAreaId;
    }

    public void setPreferenceAreaId(Long preferenceAreaId) {
        this.preferenceAreaId = preferenceAreaId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prefrenceAreaId=").append(preferenceAreaId);
        sb.append(", productId=").append(productId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}