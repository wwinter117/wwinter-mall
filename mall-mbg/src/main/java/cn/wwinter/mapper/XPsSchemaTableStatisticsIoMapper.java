package cn.wwinter.mapper;

import cn.wwinter.model.XPsSchemaTableStatisticsIo;
import cn.wwinter.model.XPsSchemaTableStatisticsIoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XPsSchemaTableStatisticsIoMapper {
    int countByExample(XPsSchemaTableStatisticsIoExample example);

    int deleteByExample(XPsSchemaTableStatisticsIoExample example);

    int insert(XPsSchemaTableStatisticsIo record);

    int insertSelective(XPsSchemaTableStatisticsIo record);

    List<XPsSchemaTableStatisticsIo> selectByExample(XPsSchemaTableStatisticsIoExample example);

    int updateByExampleSelective(@Param("record") XPsSchemaTableStatisticsIo record, @Param("example") XPsSchemaTableStatisticsIoExample example);

    int updateByExample(@Param("record") XPsSchemaTableStatisticsIo record, @Param("example") XPsSchemaTableStatisticsIoExample example);
}