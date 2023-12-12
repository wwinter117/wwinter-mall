package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.entity.UmsRole;
import cn.wwinter.malladmin.model.entity.admin.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface UmsRoleMapper extends CommonMapper<UmsRole> {

    UmsRole selectByRoleName(@Param("roleName") String role);
}