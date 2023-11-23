package cn.wwinter.mapper;

import cn.wwinter.model.SchemaPrivileges;
import cn.wwinter.model.SchemaPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaPrivilegesMapper {
    int countByExample(SchemaPrivilegesExample example);

    int deleteByExample(SchemaPrivilegesExample example);

    int insert(SchemaPrivileges record);

    int insertSelective(SchemaPrivileges record);

    List<SchemaPrivileges> selectByExample(SchemaPrivilegesExample example);

    int updateByExampleSelective(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);

    int updateByExample(@Param("record") SchemaPrivileges record, @Param("example") SchemaPrivilegesExample example);
}