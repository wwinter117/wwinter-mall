package cn.wwinter.mapper;

import cn.wwinter.model.ReplicationApplierStatusByWorker;
import cn.wwinter.model.ReplicationApplierStatusByWorkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationApplierStatusByWorkerMapper {
    int countByExample(ReplicationApplierStatusByWorkerExample example);

    int deleteByExample(ReplicationApplierStatusByWorkerExample example);

    int deleteByPrimaryKey(@Param("channelName") String channelName, @Param("workerId") Long workerId);

    int insert(ReplicationApplierStatusByWorker record);

    int insertSelective(ReplicationApplierStatusByWorker record);

    List<ReplicationApplierStatusByWorker> selectByExample(ReplicationApplierStatusByWorkerExample example);

    ReplicationApplierStatusByWorker selectByPrimaryKey(@Param("channelName") String channelName, @Param("workerId") Long workerId);

    int updateByExampleSelective(@Param("record") ReplicationApplierStatusByWorker record, @Param("example") ReplicationApplierStatusByWorkerExample example);

    int updateByExample(@Param("record") ReplicationApplierStatusByWorker record, @Param("example") ReplicationApplierStatusByWorkerExample example);

    int updateByPrimaryKeySelective(ReplicationApplierStatusByWorker record);

    int updateByPrimaryKey(ReplicationApplierStatusByWorker record);
}