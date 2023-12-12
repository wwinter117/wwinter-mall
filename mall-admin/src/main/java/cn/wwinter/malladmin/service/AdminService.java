package cn.wwinter.malladmin.service;

import cn.wwinter.malladmin.model.common.CommonResponse;
import cn.wwinter.malladmin.model.dto.UmsAdminDto;

/**
 * ClassName: AdminService
 * Package: cn.wwinter.malladmin.service
 * Description:
 * Datetime: 2023/12/1
 * Author: zhangdd
 */
public interface AdminService  {
    CommonResponse register(UmsAdminDto adminDto);

    CommonResponse login(String username, String password);

}
