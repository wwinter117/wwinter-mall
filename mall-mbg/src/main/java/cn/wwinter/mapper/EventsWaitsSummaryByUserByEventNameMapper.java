package cn.wwinter.mapper;

import cn.wwinter.model.EventsWaitsSummaryByUserByEventName;
import cn.wwinter.model.EventsWaitsSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByUserByEventNameMapper {
    int countByExample(EventsWaitsSummaryByUserByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByUserByEventNameExample example);

    int insert(EventsWaitsSummaryByUserByEventName record);

    int insertSelective(EventsWaitsSummaryByUserByEventName record);

    List<EventsWaitsSummaryByUserByEventName> selectByExample(EventsWaitsSummaryByUserByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByUserByEventName record, @Param("example") EventsWaitsSummaryByUserByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByUserByEventName record, @Param("example") EventsWaitsSummaryByUserByEventNameExample example);
}