package cn.wwinter.mapper;

import cn.wwinter.model.ResourceGroups;
import cn.wwinter.model.ResourceGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceGroupsMapper {
    int countByExample(ResourceGroupsExample example);

    int deleteByExample(ResourceGroupsExample example);

    int insert(ResourceGroups record);

    int insertSelective(ResourceGroups record);

    List<ResourceGroups> selectByExampleWithBLOBs(ResourceGroupsExample example);

    List<ResourceGroups> selectByExample(ResourceGroupsExample example);

    int updateByExampleSelective(@Param("record") ResourceGroups record, @Param("example") ResourceGroupsExample example);

    int updateByExampleWithBLOBs(@Param("record") ResourceGroups record, @Param("example") ResourceGroupsExample example);

    int updateByExample(@Param("record") ResourceGroups record, @Param("example") ResourceGroupsExample example);
}