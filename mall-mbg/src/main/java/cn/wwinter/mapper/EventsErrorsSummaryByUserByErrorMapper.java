package cn.wwinter.mapper;

import cn.wwinter.model.EventsErrorsSummaryByUserByError;
import cn.wwinter.model.EventsErrorsSummaryByUserByErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsErrorsSummaryByUserByErrorMapper {
    int countByExample(EventsErrorsSummaryByUserByErrorExample example);

    int deleteByExample(EventsErrorsSummaryByUserByErrorExample example);

    int insert(EventsErrorsSummaryByUserByError record);

    int insertSelective(EventsErrorsSummaryByUserByError record);

    List<EventsErrorsSummaryByUserByError> selectByExample(EventsErrorsSummaryByUserByErrorExample example);

    int updateByExampleSelective(@Param("record") EventsErrorsSummaryByUserByError record, @Param("example") EventsErrorsSummaryByUserByErrorExample example);

    int updateByExample(@Param("record") EventsErrorsSummaryByUserByError record, @Param("example") EventsErrorsSummaryByUserByErrorExample example);
}