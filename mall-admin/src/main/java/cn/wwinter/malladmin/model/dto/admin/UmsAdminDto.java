package cn.wwinter.malladmin.model.dto.admin;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.Email;
import lombok.Data;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

/**
 * ClassName: UmsAdminDto
 * Package: cn.wwinter.malladmin.model.dto
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
@Data
public class UmsAdminDto {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "用户头像")
    private String icon;
    @ApiModelProperty(value = "邮箱")
    @Email(message = "邮箱格式不合法")
    private String email;

    private List<String> roles;
}
