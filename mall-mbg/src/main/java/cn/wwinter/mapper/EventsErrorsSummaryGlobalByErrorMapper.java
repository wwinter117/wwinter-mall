package cn.wwinter.mapper;

import cn.wwinter.model.EventsErrorsSummaryGlobalByError;
import cn.wwinter.model.EventsErrorsSummaryGlobalByErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsErrorsSummaryGlobalByErrorMapper {
    int countByExample(EventsErrorsSummaryGlobalByErrorExample example);

    int deleteByExample(EventsErrorsSummaryGlobalByErrorExample example);

    int insert(EventsErrorsSummaryGlobalByError record);

    int insertSelective(EventsErrorsSummaryGlobalByError record);

    List<EventsErrorsSummaryGlobalByError> selectByExample(EventsErrorsSummaryGlobalByErrorExample example);

    int updateByExampleSelective(@Param("record") EventsErrorsSummaryGlobalByError record, @Param("example") EventsErrorsSummaryGlobalByErrorExample example);

    int updateByExample(@Param("record") EventsErrorsSummaryGlobalByError record, @Param("example") EventsErrorsSummaryGlobalByErrorExample example);
}