package cn.wwinter.mapper;

import cn.wwinter.model.ReplicationApplierConfiguration;
import cn.wwinter.model.ReplicationApplierConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierConfigurationMapper {
    int countByExample(ReplicationApplierConfigurationExample example);

    int deleteByExample(ReplicationApplierConfigurationExample example);

    int deleteByPrimaryKey(String channelName);

    int insert(ReplicationApplierConfiguration record);

    int insertSelective(ReplicationApplierConfiguration record);

    List<ReplicationApplierConfiguration> selectByExampleWithBLOBs(ReplicationApplierConfigurationExample example);

    List<ReplicationApplierConfiguration> selectByExample(ReplicationApplierConfigurationExample example);

    ReplicationApplierConfiguration selectByPrimaryKey(String channelName);

    int updateByExampleSelective(@Param("record") ReplicationApplierConfiguration record, @Param("example") ReplicationApplierConfigurationExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationApplierConfiguration record, @Param("example") ReplicationApplierConfigurationExample example);

    int updateByExample(@Param("record") ReplicationApplierConfiguration record, @Param("example") ReplicationApplierConfigurationExample example);

    int updateByPrimaryKeySelective(ReplicationApplierConfiguration record);

    int updateByPrimaryKeyWithBLOBs(ReplicationApplierConfiguration record);

    int updateByPrimaryKey(ReplicationApplierConfiguration record);
}