package cn.wwinter.mapper;

import cn.wwinter.model.SchemaIndexStatistics;
import cn.wwinter.model.SchemaIndexStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchemaIndexStatisticsMapper {
    int countByExample(SchemaIndexStatisticsExample example);

    int deleteByExample(SchemaIndexStatisticsExample example);

    int insert(SchemaIndexStatistics record);

    int insertSelective(SchemaIndexStatistics record);

    List<SchemaIndexStatistics> selectByExample(SchemaIndexStatisticsExample example);

    int updateByExampleSelective(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);

    int updateByExample(@Param("record") SchemaIndexStatistics record, @Param("example") SchemaIndexStatisticsExample example);
}