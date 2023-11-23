package cn.wwinter.mapper;

import cn.wwinter.model.RoleRoutineGrants;
import cn.wwinter.model.RoleRoutineGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleRoutineGrantsMapper {
    int countByExample(RoleRoutineGrantsExample example);

    int deleteByExample(RoleRoutineGrantsExample example);

    int insert(RoleRoutineGrants record);

    int insertSelective(RoleRoutineGrants record);

    List<RoleRoutineGrants> selectByExample(RoleRoutineGrantsExample example);

    int updateByExampleSelective(@Param("record") RoleRoutineGrants record, @Param("example") RoleRoutineGrantsExample example);

    int updateByExample(@Param("record") RoleRoutineGrants record, @Param("example") RoleRoutineGrantsExample example);
}