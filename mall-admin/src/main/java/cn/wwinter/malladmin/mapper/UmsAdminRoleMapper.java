package cn.wwinter.malladmin.mapper;

import cn.wwinter.malladmin.model.entity.admin.UmsAdminRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Datetime: 2023/12/3
 * @Author: zhangdd
 */
@Mapper
public interface UmsAdminRoleMapper extends CommonMapper<UmsAdminRole> {
    @Override
    int insertList(@Param("list") List<UmsAdminRole> list);
}