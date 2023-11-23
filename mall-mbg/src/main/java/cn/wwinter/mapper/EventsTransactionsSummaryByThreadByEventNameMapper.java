package cn.wwinter.mapper;

import cn.wwinter.model.EventsTransactionsSummaryByThreadByEventName;
import cn.wwinter.model.EventsTransactionsSummaryByThreadByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryByThreadByEventNameMapper {
    int countByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int insert(EventsTransactionsSummaryByThreadByEventName record);

    int insertSelective(EventsTransactionsSummaryByThreadByEventName record);

    List<EventsTransactionsSummaryByThreadByEventName> selectByExample(EventsTransactionsSummaryByThreadByEventNameExample example);

    EventsTransactionsSummaryByThreadByEventName selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventName") String eventName);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryByThreadByEventName record, @Param("example") EventsTransactionsSummaryByThreadByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryByThreadByEventName record, @Param("example") EventsTransactionsSummaryByThreadByEventNameExample example);

    int updateByPrimaryKeySelective(EventsTransactionsSummaryByThreadByEventName record);

    int updateByPrimaryKey(EventsTransactionsSummaryByThreadByEventName record);
}