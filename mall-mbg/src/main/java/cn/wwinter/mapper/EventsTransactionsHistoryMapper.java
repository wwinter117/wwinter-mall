package cn.wwinter.mapper;

import cn.wwinter.model.EventsTransactionsHistory;
import cn.wwinter.model.EventsTransactionsHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsHistoryMapper {
    int countByExample(EventsTransactionsHistoryExample example);

    int deleteByExample(EventsTransactionsHistoryExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsTransactionsHistory record);

    int insertSelective(EventsTransactionsHistory record);

    List<EventsTransactionsHistory> selectByExample(EventsTransactionsHistoryExample example);

    EventsTransactionsHistory selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsTransactionsHistory record, @Param("example") EventsTransactionsHistoryExample example);

    int updateByExample(@Param("record") EventsTransactionsHistory record, @Param("example") EventsTransactionsHistoryExample example);

    int updateByPrimaryKeySelective(EventsTransactionsHistory record);

    int updateByPrimaryKey(EventsTransactionsHistory record);
}