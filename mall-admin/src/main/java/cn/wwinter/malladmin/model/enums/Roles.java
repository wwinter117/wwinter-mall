package cn.wwinter.malladmin.model.enums;

/**
 * @Description:
 * @Datetime: 2023/12/10
 * @Author: zhangdd
 */
public enum Roles implements BaseEnum{
    ADMIN("ADMIN","管理员用户"),
    USER("USER","普通用户"),
    TEST("TEST","测试用户");

    private final String value;
    private final String description;

    Roles(String value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
