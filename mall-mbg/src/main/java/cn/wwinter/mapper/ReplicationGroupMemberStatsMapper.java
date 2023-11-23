package cn.wwinter.mapper;

import cn.wwinter.model.ReplicationGroupMemberStats;
import cn.wwinter.model.ReplicationGroupMemberStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationGroupMemberStatsMapper {
    int countByExample(ReplicationGroupMemberStatsExample example);

    int deleteByExample(ReplicationGroupMemberStatsExample example);

    int insert(ReplicationGroupMemberStats record);

    int insertSelective(ReplicationGroupMemberStats record);

    List<ReplicationGroupMemberStats> selectByExampleWithBLOBs(ReplicationGroupMemberStatsExample example);

    List<ReplicationGroupMemberStats> selectByExample(ReplicationGroupMemberStatsExample example);

    int updateByExampleSelective(@Param("record") ReplicationGroupMemberStats record, @Param("example") ReplicationGroupMemberStatsExample example);

    int updateByExampleWithBLOBs(@Param("record") ReplicationGroupMemberStats record, @Param("example") ReplicationGroupMemberStatsExample example);

    int updateByExample(@Param("record") ReplicationGroupMemberStats record, @Param("example") ReplicationGroupMemberStatsExample example);
}