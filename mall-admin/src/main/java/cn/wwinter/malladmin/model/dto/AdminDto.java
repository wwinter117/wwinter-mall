package cn.wwinter.malladmin.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

/**
 * ClassName: AdminDto
 * Package: cn.wwinter.malladmin.model.dto
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
@Data
public class AdminDto {
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
}
