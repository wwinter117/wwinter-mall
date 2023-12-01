package cn.wwinter.malladmin.service;

import cn.wwinter.malladmin.model.dto.AdminDto;
import cn.wwinter.model.UmsAdmin;

/**
 * ClassName: AdminService
 * Package: cn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
public interface AdminService {
    UmsAdmin register(AdminDto adminDto);

    String login(String username, String password);

    UmsAdmin getAdminByUsername(String username);
}
