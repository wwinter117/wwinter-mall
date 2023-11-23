package cn.wwinter.mapper;

import cn.wwinter.model.EventsStagesCurrent;
import cn.wwinter.model.EventsStagesCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesCurrentMapper {
    int countByExample(EventsStagesCurrentExample example);

    int deleteByExample(EventsStagesCurrentExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsStagesCurrent record);

    int insertSelective(EventsStagesCurrent record);

    List<EventsStagesCurrent> selectByExample(EventsStagesCurrentExample example);

    EventsStagesCurrent selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);

    int updateByExample(@Param("record") EventsStagesCurrent record, @Param("example") EventsStagesCurrentExample example);

    int updateByPrimaryKeySelective(EventsStagesCurrent record);

    int updateByPrimaryKey(EventsStagesCurrent record);
}