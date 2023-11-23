package cn.wwinter.mapper;

import cn.wwinter.model.SchemaTableStatistics;
import cn.wwinter.model.SchemaTableStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaTableStatisticsMapper {
    int countByExample(SchemaTableStatisticsExample example);

    int deleteByExample(SchemaTableStatisticsExample example);

    int insert(SchemaTableStatistics record);

    int insertSelective(SchemaTableStatistics record);

    List<SchemaTableStatistics> selectByExample(SchemaTableStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);

    int updateByExample(@Param("record") SchemaTableStatistics record, @Param("example") SchemaTableStatisticsExample example);
}