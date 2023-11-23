package cn.wwinter.mapper;

import cn.wwinter.model.EventsTransactionsSummaryGlobalByEventName;
import cn.wwinter.model.EventsTransactionsSummaryGlobalByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsSummaryGlobalByEventNameMapper {
    int countByExample(EventsTransactionsSummaryGlobalByEventNameExample example);

    int deleteByExample(EventsTransactionsSummaryGlobalByEventNameExample example);

    int deleteByPrimaryKey(String eventName);

    int insert(EventsTransactionsSummaryGlobalByEventName record);

    int insertSelective(EventsTransactionsSummaryGlobalByEventName record);

    List<EventsTransactionsSummaryGlobalByEventName> selectByExample(EventsTransactionsSummaryGlobalByEventNameExample example);

    EventsTransactionsSummaryGlobalByEventName selectByPrimaryKey(String eventName);

    int updateByExampleSelective(@Param("record") EventsTransactionsSummaryGlobalByEventName record, @Param("example") EventsTransactionsSummaryGlobalByEventNameExample example);

    int updateByExample(@Param("record") EventsTransactionsSummaryGlobalByEventName record, @Param("example") EventsTransactionsSummaryGlobalByEventNameExample example);

    int updateByPrimaryKeySelective(EventsTransactionsSummaryGlobalByEventName record);

    int updateByPrimaryKey(EventsTransactionsSummaryGlobalByEventName record);
}