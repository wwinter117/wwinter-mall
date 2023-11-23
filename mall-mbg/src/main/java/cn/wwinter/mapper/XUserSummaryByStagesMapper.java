package cn.wwinter.mapper;

import cn.wwinter.model.XUserSummaryByStages;
import cn.wwinter.model.XUserSummaryByStagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryByStagesMapper {
    int countByExample(XUserSummaryByStagesExample example);

    int deleteByExample(XUserSummaryByStagesExample example);

    int insert(XUserSummaryByStages record);

    int insertSelective(XUserSummaryByStages record);

    List<XUserSummaryByStages> selectByExample(XUserSummaryByStagesExample example);

    int updateByExampleSelective(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);

    int updateByExample(@Param("record") XUserSummaryByStages record, @Param("example") XUserSummaryByStagesExample example);
}