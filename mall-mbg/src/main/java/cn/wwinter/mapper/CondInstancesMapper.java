package cn.wwinter.mapper;

import cn.wwinter.model.CondInstances;
import cn.wwinter.model.CondInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CondInstancesMapper {
    int countByExample(CondInstancesExample example);

    int deleteByExample(CondInstancesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(CondInstances record);

    int insertSelective(CondInstances record);

    List<CondInstances> selectByExample(CondInstancesExample example);

    CondInstances selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);

    int updateByExample(@Param("record") CondInstances record, @Param("example") CondInstancesExample example);

    int updateByPrimaryKeySelective(CondInstances record);

    int updateByPrimaryKey(CondInstances record);
}