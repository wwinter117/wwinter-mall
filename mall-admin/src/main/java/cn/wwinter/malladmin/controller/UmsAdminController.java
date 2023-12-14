package cn.wwinter.malladmin.controller;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.UmsAdminDto;
import cn.wwinter.malladmin.model.dto.AdminLoginDto;
import cn.wwinter.malladmin.service.UmsAdminService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    private final UmsAdminService umsAdminService;

    @PostMapping("/register")
    public CommonResponse register(@Validated @RequestBody UmsAdminDto adminDto, BindingResult result) {
        return umsAdminService.register(adminDto);
    }

    @PostMapping("/login")
    public CommonResponse login(@Validated @RequestBody AdminLoginDto adminLoginDto, BindingResult bindingResult) {
        return umsAdminService.login(adminLoginDto.getUsername(), adminLoginDto.getPassword());
    }

    @GetMapping("/getInfo")
    public CommonResponse info() {
        return null;
    }


}
