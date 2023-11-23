package cn.wwinter.mapper;

import cn.wwinter.model.MemorySummaryGlobalByEventName;
import cn.wwinter.model.MemorySummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryGlobalByEventNameMapper {
    int countByExample(MemorySummaryGlobalByEventNameExample example);

    int deleteByExample(MemorySummaryGlobalByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(MemorySummaryGlobalByEventName record);

    int insertSelective(MemorySummaryGlobalByEventName record);

    List<MemorySummaryGlobalByEventName> selectByExample(MemorySummaryGlobalByEventNameExample example);

    MemorySummaryGlobalByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") MemorySummaryGlobalByEventName record, @Param("example") MemorySummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") MemorySummaryGlobalByEventName record, @Param("example") MemorySummaryGlobalByEventNameExample example);

    int updateByPrimaryKeySelective(MemorySummaryGlobalByEventName record);

    int updateByPrimaryKey(MemorySummaryGlobalByEventName record);
}