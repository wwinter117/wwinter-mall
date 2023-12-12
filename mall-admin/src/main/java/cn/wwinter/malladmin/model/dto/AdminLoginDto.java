package cn.wwinter.malladmin.model.dto;

import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * ClassName: AdminLoginDto
 * Package: cn.wwinter.malladmin.model.dto
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
@Data
public class AdminLoginDto {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;
}
