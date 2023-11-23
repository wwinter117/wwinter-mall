package cn.wwinter.mapper;

import cn.wwinter.model.EventsStagesSummaryByAccountByEventName;
import cn.wwinter.model.EventsStagesSummaryByAccountByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    int countByExample(EventsStagesSummaryByAccountByEventNameExample example);

    int deleteByExample(EventsStagesSummaryByAccountByEventNameExample example);

    int insert(EventsStagesSummaryByAccountByEventName record);

    int insertSelective(EventsStagesSummaryByAccountByEventName record);

    List<EventsStagesSummaryByAccountByEventName> selectByExample(EventsStagesSummaryByAccountByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryByAccountByEventName record, @Param("example") EventsStagesSummaryByAccountByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryByAccountByEventName record, @Param("example") EventsStagesSummaryByAccountByEventNameExample example);
}