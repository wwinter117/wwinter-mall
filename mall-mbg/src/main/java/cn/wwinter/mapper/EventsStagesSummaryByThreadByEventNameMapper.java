package cn.wwinter.mapper;

import cn.wwinter.model.EventsStagesSummaryByThreadByEventName;
import cn.wwinter.model.EventsStagesSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByThreadByEventNameMapper {
    int countByExample(EventsStagesSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsStagesSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int insert(EventsStagesSummaryByThreadByEventName record);

    int insertSelective(EventsStagesSummaryByThreadByEventName record);

    List<EventsStagesSummaryByThreadByEventName> selectByExample(EventsStagesSummaryByThreadByEventNameExample example);

    EventsStagesSummaryByThreadByEventName selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryByThreadByEventName record, @Param("example") EventsStagesSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryByThreadByEventName record, @Param("example") EventsStagesSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsStagesSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsStagesSummaryByThreadByEventName record);
}