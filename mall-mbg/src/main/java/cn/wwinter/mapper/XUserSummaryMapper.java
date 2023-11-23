package cn.wwinter.mapper;

import cn.wwinter.model.XUserSummary;
import cn.wwinter.model.XUserSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XUserSummaryMapper {
    int countByExample(XUserSummaryExample example);

    int deleteByExample(XUserSummaryExample example);

    int insert(XUserSummary record);

    int insertSelective(XUserSummary record);

    List<XUserSummary> selectByExample(XUserSummaryExample example);

    int updateByExampleSelective(@Param("record") XUserSummary record, @Param("example") XUserSummaryExample example);

    int updateByExample(@Param("record") XUserSummary record, @Param("example") XUserSummaryExample example);
}