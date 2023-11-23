package cn.wwinter.mapper;

import cn.wwinter.model.SocketSummaryByEventName;
import cn.wwinter.model.SocketSummaryByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocketSummaryByEventNameMapper {
    int countByExample(SocketSummaryByEventNameExample example);

    int deleteByExample(SocketSummaryByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(SocketSummaryByEventName record);

    int insertSelective(SocketSummaryByEventName record);

    List<SocketSummaryByEventName> selectByExample(SocketSummaryByEventNameExample example);

    SocketSummaryByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") SocketSummaryByEventName record, @Param("example") SocketSummaryByEventNameExample example);

    int updateByExample(@Param("record") SocketSummaryByEventName record, @Param("example") SocketSummaryByEventNameExample example);

    int updateByPrimaryKeySelective(SocketSummaryByEventName record);

    int updateByPrimaryKey(SocketSummaryByEventName record);
}