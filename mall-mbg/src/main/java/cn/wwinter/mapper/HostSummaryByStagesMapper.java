package cn.wwinter.mapper;

import cn.wwinter.model.HostSummaryByStages;
import cn.wwinter.model.HostSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostSummaryByStagesMapper {
    int countByExample(HostSummaryByStagesExample example);

    int deleteByExample(HostSummaryByStagesExample example);

    int insert(HostSummaryByStages record);

    int insertSelective(HostSummaryByStages record);

    List<HostSummaryByStages> selectByExample(HostSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") HostSummaryByStages record, @Param("example") HostSummaryByStagesExample example);

    int updateByExample(@Param("record") HostSummaryByStages record, @Param("example") HostSummaryByStagesExample example);
}