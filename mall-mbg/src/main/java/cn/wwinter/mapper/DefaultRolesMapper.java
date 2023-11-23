package cn.wwinter.mapper;

import cn.wwinter.model.DefaultRoles;
import cn.wwinter.model.DefaultRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DefaultRolesMapper {
    int countByExample(DefaultRolesExample example);

    int deleteByExample(DefaultRolesExample example);

    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("defaultRoleHost") String defaultRoleHost, @Param("defaultRoleUser") String defaultRoleUser);

    int insert(DefaultRoles record);

    int insertSelective(DefaultRoles record);

    List<DefaultRoles> selectByExample(DefaultRolesExample example);

    int updateByExampleSelective(@Param("record") DefaultRoles record, @Param("example") DefaultRolesExample example);

    int updateByExample(@Param("record") DefaultRoles record, @Param("example") DefaultRolesExample example);
}