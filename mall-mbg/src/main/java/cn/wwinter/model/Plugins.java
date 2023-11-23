package cn.wwinter.model;

import java.io.Serializable;

public class Plugins implements Serializable {
    private String pluginName;

    private String pluginVersion;

    private String pluginStatus;

    private String pluginType;

    private String pluginTypeVersion;

    private String pluginLibrary;

    private String pluginLibraryVersion;

    private String pluginAuthor;

    private String pluginDescription;

    private String pluginLicense;

    private String loadOption;

    private static final long serialVersionUID = 1L;

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public String getPluginStatus() {
        return pluginStatus;
    }

    public void setPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
    }

    public String getPluginTypeVersion() {
        return pluginTypeVersion;
    }

    public void setPluginTypeVersion(String pluginTypeVersion) {
        this.pluginTypeVersion = pluginTypeVersion;
    }

    public String getPluginLibrary() {
        return pluginLibrary;
    }

    public void setPluginLibrary(String pluginLibrary) {
        this.pluginLibrary = pluginLibrary;
    }

    public String getPluginLibraryVersion() {
        return pluginLibraryVersion;
    }

    public void setPluginLibraryVersion(String pluginLibraryVersion) {
        this.pluginLibraryVersion = pluginLibraryVersion;
    }

    public String getPluginAuthor() {
        return pluginAuthor;
    }

    public void setPluginAuthor(String pluginAuthor) {
        this.pluginAuthor = pluginAuthor;
    }

    public String getPluginDescription() {
        return pluginDescription;
    }

    public void setPluginDescription(String pluginDescription) {
        this.pluginDescription = pluginDescription;
    }

    public String getPluginLicense() {
        return pluginLicense;
    }

    public void setPluginLicense(String pluginLicense) {
        this.pluginLicense = pluginLicense;
    }

    public String getLoadOption() {
        return loadOption;
    }

    public void setLoadOption(String loadOption) {
        this.loadOption = loadOption;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pluginName=").append(pluginName);
        sb.append(", pluginVersion=").append(pluginVersion);
        sb.append(", pluginStatus=").append(pluginStatus);
        sb.append(", pluginType=").append(pluginType);
        sb.append(", pluginTypeVersion=").append(pluginTypeVersion);
        sb.append(", pluginLibrary=").append(pluginLibrary);
        sb.append(", pluginLibraryVersion=").append(pluginLibraryVersion);
        sb.append(", pluginAuthor=").append(pluginAuthor);
        sb.append(", pluginDescription=").append(pluginDescription);
        sb.append(", pluginLicense=").append(pluginLicense);
        sb.append(", loadOption=").append(loadOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}