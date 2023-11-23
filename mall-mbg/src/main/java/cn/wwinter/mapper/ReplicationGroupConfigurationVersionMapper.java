package cn.wwinter.mapper;

import cn.wwinter.model.ReplicationGroupConfigurationVersion;
import cn.wwinter.model.ReplicationGroupConfigurationVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationGroupConfigurationVersionMapper {
    int countByExample(ReplicationGroupConfigurationVersionExample example);

    int deleteByExample(ReplicationGroupConfigurationVersionExample example);

    int deleteByPrimaryKey(String name);

    int insert(ReplicationGroupConfigurationVersion record);

    int insertSelective(ReplicationGroupConfigurationVersion record);

    List<ReplicationGroupConfigurationVersion> selectByExample(ReplicationGroupConfigurationVersionExample example);

    ReplicationGroupConfigurationVersion selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") ReplicationGroupConfigurationVersion record, @Param("example") ReplicationGroupConfigurationVersionExample example);

    int updateByExample(@Param("record") ReplicationGroupConfigurationVersion record, @Param("example") ReplicationGroupConfigurationVersionExample example);

    int updateByPrimaryKeySelective(ReplicationGroupConfigurationVersion record);

    int updateByPrimaryKey(ReplicationGroupConfigurationVersion record);
}