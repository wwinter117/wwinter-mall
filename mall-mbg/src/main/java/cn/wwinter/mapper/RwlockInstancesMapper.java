package cn.wwinter.mapper;

import cn.wwinter.model.RwlockInstances;
import cn.wwinter.model.RwlockInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RwlockInstancesMapper {
    int countByExample(RwlockInstancesExample example);

    int deleteByExample(RwlockInstancesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(RwlockInstances record);

    int insertSelective(RwlockInstances record);

    List<RwlockInstances> selectByExample(RwlockInstancesExample example);

    RwlockInstances selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);

    int updateByExample(@Param("record") RwlockInstances record, @Param("example") RwlockInstancesExample example);

    int updateByPrimaryKeySelective(RwlockInstances record);

    int updateByPrimaryKey(RwlockInstances record);
}