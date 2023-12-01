package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.dto.AdminDto;
import cn.wwinter.malladmin.model.dto.AdminLoginDto;
import cn.wwinter.malladmin.model.dto.CommonResult;
import cn.wwinter.malladmin.service.AdminService;
import cn.wwinter.model.UmsAdmin;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: AdminController
 * Package: cn.wwinter.malladmin.controller
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
@RestController
@RequestMapping("admin")
@AllArgsConstructor
@Api(tags = "UmsAdminController")
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/register")
    public Object register(@RequestBody AdminDto adminDto, BindingResult result) {
        UmsAdmin umsAdmin = adminService.register(adminDto);
        CommonResult commonResult;
        if (umsAdmin == null) {
            commonResult = new CommonResult().failed();
        } else {
            commonResult = new CommonResult().success(umsAdmin);
        }
        return commonResult;
    }

    @PostMapping("/login")
    public Object login(@RequestBody AdminLoginDto adminLoginDto, BindingResult bindingResult) {
        String token = adminService.login(adminLoginDto.getUsername(), adminLoginDto.getPassword());
        if (token == null) {
            return new CommonResult().authFailed(bindingResult);
        }
        return new CommonResult().success(token);
    }
}
