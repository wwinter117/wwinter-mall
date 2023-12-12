package cn.wwinter.malladmin.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description:
 * @Date: 2023/12/11
 * @Author: zhangdd
 */
@Data
@TableName("ums_admin_role")
public class UmsAdminRole implements Serializable {

    @Serial
    private static final long serialVersionUID = -2053522834376344149L;

    @TableId(type = IdType.AUTO)
    private Long id;

    private Long umsAdminId;

    private Long umsRoleId;
}
