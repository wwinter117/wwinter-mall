package cn.wwinter.mapper;

import cn.wwinter.model.EventsStagesSummaryByUserByEventName;
import cn.wwinter.model.EventsStagesSummaryByUserByEventNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByUserByEventNameMapper {
    int countByExample(EventsStagesSummaryByUserByEventNameExample example);

    int deleteByExample(EventsStagesSummaryByUserByEventNameExample example);

    int insert(EventsStagesSummaryByUserByEventName record);

    int insertSelective(EventsStagesSummaryByUserByEventName record);

    List<EventsStagesSummaryByUserByEventName> selectByExample(EventsStagesSummaryByUserByEventNameExample example);

    int updateByExampleSelective(@Param("record") EventsStagesSummaryByUserByEventName record, @Param("example") EventsStagesSummaryByUserByEventNameExample example);

    int updateByExample(@Param("record") EventsStagesSummaryByUserByEventName record, @Param("example") EventsStagesSummaryByUserByEventNameExample example);
}