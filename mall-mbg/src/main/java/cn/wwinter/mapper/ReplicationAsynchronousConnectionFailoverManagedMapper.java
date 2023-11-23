package cn.wwinter.mapper;

import cn.wwinter.model.ReplicationAsynchronousConnectionFailoverManaged;
import cn.wwinter.model.ReplicationAsynchronousConnectionFailoverManagedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationAsynchronousConnectionFailoverManagedMapper {
    int countByExample(ReplicationAsynchronousConnectionFailoverManagedExample example);

    int deleteByExample(ReplicationAsynchronousConnectionFailoverManagedExample example);

    int insert(ReplicationAsynchronousConnectionFailoverManaged record);

    int insertSelective(ReplicationAsynchronousConnectionFailoverManaged record);

    List<ReplicationAsynchronousConnectionFailoverManaged> selectByExampleWithBLOBs(ReplicationAsynchronousConnectionFailoverManagedExample example);

    List<ReplicationAsynchronousConnectionFailoverManaged> selectByExample(ReplicationAsynchronousConnectionFailoverManagedExample example);

    int updateByExampleSelective(@Param("record") ReplicationAsynchronousConnectionFailoverManaged record, @Param("example") ReplicationAsynchronousConnectionFailoverManagedExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationAsynchronousConnectionFailoverManaged record, @Param("example") ReplicationAsynchronousConnectionFailoverManagedExample example);

    int updateByExample(@Param("record") ReplicationAsynchronousConnectionFailoverManaged record, @Param("example") ReplicationAsynchronousConnectionFailoverManagedExample example);
}