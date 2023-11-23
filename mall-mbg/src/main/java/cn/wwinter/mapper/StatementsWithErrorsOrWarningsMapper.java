package cn.wwinter.mapper;

import cn.wwinter.model.StatementsWithErrorsOrWarnings;
import cn.wwinter.model.StatementsWithErrorsOrWarningsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatementsWithErrorsOrWarningsMapper {
    int countByExample(StatementsWithErrorsOrWarningsExample example);

    int deleteByExample(StatementsWithErrorsOrWarningsExample example);

    int insert(StatementsWithErrorsOrWarnings record);

    int insertSelective(StatementsWithErrorsOrWarnings record);

    List<StatementsWithErrorsOrWarnings> selectByExampleWithBLOBs(StatementsWithErrorsOrWarningsExample example);

    List<StatementsWithErrorsOrWarnings> selectByExample(StatementsWithErrorsOrWarningsExample example);

    int updateByExampleSelective(@Param("record") StatementsWithErrorsOrWarnings record, @Param("example") StatementsWithErrorsOrWarningsExample example);

    int updateByExampleWithBLOBs(@Param("record") StatementsWithErrorsOrWarnings record, @Param("example") StatementsWithErrorsOrWarningsExample example);

    int updateByExample(@Param("record") StatementsWithErrorsOrWarnings record, @Param("example") StatementsWithErrorsOrWarningsExample example);
}