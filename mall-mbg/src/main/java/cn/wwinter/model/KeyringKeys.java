package cn.wwinter.model;

import java.io.Serializable;

public class KeyringKeys implements Serializable {
    private String keyId;

    private String keyOwner;

    private String backendKeyId;

    private static final long serialVersionUID = 1L;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyOwner() {
        return keyOwner;
    }

    public void setKeyOwner(String keyOwner) {
        this.keyOwner = keyOwner;
    }

    public String getBackendKeyId() {
        return backendKeyId;
    }

    public void setBackendKeyId(String backendKeyId) {
        this.backendKeyId = backendKeyId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", keyId=").append(keyId);
        sb.append(", keyOwner=").append(keyOwner);
        sb.append(", backendKeyId=").append(backendKeyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}