package cn.wwinter.mapper;

import cn.wwinter.model.EventsWaitsHistory;
import cn.wwinter.model.EventsWaitsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsHistoryMapper {
    int countByExample(EventsWaitsHistoryExample example);

    int deleteByExample(EventsWaitsHistoryExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsWaitsHistory record);

    int insertSelective(EventsWaitsHistory record);

    List<EventsWaitsHistory> selectByExample(EventsWaitsHistoryExample example);

    EventsWaitsHistory selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsWaitsHistory record, @Param("example") EventsWaitsHistoryExample example);

    int updateByExample(@Param("record") EventsWaitsHistory record, @Param("example") EventsWaitsHistoryExample example);

    int updateByPrimaryKeySelective(EventsWaitsHistory record);

    int updateByPrimaryKey(EventsWaitsHistory record);
}