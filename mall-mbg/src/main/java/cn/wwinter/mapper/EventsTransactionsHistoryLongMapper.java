package cn.wwinter.mapper;

import cn.wwinter.model.EventsTransactionsHistoryLong;
import cn.wwinter.model.EventsTransactionsHistoryLongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsHistoryLongMapper {
    int countByExample(EventsTransactionsHistoryLongExample example);

    int deleteByExample(EventsTransactionsHistoryLongExample example);

    int insert(EventsTransactionsHistoryLong record);

    int insertSelective(EventsTransactionsHistoryLong record);

    List<EventsTransactionsHistoryLong> selectByExample(EventsTransactionsHistoryLongExample example);

    int updateByExampleSelective(@Param("record") EventsTransactionsHistoryLong record, @Param("example") EventsTransactionsHistoryLongExample example);

    int updateByExample(@Param("record") EventsTransactionsHistoryLong record, @Param("example") EventsTransactionsHistoryLongExample example);
}