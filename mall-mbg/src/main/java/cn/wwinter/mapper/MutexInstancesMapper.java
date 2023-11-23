package cn.wwinter.mapper;

import cn.wwinter.model.MutexInstances;
import cn.wwinter.model.MutexInstancesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MutexInstancesMapper {
    int countByExample(MutexInstancesExample example);

    int deleteByExample(MutexInstancesExample example);

    int deleteByPrimaryKey(Long objectInstanceBegin);

    int insert(MutexInstances record);

    int insertSelective(MutexInstances record);

    List<MutexInstances> selectByExample(MutexInstancesExample example);

    MutexInstances selectByPrimaryKey(Long objectInstanceBegin);

    int updateByExampleSelective(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);

    int updateByExample(@Param("record") MutexInstances record, @Param("example") MutexInstancesExample example);

    int updateByPrimaryKeySelective(MutexInstances record);

    int updateByPrimaryKey(MutexInstances record);
}