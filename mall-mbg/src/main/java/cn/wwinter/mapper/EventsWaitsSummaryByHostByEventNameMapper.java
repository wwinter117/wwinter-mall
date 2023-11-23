package cn.wwinter.mapper;

import cn.wwinter.model.EventsWaitsSummaryByHostByEventName;
import cn.wwinter.model.EventsWaitsSummaryByHostByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByHostByEventNameMapper {
    int countByExample(EventsWaitsSummaryByHostByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByHostByEventNameExample example);

    int insert(EventsWaitsSummaryByHostByEventName record);

    int insertSelective(EventsWaitsSummaryByHostByEventName record);

    List<EventsWaitsSummaryByHostByEventName> selectByExample(EventsWaitsSummaryByHostByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByHostByEventName record, @Param("example") EventsWaitsSummaryByHostByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByHostByEventName record, @Param("example") EventsWaitsSummaryByHostByEventNameExample example);
}