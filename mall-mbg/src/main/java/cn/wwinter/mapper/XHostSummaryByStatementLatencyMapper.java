package cn.wwinter.mapper;

import cn.wwinter.model.XHostSummaryByStatementLatency;
import cn.wwinter.model.XHostSummaryByStatementLatencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XHostSummaryByStatementLatencyMapper {
    int countByExample(XHostSummaryByStatementLatencyExample example);

    int deleteByExample(XHostSummaryByStatementLatencyExample example);

    int insert(XHostSummaryByStatementLatency record);

    int insertSelective(XHostSummaryByStatementLatency record);

    List<XHostSummaryByStatementLatency> selectByExample(XHostSummaryByStatementLatencyExample example);

    int updateByExampleSelective(@Param("record") XHostSummaryByStatementLatency record, @Param("example") XHostSummaryByStatementLatencyExample example);

    int updateByExample(@Param("record") XHostSummaryByStatementLatency record, @Param("example") XHostSummaryByStatementLatencyExample example);
}