package cn.wwinter.malladmin.model.entity.admin;

import cn.wwinter.malladmin.enums.Roles;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Date: 2023/12/10
 * @Author: zhangdd
 */
@Data
public class UserBaseInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -1018356035432259827L;

    private List<Roles> roles;

    private Boolean isLocked;

    private Boolean isEnabled;

}
