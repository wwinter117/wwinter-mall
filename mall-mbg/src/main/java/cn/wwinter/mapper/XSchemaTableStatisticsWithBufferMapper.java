package cn.wwinter.mapper;

import cn.wwinter.model.XSchemaTableStatisticsWithBuffer;
import cn.wwinter.model.XSchemaTableStatisticsWithBufferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XSchemaTableStatisticsWithBufferMapper {
    int countByExample(XSchemaTableStatisticsWithBufferExample example);

    int deleteByExample(XSchemaTableStatisticsWithBufferExample example);

    int insert(XSchemaTableStatisticsWithBuffer record);

    int insertSelective(XSchemaTableStatisticsWithBuffer record);

    List<XSchemaTableStatisticsWithBuffer> selectByExample(XSchemaTableStatisticsWithBufferExample example);

    int updateByExampleSelective(@Param("record") XSchemaTableStatisticsWithBuffer record, @Param("example") XSchemaTableStatisticsWithBufferExample example);

    int updateByExample(@Param("record") XSchemaTableStatisticsWithBuffer record, @Param("example") XSchemaTableStatisticsWithBufferExample example);
}