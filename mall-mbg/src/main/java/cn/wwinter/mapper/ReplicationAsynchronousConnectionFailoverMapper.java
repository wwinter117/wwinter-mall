package cn.wwinter.mapper;

import cn.wwinter.model.ReplicationAsynchronousConnectionFailover;
import cn.wwinter.model.ReplicationAsynchronousConnectionFailoverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationAsynchronousConnectionFailoverMapper {
    int countByExample(ReplicationAsynchronousConnectionFailoverExample example);

    int deleteByExample(ReplicationAsynchronousConnectionFailoverExample example);

    int deleteByPrimaryKey(@Param("channelName") String channelName, @Param("host") String host, @Param("port") Integer port, @Param("networkNamespace") String networkNamespace, @Param("managedName") String managedName);

    int insert(ReplicationAsynchronousConnectionFailover record);

    int insertSelective(ReplicationAsynchronousConnectionFailover record);

    List<ReplicationAsynchronousConnectionFailover> selectByExample(ReplicationAsynchronousConnectionFailoverExample example);

    ReplicationAsynchronousConnectionFailover selectByPrimaryKey(@Param("channelName") String channelName, @Param("host") String host, @Param("port") Integer port, @Param("networkNamespace") String networkNamespace, @Param("managedName") String managedName);

    int updateByExampleSelective(@Param("record") ReplicationAsynchronousConnectionFailover record, @Param("example") ReplicationAsynchronousConnectionFailoverExample example);

    int updateByExample(@Param("record") ReplicationAsynchronousConnectionFailover record, @Param("example") ReplicationAsynchronousConnectionFailoverExample example);

    int updateByPrimaryKeySelective(ReplicationAsynchronousConnectionFailover record);

    int updateByPrimaryKey(ReplicationAsynchronousConnectionFailover record);
}