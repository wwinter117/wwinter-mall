package cn.wwinter.mapper;

import cn.wwinter.model.EventsErrorsSummaryByAccountByError;
import cn.wwinter.model.EventsErrorsSummaryByAccountByErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsErrorsSummaryByAccountByErrorMapper {
    int countByExample(EventsErrorsSummaryByAccountByErrorExample example);

    int deleteByExample(EventsErrorsSummaryByAccountByErrorExample example);

    int insert(EventsErrorsSummaryByAccountByError record);

    int insertSelective(EventsErrorsSummaryByAccountByError record);

    List<EventsErrorsSummaryByAccountByError> selectByExample(EventsErrorsSummaryByAccountByErrorExample example);

    int updateByExampleSelective(@Param("record") EventsErrorsSummaryByAccountByError record, @Param("example") EventsErrorsSummaryByAccountByErrorExample example);

    int updateByExample(@Param("record") EventsErrorsSummaryByAccountByError record, @Param("example") EventsErrorsSummaryByAccountByErrorExample example);
}