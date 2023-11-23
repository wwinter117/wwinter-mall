package cn.wwinter.mapper;

import cn.wwinter.model.EventsWaitsCurrent;
import cn.wwinter.model.EventsWaitsCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsCurrentMapper {
    int countByExample(EventsWaitsCurrentExample example);

    int deleteByExample(EventsWaitsCurrentExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsWaitsCurrent record);

    int insertSelective(EventsWaitsCurrent record);

    List<EventsWaitsCurrent> selectByExample(EventsWaitsCurrentExample example);

    EventsWaitsCurrent selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsWaitsCurrent record, @Param("example") EventsWaitsCurrentExample example);

    int updateByExample(@Param("record") EventsWaitsCurrent record, @Param("example") EventsWaitsCurrentExample example);

    int updateByPrimaryKeySelective(EventsWaitsCurrent record);

    int updateByPrimaryKey(EventsWaitsCurrent record);
}