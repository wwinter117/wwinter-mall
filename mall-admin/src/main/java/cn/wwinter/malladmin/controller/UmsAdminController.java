package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.UmsAdminDto;
import cn.wwinter.malladmin.model.dto.AdminLoginDto;
import cn.wwinter.malladmin.service.AdminService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UmsAdminController
 * Package: cn.wwinter.malladmin.controller
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
@RestController
@RequestMapping("admin")
@AllArgsConstructor
@Api(tags = "UmsAdminController")
public class UmsAdminController {

    private final AdminService adminService;

    @PostMapping("/register")
    public CommonResponse register(@Validated @RequestBody UmsAdminDto adminDto, BindingResult result) {
        return adminService.register(adminDto);
    }

    @PostMapping("/login")
    public CommonResponse login(@Validated @RequestBody AdminLoginDto adminLoginDto, BindingResult bindingResult) {
        return adminService.login(adminLoginDto.getUsername(), adminLoginDto.getPassword());
    }
}
