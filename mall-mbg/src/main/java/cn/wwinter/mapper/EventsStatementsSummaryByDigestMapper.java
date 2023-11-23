package cn.wwinter.mapper;

import cn.wwinter.model.EventsStatementsSummaryByDigest;
import cn.wwinter.model.EventsStatementsSummaryByDigestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsSummaryByDigestMapper {
    int countByExample(EventsStatementsSummaryByDigestExample example);

    int deleteByExample(EventsStatementsSummaryByDigestExample example);

    int insert(EventsStatementsSummaryByDigest record);

    int insertSelective(EventsStatementsSummaryByDigest record);

    List<EventsStatementsSummaryByDigest> selectByExampleWithBLOBs(EventsStatementsSummaryByDigestExample example);

    List<EventsStatementsSummaryByDigest> selectByExample(EventsStatementsSummaryByDigestExample example);

    int updateByExampleSelective(@Param("record") EventsStatementsSummaryByDigest record, @Param("example") EventsStatementsSummaryByDigestExample example);

    int updateByExampleWithBLOBs(@Param("record") EventsStatementsSummaryByDigest record, @Param("example") EventsStatementsSummaryByDigestExample example);

    int updateByExample(@Param("record") EventsStatementsSummaryByDigest record, @Param("example") EventsStatementsSummaryByDigestExample example);
}