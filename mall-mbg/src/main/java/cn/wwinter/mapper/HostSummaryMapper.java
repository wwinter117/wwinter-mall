package cn.wwinter.mapper;

import cn.wwinter.model.HostSummary;
import cn.wwinter.model.HostSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryMapper {
    int countByExample(HostSummaryExample example);

    int deleteByExample(HostSummaryExample example);

    int insert(HostSummary record);

    int insertSelective(HostSummary record);

    List<HostSummary> selectByExample(HostSummaryExample example);

    int updateByExampleSelective(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);

    int updateByExample(@Param("record") HostSummary record, @Param("example") HostSummaryExample example);
}