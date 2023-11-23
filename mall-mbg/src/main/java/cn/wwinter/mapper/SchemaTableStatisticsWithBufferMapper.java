package cn.wwinter.mapper;

import cn.wwinter.model.SchemaTableStatisticsWithBuffer;
import cn.wwinter.model.SchemaTableStatisticsWithBufferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsWithBufferMapper {
    int countByExample(SchemaTableStatisticsWithBufferExample example);

    int deleteByExample(SchemaTableStatisticsWithBufferExample example);

    int insert(SchemaTableStatisticsWithBuffer record);

    int insertSelective(SchemaTableStatisticsWithBuffer record);

    List<SchemaTableStatisticsWithBuffer> selectByExample(SchemaTableStatisticsWithBufferExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);

    int updateByExample(@Param("record") SchemaTableStatisticsWithBuffer record, @Param("example") SchemaTableStatisticsWithBufferExample example);
}