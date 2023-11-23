package cn.wwinter.mapper;

import cn.wwinter.model.EventsStagesHistory;
import cn.wwinter.model.EventsStagesHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesHistoryMapper {
    int countByExample(EventsStagesHistoryExample example);

    int deleteByExample(EventsStagesHistoryExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsStagesHistory record);

    int insertSelective(EventsStagesHistory record);

    List<EventsStagesHistory> selectByExample(EventsStagesHistoryExample example);

    EventsStagesHistory selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsStagesHistory record, @Param("example") EventsStagesHistoryExample example);

    int updateByExample(@Param("record") EventsStagesHistory record, @Param("example") EventsStagesHistoryExample example);

    int updateByPrimaryKeySelective(EventsStagesHistory record);

    int updateByPrimaryKey(EventsStagesHistory record);
}