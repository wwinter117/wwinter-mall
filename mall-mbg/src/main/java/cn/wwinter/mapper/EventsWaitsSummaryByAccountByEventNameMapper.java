package cn.wwinter.mapper;

import cn.wwinter.model.EventsWaitsSummaryByAccountByEventName;
import cn.wwinter.model.EventsWaitsSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsWaitsSummaryByAccountByEventNameMapper {
    int countByExample(EventsWaitsSummaryByAccountByEventNameExample example);

    int deleteByExample(EventsWaitsSummaryByAccountByEventNameExample example);

    int insert(EventsWaitsSummaryByAccountByEventName record);

    int insertSelective(EventsWaitsSummaryByAccountByEventName record);

    List<EventsWaitsSummaryByAccountByEventName> selectByExample(EventsWaitsSummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsWaitsSummaryByAccountByEventName record, @Param("example") EventsWaitsSummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") EventsWaitsSummaryByAccountByEventName record, @Param("example") EventsWaitsSummaryByAccountByEventNameExample example);
}