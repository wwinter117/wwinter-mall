package cn.wwinter.mapper;

import cn.wwinter.model.EventsStatementsCurrent;
import cn.wwinter.model.EventsStatementsCurrentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsCurrentMapper {
    int countByExample(EventsStatementsCurrentExample example);

    int deleteByExample(EventsStatementsCurrentExample example);

    int deleteByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int insert(EventsStatementsCurrent record);

    int insertSelective(EventsStatementsCurrent record);

    List<EventsStatementsCurrent> selectByExampleWithBLOBs(EventsStatementsCurrentExample example);

    List<EventsStatementsCurrent> selectByExample(EventsStatementsCurrentExample example);

    EventsStatementsCurrent selectByPrimaryKey(@Param("threadId") Long threadId, @Param("eventId") Long eventId);

    int updateByExampleSelective(@Param("record") EventsStatementsCurrent record, @Param("example") EventsStatementsCurrentExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsCurrent record, @Param("example") EventsStatementsCurrentExample example);

    int updateByExample(@Param("record") EventsStatementsCurrent record, @Param("example") EventsStatementsCurrentExample example);

    int updateByPrimaryKeySelective(EventsStatementsCurrent record);

    int updateByPrimaryKeyWithBLOBs(EventsStatementsCurrent record);

    int updateByPrimaryKey(EventsStatementsCurrent record);
}