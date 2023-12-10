package cn.wwinter.malladmin.mapper;

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
public interface UmsAdminMapper extends CommonMapper<UmsAdmin> {
    List<UmsAdmin> selectByUsername(@Param("username") String username);

    @Override
    int insertList(@Param("list") List<UmsAdmin> list);

}