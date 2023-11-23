package cn.wwinter.mapper;

import cn.wwinter.model.ColumnPrivileges;
import cn.wwinter.model.ColumnPrivilegesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnPrivilegesMapper {
    int countByExample(ColumnPrivilegesExample example);

    int deleteByExample(ColumnPrivilegesExample example);

    int insert(ColumnPrivileges record);

    int insertSelective(ColumnPrivileges record);

    List<ColumnPrivileges> selectByExample(ColumnPrivilegesExample example);

    int updateByExampleSelective(@Param("record") ColumnPrivileges record, @Param("example") ColumnPrivilegesExample example);

    int updateByExample(@Param("record") ColumnPrivileges record, @Param("example") ColumnPrivilegesExample example);
}