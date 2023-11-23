package cn.wwinter.mapper;

import cn.wwinter.model.RoleTableGrants;
import cn.wwinter.model.RoleTableGrantsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleTableGrantsMapper {
    int countByExample(RoleTableGrantsExample example);

    int deleteByExample(RoleTableGrantsExample example);

    int insert(RoleTableGrants record);

    int insertSelective(RoleTableGrants record);

    List<RoleTableGrants> selectByExample(RoleTableGrantsExample example);

    int updateByExampleSelective(@Param("record") RoleTableGrants record, @Param("example") RoleTableGrantsExample example);

    int updateByExample(@Param("record") RoleTableGrants record, @Param("example") RoleTableGrantsExample example);
}