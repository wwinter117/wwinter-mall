package cn.wwinter.mapper;

import cn.wwinter.model.EventsStatementsHistory;
import cn.wwinter.model.EventsStatementsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryMapper {
    int countByExample(EventsStatementsHistoryExample example);

    int deleteByExample(EventsStatementsHistoryExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsStatementsHistory record);

    int insertSelective(EventsStatementsHistory record);

    List<EventsStatementsHistory> selectByExampleWithBLOBs(EventsStatementsHistoryExample example);

    List<EventsStatementsHistory> selectByExample(EventsStatementsHistoryExample example);

    EventsStatementsHistory selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsStatementsHistory record, @Param("example") EventsStatementsHistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsHistory record, @Param("example") EventsStatementsHistoryExample example);

    int updateByExample(@Param("record") EventsStatementsHistory record, @Param("example") EventsStatementsHistoryExample example);

    int updateByPrimaryKeySelective(EventsStatementsHistory record);

    int updateByPrimaryKeyWithBLOBs(EventsStatementsHistory record);

    int updateByPrimaryKey(EventsStatementsHistory record);
}