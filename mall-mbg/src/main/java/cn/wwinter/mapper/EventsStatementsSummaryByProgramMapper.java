package cn.wwinter.mapper;

import cn.wwinter.model.EventsStatementsSummaryByProgram;
import cn.wwinter.model.EventsStatementsSummaryByProgramExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByProgramMapper {
    int countByExample(EventsStatementsSummaryByProgramExample example);

    int deleteByExample(EventsStatementsSummaryByProgramExample example);

    int deleteByPrimaryKey(@Param("objectType") String objectType, @Param("objectSchema") String objectSchema, @Param("objectName") String objectName);

    int insert(EventsStatementsSummaryByProgram record);

    int insertSelective(EventsStatementsSummaryByProgram record);

    List<EventsStatementsSummaryByProgram> selectByExample(EventsStatementsSummaryByProgramExample example);

    EventsStatementsSummaryByProgram selectByPrimaryKey(@Param("objectType") String objectType, @Param("objectSchema") String objectSchema, @Param("objectName") String objectName);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByProgram record, @Param("example") EventsStatementsSummaryByProgramExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByProgram record, @Param("example") EventsStatementsSummaryByProgramExample example);

    int updateByPrimaryKeySelective(EventsStatementsSummaryByProgram record);

    int updateByPrimaryKey(EventsStatementsSummaryByProgram record);
}