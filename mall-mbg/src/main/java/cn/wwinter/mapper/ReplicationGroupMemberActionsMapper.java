package cn.wwinter.mapper;

import cn.wwinter.model.ReplicationGroupMemberActions;
import cn.wwinter.model.ReplicationGroupMemberActionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReplicationGroupMemberActionsMapper {
    int countByExample(ReplicationGroupMemberActionsExample example);

    int deleteByExample(ReplicationGroupMemberActionsExample example);

    int deleteByPrimaryKey(@Param("name") String name, @Param("event") String event);

    int insert(ReplicationGroupMemberActions record);

    int insertSelective(ReplicationGroupMemberActions record);

    List<ReplicationGroupMemberActions> selectByExample(ReplicationGroupMemberActionsExample example);

    ReplicationGroupMemberActions selectByPrimaryKey(@Param("name") String name, @Param("event") String event);

    int updateByExampleSelective(@Param("record") ReplicationGroupMemberActions record, @Param("example") ReplicationGroupMemberActionsExample example);

    int updateByExample(@Param("record") ReplicationGroupMemberActions record, @Param("example") ReplicationGroupMemberActionsExample example);

    int updateByPrimaryKeySelective(ReplicationGroupMemberActions record);

    int updateByPrimaryKey(ReplicationGroupMemberActions record);
}