package cn.wwinter.malladmin.model.entity.admin;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Description:
 * @Date: 2023/12/3
 * @Author: zhangdd
 */
@Data
@TableName("ums_admin")
public class UmsAdmin implements Serializable {
    @Serial
    private static final long serialVersionUID = 1315608205073359771L;
    @TableId(type = IdType.INPUT)
    private Long id;

    private String username;

    private String password;
    /**
     * 头像
     */
    private String icon;

    private String email;
}
