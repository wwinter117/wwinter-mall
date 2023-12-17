package cn.wwinter.mapper;

import cn.wwinter.entity.UmsRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface UmsRoleMapper extends CommonMapper<UmsRole> {

    UmsRole selectByRoleName(@Param("roleName") String role);
}