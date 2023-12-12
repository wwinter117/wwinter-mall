package cn.wwinter.malladmin.model.entity;

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
@TableName("ums_role")
public class UmsRole implements Serializable {
    @Serial
    private static final long serialVersionUID = 7213587467452689845L;
    @TableId(type = IdType.AUTO)
    private Long id;

    private String roleName;

    private String description;
}
