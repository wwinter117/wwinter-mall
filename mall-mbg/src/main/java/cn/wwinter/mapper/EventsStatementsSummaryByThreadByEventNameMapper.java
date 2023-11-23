package cn.wwinter.mapper;

import cn.wwinter.model.EventsStatementsSummaryByThreadByEventName;
import cn.wwinter.model.EventsStatementsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByThreadByEventNameMapper {
    int countByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int insert(EventsStatementsSummaryByThreadByEventName record);

    int insertSelective(EventsStatementsSummaryByThreadByEventName record);

    List<EventsStatementsSummaryByThreadByEventName> selectByExample(EventsStatementsSummaryByThreadByEventNameExample example);

    EventsStatementsSummaryByThreadByEventName selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByThreadByEventName record, @Param("example") EventsStatementsSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsStatementsSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsStatementsSummaryByThreadByEventName record);
}