package cn.wwinter.model;

import java.io.Serializable;

public class CharacterSets implements Serializable {
    private String characterSetName;

    private String defaultCollateName;

    private String description;

    private Integer maxlen;

    private static final long serialVersionUID = 1L;

    public String getCharacterSetName() {
        return characterSetName;
    }

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    public String getDefaultCollateName() {
        return defaultCollateName;
    }

    public void setDefaultCollateName(String defaultCollateName) {
        this.defaultCollateName = defaultCollateName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMaxlen() {
        return maxlen;
    }

    public void setMaxlen(Integer maxlen) {
        this.maxlen = maxlen;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", characterSetName=").append(characterSetName);
        sb.append(", defaultCollateName=").append(defaultCollateName);
        sb.append(", description=").append(description);
        sb.append(", maxlen=").append(maxlen);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}