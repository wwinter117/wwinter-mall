package cn.wwinter.mapper;

import cn.wwinter.model.MemorySummaryByThreadByEventName;
import cn.wwinter.model.MemorySummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByThreadByEventNameMapper {
    int countByExample(MemorySummaryByThreadByEventNameExample example);

    int deleteByExample(MemorySummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int insert(MemorySummaryByThreadByEventName record);

    int insertSelective(MemorySummaryByThreadByEventName record);

    List<MemorySummaryByThreadByEventName> selectByExample(MemorySummaryByThreadByEventNameExample example);

    MemorySummaryByThreadByEventName selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int updateByExampleSelective(@Param("record") MemorySummaryByThreadByEventName record, @Param("example") MemorySummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryByThreadByEventName record, @Param("example") MemorySummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(MemorySummaryByThreadByEventName record);

    int updateByPrimaryKey(MemorySummaryByThreadByEventName record);
}